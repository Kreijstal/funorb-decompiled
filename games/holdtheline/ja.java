/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends ee {
    private int field_Jb;
    private int field_uc;
    private int field_Kb;
    private int field_Vb;
    int field_Sb;
    float field_lc;
    private float field_Gb;
    private int field_Mb;
    private int field_ac;
    private boolean field_Ab;
    int field_cb;
    private kk field_S;
    private int field_cc;
    int[][] field_W;
    private kk field_ub;
    private float field_P;
    private float field_ic;
    boolean field_V;
    dn field_C;
    int field_bc;
    private kk field_Z;
    private boolean field_I;
    private kk field_vc;
    int field_L;
    private ja field_Bb;
    int field_mc;
    private wm field_lb;
    int field_M;
    int field_X;
    private wd field_zb;
    private float field_xc;
    float field_H;
    private int[] field_Nb;
    private boolean field_ib;
    private int field_eb;
    int field_db;
    int field_rc;
    private wd field_K;
    int field_Eb;
    private int field_Hb;
    float field_vb;
    qm field_Zb;
    private float field_bb;
    int field_R;
    private int field_Xb;
    private int field_kc;
    private wm field_yb;
    int[] field_hc;
    private ei field_sb;
    int field_Q;
    private int field_Yb;
    private float field_D;
    float field_N;
    private float field_Y;
    private int field_Ob;
    boolean field_jb;
    private float field_E;
    private int[] field_yc;
    int field_T;
    int field_ab;
    private int field_nb;
    int field_tc;
    private float field_wc;
    static mf field_Wb;
    private eb[] field_sc;
    private int field_dc;
    private int field_gc;
    private int field_mb;
    private boolean field_Cb;
    private int field_fc;
    int field_ob;
    int field_Lb;
    int field_tb;
    private int field_Ub;
    int field_oc;
    private float field_jc;
    float field_Ib;
    int[] field_Fb;
    static hj[] field_Db;
    private float field_ec;
    private int field_Rb;
    private kk field_fb;
    int field_J;
    private int field_xb;
    private int field_pc;
    int field_hb;
    int field_O;
    private kk field_rb;
    int field_Pb;
    private int field_pb;
    private boolean field_F;
    private int field_G;
    private int field_Tb;
    static char[] field_Qb;
    hj field_kb;
    private int field_qc;
    private int field_qb;
    static nd field_U;
    private int field_gb;
    private boolean field_nc;
    private float field_wb;

    private final void f(byte param0) {
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        eb stackIn_21_3 = null;
        int stackIn_30_0 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        eb[] stackIn_37_2 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        eb[] stackIn_39_2 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        eb[] stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        Object stackIn_150_0 = null;
        Object stackIn_164_0 = null;
        Object stackIn_194_0 = null;
        Object stackIn_216_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        eb[] var5 = null;
        int var6 = 0;
        float var7_float = 0.0f;
        int var7 = 0;
        float var8_float = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wm var14_ref_wm = null;
        ja var15 = null;
        int var16 = 0;
        int var17 = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_float = 1500000.0f;
                        var3 = 0.0f;
                        var4 = this.field_jc;
                        if (this.field_G <= 0) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((-this.field_sc[0].field_f + this.field_A.field_f) * (this.field_A.field_f + -this.field_sc[0].field_f) + (this.field_A.field_h + -this.field_sc[0].field_h) * (this.field_A.field_h + -this.field_sc[0].field_h) <= 10000) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.f(3);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1.0f == this.field_vb) {
                            statePc = 26;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-23 >= (this.field_G ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (10 < this.field_G) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_G = 10;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_20_0 = this;
                        stackIn_18_0 = stackIn_20_0;
                        stackIn_20_1 = 41;
                        stackIn_18_1 = stackIn_20_1;
                        stackIn_20_2 = 32 + -this.field_G;
                        stackIn_18_2 = stackIn_20_2;
                        if (0 == this.field_G) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_18_1;
                        stackIn_21_2 = stackIn_18_2;
                        stackIn_21_3 = this.field_sc[this.field_G + -1];
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = null;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.a((byte) stackIn_21_1, stackIn_21_2, stackIn_21_3);
                        if (null == this.field_sc) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_G = this.field_sc.length;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (15 < this.field_G) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_30_0 = this.field_G;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = 15;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5 = new eb[stackIn_30_0];
                        var6 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var5.length ^ -1) >= (var6 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var5[var6] = new eb(this.field_sc[var6]);
                        var6++;
                        if (var20 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var20 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_39_0 = this;
                        stackIn_37_0 = stackIn_39_0;
                        stackIn_39_1 = 118;
                        stackIn_37_1 = stackIn_39_1;
                        stackIn_39_2 = (eb[]) (var5);
                        stackIn_37_2 = stackIn_39_2;
                        if ((this.field_J ^ -1) != -3) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_40_0 = this;
                        stackIn_40_1 = stackIn_37_1;
                        stackIn_40_2 = (eb[]) ((Object) stackIn_37_2);
                        stackIn_40_3 = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = this;
                        stackIn_40_1 = stackIn_39_1;
                        stackIn_40_2 = (eb[]) ((Object) stackIn_39_2);
                        stackIn_40_3 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.a((byte) stackIn_40_1, stackIn_40_2, stackIn_40_3 != 0, var5.length);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-1 > (this.field_G ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var7_float = ha.a(this.field_A, var5[0], false);
                        if (this.field_w.field_g * this.field_x + this.field_w.field_j * this.field_t < 0.0f) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var7_float = (float)((double)var7_float + 3.141592653589793);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3 = this.field_r - var7_float;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((double)var3 >= -3.141592653589793) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var3 = (float)((double)var3 + 6.283185307179586);
                        if (var20 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var20 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((double)var3 <= 3.141592653589793) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var3 = (float)((double)var3 - 6.283185307179586);
                        if (var20 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var20 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var8_float = this.a(var5, (byte) -112, 25.0f);
                        if (var2_float > var8_float) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var2_float = var8_float;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var2_float < 10.0f) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var2_float = 10.0f;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var6 = 0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var7 = 0;
                        var8 = 0;
                        var9 = 0;
                        var10 = 0;
                        var11 = 0;
                        var12 = 0;
                        var4 = this.field_jc;
                        if ((this.field_qb ^ -1) < -1) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (this.field_Ab) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var3 = var3 * 2.0f;
                        if (var20 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var3 = var3 * -2.0f;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var4 >= var2_float) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var9 = 1;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var4 >= var2_float) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var7 = 1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var3 >= -0.05000000074505806f) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var10 = 1;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (0.05000000074505806f < var3) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var11 = 1;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((bl.field_r.field_r ^ -1) != -2) {
                            statePc = 97;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var10 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var11 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (this.field_jc <= 25.0f) {
                            statePc = 97;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var7 = 0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (this.field_qb > 0) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var7 = 0;
                        var8 = 1;
                        this.field_qb = this.field_qb - 1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (var6 != 0) {
                            statePc = 104;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var7 = 0;
                        var9 = 0;
                        var8 = 1;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var13 = -1;
                        if (this.field_Fb[0] == 1) {
                            statePc = 108;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var13 = 0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (this.field_Fb[0] != 2) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var13 = 1;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (this.field_Fb[0] != 3) {
                            statePc = 113;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var13 = 2;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (-4 == (this.field_Fb[1] ^ -1)) {
                            statePc = 116;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var13 = 3;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (-4 != (this.field_Fb[2] ^ -1)) {
                            statePc = 119;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var13 = 4;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (param0 > 64) {
                            statePc = 122;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        this.c(-82, -104);
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var14 = var13;
                        if (-1 == (var14 ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var14 == 1) {
                            statePc = 161;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var14 != 2) {
                            statePc = 132;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (var20 == 0) {
                            statePc = 182;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if ((var14 ^ -1) == -4) {
                            statePc = 213;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (4 != var14) {
                            statePc = 215;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (var20 == 0) {
                            statePc = 214;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (null == this.field_yb) {
                            statePc = 147;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (kj.b(2, 250) != 0) {
                            statePc = 215;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var12 = 1;
                        var14_ref_wm = (wm) ((Object) bl.field_r.field_d.b((byte) 115));
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (null == var14_ref_wm) {
                            statePc = 160;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackIn_216_0 = this;
                        stackIn_150_0 = stackIn_216_0;
                        if (var20 != 0) {
                            statePc = 216;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if ((((ja) (this)).field_q ^ -1) <= (var14_ref_wm.field_q ^ -1)) {
                            statePc = 159;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (var14_ref_wm.a(2048, this.field_A)) {
                            statePc = 158;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var12 = 0;
                        if (var20 == 0) {
                            statePc = 160;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        var14_ref_wm = (wm) ((Object) bl.field_r.field_d.c((byte) 120));
                        if (var20 == 0) {
                            statePc = 148;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        var14 = 0;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (var14 >= bl.field_r.field_h) {
                            statePc = 181;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackIn_216_0 = this;
                        stackIn_164_0 = stackIn_216_0;
                        if (var20 != 0) {
                            statePc = 216;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (((ja) (this)).field_mc == var14) {
                            statePc = 178;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        var15 = bl.field_r.field_C[var14];
                        if (var15 == null) {
                            statePc = 178;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        var16 = -this.field_A.field_h + var15.field_A.field_h;
                        var17 = var15.field_A.field_f + -this.field_A.field_f;
                        if (-2501 >= (var16 * var16 - -(var17 * var17) ^ -1)) {
                            statePc = 171;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        var18 = this.field_w.field_g * (float)var17 + this.field_w.field_j * (float)var16;
                        var19 = (float)var16 * this.field_w.field_g - (float)var17 * this.field_w.field_j;
                        if (var18 > Math.abs(var19) * 4.0f) {
                            statePc = 174;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (!kj.a(140, var15.field_A, this.field_A, bl.field_r.field_nb)) {
                            statePc = 177;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        var12 = 1;
                        if (var20 == 0) {
                            statePc = 181;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        var14++;
                        if (var20 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if (var20 == 0) {
                            statePc = 215;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        if (this.field_lb == null) {
                            statePc = 191;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (!this.field_lb.b(110)) {
                            statePc = 191;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        if (var20 == 0) {
                            statePc = 215;
                        } else {
                            statePc = 189;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        var14 = 0;
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if ((bl.field_r.field_h ^ -1) >= (var14 ^ -1)) {
                            statePc = 212;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        stackIn_216_0 = this;
                        stackIn_194_0 = stackIn_216_0;
                        if (var20 != 0) {
                            statePc = 216;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        if (((ja) (this)).field_mc != var14) {
                            statePc = 200;
                        } else {
                            statePc = 195;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        if (var20 == 0) {
                            statePc = 209;
                        } else {
                            statePc = 198;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        var15 = bl.field_r.field_C[var14];
                        if (var15 == null) {
                            statePc = 209;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        var16 = var15.field_A.field_h + -this.field_A.field_h;
                        var17 = -this.field_A.field_f + var15.field_A.field_f;
                        if (-226 >= (var17 * var17 + var16 * var16 ^ -1)) {
                            statePc = 204;
                        } else {
                            statePc = 202;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        var18 = this.field_w.field_j * (float)var16 + this.field_w.field_g * (float)var17;
                        var19 = -(this.field_w.field_j * (float)var17) + this.field_w.field_g * (float)var16;
                        if (var18 > 4.0f * Math.abs(var19)) {
                            statePc = 207;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        if (kj.a(140, var15.field_A, this.field_A, bl.field_r.field_nb)) {
                            statePc = 209;
                        } else {
                            statePc = 208;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        var12 = 1;
                        if (var20 == 0) {
                            statePc = 212;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        var14++;
                        if (var20 == 0) {
                            statePc = 192;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        if (var20 == 0) {
                            statePc = 215;
                        } else {
                            statePc = 213;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        var12 = 1;
                        if (var20 == 0) {
                            statePc = 215;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        var12 = 1;
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        stackIn_216_0 = this;
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        this.a(var10 != 0, var7 != 0, var12 != 0, 116, var8 != 0, var11 != 0, var9 != 0);
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 218: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw kk.a((Throwable) ((Object) var2), "ja.B(" + param0 + ')');
                }
                case 219: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1) {
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              L2: {
                stackIn_6_0 = this;

                if (-3 == (bl.field_r.field_J ^ -1)) {
                  break L2;
                } else {
                  stackIn_6_0 = this;

                  if (bl.field_r.field_J == 6) {
                    break L2;
                  } else {
                    stackIn_4_0 = this;
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L1;
                  }
                }
              }
              stackIn_7_0 = this;
              stackIn_7_1 = 0;
              break L1;
            }
            L3: {
              L4: {
                ((ja) (this)).field_V = stackIn_7_1 != 0;
                this.field_jb = true;
                if (this.field_J == param0) {
                  break L4;
                } else {
                  if (-1 != (this.field_rc ^ -1)) {
                    break L4;
                  } else {
                    param1 = (int)((float)param1 * this.a((byte) 105, il.field_d));
                    if (HoldTheLine.field_D == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              this.field_jb = false;
              break L3;
            }
            L5: {
              if ((param1 ^ -1) < (this.field_M ^ -1)) {
                this.field_M = param1;
                break L5;
              } else {
                break L5;
              }
            }
            this.field_T = 20;
            this.field_H = this.e((byte) 45);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3), "ja.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (this.field_rb != null) {
                mk.a(true, this.field_rb);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_rb = null;
              if (this.field_S == null) {
                break L2;
              } else {
                mk.a(true, this.field_S);
                break L2;
              }
            }
            L3: {
              this.field_S = null;
              if (null != this.field_Z) {
                mk.a(true, this.field_Z);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 >= 97) {
                break L4;
              } else {
                this.field_sb = (ei) null;
                break L4;
              }
            }
            L5: {
              this.field_Z = null;
              if (this.field_fb == null) {
                break L5;
              } else {
                mk.a(true, this.field_fb);
                break L5;
              }
            }
            L6: {
              this.field_fb = null;
              if (this.field_ub == null) {
                break L6;
              } else {
                mk.a(true, this.field_ub);
                break L6;
              }
            }
            L7: {
              this.field_ub = null;
              if (this.field_vc == null) {
                break L7;
              } else {
                mk.a(true, this.field_vc);
                break L7;
              }
            }
            this.field_vc = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "ja.P(" + param0 + ')');
        }
    }

    private final void a(ja param0, byte param1) {
        int fieldTemp$0 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == param0) {
                            statePc = 10;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 == this.field_rc) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (kb.a(16616, 0)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param0.field_Sb = param0.field_Sb + 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.d(3, -1065046232);
                        this.field_oc = this.field_oc + 1;
                        this.field_J = -1;
                        bd.a((byte) 4, (ee) (this), pf.field_g, pf.field_g.field_q);
                        this.d((byte) 116);
                        kn.a(0, this.field_A.field_f, 0, 128, 1, -1, this.field_A.field_h, 3, bl.field_r.field_M, 16777215, 0, 32, 400);
                        kn.a(0, this.field_A.field_f, 0, 128, 1, -4, this.field_A.field_h, 3, bl.field_r.field_M, 16777215, 0, 128, 60);
                        kn.a(0, this.field_A.field_f, 0, 128, 1, -8, this.field_A.field_h, 3, bl.field_r.field_M, 16777215, 0, 255, 20);
                        if (-1 == (this.field_rc ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_rc = 2;
                        if (var4 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3_int = bl.field_r.field_h;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (bl.field_r.field_z <= var3_int) {
                            statePc = 26;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_37_0 = null;
                        stackIn_17_0 = stackIn_37_0;
                        if (var4 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 == bl.field_r.field_C[var3_int]) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        bl.field_r.field_C[var3_int] = new ja(this.field_A.field_h, this.field_A.field_f, this.field_q, this.field_r, this.field_vb, this.field_zb, this.field_C, 2);
                        if (var4 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var3_int++;
                        if (var4 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var3_int != bl.field_r.field_z) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((bl.field_r.field_z ^ -1) > -65) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        fieldTemp$0 = bl.field_r.field_z;
                        bl.field_r.field_z = bl.field_r.field_z + 1;
                        bl.field_r.field_C[fieldTemp$0] = new ja(this.field_A.field_h, this.field_A.field_f, this.field_q, this.field_r, this.field_vb, this.field_zb, this.field_C, 2);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        this.l(554646678);
                        this.field_L = 150;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param1 <= -67) {
                            statePc = 44;
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
                        stackIn_37_0 = null;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        field_Qb = (char[]) ((Object) stackIn_37_0);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_42_0 = (RuntimeException) (var3);
                    stackIn_40_0 = stackIn_42_0;
                    stackIn_42_1 = new StringBuilder().append("ja.RA(");
                    stackIn_40_1 = stackIn_42_1;
                    if (param0 == null) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackIn_43_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackIn_43_2 = "{...}";
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_43_2 = "null";
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    throw kk.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ')');
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, dn param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_C = param1;
            this.field_p = true;
            this.field_z = true;
            this.field_i = this.field_C.field_k;
            if (param0 == 20385) {
              this.field_k = this.field_C.field_K;
              this.field_B = (int)Math.ceil(Math.sqrt((double)(this.field_i * this.field_i + this.field_k * this.field_k)) + 1.0);
              this.field_lc = (float)this.field_C.field_i;
              this.field_kb = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ja.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void k(int param0) {
        float stackIn_9_0 = 0.0f;
        float stackIn_11_0 = 0.0f;
        int statePc = 0;
        Throwable caughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        qm var3 = null;
        in var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_float = (float)(-(int)this.field_vb) + this.field_vb;
                        var3 = this.field_zb.a(false, var2_float);
                        var4 = this.field_zb.a((byte) 126, var2_float);
                        var5 = (float)Math.atan2((double)(-var4.field_g), (double)var4.field_j);
                        var6 = -this.field_y + (float)var3.field_h;
                        var7 = -this.field_u + (float)var3.field_f;
                        var8 = var5 - this.field_r;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((double)var8 <= 3.141592653589793) {
                            statePc = 7;
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
                        var8 = (float)((double)var8 - 6.283185307179586);
                        if (var10 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-3.141592653589793 <= (double)var8) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_11_0 = (float)((double)var8 + 6.283185307179586);
                        stackIn_9_0 = stackIn_11_0;
                        if (var10 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = stackIn_9_0;
                        if (var10 == 0) {
                            statePc = 7;
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
                        stackIn_11_0 = 1.0f / (float)this.field_O;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = stackIn_11_0;
                        this.field_x = var9 * var7 / 0.07000000029802322f;
                        this.field_j = var9 * var8 / 0.019999999552965164f;
                        this.field_t = var6 * var9 / 0.07000000029802322f;
                        if (param0 == -1675) {
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
                        this.field_bb = 1.3815250396728516f;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw kk.a((Throwable) ((Object) var2), "ja.U(" + param0 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final float e(byte param0) {
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        in var3 = null;
        float stackIn_4_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_float = this.field_vb - (float)(int)this.field_vb;
              var3 = this.field_zb.a((byte) 120, var2_float);
              if (param0 == 45) {
                break L1;
              } else {
                field_Db = (hj[]) null;
                break L1;
              }
            }
            stackIn_4_0 = (float)Math.atan2((double)(-var3.field_g), (double)var3.field_j);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "ja.M(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(eb[] param0, ei param1, int param2) {
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        float stackIn_56_0 = 0.0f;
        float stackIn_57_0 = 0.0f;
        float stackIn_59_0 = 0.0f;
        float stackIn_60_0 = 0.0f;
        float stackIn_60_1 = 0.0f;
        float stackIn_64_0 = 0.0f;
        float stackIn_65_0 = 0.0f;
        float stackIn_67_0 = 0.0f;
        float stackIn_68_0 = 0.0f;
        float stackIn_68_1 = 0.0f;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ah var5 = null;
        qm var6 = null;
        wm var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        eb[] var16 = null;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        eb[] var20 = null;
        eb[] var21 = null;
        int var22 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param0.length;
                        if (0 != var4_int) {
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
                    return;
                }
                case 3: {
                    try {
                        var5 = bl.field_r.field_cb;
                        var6 = new qm(param2, 0);
                        var7 = (wm) ((Object) var5.b((byte) 105));
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
                        if (null == var7) {
                            statePc = 88;
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
                        if (var22 != 0) {
                            statePc = 88;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((8 & var7.field_J) == 0) {
                            statePc = 23;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.b(-26, var7.field_v)) {
                            statePc = 24;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.b(-106, var7.field_m)) {
                            statePc = 24;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (this.b(-100, var7.field_l)) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!this.b(param2 ^ -72, var7.field_s)) {
                            statePc = 23;
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = (wm) ((Object) var5.c((byte) -34));
                        if (var22 == 0) {
                            statePc = 4;
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
                        var8 = var7.field_A.field_h + -param0[0].field_h;
                        var9 = var7.field_A.field_f - param0[0].field_f;
                        var10 = var8 * var8 + var9 * var9;
                        var11 = var10;
                        var12 = 0;
                        var13 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var13 >= var4_int) {
                            statePc = 32;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var8 = -param0[var13].field_h + var7.field_A.field_h;
                        var9 = var7.field_A.field_f + -param0[var13].field_f;
                        var10 = var8 * var8 + var9 * var9;
                        stackIn_33_0 = var10;
                        stackIn_27_0 = stackIn_33_0;
                        stackIn_33_1 = var11;
                        stackIn_27_1 = stackIn_33_1;
                        if (var22 != 0) {
                            statePc = 33;
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
                        if (stackIn_27_0 >= stackIn_27_1) {
                            statePc = 31;
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var11 = var10;
                        var12 = var13;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var13++;
                        if (var22 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = var11 ^ -1;
                        stackIn_33_1 = -1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 <= stackIn_33_1) {
                            statePc = 36;
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
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!param0[var12].field_m) {
                            statePc = 39;
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
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var13 = var7.field_B + (this.field_C.field_k - -5);
                        var14 = var7.field_B + this.field_C.field_k + 90;
                        if (var11 < var14 * var14) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var16 = new eb[var4_int];
                        var15 = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var4_int ^ -1) >= (var15 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var16[var15] = new eb(param0[var15]);
                        var15++;
                        if (var22 != 0) {
                            statePc = 49;
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
                        if (var22 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
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
                        var6.field_h = var7.field_A.field_h;
                        var6.field_f = var7.field_A.field_f;
                        this.a(var6, var12, var16, -1);
                        param1.a(var16, (byte) 6);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var11 ^ -1) > (var13 * var13 ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var12 != -1 + param0.length) {
                            statePc = 55;
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
                        stackIn_56_0 = (float)param0[var12].field_h;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_56_0 = (float)param0[var12 + 1].field_h;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var17 = stackIn_56_0;
                        stackIn_59_0 = var17;
                        stackIn_57_0 = stackIn_59_0;
                        if (var12 != 0) {
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
                        stackIn_60_0 = stackIn_57_0;
                        stackIn_60_1 = (float)param0[0].field_h;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_60_0 = stackIn_59_0;
                        stackIn_60_1 = (float)param0[-1 + var12].field_h;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var17 = stackIn_60_0 - stackIn_60_1;
                        if (var12 != param0.length + -1) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_64_0 = (float)param0[var12].field_f;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = (float)param0[1 + var12].field_f;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var18 = stackIn_64_0;
                        stackIn_67_0 = var18;
                        stackIn_65_0 = stackIn_67_0;
                        if (-1 != (var12 ^ -1)) {
                            statePc = 67;
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
                        stackIn_68_0 = stackIn_65_0;
                        stackIn_68_1 = (float)param0[0].field_f;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = stackIn_67_0;
                        stackIn_68_1 = (float)param0[var12 + -1].field_f;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var18 = stackIn_68_0 - stackIn_68_1;
                        var19 = (float)Math.sqrt((double)(var18 * var18 + var17 * var17));
                        var17 = var17 / var19;
                        var18 = var18 / var19;
                        var20 = new eb[var4_int];
                        var21 = new eb[var4_int];
                        var15 = 0;
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
                        if (var15 >= var4_int) {
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
                        var20[var15] = new eb(param0[var15]);
                        var21[var15] = new eb(param0[var15]);
                        var15++;
                        if (var22 != 0) {
                            statePc = 75;
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
                        if (var22 == 0) {
                            statePc = 69;
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
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var6.field_f = (int)((float)var7.field_A.field_f - (float)(15 + var13) * var17);
                        var6.field_h = (int)((float)var7.field_A.field_h + var18 * (float)(var13 + 15));
                        this.a(var6, var12, var20, -1);
                        var6.field_f = (int)((float)var7.field_A.field_f + var17 * (float)(var13 + 15));
                        var6.field_h = (int)(-((float)(-5 + (20 + var13)) * var18) + (float)var7.field_A.field_h);
                        this.a(var6, var12, var21, -1);
                        param1.a(var20, (byte) 6);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        param1.a(var21, (byte) 6);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    return;
                }
                case 77: {
                    try {
                        var7 = (wm) ((Object) var5.c((byte) 86));
                        if (var22 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 79: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_82_0 = (RuntimeException) (var4);
                    stackIn_80_0 = stackIn_82_0;
                    stackIn_82_1 = new StringBuilder().append("ja.PA(");
                    stackIn_80_1 = stackIn_82_1;
                    if (param0 == null) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_83_2 = "{...}";
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
                    stackIn_83_2 = "null";
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    stackIn_86_0 = (RuntimeException) ((Object) stackIn_83_0);
                    stackIn_84_0 = stackIn_86_0;
                    stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',');
                    stackIn_84_1 = stackIn_86_1;
                    if (param1 == null) {
                        statePc = 86;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    stackIn_87_0 = (RuntimeException) ((Object) stackIn_84_0);
                    stackIn_87_1 = (StringBuilder) ((Object) stackIn_84_1);
                    stackIn_87_2 = "{...}";
                    statePc = 87;
                    continue stateLoop;
                }
                case 86: {
                    stackIn_87_0 = (RuntimeException) ((Object) stackIn_86_0);
                    stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
                    stackIn_87_2 = "null";
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    throw kk.a((Throwable) ((Object) stackIn_87_0), stackIn_87_2 + ',' + param2 + ')');
                }
                case 88: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void g(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        oa stackIn_103_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        oa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              L2: {
                if (0.0f != this.field_ic) {
                  break L2;
                } else {
                  L3: {
                    if (!this.field_I) {
                      break L3;
                    } else {
                      L4: {
                        var2_int = 0;
                        if (this.field_rb == null) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              var2_int = this.field_rb.field_o.i();
                              if (0 == (var2_int ^ -1)) {
                                break L6;
                              } else {
                                if (var2_int < this.field_C.field_u.field_m) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var2_int = 0;
                            if (var3 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          var2_int = this.field_C.field_u.field_m - var2_int;
                          var2_int = var2_int * this.field_C.field_L.field_n.length;
                          var2_int = var2_int / this.field_C.field_u.field_m;
                          break L4;
                        }
                      }
                      L7: {
                        if (this.field_S != null) {
                          mk.a(true, this.field_S);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      this.field_S = bd.a((byte) 3, (ee) (this), this.field_C.field_L, this.field_C.field_L.field_q);
                      this.field_S.field_o.i(var2_int);
                      this.field_S.field_o.g(-1);
                      this.field_I = false;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L8: {
                    if ((this.field_eb ^ -1) <= -9) {
                      break L8;
                    } else {
                      this.field_eb = this.field_eb + 1;
                      break L8;
                    }
                  }
                  if (0 >= this.field_Vb) {
                    break L1;
                  } else {
                    fieldTemp$0 = this.field_Vb - 1;
                    this.field_Vb = this.field_Vb - 1;
                    if (-1 != (fieldTemp$0 ^ -1)) {
                      break L1;
                    } else {
                      if (null == this.field_rb) {
                        break L1;
                      } else {
                        mk.a(true, this.field_rb);
                        this.field_rb = null;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              L9: {
                if (!this.field_I) {
                  break L9;
                } else {
                  L10: {
                    if (this.field_rb.field_o.i() <= this.field_C.field_u.field_m) {
                      break L10;
                    } else {
                      if (0.0f == this.field_jc) {
                        break L10;
                      } else {
                        if ((kj.b(2, 50) ^ -1) == -1) {
                          this.field_rb.field_o.i((this.field_C.field_u.field_m - -kj.b(2, this.field_C.field_u.field_m)) / 2);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    if (-9 < (this.field_Vb ^ -1)) {
                      this.field_Vb = this.field_Vb + 1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (-1 > (this.field_eb ^ -1)) {
                    fieldTemp$1 = this.field_eb - 1;
                    this.field_eb = this.field_eb - 1;
                    if (-1 != (fieldTemp$1 ^ -1)) {
                      break L1;
                    } else {
                      if (this.field_S != null) {
                        mk.a(true, this.field_S);
                        this.field_S = null;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L9;
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L12: {
                var2_int = 0;
                if (this.field_S == null) {
                  break L12;
                } else {
                  L13: {
                    var2_int = this.field_S.field_o.i();
                    if (0 != (var2_int ^ -1)) {
                      break L13;
                    } else {
                      var2_int = 0;
                      if (var3 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  var2_int = this.field_C.field_L.field_n.length + -var2_int;
                  var2_int = var2_int * this.field_C.field_u.field_m;
                  var2_int = var2_int / this.field_C.field_L.field_n.length;
                  break L12;
                }
              }
              L14: {
                if (this.field_rb != null) {
                  mk.a(true, this.field_rb);
                  break L14;
                } else {
                  break L14;
                }
              }
              this.field_rb = bd.a((byte) 114, (ee) (this), this.field_C.field_u, this.field_C.field_u.field_q);
              this.field_rb.field_o.i(var2_int);
              this.field_rb.field_o.g(-1);
              this.field_I = true;
              break L1;
            }
            L15: {
              if ((bl.field_r.field_r ^ -1) != -2) {
                L16: {
                  if (this.field_wb <= 1.0f) {
                    break L16;
                  } else {
                    L17: {
                      if ((this.field_Kb ^ -1) > -17) {
                        this.field_Kb = this.field_Kb + 1;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (this.field_Z != null) {
                        break L18;
                      } else {
                        this.field_Z = bd.a((byte) 5, (ee) (this), qm.field_c, this.field_Kb * qm.field_c.field_q >> 887236964);
                        this.field_Z.field_o.g(-1);
                        if (var3 == 0) {
                          break L15;
                        } else {
                          break L18;
                        }
                      }
                    }
                    this.field_Z.field_n = this.field_Kb * qm.field_c.field_q >> -799681340;
                    if (var3 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                L19: {
                  if ((this.field_Kb ^ -1) < -1) {
                    this.field_Kb = this.field_Kb - 1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                if (this.field_Z == null) {
                  break L15;
                } else {
                  this.field_Z.field_n = qm.field_c.field_q * this.field_Kb >> 917875012;
                  break L15;
                }
              } else {
                break L15;
              }
            }
            L20: {
              if (bl.field_r.field_r == 3) {
                break L20;
              } else {
                L21: {
                  if (2 != bl.field_r.field_r) {
                    stackIn_103_0 = rc.field_a;
                    break L21;
                  } else {
                    stackIn_103_0 = kl.field_t;
                    break L21;
                  }
                }
                L22: {
                  var2 = stackIn_103_0;
                  if (Math.abs(this.field_jc) <= 1.0f) {
                    break L22;
                  } else {
                    if (bl.field_r.a(this.field_q, false, this.field_A)) {
                      break L22;
                    } else {
                      L23: {
                        if ((this.field_dc ^ -1) > -17) {
                          this.field_dc = this.field_dc + 1;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (null == this.field_ub) {
                          break L24;
                        } else {
                          this.field_ub.field_n = this.field_dc * var2.field_q >> 1102755108;
                          if (var3 == 0) {
                            break L20;
                          } else {
                            break L24;
                          }
                        }
                      }
                      this.field_ub = bd.a((byte) 38, (ee) (this), var2, this.field_dc * var2.field_q >> 166014180);
                      this.field_ub.field_o.g(-1);
                      if (var3 == 0) {
                        break L20;
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                L25: {
                  if (this.field_dc > 0) {
                    this.field_dc = this.field_dc - 1;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                if (null != this.field_ub) {
                  this.field_ub.field_n = this.field_dc * var2.field_q >> -1399326364;
                  break L20;
                } else {
                  break L20;
                }
              }
            }
            if (param0 >= 103) {
              L26: {
                L27: {
                  L28: {
                    if (this.field_Fb[1] > 0) {
                      break L28;
                    } else {
                      if (this.field_J != 1) {
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                  }
                  if (this.field_ic <= 0.0f) {
                    break L27;
                  } else {
                    L29: {
                      if ((this.field_gc ^ -1) <= -17) {
                        break L29;
                      } else {
                        this.field_gc = this.field_gc + 1;
                        break L29;
                      }
                    }
                    L30: {
                      if (null != this.field_fb) {
                        break L30;
                      } else {
                        this.field_fb = bd.a((byte) 109, (ee) (this), cf.field_s, this.field_gc * cf.field_s.field_q >> 950014340);
                        this.field_fb.field_o.g(-1);
                        if (var3 == 0) {
                          break L26;
                        } else {
                          break L30;
                        }
                      }
                    }
                    this.field_fb.field_n = cf.field_s.field_q * this.field_gc >> -1848651292;
                    if (var3 == 0) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                L31: {
                  if (this.field_gc > 0) {
                    this.field_gc = this.field_gc - 1;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                if (this.field_fb == null) {
                  break L26;
                } else {
                  this.field_fb.field_n = cf.field_s.field_q * this.field_gc >> 888557348;
                  break L26;
                }
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
          throw kk.a((Throwable) ((Object) var2_ref), "ja.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final ei a(float param0, float param1, float param2, int param3) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        ei stackIn_38_0 = null;
        RuntimeException decompiledCaughtException = null;
        wd[] var5 = null;
        RuntimeException var5_ref = null;
        ei var6 = null;
        int var7 = 0;
        float var8 = 0.0f;
        wd var9 = null;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        wd var14 = null;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        var17 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var5 = bl.field_r.field_sb;
              var6 = new ei();
              var7 = (int)param1;
              var8 = (float)(-var7) + param1;
              if (var7 == var5.length) {
                var7 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var9 = var5[var7];
                  var10 = var9.f(50);
                  var11 = param0 / var10;
                  if (1.0f > var8 + var11) {
                    break L4;
                  } else {
                    param0 = param0 + var10 * var8;
                    L5: while (true) {
                      L6: {
                        if (param0 < var10) {
                          break L6;
                        } else {
                          param0 = param0 - var10;
                          var7++;
                          stackIn_17_0 = var7;

                          stackIn_17_1 = var5.length;

                          if (var17 != 0) {
                            break L2;
                          } else {
                            L7: {
                              if (stackIn_17_0 != stackIn_17_1) {
                                break L7;
                              } else {
                                var7 = 0;
                                break L7;
                              }
                            }
                            var9 = var5[var7];
                            var10 = var9.f(50);
                            if (var17 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var8 = param0 / var10;
                      if (var17 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var8 = var8 + var11;
                break L3;
              }
              this.field_qc = var7;
              stackIn_17_0 = param3;
              stackIn_17_1 = 55;
              break L2;
            }
            L8: {
              if (stackIn_17_0 >= stackIn_17_1) {
                break L8;
              } else {
                this.a(false, false, true, 14, false, true, true);
                break L8;
              }
            }
            L9: {
              L10: {
                var12 = param2 / var10;
                if (var12 + var8 >= 1.0f) {
                  break L10;
                } else {
                  this.field_kc = var7;
                  var6.a(hk.a(ao.a(var8, true, var9, var12 + var8), 1, false), (byte) 6);
                  if (var17 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              var6.a(hk.a(sa.a(var9, var8, (byte) -97), 1, false), (byte) 6);
              param2 = param2 - var10 * (-var8 + 1.0f);
              if (0.0f < param2) {
                var13 = (var7 + 1) % var5.length;
                var14 = var5[var13];
                var15 = var14.f(50);
                L11: while (true) {
                  L12: {
                    L13: {
                      if (var15 > param2) {
                        break L13;
                      } else {
                        param2 = param2 - var15;
                        var6.a(hk.a(var14, 1, false), (byte) 6);
                        var13++;
                        if (var17 != 0) {
                          break L12;
                        } else {
                          L14: {
                            if ((var13 ^ -1) != (var5.length ^ -1)) {
                              break L14;
                            } else {
                              var13 = 0;
                              break L14;
                            }
                          }
                          var14 = var5[var13];
                          var15 = var14.f(50);
                          if (var17 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    this.field_kc = var13;
                    break L12;
                  }
                  var16 = param2 / var15;
                  var6.a(hk.a(fj.a(false, var16, var14), 1, false), (byte) 6);
                  break L9;
                }
              } else {
                break L9;
              }
            }
            stackIn_38_0 = (ei) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var5_ref), "ja.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_38_0;
    }

    final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_Cb = false;
              this.field_q = this.field_uc;
              this.field_tb = 0;
              this.field_xc = 0.0f;
              this.field_Jb = 0;
              this.field_sc = new eb[32];
              this.field_ic = 0.0f;
              this.field_V = false;
              this.field_r = this.field_D;
              this.field_H = this.field_D;
              this.field_vb = this.field_E;
              this.field_Ib = this.field_E;
              this.field_A.field_f = this.field_mb;
              this.field_u = (float)this.field_mb;
              this.field_T = 0;
              this.field_Lb = 0;
              this.field_O = 0;
              this.field_j = 0.0f;
              this.field_P = 0.0f;
              this.field_Gb = 0.0f;
              this.field_zb = this.field_K;
              this.field_A.field_h = this.field_Mb;
              this.field_y = (float)this.field_Mb;
              this.field_wc = 0.0f;
              this.field_jb = false;
              this.field_t = 0.0f;
              this.field_xb = 0;
              this.field_x = 0.0f;
              this.f(3);
              this.field_lc = (float)this.field_C.field_i;
              this.field_N = (float)this.field_C.field_i;
              this.field_Ab = true;
              this.field_nb = this.field_A.field_h + -(int)((float)this.field_C.field_K * this.field_w.field_j + (float)this.field_C.field_k * this.field_w.field_g);
              if (param0 == 554646678) {
                break L1;
              } else {
                this.a((byte) -40, 71, (eb) null);
                break L1;
              }
            }
            this.field_I = false;
            this.field_Tb = -(int)(-((float)this.field_C.field_k * this.field_w.field_j) + this.field_w.field_g * (float)this.field_C.field_K) + this.field_A.field_f;
            this.field_pc = 0;
            this.field_Xb = -(int)(-((float)this.field_C.field_k * this.field_w.field_g) + this.field_w.field_j * (float)this.field_C.field_K) + this.field_A.field_h;
            this.field_Ob = -(int)((float)this.field_C.field_K * this.field_w.field_g + (float)this.field_C.field_k * this.field_w.field_j) + this.field_A.field_f;
            this.field_Hb = 0;
            this.field_Bb = null;
            this.field_Yb = 0;
            this.field_qb = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "ja.HA(" + param0 + ')');
        }
    }

    final void g(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        boolean discarded$4 = false;
        int fieldTemp$5 = 0;
        int stackIn_125_0 = 0;
        int stackIn_135_0 = 0;
        wm stackIn_138_0 = null;
        wm stackIn_138_1 = null;
        qm stackIn_138_2 = null;
        wm stackIn_139_0 = null;
        wm stackIn_139_1 = null;
        qm stackIn_139_2 = null;
        int stackIn_139_3 = 0;
        int stackIn_164_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        float var3 = 0.0f;
        int var4_int = 0;
        in var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wm var8 = null;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            if (0 == this.field_rc) {
              L1: {
                if (-1 > (this.field_L ^ -1)) {
                  this.field_L = this.field_L - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (this.field_W != null) {
                    break L3;
                  } else {
                    L4: {
                      this.field_F = false;
                      if ((this.field_Yb ^ -1) < -1) {
                        break L4;
                      } else {
                        L5: {
                          if (!bl.field_r.field_f) {
                            break L5;
                          } else {
                            this.a(false, false, false, 126, false, false, true);
                            if (var9 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.f((byte) 81);
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_Yb = this.field_Yb - 3;
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L6: {
                  if (0 >= this.field_O) {
                    break L6;
                  } else {
                    this.a(false, false, false, 109, false, false, false);
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  L8: {
                    var2_int = ma.a(this.field_W[0], param0 + 1244) ? 1 : 0;
                    var3_int = ma.a(this.field_W[1], -1) ? 1 : 0;
                    var4_int = ma.a(this.field_W[2], param0 + 1244) ? 1 : 0;
                    var5 = ma.a(this.field_W[3], -1) ? 1 : 0;
                    var6 = ma.a(this.field_W[4], -1) ? 1 : 0;
                    if (var2_int != 0) {
                      break L8;
                    } else {
                      if (var3_int != 0) {
                        break L8;
                      } else {
                        if (var4_int != 0) {
                          break L8;
                        } else {
                          if (var5 != 0) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  this.field_tb = 0;
                  break L7;
                }
                L9: {
                  if (this.field_jc <= 10.0f) {
                    break L9;
                  } else {
                    this.a(var2_int != 0, var4_int != 0, var6 != 0, param0 ^ -1194, false, var3_int != 0, var5 != 0);
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (-10.0f <= this.field_jc) {
                    break L10;
                  } else {
                    this.a(var2_int != 0, false, var6 != 0, 125, var5 != 0, var3_int != 0, var4_int != 0);
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L10;
                    }
                  }
                }
                this.a(var2_int != 0, var4_int != 0, var6 != 0, 116, var5 != 0, var3_int != 0, false);
                break L2;
              }
              L11: {
                L12: {
                  var2_int = 0;
                  if (!this.field_nc) {
                    break L12;
                  } else {
                    if (!this.field_F) {
                      L13: {
                        if (this.field_Fb[0] == 1) {
                          break L13;
                        } else {
                          L14: {
                            if ((this.field_Fb[0] ^ -1) == -3) {
                              break L14;
                            } else {
                              L15: {
                                if ((this.field_Fb[0] ^ -1) == -4) {
                                  break L15;
                                } else {
                                  if (this.field_Fb[1] == 3) {
                                    break L15;
                                  } else {
                                    if (3 == this.field_Fb[2]) {
                                      break L15;
                                    } else {
                                      if ((this.field_fc ^ -1) > (-30 + bl.field_r.field_ab ^ -1)) {
                                        ad.a(255, 64, rg.field_b);
                                        this.field_fc = bl.field_r.field_ab;
                                        if (var9 == 0) {
                                          break L12;
                                        } else {
                                          break L15;
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                              L16: {
                                L17: {
                                  if (-1 != (this.field_hc[0] ^ -1)) {
                                    break L17;
                                  } else {
                                    if (-1 < (this.field_Rb ^ -1)) {
                                      break L16;
                                    } else {
                                      L18: {
                                        if (null == this.field_lb) {
                                          break L18;
                                        } else {
                                          if (!this.field_lb.b(param0 + 1338)) {
                                            break L18;
                                          } else {
                                            this.field_lb.d(param0 + 1245);
                                            break L18;
                                          }
                                        }
                                      }
                                      this.field_lb = new wm(this.field_A, 11, this.field_q, this.field_r, this.field_w.field_j * 55.0f + this.field_t, this.field_x + 55.0f * this.field_w.field_g);
                                      this.field_lb.field_J = this.field_lb.field_J | this.field_mc;
                                      bd.a((byte) 117, this.field_lb, jb.field_T, jb.field_T.field_q);
                                      bl.field_r.field_W.a((byte) -112, this.field_lb);
                                      this.field_Rb = 0;
                                      if (var9 == 0) {
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                L19: {
                                  if (1 == this.field_hc[0]) {
                                    break L19;
                                  } else {
                                    if (-3 != (this.field_hc[0] ^ -1)) {
                                      break L16;
                                    } else {
                                      this.field_J = 2;
                                      this.field_ac = 500;
                                      if (var9 == 0) {
                                        break L16;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                                this.field_ac = 250;
                                this.field_J = 1;
                                bd.a((byte) 84, (ee) (this), pe.field_b, pe.field_b.field_q);
                                break L16;
                              }
                              var3_int = 0;
                              L20: while (true) {
                                L21: {
                                  if (-4 >= (var3_int ^ -1)) {
                                    break L21;
                                  } else {
                                    var4_int = 0;
                                    var5 = 0;
                                    stackIn_164_0 = 0;

                                    if (var9 != 0) {
                                      break L11;
                                    } else {
                                      var6 = stackIn_164_0;
                                      L22: while (true) {
                                        var4_int = kj.b(2, 640);
                                        var5 = kj.b(2, 480);
                                        var6 = bl.field_r.d(var5, var4_int, param0 ^ 1217);
                                        stackIn_125_0 = -1;
                                        L23: while (true) {
                                          if (stackIn_125_0 == (var6 ^ -1)) {
                                            continue L22;
                                          } else {
                                            stackIn_125_0 = 48 & var6;

                                            if (var9 != 0) {
                                              continue L23;
                                            } else {
                                              L24: {
                                                if (stackIn_125_0 != 0) {
                                                  stackIn_135_0 = 1;
                                                  break L24;
                                                } else {
                                                  if ((12 & var6 ^ -1) == -1) {
                                                    stackIn_135_0 = -1;
                                                    break L24;
                                                  } else {
                                                    stackIn_135_0 = 0;
                                                    break L24;
                                                  }
                                                }
                                              }
                                              L25: {
                                                var7 = stackIn_135_0;
                                                stackIn_138_0 = null;

                                                stackIn_138_1 = null;

                                                stackIn_138_2 = this.field_A;

                                                if ((this.field_hc[var3_int] ^ -1) == -4) {
                                                  stackIn_139_0 = null;
                                                  stackIn_139_1 = null;
                                                  stackIn_139_2 = (qm) ((Object) stackIn_138_2);
                                                  stackIn_139_3 = 1;
                                                  break L25;
                                                } else {
                                                  stackIn_139_0 = null;
                                                  stackIn_139_1 = null;
                                                  stackIn_139_2 = (qm) ((Object) stackIn_138_2);
                                                  stackIn_139_3 = this.field_hc[var3_int] + 2;
                                                  break L25;
                                                }
                                              }
                                              var8 = new wm(stackIn_139_2, stackIn_139_3, 3);
                                              var8.field_C = 150;
                                              var8.field_J = var8.field_J | 131072;
                                              var8.field_D = var4_int;
                                              var8.field_P = -this.field_A.field_h + var4_int;
                                              var8.field_T = var7;
                                              var8.field_z = false;
                                              var8.field_F = var5;
                                              var8.field_O = -this.field_A.field_f + var5;
                                              bl.field_r.field_W.a((byte) -124, var8);
                                              this.field_hc[var3_int] = -1;
                                              var3_int++;
                                              if (var9 == 0) {
                                                continue L20;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                this.field_Fb[0] = 0;
                                this.field_Fb[3] = 0;
                                this.field_Fb[1] = 0;
                                this.field_Fb[2] = 0;
                                this.field_fc = bl.field_r.field_ab;
                                if (var9 == 0) {
                                  break L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          if ((this.field_Rb ^ -1) > -1) {
                            break L12;
                          } else {
                            var2_int = this.c((byte) -71) ? 1 : 0;
                            if (var9 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      L26: {
                        if ((this.field_Rb ^ -1) <= -251) {
                          break L26;
                        } else {
                          if (this.field_yb == null) {
                            break L26;
                          } else {
                            if (this.field_yb.b(56)) {
                              break L12;
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                      L27: {
                        this.field_Ub = 20;
                        if (this.field_yb == null) {
                          break L27;
                        } else {
                          if (!this.field_yb.b(60)) {
                            break L27;
                          } else {
                            this.field_yb.d(0);
                            break L27;
                          }
                        }
                      }
                      this.field_yb = new wm(this.field_A, 9, this.field_q, this.field_r, this.field_t - this.field_w.field_j * 50.0f, -(this.field_w.field_g * 50.0f) + this.field_x);
                      this.field_yb.field_J = this.field_yb.field_J | this.field_mc;
                      this.field_yb.a(ui.field_i, 90);
                      bd.a((byte) 91, this.field_yb, ic.field_i, ic.field_i.field_q);
                      bl.field_r.field_W.a((byte) -94, this.field_yb);
                      this.field_Rb = 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                stackIn_164_0 = var2_int;
                break L11;
              }
              L28: {
                L29: {
                  if (stackIn_164_0 != 0) {
                    break L29;
                  } else {
                    if (null != this.field_vc) {
                      mk.a(true, this.field_vc);
                      this.field_vc = null;
                      if (var9 == 0) {
                        break L28;
                      } else {
                        break L29;
                      }
                    } else {
                      break L28;
                    }
                  }
                }
                if (null == this.field_vc) {
                  this.field_vc = bd.a((byte) 13, (ee) (this), vd.field_b, vd.field_b.field_q);
                  this.field_vc.field_o.g(-1);
                  break L28;
                } else {
                  break L28;
                }
              }
              L30: {
                if (this.field_jc != 0.0f) {
                  break L30;
                } else {
                  if (0.0f == this.field_ic) {
                    break L30;
                  } else {
                    this.field_pb = 0;
                    break L30;
                  }
                }
              }
              L31: {
                if ((bl.field_r.field_ab ^ -1) < -1) {
                  fieldTemp$0 = this.field_pb + 1;
                  this.field_pb = this.field_pb + 1;
                  if (fieldTemp$0 < 25) {
                    break L31;
                  } else {
                    if (ln.a(param0 + -28162, this.field_jc) == ln.a(-29407, this.field_ic)) {
                      this.field_Cb = false;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                } else {
                  break L31;
                }
              }
              L32: {
                if (this.field_Ub > 0) {
                  this.field_Ub = this.field_Ub - 1;
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                this.field_Rb = this.field_Rb + 1;
                if (0 < this.field_ac) {
                  fieldTemp$1 = this.field_ac - 1;
                  this.field_ac = this.field_ac - 1;
                  if (0 != fieldTemp$1) {
                    break L33;
                  } else {
                    this.field_J = -1;
                    break L33;
                  }
                } else {
                  break L33;
                }
              }
              L34: {
                L35: {
                  if (bl.field_r.field_J == 2) {
                    break L35;
                  } else {
                    if (6 != bl.field_r.field_J) {
                      break L34;
                    } else {
                      break L35;
                    }
                  }
                }
                if (bl.field_r.a(this.field_q, false, this.field_A)) {
                  break L34;
                } else {
                  this.a(1.0f, 0, (ja) null, 7);
                  break L34;
                }
              }
              L36: {
                if ((bl.field_r.field_J ^ -1) == -3) {
                  break L36;
                } else {
                  if (6 == bl.field_r.field_J) {
                    break L36;
                  } else {
                    this.field_lc = this.field_lc + (float)this.field_C.field_i / 1500.0f;
                    if ((float)this.field_C.field_i > this.field_lc) {
                      break L36;
                    } else {
                      this.field_lc = (float)this.field_C.field_i;
                      break L36;
                    }
                  }
                }
              }
              L37: {
                this.field_N = this.field_N + 0.05000000074505806f * (this.field_lc - this.field_N);
                if (this.field_W != null) {
                  L38: {
                    this.field_tb = this.field_tb + 1;
                    if (this.field_jb) {
                      break L38;
                    } else {
                      if (-3 == (bl.field_r.field_J ^ -1)) {
                        break L38;
                      } else {
                        L39: {
                          var3 = (float)(-(int)this.field_vb) + this.field_vb;
                          var4 = this.field_zb.a((byte) 127, var3);
                          if (0.5 > (double)this.field_w.a(var4, (byte) -10)) {
                            break L39;
                          } else {
                            this.field_Jb = 0;
                            if (var9 == 0) {
                              break L38;
                            } else {
                              break L39;
                            }
                          }
                        }
                        fieldTemp$2 = this.field_Jb + 1;
                        this.field_Jb = this.field_Jb + 1;
                        if ((fieldTemp$2 ^ -1) > -101) {
                          break L38;
                        } else {
                          if (-101 < (this.field_tb ^ -1)) {
                            break L38;
                          } else {
                            this.field_O = 25;
                            break L38;
                          }
                        }
                      }
                    }
                  }
                  if ((this.field_O ^ -1) >= -1) {
                    break L37;
                  } else {
                    fieldTemp$3 = this.field_O - 1;
                    this.field_O = this.field_O - 1;
                    if (fieldTemp$3 == 0) {
                      this.field_x = 0.0f;
                      this.field_jc = 0.0f;
                      this.field_t = 0.0f;
                      this.field_Y = 0.0f;
                      this.field_wc = 0.0f;
                      this.field_j = 0.0f;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                } else {
                  break L37;
                }
              }
              L40: {
                if (this.field_Q <= 0) {
                  break L40;
                } else {
                  this.field_Q = this.field_Q - 1;
                  break L40;
                }
              }
              L41: {
                this.field_Hb = this.field_Hb + 1;
                this.field_pc = this.field_pc + 1;
                this.g((byte) 124);
                if (param0 == -1245) {
                  break L41;
                } else {
                  discarded$4 = this.c((byte) 19);
                  break L41;
                }
              }
              this.h(param0 + 1292);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L42: {
                this.a(false, false, false, 121, false, false, true);
                if (-3 != (this.field_rc ^ -1)) {
                  break L42;
                } else {
                  L43: {
                    fieldTemp$5 = this.field_L + 1;
                    this.field_L = this.field_L + 1;
                    if (30000 != fieldTemp$5) {
                      break L43;
                    } else {
                      this.b(false);
                      if (var9 == 0) {
                        break L42;
                      } else {
                        break L43;
                      }
                    }
                  }
                  if (29820 > this.field_L) {
                    break L42;
                  } else {
                    this.field_z = false;
                    break L42;
                  }
                }
              }
              this.h(84);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "ja.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(qm param0, int param1, eb[] param2, int param3) {
        eb dupTemp$0 = null;
        eb dupTemp$1 = null;
        eb dupTemp$2 = null;
        eb dupTemp$3 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        float var5_float = 0.0f;
        RuntimeException var5 = null;
        float var6 = 0.0f;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_float = (float)(param0.field_h - param2[param1].field_h);
                        var6 = (float)(param0.field_f - param2[param1].field_f);
                        var7 = -19;
                        if (param3 < (var7 + param1 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = -param1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = 20;
                        if ((var8 + param1 ^ -1) < (param2.length ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = -param1 + param2.length;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = var7;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0 <= var9) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = (float)(-var9) / 20.0f;
                        var11 = 1.0f - (3.0f - var10 * 2.0f) * (var10 * var10);
                        dupTemp$0 = param2[var9 + param1];
                        dupTemp$0.field_h = (int)((float)dupTemp$0.field_h + var5_float * var11);
                        dupTemp$1 = param2[param1 - -var9];
                        dupTemp$1.field_f = (int)((float)dupTemp$1.field_f + var6 * var11);
                        var9++;
                        if (var12 != 0) {
                            statePc = 16;
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
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param2[param1].field_h = param0.field_h;
                        param2[param1].field_f = param0.field_f;
                        param2[param1].field_m = true;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var9 ^ -1) <= (var8 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10 = (float)var9 / 20.0f;
                        var11 = 1.0f - var10 * var10 * (3.0f - 2.0f * var10);
                        dupTemp$2 = param2[var9 + param1];
                        dupTemp$2.field_h = (int)((float)dupTemp$2.field_h + var5_float * var11);
                        dupTemp$3 = param2[var9 + param1];
                        dupTemp$3.field_f = (int)((float)dupTemp$3.field_f + var11 * var6);
                        var9++;
                        if (var12 != 0) {
                            statePc = 32;
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
                        if (var12 == 0) {
                            statePc = 17;
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
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var5);
                    stackIn_24_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("ja.H(");
                    stackIn_24_1 = stackIn_26_1;
                    if (param0 == null) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
                    stackIn_28_1 = stackIn_30_1;
                    if (param2 == null) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw kk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        in stackIn_45_0 = null;
        in stackIn_45_1 = null;
        in stackIn_47_0 = null;
        in stackIn_47_1 = null;
        in stackIn_48_0 = null;
        in stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        float stackIn_89_0 = 0.0f;
        Throwable caughtException = null;
        int statePc = 0;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        in var17_ref_in = null;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29_float = 0.0f;
        int var29 = 0;
        float var30_float = 0.0f;
        int var30 = 0;
        float var31 = 0.0f;
        int var32 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var32 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_jc = this.field_w.field_j * this.field_t + this.field_x * this.field_w.field_g;
                    this.field_Y = this.field_t * this.field_w.field_g - this.field_w.field_j * this.field_x;
                    var2_float = this.field_jc * (this.field_jc * this.field_C.field_m);
                    var3 = var2_float + this.field_C.field_l / this.field_C.field_g * (9.8100004196167f * this.field_C.field_C - this.field_Gb * this.field_C.field_M);
                    var4 = var2_float + this.field_C.field_l / this.field_C.field_g * (this.field_Gb * this.field_C.field_M + 9.8100004196167f * this.field_C.field_j);
                    var5 = (float)Math.atan2((double)(this.field_j * this.field_C.field_j + this.field_Y), (double)Math.abs(this.field_jc)) - this.field_P * ln.a(-29407, this.field_jc);
                    var6 = (float)Math.atan2((double)(-(this.field_C.field_C * this.field_j) + this.field_Y), (double)Math.abs(this.field_jc));
                    if (Math.abs(var5) <= this.field_C.field_F) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var5 = ln.a(-29407, var5) * this.field_C.field_F;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (Math.abs(var6) <= this.field_C.field_F) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var6 = ln.a(-29407, var6) * this.field_C.field_F;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var7 = var3 * (var5 * this.field_C.field_y);
                    var8 = var4 * (var6 * this.field_C.field_y);
                    var9 = 0;
                    if (!this.field_C.field_o) {
                        statePc = 18;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (0.0f == this.field_P) {
                        statePc = 18;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (ln.a(-29407, this.field_P) != ln.a(-29407, this.field_j)) {
                        statePc = 14;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_j = this.field_j * 0.800000011920929f;
                    var9 = 1;
                    if (ln.a(-29407, this.field_P) != ln.a(-29407, this.field_wc)) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_wc = this.field_wc * 0.6000000238418579f;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var10 = this.field_ic * this.field_C.field_s * this.field_C.field_p / this.field_C.field_E;
                    var11 = 0.0f;
                    var11 = Math.abs(var10) * this.field_C.field_q;
                    if (this.field_J != 1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var10 = var10 * (1.0f + this.field_C.field_r * 3.0f);
                    var11 = var10;
                    if (var32 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (2 != this.field_J) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var10 = var10 * (1.0f + this.field_C.field_r * 1.0f);
                    if (var32 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (-3 < (this.field_Fb[1] ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var10 = var10 * (1.0f + 0.800000011920929f * this.field_C.field_r);
                    if (var32 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (1 == this.field_Fb[1]) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var10 = var10 * (0.30000001192092896f * this.field_C.field_r + 1.0f);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (-1 == (bl.field_r.field_J ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (3 != bl.field_r.field_J) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var10 = var10 * this.a((byte) 19);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (!this.field_Cb) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var10 = var10 * 3.0f;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var12 = this.field_C.field_w;
                    var12 = var12 * this.a((byte) 115, oi.field_c);
                    var13 = var4 * (this.field_C.field_I * this.field_xc) * ln.a(-29407, this.field_jc);
                    var14 = 0.0f;
                    var15 = 0.0f;
                    if (this.field_zb.field_o != 0.0f) {
                        statePc = 44;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var16 = 60.0f * (this.field_zb.field_o * (-this.field_C.field_l * 9.8100004196167f));
                    var17_ref_in = this.field_zb.a((byte) 121, (float)(-(int)this.field_vb) + this.field_vb);
                    var15 = var17_ref_in.a(this.field_w, (byte) -10) * var16;
                    stackIn_47_0 = (in) (var17_ref_in);
                    stackIn_45_0 = stackIn_47_0;
                    stackIn_47_1 = this.field_w;
                    stackIn_45_1 = stackIn_47_1;
                    if (param0) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_48_0 = (in) ((Object) stackIn_45_0);
                    stackIn_48_1 = (in) ((Object) stackIn_45_1);
                    stackIn_48_2 = 1;
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = (in) ((Object) stackIn_47_0);
                    stackIn_48_1 = (in) ((Object) stackIn_47_1);
                    stackIn_48_2 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var14 = ((in) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_48_2 != 0) * var16;
                    if (0.0f == this.field_ic) {
                        statePc = 55;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (ln.a(-29407, var15) != ln.a(-29407, var10)) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var14 = 0.0f;
                    var15 = 0.0f;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var16 = var3 * var12;
                    var17 = var12 * var4;
                    var18 = 0;
                    var19 = 0;
                    if (this.field_W == null) {
                        statePc = 83;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (bl.field_r.a(this.field_q, (int)((float)this.field_A.field_h - (float)this.field_C.field_k * this.field_w.field_g + this.field_w.field_j * (float)this.field_C.field_K), -3, (int)(this.field_w.field_g * (float)this.field_C.field_K + ((float)this.field_A.field_f + this.field_w.field_j * (float)this.field_C.field_k)))) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var18++;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (!bl.field_r.a(this.field_q, (int)((float)this.field_C.field_K * this.field_w.field_j + (this.field_w.field_g * (float)this.field_C.field_k + (float)this.field_A.field_h)), -3, (int)((float)this.field_A.field_f - (float)this.field_C.field_k * this.field_w.field_j + (float)this.field_C.field_K * this.field_w.field_g))) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var18++;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (!bl.field_r.a(this.field_q, (int)(-(this.field_w.field_j * (float)this.field_C.field_K) + ((float)this.field_A.field_h - (float)this.field_C.field_k * this.field_w.field_g)), -3, (int)((float)this.field_A.field_f + (float)this.field_C.field_k * this.field_w.field_j - (float)this.field_C.field_K * this.field_w.field_g))) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var19++;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (!bl.field_r.a(this.field_q, (int)(-(this.field_w.field_j * (float)this.field_C.field_K) + ((float)this.field_A.field_h + (float)this.field_C.field_k * this.field_w.field_g)), -3, (int)(-((float)this.field_C.field_K * this.field_w.field_g) + ((float)this.field_A.field_f - (float)this.field_C.field_k * this.field_w.field_j)))) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var19++;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (0 == bl.field_r.field_r) {
                        statePc = 82;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (1 == bl.field_r.field_r) {
                        statePc = 81;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if ((bl.field_r.field_r ^ -1) == -3) {
                        statePc = 80;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var16 = var16 * qf.field_k[var18];
                    var17 = var17 * qf.field_k[var19];
                    if (var32 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var16 = var16 * de.field_J[var18];
                    var17 = var17 * de.field_J[var19];
                    if (var32 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var17 = var17 * qg.field_c[var19];
                    var16 = var16 * qg.field_c[var18];
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    this.field_ec = Math.abs(var7) / var16;
                    if (1.0f >= this.field_ec) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var7 = var16 * ln.a(-29407, var7);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (var9 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackIn_89_0 = 0.0f;
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = var8 * var8;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    var20 = (float)Math.sqrt((double)(stackIn_89_0 + var10 * var10 + var13 * var13));
                    this.field_wb = var20 / var17;
                    if (1.0f < this.field_wb) {
                        statePc = 92;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var21 = var17 / var20;
                    var13 = var13 * var21;
                    var10 = var10 * var21;
                    var8 = var8 * var21;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (Math.abs(var10) >= var11) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var10 = var11 * ln.a(-29407, var10);
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    var21 = (float)Math.cos((double)this.field_P) * this.field_C.field_j * var7 - this.field_C.field_C * var8;
                    this.field_wc = -var21 / this.field_C.field_a;
                    var22 = this.field_C.field_J * (this.field_jc * this.field_jc) * ln.a(-29407, this.field_jc);
                    var23 = 9.8100004196167f * ln.a(-29407, this.field_jc) * this.field_C.field_l * this.field_C.field_n;
                    var24 = var13 + (var23 + var22);
                    var25 = var15 + var10;
                    var26 = var14 + (var8 + (float)Math.cos((double)this.field_P) * var7);
                    var27 = var26 / this.field_C.field_l;
                    this.field_Gb = var25 / this.field_C.field_l;
                    if ((this.field_J ^ -1) != -2) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var28 = -5.0f * ln.a(-29407, this.field_P);
                    var27 = var27 + var28;
                    var29_float = var28 * this.field_C.field_l;
                    var30_float = (3.0f * this.field_C.field_j - this.field_C.field_C) / 4.0f;
                    this.field_wc = this.field_wc + var30_float * var29_float / this.field_C.field_a;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (this.field_jb) {
                        statePc = 100;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (0.0f >= this.field_j) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    this.field_j = 5.0f;
                    if (var32 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    this.field_j = -5.0f;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if ((this.field_M ^ -1) == 0) {
                        statePc = 112;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    fieldTemp$0 = this.field_M - 1;
                    this.field_M = this.field_M - 1;
                    if ((fieldTemp$0 ^ -1) < -1) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    this.field_jb = false;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    this.field_wc = 0.0f;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var28 = -var24 / this.field_C.field_l;
                    var29 = 0;
                    if (ln.a(-29407, var28) == ln.a(-29407, this.field_jc)) {
                        statePc = 118;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (Math.abs(var28 * 0.019999999552965164f) <= Math.abs(this.field_jc)) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var29 = 1;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    this.field_Gb = this.field_Gb + var28;
                    if (Float.isNaN(this.field_Gb)) {
                        statePc = 121;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 121: {
                    throw new RuntimeException((String) null);
                }
                case 122: {
                    var30 = param0 ? 1 : 0;
                    if (ln.a(-29407, this.field_j) == ln.a(-29407, this.field_wc)) {
                        statePc = 127;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (Math.abs(this.field_j) >= Math.abs(this.field_wc * 0.019999999552965164f)) {
                        statePc = 127;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var30 = 1;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    this.field_j = this.field_j + 0.019999999552965164f * this.field_wc;
                    if (!this.field_V) {
                        statePc = 155;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (!this.field_jb) {
                        statePc = 133;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var31 = -this.field_r + this.field_H;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if ((double)var31 <= 3.141592653589793) {
                        statePc = 139;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var31 = (float)((double)var31 - 6.283185307179586);
                    if (var32 != 0) {
                        statePc = 145;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (var32 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (-3.141592653589793 <= (double)var31) {
                        statePc = 144;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var31 = (float)((double)var31 + 6.283185307179586);
                    if (var32 != 0) {
                        statePc = 145;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (var32 == 0) {
                        statePc = 139;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    this.field_r = this.field_r + 5.0f * var31 * 0.019999999552965164f;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (Math.abs(var31) >= 0.5f) {
                        statePc = 151;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (Math.abs(this.field_wc) >= 5.0f) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    this.field_V = false;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    fieldTemp$1 = this.field_T - 1;
                    this.field_T = this.field_T - 1;
                    if (0 >= fieldTemp$1) {
                        statePc = 154;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 154: {
                    this.field_V = false;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    this.field_x = this.field_x + 0.019999999552965164f * (this.field_Gb * this.field_w.field_g + this.field_w.field_j * var27);
                    this.field_t = this.field_t + 0.019999999552965164f * (this.field_w.field_j * this.field_Gb - this.field_w.field_g * var27);
                    if (var29 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 158: {
                    this.field_t = 0.0f;
                    this.field_x = 0.0f;
                    this.field_Gb = 0.0f;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (0.0f != this.field_t) {
                        statePc = 171;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (this.field_x != 0.0f) {
                        statePc = 171;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (var30 != 0) {
                        statePc = 168;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 168: {
                    this.field_j = 0.0f;
                    this.field_wc = 0.0f;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, ee param1) {
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 54) {
                break L1;
              } else {
                this.b(false);
                break L1;
              }
            }
            if (0.0f <= this.field_jc) {
              L2: {
                if (null == param1) {
                  break L2;
                } else {
                  if (100.0f < param1.field_x * param1.field_x + param1.field_t * param1.field_t) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (-11 <= (this.field_pc ^ -1)) {
                  break L3;
                } else {
                  this.field_Hb = 0;
                  break L3;
                }
              }
              L4: {
                this.field_pc = 0;
                if (50 < this.field_Hb) {
                  L5: {
                    stackIn_21_0 = this;

                    if (this.field_Ab) {
                      stackIn_22_0 = this;
                      stackIn_22_1 = 0;
                      break L5;
                    } else {
                      stackIn_22_0 = this;
                      stackIn_22_1 = 1;
                      break L5;
                    }
                  }
                  ((ja) (this)).field_Ab = stackIn_22_1 != 0;
                  this.field_qb = 100;
                  this.f(3);
                  break L4;
                } else {
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("ja.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(byte param0, int param1, eb param2) {
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_19_1 = null;
        int stackIn_29_0 = 0;
        Object stackIn_29_1 = null;
        float stackIn_31_0 = 0.0f;
        Object stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        ei stackIn_53_0 = null;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5_int = 0;
        float var5 = 0.0f;
        in var6 = null;
        ei var6_ref = null;
        eb[] var7 = null;
        int var8_int = 0;
        eb[] var8 = null;
        eb[] var9_ref_eb__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_yc[1] = 30;
                        this.field_yc[3] = -20;
                        this.field_yc[0] = 30;
                        this.field_yc[2] = 30;
                        this.field_yc[this.field_hb] = this.field_yc[this.field_hb] + 30;
                        var4_int = -1;
                        var5_int = 2;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_int < 0) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_11_0 = this.field_hc[var5_int] ^ -1;
                        stackIn_4_0 = stackIn_11_0;
                        if (var11 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4_int = var5_int;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5_int--;
                        if (var11 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = var4_int;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 != -1) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_yc[var4_int] = this.field_yc[var4_int] + 30;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (this.field_hc[1] != this.field_hc[0]) {
                            statePc = 26;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5_int = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var5_int >= 3) {
                            statePc = 26;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_29_0 = var5_int ^ -1;
                        stackIn_19_0 = stackIn_29_0;
                        stackIn_29_1 = this;
                        stackIn_19_1 = stackIn_29_1;
                        if (var11 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 != (((ja) (this)).field_hc[1] ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_yc[var5_int] = this.field_yc[var5_int] + -20;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_int++;
                        if (var11 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (null == param2) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_29_0 = bl.field_r.field_sb.length;
                        stackIn_29_1 = this;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_31_0 = hi.a(stackIn_29_0, ((ja) (this)).field_bb, 1, bl.field_r.field_sb, -24659, param2, param2.field_l);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = this.field_bb;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var5 = stackIn_31_0;
                        if (-1.0f == var5) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return;
                }
                case 35: {
                    try {
                        if (-3 == (bl.field_r.field_J ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((bl.field_r.field_J ^ -1) != -7) {
                            statePc = 49;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-1 == (this.field_G ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var6 = this.field_zb.a((byte) 121, (float)(-(int)this.field_bb) + this.field_bb);
                        stackIn_47_0 = this;
                        stackIn_45_0 = stackIn_47_0;
                        if (0.0 <= (double)this.field_w.a(var6, (byte) -10)) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_48_0 = this;
                        stackIn_48_1 = 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = this;
                        stackIn_48_1 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((ja) (this)).field_ib = stackIn_48_1 != 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (this.field_ib) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_53_0 = this.a(50.0f, var5, (float)param1 * 5.0f, 62);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = this.a(50.0f, false, 5.0f * (float)param1, var5);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var6_ref = stackIn_53_0;
                        this.field_sb = new ei();
                        this.a(param2, (byte) 39, this.field_sb, var6_ref);
                        this.field_gb = this.a(89, (eb[]) (this.field_sb.field_b[0]), this.field_yc);
                        this.field_cc = this.field_gb;
                        this.field_Nb = new int[this.field_sb.field_e];
                        var7 = (eb[]) (this.field_sb.field_b[0]);
                        if (param0 == 41) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        this.field_D = -0.24020713567733765f;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        this.field_Nb[0] = this.field_gb;
                        var8_int = 1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var8_int >= this.field_sb.field_e) {
                            statePc = 67;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var9_ref_eb__ = (eb[]) (this.field_sb.field_b[var8_int]);
                        var10 = this.a(param0 + 51, var9_ref_eb__, this.field_yc);
                        stackIn_68_0 = var10 ^ -1;
                        stackIn_59_0 = stackIn_68_0;
                        stackIn_68_1 = this.field_cc ^ -1;
                        stackIn_59_1 = stackIn_68_1;
                        if (var11 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (stackIn_59_0 <= stackIn_59_1) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_cc = var10;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var10 <= this.field_gb) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var7 = var9_ref_eb__;
                        this.field_gb = var10;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        this.field_Nb[var8_int] = var10;
                        var8_int++;
                        if (var11 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = var7.length;
                        stackIn_68_1 = this.field_G;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var8 = new eb[stackIn_68_0 + stackIn_68_1];
                        var9 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var9 >= this.field_G) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var8[var9] = this.field_sc[var9];
                        var9++;
                        if (var11 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var11 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var9 = 0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var9 >= var7.length) {
                            statePc = 82;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var8[var9 + this.field_G] = var7[var9];
                        var9++;
                        if (var11 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var11 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        this.field_sc = var8;
                        this.field_G = this.field_G + var7.length;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_87_0 = (RuntimeException) (var4);
                    stackIn_85_0 = stackIn_87_0;
                    stackIn_87_1 = new StringBuilder().append("ja.N(").append(param0).append(',').append(param1).append(',');
                    stackIn_85_1 = stackIn_87_1;
                    if (param2 == null) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackIn_88_0 = (RuntimeException) ((Object) stackIn_85_0);
                    stackIn_88_1 = (StringBuilder) ((Object) stackIn_85_1);
                    stackIn_88_2 = "{...}";
                    statePc = 88;
                    continue stateLoop;
                }
                case 87: {
                    stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
                    stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
                    stackIn_88_2 = "null";
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    throw kk.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ')');
                }
                case 89: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(float param0, in param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var17 = 0.0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var25 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = bl.field_r.d((byte) 47) ? 1 : 0;
                        var7 = param2 - -(int)(param0 * param1.field_j);
                        var8 = (int)(param1.field_g * param0) + param4;
                        if (var6_int != 0) {
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
                        stackIn_5_0 = 50;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = 100;
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
                        var9 = stackIn_5_0;
                        qg.a(3, this.field_q, var7, 255, 16777215, bl.field_r.field_O, 5, -204, var8, 0, (byte) 124);
                        var10 = (int)(param0 / (float)var9);
                        var11 = (int)(256.0f * param1.field_j);
                        var12 = -120 % ((-44 - param3) / 57);
                        var13 = (int)(param1.field_g * 256.0f);
                        var14 = 512;
                        var15 = 512;
                        var16 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var10 <= var16) {
                            statePc = 22;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var17 = Math.random() * (double)param0;
                        var19 = param2 + (int)(var17 * (double)param1.field_j);
                        var20 = param4 - -(int)((double)param1.field_g * var17);
                        if (var25 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6_int != 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
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
                case 11: {
                    try {
                        qg.a(0, this.field_q, var19, 255, 16776960, bl.field_r.field_O, 5, -204, var20, 0, (byte) -127);
                        if (var25 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var21 = kj.b(2, 128);
                        var22 = (-var21 + 256) * (16711935 & this.field_Eb) & -16711936 | 16711680 & (-var21 + 256) * (this.field_Eb & 65280);
                        var22 = var22 + (16711680 & 65280 * var21 | -16711936 & var21 * 16711935);
                        var23 = var11 + dg.a(-var14, -1, var14);
                        var24 = dg.a(-var15, -1, var15) + var13;
                        kn.a(var23, var20, -512, 16, 1, -4, var19, this.field_q, bl.field_r.field_q, var22 >>> -1065046232, var24, 255, 4);
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
                        var16++;
                        if (var25 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (runtimeException);
                    stackIn_18_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("ja.DA(").append(param0).append(',');
                    stackIn_18_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw kk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, ei param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        eb[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 <= (param0 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var4_int = param1.field_e;
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var4_int ^ -1) >= (var5 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = (eb[]) (param1.field_b[var5]);
                        this.a(var6, param1, 0);
                        var5++;
                        if (var7 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var4_int ^ -1) != (param1.field_e ^ -1)) {
                            statePc = 12;
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
                    return;
                }
                case 12: {
                    try {
                        this.a(param0 - 1, param1, param2);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (runtimeException);
                    stackIn_15_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("ja.BA(").append(param0).append(',');
                    stackIn_15_1 = stackIn_17_1;
                    if (param1 == null) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_20_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 == (this.field_rc ^ -1)) {
                            statePc = 4;
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
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.d((byte) 99);
                        var2_int = bl.field_r.field_h;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var2_int ^ -1) <= (bl.field_r.field_z ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_20_0 = this;
                        stackIn_8_0 = stackIn_20_0;
                        if (var3 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (this == bl.field_r.field_C[var2_int]) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        bl.field_r.field_C[var2_int] = null;
                        if (var3 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2_int++;
                        if (var3 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
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
                case 17: {
                    try {
                        if (!param0) {
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
                        stackIn_20_0 = this;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.b(true);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw kk.a((Throwable) ((Object) var2), "ja.O(" + param0 + ')');
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, eb[] param1, int[] param2) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        boolean stackIn_53_0 = false;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        boolean stackOut_52_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ah var6 = null;
        wm var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = 0;
                        var5 = param1.length;
                        var6 = bl.field_r.field_cb;
                        var7 = (wm) ((Object) var6.b((byte) 103));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var7 == null) {
                            statePc = 46;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_47_0 = 0;
                        stackIn_4_0 = stackIn_47_0;
                        if (var15 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == (8 & var7.field_J)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = (wm) ((Object) var6.c((byte) 100));
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = 5 + var7.field_B + this.field_C.field_k;
                        var9 = var8 * var8;
                        var10 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var5 <= var10) {
                            statePc = 45;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11 = -param1[var10].field_h + var7.field_A.field_h;
                        var12 = -param1[var10].field_f + var7.field_A.field_f;
                        var13 = var11 * var11 + var12 * var12;
                        stackIn_48_0 = var13 ^ -1;
                        stackIn_13_0 = stackIn_48_0;
                        stackIn_48_1 = var9 ^ -1;
                        stackIn_13_1 = stackIn_48_1;
                        if (var15 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 <= stackIn_13_1) {
                            statePc = 44;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var7.field_J & 1024 ^ -1) == -1) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var7.field_J & 3 ^ -1) != (this.field_mc ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-1 != (512 & var7.field_J ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((262144 & var7.field_J) == 0) {
                            statePc = 38;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var14 = 3 & var7.field_J;
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (-2 == (var14 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4_int -= 200;
                        if (var15 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var4_int += 100;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var15 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var4_int -= 100;
                        if (var15 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var4_int = var4_int + param2[3 & var7.field_J];
                        if (var15 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var4_int -= 250;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7 = (wm) ((Object) var6.c((byte) 90));
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8 = stackIn_47_0;
                        stackIn_48_0 = param0;
                        stackIn_48_1 = 88;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 > stackIn_48_1) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.k(-50);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((var8 ^ -1) <= (param1.length ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = bl.field_r.a(param1[var8].field_l, param1[var8].field_f, true, param1[var8].field_h);
                        stackIn_66_0 = stackOut_52_0 ? 1 : 0;
                        stackIn_53_0 = stackOut_52_0;
                        if (var15 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (!stackIn_53_0) {
                            statePc = 62;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!bl.field_r.a(param1[var8].field_l, param1[var8].field_h, -3, param1[var8].field_f)) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var4_int -= 5;
                        if (var15 == 0) {
                            statePc = 64;
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
                        var4_int -= 1000;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var8++;
                        if (var15 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_66_0 = var4_int;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    return stackIn_66_0;
                }
                case 67: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_70_0 = (RuntimeException) (var4);
                    stackIn_68_0 = stackIn_70_0;
                    stackIn_70_1 = new StringBuilder().append("ja.JA(").append(param0).append(',');
                    stackIn_68_1 = stackIn_70_1;
                    if (param1 == null) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_71_2 = "{...}";
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_71_2 = "null";
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_0 = stackIn_74_0;
                    stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
                    stackIn_72_1 = stackIn_74_1;
                    if (param2 == null) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    throw kk.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= -104) {
                            statePc = 3;
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
                    return;
                }
                case 3: {
                    try {
                        if (3 == bl.field_r.field_r) {
                            statePc = 5;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (bl.field_r.a(this.field_q, param2, -3, param1)) {
                            statePc = 25;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!bl.field_r.a(this.field_q, param1, true, param2)) {
                            statePc = 25;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (50 <= var4_int) {
                            statePc = 25;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = (int)(1024.0f * (-this.field_t * 0.019999999552965164f));
                        var6 = (int)(1024.0f * (-this.field_x * 0.019999999552965164f));
                        var7 = this.field_jc * (-0.5f + (float)Math.random());
                        var8 = 6.0f * this.field_jc * (-0.5f + (float)Math.random());
                        var6 = var6 - (int)(1024.0f * ((this.field_w.field_g * var8 - this.field_w.field_j * var7) * 0.019999999552965164f));
                        var5 = var5 + (int)(1024.0f * ((this.field_w.field_g * var7 + var8 * this.field_w.field_j) * 0.019999999552965164f));
                        if (var10 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((bl.field_r.field_r ^ -1) != -1) {
                            statePc = 17;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9 = 256 * (kj.b(2, 192) - -64);
                        if (var10 == 0) {
                            statePc = 22;
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
                        if ((bl.field_r.field_r ^ -1) == -2) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9 = (128 | kj.b(2, 128)) * 65793;
                        if (var10 == 0) {
                            statePc = 22;
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
                        var9 = 12888928;
                        var9 = var9 + 65792 * kj.b(2, 32);
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
                        kn.a(var5, param1, 0, 16, 1, -16, param2, this.field_q, bl.field_r.field_O, var9, var6, 128, 0);
                        var4_int++;
                        if (var10 == 0) {
                            statePc = 11;
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
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw kk.a((Throwable) ((Object) var4), "ja.G(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void j(int param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (this.field_O > param0) {
                this.k(-1675);
                break L1;
              } else {
                L2: {
                  if (0 != this.field_C.field_G) {
                    break L2;
                  } else {
                    this.a(false);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-2 != (this.field_C.field_G ^ -1)) {
                    break L3;
                  } else {
                    this.c(true);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if ((this.field_C.field_G ^ -1) != -3) {
                    break L4;
                  } else {
                    this.m(2301);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                throw new RuntimeException((String) null);
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "ja.R(" + param0 + ')');
        }
    }

    ja(int param0, int param1, int param2, float param3, float param4, wd param5, dn param6, int param7) {
        super((float)param0, (float)param1, param2, param3);
        RuntimeException runtimeException = null;
        int var9_int = 0;
        int var10 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = HoldTheLine.field_D;
                    this.field_yc = new int[]{0, 0, 0, -20};
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.a(20385, param6);
                        this.field_Ib = param4;
                        this.field_vb = param4;
                        this.field_E = param4;
                        this.field_D = param3;
                        this.field_Mb = param0;
                        this.field_zb = param5;
                        this.field_K = param5;
                        this.field_mb = param1;
                        this.field_ic = 0.0f;
                        this.field_Gb = 0.0f;
                        this.field_x = 0.0f;
                        this.field_Cb = false;
                        this.field_V = false;
                        this.field_t = 0.0f;
                        this.field_xc = 0.0f;
                        this.field_wc = 0.0f;
                        this.field_mc = -1;
                        this.field_j = 0.0f;
                        this.field_W = (int[][]) null;
                        this.field_rc = param7;
                        this.field_P = 0.0f;
                        this.field_q = this.field_zb.field_k;
                        this.field_uc = this.field_zb.field_k;
                        this.field_O = 0;
                        this.field_tb = 0;
                        this.field_L = 0;
                        this.field_T = 0;
                        this.field_Zb = new qm(param0, param1);
                        this.field_Fb = new int[4];
                        this.field_F = false;
                        this.field_db = 0;
                        this.field_hc = new int[3];
                        this.field_Ub = 0;
                        var9_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var9_int >= 3) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_hc[var9_int] = -1;
                        var9_int++;
                        if (var10 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var9_int ^ -1) <= -5) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_Fb[var9_int] = 0;
                        var9_int++;
                        if (var10 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var10 == 0) {
                            statePc = 8;
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
                case 15: {
                    try {
                        this.field_Yb = 0;
                        this.field_qb = 0;
                        this.field_pc = 0;
                        this.field_bc = 0;
                        this.field_Ob = -(int)(this.field_w.field_g * (float)this.field_C.field_K + this.field_w.field_j * (float)this.field_C.field_k) + this.field_A.field_f;
                        this.field_Bb = null;
                        this.field_Lb = 0;
                        this.field_Xb = this.field_A.field_h - (int)(-((float)this.field_C.field_k * this.field_w.field_g) + this.field_w.field_j * (float)this.field_C.field_K);
                        this.field_sc = new eb[32];
                        this.field_xb = 0;
                        this.field_Sb = 0;
                        this.field_Tb = this.field_A.field_f - (int)(-(this.field_w.field_j * (float)this.field_C.field_k) + (float)this.field_C.field_K * this.field_w.field_g);
                        this.field_nb = this.field_A.field_h - (int)(this.field_w.field_j * (float)this.field_C.field_K + this.field_w.field_g * (float)this.field_C.field_k);
                        this.field_G = 0;
                        this.field_Hb = 0;
                        this.field_cb = -1000;
                        this.field_hb = 0;
                        this.field_Ab = true;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (runtimeException);
                    stackIn_18_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("ja.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                    stackIn_18_1 = stackIn_20_1;
                    if (param5 == null) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_0 = stackIn_24_0;
                    stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
                    stackIn_22_1 = stackIn_24_1;
                    if (param6 == null) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw kk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final ei a(float param0, boolean param1, float param2, float param3) {
        int stackIn_16_0 = 0;
        ei stackIn_18_0 = null;
        ei stackIn_33_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wd[] var5 = null;
        RuntimeException var5_ref = null;
        ei var6 = null;
        int var7 = 0;
        float var8 = 0.0f;
        wd var9 = null;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        wd var14 = null;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        var17 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var5 = bl.field_r.field_sb;
              var6 = new ei();
              var7 = (int)param3;
              var8 = (float)(-var7) + param3;
              if ((var7 ^ -1) != (var5.length ^ -1)) {
                break L1;
              } else {
                var7 = 0;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var9 = var5[var7];
                  var10 = var9.f(50);
                  var11 = param0 / var10;
                  if (0.0f >= var8 - var11) {
                    break L4;
                  } else {
                    var8 = var8 - var11;
                    if (var17 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                param0 = param0 + (1.0f - var8) * var10;
                L5: while (true) {
                  L6: {
                    if (var10 > param0) {
                      break L6;
                    } else {
                      param0 = param0 - var10;
                      var7--;
                      stackIn_16_0 = var7;

                      if (var17 != 0) {
                        break L2;
                      } else {
                        L7: {
                          if (stackIn_16_0 < 0) {
                            var7 = -1 + var5.length;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var9 = var5[var7];
                        var10 = var9.f(50);
                        if (var17 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var8 = 1.0f - param0 / var10;
                  break L3;
                }
              }
              this.field_qc = var7;
              stackIn_16_0 = param1 ? 1 : 0;
              break L2;
            }
            if (stackIn_16_0 == 0) {
              L8: {
                L9: {
                  var12 = param2 / var10;
                  if (0.0f < var8 - var12) {
                    break L9;
                  } else {
                    param2 = param2 - var10 * var8;
                    var6.a(hk.a(ao.a(var8, true, var9, 0.0f), 1, false), (byte) 6);
                    var13 = (-1 + (var7 + var5.length)) % var5.length;
                    var14 = var5[var13];
                    var15 = var14.f(50);
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (var15 > param2) {
                            break L12;
                          } else {
                            param2 = param2 - var15;
                            var6.a(hk.a(var14, 1, false), (byte) 6);
                            if (var17 != 0) {
                              break L11;
                            } else {
                              L13: {
                                var13--;
                                if (-1 >= (var13 ^ -1)) {
                                  break L13;
                                } else {
                                  var13 = var5.length + -1;
                                  break L13;
                                }
                              }
                              var14 = var5[var13];
                              var15 = var14.f(50);
                              if (var17 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        this.field_kc = var13;
                        break L11;
                      }
                      var16 = 1.0f - param2 / var15;
                      var6.a(hk.a(ao.a(1.0f, true, var14, var16), 1, false), (byte) 6);
                      if (var17 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                this.field_kc = var7;
                var6.a(hk.a(ao.a(var8, true, var9, -var12 + var8), 1, false), (byte) 6);
                break L8;
              }
              stackIn_33_0 = (ei) (var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_18_0 = (ei) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var5_ref), "ja.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          return stackIn_33_0;
        }
    }

    private final float a(byte param0) {
        float stackIn_21_0 = 0.0f;
        float stackIn_22_0 = 0.0f;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        float stackIn_39_0 = 0.0f;
        float stackIn_40_0 = 0.0f;
        float stackIn_43_0 = 0.0f;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 == 19) {
                break L1;
              } else {
                this.field_yb = (wm) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((this.field_R ^ -1) == -1) {
                  var2_int = 0;
                  L4: while (true) {
                    if ((var2_int ^ -1) <= (bl.field_r.field_h ^ -1)) {
                      break L3;
                    } else {
                      stackIn_25_0 = -2;

                      stackIn_25_1 = bl.field_r.field_C[var2_int].field_R ^ -1;

                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_25_0 == stackIn_25_1) {
                          L5: {
                            var3 = pj.a(bl.field_r.field_sb, (byte) -105, bl.field_r.field_C[var2_int].field_vb, this.field_vb);
                            var3 = (-50.0f + var3) / 200.0f;
                            if (0.0f <= var3) {
                              if (1.0f >= var3) {
                                stackIn_21_0 = var3;
                                break L5;
                              } else {
                                stackIn_21_0 = 1.0f;
                                break L5;
                              }
                            } else {
                              stackIn_21_0 = 0.0f;
                              break L5;
                            }
                          }
                          var3 = stackIn_21_0;
                          stackIn_22_0 = 1.0f - 0.30000001192092896f * var3;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          var2_int++;
                          if (var4 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackIn_25_0 = -1 + bl.field_r.field_h ^ -1;
              stackIn_25_1 = this.field_R ^ -1;
              break L2;
            }
            L6: {
              if (stackIn_25_0 == stackIn_25_1) {
                var2_int = 0;
                L7: while (true) {
                  if ((var2_int ^ -1) <= (bl.field_r.field_h ^ -1)) {
                    break L6;
                  } else {
                    if (-3 == (bl.field_r.field_C[var2_int].field_R ^ -1)) {
                      L8: {
                        var3 = pj.a(bl.field_r.field_sb, (byte) -105, this.field_vb, bl.field_r.field_C[var2_int].field_vb);
                        var3 = (var3 - 50.0f) / 200.0f;
                        if (0.0f <= var3) {
                          if (var3 > 1.0f) {
                            stackIn_39_0 = 1.0f;
                            break L8;
                          } else {
                            stackIn_39_0 = var3;
                            break L8;
                          }
                        } else {
                          stackIn_39_0 = 0.0f;
                          break L8;
                        }
                      }
                      var3 = stackIn_39_0;
                      stackIn_40_0 = 1.0f + 0.2999999523162842f * var3;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var2_int++;
                      if (var4 == 0) {
                        continue L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              } else {
                break L6;
              }
            }
            stackIn_43_0 = 1.0f;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "ja.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_40_0;
          } else {
            return stackIn_43_0;
          }
        }
    }

    private final void m(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        float stackIn_70_0 = 0.0f;
        float stackIn_72_0 = 0.0f;
        float stackIn_73_0 = 0.0f;
        float stackIn_73_1 = 0.0f;
        Throwable caughtException = null;
        int statePc = 0;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        in var21_ref_in = null;
        float var21 = 0.0f;
        int var22 = 0;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        int var34 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var34 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_jc = this.field_w.field_j * this.field_t + this.field_w.field_g * this.field_x;
                    this.field_Y = this.field_t * this.field_w.field_g - this.field_w.field_j * this.field_x;
                    var2_float = this.field_jc * (this.field_C.field_m * this.field_jc);
                    var3 = this.field_jc;
                    var4 = this.field_Y + this.field_C.field_j * this.field_j;
                    var5 = this.field_jc;
                    var6 = this.field_Y - this.field_C.field_C * this.field_j;
                    var7 = (-(this.field_C.field_M * this.field_Gb) + this.field_C.field_C * 9.8100004196167f) * (this.field_C.field_l / this.field_C.field_g) + var2_float;
                    var8 = (this.field_C.field_j * 9.8100004196167f + this.field_C.field_M * this.field_Gb) * (this.field_C.field_l / this.field_C.field_g) + var2_float;
                    var9 = (float)Math.atan2((double)var4, (double)Math.abs(var3)) - this.field_P * ln.a(param0 + -31708, this.field_jc);
                    var10 = (float)Math.atan2((double)var6, (double)Math.abs(var5));
                    if (Math.abs(var9) <= this.field_C.field_F) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var9 = ln.a(param0 ^ -31268, var9) * this.field_C.field_F;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (Math.abs(var10) <= this.field_C.field_F) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var10 = ln.a(-29407, var10) * this.field_C.field_F;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var11 = var9 * this.field_C.field_y * var7;
                    var12 = this.field_C.field_y * var10 * var8;
                    var13 = 0;
                    if (!this.field_C.field_o) {
                        statePc = 17;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (this.field_P == 0.0f) {
                        statePc = 17;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (ln.a(-29407, this.field_P) != ln.a(-29407, this.field_j)) {
                        statePc = 14;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var13 = 1;
                    this.field_j = this.field_j * 0.800000011920929f;
                    if (ln.a(param0 + -31708, this.field_P) == ln.a(-29407, this.field_wc)) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_wc = this.field_wc * 0.6000000238418579f;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var14 = this.field_C.field_p * (this.field_C.field_s * this.field_ic) / this.field_C.field_E;
                    if (1 != this.field_J) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var14 = var14 * (1.0f + 3.0f * this.field_C.field_r);
                    if (var34 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (2 != this.field_J) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var14 = var14 * (1.0f + 1.0f * this.field_C.field_r);
                    if (var34 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (-3 >= (this.field_Fb[1] ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (1 != this.field_Fb[1]) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var14 = var14 * (1.0f + 0.30000001192092896f * this.field_C.field_r);
                    if (var34 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var14 = var14 * (1.0f + this.field_C.field_r * 0.800000011920929f);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (-1 == (bl.field_r.field_J ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (bl.field_r.field_J == 3) {
                        statePc = 37;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var14 = var14 * this.a((byte) 19);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (!this.field_Cb) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var14 = var14 * 3.0f;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var15 = this.field_C.field_e * this.a((byte) 125, oi.field_c);
                    var16 = this.field_C.field_w * this.a((byte) 101, oi.field_c);
                    var17 = var8 * (this.field_xc * this.field_C.field_I) * ln.a(-29407, this.field_jc);
                    var18 = 0.0f;
                    var19 = 0.0f;
                    if (0.0f != this.field_zb.field_o) {
                        statePc = 43;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var20 = 9.8100004196167f * -this.field_C.field_l * this.field_zb.field_o * 60.0f;
                    var21_ref_in = this.field_zb.a((byte) 123, this.field_vb - (float)(int)this.field_vb);
                    var19 = var21_ref_in.a(this.field_w, (byte) -10) * var20;
                    var18 = var21_ref_in.a(this.field_w, true) * var20;
                    if (this.field_ic == 0.0f) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (ln.a(-29407, var19) == ln.a(-29407, var14)) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var19 = 0.0f;
                    var18 = 0.0f;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var20 = var7 * var16;
                    var21 = var15 * var8;
                    var22 = 0;
                    if (bl.field_r.a(this.field_q, (int)((float)this.field_C.field_K * this.field_w.field_j + ((float)this.field_A.field_h - (float)this.field_C.field_k * this.field_w.field_g)), -3, (int)(this.field_w.field_g * (float)this.field_C.field_K + ((float)this.field_C.field_k * this.field_w.field_j + (float)this.field_A.field_f)))) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var22++;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (!bl.field_r.a(this.field_q, (int)((float)this.field_C.field_K * this.field_w.field_j + ((float)this.field_C.field_k * this.field_w.field_g + (float)this.field_A.field_h)), param0 ^ -2304, (int)(this.field_w.field_g * (float)this.field_C.field_K + ((float)this.field_A.field_f - (float)this.field_C.field_k * this.field_w.field_j)))) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var22++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (bl.field_r.field_r == 0) {
                        statePc = 64;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (1 == bl.field_r.field_r) {
                        statePc = 63;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (2 != bl.field_r.field_r) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var20 = var20 * qf.field_k[var22];
                    if (var34 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var20 = var20 * de.field_J[var22];
                    if (var34 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var20 = var20 * qg.field_c[var22];
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    this.field_ec = Math.abs(var11) / var20;
                    if (1.0f < this.field_ec) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var11 = var20 * ln.a(param0 + -31708, var11);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_72_0 = var12 * var12;
                    stackIn_70_0 = stackIn_72_0;
                    if (var13 != 0) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_73_0 = stackIn_70_0;
                    stackIn_73_1 = var14 * var14;
                    statePc = 73;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_73_0 = stackIn_72_0;
                    stackIn_73_1 = 0.0f;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    var23 = (float)Math.sqrt((double)(stackIn_73_0 + stackIn_73_1));
                    this.field_wb = Math.abs(var23) / var21;
                    if (this.field_wb > 1.0f) {
                        statePc = 76;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var12 = var12 / this.field_wb;
                    if (1 == this.field_J) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var14 = var14 / this.field_wb;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var24 = (float)Math.cos((double)this.field_P) * this.field_C.field_j * var11 - var12 * this.field_C.field_C;
                    this.field_wc = -var24 / this.field_C.field_a;
                    var25 = this.field_C.field_J * (this.field_jc * this.field_jc) * ln.a(param0 ^ -31268, this.field_jc);
                    var26 = ln.a(-29407, this.field_jc) * 9.8100004196167f * this.field_C.field_l * this.field_C.field_n;
                    var27 = var17 + (var26 + var25);
                    var28 = -var27 + (var19 + var14);
                    var29 = var12 + (float)Math.cos((double)this.field_P) * var11 + var18;
                    this.field_Gb = var28 / this.field_C.field_l;
                    var30 = -var29 / this.field_C.field_l;
                    if (1 == this.field_J) {
                        statePc = 81;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var31 = -5.0f * ln.a(-29407, this.field_P);
                    var30 = var30 + var31;
                    var32 = var31 * this.field_C.field_l;
                    var33 = (3.0f * this.field_C.field_j - this.field_C.field_C) / 4.0f;
                    this.field_wc = this.field_wc + var33 * var32 / this.field_C.field_a;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (this.field_jb) {
                        statePc = 85;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (-1 == this.field_M) {
                        statePc = 91;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    fieldTemp$0 = this.field_M - 1;
                    this.field_M = this.field_M - 1;
                    if (-1 > (fieldTemp$0 ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    this.field_jb = false;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (0.0f < this.field_j) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    this.field_j = -5.0f;
                    if (var34 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    this.field_j = 5.0f;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    this.field_wc = 0.0f;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (!Float.isNaN(this.field_Gb)) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    throw new RuntimeException((String) null);
                }
                case 101: {
                    if (!this.field_V) {
                        statePc = 129;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (!this.field_jb) {
                        statePc = 107;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var31 = this.field_H - this.field_r;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (3.141592653589793 >= (double)var31) {
                        statePc = 113;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var31 = (float)((double)var31 - 6.283185307179586);
                    if (var34 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (var34 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (-3.141592653589793 <= (double)var31) {
                        statePc = 118;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var31 = (float)((double)var31 + 6.283185307179586);
                    if (var34 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (var34 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    this.field_r = this.field_r + var31 * 5.0f * 0.019999999552965164f;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (0.5f <= Math.abs(var31)) {
                        statePc = 125;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (5.0f <= Math.abs(this.field_wc)) {
                        statePc = 125;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_V = false;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    fieldTemp$1 = this.field_T - 1;
                    this.field_T = this.field_T - 1;
                    if ((fieldTemp$1 ^ -1) >= -1) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    this.field_V = false;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (param0 == 2301) {
                        statePc = 132;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    ja.i(-82);
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var31 = this.field_jc + 0.019999999552965164f * this.field_Gb;
                    var32 = this.field_Y + var30 * 0.019999999552965164f;
                    var33 = this.field_j + this.field_wc * 0.019999999552965164f;
                    if (0.0f == this.field_jc) {
                        statePc = 139;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (ln.a(-29407, var31) == ln.a(-29407, this.field_jc)) {
                        statePc = 139;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    this.field_jc = 0.0f;
                    this.field_Gb = 0.0f;
                    if (var34 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    this.field_jc = var31;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (0.0f == this.field_Y) {
                        statePc = 146;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (ln.a(-29407, var32) == ln.a(param0 ^ -31268, this.field_Y)) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var30 = 0.0f;
                    this.field_Y = 0.0f;
                    if (var34 == 0) {
                        statePc = 148;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    this.field_Y = var32;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (0.0f == this.field_j) {
                        statePc = 152;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (ln.a(-29407, var33) != ln.a(-29407, this.field_j)) {
                        statePc = 155;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    this.field_j = var33;
                    if (var34 == 0) {
                        statePc = 157;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    this.field_j = 0.0f;
                    this.field_wc = 0.0f;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    this.field_x = this.field_jc * this.field_w.field_g - this.field_Y * this.field_w.field_j;
                    this.field_t = this.field_jc * this.field_w.field_j + this.field_Y * this.field_w.field_g;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, boolean param1, boolean param2, int param3, boolean param4, boolean param5, boolean param6) {
        float stackIn_4_0 = 0.0f;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        float stackIn_8_1 = 0.0f;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        float stackIn_22_1 = 0.0f;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        float stackIn_26_2 = 0.0f;
        Object stackIn_30_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        float stackIn_33_1 = 0.0f;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        float stackIn_37_2 = 0.0f;
        Object stackIn_42_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        float stackIn_50_1 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float var8_float = 0.0f;
        RuntimeException var8 = null;
        float var9 = 0.0f;
        try {
          L0: {
            L1: {
              var8_float = Math.abs(this.field_jc);
              if (var8_float >= this.field_C.field_B) {
                stackIn_4_0 = this.field_C.field_f;
                break L1;
              } else {
                stackIn_4_0 = (-var8_float + this.field_C.field_B) / this.field_C.field_B * (-this.field_C.field_f + this.field_C.field_x) + this.field_C.field_f;
                break L1;
              }
            }
            L2: {
              var9 = stackIn_4_0;
              stackIn_7_0 = this;

              if (!param6) {
                stackIn_8_0 = this;
                stackIn_8_1 = 0.0f;
                break L2;
              } else {
                stackIn_8_0 = this;
                stackIn_8_1 = 1.0f;
                break L2;
              }
            }
            L3: {
              ((ja) (this)).field_xc = stackIn_8_1;
              if (param3 > 108) {
                break L3;
              } else {
                this.a(true, true, false, -21, true, false, true);
                break L3;
              }
            }
            L4: {
              L5: {
                this.field_nc = param2;
                if (-1 == (this.field_Q ^ -1)) {
                  break L5;
                } else {
                  L6: {
                    this.field_P = this.field_C.field_x * (float)(50 + -this.field_Q) / 50.0f;
                    if (this.field_P > var9) {
                      this.field_P = var9;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    stackIn_21_0 = this;

                    if (param5) {
                      stackIn_22_0 = this;
                      stackIn_22_1 = -1.0f;
                      break L7;
                    } else {
                      stackIn_22_0 = this;
                      stackIn_22_1 = 0.0f;
                      break L7;
                    }
                  }
                  L8: {
                    stackIn_25_0 = this;

                    if (param0) {
                      stackIn_26_0 = this;

                      stackIn_26_2 = 1.0f;
                      break L8;
                    } else {
                      stackIn_26_0 = this;

                      stackIn_26_2 = 0.0f;
                      break L8;
                    }
                  }
                  ((ja) (this)).field_P = (stackIn_22_1 + stackIn_26_2) * this.field_P;
                  if (HoldTheLine.field_D == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L9: {
                stackIn_32_0 = this;

                if (param0) {
                  stackIn_33_0 = this;
                  stackIn_33_1 = 1.0f;
                  break L9;
                } else {
                  stackIn_30_0 = this;
                  stackIn_33_0 = this;
                  stackIn_33_1 = 0.0f;
                  break L9;
                }
              }
              L10: {
                stackIn_36_0 = this;

                if (param5) {
                  stackIn_37_0 = this;

                  stackIn_37_2 = -1.0f;
                  break L10;
                } else {
                  stackIn_37_0 = this;

                  stackIn_37_2 = 0.0f;
                  break L10;
                }
              }
              ((ja) (this)).field_P = (stackIn_33_1 + stackIn_37_2) * var9;
              break L4;
            }
            L11: {
              stackIn_49_0 = this;

              if (param6) {
                stackIn_50_0 = this;
                stackIn_50_1 = 0.0f;
                break L11;
              } else {
                stackIn_48_0 = this;

                if (param1) {
                  stackIn_50_0 = this;
                  stackIn_50_1 = 1.0f;
                  break L11;
                } else {
                  stackIn_42_0 = this;
                  stackIn_47_0 = this;

                  if (param4) {
                    stackIn_50_0 = this;
                    stackIn_50_1 = -1.0f;
                    break L11;
                  } else {
                    stackIn_45_0 = this;
                    stackIn_50_0 = this;
                    stackIn_50_1 = 0.0f;
                    break L11;
                  }
                }
              }
            }
            L12: {
              ((ja) (this)).field_ic = stackIn_50_1;
              if (param2) {
                break L12;
              } else {
                if (null != this.field_W) {
                  this.field_F = false;
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              L14: {
                if (0 == bl.field_r.field_J) {
                  break L14;
                } else {
                  if ((bl.field_r.field_J ^ -1) != -4) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              if (0 == (bl.field_r.field_B ^ -1)) {
                break L13;
              } else {
                if (bl.field_r.field_T) {
                  break L13;
                } else {
                  if (this.field_bc > bl.field_r.field_B) {
                    this.field_nc = false;
                    this.field_ic = 0.0f;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
            }
            L15: {
              if (this.field_jb) {
                this.field_P = 0.0f;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (1 != this.field_J) {
                break L16;
              } else {
                this.field_ic = 1.0f;
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var8), "ja.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void i(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_Wb = (mf) null;
                break L1;
              }
            }
            field_Db = null;
            field_Wb = null;
            field_Qb = null;
            field_U = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "ja.Q(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                this.f((byte) -76);
                break L1;
              }
            }
            this.field_G = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "ja.LA(" + param0 + ')');
        }
    }

    private final void a(byte param0, eb[] param1, boolean param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        float stackIn_65_0 = 0.0f;
        float stackIn_69_0 = 0.0f;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        ja[] var5 = null;
        RuntimeException var5_ref = null;
        qm var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ja var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        float var13 = 0.0f;
        int var14_int = 0;
        float var14 = 0.0f;
        int var15_int = 0;
        float var15 = 0.0f;
        int var16_int = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        int var22 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-2 > (param3 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (param0 >= 79) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var5 = bl.field_r.field_C;
                        var6 = new qm(0, 0);
                        var7 = 1;
                        var8 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = 5;
                        stackIn_7_1 = var8;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 <= stackIn_7_1) {
                            statePc = 92;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var22 != 0) {
                            statePc = 92;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var9 >= bl.field_r.field_z) {
                            statePc = 79;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_7_0 = this.field_mc ^ -1;
                        stackIn_12_0 = stackIn_7_0;
                        stackIn_7_1 = var9 ^ -1;
                        stackIn_12_1 = stackIn_7_1;
                        if (var22 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 == stackIn_12_1) {
                            statePc = 76;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = var5[var9];
                        if (var10 != null) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var22 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-var10.field_q + this.field_q > 1) {
                            statePc = 76;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-var10.field_q + this.field_q < -1) {
                            statePc = 76;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var11 = 0;
                        var12 = -1;
                        var13_int = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((param3 ^ -1) >= (var13_int ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var14_int = -param1[var13_int].field_h + (int)var10.field_y;
                        var15_int = (int)var10.field_u + -param1[var13_int].field_f;
                        var16_int = var14_int * var14_int + var15_int * var15_int;
                        stackIn_37_0 = var11 ^ -1;
                        stackIn_26_0 = stackIn_37_0;
                        stackIn_37_1 = var16_int ^ -1;
                        stackIn_26_1 = stackIn_37_1;
                        if (var22 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 < stackIn_26_1) {
                            statePc = 34;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (0 == (var12 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var11 = var16_int;
                        var12 = var13_int;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var13_int++;
                        if (var22 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = var10.field_C.field_K + this.field_C.field_k;
                        stackIn_37_1 = 5;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var13 = (float)(stackIn_37_0 + stackIn_37_1);
                        var14 = (float)(5 + this.field_C.field_k - -var10.field_C.field_k);
                        var15 = (float)(-param1[var12].field_h) + var10.field_y;
                        var16 = var10.field_u - (float)param1[var12].field_f;
                        var17 = var10.field_w.field_j * var15 + var16 * var10.field_w.field_g;
                        var18 = -(var10.field_w.field_j * var16) + var15 * var10.field_w.field_g;
                        if (param2) {
                            statePc = 50;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var17 <= -var13) {
                            statePc = 50;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var13 <= var17) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (-var14 >= var18) {
                            statePc = 50;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var14 > var18) {
                            statePc = 59;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (!param2) {
                            statePc = 76;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (8100 > var11) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var6.field_h = var10.field_A.field_h;
                        var6.field_f = var10.field_A.field_f;
                        var7 = 0;
                        this.a(var6, var12, param1, -1);
                        if (var22 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (-1 != (var12 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_65_0 = (float)(param1[1].field_h + -param1[0].field_h);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = (float)(param1[var12].field_h - param1[-1 + var12].field_h);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var19 = stackIn_65_0;
                        if (-1 == (var12 ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_69_0 = (float)(-param1[var12 - 1].field_f + param1[var12].field_f);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = (float)(-param1[0].field_f + param1[1].field_f);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var20 = stackIn_69_0;
                        var21 = (float)Math.sqrt((double)(var20 * var20 + var19 * var19));
                        var20 = var20 / var21;
                        var19 = var19 / var21;
                        if (var20 * var15 - var19 * var16 >= 0.0f) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var6.field_h = (int)(var20 * (var14 + 10.0f - 5.0f) + var10.field_y);
                        var6.field_f = (int)(-((var14 + 10.0f - 5.0f) * var19) + var10.field_u);
                        if (var22 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var6.field_h = (int)(-(var20 * (var14 + 10.0f - 5.0f)) + var10.field_y);
                        var6.field_f = (int)((-5.0f + (var14 + 10.0f)) * var19 + var10.field_u);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var7 = 0;
                        this.a(var6, var12, param1, -1);
                        if (var22 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var9++;
                        if (var22 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var7 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var22 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var8++;
                        if (var22 == 0) {
                            statePc = 6;
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
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_90_0 = (RuntimeException) (var5_ref);
                    stackIn_88_0 = stackIn_90_0;
                    stackIn_90_1 = new StringBuilder().append("ja.CA(").append(param0).append(',');
                    stackIn_88_1 = stackIn_90_1;
                    if (param1 == null) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackIn_91_0 = (RuntimeException) ((Object) stackIn_88_0);
                    stackIn_91_1 = (StringBuilder) ((Object) stackIn_88_1);
                    stackIn_91_2 = "{...}";
                    statePc = 91;
                    continue stateLoop;
                }
                case 90: {
                    stackIn_91_0 = (RuntimeException) ((Object) stackIn_90_0);
                    stackIn_91_1 = (StringBuilder) ((Object) stackIn_90_1);
                    stackIn_91_2 = "null";
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    throw kk.a((Throwable) ((Object) stackIn_91_0), stackIn_91_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 92: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final float a(byte param0, float[] param1) {
        RuntimeException var3 = null;
        float stackIn_5_0 = 0.0f;
        float stackIn_8_0 = 0.0f;
        float stackIn_10_0 = 0.0f;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 96) {
                break L1;
              } else {
                this.a((byte) -121, (eb[]) null, false, -122);
                break L1;
              }
            }
            if (-3 != (this.field_J ^ -1)) {
              if (3 == this.field_Fb[2]) {
                stackIn_10_0 = param1[2];
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = param1[this.field_Fb[2]];
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = param1[3];
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ja.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final void b(byte param0) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        int stackIn_246_0 = 0;
        int stackIn_246_1 = 0;
        int stackIn_253_0 = 0;
        int stackIn_253_1 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        int stackIn_269_0 = 0;
        int stackIn_269_1 = 0;
        int stackIn_282_0 = 0;
        int stackIn_282_1 = 0;
        int stackIn_295_0 = 0;
        int stackIn_295_1 = 0;
        int stackIn_323_0 = 0;
        int stackIn_323_1 = 0;
        int stackIn_325_0 = 0;
        int stackIn_340_0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        sg var2 = null;
        RuntimeException var2_ref = null;
        float var3 = 0.0f;
        sg var4_ref_sg = null;
        int var4_int = 0;
        float var4 = 0.0f;
        int var5_int = 0;
        float var5 = 0.0f;
        ja var6_ref_ja = null;
        int var6_int = 0;
        float var6 = 0.0f;
        ja var7_ref_ja = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var2 = bl.field_r;
                    var3 = hi.a(4, this.field_Ib, 1, var2.field_sb, -24659, this.field_A, this.field_q);
                    if (-1.0f == var3) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = hi.a(var2.field_sb.length, this.field_Ib, 0, var2.field_sb, -24659, this.field_A, this.field_q);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (param0 >= 14) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.j(88);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var3 != -1.0f) {
                        statePc = 11;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-1.0f != this.field_vb) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.f(3);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    this.field_vb = var3;
                    if (this.field_vb != (float)var2.field_sb.length) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_zb = var2.field_sb[0];
                    if (var12 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_zb = var2.field_sb[(int)this.field_vb];
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    this.field_q = this.field_zb.field_k;
                    if (this.field_Ib == -1.0f) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_Ib = this.field_vb;
                    this.field_Lb = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (this.field_vb <= this.field_Ib) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (this.field_vb - this.field_Ib >= 2.0f) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_Ib = this.field_vb;
                    this.field_bb = this.field_vb;
                    this.field_Lb = 0;
                    this.field_xb = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (this.field_bb >= this.field_vb) {
                        statePc = 37;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (this.field_vb - this.field_bb < 2.0f) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_bb = this.field_vb;
                    this.field_xb = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (2.0f > -this.field_Ib + (this.field_vb + (float)var2.field_sb.length)) {
                        statePc = 40;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (-2 == (this.field_bc ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((this.field_X ^ -1) <= (this.field_ab ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    this.field_ab = this.field_X;
                    if (this.field_W == null) {
                        statePc = 59;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var2.field_E) {
                        statePc = 59;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if ((var2.field_J ^ -1) == -1) {
                        statePc = 58;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (1 == var2.field_J) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    jf.a(this.field_ab, cf.field_w, (byte) 62, vg.field_P);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    this.field_bc = this.field_bc + 1;
                    if (0 != var2.field_J) {
                        statePc = 197;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if ((var2.field_B ^ -1) <= (this.field_bc ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.field_Pb = var2.field_ab;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (this.field_mc != 0) {
                        statePc = 91;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var4_ref_sg = var2;
                    if (0 != (var4_ref_sg.field_H & 1048576)) {
                        statePc = 70;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_l * var4_ref_sg.field_p << 1400882004);
                    if (var12 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 1148917268);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 1048576;
                    if ((var4_ref_sg.field_H & 1048576) == 1048576) {
                        statePc = 75;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if ((var4_ref_sg.field_H & 4) == 0) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 1512267682);
                    if (var12 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_p * var4_ref_sg.field_l << -626691966);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 4;
                    if (-5 == (4 & var4_ref_sg.field_H ^ -1)) {
                        statePc = 84;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (-1 != (var4_ref_sg.field_H & 1073741824 ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_p * var4_ref_sg.field_l << -750363138);
                    if (var12 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 654258878);
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 1073741824;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (1 == this.field_mc) {
                        statePc = 94;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var4_ref_sg = var2;
                    if ((var4_ref_sg.field_H & 65536) == 0) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_p * var4_ref_sg.field_l << -178799248);
                    if (var12 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_p * var4_ref_sg.field_l << -719799888);
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 65536;
                    if ((65536 & var4_ref_sg.field_H) == 65536) {
                        statePc = 103;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if ((128 & var4_ref_sg.field_H) != 0) {
                        statePc = 107;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_l * var4_ref_sg.field_p << -1596438137);
                    if (var12 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_p * var4_ref_sg.field_l << -1824337145);
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 128;
                    if (128 == (var4_ref_sg.field_H & 128)) {
                        statePc = 112;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if ((4194304 & var4_ref_sg.field_H) != 0) {
                        statePc = 116;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_l * var4_ref_sg.field_p << -1563665898);
                    if (var12 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 554646678);
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 4194304;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if ((this.field_mc ^ -1) == -3) {
                        statePc = 122;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var4_ref_sg = var2;
                    if ((var4_ref_sg.field_H & 32768) != 0) {
                        statePc = 126;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_l * var4_ref_sg.field_p << 539727471);
                    if (var12 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_p * var4_ref_sg.field_l << -206168241);
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 32768;
                    if ((var4_ref_sg.field_H & 32768) == 32768) {
                        statePc = 131;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (-1 == (8388608 & var4_ref_sg.field_H ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << -510235721);
                    if (var12 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_p * var4_ref_sg.field_l << -374812073);
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 8388608;
                    if ((8388608 & var4_ref_sg.field_H ^ -1) == -1) {
                        statePc = 140;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if ((1024 & var4_ref_sg.field_H ^ -1) != -1) {
                        statePc = 144;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_l * var4_ref_sg.field_p << 635252298);
                    if (var12 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_p * var4_ref_sg.field_l << 2065077258);
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 1024;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (3 == this.field_mc) {
                        statePc = 150;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var4_ref_sg = var2;
                    if ((-2147483648 & var4_ref_sg.field_H) != 0) {
                        statePc = 154;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_l * var4_ref_sg.field_p << -1325872961);
                    if (var12 == 0) {
                        statePc = 156;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 499854463);
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ -2147483648;
                    if (-1 != (-2147483648 & var4_ref_sg.field_H ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (-1 == (var4_ref_sg.field_H & 262144 ^ -1)) {
                        statePc = 163;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << -34890318);
                    if (var12 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_l * var4_ref_sg.field_p << 1578277202);
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 262144;
                    if (0 != (262144 & var4_ref_sg.field_H)) {
                        statePc = 175;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (0 == (var4_ref_sg.field_H & 4096)) {
                        statePc = 172;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 997443148);
                    if (var12 == 0) {
                        statePc = 174;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_l * var4_ref_sg.field_p << 962631596);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 4096;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (this.field_W == null) {
                        statePc = 197;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (var2.field_E) {
                        statePc = 197;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (0 == var2.field_r) {
                        statePc = 191;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    dupTemp$0 = var2.field_rb[6] + 1;
                    var2.field_rb[6] = dupTemp$0;
                    if (-4 >= (dupTemp$0 ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var2.a(6, 249, (byte) -47);
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    dupTemp$1 = var2.field_rb[7] + 1;
                    var2.field_rb[7] = dupTemp$1;
                    if (dupTemp$1 < 3) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var2.a(7, 248, (byte) -72);
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if ((var2.field_B ^ -1) != (this.field_bc ^ -1)) {
                        statePc = 197;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (this.field_R != var2.field_h - 1) {
                        statePc = 197;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var2.field_rb[12] = 1;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    this.field_Lb = 0;
                    this.field_xb = 0;
                    this.field_X = 0;
                    this.field_Ib = this.field_vb;
                    this.field_bb = this.field_vb;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if (this.field_vb + (float)var2.field_sb.length - this.field_bb < 2.0f) {
                        statePc = 201;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 201: {
                    this.field_xb = 0;
                    this.field_bb = this.field_vb;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    this.field_xb = this.field_xb + 1;
                    if (null != bl.field_r.field_i) {
                        statePc = 209;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if (this.field_xb >= 200) {
                        statePc = 208;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 208: {
                    this.field_xb = 0;
                    this.field_bb = this.field_vb;
                    if (var12 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (-51 < (this.field_xb ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    this.f(3);
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    this.field_Lb = this.field_Lb + 1;
                    if (var2.field_J == 0) {
                        statePc = 263;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (var2.field_J == 2) {
                        statePc = 250;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (-4 != (var2.field_J ^ -1)) {
                        statePc = 313;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (0 == (var2.field_B ^ -1)) {
                        statePc = 229;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (var2.field_B >= this.field_bc) {
                        statePc = 229;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 229: {
                    var4_int = 0;
                    var5_int = 0;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if ((var5_int ^ -1) <= (var2.field_h ^ -1)) {
                        statePc = 245;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var6_ref_ja = var2.field_C[var5_int];
                    stackIn_246_0 = this.field_bc ^ -1;
                    stackIn_232_0 = stackIn_246_0;
                    stackIn_246_1 = var6_ref_ja.field_bc ^ -1;
                    stackIn_232_1 = stackIn_246_1;
                    if (var12 != 0) {
                        statePc = 246;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (stackIn_232_0 > stackIn_232_1) {
                        statePc = 243;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (this.field_bc != var6_ref_ja.field_bc) {
                        statePc = 244;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (this.field_Ib < var6_ref_ja.field_Ib) {
                        statePc = 243;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var4_int++;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    var5_int++;
                    if (var12 == 0) {
                        statePc = 230;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    stackIn_246_0 = this.field_R ^ -1;
                    stackIn_246_1 = var4_int ^ -1;
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    if (stackIn_246_0 == stackIn_246_1) {
                        statePc = 249;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    this.field_ob = 0;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    this.field_R = var4_int;
                    if (var12 == 0) {
                        statePc = 313;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    var4_int = 0;
                    var5_int = 0;
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    if ((var5_int ^ -1) <= (var2.field_h ^ -1)) {
                        statePc = 258;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var6_ref_ja = var2.field_C[var5_int];
                    stackIn_259_0 = this.field_Sb;
                    stackIn_253_0 = stackIn_259_0;
                    stackIn_259_1 = var6_ref_ja.field_Sb;
                    stackIn_253_1 = stackIn_259_1;
                    if (var12 != 0) {
                        statePc = 259;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (stackIn_253_0 >= stackIn_253_1) {
                        statePc = 257;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var4_int++;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    var5_int++;
                    if (var12 == 0) {
                        statePc = 251;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    stackIn_259_0 = this.field_R ^ -1;
                    stackIn_259_1 = var4_int ^ -1;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    if (stackIn_259_0 != stackIn_259_1) {
                        statePc = 261;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 261: {
                    this.field_ob = 0;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    this.field_R = var4_int;
                    if (var12 == 0) {
                        statePc = 313;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if ((var2.field_B ^ -1) > (this.field_bc ^ -1)) {
                        statePc = 313;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var4_int = 0;
                    var5_int = 0;
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    if (var2.field_h <= var5_int) {
                        statePc = 281;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var6_ref_ja = var2.field_C[var5_int];
                    stackIn_282_0 = var6_ref_ja.field_bc;
                    stackIn_269_0 = stackIn_282_0;
                    stackIn_282_1 = this.field_bc;
                    stackIn_269_1 = stackIn_282_1;
                    if (var12 != 0) {
                        statePc = 282;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (stackIn_269_0 > stackIn_269_1) {
                        statePc = 278;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    if ((this.field_bc ^ -1) != (var6_ref_ja.field_bc ^ -1)) {
                        statePc = 280;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (var6_ref_ja.field_Ib <= this.field_Ib) {
                        statePc = 280;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    var4_int++;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    var5_int++;
                    if (var12 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    stackIn_282_0 = this.field_R;
                    stackIn_282_1 = var4_int;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    if (stackIn_282_0 != stackIn_282_1) {
                        statePc = 284;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 284: {
                    this.field_ob = 0;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    this.field_R = var4_int;
                    if (var2.field_E) {
                        statePc = 313;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (0 == (var2.field_rb[14] ^ -1)) {
                        statePc = 313;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (-1 != (this.field_mc ^ -1)) {
                        statePc = 313;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var5_int = 1;
                    var6_int = 0;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (var2.field_h <= var6_int) {
                        statePc = 309;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    stackIn_323_0 = var6_int;
                    stackIn_295_0 = stackIn_323_0;
                    stackIn_323_1 = this.field_mc;
                    stackIn_295_1 = stackIn_323_1;
                    if (var12 != 0) {
                        statePc = 323;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (stackIn_295_0 == stackIn_295_1) {
                        statePc = 308;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var7_ref_ja = var2.field_C[var6_int];
                    if (var7_ref_ja.field_Ib <= this.field_Ib) {
                        statePc = 302;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    if ((2 + var7_ref_ja.field_bc ^ -1) == (this.field_bc ^ -1)) {
                        statePc = 307;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if ((this.field_bc ^ -1) > (2 + var7_ref_ja.field_bc ^ -1)) {
                        statePc = 307;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var5_int = 0;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    var6_int++;
                    if (var12 == 0) {
                        statePc = 293;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    if (var5_int != 0) {
                        statePc = 312;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 312: {
                    var2.a(14, 241, (byte) 114);
                    var2.field_rb[14] = -1;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if (this.field_W == null) {
                        statePc = 322;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    if (!bl.field_r.a(this.field_q, false, this.field_A)) {
                        statePc = 319;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var2.field_rb[7] = -1;
                    var4_ref_sg = var2;
                    if ((16384 & var4_ref_sg.field_H) != 16384) {
                        statePc = 322;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 16384;
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_p * var4_ref_sg.field_l << -562034354);
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    stackIn_323_0 = -2;
                    stackIn_323_1 = this.field_G ^ -1;
                    statePc = 323;
                    continue stateLoop;
                }
                case 323: {
                    if (stackIn_323_0 <= stackIn_323_1) {
                        statePc = 339;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    var4 = (float)(-this.field_sc[0].field_h + this.field_sc[1].field_h);
                    var5 = (float)(-this.field_sc[0].field_f + this.field_sc[1].field_f);
                    var6 = (float)Math.sqrt((double)(var4 * var4 + var5 * var5));
                    var5 = var5 / var6;
                    var4 = var4 / var6;
                    var7 = -this.field_y + (float)this.field_sc[0].field_h;
                    var8 = (float)this.field_sc[0].field_f - this.field_u;
                    var9 = var5 * var8 + var7 * var4;
                    var10 = var7 * var5 - var8 * var4;
                    stackIn_340_0 = (var9 < 0.0f ? -1 : (var9 == 0.0f ? 0 : 1));
                    stackIn_325_0 = stackIn_340_0;
                    if (var12 != 0) {
                        statePc = 340;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if (stackIn_325_0 <= 0) {
                        statePc = 331;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (var9 > 2.0f * Math.abs(var10)) {
                        statePc = 339;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var11 = 0;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    if ((this.field_G - 1 ^ -1) >= (var11 ^ -1)) {
                        statePc = 337;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    this.field_sc[var11] = this.field_sc[var11 + 1];
                    var11++;
                    if (var12 != 0) {
                        statePc = 338;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if (var12 == 0) {
                        statePc = 332;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    this.field_G = this.field_G - 1;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (var12 == 0) {
                        statePc = 322;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    stackIn_340_0 = 1;
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    if (stackIn_340_0 == this.field_G) {
                        statePc = 343;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 343: {
                    this.f(3);
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    this.field_X = this.field_X + 1;
                    this.field_ob = this.field_ob + 1;
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final float a(eb[] param0, byte param1, float param2) {
        float stackIn_13_1 = 0.0f;
        float stackIn_19_0 = 0.0f;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        float var24 = 0.0f;
        int var25 = 0;
        var25 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var4_float = 3.4028234663852886e+38f;
              var5 = 0.0f;
              var6 = param0[0].field_h;
              var7 = param0[0].field_f;
              if (param1 < -108) {
                break L1;
              } else {
                field_Db = (hj[]) null;
                break L1;
              }
            }
            var8 = param0[1].field_h;
            var9 = param0[1].field_f;
            var10 = (float)((var8 + -var6) / 2);
            var11 = (float)((-var7 + var9) / 2);
            var12 = (float)Math.sqrt((double)(var10 * var10 + var11 * var11));
            var13 = var10 / var12;
            var14 = var11 / var12;
            var5 = param2 * var12;
            var21 = 1;
            L2: while (true) {
              L3: {
                L4: {
                  if (var21 >= param0.length + -1) {
                    break L4;
                  } else {
                    var22 = param0[1 + var21].field_h;
                    var15 = (float)((var22 - var8) / 2);
                    var23 = param0[1 + var21].field_f;
                    var16 = (float)((-var9 + var23) / 2);
                    var17 = (float)Math.sqrt((double)(var15 * var15 + var16 * var16));
                    var19 = var16 / var17;
                    var18 = var15 / var17;
                    var20 = Math.abs((var19 + var14) / (var13 - var18));
                    stackIn_19_0 = var20;

                    if (var25 != 0) {
                      break L3;
                    } else {
                      L5: {


                        if (var17 <= var12) {

                          stackIn_13_1 = var17;
                          break L5;
                        } else {

                          stackIn_13_1 = var12;
                          break L5;
                        }
                      }
                      L6: {
                        var20 = stackIn_19_0 * stackIn_13_1;
                        var24 = this.field_C.field_A * (float)Math.sqrt((double)var20) + var5;
                        if (var4_float > var24) {
                          var4_float = var24;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var6 = var8;
                      var7 = var9;
                      var5 = var5 + var17 * param2;
                      var9 = var23;
                      var13 = var18;
                      var14 = var19;
                      var11 = var16;
                      var10 = var15;
                      var8 = var22;
                      var12 = var17;
                      var21++;
                      if (var25 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_19_0 = var4_float;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("ja.KA(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    private final void h(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        float var3_float = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        float var7_float = 0.0f;
        int var8 = 0;
        wm var8_ref_wm = null;
        float var8_float = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        float var14 = 0.0f;
        int var15 = 0;
        hj var16 = null;
        int var17 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_1 = 0;
        float stackIn_43_0 = 0.0f;
        float stackIn_44_0 = 0.0f;
        float stackIn_44_1 = 0.0f;
        float stackIn_48_0 = 0.0f;
        int stackIn_51_0 = 0;
        float stackIn_51_1 = 0.0f;
        int stackIn_52_0 = 0;
        float stackIn_52_1 = 0.0f;
        float stackIn_52_2 = 0.0f;
        int stackIn_55_0 = 0;
        float stackIn_55_1 = 0.0f;
        int stackIn_56_0 = 0;
        float stackIn_56_1 = 0.0f;
        float stackIn_56_2 = 0.0f;
        int stackIn_70_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_125_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        hj var9_ref_hj = null;
        var17 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var2_int = bl.field_r.field_r;
              if (this.field_ic <= 0.0f) {
                break L1;
              } else {
                L2: {
                  if (-2 != (this.field_Fb[1] ^ -1)) {
                    break L2;
                  } else {
                    if (bl.field_r.field_ab % 2 == 0) {
                      var3 = this.field_A.field_h + -(int)((float)this.field_C.field_K * this.field_w.field_j);
                      var4 = this.field_A.field_f + -(int)(this.field_w.field_g * (float)this.field_C.field_K);
                      kn.a((int)(-this.field_w.field_j * 1024.0f), var4, 1, 32, 1, -16, var3, this.field_q, bl.field_r.field_O, 0, (int)(-this.field_w.field_g * 1024.0f), 128, 2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (this.field_Fb[1] < 2) {
                    break L3;
                  } else {
                    if ((this.field_J ^ -1) != -2) {
                      L4: {
                        var3 = -(int)(this.field_w.field_j * (float)this.field_C.field_K) + this.field_A.field_h;
                        var4 = -(int)(this.field_w.field_g * (float)this.field_C.field_K) + this.field_A.field_f;
                        if (bl.field_r.field_ab % 2 != 0) {
                          break L4;
                        } else {
                          kn.a((int)(-this.field_w.field_j * 2048.0f), var4, 1, 32, 1, -8, var3, this.field_q, bl.field_r.field_O, 12632256, (int)(2048.0f * -this.field_w.field_g), 64, 4);
                          break L4;
                        }
                      }
                      kn.a((int)(-this.field_w.field_j * 1024.0f), var4, 0, 16, 1, -16, var3, this.field_q, bl.field_r.field_O, 8388352, (int)(-this.field_w.field_g * 1024.0f), 128, 2);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-2 == (this.field_J ^ -1)) {
                  L5: {
                    var3 = -(int)(this.field_w.field_j * (float)this.field_C.field_K) + this.field_A.field_h;
                    var4 = this.field_A.field_f + -(int)(this.field_w.field_g * (float)this.field_C.field_K);
                    if (-1 == (bl.field_r.field_ab % 2 ^ -1)) {
                      kn.a((int)(-this.field_w.field_j * 2048.0f), var4, 1, 64, 1, -2, var3, this.field_q, bl.field_r.field_O, 12632256, (int)(2048.0f * -this.field_w.field_g), 32, 8);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var5 = (int)(-this.field_w.field_j * 1024.0f);
                  var6 = (int)(1024.0f * -this.field_w.field_g);
                  var5 = var5 + (-256 + kj.b(2, 512));
                  var6 = var6 + (-256 + kj.b(2, 512));
                  var7 = (369164160 | kj.b(2, 128)) << -2011507384;
                  kn.a(var5, var4, 0, 16, 1, -16, var3, this.field_q, bl.field_r.field_O, var7, var6, 128, 2);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (-2 != (this.field_J ^ -1)) {
                stackIn_33_0 = 0;
                break L6;
              } else {
                stackIn_33_0 = 1;
                break L6;
              }
            }
            L7: {


              if (this.field_P == 0.0f) {

                stackIn_37_1 = 0;
                break L7;
              } else {

                stackIn_37_1 = 1;
                break L7;
              }
            }
            L8: {
              if ((stackIn_33_0 & stackIn_37_1) == 0) {
                break L8;
              } else {
                L9: {
                  stackIn_43_0 = this.field_w.field_g * (float)this.field_C.field_K;

                  if (this.field_P > 0.0f) {
                    stackIn_44_0 = stackIn_43_0;
                    stackIn_44_1 = -1.0f;
                    break L9;
                  } else {

                    stackIn_44_0 = stackIn_43_0;
                    stackIn_44_1 = 1.0f;
                    break L9;
                  }
                }
                L10: {
                  var3 = (int)(stackIn_44_0 * stackIn_44_1 + (float)this.field_C.field_K * this.field_w.field_j * 0.5f) + this.field_A.field_h;
                  if (0.0f >= this.field_P) {
                    stackIn_48_0 = 1.0f;
                    break L10;
                  } else {
                    stackIn_48_0 = -1.0f;
                    break L10;
                  }
                }
                L11: {
                  var4 = (int)(-(stackIn_48_0 * ((float)this.field_C.field_K * this.field_w.field_j)) + (float)this.field_C.field_K * this.field_w.field_g * 0.5f) + this.field_A.field_f;
                  var5 = (int)(1024.0f * (3.5f * this.field_t * 0.019999999552965164f));
                  stackIn_51_0 = var5;

                  stackIn_51_1 = 1024.0f;

                  if (this.field_P > 0.0f) {
                    stackIn_52_0 = stackIn_51_0;
                    stackIn_52_1 = stackIn_51_1;
                    stackIn_52_2 = -this.field_w.field_g;
                    break L11;
                  } else {
                    stackIn_52_0 = stackIn_51_0;
                    stackIn_52_1 = stackIn_51_1;
                    stackIn_52_2 = this.field_w.field_g;
                    break L11;
                  }
                }
                L12: {
                  var5 = stackIn_52_0 + (int)(stackIn_52_1 * stackIn_52_2);
                  var6 = (int)(1024.0f * (3.5f * this.field_x * 0.019999999552965164f));
                  stackIn_55_0 = var6;

                  stackIn_55_1 = 1024.0f;

                  if (this.field_P <= 0.0f) {
                    stackIn_56_0 = stackIn_55_0;
                    stackIn_56_1 = stackIn_55_1;
                    stackIn_56_2 = -this.field_w.field_j;
                    break L12;
                  } else {
                    stackIn_56_0 = stackIn_55_0;
                    stackIn_56_1 = stackIn_55_1;
                    stackIn_56_2 = this.field_w.field_j;
                    break L12;
                  }
                }
                var6 = stackIn_56_0 + (int)(stackIn_56_1 * stackIn_56_2);
                var7 = 16744448 | kj.b(2, 128) << 458357864;
                kn.a(var5, var4, 0, 16, 1, -16, var3, this.field_q, bl.field_r.field_O, var7, var6, 128, 2);
                break L8;
              }
            }
            L13: {
              if (-3 != (this.field_J ^ -1)) {
                break L13;
              } else {
                var3_float = 2.0f * (float)(Math.random() * 3.141592653589793);
                var4 = this.field_A.field_h - -(int)(1.2999999523162842 * (Math.cos((double)var3_float) * (double)this.field_C.field_d));
                var5 = this.field_A.field_f + -(int)(Math.sin((double)var3_float) * (double)this.field_C.field_d * 1.2999999523162842);
                var6 = (int)(0.75f * (this.field_t * 0.019999999552965164f * 3.5f) * 1024.0f);
                var7 = (int)(0.75f * (0.019999999552965164f * this.field_x * 3.5f) * 1024.0f);
                var8 = 255 | kj.b(2, 255) * 1052672;
                kn.a(var6, var5, 0, 25, 1, -40, var4, this.field_q, bl.field_r.field_q, var8, var7, 255, 2);
                break L13;
              }
            }
            L14: {
              L15: {
                var3 = -(int)((float)this.field_C.field_k * this.field_w.field_g + (float)this.field_C.field_K * this.field_w.field_j) + this.field_A.field_h;
                var4 = this.field_A.field_f + -(int)((float)this.field_C.field_K * this.field_w.field_g - (float)this.field_C.field_k * this.field_w.field_j);
                var5 = -(int)(this.field_w.field_j * (float)this.field_C.field_K - (float)this.field_C.field_k * this.field_w.field_g) + this.field_A.field_h;
                var6 = -(int)(this.field_w.field_j * (float)this.field_C.field_k + (float)this.field_C.field_K * this.field_w.field_g) + this.field_A.field_f;
                if (1.0f >= this.field_wb) {
                  break L15;
                } else {
                  L16: {
                    if (var2_int == 1) {
                      stackIn_70_0 = 1082097408;
                      break L16;
                    } else {
                      if (2 != var2_int) {
                        stackIn_70_0 = 1073873410;
                        break L16;
                      } else {
                        stackIn_70_0 = 537002498;
                        break L16;
                      }
                    }
                  }
                  var7 = stackIn_70_0;
                  vb.a(-68, bl.field_r.field_qb);
                  tc.e(this.field_nb, this.field_Tb, var3, var4, var7, var7 >>> -334951112);
                  tc.e(this.field_Xb, this.field_Ob, var5, var6, var7, var7 >>> -877065032);
                  var8_ref_wm = (wm) ((Object) bl.field_r.field_d.b((byte) 105));
                  L17: while (true) {
                    L18: {
                      if (null == var8_ref_wm) {
                        break L18;
                      } else {
                        stackIn_85_0 = this.field_q;

                        stackIn_85_1 = var8_ref_wm.field_q;

                        if (var17 != 0) {
                          break L14;
                        } else {
                          L19: {
                            if (stackIn_85_0 < stackIn_85_1) {
                              break L19;
                            } else {
                              if ((1048576 & var8_ref_wm.field_J ^ -1) != -1) {
                                var9_ref_hj = var8_ref_wm.field_H;
                                var9_ref_hj.f();
                                var10 = var8_ref_wm.field_A.field_h + -(var9_ref_hj.field_s >> -1856946751);
                                var11 = var8_ref_wm.field_A.field_f + -(var9_ref_hj.field_y >> -1238218527);
                                tc.e(this.field_nb - var10, this.field_Tb + -var11, -var10 + var3, -var11 + var4, var7, var7 >>> -2004141352);
                                tc.e(this.field_Xb - var10, -var11 + this.field_Ob, var5 + -var10, var6 - var11, var7, var7 >>> -1412036168);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var8_ref_wm = (wm) ((Object) bl.field_r.field_d.c((byte) -107));
                          if (var17 == 0) {
                            continue L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    ug.b(-1);
                    break L15;
                  }
                }
              }
              stackIn_85_0 = -1;
              stackIn_85_1 = this.field_Q ^ -1;
              break L14;
            }
            L20: {
              if (stackIn_85_0 > stackIn_85_1) {
                vb.a(-100, bl.field_r.field_qb);
                var7 = (this.field_Q << -1044496216) / 50;
                tc.e(this.field_nb, this.field_Tb, var3, var4, 0, var7);
                tc.e(this.field_Xb, this.field_Ob, var5, var6, 0, var7);
                ug.b(-1);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              this.field_Xb = var5;
              this.field_Tb = var4;
              this.field_nb = var3;
              this.field_Ob = var6;
              if (3 == bl.field_r.field_r) {
                break L21;
              } else {
                var7 = this.field_A.field_h - -(int)((float)this.field_C.field_K * this.field_w.field_j - this.field_w.field_g * (float)this.field_C.field_k);
                var8 = this.field_A.field_f - -(int)((float)this.field_C.field_k * this.field_w.field_j + (float)this.field_C.field_K * this.field_w.field_g);
                var9 = this.field_A.field_h + (int)(this.field_w.field_g * (float)this.field_C.field_k + this.field_w.field_j * (float)this.field_C.field_K);
                var10 = (int)(-((float)this.field_C.field_k * this.field_w.field_j) + (float)this.field_C.field_K * this.field_w.field_g) + this.field_A.field_f;
                this.a((byte) -119, var8, var7);
                this.a((byte) -124, var10, var9);
                this.a((byte) -108, this.field_Tb, this.field_nb);
                this.a((byte) -119, this.field_Ob, this.field_Xb);
                break L21;
              }
            }
            L22: {
              L23: {
                if (-2 != (bl.field_r.field_r ^ -1)) {
                  break L23;
                } else {
                  var7_float = Math.abs(this.field_jc) / 50.0f;
                  var8_float = var7_float / (1.0f + var7_float);
                  var9 = (int)(this.field_y - ln.a(-29407, this.field_jc) * this.field_w.field_j * (float)this.field_C.field_K);
                  var10 = (int)(this.field_u - ln.a(-29407, this.field_jc) * this.field_w.field_g * (float)this.field_C.field_K);
                  L24: while (true) {
                    if (Math.random() >= (double)var8_float) {
                      break L23;
                    } else {
                      var11 = (int)(1024.0f * (0.019999999552965164f * -this.field_t * 3.5f));
                      var12 = (int)(1024.0f * (3.5f * (-this.field_x * 0.019999999552965164f)));
                      var13 = this.field_jc * ((float)Math.random() - 0.5f);
                      var14 = this.field_jc * 6.0f * (-0.5f + (float)Math.random());
                      var11 = var11 + (int)(0.019999999552965164f * (this.field_w.field_j * var14 + this.field_w.field_g * var13) * 1024.0f);
                      var12 = var12 - (int)(1024.0f * ((-(var13 * this.field_w.field_j) + var14 * this.field_w.field_g) * 0.019999999552965164f));
                      var15 = 14147112;
                      stackIn_117_0 = 0;

                      stackIn_117_1 = var9;

                      if (var17 != 0) {
                        break L22;
                      } else {
                        L25: {
                          if (stackIn_117_0 > stackIn_117_1) {
                            break L25;
                          } else {
                            if ((var9 ^ -1) <= -641) {
                              break L25;
                            } else {
                              if (-1 < (var10 ^ -1)) {
                                break L25;
                              } else {
                                if (-481 >= (var10 ^ -1)) {
                                  break L25;
                                } else {
                                  var16 = lk.field_a.a(8192);
                                  if (var16 == null) {
                                    break L25;
                                  } else {
                                    var15 = var16.field_z[640 * var10 + var9];
                                    break L25;
                                  }
                                }
                              }
                            }
                          }
                        }
                        kn.a(var11, var10, 512, 64, 1, 0, var9, this.field_q, bl.field_r.field_O, var15, var12, 24, 20);
                        if (var17 == 0) {
                          continue L24;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                }
              }
              L26: {
                if (!this.field_Cb) {
                  break L26;
                } else {
                  if ((bl.field_r.field_ab % 5 ^ -1) == -1) {
                    var7 = -(int)((float)this.field_C.field_K * this.field_w.field_j) + this.field_A.field_h;
                    var8 = -(int)(this.field_w.field_g * (float)this.field_C.field_K) + this.field_A.field_f;
                    kn.a((int)(-this.field_w.field_j * 1024.0f), var8, 1, 32, 1, -16, var7, this.field_q, bl.field_r.field_O, 0, (int)(1024.0f * -this.field_w.field_g), 128, 2);
                    break L26;
                  } else {
                    break L26;
                  }
                }
              }
              stackIn_117_0 = this.field_rc ^ -1;
              stackIn_117_1 = -3;
              break L22;
            }
            L27: {
              L28: {
                if (stackIn_117_0 == stackIn_117_1) {
                  break L28;
                } else {
                  var8 = (-(int)this.field_lc + this.field_C.field_i) * 3 + -kj.b(2, this.field_C.field_i);
                  var7 = var8 / this.field_C.field_i;
                  if (var17 == 0) {
                    break L27;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                if ((kj.b(2, 18000) ^ -1) >= (this.field_L ^ -1)) {
                  stackIn_125_0 = 0;
                  break L29;
                } else {
                  stackIn_125_0 = 2;
                  break L29;
                }
              }
              var7 = stackIn_125_0;
              break L27;
            }
            L30: {
              L31: {
                if (2 != var7) {
                  break L31;
                } else {
                  var8 = (int)(3.5f * this.field_t * 0.019999999552965164f * 1024.0f);
                  var9 = (int)(1024.0f * (0.019999999552965164f * (this.field_x * 3.5f)));
                  var8 = var8 + (kj.b(2, 512) + -256);
                  var9 = var9 + (-1024 + kj.b(2, 512));
                  var10 = 16711680 | kj.b(2, 256) << 3156616;
                  var11 = this.field_A.field_h;
                  var12 = this.field_A.field_f;
                  var13 = this.field_C.field_c + ((float)Math.random() * 4.0f - 2.0f);
                  var14 = this.field_C.field_H + ((float)Math.random() * 4.0f - 2.0f);
                  var11 = var11 + (int)(this.field_w.field_g * var14 + var13 * this.field_w.field_j);
                  var12 = var12 + (int)(this.field_w.field_g * var13 - var14 * this.field_w.field_j);
                  kn.a(var8, var12, -1, 64, 1, -8, var11, this.field_q, bl.field_r.field_q, var10, var9, 128, 1);
                  if (var17 == 0) {
                    break L30;
                  } else {
                    break L31;
                  }
                }
              }
              if (1 == var7) {
                var8 = (int)(3.5f * this.field_t * 0.019999999552965164f * 1024.0f);
                var9 = (int)(1024.0f * (0.019999999552965164f * (3.5f * this.field_x)));
                var8 = var8 + (kj.b(2, 512) + -256);
                var9 = var9 + (kj.b(2, 512) + -1024);
                var10 = 0;
                var11 = this.field_A.field_h;
                var12 = this.field_A.field_f;
                var13 = this.field_C.field_c + (-2.0f + 4.0f * (float)Math.random());
                var14 = this.field_C.field_H + ((float)Math.random() * 4.0f - 2.0f);
                var12 = var12 + (int)(this.field_w.field_g * var13 - var14 * this.field_w.field_j);
                var11 = var11 + (int)(this.field_w.field_g * var14 + var13 * this.field_w.field_j);
                kn.a(var8, var12, 1, 64, 1, -8, var11, this.field_q, bl.field_r.field_O, var10, var9, 128, 2);
                break L30;
              } else {
                break L30;
              }
            }
            L32: {
              if (param0 >= 43) {
                break L32;
              } else {
                this.a(false);
                break L32;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "ja.V(" + param0 + ')');
        }
    }

    final boolean c(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        oa stackIn_21_0 = null;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        try {
          L0: {
            if (-1 != (this.field_rc ^ -1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_Fb[0] == param0) {
                  break L1;
                } else {
                  if ((this.field_Fb[1] ^ -1) == -4) {
                    break L1;
                  } else {
                    if ((this.field_Fb[2] ^ -1) != -4) {
                      L2: {
                        if ((this.field_hc[2] ^ -1) == 0) {
                          if (this.field_hc[1] != -1) {
                            stackIn_21_0 = jf.field_d;
                            break L2;
                          } else {
                            stackIn_21_0 = ij.field_g;
                            break L2;
                          }
                        } else {
                          stackIn_21_0 = null;
                          break L2;
                        }
                      }
                      L3: {
                        var3 = stackIn_21_0;
                        if (var3 != null) {
                          bd.a((byte) 20, (ee) (this), var3, var3.field_q);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var4 = this.field_Fb[0];
                        if (this.field_hc[2] == -1) {
                          break L4;
                        } else {
                          this.d(1, -1065046232);
                          break L4;
                        }
                      }
                      L5: {
                        this.field_hc[2] = this.field_hc[1];
                        this.field_hc[1] = this.field_hc[0];
                        this.field_hc[0] = param1;
                        this.field_Fb[param1] = this.field_Fb[param1] + 1;
                        if (this.field_Fb[0] == var4) {
                          break L5;
                        } else {
                          if (this.field_W != null) {
                            this.field_F = true;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      stackIn_36_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackIn_13_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3_ref), "ja.EA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_36_0 != 0;
          }
        }
    }

    private final void c(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        float stackIn_81_0 = 0.0f;
        float stackIn_85_0 = 0.0f;
        Throwable caughtException = null;
        int statePc = 0;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        in var11_ref_in = null;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33_float = 0.0f;
        int var33 = 0;
        int var34 = 0;
        float var35 = 0.0f;
        int var36 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var36 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_Y = -(this.field_x * this.field_w.field_j) + this.field_w.field_g * this.field_t;
                    this.field_jc = this.field_t * this.field_w.field_j + this.field_x * this.field_w.field_g;
                    var2_float = this.field_C.field_l * 9.8100004196167f;
                    var3 = 0;
                    if (!this.field_C.field_o) {
                        statePc = 12;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (0.0f == this.field_P) {
                        statePc = 12;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (ln.a(-29407, this.field_P) == ln.a(-29407, this.field_j)) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_j = this.field_j * 0.800000011920929f;
                    var3 = 1;
                    if (ln.a(-29407, this.field_P) != ln.a(-29407, this.field_wc)) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.field_wc = this.field_wc * 0.6000000238418579f;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var4 = this.field_C.field_s * this.field_C.field_p / this.field_C.field_E;
                    var5 = var4 * 0.5f * this.field_ic;
                    if (1 == this.field_J) {
                        statePc = 27;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (2 == this.field_J) {
                        statePc = 26;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (2 > this.field_Fb[1]) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var4 = var4 * (0.800000011920929f * this.field_C.field_r + 1.0f);
                    if (var36 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (this.field_Fb[1] == 1) {
                        statePc = 25;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var4 = var4 * (1.0f + this.field_C.field_r * 0.30000001192092896f);
                    if (var36 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var4 = var4 * (this.field_C.field_r * 1.0f + 1.0f);
                    if (var36 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var4 = var4 * (this.field_C.field_r * 3.0f + 1.0f);
                    var5 = var4;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (0 == bl.field_r.field_J) {
                        statePc = 34;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (-4 == (bl.field_r.field_J ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var4 = var4 * this.a((byte) 19);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (this.field_Cb) {
                        statePc = 38;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var4 = var4 * 3.0f;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var6 = this.field_C.field_w;
                    var6 = var6 * this.a((byte) 127, oi.field_c);
                    var7 = var2_float * (this.field_xc * this.field_C.field_I) * ln.a(-29407, this.field_jc);
                    var8 = 0.0f;
                    var9 = 0.0f;
                    if (this.field_zb.field_o == 0.0f) {
                        statePc = 47;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var10 = 60.0f * (9.8100004196167f * -this.field_C.field_l * this.field_zb.field_o);
                    var11_ref_in = this.field_zb.a((byte) 125, this.field_vb - (float)(int)this.field_vb);
                    var9 = var10 * var11_ref_in.a(this.field_w, (byte) -10);
                    var8 = var10 * var11_ref_in.a(this.field_w, param0);
                    if (this.field_ic == 0.0f) {
                        statePc = 47;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (ln.a(-29407, var9) != ln.a(-29407, var4)) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var9 = var9 * 0.30000001192092896f;
                    var8 = var8 * 0.30000001192092896f;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var10 = 0.5f * (var6 * var2_float);
                    var11 = var6 * var2_float * 0.5f;
                    var12 = this.field_C.field_n;
                    var13 = 0;
                    if (!bl.field_r.a(this.field_q, (int)(this.field_w.field_j * (float)this.field_C.field_K + (-((float)this.field_C.field_k * this.field_w.field_g) + (float)this.field_A.field_h)), -3, (int)((float)this.field_C.field_k * this.field_w.field_j + (float)this.field_A.field_f + this.field_w.field_g * (float)this.field_C.field_K))) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var13++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var14 = 0;
                    if (!bl.field_r.a(this.field_q, (int)(this.field_w.field_j * (float)this.field_C.field_K + ((float)this.field_A.field_h + this.field_w.field_g * (float)this.field_C.field_k)), -3, (int)(-(this.field_w.field_j * (float)this.field_C.field_k) + (float)this.field_A.field_f + this.field_w.field_g * (float)this.field_C.field_K))) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var14++;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (!bl.field_r.a(this.field_q, (int)((float)this.field_A.field_h - (float)this.field_C.field_k * this.field_w.field_g - this.field_w.field_j * (float)this.field_C.field_K), -3, (int)(-((float)this.field_C.field_K * this.field_w.field_g) + (this.field_w.field_j * (float)this.field_C.field_k + (float)this.field_A.field_f)))) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var13++;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (!bl.field_r.a(this.field_q, (int)((float)this.field_C.field_k * this.field_w.field_g + (float)this.field_A.field_h - this.field_w.field_j * (float)this.field_C.field_K), -3, (int)(-(this.field_w.field_g * (float)this.field_C.field_K) + ((float)this.field_A.field_f - this.field_w.field_j * (float)this.field_C.field_k)))) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var14++;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (-1 != (bl.field_r.field_r ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var11 = var11 * qg.field_c[var14];
                    var12 = var12 * ig.field_u[var14 + var13];
                    var10 = var10 * qg.field_c[var13];
                    if (var36 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (1 != bl.field_r.field_r) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var12 = var12 * ch.field_r[var14 + var13];
                    var10 = var10 * de.field_J[var13];
                    var11 = var11 * de.field_J[var14];
                    if (var36 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if ((bl.field_r.field_r ^ -1) == -3) {
                        statePc = 70;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var12 = var12 * e.field_e[var13 + var14];
                    var11 = var11 * qf.field_k[var14];
                    var10 = var10 * qf.field_k[var13];
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var15 = 0.5f * (var4 * this.field_ic);
                    var16 = 0.5f * (this.field_ic * var4);
                    if (0.0f <= this.field_P) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var16 = var16 + var4 * 0.5f;
                    var15 = var15 - var4 * 0.5f;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (this.field_P > 0.0f) {
                        statePc = 76;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var16 = var16 - 0.5f * var4;
                    var15 = var15 + var4 * 0.5f;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    var17 = 0.5f * (-ln.a(-29407, this.field_Y) * (var2_float * var6));
                    var18 = 0.5f * (-ln.a(-29407, this.field_Y) * (var6 * var2_float));
                    if (var3 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = 0.0f;
                    statePc = 81;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_81_0 = var15 * var15;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var19 = (float)Math.sqrt((double)(stackIn_81_0 + var17 * var17));
                    if (var3 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    stackIn_85_0 = var16 * var16;
                    statePc = 85;
                    continue stateLoop;
                }
                case 84: {
                    stackIn_85_0 = 0.0f;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var20 = (float)Math.sqrt((double)(stackIn_85_0 + var18 * var18));
                    var21 = var19 / var10;
                    var22 = var20 / var11;
                    if (var21 <= 1.0f) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var17 = var17 / var21;
                    var15 = var15 / var21;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (1.0f < var22) {
                        statePc = 90;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var18 = var18 / var22;
                    var16 = var16 / var22;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var4 = var16 + var15;
                    if (var5 > Math.abs(var4)) {
                        statePc = 94;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var4 = ln.a(-29407, var4) * var5;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    var23 = this.field_C.field_y * (var16 - var15);
                    this.field_wc = -var23 / this.field_C.field_a;
                    var24 = this.field_jc * this.field_jc * this.field_C.field_J * ln.a(-29407, this.field_jc);
                    var25 = var12 * (9.8100004196167f * ln.a(-29407, this.field_jc) * this.field_C.field_l);
                    var26 = var25 + var24 + var7;
                    var27 = var9 + var4;
                    if (param0) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.a(4, (ei) null, 97);
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    var28 = var17 + var18;
                    var29 = var8;
                    this.field_Gb = var27 / this.field_C.field_l;
                    var30 = var29 / this.field_C.field_l;
                    if ((this.field_J ^ -1) == -2) {
                        statePc = 101;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var31 = ln.a(-29407, this.field_P) * -5.0f;
                    var30 = var30 + var31;
                    var32 = var31 * this.field_C.field_l;
                    var33_float = (this.field_C.field_j * 3.0f - this.field_C.field_C) / 4.0f;
                    this.field_wc = this.field_wc + var33_float * var32 / this.field_C.field_a;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var31 = -var26 / this.field_C.field_l;
                    var32 = var28 / this.field_C.field_l;
                    var33 = 0;
                    if (ln.a(-29407, var31) == ln.a(-29407, this.field_jc)) {
                        statePc = 107;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (Math.abs(0.019999999552965164f * var31) <= Math.abs(this.field_jc)) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var33 = 1;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    this.field_Gb = this.field_Gb + var31;
                    var30 = var30 + var32;
                    var34 = 0;
                    if (Math.abs(var32 * 0.019999999552965164f) > Math.abs(this.field_Y)) {
                        statePc = 110;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var34 = 1;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (Float.isNaN(this.field_Gb)) {
                        statePc = 114;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 114: {
                    throw new RuntimeException((String) null);
                }
                case 115: {
                    this.field_j = 0.019999999552965164f * this.field_wc;
                    if (!this.field_jb) {
                        statePc = 132;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    this.field_wc = 0.0f;
                    if (0 == (this.field_M ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    fieldTemp$0 = this.field_M - 1;
                    this.field_M = this.field_M - 1;
                    if ((fieldTemp$0 ^ -1) >= -1) {
                        statePc = 124;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 124: {
                    this.field_jb = false;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (0.0f >= this.field_j) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_j = 5.0f;
                    if (var36 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    this.field_j = -5.0f;
                    if (var36 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (!this.field_V) {
                        statePc = 158;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var35 = this.field_H - this.field_r;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if ((double)var35 <= 3.141592653589793) {
                        statePc = 141;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var35 = (float)((double)var35 - 6.283185307179586);
                    if (var36 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (var36 == 0) {
                        statePc = 136;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if ((double)var35 >= -3.141592653589793) {
                        statePc = 146;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var35 = (float)((double)var35 + 6.283185307179586);
                    if (var36 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (var36 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    this.field_r = this.field_r + 0.019999999552965164f * (5.0f * var35);
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (0.5f <= Math.abs(var35)) {
                        statePc = 154;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (100.0f > Math.abs(this.field_wc)) {
                        statePc = 153;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 153: {
                    this.field_V = false;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    fieldTemp$1 = this.field_T - 1;
                    this.field_T = this.field_T - 1;
                    if (-1 <= (fieldTemp$1 ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 157: {
                    this.field_V = false;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    this.field_jc = this.field_w.field_g * this.field_x + this.field_w.field_j * this.field_t;
                    this.field_Y = this.field_t * this.field_w.field_g - this.field_x * this.field_w.field_j;
                    this.field_jc = this.field_jc + this.field_Gb * 0.019999999552965164f;
                    this.field_Y = this.field_Y + 0.019999999552965164f * var30;
                    if (var33 != 0) {
                        statePc = 161;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 161: {
                    this.field_Gb = 0.0f;
                    this.field_jc = 0.0f;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (var34 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 165: {
                    this.field_Y = 0.0f;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    this.field_x = this.field_jc * this.field_w.field_g - this.field_w.field_j * this.field_Y;
                    this.field_t = this.field_w.field_g * this.field_Y + this.field_w.field_j * this.field_jc;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(qm param0, byte param1, ei param2, ei param3) {
        float stackIn_6_0 = 0.0f;
        float stackIn_8_0 = 0.0f;
        float stackIn_18_0 = 0.0f;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        ei var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        float var7 = 0.0f;
        tg var8 = null;
        float var9 = 0.0f;
        Object var10 = null;
        eb[] var10_array = null;
        int var11_int = 0;
        float var11 = 0.0f;
        eb var12 = null;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = new ei();
                        if (param1 == 39) {
                            statePc = 3;
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
                    return;
                }
                case 3: {
                    try {
                        var6 = 0;
                        var7 = 0.0f;
                        var8 = (tg) (param3.field_b[var6]);
                        var9 = var8.field_e;
                        var10 = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 < var9) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_18_0 = var7 - var9;
                        stackIn_6_0 = stackIn_18_0;
                        if (var13 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_8_0 = stackIn_6_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = stackIn_8_0;
                        var6++;
                        if ((param3.field_e ^ -1) < (var6 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10_array = new eb[var5.field_e];
                        var11_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5.field_e <= var11_int) {
                            statePc = 15;
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
                        var10_array[var11_int] = (eb) (var5.field_b[var11_int]);
                        var11_int++;
                        if (var13 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var13 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = (tg) (param3.field_b[var6]);
                        var9 = var8.field_e;
                        if (var13 == 0) {
                            statePc = 4;
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
                        stackIn_18_0 = var7 / var9;
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
                        var11 = stackIn_18_0;
                        var12 = new eb(var8.a(false, var11), var8.field_b);
                        var5.a(var12, (byte) 6);
                        if (100 <= var5.field_e) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = var7 + 5.0f;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param2.a(var10_array, (byte) 6);
                        this.a(5, param2, -1);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var5_ref);
                    stackIn_26_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("ja.GA(");
                    stackIn_26_1 = stackIn_28_1;
                    if (param0 == null) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_0 = stackIn_32_0;
                    stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');
                    stackIn_30_1 = stackIn_32_1;
                    if (param2 == null) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_0 = stackIn_36_0;
                    stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
                    stackIn_34_1 = stackIn_36_1;
                    if (param3 == null) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_37_2 = "{...}";
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_37_2 = "null";
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    throw kk.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(int param0, int param1) {
        int dupTemp$0 = 0;
        wm stackIn_25_0 = null;
        wm stackIn_25_1 = null;
        qm stackIn_25_2 = null;
        wm stackIn_26_0 = null;
        wm stackIn_26_1 = null;
        qm stackIn_26_2 = null;
        int stackIn_26_3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        in var4 = null;
        qm var5 = null;
        wm var6 = null;
        float var7 = 0.0f;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1 == -1065046232) {
                break L1;
              } else {
                this.field_mc = 21;
                break L1;
              }
            }
            var3_int = 2;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var3_int ^ -1) > -1) {
                    break L4;
                  } else {
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if ((param0 ^ -1) == -1) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        L5: {
                          if ((this.field_hc[var3_int] ^ -1) != 0) {
                            L6: {
                              L7: {
                                bd.a((byte) 76, (ee) (this), ji.field_i, ji.field_i.field_q);
                                dupTemp$0 = this.field_hc[var3_int];
                                this.field_Fb[dupTemp$0] = this.field_Fb[dupTemp$0] - 1;
                                var4 = new in(this.field_w);
                                var4.a(1.5f * (float)this.field_C.field_K, -1);
                                var5 = new qm(this.field_A);
                                if (0.0f < this.field_jc) {
                                  break L7;
                                } else {
                                  var5.a(var4, (byte) 113);
                                  if (var8 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var5.a(var4, -13201);
                              break L6;
                            }
                            L8: {
                              stackIn_25_0 = null;

                              stackIn_25_1 = null;

                              stackIn_25_2 = (qm) (var5);

                              if ((this.field_hc[var3_int] ^ -1) != -4) {
                                stackIn_26_0 = null;
                                stackIn_26_1 = null;
                                stackIn_26_2 = (qm) ((Object) stackIn_25_2);
                                stackIn_26_3 = 2 - -this.field_hc[var3_int];
                                break L8;
                              } else {
                                stackIn_26_0 = null;
                                stackIn_26_1 = null;
                                stackIn_26_2 = (qm) ((Object) stackIn_25_2);
                                stackIn_26_3 = 1;
                                break L8;
                              }
                            }
                            L9: {
                              L10: {
                                var6 = new wm(stackIn_26_2, stackIn_26_3, this.field_q);
                                var7 = -5.0f + (float)Math.random() * 10.0f;
                                if (this.field_jc > 0.0f) {
                                  break L10;
                                } else {
                                  var6.field_x = -(this.field_w.field_j * var7) + (this.field_w.field_g * 100.0f + this.field_x);
                                  var6.field_t = this.field_t + 100.0f * this.field_w.field_j + var7 * this.field_w.field_g;
                                  if (var8 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var6.field_t = this.field_t - 100.0f * this.field_w.field_j - var7 * this.field_w.field_g;
                              var6.field_x = this.field_x - this.field_w.field_g * 100.0f + var7 * this.field_w.field_j;
                              break L9;
                            }
                            bl.field_r.field_W.a((byte) -71, var6);
                            param0--;
                            this.field_hc[var3_int] = -1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var3_int--;
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3), "ja.MA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != -1) {
              L1: {
                if (param0 < -24) {
                  break L1;
                } else {
                  this.field_gc = -118;
                  break L1;
                }
              }
              if (this.field_kc > this.field_qc) {
                L2: {
                  L3: {
                    if (this.field_qc > param1) {
                      break L3;
                    } else {
                      if ((param1 ^ -1) < (this.field_kc ^ -1)) {
                        break L3;
                      } else {
                        stackIn_16_0 = 1;
                        break L2;
                      }
                    }
                  }
                  stackIn_16_0 = 0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  L5: {
                    if (this.field_qc <= param1) {
                      break L5;
                    } else {
                      if ((param1 ^ -1) < (this.field_kc ^ -1)) {
                        stackIn_24_0 = 0;
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  stackIn_24_0 = 1;
                  break L4;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3), "ja.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_24_0 != 0;
          }
        }
    }

    private final boolean c(byte param0) {
        Object stackIn_7_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_41_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_91_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        ja[] var3 = null;
        float var4 = 0.0f;
        in var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        Object var8 = null;
        Object var9 = null;
        int var10_int = 0;
        wm var10 = null;
        Object var11 = null;
        float var11_float = 0.0f;
        float var12_float = 0.0f;
        vf var12_ref_vf = null;
        int var12 = 0;
        float var13_float = 0.0f;
        int var13 = 0;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 1;
                        var3 = bl.field_r.field_C;
                        var4 = this.field_r;
                        var4 = (float)((double)var4 + (-0.05000000074505806 + Math.random() * 0.10000000149011612));
                        var5 = new in(var4);
                        var6 = 3.4028234663852886e+38f;
                        if (param0 < -53) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_lc = -0.8991538286209106f;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = 0.0f;
                        var8 = null;
                        var9 = null;
                        var10_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var10_int >= bl.field_r.field_z) {
                            statePc = 20;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_21_0 = this;
                        stackIn_7_0 = stackIn_21_0;
                        if (var17 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((ja) (this)).field_mc ^ -1) == (var10_int ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11 = var3[var10_int];
                        if (null != var11) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var17 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12_float = -this.field_y + ((ja) (var11)).field_y;
                        var13_float = ((ja) (var11)).field_u - this.field_u;
                        var14 = var12_float * var5.field_j + var13_float * var5.field_g;
                        var15 = -(var13_float * var5.field_j) + var5.field_g * var12_float;
                        if (var6 <= var14) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (4.0f * Math.abs(var15) >= var14) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = var14;
                        var7 = var15;
                        var8 = var11;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var10_int++;
                        if (var17 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = bl.field_r.field_cb.b((byte) 121);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10 = (wm) ((Object) stackIn_21_0);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var10 == null) {
                            statePc = 35;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var10.g(0);
                        if (-1 != (var10.field_J & 1024 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var11_float = -this.field_y + var10.field_y;
                        var12_float = -this.field_u + var10.field_u;
                        var13_float = var12_float * var5.field_g + var5.field_j * var11_float;
                        var14 = var5.field_g * var11_float - var5.field_j * var12_float;
                        if (var6 <= var13_float) {
                            statePc = 34;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (Math.abs(var14) * 6.0f >= var13_float) {
                            statePc = 34;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (Math.abs(var14) >= 12.0f) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var7 = var14;
                        var9 = var10;
                        var6 = var13_float;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var10 = (wm) ((Object) bl.field_r.field_cb.c((byte) 87));
                        if (var17 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var11 = null;
                        if (null != ih.field_n) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var12_ref_vf = (vf) ((Object) ih.field_n.b((byte) 103));
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (null == var12_ref_vf) {
                            statePc = 54;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var13_float = -this.field_y + (float)var12_ref_vf.field_B;
                        var14 = (float)var12_ref_vf.field_i - this.field_u;
                        var15 = var13_float * var5.field_j + var14 * var5.field_g;
                        var16 = var13_float * var5.field_g - var14 * var5.field_j;
                        stackIn_68_0 = (var6 < var15 ? -1 : (var6 == var15 ? 0 : 1));
                        stackIn_41_0 = stackIn_68_0;
                        if (var17 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 <= 0) {
                            statePc = 53;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var15 <= 8.0f * Math.abs(var16)) {
                            statePc = 53;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (Math.abs(var16) < 6.0f) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var7 = var16;
                        var6 = var15;
                        var11 = var12_ref_vf;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var12_ref_vf = (vf) ((Object) ih.field_n.c((byte) -49));
                        if (var17 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var9 != null) {
                            statePc = 66;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (null != var8) {
                            statePc = 66;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var11 != null) {
                            statePc = 66;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var12 = (int)(var5.field_j * 500.0f + this.field_y);
                        var13 = (int)(500.0f * var5.field_g + this.field_u);
                        if (qm.a(this.field_q, bl.field_r.field_nb, -20484, this.field_A, new qm(var12, var13))) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        this.a(500.0f * mm.field_d, var5, (int)this.field_y, 40, (int)this.field_u);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var17 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_68_0 = (int)(this.field_y + var5.field_j * var6);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var12 = stackIn_68_0;
                        var13 = (int)(var6 * var5.field_g + this.field_u);
                        if (qm.a(this.field_q, bl.field_r.field_nb, -20484, this.field_A, new qm(var12, var13))) {
                            statePc = 88;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        this.a(var6, var5, (int)this.field_y, 35, (int)this.field_u);
                        if (null != var11) {
                            statePc = 85;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var9 == null) {
                            statePc = 78;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        bl.field_r.a((wm) (var9), false);
                        if (var17 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (((ja) (var8)).field_J != 2) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var14 = ((ja) (var8)).field_C.field_a * ((ja) (var8)).a((byte) 104, go.field_j);
                        ((ja) (var8)).field_r = ((ja) (var8)).field_r + var7 * 2000.0f / (var14 * var6);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        ((ja) (var8)).field_Yb = ((ja) (var8)).field_Yb + 2;
                        ((ja) (var8)).a(1.0f, 0, (ja) (this), 6);
                        if (var17 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ((vf) (var11)).a((ja) (this), 0, (byte) 110, 0);
                        if (var17 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        this.a(var6 * mm.field_d, var5, (int)this.field_y, -115, (int)this.field_u);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        this.field_Rb = 0;
                        stackIn_91_0 = var2_int;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 91: {
                    return stackIn_91_0 != 0;
                }
                case 92: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw kk.a((Throwable) ((Object) var2), "ja.NA(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(float param0, int param1, ja param2, int param3) {
        float[] stackIn_15_0 = null;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        float[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (null != param2) {
                break L1;
              } else {
                param2 = this.field_Bb;
                break L1;
              }
            }
            L2: {
              this.field_Bb = param2;
              if (this.field_J == 2) {
                stackIn_15_0 = pb.field_b;
                break L2;
              } else {
                if (this.field_Fb[2] == 0) {
                  stackIn_15_0 = sl.field_d;
                  break L2;
                } else {
                  if (-2 == (this.field_Fb[2] ^ -1)) {
                    stackIn_15_0 = si.field_kb;
                    break L2;
                  } else {
                    stackIn_15_0 = p.field_g;
                    break L2;
                  }
                }
              }
            }
            L3: {
              var5 = stackIn_15_0;
              param0 = param0 * var5[param3];
              this.field_lc = this.field_lc - param0;
              if (0.0f < this.field_lc) {
                break L3;
              } else {
                L4: {
                  if (2 == bl.field_r.field_J) {
                    break L4;
                  } else {
                    if (bl.field_r.field_J == 6) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (this.field_rc == 2) {
                      break L6;
                    } else {
                      this.a(param2, (byte) -88);
                      if (var8 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  this.b(false);
                  break L5;
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var6 = this.field_Fb[param1];
            var7 = 3;
            L7: while (true) {
              L8: {
                L9: {
                  if ((var7 ^ -1) >= -1) {
                    break L9;
                  } else {
                    stackIn_44_0 = (rd.field_b[var7 - 1] < param0 ? -1 : (rd.field_b[var7 - 1] == param0 ? 0 : 1));

                    if (var8 != 0) {
                      break L8;
                    } else {
                      L10: {
                        if (stackIn_44_0 >= 0) {
                          break L10;
                        } else {
                          this.d(var7, -1065046232);
                          if (var8 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var7--;
                      if (var8 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                stackIn_44_0 = this.field_Fb[0];
                break L8;
              }
              L11: {
                if (stackIn_44_0 == var6) {
                  break L11;
                } else {
                  if (this.field_W != null) {
                    this.field_F = true;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5_ref = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var5_ref);

            stackIn_55_1 = new StringBuilder().append("ja.OA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L12;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L12;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              kd.field_d = true;
              var2 = "tuhstatbut";
              var3 = "rvnadlm";
              if (param0 == -1848651292) {
                break L1;
              } else {
                ja.i(59);
                break L1;
              }
            }
            var4 = -1L;
            he.a(var4, param1, var3, -118, var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("ja.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_Wb = new mf("email");
        field_Qb = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
    }
}
