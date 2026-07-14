/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends ka {
    private float[] field_y;
    private byte field_Z;
    private fd[] field_f;
    private short field_U;
    private short field_M;
    private tj field_g;
    private int field_L;
    private int[] field_K;
    private int field_N;
    private short[] field_X;
    private tj field_ab;
    private aba field_i;
    private va field_Q;
    private short[] field_z;
    private short[] field_cb;
    private sca field_jb;
    private boolean field_l;
    private short field_T;
    private tj field_F;
    private boolean field_s;
    private int[] field_p;
    private int field_G;
    private int field_bb;
    private short field_B;
    private short[] field_I;
    private int[][] field_j;
    private byte[] field_O;
    private short field_eb;
    private short field_v;
    static cn field_m;
    private short[] field_fb;
    private short field_S;
    private short[] field_hb;
    private int[][] field_C;
    private ava[] field_D;
    private byte[] field_o;
    private short[] field_H;
    private int field_u;
    static byte[] field_J;
    private short field_k;
    private short field_h;
    private tj field_kb;
    private int field_W;
    private float[] field_n;
    private short[] field_q;
    private boolean field_gb;
    private cka field_R;
    private pm[] field_r;
    private int field_lb;
    private afa field_w;
    private int field_ib;
    private int[][] field_d;
    private int[] field_e;
    private short[] field_E;
    private rga[] field_t;
    static java.awt.Image field_x;
    private int[] field_P;
    static String field_V;
    private short[] field_Y;
    private int[] field_A;
    private short[] field_db;

    private final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        int var14 = 0;
        int var15 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 32767;
                        var3 = 32767;
                        var4 = 32767;
                        var5 = -32768;
                        var6 = -32768;
                        var7 = -32768;
                        var8 = 0;
                        var9 = 0;
                        var10 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((((np) this).field_lb ^ -1) >= (var10 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = ((np) this).field_P[var10];
                        var12 = ((np) this).field_K[var10];
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2_int > var11) {
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
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = var11;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var3 > var12) {
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
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = var12;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var6 ^ -1) <= (var12 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = var12;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var13 = ((np) this).field_A[var10];
                        if (var11 <= var5) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5 = var11;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4 > var13) {
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
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4 = var13;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var7 ^ -1) <= (var13 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = var13;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var14 = var13 * var13 + var11 * var11;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var8 < var14) {
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
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var8 = var14;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var14 = var12 * var12 + var11 * var11 + var13 * var13;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((var14 ^ -1) < (var9 ^ -1)) {
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
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = var14;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param0 == 2709) {
                            statePc = 36;
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
                    return;
                }
                case 36: {
                    try {
                        ((np) this).field_k = (short)var4;
                        ((np) this).field_T = (short)var5;
                        ((np) this).field_S = (short)var7;
                        ((np) this).field_eb = (short)var3;
                        ((np) this).field_U = (short)var2_int;
                        ((np) this).field_v = (short)var6;
                        ((np) this).field_M = (short)(int)(0.99 + Math.sqrt((double)var8));
                        ((np) this).field_l = true;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "np.S(" + param0 + 41);
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void H(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = 0;
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
                        if (((np) this).field_lb <= var4_int) {
                            statePc = 19;
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
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == param0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
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
                        ((np) this).field_P[var4_int] = ((np) this).field_P[var4_int] + param0;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0 != param1) {
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
                        statePc = 14;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((np) this).field_K[var4_int] = ((np) this).field_K[var4_int] + param1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((param2 ^ -1) == -1) {
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
                        ((np) this).field_A[var4_int] = ((np) this).field_A[var4_int] + param2;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((np) this).field_l = false;
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
                        if (((np) this).field_g == null) {
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
                        ((np) this).field_g.field_d = null;
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
                    throw tba.a((Throwable) (Object) runtimeException, "np.H(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, byte param2, short param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        dw var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_36_0 = 0;
        int stackOut_35_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = cla.field_m[qp.c(param1, param4, 117)];
                        if ((param3 ^ -1) == 0) {
                            statePc = 31;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var7 = ((np) this).field_R.field_c.a((byte) -79, 65535 & param3);
                        var8 = 255 & var7.field_c;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1 == (var8 ^ -1)) {
                            statePc = 17;
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
                        if ((param4 ^ -1) <= -1) {
                            statePc = 9;
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
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((param4 ^ -1) < -128) {
                            statePc = 13;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param4 * 131586;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = 16777215;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var8 ^ -1) == -257) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10 = var8;
                        var11 = 256 - var8;
                        var6_int = (-16711936 & (16711935 & var9) * var10 - -((16711935 & var6_int) * var11)) - -(16711680 & var11 * (65280 & var6_int) + (65280 & var9) * var10) >> -2117016184;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6_int = var9;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = 255 & var7.field_i;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (0 != var9) {
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
                        statePc = 31;
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
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        // wide iinc 9 256
                        var10 = (var6_int >> -553499408 & 255) * var9;
                        if (-65536 <= (var10 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = 65535;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var11 = var9 * ((65280 & var6_int) >> -1510998072);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-65536 > (var11 ^ -1)) {
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
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var11 = 65535;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var12 = var9 * (var6_int & 255);
                        if (var12 <= 65535) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var12 = 65535;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var6_int = (var12 >> 1406443688) + ((16711843 & var10 << 211496968) + (65280 & var11));
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param0 == -2117016184) {
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
                        ((np) this).b();
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
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
                        stackOut_35_0 = (var6_int << 1985794856) - -255 - (param2 & 255);
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return stackIn_36_0;
                }
                case 37: {
                    var6 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var6, "np.K(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void FA(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = qu.field_b[param0];
                        var3 = qu.field_d[param0];
                        var4 = 0;
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
                        if ((((np) this).field_lb ^ -1) >= (var4 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = ((np) this).field_K[var4] * var3 - var2_int * ((np) this).field_A[var4] >> -1809676626;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((np) this).field_A[var4] = var3 * ((np) this).field_A[var4] + var2_int * ((np) this).field_K[var4] >> 1196700814;
                        ((np) this).field_K[var4] = var5;
                        var4++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
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
                        ((np) this).field_l = false;
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
                        if (((np) this).field_g == null) {
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
                        ((np) this).field_g.field_d = null;
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
                    throw tba.a((Throwable) (Object) var2, "np.FA(" + param0 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final short a(long param0, int param1, int param2, int param3, byte param4, int param5, int param6, float param7, oc param8, float param9) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        short stackIn_16_0 = 0;
        byte stackIn_19_0 = 0;
        short stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        short stackOut_15_0 = 0;
        byte stackOut_18_0 = 0;
        short stackOut_23_0 = 0;
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
                    var17 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var12_int = ((np) this).field_e[param5];
                        var13 = ((np) this).field_e[1 + param5];
                        var14 = 0;
                        var15 = var12_int;
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
                        if (var15 >= var13) {
                            statePc = 18;
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
                        var16 = ((np) this).field_q[var15];
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
                        if (var16 == 0) {
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var14 = var15;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((qka.field_m[var15] ^ -1L) == (param0 ^ -1L)) {
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
                        statePc = 17;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = (short)(-1 + var16);
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    try {
                        var15++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((np) this).field_q[var14] = (short)(1 + ((np) this).field_L);
                        qka.field_m[var14] = param0;
                        ((np) this).field_E[((np) this).field_L] = (short)param6;
                        stackOut_18_0 = param4;
                        stackIn_19_0 = stackOut_18_0;
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
                        if (stackIn_19_0 == -40) {
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
                        ((np) this).field_s = true;
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
                        ((np) this).field_Y[((np) this).field_L] = (short)param2;
                        ((np) this).field_cb[((np) this).field_L] = (short)param1;
                        ((np) this).field_O[((np) this).field_L] = (byte)param3;
                        ((np) this).field_n[((np) this).field_L] = param9;
                        ((np) this).field_y[((np) this).field_L] = param7;
                        ((np) this).field_L = ((np) this).field_L + 1;
                        stackOut_23_0 = (short)((np) this).field_L;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var12 = (RuntimeException) (Object) caughtException;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) var12;
                        stackOut_26_1 = new StringBuilder().append("np.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        if (param8 == null) {
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
                    throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param9 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final ka a(boolean param0, int param1, boolean param2, int param3, np param4, np param5) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        aba var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          param5.field_h = ((np) this).field_h;
          if (-1 == (param1 & 256 ^ -1)) {
            param5.field_s = ((np) this).field_s;
            break L0;
          } else {
            param5.field_s = true;
            break L0;
          }
        }
        L1: {
          param5.field_N = ((np) this).field_N;
          param5.field_bb = param1;
          param5.field_B = ((np) this).field_B;
          param5.field_Z = (byte) 0;
          param5.field_u = ((np) this).field_u;
          param5.field_G = ((np) this).field_G;
          param5.field_W = ((np) this).field_W;
          param5.field_ib = ((np) this).field_ib;
          param5.field_L = ((np) this).field_L;
          param5.field_lb = ((np) this).field_lb;
          var7_int = jj.a(((np) this).field_u, param1, -32842) ? 1 : 0;
          var8 = mg.a((byte) -53, ((np) this).field_u, param1) ? 1 : 0;
          var9 = gha.a(((np) this).field_u, param1, param3 ^ -22830) ? 1 : 0;
          var10 = var8 | var7_int | var9;
          if (param3 == -22857) {
            break L1;
          } else {
            ((np) this).field_q = null;
            break L1;
          }
        }
        L2: {
          if (var10 != 0) {
            L3: {
              if (var7_int != 0) {
                L4: {
                  if (param4.field_P == null) {
                    break L4;
                  } else {
                    if (((np) this).field_N > param4.field_P.length) {
                      break L4;
                    } else {
                      param5.field_P = param4.field_P;
                      break L3;
                    }
                  }
                }
                param4.field_P = new int[((np) this).field_N];
                param5.field_P = new int[((np) this).field_N];
                break L3;
              } else {
                param5.field_P = ((np) this).field_P;
                break L3;
              }
            }
            L5: {
              if (var8 != 0) {
                L6: {
                  if (null == param4.field_K) {
                    break L6;
                  } else {
                    if (((np) this).field_N > param4.field_K.length) {
                      break L6;
                    } else {
                      param5.field_K = param4.field_K;
                      break L5;
                    }
                  }
                }
                param4.field_K = new int[((np) this).field_N];
                param5.field_K = new int[((np) this).field_N];
                break L5;
              } else {
                param5.field_K = ((np) this).field_K;
                break L5;
              }
            }
            L7: {
              if (var9 == 0) {
                param5.field_A = ((np) this).field_A;
                break L7;
              } else {
                L8: {
                  if (param4.field_A == null) {
                    break L8;
                  } else {
                    if (param4.field_A.length >= ((np) this).field_N) {
                      param5.field_A = param4.field_A;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                param4.field_A = new int[((np) this).field_N];
                param5.field_A = new int[((np) this).field_N];
                break L7;
              }
            }
            var11 = 0;
            L9: while (true) {
              if (var11 >= ((np) this).field_N) {
                break L2;
              } else {
                L10: {
                  if (var7_int != 0) {
                    param5.field_P[var11] = ((np) this).field_P[var11];
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var8 != 0) {
                    param5.field_K[var11] = ((np) this).field_K[var11];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var9 != 0) {
                    param5.field_A[var11] = ((np) this).field_A[var11];
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var11++;
                continue L9;
              }
            }
          } else {
            param5.field_A = ((np) this).field_A;
            param5.field_K = ((np) this).field_K;
            param5.field_P = ((np) this).field_P;
            break L2;
          }
        }
        L13: {
          if (so.a(param1, (byte) -106, ((np) this).field_u)) {
            L14: {
              if (!param2) {
                break L14;
              } else {
                param5.field_Z = (byte)(param5.field_Z | 1);
                break L14;
              }
            }
            param5.field_g = param4.field_g;
            param5.field_g.field_d = ((np) this).field_g.field_d;
            param5.field_g.field_g = ((np) this).field_g.field_g;
            break L13;
          } else {
            if (hha.a(((np) this).field_u, 0, param1)) {
              param5.field_g = ((np) this).field_g;
              break L13;
            } else {
              param5.field_g = null;
              break L13;
            }
          }
        }
        L15: {
          if (!o.a(-1, ((np) this).field_u, param1)) {
            param5.field_X = ((np) this).field_X;
            break L15;
          } else {
            L16: {
              L17: {
                if (null == param4.field_X) {
                  break L17;
                } else {
                  if (((np) this).field_W <= param4.field_X.length) {
                    param5.field_X = param4.field_X;
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              param4.field_X = new short[((np) this).field_W];
              param5.field_X = new short[((np) this).field_W];
              break L16;
            }
            var11 = 0;
            L18: while (true) {
              if ((var11 ^ -1) <= (((np) this).field_W ^ -1)) {
                break L15;
              } else {
                param5.field_X[var11] = ((np) this).field_X[var11];
                var11++;
                continue L18;
              }
            }
          }
        }
        L19: {
          if (mpa.a(false, ((np) this).field_u, param1)) {
            L20: {
              L21: {
                if (null == param4.field_o) {
                  break L21;
                } else {
                  if ((param4.field_o.length ^ -1) <= (((np) this).field_W ^ -1)) {
                    param5.field_o = param4.field_o;
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              param4.field_o = new byte[((np) this).field_W];
              param5.field_o = new byte[((np) this).field_W];
              break L20;
            }
            var11 = 0;
            L22: while (true) {
              if ((((np) this).field_W ^ -1) >= (var11 ^ -1)) {
                break L19;
              } else {
                param5.field_o[var11] = ((np) this).field_o[var11];
                var11++;
                continue L22;
              }
            }
          } else {
            param5.field_o = ((np) this).field_o;
            break L19;
          }
        }
        L23: {
          if (!vua.e(param1, ((np) this).field_u, 13650)) {
            if (!we.b(param1, ((np) this).field_u, 2048)) {
              param5.field_kb = null;
              break L23;
            } else {
              param5.field_kb = ((np) this).field_kb;
              break L23;
            }
          } else {
            L24: {
              if (!param2) {
                break L24;
              } else {
                param5.field_Z = (byte)(param5.field_Z | 2);
                break L24;
              }
            }
            param5.field_kb = param4.field_kb;
            param5.field_kb.field_d = ((np) this).field_kb.field_d;
            param5.field_kb.field_g = ((np) this).field_kb.field_g;
            break L23;
          }
        }
        L25: {
          if (cra.a(((np) this).field_u, -17, param1)) {
            L26: {
              L27: {
                if (param4.field_E == null) {
                  break L27;
                } else {
                  if (param4.field_E.length < ((np) this).field_L) {
                    break L27;
                  } else {
                    param5.field_Y = param4.field_Y;
                    param5.field_E = param4.field_E;
                    param5.field_cb = param4.field_cb;
                    break L26;
                  }
                }
              }
              var11 = ((np) this).field_L;
              param4.field_Y = new short[var11];
              param5.field_Y = new short[var11];
              param4.field_E = new short[var11];
              param5.field_E = new short[var11];
              param4.field_cb = new short[var11];
              param5.field_cb = new short[var11];
              break L26;
            }
            L28: {
              if (null != ((np) this).field_i) {
                L29: {
                  if (null != param4.field_i) {
                    break L29;
                  } else {
                    param4.field_i = new aba();
                    break L29;
                  }
                }
                L30: {
                  L31: {
                    param5.field_i = param4.field_i;
                    var11_ref = param4.field_i;
                    if (var11_ref.field_d == null) {
                      break L31;
                    } else {
                      if ((((np) this).field_L ^ -1) < (var11_ref.field_d.length ^ -1)) {
                        break L31;
                      } else {
                        break L30;
                      }
                    }
                  }
                  var12 = ((np) this).field_L;
                  var11_ref.field_f = new short[var12];
                  var11_ref.field_e = new byte[var12];
                  var11_ref.field_d = new short[var12];
                  var11_ref.field_b = new short[var12];
                  break L30;
                }
                var12 = 0;
                L32: while (true) {
                  if ((((np) this).field_L ^ -1) >= (var12 ^ -1)) {
                    break L28;
                  } else {
                    param5.field_E[var12] = ((np) this).field_E[var12];
                    param5.field_Y[var12] = ((np) this).field_Y[var12];
                    param5.field_cb[var12] = ((np) this).field_cb[var12];
                    var11_ref.field_d[var12] = ((np) this).field_i.field_d[var12];
                    var11_ref.field_b[var12] = ((np) this).field_i.field_b[var12];
                    var11_ref.field_f[var12] = ((np) this).field_i.field_f[var12];
                    var11_ref.field_e[var12] = ((np) this).field_i.field_e[var12];
                    var12++;
                    continue L32;
                  }
                }
              } else {
                var11 = 0;
                L33: while (true) {
                  if ((var11 ^ -1) <= (((np) this).field_L ^ -1)) {
                    break L28;
                  } else {
                    param5.field_E[var11] = ((np) this).field_E[var11];
                    param5.field_Y[var11] = ((np) this).field_Y[var11];
                    param5.field_cb[var11] = ((np) this).field_cb[var11];
                    var11++;
                    continue L33;
                  }
                }
              }
            }
            param5.field_O = ((np) this).field_O;
            break L25;
          } else {
            param5.field_O = ((np) this).field_O;
            param5.field_i = ((np) this).field_i;
            param5.field_Y = ((np) this).field_Y;
            param5.field_cb = ((np) this).field_cb;
            param5.field_E = ((np) this).field_E;
            break L25;
          }
        }
        L34: {
          if (ooa.a(((np) this).field_u, param1, -100)) {
            L35: {
              param5.field_F = param4.field_F;
              if (!param2) {
                break L35;
              } else {
                param5.field_Z = (byte)(param5.field_Z | 4);
                break L35;
              }
            }
            param5.field_F.field_g = ((np) this).field_F.field_g;
            param5.field_F.field_d = ((np) this).field_F.field_d;
            break L34;
          } else {
            if (!kb.a(((np) this).field_u, param1, (byte) 17)) {
              param5.field_F = null;
              break L34;
            } else {
              param5.field_F = ((np) this).field_F;
              break L34;
            }
          }
        }
        L36: {
          if (hh.a(param1, (byte) 5, ((np) this).field_u)) {
            L37: {
              L38: {
                if (null == param4.field_n) {
                  break L38;
                } else {
                  if ((param4.field_n.length ^ -1) <= (((np) this).field_W ^ -1)) {
                    param5.field_n = param4.field_n;
                    param5.field_y = param4.field_y;
                    break L37;
                  } else {
                    break L38;
                  }
                }
              }
              var11 = ((np) this).field_L;
              param4.field_y = new float[var11];
              param5.field_y = new float[var11];
              param4.field_n = new float[var11];
              param5.field_n = new float[var11];
              break L37;
            }
            var11 = 0;
            L39: while (true) {
              if (((np) this).field_L <= var11) {
                break L36;
              } else {
                param5.field_n[var11] = ((np) this).field_n[var11];
                param5.field_y[var11] = ((np) this).field_y[var11];
                var11++;
                continue L39;
              }
            }
          } else {
            param5.field_n = ((np) this).field_n;
            param5.field_y = ((np) this).field_y;
            break L36;
          }
        }
        L40: {
          if (upa.a(((np) this).field_u, 0, param1)) {
            param5.field_ab = param4.field_ab;
            L41: {
              if (!param2) {
                break L41;
              } else {
                param5.field_Z = (byte)(param5.field_Z | 8);
                break L41;
              }
            }
            param5.field_ab.field_g = ((np) this).field_ab.field_g;
            param5.field_ab.field_d = ((np) this).field_ab.field_d;
            break L40;
          } else {
            if (wu.a(-17, ((np) this).field_u, param1)) {
              param5.field_ab = ((np) this).field_ab;
              break L40;
            } else {
              param5.field_ab = null;
              break L40;
            }
          }
        }
        L42: {
          if (!qp.a(param1, (byte) -71, ((np) this).field_u)) {
            param5.field_hb = ((np) this).field_hb;
            param5.field_z = ((np) this).field_z;
            param5.field_H = ((np) this).field_H;
            break L42;
          } else {
            L43: {
              L44: {
                if (param4.field_H == null) {
                  break L44;
                } else {
                  if ((param4.field_H.length ^ -1) > (((np) this).field_W ^ -1)) {
                    break L44;
                  } else {
                    param5.field_z = param4.field_z;
                    param5.field_H = param4.field_H;
                    param5.field_hb = param4.field_hb;
                    break L43;
                  }
                }
              }
              var11 = ((np) this).field_W;
              param4.field_hb = new short[var11];
              param5.field_hb = new short[var11];
              param4.field_H = new short[var11];
              param5.field_H = new short[var11];
              param4.field_z = new short[var11];
              param5.field_z = new short[var11];
              break L43;
            }
            var11 = 0;
            L45: while (true) {
              if ((var11 ^ -1) <= (((np) this).field_W ^ -1)) {
                break L42;
              } else {
                param5.field_H[var11] = ((np) this).field_H[var11];
                param5.field_z[var11] = ((np) this).field_z[var11];
                param5.field_hb[var11] = ((np) this).field_hb[var11];
                var11++;
                continue L45;
              }
            }
          }
        }
        L46: {
          if (tia.b(((np) this).field_u, -23403, param1)) {
            L47: {
              if (!param2) {
                break L47;
              } else {
                param5.field_Z = (byte)(param5.field_Z | 16);
                break L47;
              }
            }
            param5.field_w = param4.field_w;
            param5.field_w.field_a = ((np) this).field_w.field_a;
            break L46;
          } else {
            if (mm.a(-123, param1, ((np) this).field_u)) {
              param5.field_w = ((np) this).field_w;
              break L46;
            } else {
              param5.field_w = null;
              break L46;
            }
          }
        }
        L48: {
          if (aca.a(param1, 32768, ((np) this).field_u)) {
            L49: {
              L50: {
                if (null == param4.field_I) {
                  break L50;
                } else {
                  if ((param4.field_I.length ^ -1) <= (((np) this).field_W ^ -1)) {
                    param5.field_I = param4.field_I;
                    break L49;
                  } else {
                    break L50;
                  }
                }
              }
              var11 = ((np) this).field_W;
              param4.field_I = new short[var11];
              param5.field_I = new short[var11];
              break L49;
            }
            var11 = 0;
            L51: while (true) {
              if ((var11 ^ -1) <= (((np) this).field_W ^ -1)) {
                break L48;
              } else {
                param5.field_I[var11] = ((np) this).field_I[var11];
                var11++;
                continue L51;
              }
            }
          } else {
            param5.field_I = ((np) this).field_I;
            break L48;
          }
        }
        L52: {
          if (qba.a(((np) this).field_u, 480, param1)) {
            L53: {
              if (null == param4.field_f) {
                break L53;
              } else {
                if ((((np) this).field_G ^ -1) < (param4.field_f.length ^ -1)) {
                  break L53;
                } else {
                  param5.field_f = param4.field_f;
                  var11 = 0;
                  L54: while (true) {
                    if ((((np) this).field_G ^ -1) >= (var11 ^ -1)) {
                      break L52;
                    } else {
                      param5.field_f[var11].a(167, ((np) this).field_f[var11]);
                      var11++;
                      continue L54;
                    }
                  }
                }
              }
            }
            var11 = ((np) this).field_G;
            param4.field_f = new fd[var11];
            param5.field_f = new fd[var11];
            var12 = 0;
            L55: while (true) {
              if ((((np) this).field_G ^ -1) >= (var12 ^ -1)) {
                break L52;
              } else {
                param5.field_f[var12] = ((np) this).field_f[var12].a((byte) 78);
                var12++;
                continue L55;
              }
            }
          } else {
            param5.field_f = ((np) this).field_f;
            break L52;
          }
        }
        L56: {
          param5.field_j = ((np) this).field_j;
          param5.field_q = ((np) this).field_q;
          if (((np) this).field_l) {
            param5.field_v = ((np) this).field_v;
            param5.field_S = ((np) this).field_S;
            param5.field_l = true;
            param5.field_k = ((np) this).field_k;
            param5.field_U = ((np) this).field_U;
            param5.field_eb = ((np) this).field_eb;
            param5.field_M = ((np) this).field_M;
            param5.field_T = ((np) this).field_T;
            break L56;
          } else {
            param5.field_l = false;
            break L56;
          }
        }
        param5.field_t = ((np) this).field_t;
        param5.field_D = ((np) this).field_D;
        param5.field_r = ((np) this).field_r;
        param5.field_db = ((np) this).field_db;
        param5.field_C = ((np) this).field_C;
        param5.field_e = ((np) this).field_e;
        param5.field_p = ((np) this).field_p;
        param5.field_fb = ((np) this).field_fb;
        param5.field_d = ((np) this).field_d;
        return (ka) (Object) param5;
    }

    private final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        qf var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((np) this).field_ib * 6 ^ -1) < (((np) this).field_R.field_cb.field_g.length ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((np) this).field_R.field_cb.field_h = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((np) this).field_R.field_cb = new qf((((np) this).field_ib - -100) * 6);
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
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3_ref = ((np) this).field_R.field_cb;
                        if (((np) this).field_R.field_O) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((np) this).field_ib <= var4) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3_ref.d((int) ((np) this).field_H[var4], -87);
                        var3_ref.d((int) ((np) this).field_z[var4], 124);
                        var3_ref.d((int) ((np) this).field_hb[var4], 120);
                        var4++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (((np) this).field_ib <= var4) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3_ref.f(-1477662136, (int) ((np) this).field_H[var4]);
                        var3_ref.f(-1477662136, (int) ((np) this).field_z[var4]);
                        var3_ref.f(-1477662136, (int) ((np) this).field_hb[var4]);
                        var4++;
                        statePc = 16;
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
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (0 == var3_ref.field_h) {
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
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        if (param0 <= 0) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((np) this).I(68, (int[]) null, -92, 111, -30, false, -95, (int[]) null);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!param1) {
                            statePc = 39;
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
                        if (null != ((np) this).field_jb) {
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
                        ((np) this).field_jb = ((np) this).field_R.a(-81, var3_ref.field_h, 5123, true, var3_ref.field_g);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
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
                        ((np) this).field_jb.a(var3_ref.field_h, -11783, var3_ref.field_g, 5123);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((np) this).field_w.field_a = ((np) this).field_jb;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((np) this).field_w.field_a = ((np) this).field_R.a(-56, var3_ref.field_h, 5123, false, var3_ref.field_g);
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
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (!param1) {
                            statePc = 45;
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
                        statePc = 48;
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
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((np) this).field_gb = true;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var3, "np.D(" + param0 + 44 + param1 + 41);
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        pm var6 = null;
        int var7_int = 0;
        fd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_int >= ((np) this).field_W) {
                            statePc = 18;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6_int = 65535 & ((np) this).field_X[var5_int];
                        var7_int = (var6_int & 65466) >> -1742868182;
                        var8 = (var6_int & 905) >> -1997019193;
                        var9 = 127 & var6_int;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0 != (param0 ^ -1)) {
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
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7_int = var7_int + ((param0 - var7_int) * param3 >> 1070960103);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1 != -1) {
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
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = var8 - -((-var8 + param1) * param3 >> 164170823);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 != param2) {
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9 = ((-var9 + param2) * param3 >> -1263656665) + var9;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((np) this).field_X[var5_int] = (short)fh.a(fh.a(var7_int << 599206666, var8 << -495384409), var9);
                        var5_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (((np) this).field_r != null) {
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
                        statePc = 27;
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
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_int = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var5_int >= ((np) this).field_G) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var6 = ((np) this).field_r[var5_int];
                        var7 = ((np) this).field_f[var5_int];
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7.field_c = 16777215 & cla.field_m[((np) this).field_X[var6.field_l] & 65535] | -16777216 & var7.field_c;
                        var5_int++;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((np) this).field_kb == null) {
                            statePc = 33;
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
                        ((np) this).field_kb.field_d = null;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 33;
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
                case 32: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var5, "np.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ka a(byte param0, int param1, boolean param2) {
        np var4 = null;
        RuntimeException var4_ref = null;
        np var5 = null;
        int var6 = 0;
        Object stackIn_23_0 = null;
        boolean stackIn_23_1 = false;
        int stackIn_23_2 = 0;
        Object stackIn_25_0 = null;
        boolean stackIn_25_1 = false;
        int stackIn_25_2 = 0;
        Object stackIn_26_0 = null;
        boolean stackIn_26_1 = false;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        ka stackIn_27_0 = null;
        Object stackOut_22_0 = null;
        boolean stackOut_22_1 = false;
        int stackOut_22_2 = 0;
        Object stackOut_23_0 = null;
        boolean stackOut_23_1 = false;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        Object stackOut_25_0 = null;
        boolean stackOut_25_1 = false;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        ka stackOut_26_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-2 == (param0 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param0 ^ -1) != -3) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = ((np) this).field_R.field_Nb;
                        var5 = ((np) this).field_R.field_eb;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-4 != (param0 ^ -1)) {
                            statePc = 12;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4 = ((np) this).field_R.field_Ub;
                        var5 = ((np) this).field_R.field_sc;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (4 == param0) {
                            statePc = 20;
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
                        if (-6 != (param0 ^ -1)) {
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
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = ((np) this).field_R.field_Xb;
                        var4 = ((np) this).field_R.field_yb;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5 = new np(((np) this).field_R);
                        var4 = new np(((np) this).field_R);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5 = ((np) this).field_R.field_D;
                        var4 = ((np) this).field_R.field_E;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = ((np) this).field_R.field_w;
                        var5 = ((np) this).field_R.field_i;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = this;
                        stackOut_22_1 = param2;
                        stackOut_22_2 = param1;
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_25_2 = stackOut_22_2;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        if (-1 == (param0 ^ -1)) {
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
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = 1;
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_26_2 = stackOut_23_2;
                        stackIn_26_3 = stackOut_23_3;
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
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = this;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        stackIn_26_3 = stackOut_25_3;
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
                        stackOut_26_0 = this.a(stackIn_26_1, stackIn_26_2, stackIn_26_3 != 0, -22857, var5, var4);
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    var4_ref = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var4_ref, "np.A(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(gda param0, el param1, int param2, int param3) {
        RuntimeException var5 = null;
        oba var5_ref = null;
        oba var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        Object stackOut_35_0 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((np) this).field_L != 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var5_ref = ((np) this).field_R.field_jd;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((np) this).field_l) {
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
                        this.c(2709);
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
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = (oba) (Object) param0;
                        it.field_a = var6.field_h * var5_ref.field_q + (var5_ref.field_j * var6.field_k + var5_ref.field_h * var6.field_r);
                        bja.field_b = var5_ref.field_o + (var6.field_o * var5_ref.field_q + (var6.field_p * var5_ref.field_h + var5_ref.field_j * var6.field_m));
                        var7 = bja.field_b + it.field_a * (float)((np) this).field_eb;
                        var8 = bja.field_b + it.field_a * (float)((np) this).field_v;
                        if (var7 > var8) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = var8 + (float)((np) this).field_M;
                        var9 = (float)(-((np) this).field_M) + var7;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = (float)((np) this).field_M + var7;
                        var9 = (float)(-((np) this).field_M) + var8;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((np) this).field_R.field_m > var9) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        if (var10 > (float)((np) this).field_R.field_Gc) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        eqa.field_a = var5_ref.field_k * var6.field_r + var6.field_k * var5_ref.field_l + var6.field_h * var5_ref.field_s;
                        aka.field_B = var5_ref.field_s * var6.field_o + (var6.field_p * var5_ref.field_k + var5_ref.field_l * var6.field_m) + var5_ref.field_m;
                        var11 = aka.field_B + eqa.field_a * (float)((np) this).field_eb;
                        var12 = (float)((np) this).field_v * eqa.field_a + aka.field_B;
                        if (var11 > var12) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var14 = (var12 + (float)((np) this).field_M) * (float)((np) this).field_R.field_W;
                        var13 = (float)((np) this).field_R.field_W * (var11 - (float)((np) this).field_M);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var14 = (var11 + (float)((np) this).field_M) * (float)((np) this).field_R.field_W;
                        var13 = (var12 - (float)((np) this).field_M) * (float)((np) this).field_R.field_W;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (((np) this).field_R.field_od <= var13 / (float)param2) {
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
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return;
                }
                case 22: {
                    try {
                        if (((np) this).field_R.field_s >= var14 / (float)param2) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return;
                }
                case 25: {
                    try {
                        nw.field_u = var5_ref.field_g * var6.field_h + (var5_ref.field_i * var6.field_k + var6.field_r * var5_ref.field_r);
                        ef.field_s = var5_ref.field_p + (var6.field_o * var5_ref.field_g + (var6.field_p * var5_ref.field_r + var5_ref.field_i * var6.field_m));
                        var15 = ef.field_s + nw.field_u * (float)((np) this).field_eb;
                        var16 = (float)((np) this).field_v * nw.field_u + ef.field_s;
                        if (var15 <= var16) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var18 = (float)((np) this).field_R.field_kb * (var15 + (float)((np) this).field_M);
                        var17 = (float)((np) this).field_R.field_kb * (var16 - (float)((np) this).field_M);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var17 = (float)((np) this).field_R.field_kb * (var15 - (float)((np) this).field_M);
                        var18 = (var16 + (float)((np) this).field_M) * (float)((np) this).field_R.field_kb;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((np) this).field_R.field_Db <= var17 / (float)param2) {
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
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return;
                }
                case 32: {
                    try {
                        if (((np) this).field_R.field_nd < var18 / (float)param2) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return;
                }
                case 34: {
                    try {
                        if (null != param1) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = null;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 == (Object) (Object) ((np) this).field_r) {
                            statePc = 42;
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
                case 39: {
                    try {
                        is.field_Ab = var5_ref.field_l * var6.field_l + var5_ref.field_k * var6.field_i + var6.field_j * var5_ref.field_s;
                        roa.field_u = var6.field_l * var5_ref.field_j + var5_ref.field_h * var6.field_i + var6.field_j * var5_ref.field_q;
                        mu.field_ub = var6.field_q * var5_ref.field_s + (var5_ref.field_l * var6.field_s + var5_ref.field_k * var6.field_g);
                        bva.field_c = var6.field_q * var5_ref.field_g + (var6.field_g * var5_ref.field_r + var6.field_s * var5_ref.field_i);
                        qi.field_L = var6.field_i * var5_ref.field_r + var5_ref.field_i * var6.field_l + var5_ref.field_g * var6.field_j;
                        kka.field_q = var5_ref.field_h * var6.field_g + var6.field_s * var5_ref.field_j + var6.field_q * var5_ref.field_q;
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
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null != param1) {
                            statePc = 45;
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
                        statePc = 50;
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
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var19 = ((np) this).field_U - -((np) this).field_T >> 1115123041;
                        var20 = ((np) this).field_k + ((np) this).field_S >> -1348054783;
                        var21 = (int)(it.field_a * (float)((np) this).field_eb + (roa.field_u * (float)var19 + bja.field_b) + kka.field_q * (float)var20);
                        var22 = (int)((float)var20 * kka.field_q + (it.field_a * (float)((np) this).field_v + (roa.field_u * (float)var19 + bja.field_b)));
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((var21 ^ -1) <= (((np) this).field_R.field_Gc ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((((np) this).field_R.field_Gc ^ -1) >= (var22 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
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
                        ((np) this).field_R.a((byte) 88, (float)param2);
                        ((np) this).field_R.j((byte) -121);
                        ((np) this).field_R.b(var6, 112);
                        this.a(false);
                        ((np) this).field_R.n((byte) -91);
                        this.b((byte) -30);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    try {
                        stackOut_53_0 = (RuntimeException) var5;
                        stackOut_53_1 = new StringBuilder().append("np.Q(");
                        stackIn_56_0 = stackOut_53_0;
                        stackIn_56_1 = stackOut_53_1;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        if (param0 == null) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
                        stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                        stackOut_54_2 = "{...}";
                        stackIn_57_0 = stackOut_54_0;
                        stackIn_57_1 = stackOut_54_1;
                        stackIn_57_2 = stackOut_54_2;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 56: {
                    stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
                    stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
                    stackOut_56_2 = "null";
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    stackIn_57_2 = stackOut_56_2;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    try {
                        stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
                        stackOut_57_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(44);
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        if (param1 == null) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
                        stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
                        stackOut_58_2 = "{...}";
                        stackIn_61_0 = stackOut_58_0;
                        stackIn_61_1 = stackOut_58_1;
                        stackIn_61_2 = stackOut_58_2;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 60: {
                    stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
                    stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
                    stackOut_60_2 = "null";
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    stackIn_61_2 = stackOut_60_2;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    throw tba.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + 44 + param2 + 44 + param3 + 41);
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        pm var11_ref_pm = null;
        int var12_int = 0;
        int[] var12 = null;
        fd var12_ref = null;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        int var14_int = 0;
        fd var14 = null;
        int var15 = 0;
        int[] var16_ref_int__ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int[] var31_ref_int__ = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int[] var35 = null;
        int var35_int = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        Object stackIn_74_0 = null;
        short[] stackIn_74_1 = null;
        Object stackOut_73_0 = null;
        short[] stackOut_73_1 = null;
        var47 = TombRacer.field_G ? 1 : 0;
        var9_int = param1.length;
        if (param0 != 0) {
          if (param0 == 1) {
            L0: {
              if (param7 != null) {
                var10 = 8192 + (param2 * param7[0] - (-(param3 * param7[1]) - param7[2] * param4)) >> 1944742510;
                var11 = 8192 + param7[4] * param3 + (param7[3] * param2 - -(param7[5] * param4)) >> -467641618;
                var12_int = param7[6] * param2 + (param7[7] * param3 - -(param4 * param7[8]) - -8192) >> 1597913358;
                param4 = var12_int;
                param3 = var11;
                param2 = var10;
                break L0;
              } else {
                break L0;
              }
            }
            param2 = param2 << 4;
            param4 = param4 << 4;
            param3 = param3 << 4;
            var10 = 0;
            L1: while (true) {
              if (var9_int <= var10) {
                return;
              } else {
                L2: {
                  var11 = param1[var10];
                  if ((((np) this).field_d.length ^ -1) < (var11 ^ -1)) {
                    var12 = ((np) this).field_d[var11];
                    var13 = 0;
                    L3: while (true) {
                      if ((var12.length ^ -1) >= (var13 ^ -1)) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            var14_int = var12[var13];
                            if (((np) this).field_db == null) {
                              break L5;
                            } else {
                              if ((param6 & ((np) this).field_db[var14_int]) != 0) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] + param2;
                          ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] + param3;
                          ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] + param4;
                          break L4;
                        }
                        var13++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var10++;
                continue L1;
              }
            }
          } else {
            if (param0 == 2) {
              L6: {
                if (null != param7) {
                  L7: {
                    var10 = param7[9] << -636635996;
                    var11 = param7[10] << -1063123996;
                    var12_int = param7[11] << -1022980572;
                    var13 = param7[12] << -1520383804;
                    var14_int = param7[13] << 1040835012;
                    var15 = param7[14] << 987565796;
                    if (!vea.field_b) {
                      break L7;
                    } else {
                      var16 = 8192 + (dj.field_b * param7[6] + via.field_e * param7[3] + param7[0] * rp.field_i) >> -1903103698;
                      var17 = dj.field_b * param7[7] + (param7[4] * via.field_e + rp.field_i * param7[1] - -8192) >> 1440394222;
                      var18 = param7[2] * rp.field_i + (param7[5] * via.field_e + dj.field_b * param7[8] - -8192) >> -575748466;
                      var16 = var16 + var13;
                      var17 = var17 + var14_int;
                      via.field_e = var17;
                      var18 = var18 + var15;
                      rp.field_i = var16;
                      vea.field_b = false;
                      dj.field_b = var18;
                      break L7;
                    }
                  }
                  var16_ref_int__ = new int[9];
                  var17 = qu.field_d[param2];
                  var18 = qu.field_b[param2];
                  var19 = qu.field_d[param3];
                  var20 = qu.field_b[param3];
                  var21 = qu.field_d[param4];
                  var22 = qu.field_b[param4];
                  var23 = 8192 + var21 * var18 >> 662805134;
                  var24 = 8192 + var18 * var22 >> -2132536114;
                  var16_ref_int__[7] = var19 * var23 + var22 * var20 + 8192 >> -455554514;
                  var16_ref_int__[4] = 8192 + var17 * var21 >> 1500725582;
                  var16_ref_int__[0] = 8192 + (var24 * var20 + var21 * var19) >> 2120876398;
                  var16_ref_int__[6] = var24 * var19 + -var20 * var21 + 8192 >> 146216750;
                  var16_ref_int__[3] = var22 * var17 + 8192 >> -348546130;
                  var16_ref_int__[5] = -var18;
                  var16_ref_int__[8] = var19 * var17 - -8192 >> -981563378;
                  var16_ref_int__[1] = var20 * var23 + -var19 * var22 + 8192 >> -374317106;
                  var16_ref_int__[2] = var17 * var20 + 8192 >> 253876942;
                  var25_int = 8192 + (var16_ref_int__[2] * -dj.field_b + -rp.field_i * var16_ref_int__[0] - -(var16_ref_int__[1] * -via.field_e)) >> 1936941742;
                  var26 = 8192 + var16_ref_int__[5] * -dj.field_b + (-rp.field_i * var16_ref_int__[3] - -(-via.field_e * var16_ref_int__[4])) >> -94871858;
                  var27 = -dj.field_b * var16_ref_int__[8] + (-via.field_e * var16_ref_int__[7] + var16_ref_int__[6] * -rp.field_i + 8192) >> 892183054;
                  var28 = var25_int + rp.field_i;
                  var29_int = via.field_e + var26;
                  var30 = var27 + dj.field_b;
                  var31_ref_int__ = new int[9];
                  var32 = 0;
                  L8: while (true) {
                    if (3 <= var32) {
                      var32 = 8192 + (var13 * var16_ref_int__[0] - -(var14_int * var16_ref_int__[1])) - -(var16_ref_int__[2] * var15) >> -244496178;
                      var33 = var16_ref_int__[5] * var15 + var16_ref_int__[4] * var14_int + var16_ref_int__[3] * var13 + 8192 >> -2016182962;
                      var32 = var32 + var28;
                      var33 = var33 + var29_int;
                      var34 = 8192 + var16_ref_int__[6] * var13 + var14_int * var16_ref_int__[7] - -(var15 * var16_ref_int__[8]) >> 994807150;
                      var34 = var34 + var30;
                      var35 = new int[9];
                      var36 = 0;
                      L9: while (true) {
                        if (3 <= var36) {
                          var36 = 8192 + (var34 * param7[2] + var32 * param7[0] + param7[1] * var33) >> 540243854;
                          var37 = 8192 + (var33 * param7[4] + param7[3] * var32 + param7[5] * var34) >> 2100233646;
                          var36 = var36 + var10;
                          var37 = var37 + var11;
                          var38 = var33 * param7[7] + (param7[6] * var32 + param7[8] * var34) + 8192 >> -877240146;
                          var38 = var38 + var12_int;
                          var39 = 0;
                          L10: while (true) {
                            if ((var9_int ^ -1) >= (var39 ^ -1)) {
                              break L6;
                            } else {
                              L11: {
                                var40 = param1[var39];
                                if ((var40 ^ -1) > (((np) this).field_d.length ^ -1)) {
                                  var41 = ((np) this).field_d[var40];
                                  var42 = 0;
                                  L12: while (true) {
                                    if (var41.length <= var42) {
                                      break L11;
                                    } else {
                                      L13: {
                                        L14: {
                                          var43 = var41[var42];
                                          if (null == ((np) this).field_db) {
                                            break L14;
                                          } else {
                                            if ((((np) this).field_db[var43] & param6) != 0) {
                                              break L14;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        var44 = 8192 + var35[2] * ((np) this).field_A[var43] + (((np) this).field_P[var43] * var35[0] + ((np) this).field_K[var43] * var35[1]) >> -463601330;
                                        var45 = var35[5] * ((np) this).field_A[var43] + (((np) this).field_K[var43] * var35[4] + ((np) this).field_P[var43] * var35[3] - -8192) >> 1938377006;
                                        var44 = var44 + var36;
                                        var45 = var45 + var37;
                                        var46 = var35[8] * ((np) this).field_A[var43] + ((np) this).field_K[var43] * var35[7] + (((np) this).field_P[var43] * var35[6] - -8192) >> 1589620046;
                                        var46 = var46 + var38;
                                        ((np) this).field_P[var43] = var44;
                                        ((np) this).field_K[var43] = var45;
                                        ((np) this).field_A[var43] = var46;
                                        break L13;
                                      }
                                      var42++;
                                      continue L12;
                                    }
                                  }
                                } else {
                                  break L11;
                                }
                              }
                              var39++;
                              continue L10;
                            }
                          }
                        } else {
                          var37 = 0;
                          L15: while (true) {
                            if (-4 >= (var37 ^ -1)) {
                              var36++;
                              continue L9;
                            } else {
                              var38 = 0;
                              var39 = 0;
                              L16: while (true) {
                                if ((var39 ^ -1) <= -4) {
                                  var35[3 * var36 - -var37] = 8192 + var38 >> -1117311218;
                                  var37++;
                                  continue L15;
                                } else {
                                  var38 = var38 + param7[var39 + 3 * var36] * var31_ref_int__[var37 - -(var39 * 3)];
                                  var39++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = 0;
                      L17: while (true) {
                        if ((var33 ^ -1) <= -4) {
                          var32++;
                          continue L8;
                        } else {
                          var34 = 0;
                          var35_int = 0;
                          L18: while (true) {
                            if ((var35_int ^ -1) <= -4) {
                              var31_ref_int__[var32 * 3 - -var33] = 8192 + var34 >> 1803012750;
                              var33++;
                              continue L17;
                            } else {
                              var34 = var34 + param7[var35_int + var33 * 3] * var16_ref_int__[var35_int + var32 * 3];
                              var35_int++;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L19: while (true) {
                    if (var9_int <= var10) {
                      if (param5) {
                        var10 = 0;
                        L20: while (true) {
                          if ((var10 ^ -1) <= (var9_int ^ -1)) {
                            L21: {
                              if (null != ((np) this).field_F) {
                                break L21;
                              } else {
                                if (((np) this).field_kb != null) {
                                  ((np) this).field_kb.field_d = null;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            if (((np) this).field_F == null) {
                              break L6;
                            } else {
                              ((np) this).field_F.field_d = null;
                              break L6;
                            }
                          } else {
                            L22: {
                              var11 = param1[var10];
                              if (var11 >= ((np) this).field_d.length) {
                                break L22;
                              } else {
                                var12 = ((np) this).field_d[var11];
                                var13 = 0;
                                L23: while (true) {
                                  if ((var13 ^ -1) <= (var12.length ^ -1)) {
                                    break L22;
                                  } else {
                                    var14_int = var12[var13];
                                    stackOut_73_0 = null;
                                    stackOut_73_1 = ((np) this).field_db;
                                    stackIn_74_0 = stackOut_73_0;
                                    stackIn_74_1 = stackOut_73_1;
                                    L24: {
                                      L25: {
                                        if (stackIn_74_0 == (Object) (Object) stackIn_74_1) {
                                          break L25;
                                        } else {
                                          if ((((np) this).field_db[var14_int] & param6) != 0) {
                                            break L25;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      var15 = ((np) this).field_e[var14_int];
                                      var16 = ((np) this).field_e[1 + var14_int];
                                      var17 = var15;
                                      L26: while (true) {
                                        if ((var17 ^ -1) <= (var16 ^ -1)) {
                                          break L24;
                                        } else {
                                          var18 = -1 + ((np) this).field_q[var17];
                                          if ((var18 ^ -1) != 0) {
                                            L27: {
                                              if ((param4 ^ -1) == -1) {
                                                break L27;
                                              } else {
                                                var19 = qu.field_b[param4];
                                                var20 = qu.field_d[param4];
                                                var21 = 16383 + ((np) this).field_E[var18] * var20 + var19 * ((np) this).field_Y[var18] >> 1208636462;
                                                ((np) this).field_Y[var18] = (short)(-(var19 * ((np) this).field_E[var18]) + (var20 * ((np) this).field_Y[var18] - -16383) >> 670421070);
                                                ((np) this).field_E[var18] = (short)var21;
                                                break L27;
                                              }
                                            }
                                            L28: {
                                              if (0 != param2) {
                                                var19 = qu.field_b[param2];
                                                var20 = qu.field_d[param2];
                                                var21 = var20 * ((np) this).field_Y[var18] - var19 * ((np) this).field_cb[var18] - -16383 >> 2059641422;
                                                ((np) this).field_cb[var18] = (short)(16383 + (((np) this).field_cb[var18] * var20 + ((np) this).field_Y[var18] * var19) >> 238391182);
                                                ((np) this).field_Y[var18] = (short)var21;
                                                break L28;
                                              } else {
                                                break L28;
                                              }
                                            }
                                            L29: {
                                              if ((param3 ^ -1) == -1) {
                                                break L29;
                                              } else {
                                                var19 = qu.field_b[param3];
                                                var20 = qu.field_d[param3];
                                                var21 = 16383 + ((np) this).field_cb[var18] * var19 - -(var20 * ((np) this).field_E[var18]) >> 1593143982;
                                                ((np) this).field_cb[var18] = (short)(((np) this).field_cb[var18] * var20 + (-(var19 * ((np) this).field_E[var18]) + 16383) >> 1390824398);
                                                ((np) this).field_E[var18] = (short)var21;
                                                break L29;
                                              }
                                            }
                                            var17++;
                                            continue L26;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                    var13++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L20;
                          }
                        }
                      } else {
                        break L6;
                      }
                    } else {
                      L30: {
                        var11 = param1[var10];
                        if (((np) this).field_d.length > var11) {
                          var12 = ((np) this).field_d[var11];
                          var13 = 0;
                          L31: while (true) {
                            if ((var13 ^ -1) <= (var12.length ^ -1)) {
                              break L30;
                            } else {
                              L32: {
                                L33: {
                                  var14_int = var12[var13];
                                  if (null == ((np) this).field_db) {
                                    break L33;
                                  } else {
                                    if (-1 == (((np) this).field_db[var14_int] & param6 ^ -1)) {
                                      break L32;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                L34: {
                                  ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] - rp.field_i;
                                  ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] - via.field_e;
                                  ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] - dj.field_b;
                                  if (-1 != (param4 ^ -1)) {
                                    var15 = qu.field_b[param4];
                                    var16 = qu.field_d[param4];
                                    var17 = var15 * ((np) this).field_K[var14_int] - (-(((np) this).field_P[var14_int] * var16) - 16383) >> 1403726254;
                                    ((np) this).field_K[var14_int] = 16383 + (var16 * ((np) this).field_K[var14_int] + -(var15 * ((np) this).field_P[var14_int])) >> -1429456306;
                                    ((np) this).field_P[var14_int] = var17;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                L35: {
                                  if ((param2 ^ -1) != -1) {
                                    var15 = qu.field_b[param2];
                                    var16 = qu.field_d[param2];
                                    var17 = 16383 + (var16 * ((np) this).field_K[var14_int] + -(((np) this).field_A[var14_int] * var15)) >> -1602330834;
                                    ((np) this).field_A[var14_int] = 16383 + (var15 * ((np) this).field_K[var14_int] + var16 * ((np) this).field_A[var14_int]) >> -2069403378;
                                    ((np) this).field_K[var14_int] = var17;
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                                L36: {
                                  if (param3 == 0) {
                                    break L36;
                                  } else {
                                    var15 = qu.field_b[param3];
                                    var16 = qu.field_d[param3];
                                    var17 = 16383 + ((np) this).field_P[var14_int] * var16 + var15 * ((np) this).field_A[var14_int] >> -217774674;
                                    ((np) this).field_A[var14_int] = 16383 + var16 * ((np) this).field_A[var14_int] + -(((np) this).field_P[var14_int] * var15) >> 609400782;
                                    ((np) this).field_P[var14_int] = var17;
                                    break L36;
                                  }
                                }
                                ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] + rp.field_i;
                                ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] + via.field_e;
                                ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] + dj.field_b;
                                break L32;
                              }
                              var13++;
                              continue L31;
                            }
                          }
                        } else {
                          break L30;
                        }
                      }
                      var10++;
                      continue L19;
                    }
                  }
                }
              }
              return;
            } else {
              if (param0 != 3) {
                if (param0 != 5) {
                  if (-8 != (param0 ^ -1)) {
                    if (param0 != 8) {
                      if (param0 == 10) {
                        L37: {
                          if (((np) this).field_C != null) {
                            var10 = 0;
                            L38: while (true) {
                              if ((var9_int ^ -1) >= (var10 ^ -1)) {
                                break L37;
                              } else {
                                L39: {
                                  var11 = param1[var10];
                                  if (var11 >= ((np) this).field_C.length) {
                                    break L39;
                                  } else {
                                    var12 = ((np) this).field_C[var11];
                                    var13 = 0;
                                    L40: while (true) {
                                      if (var13 >= var12.length) {
                                        break L39;
                                      } else {
                                        var14 = ((np) this).field_f[var12[var13]];
                                        var14.field_b = var14.field_b * param2 >> -1560528921;
                                        var14.field_f = param3 * var14.field_f >> 2147322599;
                                        var13++;
                                        continue L40;
                                      }
                                    }
                                  }
                                }
                                var10++;
                                continue L38;
                              }
                            }
                          } else {
                            break L37;
                          }
                        }
                        return;
                      } else {
                        if (param0 != 9) {
                          return;
                        } else {
                          L41: {
                            if (null != ((np) this).field_C) {
                              var10 = 0;
                              L42: while (true) {
                                if (var9_int <= var10) {
                                  break L41;
                                } else {
                                  L43: {
                                    var11 = param1[var10];
                                    if (var11 < ((np) this).field_C.length) {
                                      var12 = ((np) this).field_C[var11];
                                      var13 = 0;
                                      L44: while (true) {
                                        if ((var12.length ^ -1) >= (var13 ^ -1)) {
                                          break L43;
                                        } else {
                                          var14 = ((np) this).field_f[var12[var13]];
                                          var14.field_g = 16383 & param2 + var14.field_g;
                                          var13++;
                                          continue L44;
                                        }
                                      }
                                    } else {
                                      break L43;
                                    }
                                  }
                                  var10++;
                                  continue L42;
                                }
                              }
                            } else {
                              break L41;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L45: {
                        if (((np) this).field_C == null) {
                          break L45;
                        } else {
                          var10 = 0;
                          L46: while (true) {
                            if ((var10 ^ -1) <= (var9_int ^ -1)) {
                              break L45;
                            } else {
                              L47: {
                                var11 = param1[var10];
                                if ((((np) this).field_C.length ^ -1) >= (var11 ^ -1)) {
                                  break L47;
                                } else {
                                  var12 = ((np) this).field_C[var11];
                                  var13 = 0;
                                  L48: while (true) {
                                    if ((var13 ^ -1) <= (var12.length ^ -1)) {
                                      break L47;
                                    } else {
                                      var14 = ((np) this).field_f[var12[var13]];
                                      var14.field_h = var14.field_h + param2;
                                      var14.field_a = var14.field_a + param3;
                                      var13++;
                                      continue L48;
                                    }
                                  }
                                }
                              }
                              var10++;
                              continue L46;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L49: {
                      if (null == ((np) this).field_j) {
                        break L49;
                      } else {
                        var10 = 0;
                        L50: while (true) {
                          if ((var10 ^ -1) <= (var9_int ^ -1)) {
                            if (null != ((np) this).field_r) {
                              var10 = 0;
                              L51: while (true) {
                                if (var10 >= ((np) this).field_G) {
                                  break L49;
                                } else {
                                  var11_ref_pm = ((np) this).field_r[var10];
                                  var12_ref = ((np) this).field_f[var10];
                                  var12_ref.field_c = cla.field_m[((np) this).field_X[var11_ref_pm.field_l] & 65535] & 16777215 | var12_ref.field_c & -16777216;
                                  var10++;
                                  continue L51;
                                }
                              }
                            } else {
                              break L49;
                            }
                          } else {
                            L52: {
                              var11 = param1[var10];
                              if ((var11 ^ -1) > (((np) this).field_j.length ^ -1)) {
                                var12 = ((np) this).field_j[var11];
                                var13 = 0;
                                L53: while (true) {
                                  if ((var12.length ^ -1) >= (var13 ^ -1)) {
                                    break L52;
                                  } else {
                                    L54: {
                                      L55: {
                                        var14_int = var12[var13];
                                        if (((np) this).field_fb == null) {
                                          break L55;
                                        } else {
                                          if ((((np) this).field_fb[var14_int] & param6) != 0) {
                                            break L55;
                                          } else {
                                            break L54;
                                          }
                                        }
                                      }
                                      L56: {
                                        var15 = ((np) this).field_X[var14_int] & 65535;
                                        var16 = (64685 & var15) >> 243689802;
                                        var17 = 7 & var15 >> -83060601;
                                        var16 = 63 & param2 + var16;
                                        var17 = var17 + param3 / 4;
                                        var18 = var15 & 127;
                                        var18 = var18 + param4;
                                        if (0 <= var17) {
                                          if (7 < var17) {
                                            var17 = 7;
                                            break L56;
                                          } else {
                                            break L56;
                                          }
                                        } else {
                                          var17 = 0;
                                          break L56;
                                        }
                                      }
                                      L57: {
                                        if (-1 < (var18 ^ -1)) {
                                          var18 = 0;
                                          break L57;
                                        } else {
                                          if (127 >= var18) {
                                            break L57;
                                          } else {
                                            var18 = 127;
                                            break L57;
                                          }
                                        }
                                      }
                                      ((np) this).field_X[var14_int] = (short)fh.a(var18, fh.a(var17 << -655481913, var16 << -687474934));
                                      if (null != ((np) this).field_kb) {
                                        ((np) this).field_kb.field_d = null;
                                        break L54;
                                      } else {
                                        break L54;
                                      }
                                    }
                                    var13++;
                                    continue L53;
                                  }
                                }
                              } else {
                                break L52;
                              }
                            }
                            var10++;
                            continue L50;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L58: {
                    if (((np) this).field_j != null) {
                      var10 = 0;
                      L59: while (true) {
                        if ((var10 ^ -1) <= (var9_int ^ -1)) {
                          if (((np) this).field_r != null) {
                            var10 = 0;
                            L60: while (true) {
                              if ((var10 ^ -1) <= (((np) this).field_G ^ -1)) {
                                break L58;
                              } else {
                                var11_ref_pm = ((np) this).field_r[var10];
                                var12_ref = ((np) this).field_f[var10];
                                var12_ref.field_c = -(((np) this).field_o[var11_ref_pm.field_l] & 255) + 255 << -2011390920 | 16777215 & var12_ref.field_c;
                                var10++;
                                continue L60;
                              }
                            }
                          } else {
                            break L58;
                          }
                        } else {
                          L61: {
                            var11 = param1[var10];
                            if (((np) this).field_j.length <= var11) {
                              break L61;
                            } else {
                              var12 = ((np) this).field_j[var11];
                              var13 = 0;
                              L62: while (true) {
                                if ((var12.length ^ -1) >= (var13 ^ -1)) {
                                  break L61;
                                } else {
                                  L63: {
                                    L64: {
                                      var14_int = var12[var13];
                                      if (null == ((np) this).field_fb) {
                                        break L64;
                                      } else {
                                        if (0 != (param6 & ((np) this).field_fb[var14_int])) {
                                          break L64;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                    L65: {
                                      var15 = param2 * 8 + (((np) this).field_o[var14_int] & 255);
                                      if ((var15 ^ -1) > -1) {
                                        var15 = 0;
                                        break L65;
                                      } else {
                                        if (-256 > (var15 ^ -1)) {
                                          var15 = 255;
                                          break L65;
                                        } else {
                                          break L65;
                                        }
                                      }
                                    }
                                    ((np) this).field_o[var14_int] = (byte)var15;
                                    if (null == ((np) this).field_kb) {
                                      break L63;
                                    } else {
                                      ((np) this).field_kb.field_d = null;
                                      break L63;
                                    }
                                  }
                                  var13++;
                                  continue L62;
                                }
                              }
                            }
                          }
                          var10++;
                          continue L59;
                        }
                      }
                    } else {
                      break L58;
                    }
                  }
                  return;
                }
              } else {
                L66: {
                  if (param7 != null) {
                    L67: {
                      var10 = param7[9] << -114422364;
                      var11 = param7[10] << 1146698980;
                      var12_int = param7[11] << -1175513820;
                      var13 = param7[12] << 1125017412;
                      var14_int = param7[13] << 1544675492;
                      var15 = param7[14] << 1462946276;
                      if (vea.field_b) {
                        var16 = 8192 + (param7[0] * rp.field_i - -(param7[3] * via.field_e) - -(dj.field_b * param7[6])) >> -1204524114;
                        var17 = 8192 + (via.field_e * param7[4] + (param7[1] * rp.field_i - -(param7[7] * dj.field_b))) >> 256708334;
                        var18 = 8192 + (via.field_e * param7[5] + rp.field_i * param7[2]) - -(dj.field_b * param7[8]) >> 103396014;
                        var17 = var17 + var14_int;
                        var16 = var16 + var13;
                        via.field_e = var17;
                        rp.field_i = var16;
                        var18 = var18 + var15;
                        vea.field_b = false;
                        dj.field_b = var18;
                        break L67;
                      } else {
                        break L67;
                      }
                    }
                    var16 = param2 << 1063809167 >> 1248565959;
                    var17 = param3 << -1064652305 >> 927631623;
                    var18 = param4 << -1297835473 >> -486422137;
                    var19 = 8192 + var16 * -rp.field_i >> 1629940238;
                    var20 = var17 * -via.field_e - -8192 >> -1537688594;
                    var21 = 8192 + var18 * -dj.field_b >> -1855396018;
                    var22 = var19 - -rp.field_i;
                    var23 = var20 + via.field_e;
                    var24 = var21 + dj.field_b;
                    var25 = new int[9];
                    var25[0] = var16 * param7[0] - -8192 >> 43373806;
                    var25[2] = var16 * param7[6] - -8192 >> 2114323598;
                    var25[1] = 8192 + param7[3] * var16 >> 1418955022;
                    var25[3] = 8192 + param7[1] * var17 >> 1158516718;
                    var25[6] = param7[2] * var18 + 8192 >> 416991278;
                    var25[4] = 8192 + param7[4] * var17 >> 1818694478;
                    var25[5] = 8192 + var17 * param7[7] >> -742667314;
                    var25[8] = 8192 + param7[8] * var18 >> -966335570;
                    var25[7] = 8192 + var18 * param7[5] >> 2098064910;
                    var26 = var16 * var13 + 8192 >> 822715438;
                    var27 = 8192 + var17 * var14_int >> 126403982;
                    var27 = var27 + var23;
                    var28 = var18 * var15 + 8192 >> -1596513042;
                    var26 = var26 + var22;
                    var28 = var28 + var24;
                    var29 = new int[9];
                    var30 = 0;
                    L68: while (true) {
                      if (3 <= var30) {
                        var30 = 8192 + var26 * param7[0] + var27 * param7[1] + var28 * param7[2] >> -615909426;
                        var31 = 8192 + (var28 * param7[5] + (var26 * param7[3] + param7[4] * var27)) >> -456758482;
                        var30 = var30 + var10;
                        var31 = var31 + var11;
                        var32 = 8192 + (var28 * param7[8] + var26 * param7[6] + var27 * param7[7]) >> -379422770;
                        var32 = var32 + var12_int;
                        var33 = 0;
                        L69: while (true) {
                          if ((var33 ^ -1) <= (var9_int ^ -1)) {
                            break L66;
                          } else {
                            L70: {
                              var34 = param1[var33];
                              if ((var34 ^ -1) > (((np) this).field_d.length ^ -1)) {
                                var35 = ((np) this).field_d[var34];
                                var36 = 0;
                                L71: while (true) {
                                  if ((var36 ^ -1) <= (var35.length ^ -1)) {
                                    break L70;
                                  } else {
                                    L72: {
                                      L73: {
                                        var37 = var35[var36];
                                        if (null == ((np) this).field_db) {
                                          break L73;
                                        } else {
                                          if ((param6 & ((np) this).field_db[var37] ^ -1) == -1) {
                                            break L72;
                                          } else {
                                            break L73;
                                          }
                                        }
                                      }
                                      var38 = ((np) this).field_A[var37] * var29[2] + (((np) this).field_P[var37] * var29[0] + var29[1] * ((np) this).field_K[var37] - -8192) >> 1024074446;
                                      var39 = 8192 + (((np) this).field_K[var37] * var29[4] + ((np) this).field_P[var37] * var29[3] + ((np) this).field_A[var37] * var29[5]) >> -501198002;
                                      var38 = var38 + var30;
                                      var39 = var39 + var31;
                                      var40 = 8192 + (var29[8] * ((np) this).field_A[var37] + var29[6] * ((np) this).field_P[var37]) + ((np) this).field_K[var37] * var29[7] >> -407445266;
                                      ((np) this).field_P[var37] = var38;
                                      var40 = var40 + var32;
                                      ((np) this).field_K[var37] = var39;
                                      ((np) this).field_A[var37] = var40;
                                      break L72;
                                    }
                                    var36++;
                                    continue L71;
                                  }
                                }
                              } else {
                                break L70;
                              }
                            }
                            var33++;
                            continue L69;
                          }
                        }
                      } else {
                        var31 = 0;
                        L74: while (true) {
                          if (var31 >= 3) {
                            var30++;
                            continue L68;
                          } else {
                            var32 = 0;
                            var33 = 0;
                            L75: while (true) {
                              if ((var33 ^ -1) <= -4) {
                                var29[3 * var30 - -var31] = var32 + 8192 >> -1436592082;
                                var31++;
                                continue L74;
                              } else {
                                var32 = var32 + var25[var31 + 3 * var33] * param7[var33 + var30 * 3];
                                var33++;
                                continue L75;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var10 = 0;
                    L76: while (true) {
                      if ((var10 ^ -1) <= (var9_int ^ -1)) {
                        break L66;
                      } else {
                        L77: {
                          var11 = param1[var10];
                          if (((np) this).field_d.length > var11) {
                            var12 = ((np) this).field_d[var11];
                            var13 = 0;
                            L78: while (true) {
                              if (var13 >= var12.length) {
                                break L77;
                              } else {
                                L79: {
                                  L80: {
                                    var14_int = var12[var13];
                                    if (null == ((np) this).field_db) {
                                      break L80;
                                    } else {
                                      if (0 != (((np) this).field_db[var14_int] & param6)) {
                                        break L80;
                                      } else {
                                        break L79;
                                      }
                                    }
                                  }
                                  ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] - rp.field_i;
                                  ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] - via.field_e;
                                  ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] - dj.field_b;
                                  ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] * param2 >> 1763616103;
                                  ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] * param3 >> 792956295;
                                  ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] * param4 >> -750914169;
                                  ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] + rp.field_i;
                                  ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] + via.field_e;
                                  ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] + dj.field_b;
                                  break L79;
                                }
                                var13++;
                                continue L78;
                              }
                            }
                          } else {
                            break L77;
                          }
                        }
                        var10++;
                        continue L76;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          param4 = param4 << 4;
          param2 = param2 << 4;
          param3 = param3 << 4;
          rp.field_i = 0;
          var10 = 0;
          dj.field_b = 0;
          via.field_e = 0;
          var11 = 0;
          L81: while (true) {
            if ((var9_int ^ -1) >= (var11 ^ -1)) {
              L82: {
                if (-1 > (var10 ^ -1)) {
                  via.field_e = param3 + via.field_e / var10;
                  dj.field_b = dj.field_b / var10 + param4;
                  rp.field_i = param2 + rp.field_i / var10;
                  vea.field_b = true;
                  break L82;
                } else {
                  via.field_e = param3;
                  dj.field_b = param4;
                  rp.field_i = param2;
                  break L82;
                }
              }
              return;
            } else {
              L83: {
                var12_int = param1[var11];
                if ((var12_int ^ -1) > (((np) this).field_d.length ^ -1)) {
                  var13_ref_int__ = ((np) this).field_d[var12_int];
                  var14_int = 0;
                  L84: while (true) {
                    if (var14_int >= var13_ref_int__.length) {
                      break L83;
                    } else {
                      L85: {
                        L86: {
                          var15 = var13_ref_int__[var14_int];
                          if (null == ((np) this).field_db) {
                            break L86;
                          } else {
                            if (-1 != (param6 & ((np) this).field_db[var15] ^ -1)) {
                              break L86;
                            } else {
                              break L85;
                            }
                          }
                        }
                        rp.field_i = rp.field_i + ((np) this).field_P[var15];
                        via.field_e = via.field_e + ((np) this).field_K[var15];
                        dj.field_b = dj.field_b + ((np) this).field_A[var15];
                        var10++;
                        break L85;
                      }
                      var14_int++;
                      continue L84;
                    }
                  }
                } else {
                  break L83;
                }
              }
              var11++;
              continue L81;
            }
          }
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 <= -19) {
                break L0;
              } else {
                field_m = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var1_int = jv.d(-77);
          var2 = za.a(18998);
          aoa.field_b.a((byte) 57, var1_int + (jf.field_q << -1436062303), -gm.field_m + wp.field_b, wt.field_a - jf.field_q, (gm.field_m << 301963873) + var2);
          mi.a(125);
        }
    }

    private final void b(byte param0) {
        RuntimeException var2 = null;
        oba var2_ref = null;
        int var3 = 0;
        pm var4 = null;
        fd var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        cka stackIn_6_0 = null;
        cka stackIn_8_0 = null;
        cka stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        byte stackIn_22_0 = 0;
        cka stackOut_5_0 = null;
        cka stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cka stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        byte stackOut_21_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != ((np) this).field_r) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_ref = ((np) this).field_R.field_mc;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((np) this).field_R.u(28630);
                        stackOut_5_0 = ((np) this).field_R;
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (((np) this).field_s) {
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
                        stackOut_6_0 = (cka) (Object) stackIn_6_0;
                        stackOut_6_1 = 1;
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (cka) (Object) stackIn_8_0;
                        stackOut_8_1 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((cka) (Object) stackIn_9_0).a(stackIn_9_1 != 0, false);
                        ((np) this).field_R.a(param0 ^ -35, false);
                        ((np) this).field_R.a((tj) null, ((np) this).field_R.field_Rb, (tj) null, -114, ((np) this).field_R.field_Bc);
                        var3 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var3 ^ -1) <= (((np) this).field_G ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4 = ((np) this).field_r[var3];
                        var5 = ((np) this).field_f[var3];
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!var4.field_g) {
                            statePc = 18;
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((np) this).field_R.f()) {
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = (float)(((np) this).field_P[var4.field_b] + ((np) this).field_P[var4.field_k] + ((np) this).field_P[var4.field_m]) * 0.3333333134651184f;
                        var7 = 0.3333333134651184f * (float)(((np) this).field_K[var4.field_b] + ((np) this).field_K[var4.field_k] + ((np) this).field_K[var4.field_m]);
                        var8 = (float)(((np) this).field_A[var4.field_k] + ((np) this).field_A[var4.field_m] + ((np) this).field_A[var4.field_b]) * 0.3333333134651184f;
                        var9 = aka.field_B + (var8 * mu.field_ub + (eqa.field_a * var7 + var6 * is.field_Ab));
                        var10 = ef.field_s + (var6 * qi.field_L + nw.field_u * var7 + bva.field_c * var8);
                        var11 = bja.field_b + (kka.field_q * var8 + (var7 * it.field_a + var6 * roa.field_u));
                        var12 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + (var10 * var10 + var9 * var9)))) * (float)var4.field_j;
                        var2_ref.a(var5.field_g, var12 * var11 + -var11, var9 + (float)var5.field_h - var9 * var12, var4.field_e * var5.field_f >> -786865721, (byte) -60, var4.field_i * var5.field_b >> 1847323719, var12 * var10 + (-var10 + (float)var5.field_a));
                        ((np) this).field_R.a(var2_ref, 0);
                        var13 = var5.field_c;
                        jaggl.OpenGL.glColor4ub((byte)(var13 >> 441626224), (byte)(var13 >> 2136262376), (byte)var13, (byte)(var13 >> 683812344));
                        ((np) this).field_R.c((int) var4.field_f, 32677);
                        ((np) this).field_R.a((byte) 94, (int) var4.field_c);
                        ((np) this).field_R.a(0, 4, 7, true);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((np) this).field_R.a(true, false);
                        ((np) this).field_R.n((byte) -65);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = param0;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 == -30) {
                            statePc = 28;
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
                        ((np) this).a(-99, (int[]) null, -39, -40, 4, -64, false);
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
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "np.F(" + param0 + 41);
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(gda param0, el param1, int param2) {
        RuntimeException var4 = null;
        oba var4_ref = null;
        oba var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        Object stackOut_34_0 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var24 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((np) this).field_L == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var4_ref = ((np) this).field_R.field_jd;
                        var5 = (oba) (Object) param0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((np) this).field_l) {
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
                        this.c(2709);
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
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        bja.field_b = var4_ref.field_o + (var4_ref.field_j * var5.field_m + var4_ref.field_h * var5.field_p + var4_ref.field_q * var5.field_o);
                        it.field_a = var5.field_k * var4_ref.field_j + var4_ref.field_h * var5.field_r + var4_ref.field_q * var5.field_h;
                        var6 = bja.field_b + (float)((np) this).field_eb * it.field_a;
                        var7 = bja.field_b + it.field_a * (float)((np) this).field_v;
                        if (var7 >= var6) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = var7 - (float)((np) this).field_M;
                        var9 = (float)((np) this).field_M + var6;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = var7 + (float)((np) this).field_M;
                        var8 = (float)(-((np) this).field_M) + var6;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8 >= ((np) this).field_R.field_u) {
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
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        if ((float)((np) this).field_R.field_Gc < var9) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        eqa.field_a = var5.field_h * var4_ref.field_s + (var5.field_r * var4_ref.field_k + var5.field_k * var4_ref.field_l);
                        aka.field_B = var5.field_m * var4_ref.field_l + var5.field_p * var4_ref.field_k + var4_ref.field_s * var5.field_o + var4_ref.field_m;
                        var10 = aka.field_B + (float)((np) this).field_eb * eqa.field_a;
                        var11 = eqa.field_a * (float)((np) this).field_v + aka.field_B;
                        if (var10 > var11) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = (float)((np) this).field_R.field_W * (var11 + (float)((np) this).field_M);
                        var12 = (var10 - (float)((np) this).field_M) * (float)((np) this).field_R.field_W;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var13 = ((float)((np) this).field_M + var10) * (float)((np) this).field_R.field_W;
                        var12 = ((float)(-((np) this).field_M) + var11) * (float)((np) this).field_R.field_W;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((np) this).field_R.field_od > var12 / var9) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return;
                }
                case 23: {
                    try {
                        if (var13 / var9 > ((np) this).field_R.field_s) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return;
                }
                case 25: {
                    try {
                        nw.field_u = var4_ref.field_r * var5.field_r + var4_ref.field_i * var5.field_k + var5.field_h * var4_ref.field_g;
                        ef.field_s = var5.field_o * var4_ref.field_g + (var5.field_m * var4_ref.field_i + var5.field_p * var4_ref.field_r) + var4_ref.field_p;
                        var14 = ef.field_s + (float)((np) this).field_eb * nw.field_u;
                        var15 = ef.field_s + nw.field_u * (float)((np) this).field_v;
                        if (var15 >= var14) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var17 = (float)((np) this).field_R.field_kb * (var14 + (float)((np) this).field_M);
                        var16 = (float)((np) this).field_R.field_kb * (var15 - (float)((np) this).field_M);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var16 = (float)((np) this).field_R.field_kb * ((float)(-((np) this).field_M) + var14);
                        var17 = (float)((np) this).field_R.field_kb * ((float)((np) this).field_M + var15);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((np) this).field_R.field_Db > var16 / var9) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return;
                }
                case 30: {
                    try {
                        if (((np) this).field_R.field_nd >= var17 / var9) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return;
                }
                case 33: {
                    try {
                        if (param1 != null) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = this;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (((np) this).field_r == null) {
                            statePc = 41;
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
                case 38: {
                    try {
                        is.field_Ab = var5.field_i * var4_ref.field_k + var5.field_l * var4_ref.field_l + var4_ref.field_s * var5.field_j;
                        roa.field_u = var4_ref.field_q * var5.field_j + (var5.field_l * var4_ref.field_j + var5.field_i * var4_ref.field_h);
                        kka.field_q = var4_ref.field_q * var5.field_q + (var5.field_g * var4_ref.field_h + var4_ref.field_j * var5.field_s);
                        mu.field_ub = var4_ref.field_s * var5.field_q + (var4_ref.field_l * var5.field_s + var5.field_g * var4_ref.field_k);
                        qi.field_L = var5.field_j * var4_ref.field_g + (var5.field_i * var4_ref.field_r + var4_ref.field_i * var5.field_l);
                        bva.field_c = var5.field_s * var4_ref.field_i + var4_ref.field_r * var5.field_g + var5.field_q * var4_ref.field_g;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param1 == null) {
                            statePc = 68;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var18 = 0;
                        var19 = 1;
                        var20 = ((np) this).field_U + ((np) this).field_T >> -1924729023;
                        var21 = ((np) this).field_k + ((np) this).field_S >> 417397249;
                        var22 = (int)((float)var21 * kka.field_q + (it.field_a * (float)((np) this).field_eb + ((float)var20 * roa.field_u + bja.field_b)));
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((((np) this).field_R.field_Gc ^ -1) < (var22 ^ -1)) {
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
                        statePc = 47;
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
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var18 = 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var23 = (int)(bja.field_b + roa.field_u * (float)var20 + it.field_a * (float)((np) this).field_v + (float)var21 * kka.field_q);
                        if (var23 >= ((np) this).field_R.field_Gc) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var18 = 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var18 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var22 >= ((np) this).field_R.field_Gc) {
                            statePc = 58;
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
                        if ((((np) this).field_R.field_Gc ^ -1) >= (var23 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
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
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var19 = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var22 ^ -1) <= (((np) this).field_R.field_Gc ^ -1)) {
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
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var23 < ((np) this).field_R.field_Gc) {
                            statePc = 64;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var19 == 0) {
                            statePc = 68;
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
                        if ((var23 ^ -1) <= (var22 ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
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
                        ((np) this).field_R.c(false);
                        ((np) this).field_R.b(var5, 117);
                        this.a(false);
                        ((np) this).field_R.n((byte) -96);
                        this.b((byte) -30);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    try {
                        stackOut_71_0 = (RuntimeException) var4;
                        stackOut_71_1 = new StringBuilder().append("np.N(");
                        stackIn_74_0 = stackOut_71_0;
                        stackIn_74_1 = stackOut_71_1;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        if (param0 == null) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                        stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
                        stackOut_72_2 = "{...}";
                        stackIn_75_0 = stackOut_72_0;
                        stackIn_75_1 = stackOut_72_1;
                        stackIn_75_2 = stackOut_72_2;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 74: {
                    stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
                    stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
                    stackOut_74_2 = "null";
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    stackIn_75_2 = stackOut_74_2;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    try {
                        stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
                        stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(44);
                        stackIn_78_0 = stackOut_75_0;
                        stackIn_78_1 = stackOut_75_1;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        if (param1 == null) {
                            statePc = 78;
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
                        stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
                        stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
                        stackOut_76_2 = "{...}";
                        stackIn_79_0 = stackOut_76_0;
                        stackIn_79_1 = stackOut_76_1;
                        stackIn_79_2 = stackOut_76_2;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 77: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 78: {
                    stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
                    stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
                    stackOut_78_2 = "null";
                    stackIn_79_0 = stackOut_78_0;
                    stackIn_79_1 = stackOut_78_1;
                    stackIn_79_2 = stackOut_78_2;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    throw tba.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + 44 + param2 + 41);
                }
                case 80: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b() {
    }

    final boolean NA() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((np) this).field_d != null) {
                            statePc = 4;
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
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var1_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((np) this).field_N ^ -1) >= (var1_int ^ -1)) {
                            statePc = 9;
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
                        ((np) this).field_P[var1_int] = ((np) this).field_P[var1_int] << 4;
                        ((np) this).field_K[var1_int] = ((np) this).field_K[var1_int] << 4;
                        ((np) this).field_A[var1_int] = ((np) this).field_A[var1_int] << 4;
                        var1_int++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
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
                        rp.field_i = 0;
                        dj.field_b = 0;
                        via.field_e = 0;
                        stackOut_9_0 = 1;
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
                    return stackIn_10_0 != 0;
                }
                case 11: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var1, "np.NA()");
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qf var12 = null;
        int var13_int = 0;
        short[] var13 = null;
        va var13_ref = null;
        short[] var14 = null;
        int var14_int = 0;
        short[] var15 = null;
        int var15_int = 0;
        byte[] var16 = null;
        int var16_int = 0;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        int var19 = 0;
        float var19_float = 0.0f;
        int var20 = 0;
        float var20_float = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        int var34 = 0;
        int var35 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        float stackIn_93_0 = 0.0f;
        float stackIn_113_0 = 0.0f;
        float stackIn_113_1 = 0.0f;
        float stackIn_114_0 = 0.0f;
        float stackIn_114_1 = 0.0f;
        float stackIn_115_0 = 0.0f;
        float stackIn_115_1 = 0.0f;
        float stackIn_115_2 = 0.0f;
        float stackIn_138_0 = 0.0f;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        float stackOut_92_0 = 0.0f;
        float stackOut_91_0 = 0.0f;
        float stackOut_112_0 = 0.0f;
        float stackOut_112_1 = 0.0f;
        float stackOut_114_0 = 0.0f;
        float stackOut_114_1 = 0.0f;
        float stackOut_114_2 = 0.0f;
        float stackOut_113_0 = 0.0f;
        float stackOut_113_1 = 0.0f;
        float stackOut_113_2 = 0.0f;
        float stackOut_137_0 = 0.0f;
        float stackOut_136_0 = 0.0f;
        L0: {
          L1: {
            var35 = TombRacer.field_G ? 1 : 0;
            if (((np) this).field_kb == null) {
              break L1;
            } else {
              if (((np) this).field_kb.field_d != null) {
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        L2: {
          L3: {
            var3_int = stackIn_5_0;
            if (null == ((np) this).field_F) {
              break L3;
            } else {
              if (null != ((np) this).field_F.field_d) {
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
          }
          stackOut_9_0 = 0;
          stackIn_10_0 = stackOut_9_0;
          break L2;
        }
        L4: {
          L5: {
            var4 = stackIn_10_0;
            if (null == ((np) this).field_g) {
              break L5;
            } else {
              if (((np) this).field_g.field_d != null) {
                break L5;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
          }
          stackOut_14_0 = 0;
          stackIn_15_0 = stackOut_14_0;
          break L4;
        }
        var5 = stackIn_15_0;
        if (param0 == 0) {
          L6: {
            L7: {
              if (((np) this).field_ab == null) {
                break L7;
              } else {
                if (((np) this).field_ab.field_d != null) {
                  break L7;
                } else {
                  stackOut_20_0 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  break L6;
                }
              }
            }
            stackOut_21_0 = 0;
            stackIn_22_0 = stackOut_21_0;
            break L6;
          }
          L8: {
            var6 = stackIn_22_0;
            if (!param1) {
              break L8;
            } else {
              L9: {
                stackOut_23_0 = var6;
                stackIn_26_0 = stackOut_23_0;
                stackIn_24_0 = stackOut_23_0;
                if ((8 & ((np) this).field_Z) == 0) {
                  stackOut_26_0 = stackIn_26_0;
                  stackOut_26_1 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  break L9;
                } else {
                  stackOut_24_0 = stackIn_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  stackOut_25_0 = stackIn_25_0;
                  stackOut_25_1 = 1;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  break L9;
                }
              }
              L10: {
                var6 = stackIn_27_0 & stackIn_27_1;
                stackOut_27_0 = var5;
                stackIn_29_0 = stackOut_27_0;
                stackIn_28_0 = stackOut_27_0;
                if ((((np) this).field_Z & 1) == 0) {
                  stackOut_29_0 = stackIn_29_0;
                  stackOut_29_1 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  break L10;
                } else {
                  stackOut_28_0 = stackIn_28_0;
                  stackOut_28_1 = 1;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  break L10;
                }
              }
              L11: {
                var5 = stackIn_30_0 & stackIn_30_1;
                stackOut_30_0 = var4;
                stackIn_32_0 = stackOut_30_0;
                stackIn_31_0 = stackOut_30_0;
                if (-1 == (4 & ((np) this).field_Z ^ -1)) {
                  stackOut_32_0 = stackIn_32_0;
                  stackOut_32_1 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  break L11;
                } else {
                  stackOut_31_0 = stackIn_31_0;
                  stackOut_31_1 = 1;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  break L11;
                }
              }
              L12: {
                var4 = stackIn_33_0 & stackIn_33_1;
                stackOut_33_0 = var3_int;
                stackIn_35_0 = stackOut_33_0;
                stackIn_34_0 = stackOut_33_0;
                if ((2 & ((np) this).field_Z ^ -1) == -1) {
                  stackOut_35_0 = stackIn_35_0;
                  stackOut_35_1 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  break L12;
                } else {
                  stackOut_34_0 = stackIn_34_0;
                  stackOut_34_1 = 1;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  break L12;
                }
              }
              var3_int = stackIn_36_0 & stackIn_36_1;
              break L8;
            }
          }
          L13: {
            var7 = 0;
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (var5 != 0) {
              var8 = var7;
              var7 = (byte)(var7 + 12);
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            var11 = 0;
            if (var3_int == 0) {
              break L14;
            } else {
              var9 = var7;
              var7 = (byte)(var7 + 4);
              break L14;
            }
          }
          L15: {
            if (var4 != 0) {
              var10 = var7;
              var7 = (byte)(var7 + 12);
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (var6 == 0) {
              break L16;
            } else {
              var11 = var7;
              var7 = (byte)(var7 + 8);
              break L16;
            }
          }
          if (-1 == (var7 ^ -1)) {
            return;
          } else {
            L17: {
              if ((((np) this).field_R.field_cb.field_g.length ^ -1) <= (((np) this).field_L * var7 ^ -1)) {
                ((np) this).field_R.field_cb.field_h = 0;
                break L17;
              } else {
                ((np) this).field_R.field_cb = new qf((((np) this).field_L + 100) * var7);
                break L17;
              }
            }
            L18: {
              var12 = ((np) this).field_R.field_cb;
              if (var5 == 0) {
                break L18;
              } else {
                if (((np) this).field_R.field_O) {
                  var13_int = 0;
                  L19: while (true) {
                    if ((var13_int ^ -1) <= (((np) this).field_lb ^ -1)) {
                      break L18;
                    } else {
                      var14_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_P[var13_int]);
                      var15_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_K[var13_int]);
                      var16_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_A[var13_int]);
                      var17_int = ((np) this).field_e[var13_int];
                      var18_int = ((np) this).field_e[1 + var13_int];
                      var19 = var17_int;
                      L20: while (true) {
                        L21: {
                          if (var19 >= var18_int) {
                            break L21;
                          } else {
                            var20 = ((np) this).field_q[var19] - 1;
                            if (-1 != var20) {
                              var12.field_h = var20 * var7;
                              var12.a(var14_int, (byte) -72);
                              var12.a(var15_int, (byte) -13);
                              var12.a(var16_int, (byte) 81);
                              var19++;
                              continue L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        var13_int++;
                        continue L19;
                      }
                    }
                  }
                } else {
                  var13_int = 0;
                  L22: while (true) {
                    if ((var13_int ^ -1) <= (((np) this).field_lb ^ -1)) {
                      break L18;
                    } else {
                      var14_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_P[var13_int]);
                      var15_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_K[var13_int]);
                      var16_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_A[var13_int]);
                      var17_int = ((np) this).field_e[var13_int];
                      var18_int = ((np) this).field_e[1 + var13_int];
                      var19 = var17_int;
                      L23: while (true) {
                        L24: {
                          if ((var18_int ^ -1) >= (var19 ^ -1)) {
                            break L24;
                          } else {
                            var20 = ((np) this).field_q[var19] - 1;
                            if (0 != (var20 ^ -1)) {
                              var12.field_h = var7 * var20;
                              var12.a((byte) -35, var14_int);
                              var12.a((byte) -35, var15_int);
                              var12.a((byte) -35, var16_int);
                              var19++;
                              continue L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        var13_int++;
                        continue L22;
                      }
                    }
                  }
                }
              }
            }
            L25: {
              if (var3_int == 0) {
                break L25;
              } else {
                if (null == ((np) this).field_F) {
                  L26: {
                    if (((np) this).field_i == null) {
                      var16 = ((np) this).field_O;
                      var13 = ((np) this).field_E;
                      var14 = ((np) this).field_Y;
                      var15 = ((np) this).field_cb;
                      break L26;
                    } else {
                      var16 = ((np) this).field_i.field_e;
                      var13 = ((np) this).field_i.field_d;
                      var14 = ((np) this).field_i.field_b;
                      var15 = ((np) this).field_i.field_f;
                      break L26;
                    }
                  }
                  var28 = ((np) this).field_R.field_Wb[0];
                  var29 = ((np) this).field_R.field_Wb[1];
                  var30 = ((np) this).field_R.field_Wb[2];
                  var31 = ((np) this).field_R.field_tc;
                  var32 = ((np) this).field_R.field_cd * 768.0f / (float)((np) this).field_h;
                  var33 = 768.0f * ((np) this).field_R.field_Sb / (float)((np) this).field_h;
                  var34 = 0;
                  L27: while (true) {
                    if ((((np) this).field_W ^ -1) >= (var34 ^ -1)) {
                      break L25;
                    } else {
                      L28: {
                        var24 = this.a(-2117016184, (int) ((np) this).field_X[var34], ((np) this).field_o[var34], ((np) this).field_I[var34], (int) ((np) this).field_B);
                        var20_float = (float)(var24 >>> -1389478568) * ((np) this).field_R.field_wc;
                        var22 = ((np) this).field_R.field_bc * (float)(255 & var24 >> -1368006712);
                        var21 = (float)(var24 >> -408436688 & 255) * ((np) this).field_R.field_Fb;
                        var23 = ((np) this).field_H[var34];
                        var17_int = (short)var16[var23];
                        if (var17_int == 0) {
                          var18 = ((float)var15[var23] * var30 + ((float)var14[var23] * var29 + var28 * (float)var13[var23])) * 0.0026041667442768812f;
                          break L28;
                        } else {
                          var18 = ((float)var15[var23] * var30 + ((float)var13[var23] * var28 + var29 * (float)var14[var23])) / (float)(var17_int * 256);
                          break L28;
                        }
                      }
                      L29: {
                        if (var18 < 0.0f) {
                          stackOut_92_0 = var33;
                          stackIn_93_0 = stackOut_92_0;
                          break L29;
                        } else {
                          stackOut_91_0 = var32;
                          stackIn_93_0 = stackOut_91_0;
                          break L29;
                        }
                      }
                      L30: {
                        var19_float = stackIn_93_0 * var18 + var31;
                        var25 = (int)(var20_float * var19_float);
                        var26 = (int)(var19_float * var21);
                        if ((var25 ^ -1) <= -1) {
                          if ((var25 ^ -1) >= -256) {
                            break L30;
                          } else {
                            var25 = 255;
                            break L30;
                          }
                        } else {
                          var25 = 0;
                          break L30;
                        }
                      }
                      L31: {
                        if (0 <= var26) {
                          if (255 >= var26) {
                            break L31;
                          } else {
                            var26 = 255;
                            break L31;
                          }
                        } else {
                          var26 = 0;
                          break L31;
                        }
                      }
                      L32: {
                        var27 = (int)(var19_float * var22);
                        var12.field_h = var9 - -(var23 * var7);
                        if (0 <= var27) {
                          if (255 < var27) {
                            var27 = 255;
                            break L32;
                          } else {
                            break L32;
                          }
                        } else {
                          var27 = 0;
                          break L32;
                        }
                      }
                      L33: {
                        var12.i(var25, param0 + 0);
                        var12.i(var26, 0);
                        var12.i(var27, 0);
                        var12.i(255 + -(((np) this).field_o[var34] & 255), 0);
                        var23 = ((np) this).field_z[var34];
                        var17_int = (short)var16[var23];
                        if (-1 == (var17_int ^ -1)) {
                          var18 = ((float)var13[var23] * var28 + var29 * (float)var14[var23] + (float)var15[var23] * var30) * 0.0026041667442768812f;
                          break L33;
                        } else {
                          var18 = (var30 * (float)var15[var23] + (var28 * (float)var13[var23] + var29 * (float)var14[var23])) / (float)(256 * var17_int);
                          break L33;
                        }
                      }
                      L34: {
                        stackOut_112_0 = var31;
                        stackOut_112_1 = var18;
                        stackIn_114_0 = stackOut_112_0;
                        stackIn_114_1 = stackOut_112_1;
                        stackIn_113_0 = stackOut_112_0;
                        stackIn_113_1 = stackOut_112_1;
                        if (0.0f <= var18) {
                          stackOut_114_0 = stackIn_114_0;
                          stackOut_114_1 = stackIn_114_1;
                          stackOut_114_2 = var32;
                          stackIn_115_0 = stackOut_114_0;
                          stackIn_115_1 = stackOut_114_1;
                          stackIn_115_2 = stackOut_114_2;
                          break L34;
                        } else {
                          stackOut_113_0 = stackIn_113_0;
                          stackOut_113_1 = stackIn_113_1;
                          stackOut_113_2 = var33;
                          stackIn_115_0 = stackOut_113_0;
                          stackIn_115_1 = stackOut_113_1;
                          stackIn_115_2 = stackOut_113_2;
                          break L34;
                        }
                      }
                      L35: {
                        var19_float = stackIn_115_0 + stackIn_115_1 * stackIn_115_2;
                        var25 = (int)(var20_float * var19_float);
                        var26 = (int)(var19_float * var21);
                        if ((var25 ^ -1) > -1) {
                          var25 = 0;
                          break L35;
                        } else {
                          if (255 < var25) {
                            var25 = 255;
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                      }
                      L36: {
                        var27 = (int)(var19_float * var22);
                        if ((var26 ^ -1) > -1) {
                          var26 = 0;
                          break L36;
                        } else {
                          if (255 < var26) {
                            var26 = 255;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                      }
                      L37: {
                        if (var27 < 0) {
                          var27 = 0;
                          break L37;
                        } else {
                          if (var27 <= 255) {
                            break L37;
                          } else {
                            var27 = 255;
                            break L37;
                          }
                        }
                      }
                      L38: {
                        var12.field_h = var23 * var7 + var9;
                        var12.i(var25, param0 + 0);
                        var12.i(var26, param0 ^ 0);
                        var12.i(var27, 0);
                        var12.i(255 - (255 & ((np) this).field_o[var34]), param0 + 0);
                        var23 = ((np) this).field_hb[var34];
                        var17_int = (short)var16[var23];
                        if (-1 == (var17_int ^ -1)) {
                          var18 = 0.0026041667442768812f * ((float)var13[var23] * var28 + var29 * (float)var14[var23] + (float)var15[var23] * var30);
                          break L38;
                        } else {
                          var18 = ((float)var15[var23] * var30 + (var29 * (float)var14[var23] + var28 * (float)var13[var23])) / (float)(var17_int * 256);
                          break L38;
                        }
                      }
                      L39: {
                        if (0.0f <= var18) {
                          stackOut_137_0 = var32;
                          stackIn_138_0 = stackOut_137_0;
                          break L39;
                        } else {
                          stackOut_136_0 = var33;
                          stackIn_138_0 = stackOut_136_0;
                          break L39;
                        }
                      }
                      L40: {
                        var19_float = stackIn_138_0 * var18 + var31;
                        var25 = (int)(var19_float * var20_float);
                        var26 = (int)(var19_float * var21);
                        if ((var25 ^ -1) > -1) {
                          var25 = 0;
                          break L40;
                        } else {
                          if ((var25 ^ -1) >= -256) {
                            break L40;
                          } else {
                            var25 = 255;
                            break L40;
                          }
                        }
                      }
                      L41: {
                        var27 = (int)(var22 * var19_float);
                        if ((var26 ^ -1) <= -1) {
                          if ((var26 ^ -1) < -256) {
                            var26 = 255;
                            break L41;
                          } else {
                            break L41;
                          }
                        } else {
                          var26 = 0;
                          break L41;
                        }
                      }
                      L42: {
                        if (0 <= var27) {
                          if (-256 <= (var27 ^ -1)) {
                            break L42;
                          } else {
                            var27 = 255;
                            break L42;
                          }
                        } else {
                          var27 = 0;
                          break L42;
                        }
                      }
                      var12.field_h = var9 + var7 * var23;
                      var12.i(var25, 0);
                      var12.i(var26, 0);
                      var12.i(var27, 0);
                      var12.i(-(((np) this).field_o[var34] & 255) + 255, 0);
                      var34++;
                      continue L27;
                    }
                  }
                } else {
                  var13_int = 0;
                  L43: while (true) {
                    if ((((np) this).field_W ^ -1) >= (var13_int ^ -1)) {
                      break L25;
                    } else {
                      var14_int = this.a(-2117016184, (int) ((np) this).field_X[var13_int], ((np) this).field_o[var13_int], ((np) this).field_I[var13_int], (int) ((np) this).field_B);
                      var12.field_h = var9 + var7 * ((np) this).field_H[var13_int];
                      var12.a(var14_int, (byte) 92);
                      var12.field_h = var7 * ((np) this).field_z[var13_int] + var9;
                      var12.a(var14_int, (byte) 91);
                      var12.field_h = var9 - -(((np) this).field_hb[var13_int] * var7);
                      var12.a(var14_int, (byte) 113);
                      var13_int++;
                      continue L43;
                    }
                  }
                }
              }
            }
            L44: {
              if (var4 == 0) {
                break L44;
              } else {
                L45: {
                  if (null == ((np) this).field_i) {
                    var15 = ((np) this).field_cb;
                    var14 = ((np) this).field_Y;
                    var13 = ((np) this).field_E;
                    var16 = ((np) this).field_O;
                    break L45;
                  } else {
                    var13 = ((np) this).field_i.field_d;
                    var16 = ((np) this).field_i.field_e;
                    var15 = ((np) this).field_i.field_f;
                    var14 = ((np) this).field_i.field_b;
                    break L45;
                  }
                }
                var17 = 3.0f / (float)((np) this).field_h;
                var12.field_h = var10;
                var18 = 3.0f / (float)(((np) this).field_h + ((np) this).field_h / 2);
                if (((np) this).field_R.field_O) {
                  var19 = 0;
                  L46: while (true) {
                    if (((np) this).field_L <= var19) {
                      break L44;
                    } else {
                      L47: {
                        var20 = var16[var19] & 255;
                        if ((var20 ^ -1) == -1) {
                          var12.a(17133, (float)var13[var19] * var18);
                          var12.a(17133, (float)var14[var19] * var18);
                          var12.a(17133, (float)var15[var19] * var18);
                          break L47;
                        } else {
                          var21 = var17 / (float)var20;
                          var12.a(17133, var21 * (float)var13[var19]);
                          var12.a(17133, (float)var14[var19] * var21);
                          var12.a(param0 + 17133, var21 * (float)var15[var19]);
                          break L47;
                        }
                      }
                      var12.field_h = var12.field_h + (-12 + var7);
                      var19++;
                      continue L46;
                    }
                  }
                } else {
                  var19 = 0;
                  L48: while (true) {
                    if ((((np) this).field_L ^ -1) >= (var19 ^ -1)) {
                      break L44;
                    } else {
                      L49: {
                        var20 = 255 & var16[var19];
                        if (-1 == (var20 ^ -1)) {
                          var12.a((byte) 114, var18 * (float)var13[var19]);
                          var12.a((byte) 114, (float)var14[var19] * var18);
                          var12.a((byte) 114, (float)var15[var19] * var18);
                          break L49;
                        } else {
                          var21 = var17 / (float)var20;
                          var12.a((byte) 114, var21 * (float)var13[var19]);
                          var12.a((byte) 114, (float)var14[var19] * var21);
                          var12.a((byte) 114, (float)var15[var19] * var21);
                          break L49;
                        }
                      }
                      var12.field_h = var12.field_h + (-12 + var7);
                      var19++;
                      continue L48;
                    }
                  }
                }
              }
            }
            L50: {
              if (var6 != 0) {
                var12.field_h = var11;
                if (!((np) this).field_R.field_O) {
                  var13_int = 0;
                  L51: while (true) {
                    if (((np) this).field_L <= var13_int) {
                      break L50;
                    } else {
                      var12.a((byte) 114, ((np) this).field_n[var13_int]);
                      var12.a((byte) 114, ((np) this).field_y[var13_int]);
                      var12.field_h = var12.field_h + (-8 + var7);
                      var13_int++;
                      continue L51;
                    }
                  }
                } else {
                  var13_int = 0;
                  L52: while (true) {
                    if ((((np) this).field_L ^ -1) >= (var13_int ^ -1)) {
                      break L50;
                    } else {
                      var12.a(17133, ((np) this).field_n[var13_int]);
                      var12.a(17133, ((np) this).field_y[var13_int]);
                      var12.field_h = var12.field_h + (var7 + -8);
                      var13_int++;
                      continue L52;
                    }
                  }
                }
              } else {
                break L50;
              }
            }
            L53: {
              var12.field_h = ((np) this).field_L * var7;
              if (!param1) {
                var13_ref = ((np) this).field_R.a(var12.field_h, var12.field_g, var7, false, (byte) 99);
                ((np) this).field_gb = true;
                break L53;
              } else {
                L54: {
                  if (((np) this).field_Q == null) {
                    ((np) this).field_Q = ((np) this).field_R.a(var12.field_h, var12.field_g, var7, true, (byte) 117);
                    break L54;
                  } else {
                    ((np) this).field_Q.a(var7, var12.field_h, (byte) -112, var12.field_g);
                    break L54;
                  }
                }
                ((np) this).field_Z = (byte) 0;
                var13_ref = ((np) this).field_Q;
                break L53;
              }
            }
            L55: {
              if (var5 != 0) {
                ((np) this).field_g.field_g = (byte) var8;
                ((np) this).field_g.field_d = var13_ref;
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              if (var6 == 0) {
                break L56;
              } else {
                ((np) this).field_ab.field_g = (byte) var11;
                ((np) this).field_ab.field_d = var13_ref;
                break L56;
              }
            }
            L57: {
              if (var3_int == 0) {
                break L57;
              } else {
                ((np) this).field_kb.field_g = (byte) var9;
                ((np) this).field_kb.field_d = var13_ref;
                break L57;
              }
            }
            L58: {
              if (var4 == 0) {
                break L58;
              } else {
                ((np) this).field_F.field_d = var13_ref;
                ((np) this).field_F.field_g = (byte) var10;
                break L58;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a() {
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        cka stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        cka stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        cka stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        cka stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_30_0 = 0;
        cka stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        cka stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        cka stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        cka stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        cka stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        cka stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        cka stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_29_0 = 0;
        cka stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        cka stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        cka stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((np) this).field_ib == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (((np) this).field_Z == 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a(0, true);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a(0, param0);
                        if (((np) this).field_w != null) {
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
                        statePc = 41;
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (null != ((np) this).field_w.field_a) {
                            statePc = 19;
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
                        stackOut_12_0 = this;
                        stackOut_12_1 = -24;
                        stackIn_17_0 = stackOut_12_0;
                        stackIn_17_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (0 == (((np) this).field_Z & 16)) {
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
                        stackOut_13_0 = this;
                        stackOut_13_1 = stackIn_13_1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
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
                        stackOut_15_0 = this;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = 1;
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
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.a((byte) stackIn_18_1, stackIn_18_2 != 0);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (((np) this).field_w.field_a == null) {
                            statePc = 41;
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
                        stackOut_20_0 = ((np) this).field_R;
                        stackOut_20_1 = 96;
                        stackIn_25_0 = stackOut_20_0;
                        stackIn_25_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (((np) this).field_F == null) {
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
                        stackOut_21_0 = (cka) (Object) stackIn_21_0;
                        stackOut_21_1 = stackIn_21_1;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
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
                        stackOut_23_0 = (cka) (Object) stackIn_23_0;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = 1;
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_26_2 = stackOut_23_2;
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
                        stackOut_25_0 = (cka) (Object) stackIn_25_0;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
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
                        ((cka) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2 != 0);
                        ((np) this).field_R.a(((np) this).field_kb, ((np) this).field_ab, ((np) this).field_F, -120, ((np) this).field_g);
                        var2_int = -1 + ((np) this).field_p.length;
                        var3 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var3 ^ -1) <= (var2_int ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4 = ((np) this).field_p[var3];
                        var5 = ((np) this).field_p[1 + var3];
                        var6 = 65535 & ((np) this).field_I[var4];
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = var6;
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
                        if ((stackIn_30_0 ^ -1) == -65536) {
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var6 = -1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = ((np) this).field_R;
                        stackOut_36_1 = 70;
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_39_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (null == ((np) this).field_F) {
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
                        stackOut_37_0 = (cka) (Object) stackIn_37_0;
                        stackOut_37_1 = stackIn_37_1;
                        stackOut_37_2 = 1;
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
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = (cka) (Object) stackIn_39_0;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((cka) (Object) stackIn_40_0).a((byte) stackIn_40_1, stackIn_40_2 != 0, var6);
                        ((np) this).field_R.a(3 * var4, 4, -513, ((np) this).field_w.field_a, 3 * (var5 - var4));
                        var3++;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.c((byte) 31);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "np.L(" + param0 + 41);
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void O(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = 0;
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
                        if (var4_int >= ((np) this).field_lb) {
                            statePc = 19;
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
                        stackOut_3_0 = param0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == 128) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
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
                        ((np) this).field_P[var4_int] = param0 * ((np) this).field_P[var4_int] >> -704502937;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-129 == (param1 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((np) this).field_K[var4_int] = param1 * ((np) this).field_K[var4_int] >> 1965436231;
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
                        statePc = 25;
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
                        if (param2 != 128) {
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
                        statePc = 18;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((np) this).field_A[var4_int] = ((np) this).field_A[var4_int] * param2 >> 1714908615;
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
                        var4_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((np) this).field_l = false;
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
                        if (((np) this).field_g == null) {
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
                        ((np) this).field_g.field_d = null;
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
                    throw tba.a((Throwable) (Object) runtimeException, "np.O(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        pm var10_ref_pm = null;
        int var11_int = 0;
        int[] var11 = null;
        fd var11_ref = null;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        int var13_int = 0;
        fd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = TombRacer.field_G ? 1 : 0;
        var8_int = param1.length;
        if (0 != param0) {
          if (-2 == (param0 ^ -1)) {
            param2 = param2 << 4;
            param3 = param3 << 4;
            param4 = param4 << 4;
            var9 = 0;
            L0: while (true) {
              if (var8_int <= var9) {
                return;
              } else {
                L1: {
                  var10 = param1[var9];
                  if ((var10 ^ -1) > (((np) this).field_d.length ^ -1)) {
                    var11 = ((np) this).field_d[var10];
                    var12 = 0;
                    L2: while (true) {
                      if (var12 >= var11.length) {
                        break L1;
                      } else {
                        var13_int = var11[var12];
                        ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] + param2;
                        ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] + param3;
                        ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] + param4;
                        var12++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                var9++;
                continue L0;
              }
            }
          } else {
            if (2 != param0) {
              if (-4 == (param0 ^ -1)) {
                var9 = 0;
                L3: while (true) {
                  if (var8_int <= var9) {
                    return;
                  } else {
                    L4: {
                      var10 = param1[var9];
                      if (((np) this).field_d.length > var10) {
                        var11 = ((np) this).field_d[var10];
                        var12 = 0;
                        L5: while (true) {
                          if (var11.length <= var12) {
                            break L4;
                          } else {
                            var13_int = var11[var12];
                            ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] - rp.field_i;
                            ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] - via.field_e;
                            ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] - dj.field_b;
                            ((np) this).field_P[var13_int] = param2 * ((np) this).field_P[var13_int] >> 22298791;
                            ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] * param3 >> -380331321;
                            ((np) this).field_A[var13_int] = param4 * ((np) this).field_A[var13_int] >> 594812679;
                            ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] + rp.field_i;
                            ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] + via.field_e;
                            ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] + dj.field_b;
                            var12++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var9++;
                    continue L3;
                  }
                }
              } else {
                if (5 != param0) {
                  if (-8 != (param0 ^ -1)) {
                    if (param0 != 8) {
                      if (param0 != 10) {
                        if ((param0 ^ -1) != -10) {
                          return;
                        } else {
                          L6: {
                            if (null != ((np) this).field_C) {
                              var9 = 0;
                              L7: while (true) {
                                if ((var9 ^ -1) <= (var8_int ^ -1)) {
                                  break L6;
                                } else {
                                  L8: {
                                    var10 = param1[var9];
                                    if ((((np) this).field_C.length ^ -1) < (var10 ^ -1)) {
                                      var11 = ((np) this).field_C[var10];
                                      var12 = 0;
                                      L9: while (true) {
                                        if (var11.length <= var12) {
                                          break L8;
                                        } else {
                                          var13 = ((np) this).field_f[var11[var12]];
                                          var13.field_g = 16383 & var13.field_g - -param2;
                                          var12++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                  var9++;
                                  continue L7;
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                          return;
                        }
                      } else {
                        L10: {
                          if (((np) this).field_C != null) {
                            var9 = 0;
                            L11: while (true) {
                              if ((var8_int ^ -1) >= (var9 ^ -1)) {
                                break L10;
                              } else {
                                L12: {
                                  var10 = param1[var9];
                                  if ((var10 ^ -1) > (((np) this).field_C.length ^ -1)) {
                                    var11 = ((np) this).field_C[var10];
                                    var12 = 0;
                                    L13: while (true) {
                                      if ((var12 ^ -1) <= (var11.length ^ -1)) {
                                        break L12;
                                      } else {
                                        var13 = ((np) this).field_f[var11[var12]];
                                        var13.field_f = param3 * var13.field_f >> 1239691559;
                                        var13.field_b = var13.field_b * param2 >> 873761959;
                                        var12++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    break L12;
                                  }
                                }
                                var9++;
                                continue L11;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                        return;
                      }
                    } else {
                      L14: {
                        if (null == ((np) this).field_C) {
                          break L14;
                        } else {
                          var9 = 0;
                          L15: while (true) {
                            if (var9 >= var8_int) {
                              break L14;
                            } else {
                              L16: {
                                var10 = param1[var9];
                                if (((np) this).field_C.length <= var10) {
                                  break L16;
                                } else {
                                  var11 = ((np) this).field_C[var10];
                                  var12 = 0;
                                  L17: while (true) {
                                    if (var11.length <= var12) {
                                      break L16;
                                    } else {
                                      var13 = ((np) this).field_f[var11[var12]];
                                      var13.field_h = var13.field_h + param2;
                                      var13.field_a = var13.field_a + param3;
                                      var12++;
                                      continue L17;
                                    }
                                  }
                                }
                              }
                              var9++;
                              continue L15;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L18: {
                      if (null != ((np) this).field_j) {
                        var9 = 0;
                        L19: while (true) {
                          if ((var8_int ^ -1) >= (var9 ^ -1)) {
                            if (((np) this).field_r != null) {
                              var9 = 0;
                              L20: while (true) {
                                if (((np) this).field_G <= var9) {
                                  break L18;
                                } else {
                                  var10_ref_pm = ((np) this).field_r[var9];
                                  var11_ref = ((np) this).field_f[var9];
                                  var11_ref.field_c = 16777215 & cla.field_m[((np) this).field_X[var10_ref_pm.field_l] & 65535] | -16777216 & var11_ref.field_c;
                                  var9++;
                                  continue L20;
                                }
                              }
                            } else {
                              break L18;
                            }
                          } else {
                            L21: {
                              var10 = param1[var9];
                              if ((var10 ^ -1) <= (((np) this).field_j.length ^ -1)) {
                                break L21;
                              } else {
                                var11 = ((np) this).field_j[var10];
                                var12 = 0;
                                L22: while (true) {
                                  if (var11.length <= var12) {
                                    if (var11.length <= 0) {
                                      break L21;
                                    } else {
                                      if (null != ((np) this).field_kb) {
                                        ((np) this).field_kb.field_d = null;
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  } else {
                                    L23: {
                                      var13_int = var11[var12];
                                      var14 = ((np) this).field_X[var13_int] & 65535;
                                      var15 = (var14 & 64694) >> 722944650;
                                      var16 = (var14 & 1011) >> 156860359;
                                      var16 = var16 + param3 / 4;
                                      var15 = 63 & param2 + var15;
                                      var17 = var14 & 127;
                                      if ((var16 ^ -1) > -1) {
                                        var16 = 0;
                                        break L23;
                                      } else {
                                        if (var16 > 7) {
                                          var16 = 7;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                    L24: {
                                      var17 = var17 + param4;
                                      if ((var17 ^ -1) <= -1) {
                                        if (-128 <= (var17 ^ -1)) {
                                          break L24;
                                        } else {
                                          var17 = 127;
                                          break L24;
                                        }
                                      } else {
                                        var17 = 0;
                                        break L24;
                                      }
                                    }
                                    ((np) this).field_X[var13_int] = (short)fh.a(fh.a(var16 << 108042887, var15 << 1314691114), var17);
                                    var12++;
                                    continue L22;
                                  }
                                }
                              }
                            }
                            var9++;
                            continue L19;
                          }
                        }
                      } else {
                        break L18;
                      }
                    }
                    return;
                  }
                } else {
                  L25: {
                    if (((np) this).field_j == null) {
                      break L25;
                    } else {
                      var9 = 0;
                      L26: while (true) {
                        if ((var8_int ^ -1) >= (var9 ^ -1)) {
                          if (null == ((np) this).field_r) {
                            break L25;
                          } else {
                            var9 = 0;
                            L27: while (true) {
                              if ((((np) this).field_G ^ -1) >= (var9 ^ -1)) {
                                break L25;
                              } else {
                                var10_ref_pm = ((np) this).field_r[var9];
                                var11_ref = ((np) this).field_f[var9];
                                var11_ref.field_c = var11_ref.field_c & 16777215 | -(((np) this).field_o[var10_ref_pm.field_l] & 255) + 255 << -527710408;
                                var9++;
                                continue L27;
                              }
                            }
                          }
                        } else {
                          L28: {
                            var10 = param1[var9];
                            if ((((np) this).field_j.length ^ -1) >= (var10 ^ -1)) {
                              break L28;
                            } else {
                              var11 = ((np) this).field_j[var10];
                              var12 = 0;
                              L29: while (true) {
                                if (var12 >= var11.length) {
                                  if (0 >= var11.length) {
                                    break L28;
                                  } else {
                                    if (((np) this).field_kb == null) {
                                      break L28;
                                    } else {
                                      ((np) this).field_kb.field_d = null;
                                      break L28;
                                    }
                                  }
                                } else {
                                  L30: {
                                    var13_int = var11[var12];
                                    var14 = 8 * param2 + (255 & ((np) this).field_o[var13_int]);
                                    if (0 > var14) {
                                      var14 = 0;
                                      break L30;
                                    } else {
                                      if ((var14 ^ -1) < -256) {
                                        var14 = 255;
                                        break L30;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  ((np) this).field_o[var13_int] = (byte)var14;
                                  var12++;
                                  continue L29;
                                }
                              }
                            }
                          }
                          var9++;
                          continue L26;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              var9 = 0;
              L31: while (true) {
                if ((var9 ^ -1) <= (var8_int ^ -1)) {
                  L32: {
                    if (!param6) {
                      break L32;
                    } else {
                      var9 = 0;
                      L33: while (true) {
                        if ((var9 ^ -1) <= (var8_int ^ -1)) {
                          L34: {
                            if (((np) this).field_F != null) {
                              break L34;
                            } else {
                              if (((np) this).field_kb == null) {
                                break L34;
                              } else {
                                ((np) this).field_kb.field_d = null;
                                break L34;
                              }
                            }
                          }
                          if (null == ((np) this).field_F) {
                            break L32;
                          } else {
                            ((np) this).field_F.field_d = null;
                            break L32;
                          }
                        } else {
                          L35: {
                            var10 = param1[var9];
                            if ((var10 ^ -1) <= (((np) this).field_d.length ^ -1)) {
                              break L35;
                            } else {
                              var11 = ((np) this).field_d[var10];
                              var12 = 0;
                              L36: while (true) {
                                if (var12 >= var11.length) {
                                  break L35;
                                } else {
                                  var13_int = var11[var12];
                                  var14 = ((np) this).field_e[var13_int];
                                  var15 = ((np) this).field_e[1 + var13_int];
                                  var16 = var14;
                                  L37: while (true) {
                                    L38: {
                                      if ((var16 ^ -1) <= (var15 ^ -1)) {
                                        break L38;
                                      } else {
                                        var17 = -1 + ((np) this).field_q[var16];
                                        if (-1 != var17) {
                                          L39: {
                                            if ((param4 ^ -1) != -1) {
                                              var18 = qu.field_b[param4];
                                              var19 = qu.field_d[param4];
                                              var20 = 16383 + var19 * ((np) this).field_E[var17] + ((np) this).field_Y[var17] * var18 >> 159574446;
                                              ((np) this).field_Y[var17] = (short)(var19 * ((np) this).field_Y[var17] + -(var18 * ((np) this).field_E[var17]) - -16383 >> 2116617550);
                                              ((np) this).field_E[var17] = (short)var20;
                                              break L39;
                                            } else {
                                              break L39;
                                            }
                                          }
                                          L40: {
                                            if ((param2 ^ -1) == -1) {
                                              break L40;
                                            } else {
                                              var18 = qu.field_b[param2];
                                              var19 = qu.field_d[param2];
                                              var20 = 16383 + ((np) this).field_Y[var17] * var19 + -(var18 * ((np) this).field_cb[var17]) >> -1509749106;
                                              ((np) this).field_cb[var17] = (short)(((np) this).field_Y[var17] * var18 + var19 * ((np) this).field_cb[var17] + 16383 >> 1351990446);
                                              ((np) this).field_Y[var17] = (short)var20;
                                              break L40;
                                            }
                                          }
                                          L41: {
                                            if (-1 == (param3 ^ -1)) {
                                              break L41;
                                            } else {
                                              var18 = qu.field_b[param3];
                                              var19 = qu.field_d[param3];
                                              var20 = 16383 + (var19 * ((np) this).field_E[var17] + var18 * ((np) this).field_cb[var17]) >> -714860658;
                                              ((np) this).field_cb[var17] = (short)(16383 + var19 * ((np) this).field_cb[var17] + -(var18 * ((np) this).field_E[var17]) >> 1830236110);
                                              ((np) this).field_E[var17] = (short)var20;
                                              break L41;
                                            }
                                          }
                                          var16++;
                                          continue L37;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    var12++;
                                    continue L36;
                                  }
                                }
                              }
                            }
                          }
                          var9++;
                          continue L33;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L42: {
                    var10 = param1[var9];
                    if ((var10 ^ -1) <= (((np) this).field_d.length ^ -1)) {
                      break L42;
                    } else {
                      var11 = ((np) this).field_d[var10];
                      if ((param5 & 1 ^ -1) == -1) {
                        var12 = 0;
                        L43: while (true) {
                          if (var11.length <= var12) {
                            break L42;
                          } else {
                            L44: {
                              var13_int = var11[var12];
                              ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] - rp.field_i;
                              ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] - via.field_e;
                              ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] - dj.field_b;
                              if (0 != param4) {
                                var14 = qu.field_b[param4];
                                var15 = qu.field_d[param4];
                                var16 = ((np) this).field_P[var13_int] * var15 + ((np) this).field_K[var13_int] * var14 + 16383 >> -784559026;
                                ((np) this).field_K[var13_int] = 16383 + (var15 * ((np) this).field_K[var13_int] + -(var14 * ((np) this).field_P[var13_int])) >> 1819046638;
                                ((np) this).field_P[var13_int] = var16;
                                break L44;
                              } else {
                                break L44;
                              }
                            }
                            L45: {
                              if ((param2 ^ -1) == -1) {
                                break L45;
                              } else {
                                var14 = qu.field_b[param2];
                                var15 = qu.field_d[param2];
                                var16 = var15 * ((np) this).field_K[var13_int] + -(var14 * ((np) this).field_A[var13_int]) + 16383 >> -912005810;
                                ((np) this).field_A[var13_int] = var14 * ((np) this).field_K[var13_int] - -(((np) this).field_A[var13_int] * var15) + 16383 >> 738632942;
                                ((np) this).field_K[var13_int] = var16;
                                break L45;
                              }
                            }
                            L46: {
                              if (0 != param3) {
                                var14 = qu.field_b[param3];
                                var15 = qu.field_d[param3];
                                var16 = ((np) this).field_A[var13_int] * var14 - (-(var15 * ((np) this).field_P[var13_int]) - 16383) >> 1941960526;
                                ((np) this).field_A[var13_int] = -(var14 * ((np) this).field_P[var13_int]) + (((np) this).field_A[var13_int] * var15 - -16383) >> 1573510862;
                                ((np) this).field_P[var13_int] = var16;
                                break L46;
                              } else {
                                break L46;
                              }
                            }
                            ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] + rp.field_i;
                            ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] + via.field_e;
                            ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] + dj.field_b;
                            var12++;
                            continue L43;
                          }
                        }
                      } else {
                        var12 = 0;
                        L47: while (true) {
                          if ((var11.length ^ -1) >= (var12 ^ -1)) {
                            break L42;
                          } else {
                            L48: {
                              var13_int = var11[var12];
                              ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] - rp.field_i;
                              ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] - via.field_e;
                              ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] - dj.field_b;
                              if ((param2 ^ -1) != -1) {
                                var14 = qu.field_b[param2];
                                var15 = qu.field_d[param2];
                                var16 = -(((np) this).field_A[var13_int] * var14) + (var15 * ((np) this).field_K[var13_int] - -16383) >> 736349710;
                                ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] * var15 + ((np) this).field_K[var13_int] * var14 - -16383 >> 1341804590;
                                ((np) this).field_K[var13_int] = var16;
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            L49: {
                              if (-1 != (param4 ^ -1)) {
                                var14 = qu.field_b[param4];
                                var15 = qu.field_d[param4];
                                var16 = 16383 + var14 * ((np) this).field_K[var13_int] + ((np) this).field_P[var13_int] * var15 >> -366742706;
                                ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] * var15 + -(var14 * ((np) this).field_P[var13_int]) - -16383 >> -1507364914;
                                ((np) this).field_P[var13_int] = var16;
                                break L49;
                              } else {
                                break L49;
                              }
                            }
                            L50: {
                              if (-1 == (param3 ^ -1)) {
                                break L50;
                              } else {
                                var14 = qu.field_b[param3];
                                var15 = qu.field_d[param3];
                                var16 = 16383 + ((np) this).field_A[var13_int] * var14 - -(var15 * ((np) this).field_P[var13_int]) >> -2124998482;
                                ((np) this).field_A[var13_int] = 16383 + var15 * ((np) this).field_A[var13_int] + -(var14 * ((np) this).field_P[var13_int]) >> -1429602130;
                                ((np) this).field_P[var13_int] = var16;
                                break L50;
                              }
                            }
                            ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] + rp.field_i;
                            ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] + via.field_e;
                            ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] + dj.field_b;
                            var12++;
                            continue L47;
                          }
                        }
                      }
                    }
                  }
                  var9++;
                  continue L31;
                }
              }
            }
          }
        } else {
          param4 = param4 << 4;
          param3 = param3 << 4;
          param2 = param2 << 4;
          var9 = 0;
          dj.field_b = 0;
          rp.field_i = 0;
          via.field_e = 0;
          var10 = 0;
          L51: while (true) {
            if ((var8_int ^ -1) >= (var10 ^ -1)) {
              L52: {
                if ((var9 ^ -1) < -1) {
                  rp.field_i = param2 + rp.field_i / var9;
                  via.field_e = param3 + via.field_e / var9;
                  dj.field_b = dj.field_b / var9 + param4;
                  break L52;
                } else {
                  rp.field_i = param2;
                  dj.field_b = param4;
                  via.field_e = param3;
                  break L52;
                }
              }
              return;
            } else {
              L53: {
                var11_int = param1[var10];
                if ((var11_int ^ -1) > (((np) this).field_d.length ^ -1)) {
                  var12_ref_int__ = ((np) this).field_d[var11_int];
                  var13_int = 0;
                  L54: while (true) {
                    if ((var13_int ^ -1) <= (var12_ref_int__.length ^ -1)) {
                      break L53;
                    } else {
                      var14 = var12_ref_int__[var13_int];
                      rp.field_i = rp.field_i + ((np) this).field_P[var14];
                      via.field_e = via.field_e + ((np) this).field_K[var14];
                      var9++;
                      dj.field_b = dj.field_b + ((np) this).field_A[var14];
                      var13_int++;
                      continue L54;
                    }
                  }
                } else {
                  break L53;
                }
              }
              var10++;
              continue L51;
            }
          }
        }
    }

    public static void d(int param0) {
        try {
            field_V = null;
            int var1_int = -40 % ((56 - param0) / 48);
            field_J = null;
            field_m = null;
            field_x = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "np.M(" + param0 + 41);
        }
    }

    final void wa() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = 0;
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
                        if (var1_int >= ((np) this).field_N) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((np) this).field_P[var1_int] = ((np) this).field_P[var1_int] + 7 >> -1664264924;
                        ((np) this).field_K[var1_int] = ((np) this).field_K[var1_int] + 7 >> 2011810308;
                        ((np) this).field_A[var1_int] = 7 + ((np) this).field_A[var1_int] >> 1032846372;
                        var1_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (null != ((np) this).field_g) {
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
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((np) this).field_g.field_d = null;
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
                        ((np) this).field_l = false;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var1, "np.wa()");
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_14_0 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_46_0 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_75_0 = null;
        Object stackIn_103_0 = null;
        Object stackIn_107_0 = null;
        Object stackIn_111_0 = null;
        Object stackIn_119_0 = null;
        Object stackIn_138_0 = null;
        int stackIn_150_0 = 0;
        Object stackIn_157_0 = null;
        int stackIn_168_0 = 0;
        Object stackIn_175_0 = null;
        Object stackIn_186_0 = null;
        Object stackIn_193_0 = null;
        Object stackIn_204_0 = null;
        Object stackIn_211_0 = null;
        Object stackIn_222_0 = null;
        Object stackIn_229_0 = null;
        Object stackIn_236_0 = null;
        int stackIn_247_0 = 0;
        Object stackIn_255_0 = null;
        Object stackIn_263_0 = null;
        Object stackIn_271_0 = null;
        Object stackIn_275_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_13_0 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_45_0 = 0;
        Object stackOut_52_0 = null;
        Object stackOut_67_0 = null;
        Object stackOut_74_0 = null;
        Object stackOut_102_0 = null;
        Object stackOut_106_0 = null;
        Object stackOut_110_0 = null;
        Object stackOut_118_0 = null;
        Object stackOut_137_0 = null;
        int stackOut_149_0 = 0;
        Object stackOut_156_0 = null;
        int stackOut_167_0 = 0;
        Object stackOut_174_0 = null;
        Object stackOut_185_0 = null;
        Object stackOut_192_0 = null;
        Object stackOut_203_0 = null;
        Object stackOut_210_0 = null;
        Object stackOut_221_0 = null;
        Object stackOut_228_0 = null;
        Object stackOut_235_0 = null;
        int stackOut_246_0 = 0;
        Object stackOut_254_0 = null;
        Object stackOut_262_0 = null;
        Object stackOut_270_0 = null;
        Object stackOut_274_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!((np) this).field_gb) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        ((np) this).field_gb = false;
                        if (null != ((np) this).field_D) {
                            statePc = 101;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 282;
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
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((np) this).field_t != null) {
                            statePc = 101;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
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
                        if (((np) this).field_r != null) {
                            statePc = 101;
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
                        stackOut_13_0 = -17275;
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
                        if (!aw.c(stackIn_14_0, ((np) this).field_u, ((np) this).field_bb)) {
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
                        statePc = 101;
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
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (null == ((np) this).field_P) {
                            statePc = 43;
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
                        stackOut_21_0 = this;
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
                        if (!uv.a(((np) this).field_u, 1, ((np) this).field_bb)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((np) this).field_g == null) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = this;
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
                        if (((np) this).field_g.field_d == null) {
                            statePc = 40;
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
                        if (((np) this).field_l) {
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
                        this.c(2709);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var2_int = 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((np) this).field_gb = true;
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
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var4 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (null == ((np) this).field_K) {
                            statePc = 66;
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
                        stackOut_45_0 = -61;
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
                        if (pt.a(stackIn_46_0, ((np) this).field_bb, ((np) this).field_u)) {
                            statePc = 66;
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
                        if (null == ((np) this).field_g) {
                            statePc = 59;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
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
                        if (stackIn_53_0 != (Object) (Object) ((np) this).field_g.field_d) {
                            statePc = 59;
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
                        ((np) this).field_gb = true;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
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
                        if (((np) this).field_l) {
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
                        this.c(2709);
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
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var3 = 1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (((np) this).field_A == null) {
                            statePc = 89;
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
                        stackOut_67_0 = this;
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
                        if (jc.c(((np) this).field_u, -23717, ((np) this).field_bb)) {
                            statePc = 89;
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
                        if (((np) this).field_g == null) {
                            statePc = 78;
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
                        stackOut_74_0 = null;
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
                        if (stackIn_75_0 == (Object) (Object) ((np) this).field_g.field_d) {
                            statePc = 86;
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
                        if (!((np) this).field_l) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        this.c(2709);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var4 = 1;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        ((np) this).field_gb = true;
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
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (var3 == 0) {
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
                        ((np) this).field_K = null;
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
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var4 == 0) {
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
                        ((np) this).field_A = null;
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
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var2_int != 0) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        ((np) this).field_P = null;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (null == ((np) this).field_q) {
                            statePc = 117;
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
                        if (((np) this).field_P != null) {
                            statePc = 117;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 109;
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
                        stackOut_106_0 = null;
                        stackIn_107_0 = stackOut_106_0;
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
                        if (stackIn_107_0 != (Object) (Object) ((np) this).field_K) {
                            statePc = 117;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = this;
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
                        if (((np) this).field_A == null) {
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
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        ((np) this).field_e = null;
                        ((np) this).field_q = null;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (((np) this).field_O == null) {
                            statePc = 147;
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
                        stackOut_118_0 = this;
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
                        if (!oea.a(((np) this).field_bb, ((np) this).field_u, (byte) 115)) {
                            statePc = 124;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (null == ((np) this).field_F) {
                            statePc = 134;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (((np) this).field_F.field_d == null) {
                            statePc = 131;
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
                        ((np) this).field_cb = null;
                        ((np) this).field_O = null;
                        ((np) this).field_E = null;
                        ((np) this).field_Y = null;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
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
                        ((np) this).field_gb = true;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
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
                        if (null == ((np) this).field_kb) {
                            statePc = 141;
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
                        stackOut_137_0 = this;
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
                        if (((np) this).field_kb.field_d == null) {
                            statePc = 144;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        ((np) this).field_O = null;
                        ((np) this).field_cb = null;
                        ((np) this).field_Y = null;
                        ((np) this).field_E = null;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
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
                        ((np) this).field_gb = true;
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
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var2_int = -95 % ((param0 - -49) / 55);
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (null == ((np) this).field_X) {
                            statePc = 166;
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
                        stackOut_149_0 = 2;
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
                        if (!sm.a(stackIn_150_0, ((np) this).field_bb, ((np) this).field_u)) {
                            statePc = 155;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (null == ((np) this).field_kb) {
                            statePc = 160;
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
                        stackOut_156_0 = null;
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
                        if (stackIn_157_0 == (Object) (Object) ((np) this).field_kb.field_d) {
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
                        ((np) this).field_X = null;
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
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
                        ((np) this).field_gb = true;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        if (((np) this).field_o == null) {
                            statePc = 184;
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
                        stackOut_167_0 = 107;
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
                        if (!gda.b(stackIn_168_0, ((np) this).field_u, ((np) this).field_bb)) {
                            statePc = 173;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        if (null == ((np) this).field_kb) {
                            statePc = 178;
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
                        stackOut_174_0 = null;
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
                        if (stackIn_175_0 == (Object) (Object) ((np) this).field_kb.field_d) {
                            statePc = 181;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        ((np) this).field_o = null;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        ((np) this).field_gb = true;
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (null == ((np) this).field_n) {
                            statePc = 202;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        stackOut_185_0 = this;
                        stackIn_186_0 = stackOut_185_0;
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if (!lva.a(((np) this).field_bb, (byte) -21, ((np) this).field_u)) {
                            statePc = 191;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (null == ((np) this).field_ab) {
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
                        stackOut_192_0 = this;
                        stackIn_193_0 = stackOut_192_0;
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (((np) this).field_ab.field_d == null) {
                            statePc = 199;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        ((np) this).field_n = null;
                        ((np) this).field_y = null;
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        ((np) this).field_gb = true;
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        if (null == ((np) this).field_I) {
                            statePc = 220;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        stackOut_203_0 = this;
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
                        if (in.a(((np) this).field_bb, ((np) this).field_u, (byte) -115)) {
                            statePc = 220;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        if (null == ((np) this).field_kb) {
                            statePc = 217;
                        } else {
                            statePc = 208;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 213;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        statePc = 210;
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 213;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 213;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        stackOut_210_0 = this;
                        stackIn_211_0 = stackOut_210_0;
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 213;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        if (((np) this).field_kb.field_d != null) {
                            statePc = 217;
                        } else {
                            statePc = 212;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        statePc = 214;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        ((np) this).field_gb = true;
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        ((np) this).field_I = null;
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        if (((np) this).field_H == null) {
                            statePc = 245;
                        } else {
                            statePc = 221;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        stackOut_221_0 = this;
                        stackIn_222_0 = stackOut_221_0;
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        if (!ae.a(((np) this).field_bb, ((np) this).field_u, 6100)) {
                            statePc = 227;
                        } else {
                            statePc = 223;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        statePc = 245;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        if (((np) this).field_w == null) {
                            statePc = 232;
                        } else {
                            statePc = 228;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        stackOut_228_0 = this;
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
                        if (((np) this).field_w.field_a == null) {
                            statePc = 242;
                        } else {
                            statePc = 230;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        if (null == ((np) this).field_kb) {
                            statePc = 239;
                        } else {
                            statePc = 233;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        statePc = 235;
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        stackOut_235_0 = this;
                        stackIn_236_0 = stackOut_235_0;
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        if (((np) this).field_kb.field_d == null) {
                            statePc = 242;
                        } else {
                            statePc = 237;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 241;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        statePc = 239;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 241;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 241;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        ((np) this).field_z = null;
                        ((np) this).field_hb = null;
                        ((np) this).field_H = null;
                        statePc = 245;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        ((np) this).field_gb = true;
                        statePc = 243;
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        statePc = 245;
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        if (((np) this).field_j == null) {
                            statePc = 253;
                        } else {
                            statePc = 246;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 249;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        stackOut_246_0 = -26571;
                        stackIn_247_0 = stackOut_246_0;
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 249;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        if (!aw.d(stackIn_247_0, ((np) this).field_bb, ((np) this).field_u)) {
                            statePc = 252;
                        } else {
                            statePc = 248;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 251;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        statePc = 250;
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 251;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 251;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        statePc = 253;
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 251;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        ((np) this).field_j = null;
                        ((np) this).field_fb = null;
                        statePc = 253;
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        if (null == ((np) this).field_d) {
                            statePc = 261;
                        } else {
                            statePc = 254;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 257;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        stackOut_254_0 = this;
                        stackIn_255_0 = stackOut_254_0;
                        statePc = 255;
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 257;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        if (!kda.b(((np) this).field_bb, 124, ((np) this).field_u)) {
                            statePc = 260;
                        } else {
                            statePc = 256;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        statePc = 258;
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        ((np) this).field_db = null;
                        ((np) this).field_d = null;
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        if (null == ((np) this).field_C) {
                            statePc = 269;
                        } else {
                            statePc = 262;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 265;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        stackOut_262_0 = this;
                        stackIn_263_0 = stackOut_262_0;
                        statePc = 263;
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 265;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        if (!eo.a(((np) this).field_u, (byte) -125, ((np) this).field_bb)) {
                            statePc = 268;
                        } else {
                            statePc = 264;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 267;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        statePc = 266;
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 267;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 267;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 267;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        ((np) this).field_C = null;
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        if (((np) this).field_p == null) {
                            statePc = 283;
                        } else {
                            statePc = 270;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        stackOut_270_0 = this;
                        stackIn_271_0 = stackOut_270_0;
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        if ((((np) this).field_bb & 2048 ^ -1) != -1) {
                            statePc = 283;
                        } else {
                            statePc = 272;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        statePc = 274;
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        stackOut_274_0 = this;
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
                        if ((((np) this).field_bb & 262144) != 0) {
                            statePc = 283;
                        } else {
                            statePc = 276;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        ((np) this).field_p = null;
                        statePc = 279;
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        statePc = 283;
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 282: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "np.J(" + param0 + 41);
                }
                case 283: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    np(cka param0) {
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
                    ((np) this).field_L = 0;
                    ((np) this).field_l = false;
                    ((np) this).field_N = 0;
                    ((np) this).field_s = false;
                    ((np) this).field_gb = true;
                    ((np) this).field_ib = 0;
                    ((np) this).field_W = 0;
                    ((np) this).field_lb = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((np) this).field_R = param0;
                        ((np) this).field_g = new tj((va) null, 5126, 3, 0);
                        ((np) this).field_ab = new tj((va) null, 5126, 2, 0);
                        ((np) this).field_F = new tj((va) null, 5126, 3, 0);
                        ((np) this).field_kb = new tj((va) null, 5121, 4, 0);
                        ((np) this).field_w = new afa();
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
                        stackOut_4_1 = new StringBuilder().append("np.<init>(");
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
                    throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
                }
                case 9: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    np(cka param0, oc param1, int param2, int param3, int param4, int param5) {
        d var7 = null;
        int[] var8 = null;
        int var9_int = 0;
        long[] var9 = null;
        int var10 = 0;
        dw var10_ref = null;
        int var11_int = 0;
        pa[] var11 = null;
        int var12 = 0;
        dw var13_ref = null;
        jt var13_ref_jt = null;
        int var13 = 0;
        int var14_int = 0;
        lp var14 = null;
        int var15_int = 0;
        uo[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        int[] var19 = null;
        jt var20_ref_jt = null;
        int var20 = 0;
        lp var21_ref = null;
        int var21 = 0;
        dw var22_ref = null;
        int var22_int = 0;
        float var22 = 0.0f;
        int var23_int = 0;
        float var23 = 0.0f;
        int var24_int = 0;
        float var24 = 0.0f;
        int var25_int = 0;
        float var25 = 0.0f;
        int var26_int = 0;
        float var26 = 0.0f;
        int var27_int = 0;
        float var27 = 0.0f;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        pa var31_ref_pa = null;
        uo var31_ref = null;
        int var32_int = 0;
        long var32_long = 0L;
        uo var32 = null;
        int var33_int = 0;
        long var33 = 0L;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37_int = 0;
        pa var37 = null;
        float var38 = 0.0f;
        float[] var38_ref_float__ = null;
        float var39 = 0.0f;
        int var39_int = 0;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        float var43 = 0.0f;
        int var43_int = 0;
        float var44 = 0.0f;
        int var44_int = 0;
        float var45 = 0.0f;
        int var45_int = 0;
        float var46 = 0.0f;
        int var46_int = 0;
        float var47 = 0.0f;
        int var47_int = 0;
        float var48 = 0.0f;
        int var48_int = 0;
        float var49 = 0.0f;
        int var49_int = 0;
        float var50 = 0.0f;
        int var50_int = 0;
        float var51 = 0.0f;
        int var51_int = 0;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        int var63 = 0;
        int stackIn_33_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        int stackIn_127_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        byte stackOut_99_2 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_253_0 = 0;
        int stackOut_253_1 = 0;
        int stackOut_144_0 = 0;
        short stackOut_143_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_223_1 = 0;
        int stackOut_222_0 = 0;
        int stackOut_222_1 = 0;
        byte stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        L0: {
          var63 = TombRacer.field_G ? 1 : 0;
          ((np) this).field_L = 0;
          ((np) this).field_l = false;
          ((np) this).field_N = 0;
          ((np) this).field_s = false;
          ((np) this).field_gb = true;
          ((np) this).field_ib = 0;
          ((np) this).field_W = 0;
          ((np) this).field_lb = 0;
          ((np) this).field_bb = param2;
          ((np) this).field_R = param0;
          ((np) this).field_u = param5;
          if (!hha.a(param5, 0, param2)) {
            break L0;
          } else {
            ((np) this).field_g = new tj((va) null, 5126, 3, 0);
            break L0;
          }
        }
        L1: {
          if (!wu.a(-17, param5, param2)) {
            break L1;
          } else {
            ((np) this).field_ab = new tj((va) null, 5126, 2, 0);
            break L1;
          }
        }
        L2: {
          if (!kb.a(param5, param2, (byte) 17)) {
            break L2;
          } else {
            ((np) this).field_F = new tj((va) null, 5126, 3, 0);
            break L2;
          }
        }
        L3: {
          if (we.b(param2, param5, 2048)) {
            ((np) this).field_kb = new tj((va) null, 5121, 4, 0);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (mm.a(-122, param2, param5)) {
            ((np) this).field_w = new afa();
            break L4;
          } else {
            break L4;
          }
        }
        var7 = param0.field_c;
        var8 = new int[param1.field_o];
        ((np) this).field_e = new int[param1.field_L + 1];
        var9_int = 0;
        L5: while (true) {
          if (param1.field_o <= var9_int) {
            L6: {
              ((np) this).field_ib = ((np) this).field_W;
              var9 = new long[((np) this).field_W];
              if ((((np) this).field_bb & 256 ^ -1) == -1) {
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                break L6;
              } else {
                stackOut_31_0 = 1;
                stackIn_33_0 = stackOut_31_0;
                break L6;
              }
            }
            var10 = stackIn_33_0;
            var11_int = 0;
            L7: while (true) {
              if (var11_int >= ((np) this).field_W) {
                L8: {
                  ofa.a(var8, var9, 93);
                  ((np) this).field_P = param1.field_b;
                  ((np) this).field_A = param1.field_p;
                  ((np) this).field_N = param1.field_E;
                  ((np) this).field_K = param1.field_I;
                  ((np) this).field_lb = param1.field_L;
                  ((np) this).field_db = param1.field_y;
                  ((np) this).field_t = param1.field_e;
                  var11 = new pa[((np) this).field_lb];
                  ((np) this).field_D = param1.field_B;
                  if (param1.field_m != null) {
                    ((np) this).field_G = param1.field_m.length;
                    ((np) this).field_f = new fd[((np) this).field_G];
                    ((np) this).field_r = new pm[((np) this).field_G];
                    var12 = 0;
                    L9: while (true) {
                      if (var12 >= ((np) this).field_G) {
                        break L8;
                      } else {
                        var13_ref_jt = param1.field_m[var12];
                        var14 = fw.a(var13_ref_jt.field_d, false);
                        var15_int = -1;
                        var16 = 0;
                        L10: while (true) {
                          L11: {
                            if ((((np) this).field_W ^ -1) >= (var16 ^ -1)) {
                              break L11;
                            } else {
                              if ((var13_ref_jt.field_a ^ -1) != (var8[var16] ^ -1)) {
                                var16++;
                                continue L10;
                              } else {
                                var15_int = var16;
                                break L11;
                              }
                            }
                          }
                          if (0 != (var15_int ^ -1)) {
                            L12: {
                              var16 = cla.field_m[param1.field_A[var13_ref_jt.field_a] & 65535] & 16777215;
                              stackOut_97_0 = var16;
                              stackOut_97_1 = 255;
                              stackIn_99_0 = stackOut_97_0;
                              stackIn_99_1 = stackOut_97_1;
                              stackIn_98_0 = stackOut_97_0;
                              stackIn_98_1 = stackOut_97_1;
                              if (param1.field_n != null) {
                                stackOut_99_0 = stackIn_99_0;
                                stackOut_99_1 = stackIn_99_1;
                                stackOut_99_2 = param1.field_n[var13_ref_jt.field_a];
                                stackIn_100_0 = stackOut_99_0;
                                stackIn_100_1 = stackOut_99_1;
                                stackIn_100_2 = stackOut_99_2;
                                break L12;
                              } else {
                                stackOut_98_0 = stackIn_98_0;
                                stackOut_98_1 = stackIn_98_1;
                                stackOut_98_2 = 0;
                                stackIn_100_0 = stackOut_98_0;
                                stackIn_100_1 = stackOut_98_1;
                                stackIn_100_2 = stackOut_98_2;
                                break L12;
                              }
                            }
                            var16 = stackIn_100_0 | stackIn_100_1 - stackIn_100_2 << -1923296424;
                            ((np) this).field_r[var12] = new pm(var15_int, (int) param1.field_a[var13_ref_jt.field_a], (int) param1.field_t[var13_ref_jt.field_a], (int) param1.field_J[var13_ref_jt.field_a], var14.field_d, var14.field_b, var14.field_f, var14.field_c, var14.field_e, var14.field_i, var14.field_a, var13_ref_jt.field_c);
                            ((np) this).field_f[var12] = new fd(var16);
                            var12++;
                            continue L9;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                L13: {
                  var12 = ((np) this).field_W * 3;
                  if (null != param1.field_h) {
                    ((np) this).field_fb = new short[((np) this).field_W];
                    break L13;
                  } else {
                    break L13;
                  }
                }
                ((np) this).field_y = new float[var12];
                ((np) this).field_n = new float[var12];
                ((np) this).field_Y = new short[var12];
                ((np) this).field_I = new short[((np) this).field_W];
                ((np) this).field_E = new short[var12];
                ((np) this).field_hb = new short[((np) this).field_W];
                ((np) this).field_O = new byte[var12];
                ((np) this).field_cb = new short[var12];
                ((np) this).field_o = new byte[((np) this).field_W];
                ((np) this).field_h = (short)param4;
                ((np) this).field_z = new short[((np) this).field_W];
                ((np) this).field_H = new short[((np) this).field_W];
                ((np) this).field_B = (short)param3;
                ((np) this).field_X = new short[((np) this).field_W];
                ((np) this).field_q = new short[var12];
                qka.field_m = new long[var12];
                var13 = 0;
                var14_int = 0;
                L14: while (true) {
                  if (var14_int >= param1.field_L) {
                    ((np) this).field_e[param1.field_L] = var13;
                    var14 = (lp) (Object) qqa.a(var8, param1, ((np) this).field_W, (byte) -6);
                    var15 = new uo[param1.field_o];
                    var16 = 0;
                    L15: while (true) {
                      if (var16 >= param1.field_o) {
                        var16 = 0;
                        L16: while (true) {
                          if ((var16 ^ -1) <= (((np) this).field_W ^ -1)) {
                            var16 = 0;
                            var17 = -10000;
                            var18 = 0;
                            L17: while (true) {
                              if ((((np) this).field_ib ^ -1) >= (var18 ^ -1)) {
                                ((np) this).field_p = new int[var16 - -1];
                                var17 = -10000;
                                var16 = 0;
                                var18 = 0;
                                L18: while (true) {
                                  if ((((np) this).field_ib ^ -1) >= (var18 ^ -1)) {
                                    L19: {
                                      ((np) this).field_p[var16] = ((np) this).field_ib;
                                      qka.field_m = null;
                                      ((np) this).field_E = rna.a(((np) this).field_E, true, ((np) this).field_L);
                                      ((np) this).field_Y = rna.a(((np) this).field_Y, true, ((np) this).field_L);
                                      ((np) this).field_cb = rna.a(((np) this).field_cb, true, ((np) this).field_L);
                                      ((np) this).field_O = pt.a(((np) this).field_O, ((np) this).field_L, 4096);
                                      ((np) this).field_n = lpa.a(((np) this).field_L, 50, ((np) this).field_n);
                                      ((np) this).field_y = lpa.a(((np) this).field_L, 50, ((np) this).field_y);
                                      if (null == param1.field_l) {
                                        break L19;
                                      } else {
                                        if (kda.b(param2, 104, ((np) this).field_u)) {
                                          ((np) this).field_d = param1.a(false, (byte) 64);
                                          break L19;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (null == param1.field_m) {
                                        break L20;
                                      } else {
                                        if (!eo.a(((np) this).field_u, (byte) 83, param2)) {
                                          break L20;
                                        } else {
                                          ((np) this).field_C = param1.b((byte) -91);
                                          break L20;
                                        }
                                      }
                                    }
                                    L21: {
                                      if (param1.field_D == null) {
                                        break L21;
                                      } else {
                                        stackOut_253_0 = -26571;
                                        stackOut_253_1 = param2;
                                        stackIn_254_0 = stackOut_253_0;
                                        stackIn_254_1 = stackOut_253_1;
                                        if (aw.d(stackIn_254_0, stackIn_254_1, ((np) this).field_u)) {
                                          var18 = 0;
                                          var19 = new int[256];
                                          var20 = 0;
                                          L22: while (true) {
                                            if (var20 >= ((np) this).field_W) {
                                              ((np) this).field_j = new int[1 + var18][];
                                              var20 = 0;
                                              L23: while (true) {
                                                if (var18 < var20) {
                                                  var20 = 0;
                                                  L24: while (true) {
                                                    if ((((np) this).field_W ^ -1) >= (var20 ^ -1)) {
                                                      break L21;
                                                    } else {
                                                      L25: {
                                                        var21 = param1.field_D[var8[var20]];
                                                        if (var21 < 0) {
                                                          break L25;
                                                        } else {
                                                          var19[var21] = var19[var21] + 1;
                                                          ((np) this).field_j[var21][var19[var21]] = var20;
                                                          break L25;
                                                        }
                                                      }
                                                      var20++;
                                                      continue L24;
                                                    }
                                                  }
                                                } else {
                                                  ((np) this).field_j[var20] = new int[var19[var20]];
                                                  var19[var20] = 0;
                                                  var20++;
                                                  continue L23;
                                                }
                                              }
                                            } else {
                                              L26: {
                                                var21 = param1.field_D[var8[var20]];
                                                if (var21 < 0) {
                                                  break L26;
                                                } else {
                                                  L27: {
                                                    if ((var21 ^ -1) >= (var18 ^ -1)) {
                                                      break L27;
                                                    } else {
                                                      var18 = var21;
                                                      break L27;
                                                    }
                                                  }
                                                  var19[var21] = var19[var21] + 1;
                                                  break L26;
                                                }
                                              }
                                              var20++;
                                              continue L22;
                                            }
                                          }
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                  } else {
                                    L28: {
                                      var19_int = ((np) this).field_I[var18];
                                      if ((var19_int ^ -1) == (var17 ^ -1)) {
                                        break L28;
                                      } else {
                                        var16++;
                                        ((np) this).field_p[var16] = var18;
                                        var17 = var19_int;
                                        break L28;
                                      }
                                    }
                                    var18++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L29: {
                                  var19_int = ((np) this).field_I[var18];
                                  if ((var19_int ^ -1) == (var17 ^ -1)) {
                                    break L29;
                                  } else {
                                    var17 = var19_int;
                                    var16++;
                                    break L29;
                                  }
                                }
                                var18++;
                                continue L17;
                              }
                            }
                          } else {
                            L30: {
                              var17 = var8[var16];
                              var18 = param1.field_A[var17] & 65535;
                              if (param1.field_g != null) {
                                var19_int = param1.field_g[var17];
                                break L30;
                              } else {
                                var19_int = -1;
                                break L30;
                              }
                            }
                            L31: {
                              if (param1.field_n == null) {
                                var20 = 0;
                                break L31;
                              } else {
                                var20 = 255 & param1.field_n[var17];
                                break L31;
                              }
                            }
                            L32: {
                              if (param1.field_r == null) {
                                stackOut_144_0 = -1;
                                stackIn_145_0 = stackOut_144_0;
                                break L32;
                              } else {
                                stackOut_143_0 = param1.field_r[var17];
                                stackIn_145_0 = stackOut_143_0;
                                break L32;
                              }
                            }
                            L33: {
                              var21 = stackIn_145_0;
                              if (-1 == var21) {
                                break L33;
                              } else {
                                if (-1 == (64 & ((np) this).field_u ^ -1)) {
                                  break L33;
                                } else {
                                  var22_ref = var7.a((byte) -92, 65535 & var21);
                                  if (!var22_ref.field_p) {
                                    break L33;
                                  } else {
                                    var21 = -1;
                                    break L33;
                                  }
                                }
                              }
                            }
                            L34: {
                              var22 = 0.0f;
                              var23 = 0.0f;
                              var24 = 0.0f;
                              var25 = 0.0f;
                              var26 = 0.0f;
                              var27 = 0.0f;
                              var28 = 0;
                              var29 = 0;
                              var30 = 0;
                              if (-1 != var21) {
                                if (0 != (var19_int ^ -1)) {
                                  var19_int = var19_int & 255;
                                  var31 = param1.field_u[var19_int];
                                  if (var31 == 0) {
                                    var32_int = param1.field_a[var17];
                                    var33_int = param1.field_t[var17];
                                    var34 = param1.field_J[var17];
                                    var35 = param1.field_s[var19_int];
                                    var36 = param1.field_q[var19_int];
                                    var37_int = param1.field_K[var19_int];
                                    var38 = (float)param1.field_b[var35];
                                    var39 = (float)param1.field_I[var35];
                                    var40 = (float)param1.field_p[var35];
                                    var41 = (float)param1.field_b[var36] - var38;
                                    var42 = (float)param1.field_I[var36] - var39;
                                    var43 = (float)param1.field_p[var36] - var40;
                                    var44 = (float)param1.field_b[var37_int] - var38;
                                    var45 = (float)param1.field_I[var37_int] - var39;
                                    var46 = (float)param1.field_p[var37_int] - var40;
                                    var47 = -var38 + (float)param1.field_b[var32_int];
                                    var48 = (float)param1.field_I[var32_int] - var39;
                                    var49 = (float)param1.field_p[var32_int] - var40;
                                    var50 = (float)param1.field_b[var33_int] - var38;
                                    var51 = (float)param1.field_I[var33_int] - var39;
                                    var52 = (float)param1.field_p[var33_int] - var40;
                                    var53 = (float)param1.field_b[var34] - var38;
                                    var54 = (float)param1.field_I[var34] - var39;
                                    var55 = -var40 + (float)param1.field_p[var34];
                                    var56 = var46 * var42 - var43 * var45;
                                    var57 = -(var41 * var46) + var43 * var44;
                                    var58 = -(var44 * var42) + var41 * var45;
                                    var59 = var45 * var58 - var57 * var46;
                                    var60 = var46 * var56 - var44 * var58;
                                    var61 = -(var45 * var56) + var44 * var57;
                                    var62 = 1.0f / (var41 * var59 + var42 * var60 + var61 * var43);
                                    var26 = (var54 * var60 + var53 * var59 + var61 * var55) * var62;
                                    var24 = (var51 * var60 + var59 * var50 + var61 * var52) * var62;
                                    var22 = (var61 * var49 + (var59 * var47 + var60 * var48)) * var62;
                                    var61 = var41 * var57 - var42 * var56;
                                    var60 = -(var58 * var41) + var43 * var56;
                                    var59 = -(var43 * var57) + var58 * var42;
                                    var62 = 1.0f / (var45 * var60 + var44 * var59 + var46 * var61);
                                    var25 = (var59 * var50 + var51 * var60 + var52 * var61) * var62;
                                    var23 = (var61 * var49 + (var48 * var60 + var59 * var47)) * var62;
                                    var27 = (var55 * var61 + (var60 * var54 + var59 * var53)) * var62;
                                    break L34;
                                  } else {
                                    L35: {
                                      var32_int = param1.field_a[var17];
                                      var33_int = param1.field_t[var17];
                                      var34 = param1.field_J[var17];
                                      var35 = ((ima) (Object) var14).field_a[var19_int];
                                      var36 = ((ima) (Object) var14).field_c[var19_int];
                                      var37_int = ((ima) (Object) var14).field_d[var19_int];
                                      var38_ref_float__ = ((ima) (Object) var14).field_b[var19_int];
                                      var39_int = param1.field_z[var19_int];
                                      var40 = (float)param1.field_d[var19_int] / 256.0f;
                                      if ((var31 ^ -1) == -2) {
                                        var41 = (float)param1.field_x[var19_int] / 1024.0f;
                                        loa.a(var39_int, dia.field_p, var41, param1.field_p[var32_int], param1.field_I[var32_int], 86, var38_ref_float__, var40, var36, var37_int, param1.field_b[var32_int], var35);
                                        var23 = dia.field_p[1];
                                        var22 = dia.field_p[0];
                                        loa.a(var39_int, dia.field_p, var41, param1.field_p[var33_int], param1.field_I[var33_int], -68, var38_ref_float__, var40, var36, var37_int, param1.field_b[var33_int], var35);
                                        var25 = dia.field_p[1];
                                        var24 = dia.field_p[0];
                                        loa.a(var39_int, dia.field_p, var41, param1.field_p[var34], param1.field_I[var34], 113, var38_ref_float__, var40, var36, var37_int, param1.field_b[var34], var35);
                                        var26 = dia.field_p[0];
                                        var27 = dia.field_p[1];
                                        var42 = var41 / 2.0f;
                                        if ((var39_int & 1 ^ -1) != -1) {
                                          L36: {
                                            if (var42 >= var25 - var23) {
                                              if (-var25 + var23 <= var42) {
                                                break L36;
                                              } else {
                                                var25 = var25 + var41;
                                                var28 = 2;
                                                break L36;
                                              }
                                            } else {
                                              var28 = 1;
                                              var25 = var25 - var41;
                                              break L36;
                                            }
                                          }
                                          if (-var23 + var27 > var42) {
                                            var27 = var27 - var41;
                                            var29 = 1;
                                            break L35;
                                          } else {
                                            if (var42 < var23 - var27) {
                                              var29 = 2;
                                              var27 = var27 + var41;
                                              break L35;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        } else {
                                          L37: {
                                            if (var26 - var22 <= var42) {
                                              if (var42 >= -var26 + var22) {
                                                break L37;
                                              } else {
                                                var26 = var26 + var41;
                                                var29 = 2;
                                                break L37;
                                              }
                                            } else {
                                              var26 = var26 - var41;
                                              var29 = 1;
                                              break L37;
                                            }
                                          }
                                          if (var42 >= -var22 + var24) {
                                            if (var42 < -var24 + var22) {
                                              var24 = var24 + var41;
                                              var28 = 2;
                                              break L35;
                                            } else {
                                              break L35;
                                            }
                                          } else {
                                            var24 = var24 - var41;
                                            var28 = 1;
                                            break L35;
                                          }
                                        }
                                      } else {
                                        if ((var31 ^ -1) == -3) {
                                          var41 = (float)param1.field_v[var19_int] / 256.0f;
                                          var42 = (float)param1.field_c[var19_int] / 256.0f;
                                          var43_int = param1.field_b[var33_int] - param1.field_b[var32_int];
                                          var44_int = param1.field_I[var33_int] + -param1.field_I[var32_int];
                                          var45_int = param1.field_p[var33_int] + -param1.field_p[var32_int];
                                          var46_int = -param1.field_b[var32_int] + param1.field_b[var34];
                                          var47_int = -param1.field_I[var32_int] + param1.field_I[var34];
                                          var48_int = -param1.field_p[var32_int] + param1.field_p[var34];
                                          var49_int = var48_int * var44_int + -(var47_int * var45_int);
                                          var50_int = var45_int * var46_int - var48_int * var43_int;
                                          var51_int = -(var44_int * var46_int) + var47_int * var43_int;
                                          var52 = 64.0f / (float)param1.field_j[var19_int];
                                          var53 = 64.0f / (float)param1.field_f[var19_int];
                                          var54 = 64.0f / (float)param1.field_x[var19_int];
                                          var55 = (var38_ref_float__[2] * (float)var51_int + (var38_ref_float__[0] * (float)var49_int + (float)var50_int * var38_ref_float__[1])) / var52;
                                          var56 = (var38_ref_float__[4] * (float)var50_int + (float)var49_int * var38_ref_float__[3] + var38_ref_float__[5] * (float)var51_int) / var53;
                                          var57 = (var38_ref_float__[8] * (float)var51_int + ((float)var50_int * var38_ref_float__[7] + var38_ref_float__[6] * (float)var49_int)) / var54;
                                          var30 = mr.a(var57, var56, false, var55);
                                          as.a(var36, dia.field_p, param1.field_I[var32_int], var35, var42, var37_int, var41, param1.field_b[var32_int], var30, param1.field_p[var32_int], -101, var40, var39_int, var38_ref_float__);
                                          var22 = dia.field_p[0];
                                          var23 = dia.field_p[1];
                                          as.a(var36, dia.field_p, param1.field_I[var33_int], var35, var42, var37_int, var41, param1.field_b[var33_int], var30, param1.field_p[var33_int], -95, var40, var39_int, var38_ref_float__);
                                          var25 = dia.field_p[1];
                                          var24 = dia.field_p[0];
                                          as.a(var36, dia.field_p, param1.field_I[var34], var35, var42, var37_int, var41, param1.field_b[var34], var30, param1.field_p[var34], -99, var40, var39_int, var38_ref_float__);
                                          var26 = dia.field_p[0];
                                          var27 = dia.field_p[1];
                                          break L35;
                                        } else {
                                          if (3 == var31) {
                                            ifa.a(param1.field_p[var32_int], param1.field_b[var32_int], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var32_int]);
                                            var22 = dia.field_p[0];
                                            var23 = dia.field_p[1];
                                            ifa.a(param1.field_p[var33_int], param1.field_b[var33_int], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var33_int]);
                                            var25 = dia.field_p[1];
                                            var24 = dia.field_p[0];
                                            ifa.a(param1.field_p[var34], param1.field_b[var34], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var34]);
                                            var27 = dia.field_p[1];
                                            var26 = dia.field_p[0];
                                            if ((var39_int & 1 ^ -1) != -1) {
                                              L38: {
                                                if (0.5f < var27 - var23) {
                                                  var29 = 1;
                                                  var27 = var27 - 1.0f;
                                                  break L38;
                                                } else {
                                                  if (var23 - var27 <= 0.5f) {
                                                    break L38;
                                                  } else {
                                                    var27 = var27 + 1.0f;
                                                    var29 = 2;
                                                    break L38;
                                                  }
                                                }
                                              }
                                              if (var25 - var23 > 0.5f) {
                                                var25 = var25 - 1.0f;
                                                var28 = 1;
                                                break L35;
                                              } else {
                                                if (0.5f < var23 - var25) {
                                                  var28 = 2;
                                                  var25 = var25 + 1.0f;
                                                  break L35;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            } else {
                                              L39: {
                                                if (var26 - var22 <= 0.5f) {
                                                  if (var22 - var26 > 0.5f) {
                                                    var26 = var26 + 1.0f;
                                                    var29 = 2;
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                } else {
                                                  var29 = 1;
                                                  var26 = var26 - 1.0f;
                                                  break L39;
                                                }
                                              }
                                              if (var24 - var22 <= 0.5f) {
                                                if (var22 - var24 <= 0.5f) {
                                                  break L35;
                                                } else {
                                                  var24 = var24 + 1.0f;
                                                  var28 = 2;
                                                  break L35;
                                                }
                                              } else {
                                                var24 = var24 - 1.0f;
                                                var28 = 1;
                                                break L35;
                                              }
                                            }
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                    }
                                    break L34;
                                  }
                                } else {
                                  var23 = 1.0f;
                                  var22 = 0.0f;
                                  var24 = 1.0f;
                                  var27 = 0.0f;
                                  var26 = 0.0f;
                                  var29 = 2;
                                  var25 = 1.0f;
                                  var28 = 1;
                                  break L34;
                                }
                              } else {
                                break L34;
                              }
                            }
                            L40: {
                              if (param1.field_G == null) {
                                var31 = 0;
                                break L40;
                              } else {
                                var31 = param1.field_G[var17];
                                break L40;
                              }
                            }
                            L41: {
                              if (0 != var31) {
                                if (var31 != 1) {
                                  break L41;
                                } else {
                                  L42: {
                                    var32 = var15[var17];
                                    stackOut_221_0 = (256 + var32.field_a << 493169334) + ((var32.field_c + 256 << 100403916) + (var19_int << 1023554786));
                                    stackIn_223_0 = stackOut_221_0;
                                    stackIn_222_0 = stackOut_221_0;
                                    if (-1 > (var32.field_b ^ -1)) {
                                      stackOut_223_0 = stackIn_223_0;
                                      stackOut_223_1 = 1024;
                                      stackIn_224_0 = stackOut_223_0;
                                      stackIn_224_1 = stackOut_223_1;
                                      break L42;
                                    } else {
                                      stackOut_222_0 = stackIn_222_0;
                                      stackOut_222_1 = 2048;
                                      stackIn_224_0 = stackOut_222_0;
                                      stackIn_224_1 = stackOut_222_1;
                                      break L42;
                                    }
                                  }
                                  var33 = (long)(stackIn_224_0 - -stackIn_224_1) - -((long)var20 + (long)(var18 << -541878392) + (long)(var30 << 936601976) << -108288864);
                                  ((np) this).field_H[var16] = this.a(var33, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_a[var17], var32.field_b, var23, param1, var22);
                                  ((np) this).field_z[var16] = this.a(var33 + (long)var28, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_t[var17], var32.field_b, var25, param1, var24);
                                  ((np) this).field_hb[var16] = this.a((long)var29 + var33, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_J[var17], var32.field_b, var27, param1, var26);
                                  break L41;
                                }
                              } else {
                                var32_long = (long)(var19_int << 1091206530) - -((long)var20 + ((long)(var30 << 1206228440) - -(long)(var18 << -70712216)) << -433895136);
                                var34 = param1.field_a[var17];
                                var35 = param1.field_t[var17];
                                var36 = param1.field_J[var17];
                                var37 = var11[var34];
                                ((np) this).field_H[var16] = this.a(var32_long, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var34, var37.field_e, var23, param1, var22);
                                var37 = var11[var35];
                                ((np) this).field_z[var16] = this.a(var32_long + (long)var28, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var35, var37.field_e, var25, param1, var24);
                                var37 = var11[var36];
                                ((np) this).field_hb[var16] = this.a(var32_long + (long)var29, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var36, var37.field_e, var27, param1, var26);
                                break L41;
                              }
                            }
                            L43: {
                              if (param1.field_n != null) {
                                ((np) this).field_o[var16] = param1.field_n[var17];
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                            L44: {
                              if (param1.field_h == null) {
                                break L44;
                              } else {
                                ((np) this).field_fb[var16] = param1.field_h[var17];
                                break L44;
                              }
                            }
                            ((np) this).field_X[var16] = param1.field_A[var17];
                            ((np) this).field_I[var16] = (short) var21;
                            var16++;
                            continue L16;
                          }
                        }
                      } else {
                        var17 = param1.field_a[var16];
                        var18 = param1.field_t[var16];
                        var19_int = param1.field_J[var16];
                        var20 = ((np) this).field_P[var18] - ((np) this).field_P[var17];
                        var21 = ((np) this).field_K[var18] - ((np) this).field_K[var17];
                        var22_int = ((np) this).field_A[var18] + -((np) this).field_A[var17];
                        var23_int = ((np) this).field_P[var19_int] - ((np) this).field_P[var17];
                        var24_int = -((np) this).field_K[var17] + ((np) this).field_K[var19_int];
                        var25_int = ((np) this).field_A[var19_int] + -((np) this).field_A[var17];
                        var26_int = var21 * var25_int - var24_int * var22_int;
                        var27_int = var22_int * var23_int - var25_int * var20;
                        var28 = var20 * var24_int + -(var21 * var23_int);
                        L45: while (true) {
                          L46: {
                            if (8192 < var26_int) {
                              break L46;
                            } else {
                              if (-8193 > (var27_int ^ -1)) {
                                break L46;
                              } else {
                                if (-8193 > (var28 ^ -1)) {
                                  break L46;
                                } else {
                                  if (-8192 > var26_int) {
                                    break L46;
                                  } else {
                                    if (-8192 > var27_int) {
                                      break L46;
                                    } else {
                                      if (-8192 <= var28) {
                                        L47: {
                                          var29 = (int)Math.sqrt((double)(var28 * var28 + var26_int * var26_int + var27_int * var27_int));
                                          if (-1 > (var29 ^ -1)) {
                                            break L47;
                                          } else {
                                            var29 = 1;
                                            break L47;
                                          }
                                        }
                                        L48: {
                                          var27_int = 256 * var27_int / var29;
                                          var28 = var28 * 256 / var29;
                                          var26_int = 256 * var26_int / var29;
                                          if (param1.field_G != null) {
                                            stackOut_126_0 = param1.field_G[var16];
                                            stackIn_127_0 = stackOut_126_0;
                                            break L48;
                                          } else {
                                            stackOut_125_0 = 0;
                                            stackIn_127_0 = stackOut_125_0;
                                            break L48;
                                          }
                                        }
                                        L49: {
                                          var30 = stackIn_127_0;
                                          if (var30 != 0) {
                                            if ((var30 ^ -1) != -2) {
                                              break L49;
                                            } else {
                                              var15[var16] = new uo();
                                              var31_ref = new uo();
                                              var31_ref.field_a = var28;
                                              var31_ref.field_b = var26_int;
                                              var31_ref.field_c = var27_int;
                                              break L49;
                                            }
                                          } else {
                                            var31_ref_pa = var11[var17];
                                            var31_ref_pa.field_b = var31_ref_pa.field_b + var27_int;
                                            var31_ref_pa.field_a = var31_ref_pa.field_a + var28;
                                            var31_ref_pa.field_d = var31_ref_pa.field_d + 1;
                                            var31_ref_pa.field_e = var31_ref_pa.field_e + var26_int;
                                            var31_ref_pa = var11[var18];
                                            var31_ref_pa.field_b = var31_ref_pa.field_b + var27_int;
                                            var31_ref_pa.field_d = var31_ref_pa.field_d + 1;
                                            var31_ref_pa.field_a = var31_ref_pa.field_a + var28;
                                            var31_ref_pa.field_e = var31_ref_pa.field_e + var26_int;
                                            var31_ref_pa = var11[var19_int];
                                            var31_ref_pa.field_d = var31_ref_pa.field_d + 1;
                                            var31_ref_pa.field_e = var31_ref_pa.field_e + var26_int;
                                            var31_ref_pa.field_b = var31_ref_pa.field_b + var27_int;
                                            var31_ref_pa.field_a = var31_ref_pa.field_a + var28;
                                            break L49;
                                          }
                                        }
                                        var16++;
                                        continue L15;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var26_int = var26_int >> 1;
                          var28 = var28 >> 1;
                          var27_int = var27_int >> 1;
                          continue L45;
                        }
                      }
                    }
                  } else {
                    var15_int = ((np) this).field_e[var14_int];
                    ((np) this).field_e[var14_int] = var13;
                    var13 = var13 + var15_int;
                    var11[var14_int] = new pa();
                    var14_int++;
                    continue L14;
                  }
                }
              } else {
                L50: {
                  L51: {
                    var12 = var8[var11_int];
                    var13_ref_jt = null;
                    var14_int = 0;
                    var15_int = 0;
                    var16 = 0;
                    var17 = 0;
                    if (null != param1.field_m) {
                      var18 = 0;
                      var19_int = 0;
                      L52: while (true) {
                        if ((var19_int ^ -1) <= (param1.field_m.length ^ -1)) {
                          if (var18 != 0) {
                            var9[var11_int] = 9223372036854775807L;
                            ((np) this).field_ib = ((np) this).field_ib - 1;
                            break L50;
                          } else {
                            break L51;
                          }
                        } else {
                          L53: {
                            var20_ref_jt = param1.field_m[var19_int];
                            if ((var12 ^ -1) == (var20_ref_jt.field_a ^ -1)) {
                              L54: {
                                var21_ref = fw.a(var20_ref_jt.field_d, false);
                                if (var21_ref.field_i) {
                                  var18 = 1;
                                  break L54;
                                } else {
                                  break L54;
                                }
                              }
                              if ((var21_ref.field_f ^ -1) != 0) {
                                var22_ref = var7.a((byte) -92, var21_ref.field_f);
                                if (-3 != (var22_ref.field_d ^ -1)) {
                                  break L53;
                                } else {
                                  ((np) this).field_s = true;
                                  break L53;
                                }
                              } else {
                                break L53;
                              }
                            } else {
                              break L53;
                            }
                          }
                          var19_int++;
                          continue L52;
                        }
                      }
                    } else {
                      break L51;
                    }
                  }
                  L55: {
                    var18 = -1;
                    if (param1.field_r != null) {
                      var18 = param1.field_r[var12];
                      if ((var18 ^ -1) != 0) {
                        L56: {
                          var13_ref = var7.a((byte) 118, 65535 & var18);
                          if ((64 & ((np) this).field_u ^ -1) == -1) {
                            break L56;
                          } else {
                            if (var13_ref.field_p) {
                              var18 = -1;
                              var13_ref = null;
                              break L55;
                            } else {
                              break L56;
                            }
                          }
                        }
                        L57: {
                          var16 = var13_ref.field_h;
                          if (0 != var13_ref.field_s) {
                            break L57;
                          } else {
                            if (0 != var13_ref.field_o) {
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                        }
                        var17 = var13_ref.field_a;
                        break L55;
                      } else {
                        break L55;
                      }
                    } else {
                      break L55;
                    }
                  }
                  L58: {
                    L59: {
                      L60: {
                        if (param1.field_n == null) {
                          break L60;
                        } else {
                          if ((param1.field_n[var12] ^ -1) != -1) {
                            break L59;
                          } else {
                            break L60;
                          }
                        }
                      }
                      L61: {
                        if (var13_ref == null) {
                          break L61;
                        } else {
                          if (var13_ref.field_d == 0) {
                            break L61;
                          } else {
                            break L59;
                          }
                        }
                      }
                      stackOut_73_0 = 0;
                      stackIn_74_0 = stackOut_73_0;
                      break L58;
                    }
                    stackOut_72_0 = 1;
                    stackIn_74_0 = stackOut_72_0;
                    break L58;
                  }
                  L62: {
                    L63: {
                      var19_int = stackIn_74_0;
                      if (var10 != 0) {
                        break L63;
                      } else {
                        if (var19_int == 0) {
                          break L62;
                        } else {
                          break L63;
                        }
                      }
                    }
                    if (null != param1.field_C) {
                      var14_int = var14_int + (param1.field_C[var12] << -1243823247);
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  L64: {
                    if (var19_int == 0) {
                      break L64;
                    } else {
                      var14_int = var14_int + 65536;
                      break L64;
                    }
                  }
                  var14_int = var14_int + (var16 << -354507832 & 65280);
                  var15_int = var15_int + ((var18 & 65535) << 1580516080);
                  var14_int = var14_int + (var17 & 255);
                  var15_int = var15_int + (65535 & var11_int);
                  var9[var11_int] = ((long)var14_int << -1008284320) - -(long)var15_int;
                  ((np) this).field_s = ((np) this).field_s | var19_int != 0;
                  break L50;
                }
                var11_int++;
                continue L7;
              }
            }
          } else {
            L65: {
              L66: {
                if (param1.field_G == null) {
                  break L66;
                } else {
                  if (2 == param1.field_G[var9_int]) {
                    break L65;
                  } else {
                    break L66;
                  }
                }
              }
              L67: {
                if (param1.field_r == null) {
                  break L67;
                } else {
                  if (0 != (param1.field_r[var9_int] ^ -1)) {
                    L68: {
                      var10_ref = var7.a((byte) 111, param1.field_r[var9_int] & 65535);
                      if ((64 & ((np) this).field_u) == 0) {
                        break L68;
                      } else {
                        if (var10_ref.field_p) {
                          break L67;
                        } else {
                          break L68;
                        }
                      }
                    }
                    if (var10_ref.field_f) {
                      break L65;
                    } else {
                      break L67;
                    }
                  } else {
                    break L67;
                  }
                }
              }
              ((np) this).field_W = ((np) this).field_W + 1;
              var8[((np) this).field_W] = var9_int;
              ((np) this).field_e[param1.field_a[var9_int]] = ((np) this).field_e[param1.field_a[var9_int]] + 1;
              ((np) this).field_e[param1.field_t[var9_int]] = ((np) this).field_e[param1.field_t[var9_int]] + 1;
              ((np) this).field_e[param1.field_J[var9_int]] = ((np) this).field_e[param1.field_J[var9_int]] + 1;
              break L65;
            }
            var9_int++;
            continue L5;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "<%0> has entered another game.";
    }
}
