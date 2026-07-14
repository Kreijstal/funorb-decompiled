/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends qc {
    private int[] field_gb;
    private boolean field_M;
    private int[] field_mb;
    private int[] field_C;
    private boolean field_X;
    private int[][] field_I;
    private int field_T;
    private byte[] field_m;
    private int field_eb;
    int[] field_n;
    private short[] field_p;
    private short field_lb;
    private int field_L;
    private int[] field_v;
    private int[][] field_nb;
    private byte[] field_w;
    private short[] field_fb;
    private byte[] field_o;
    private int[] field_N;
    private int[] field_h;
    private int field_ab;
    private int[] field_E;
    private short[] field_x;
    private static eg field_r;
    private int[] field_W;
    private int[] field_S;
    private int[] field_kb;
    private static int[] field_cb;
    private int[] field_qb;
    private static byte[] field_jb;
    private static int[] field_G;
    private static short[] field_y;
    private static int[] field_j;
    private static int[] field_Z;
    private static int field_A;
    private static int[] field_U;
    private static int[] field_q;
    private static int[] field_D;
    private static int[] field_z;
    private short[] field_ob;
    private static int[] field_k;
    private static boolean field_O;
    private static int[] field_J;
    private static int[] field_i;
    private static int[] field_V;
    private static int[] field_H;
    private static int[][] field_Q;
    private static int field_bb;
    private static boolean[] field_ib;
    private static int[] field_R;
    private static int[] field_s;
    private static int[][] field_Y;
    private static int[] field_db;
    private static int[] field_P;
    private static int[] field_u;
    private static boolean field_l;
    private static int[] field_B;
    private static int field_pb;
    private static boolean[] field_F;
    private static int[] field_t;
    private static int[][] field_K;
    private static int field_hb;

    public static void d() {
        field_r = null;
        field_jb = null;
        field_y = null;
        field_G = null;
        field_cb = null;
        field_j = null;
        field_F = null;
        field_ib = null;
        field_i = null;
        field_s = null;
        field_U = null;
        field_R = null;
        field_B = null;
        field_u = null;
        field_D = null;
        field_Q = null;
        field_P = null;
        field_K = null;
        field_J = null;
        field_k = null;
        field_q = null;
        field_Y = null;
        field_V = null;
        field_Z = null;
        field_z = null;
        field_t = null;
        field_db = null;
        field_H = null;
    }

    private final void c() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        short stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var4 >= ((eg) this).field_ab) {
                            statePc = 14;
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
                        if (((eg) this).field_x == null) {
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
                        stackOut_5_0 = ((eg) this).field_x[var4];
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
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = -1;
                    stackIn_8_0 = stackOut_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var3 = stackIn_8_0;
                    if (var3 != -1) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var1 = ((eg) this).field_p[var4] & 65535;
                    if (((eg) this).field_n[var4] != -1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var2 = ((eg) this).field_kb[var4] & -131072;
                    ((eg) this).field_kb[var4] = var2 | eg.a(var1, var2 >> 17);
                    statePc = 13;
                    continue stateLoop;
                }
                case 11: {
                    if (((eg) this).field_n[var4] == -2) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var2 = ((eg) this).field_kb[var4] & -131072;
                    ((eg) this).field_kb[var4] = var2 | eg.a(var1, var2 >> 17);
                    var2 = ((eg) this).field_v[var4] & -131072;
                    ((eg) this).field_v[var4] = var2 | eg.a(var1, var2 >> 17);
                    var2 = ((eg) this).field_n[var4] & -131072;
                    ((eg) this).field_n[var4] = var2 | eg.a(var1, var2 >> 17);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var4++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_10_0 = null;
        Object stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!field_ib[param0]) {
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
                        this.c(param0);
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
                    var2 = ((eg) this).field_gb[param0];
                    var3 = ((eg) this).field_S[param0];
                    var4 = ((eg) this).field_h[param0];
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        t.field_g = field_F[param0];
                        if (((eg) this).field_m != null) {
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
                        t.field_h = 0;
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
                    t.field_h = ((eg) this).field_m[param0] & 255;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (((eg) this).field_x == null) {
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
                        if (((eg) this).field_x[param0] != -1) {
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
                        if (((eg) this).field_n[param0] != -1) {
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
                        t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], t.field_l[((eg) this).field_kb[param0] & 65535]);
                        statePc = 29;
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
                    t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], ((eg) this).field_kb[param0] & 65535, ((eg) this).field_v[param0] & 65535, ((eg) this).field_n[param0] & 65535);
                    statePc = 29;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        if (((eg) this).field_o == null) {
                            statePc = 24;
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
                        if (((eg) this).field_o[param0] == -1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
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
                    var8 = ((eg) this).field_o[param0] & 255;
                    var5 = ((eg) this).field_mb[var8];
                    var6 = ((eg) this).field_C[var8];
                    var7 = ((eg) this).field_qb[var8];
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        if (((eg) this).field_n[param0] != -1) {
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
                        t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], field_R[var5], field_R[var6], field_R[var7], field_B[var5], field_B[var6], field_B[var7], field_u[var5], field_u[var6], field_u[var7], (int) ((eg) this).field_x[param0]);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 28: {
                    t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], ((eg) this).field_kb[param0], ((eg) this).field_v[param0], ((eg) this).field_n[param0], field_R[var5], field_R[var6], field_R[var7], field_B[var5], field_B[var6], field_B[var7], field_u[var5], field_u[var6], field_u[var7], (int) ((eg) this).field_x[param0]);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f() {
        int var1 = 0;
        int var2 = 0;
        for (var1 = 0; var1 < ((eg) this).field_L; var1++) {
            var2 = ((eg) this).field_N[var1];
            ((eg) this).field_N[var1] = ((eg) this).field_E[var1];
            ((eg) this).field_E[var1] = -var2;
        }
        ((eg) this).field_M = false;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = param1.length;
                    if (param0 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var8 = 0;
                    field_pb = 0;
                    field_hb = 0;
                    field_A = 0;
                    var9 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var9 >= var7) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var10_int = param1[var9];
                    if (var10_int >= ((eg) this).field_I.length) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var11_ref_int__ = ((eg) this).field_I[var10_int];
                    var12 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var12 >= var11_ref_int__.length) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var13 = var11_ref_int__[var12];
                    field_pb = field_pb + ((eg) this).field_N[var13];
                    field_hb = field_hb + ((eg) this).field_W[var13];
                    field_A = field_A + ((eg) this).field_E[var13];
                    var8++;
                    var12++;
                    statePc = 5;
                    continue stateLoop;
                }
                case 7: {
                    var9++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (var8 <= 0) {
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
                        field_pb = field_pb / var8 + param2;
                        field_hb = field_hb / var8 + param3;
                        field_A = field_A / var8 + param4;
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
                    field_pb = param2;
                    field_hb = param3;
                    field_A = param4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    if (param0 != 1) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var8 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var8 >= var7) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var9 = param1[var8];
                    if (var9 >= ((eg) this).field_I.length) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10 = ((eg) this).field_I[var9];
                    var11 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var11 >= var10.length) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var12 = var10[var11];
                    ((eg) this).field_N[var12] = ((eg) this).field_N[var12] + param2;
                    ((eg) this).field_W[var12] = ((eg) this).field_W[var12] + param3;
                    ((eg) this).field_E[var12] = ((eg) this).field_E[var12] + param4;
                    var11++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 20: {
                    var8++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 22: {
                    if (param0 != 2) {
                        statePc = 37;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var8 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var8 >= var7) {
                        statePc = 36;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var9 = param1[var8];
                    if (var9 >= ((eg) this).field_I.length) {
                        statePc = 35;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var10 = ((eg) this).field_I[var9];
                    var11 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var11 >= var10.length) {
                        statePc = 35;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var12 = var10[var11];
                    ((eg) this).field_N[var12] = ((eg) this).field_N[var12] - field_pb;
                    ((eg) this).field_W[var12] = ((eg) this).field_W[var12] - field_hb;
                    ((eg) this).field_E[var12] = ((eg) this).field_E[var12] - field_A;
                    if (param4 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var13 = t.field_f[param4];
                    var14 = t.field_o[param4];
                    var15 = ((eg) this).field_W[var12] * var13 + ((eg) this).field_N[var12] * var14 + 32767 >> 16;
                    ((eg) this).field_W[var12] = ((eg) this).field_W[var12] * var14 - ((eg) this).field_N[var12] * var13 + 32767 >> 16;
                    ((eg) this).field_N[var12] = var15;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (param2 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var13 = t.field_f[param2];
                    var14 = t.field_o[param2];
                    var15 = ((eg) this).field_W[var12] * var14 - ((eg) this).field_E[var12] * var13 + 32767 >> 16;
                    ((eg) this).field_E[var12] = ((eg) this).field_W[var12] * var13 + ((eg) this).field_E[var12] * var14 + 32767 >> 16;
                    ((eg) this).field_W[var12] = var15;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (param3 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var13 = t.field_f[param3];
                    var14 = t.field_o[param3];
                    var15 = ((eg) this).field_E[var12] * var13 + ((eg) this).field_N[var12] * var14 + 32767 >> 16;
                    ((eg) this).field_E[var12] = ((eg) this).field_E[var12] * var14 - ((eg) this).field_N[var12] * var13 + 32767 >> 16;
                    ((eg) this).field_N[var12] = var15;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    ((eg) this).field_N[var12] = ((eg) this).field_N[var12] + field_pb;
                    ((eg) this).field_W[var12] = ((eg) this).field_W[var12] + field_hb;
                    ((eg) this).field_E[var12] = ((eg) this).field_E[var12] + field_A;
                    var11++;
                    statePc = 27;
                    continue stateLoop;
                }
                case 35: {
                    var8++;
                    statePc = 24;
                    continue stateLoop;
                }
                case 36: {
                    return;
                }
                case 37: {
                    if (param0 != 3) {
                        statePc = 46;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var8 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var8 >= var7) {
                        statePc = 45;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var9 = param1[var8];
                    if (var9 >= ((eg) this).field_I.length) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var10 = ((eg) this).field_I[var9];
                    var11 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (var11 >= var10.length) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var12 = var10[var11];
                    ((eg) this).field_N[var12] = ((eg) this).field_N[var12] - field_pb;
                    ((eg) this).field_W[var12] = ((eg) this).field_W[var12] - field_hb;
                    ((eg) this).field_E[var12] = ((eg) this).field_E[var12] - field_A;
                    ((eg) this).field_N[var12] = ((eg) this).field_N[var12] * param2 / 128;
                    ((eg) this).field_W[var12] = ((eg) this).field_W[var12] * param3 / 128;
                    ((eg) this).field_E[var12] = ((eg) this).field_E[var12] * param4 / 128;
                    ((eg) this).field_N[var12] = ((eg) this).field_N[var12] + field_pb;
                    ((eg) this).field_W[var12] = ((eg) this).field_W[var12] + field_hb;
                    ((eg) this).field_E[var12] = ((eg) this).field_E[var12] + field_A;
                    var11++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 44: {
                    var8++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 45: {
                    return;
                }
                case 46: {
                    try {
                        if (param0 != 5) {
                            statePc = 65;
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
                        if (((eg) this).field_nb == null) {
                            statePc = 64;
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
                        if (((eg) this).field_m == null) {
                            statePc = 64;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 53: {
                    var8 = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var8 >= var7) {
                        statePc = 64;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var9 = param1[var8];
                    if (var9 >= ((eg) this).field_nb.length) {
                        statePc = 63;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var10 = ((eg) this).field_nb[var9];
                    var11 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var11 >= var10.length) {
                        statePc = 63;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var12 = var10[var11];
                    var13 = (((eg) this).field_m[var12] & 255) + param2 * 8;
                    if (var13 >= 0) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var13 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 60: {
                    if (var13 <= 255) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var13 = 255;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    ((eg) this).field_m[var12] = (byte)var13;
                    var11++;
                    statePc = 57;
                    continue stateLoop;
                }
                case 63: {
                    var8++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 64: {
                    return;
                }
                case 65: {
                    try {
                        if (param0 != 7) {
                            statePc = 86;
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
                        if (((eg) this).field_nb == null) {
                            statePc = 85;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 69: {
                    var8 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (var8 >= var7) {
                        statePc = 85;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var9 = param1[var8];
                    if (var9 >= ((eg) this).field_nb.length) {
                        statePc = 84;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var10 = ((eg) this).field_nb[var9];
                    var11 = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (var11 >= var10.length) {
                        statePc = 83;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var12 = var10[var11];
                    var13 = ((eg) this).field_p[var12] & 65535;
                    var14 = var13 >> 10 & 63;
                    var15 = var13 >> 7 & 7;
                    var16 = var13 & 127;
                    var14 = var14 + param2 & 63;
                    var15 = var15 + param3;
                    if (var15 >= 0) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var15 = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 76: {
                    if (var15 <= 7) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var15 = 7;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var16 = var16 + param4;
                    if (var16 >= 0) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var16 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 80: {
                    if (var16 <= 127) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var16 = 127;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    ((eg) this).field_p[var12] = (short)(var14 << 10 | var15 << 7 | var16);
                    var11++;
                    statePc = 73;
                    continue stateLoop;
                }
                case 83: {
                    ((eg) this).field_X = true;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    var8++;
                    statePc = 70;
                    continue stateLoop;
                }
                case 85: {
                    return;
                }
                case 86: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((eg) this).field_M) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        this.e();
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9_int = t.field_p;
                        var10 = t.field_e;
                        var11 = t.field_f[param0];
                        var12 = t.field_o[param0];
                        var13 = t.field_f[param1];
                        var14 = t.field_o[param1];
                        var15 = t.field_f[param2];
                        var16 = t.field_o[param2];
                        var17 = t.field_f[param3];
                        var18 = t.field_o[param3];
                        var19 = param5 * var17 + param6 * var18 >> 16;
                        var20 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var20 >= ((eg) this).field_L) {
                            statePc = 18;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var21 = ((eg) this).field_N[var20];
                        var22 = ((eg) this).field_W[var20];
                        var23 = ((eg) this).field_E[var20];
                        if (param2 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var24 = var22 * var15 + var21 * var16 >> 16;
                        var22 = var22 * var16 - var21 * var15 >> 16;
                        var21 = var24;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var24 = var22 * var12 - var23 * var11 >> 16;
                        var23 = var22 * var11 + var23 * var12 >> 16;
                        var22 = var24;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param1 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var24 = var23 * var13 + var21 * var14 >> 16;
                        var23 = var23 * var14 - var21 * var13 >> 16;
                        var21 = var24;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var21 = var21 + param4;
                        var22 = var22 + param5;
                        var23 = var23 + param6;
                        var24 = var22 * var18 - var23 * var17 >> 16;
                        var23 = var22 * var17 + var23 * var18 >> 16;
                        var22 = var24;
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
                        field_U[var20] = var23 - var19;
                        field_i[var20] = var9_int + (var21 << 9) / param7;
                        field_s[var20] = var10 + (var22 << 9) / param7;
                        if (((eg) this).field_eb <= 0) {
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
                        field_R[var20] = var21;
                        field_B[var20] = var22;
                        field_u[var20] = var23;
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
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var20++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.a(false, false, 0L, (int) ((eg) this).field_lb, ((eg) this).field_lb << 1);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var9 = (RuntimeException) (Object) caughtException;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final static int a(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
            param1 = 2;
        } else {
            if (param1 > 126) {
                param1 = 126;
            }
        }
        return (param0 & 65408) + param1;
    }

    private final void c(int param0) {
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var2 = t.field_p;
          var3 = t.field_e;
          var4 = 0;
          var5 = ((eg) this).field_gb[param0];
          var6 = ((eg) this).field_S[param0];
          var7 = ((eg) this).field_h[param0];
          var8 = field_u[var5];
          var9 = field_u[var6];
          var10 = field_u[var7];
          if (((eg) this).field_m != null) {
            t.field_h = ((eg) this).field_m[param0] & 255;
            break L0;
          } else {
            t.field_h = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_R[var5];
              var12 = field_B[var5];
              var13 = ((eg) this).field_kb[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * t.field_m[var10 - var8];
                field_t[var4] = var2 + (var11 + ((field_R[var7] - var11) * var14 >> 16) << 9) / 50;
                field_db[var4] = var3 + (var12 + ((field_B[var7] - var12) * var14 >> 16) << 9) / 50;
                var4++;
                field_H[var4] = var13 + (((((eg) this).field_n[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * t.field_m[var9 - var8];
              field_t[var4] = var2 + (var11 + ((field_R[var6] - var11) * var14 >> 16) << 9) / 50;
              field_db[var4] = var3 + (var12 + ((field_B[var6] - var12) * var14 >> 16) << 9) / 50;
              var4++;
              field_H[var4] = var13 + (((((eg) this).field_v[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_t[var4] = field_i[var5];
            field_db[var4] = field_s[var5];
            var4++;
            field_H[var4] = ((eg) this).field_kb[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_R[var6];
              var12 = field_B[var6];
              var13 = ((eg) this).field_v[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * t.field_m[var8 - var9];
                field_t[var4] = var2 + (var11 + ((field_R[var5] - var11) * var14 >> 16) << 9) / 50;
                field_db[var4] = var3 + (var12 + ((field_B[var5] - var12) * var14 >> 16) << 9) / 50;
                var4++;
                field_H[var4] = var13 + (((((eg) this).field_kb[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * t.field_m[var10 - var9];
              field_t[var4] = var2 + (var11 + ((field_R[var7] - var11) * var14 >> 16) << 9) / 50;
              field_db[var4] = var3 + (var12 + ((field_B[var7] - var12) * var14 >> 16) << 9) / 50;
              var4++;
              field_H[var4] = var13 + (((((eg) this).field_n[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_t[var4] = field_i[var6];
            field_db[var4] = field_s[var6];
            var4++;
            field_H[var4] = ((eg) this).field_v[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_R[var7];
              var12 = field_B[var7];
              var13 = ((eg) this).field_n[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * t.field_m[var9 - var10];
                field_t[var4] = var2 + (var11 + ((field_R[var6] - var11) * var14 >> 16) << 9) / 50;
                field_db[var4] = var3 + (var12 + ((field_B[var6] - var12) * var14 >> 16) << 9) / 50;
                var4++;
                field_H[var4] = var13 + (((((eg) this).field_v[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * t.field_m[var8 - var10];
              field_t[var4] = var2 + (var11 + ((field_R[var5] - var11) * var14 >> 16) << 9) / 50;
              field_db[var4] = var3 + (var12 + ((field_B[var5] - var12) * var14 >> 16) << 9) / 50;
              var4++;
              field_H[var4] = var13 + (((((eg) this).field_kb[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_t[var4] = field_i[var7];
            field_db[var4] = field_s[var7];
            var4++;
            field_H[var4] = ((eg) this).field_n[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_t[0];
          var12 = field_t[1];
          var13 = field_t[2];
          var14 = field_db[0];
          var15 = field_db[1];
          var16 = field_db[2];
          t.field_g = false;
          if (var4 != 3) {
            break L7;
          } else {
            L8: {
              L9: {
                if (var11 < 0) {
                  break L9;
                } else {
                  if (var12 < 0) {
                    break L9;
                  } else {
                    if (var13 < 0) {
                      break L9;
                    } else {
                      if (var11 > t.field_b) {
                        break L9;
                      } else {
                        if (var12 > t.field_b) {
                          break L9;
                        } else {
                          if (var13 <= t.field_b) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              t.field_g = true;
              break L8;
            }
            L10: {
              if (((eg) this).field_x == null) {
                break L10;
              } else {
                if (((eg) this).field_x[param0] != -1) {
                  L11: {
                    L12: {
                      if (((eg) this).field_o == null) {
                        break L12;
                      } else {
                        if (((eg) this).field_o[param0] == -1) {
                          break L12;
                        } else {
                          var20 = ((eg) this).field_o[param0] & 255;
                          var17 = ((eg) this).field_mb[var20];
                          var18 = ((eg) this).field_C[var20];
                          var19 = ((eg) this).field_qb[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (((eg) this).field_n[param0] != -1) {
                    t.a(var14, var15, var16, var11, var12, var13, field_H[0], field_H[1], field_H[2], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], (int) ((eg) this).field_x[param0]);
                    break L7;
                  } else {
                    t.a(var14, var15, var16, var11, var12, var13, ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], (int) ((eg) this).field_x[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((eg) this).field_n[param0] != -1) {
              t.a(var14, var15, var16, var11, var12, var13, field_H[0], field_H[1], field_H[2]);
              break L7;
            } else {
              t.a(var14, var15, var16, var11, var12, var13, t.field_l[((eg) this).field_kb[param0] & 65535]);
              break L7;
            }
          }
        }
        L13: {
          if (var4 != 4) {
            break L13;
          } else {
            L14: {
              L15: {
                if (var11 < 0) {
                  break L15;
                } else {
                  if (var12 < 0) {
                    break L15;
                  } else {
                    if (var13 < 0) {
                      break L15;
                    } else {
                      if (var11 > t.field_b) {
                        break L15;
                      } else {
                        if (var12 > t.field_b) {
                          break L15;
                        } else {
                          if (var13 > t.field_b) {
                            break L15;
                          } else {
                            if (field_t[3] < 0) {
                              break L15;
                            } else {
                              if (field_t[3] <= t.field_b) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              t.field_g = true;
              break L14;
            }
            L16: {
              if (((eg) this).field_x == null) {
                break L16;
              } else {
                if (((eg) this).field_x[param0] != -1) {
                  L17: {
                    L18: {
                      if (((eg) this).field_o == null) {
                        break L18;
                      } else {
                        if (((eg) this).field_o[param0] == -1) {
                          break L18;
                        } else {
                          var20 = ((eg) this).field_o[param0] & 255;
                          var17 = ((eg) this).field_mb[var20];
                          var18 = ((eg) this).field_C[var20];
                          var19 = ((eg) this).field_qb[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = ((eg) this).field_x[param0];
                  if (((eg) this).field_n[param0] != -1) {
                    t.a(var14, var15, var16, var11, var12, var13, field_H[0], field_H[1], field_H[2], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], var20);
                    t.a(var14, var16, field_db[3], var11, var13, field_t[3], field_H[0], field_H[2], field_H[3], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], var20);
                    break L13;
                  } else {
                    t.a(var14, var15, var16, var11, var12, var13, ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], var20);
                    t.a(var14, var16, field_db[3], var11, var13, field_t[3], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], var20);
                    break L13;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (((eg) this).field_n[param0] != -1) {
              t.a(var14, var15, var16, var11, var12, var13, field_H[0], field_H[1], field_H[2]);
              t.a(var14, var16, field_db[3], var11, var13, field_t[3], field_H[0], field_H[2], field_H[3]);
              break L13;
            } else {
              var17 = t.field_l[((eg) this).field_kb[param0] & 65535];
              t.a(var14, var15, var16, var11, var12, var13, var17);
              t.a(var14, var16, field_db[3], var11, var13, field_t[3], var17);
              break L13;
            }
          }
        }
    }

    private final static int d(int param0) {
        if (param0 < 2) {
            param0 = 2;
        } else {
            if (param0 > 126) {
                param0 = 126;
            }
        }
        return param0;
    }

    private final void a(boolean param0, boolean param1, long param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        int[] var14 = null;
        int var15_int = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int stackIn_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        if (param4 < 1600) {
          L0: {
            var7 = 0;
            if (field_l) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_bb = 0;
                      break L0;
                    } else {
                      field_P[var8] = 0;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  field_D[var8] = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= ((eg) this).field_ab) {
              L4: {
                if (!field_l) {
                  if (((eg) this).field_w != null) {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= 12) {
                        var8 = param4 - 1;
                        L6: while (true) {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            L7: {
                              var9 = field_D[var8];
                              if (var9 <= 0) {
                                break L7;
                              } else {
                                L8: {
                                  if (var9 <= 64) {
                                    var10 = var9;
                                    break L8;
                                  } else {
                                    var10 = 64;
                                    break L8;
                                  }
                                }
                                var11_ref_int__ = field_Q[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    L10: {
                                      var13 = var11_ref_int__[var12];
                                      var14_int = ((eg) this).field_w[var13];
                                      field_q[var14_int] = field_q[var14_int] + 1;
                                      var15_int = field_q[var14_int];
                                      field_Y[var14_int][var15_int] = var13;
                                      if (var14_int >= 10) {
                                        if (var14_int != 10) {
                                          field_Z[var15_int] = var8;
                                          break L10;
                                        } else {
                                          field_V[var15_int] = var8;
                                          break L10;
                                        }
                                      } else {
                                        field_z[var14_int] = field_z[var14_int] + var8;
                                        break L10;
                                      }
                                    }
                                    var12++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                            L11: {
                              if (var9 <= 64) {
                                break L11;
                              } else {
                                var10 = field_D[var8] - 64 - 1;
                                var11_ref_int__ = field_K[var10];
                                var12 = 0;
                                L12: while (true) {
                                  if (var12 >= field_P[var10]) {
                                    break L11;
                                  } else {
                                    L13: {
                                      var13 = var11_ref_int__[var12];
                                      var14_int = ((eg) this).field_w[var13];
                                      field_q[var14_int] = field_q[var14_int] + 1;
                                      var15_int = field_q[var14_int];
                                      field_Y[var14_int][var15_int] = var13;
                                      if (var14_int >= 10) {
                                        if (var14_int != 10) {
                                          field_Z[var15_int] = var8;
                                          break L13;
                                        } else {
                                          field_V[var15_int] = var8;
                                          break L13;
                                        }
                                      } else {
                                        field_z[var14_int] = field_z[var14_int] + var8;
                                        break L13;
                                      }
                                    }
                                    var12++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                            var8--;
                            continue L6;
                          }
                        }
                      } else {
                        field_q[var8] = 0;
                        field_z[var8] = 0;
                        var8++;
                        continue L5;
                      }
                    }
                  } else {
                    var8 = param4 - 1;
                    L14: while (true) {
                      if (var8 < 0) {
                        return;
                      } else {
                        L15: {
                          var9 = field_D[var8];
                          if (var9 <= 0) {
                            break L15;
                          } else {
                            L16: {
                              if (var9 <= 64) {
                                stackOut_91_0 = var9;
                                stackIn_92_0 = stackOut_91_0;
                                break L16;
                              } else {
                                stackOut_90_0 = 64;
                                stackIn_92_0 = stackOut_90_0;
                                break L16;
                              }
                            }
                            var10 = stackIn_92_0;
                            var11_ref_int__ = field_Q[var8];
                            var12 = 0;
                            L17: while (true) {
                              if (var12 >= var10) {
                                break L15;
                              } else {
                                this.e(var11_ref_int__[var12]);
                                var12++;
                                continue L17;
                              }
                            }
                          }
                        }
                        L18: {
                          if (var9 <= 64) {
                            break L18;
                          } else {
                            var10 = field_D[var8] - 64 - 1;
                            var11_ref_int__ = field_K[var10];
                            var12 = 0;
                            L19: while (true) {
                              if (var12 >= field_P[var10]) {
                                break L18;
                              } else {
                                this.e(var11_ref_int__[var12]);
                                var12++;
                                continue L19;
                              }
                            }
                          }
                        }
                        var8--;
                        continue L14;
                      }
                    }
                  }
                } else {
                  qi.a(0, var7 - 1, -1, field_J, field_k);
                  if (((eg) this).field_w != null) {
                    var8 = 0;
                    L20: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L21: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            L22: {
                              var9 = field_k[var8];
                              var10 = field_J[var8];
                              var11 = ((eg) this).field_w[var9];
                              field_q[var11] = field_q[var11] + 1;
                              var12 = field_q[var11];
                              field_Y[var11][var12] = var9;
                              if (var11 >= 10) {
                                if (var11 != 10) {
                                  field_Z[var12] = var10;
                                  break L22;
                                } else {
                                  field_V[var12] = var10;
                                  break L22;
                                }
                              } else {
                                field_z[var11] = field_z[var11] + var10;
                                break L22;
                              }
                            }
                            var8++;
                            continue L21;
                          }
                        }
                      } else {
                        field_q[var8] = 0;
                        field_z[var8] = 0;
                        var8++;
                        continue L20;
                      }
                    }
                  } else {
                    var8 = 0;
                    L23: while (true) {
                      if (var8 >= var7) {
                        return;
                      } else {
                        this.e(field_k[var8]);
                        var8++;
                        continue L23;
                      }
                    }
                  }
                }
              }
              L24: {
                L25: {
                  var8 = 0;
                  if (field_q[1] > 0) {
                    break L25;
                  } else {
                    if (field_q[2] <= 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                var8 = (field_z[1] + field_z[2]) / (field_q[1] + field_q[2]);
                break L24;
              }
              L26: {
                L27: {
                  var9 = 0;
                  if (field_q[3] > 0) {
                    break L27;
                  } else {
                    if (field_q[4] <= 0) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                var9 = (field_z[3] + field_z[4]) / (field_q[3] + field_q[4]);
                break L26;
              }
              L28: {
                L29: {
                  var10 = 0;
                  if (field_q[6] > 0) {
                    break L29;
                  } else {
                    if (field_q[8] <= 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                var10 = (field_z[6] + field_z[8]) / (field_q[6] + field_q[8]);
                break L28;
              }
              L30: {
                var12 = 0;
                var13 = field_q[10];
                var14 = field_Y[10];
                var15 = field_V;
                if (var12 != var13) {
                  break L30;
                } else {
                  var12 = 0;
                  var13 = field_q[11];
                  var14 = field_Y[11];
                  var15 = field_Z;
                  break L30;
                }
              }
              L31: {
                if (var12 >= var13) {
                  var11 = -1000;
                  break L31;
                } else {
                  var11 = var15[var12];
                  break L31;
                }
              }
              var16 = 0;
              L32: while (true) {
                if (var16 >= 10) {
                  L33: while (true) {
                    if (var11 == -1000) {
                      return;
                    } else {
                      L34: {
                        var12++;
                        this.e(var14[var12]);
                        if (var12 != var13) {
                          break L34;
                        } else {
                          if (var14 == field_Y[11]) {
                            break L34;
                          } else {
                            var12 = 0;
                            var14 = field_Y[11];
                            var13 = field_q[11];
                            var15 = field_Z;
                            break L34;
                          }
                        }
                      }
                      if (var12 >= var13) {
                        var11 = -1000;
                        continue L33;
                      } else {
                        var11 = var15[var12];
                        continue L33;
                      }
                    }
                  }
                } else {
                  L35: while (true) {
                    L36: {
                      if (var16 != 0) {
                        break L36;
                      } else {
                        if (var11 <= var8) {
                          break L36;
                        } else {
                          L37: {
                            var12++;
                            this.e(var14[var12]);
                            if (var12 != var13) {
                              break L37;
                            } else {
                              if (var14 == field_Y[11]) {
                                break L37;
                              } else {
                                var12 = 0;
                                var13 = field_q[11];
                                var14 = field_Y[11];
                                var15 = field_Z;
                                break L37;
                              }
                            }
                          }
                          if (var12 >= var13) {
                            var11 = -1000;
                            continue L35;
                          } else {
                            var11 = var15[var12];
                            continue L35;
                          }
                        }
                      }
                    }
                    L38: while (true) {
                      L39: {
                        if (var16 != 3) {
                          break L39;
                        } else {
                          if (var11 <= var9) {
                            break L39;
                          } else {
                            L40: {
                              var12++;
                              this.e(var14[var12]);
                              if (var12 != var13) {
                                break L40;
                              } else {
                                if (var14 == field_Y[11]) {
                                  break L40;
                                } else {
                                  var12 = 0;
                                  var13 = field_q[11];
                                  var14 = field_Y[11];
                                  var15 = field_Z;
                                  break L40;
                                }
                              }
                            }
                            if (var12 >= var13) {
                              var11 = -1000;
                              continue L38;
                            } else {
                              var11 = var15[var12];
                              continue L38;
                            }
                          }
                        }
                      }
                      L41: while (true) {
                        L42: {
                          if (var16 != 5) {
                            break L42;
                          } else {
                            if (var11 <= var10) {
                              break L42;
                            } else {
                              L43: {
                                var12++;
                                this.e(var14[var12]);
                                if (var12 != var13) {
                                  break L43;
                                } else {
                                  if (var14 == field_Y[11]) {
                                    break L43;
                                  } else {
                                    var12 = 0;
                                    var13 = field_q[11];
                                    var14 = field_Y[11];
                                    var15 = field_Z;
                                    break L43;
                                  }
                                }
                              }
                              if (var12 >= var13) {
                                var11 = -1000;
                                continue L41;
                              } else {
                                var11 = var15[var12];
                                continue L41;
                              }
                            }
                          }
                        }
                        var17 = field_q[var16];
                        var18 = field_Y[var16];
                        var19 = 0;
                        L44: while (true) {
                          if (var19 >= var17) {
                            var16++;
                            continue L32;
                          } else {
                            this.e(var18[var19]);
                            var19++;
                            continue L44;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L45: {
                if (((eg) this).field_n[var8] != -2) {
                  L46: {
                    var9 = ((eg) this).field_gb[var8];
                    var10 = ((eg) this).field_S[var8];
                    var11 = ((eg) this).field_h[var8];
                    var12 = field_i[var9];
                    var13 = field_i[var10];
                    var14_int = field_i[var11];
                    if (!param0) {
                      break L46;
                    } else {
                      L47: {
                        if (var12 == -5000) {
                          break L47;
                        } else {
                          if (var13 == -5000) {
                            break L47;
                          } else {
                            if (var14_int != -5000) {
                              break L46;
                            } else {
                              break L47;
                            }
                          }
                        }
                      }
                      L48: {
                        var15_int = field_R[var9];
                        var16 = field_R[var10];
                        var17 = field_R[var11];
                        var18_int = field_B[var9];
                        var19 = field_B[var10];
                        var20 = field_B[var11];
                        var21 = field_u[var9];
                        var22 = field_u[var10];
                        var23 = field_u[var11];
                        var15_int = var15_int - var16;
                        var17 = var17 - var16;
                        var18_int = var18_int - var19;
                        var20 = var20 - var19;
                        var21 = var21 - var22;
                        var23 = var23 - var22;
                        var24 = var18_int * var23 - var21 * var20;
                        var25 = var21 * var17 - var15_int * var23;
                        var26 = var15_int * var20 - var18_int * var17;
                        if (var16 * var24 + var19 * var25 + var22 * var26 <= 0) {
                          break L48;
                        } else {
                          field_ib[var8] = true;
                          if (!field_l) {
                            var27 = (field_U[var9] + field_U[var10] + field_U[var11]) / 3 + param3;
                            if (field_D[var27] >= 64) {
                              L49: {
                                var28 = field_D[var27];
                                if (var28 != 64) {
                                  break L49;
                                } else {
                                  if (field_bb != 512) {
                                    field_bb = field_bb + 1;
                                    var28 = 65 + field_bb;
                                    field_D[var27] = 65 + field_bb;
                                    break L49;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              var28 -= 65;
                              field_P[var28] = field_P[var28] + 1;
                              field_K[var28][field_P[var28]] = var8;
                              break L48;
                            } else {
                              field_D[var27] = field_D[var27] + 1;
                              field_Q[var27][field_D[var27]] = var8;
                              break L48;
                            }
                          } else {
                            field_J[var7] = (field_U[var9] + field_U[var10] + field_U[var11]) / 3;
                            var7++;
                            field_k[var7] = var8;
                            break L48;
                          }
                        }
                      }
                      break L45;
                    }
                  }
                  L50: {
                    if (!param1) {
                      break L50;
                    } else {
                      if (!this.b(bq.field_c + t.field_p, vs.field_i + t.field_e, field_s[var9], field_s[var10], field_s[var11], var12, var13, var14_int)) {
                        break L50;
                      } else {
                        jk.field_f = jk.field_f + 1;
                        rg.field_c[jk.field_f] = param2;
                        param1 = false;
                        break L50;
                      }
                    }
                  }
                  if ((var12 - var13) * (field_s[var11] - field_s[var10]) - (field_s[var9] - field_s[var10]) * (var14_int - var13) <= 0) {
                    break L45;
                  } else {
                    L51: {
                      L52: {
                        field_ib[var8] = false;
                        if (var12 < 0) {
                          break L52;
                        } else {
                          if (var13 < 0) {
                            break L52;
                          } else {
                            if (var14_int < 0) {
                              break L52;
                            } else {
                              if (var12 > t.field_b) {
                                break L52;
                              } else {
                                if (var13 > t.field_b) {
                                  break L52;
                                } else {
                                  if (var14_int <= t.field_b) {
                                    field_F[var8] = false;
                                    break L51;
                                  } else {
                                    break L52;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      field_F[var8] = true;
                      break L51;
                    }
                    if (!field_l) {
                      var15_int = (field_U[var9] + field_U[var10] + field_U[var11]) / 3 + param3;
                      if (field_D[var15_int] >= 64) {
                        L53: {
                          var16 = field_D[var15_int];
                          if (var16 != 64) {
                            break L53;
                          } else {
                            if (field_bb != 512) {
                              field_bb = field_bb + 1;
                              var16 = 65 + field_bb;
                              field_D[var15_int] = 65 + field_bb;
                              break L53;
                            } else {
                              break L45;
                            }
                          }
                        }
                        var16 -= 65;
                        field_P[var16] = field_P[var16] + 1;
                        field_K[var16][field_P[var16]] = var8;
                        break L45;
                      } else {
                        field_D[var15_int] = field_D[var15_int] + 1;
                        field_Q[var15_int][field_D[var15_int]] = var8;
                        break L45;
                      }
                    } else {
                      field_J[var7] = (field_U[var9] + field_U[var10] + field_U[var11]) / 3;
                      var7++;
                      field_k[var7] = var8;
                      break L45;
                    }
                  }
                } else {
                  break L45;
                }
              }
              var8++;
              continue L3;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var2 = t.field_f[param0];
        int var3 = t.field_o[param0];
        for (var4 = 0; var4 < ((eg) this).field_L; var4++) {
            var5 = ((eg) this).field_E[var4] * var2 + ((eg) this).field_N[var4] * var3 >> 16;
            ((eg) this).field_E[var4] = ((eg) this).field_E[var4] * var3 - ((eg) this).field_N[var4] * var2 >> 16;
            ((eg) this).field_N[var4] = var5;
        }
        ((eg) this).field_M = false;
    }

    final void a() {
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!((eg) this).field_X) {
              break L0;
            } else {
              this.c();
              ((eg) this).field_X = false;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        throw decompiledCaughtException;
    }

    private final qc a(boolean param0, boolean param1, eg param2, byte[] param3, short[] param4, int[] param5, int[] param6, int[] param7) {
        int var9 = 0;
        eg stackIn_2_0 = null;
        eg stackOut_1_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param2.field_L = ((eg) this).field_L;
                        param2.field_T = ((eg) this).field_T;
                        param2.field_ab = ((eg) this).field_ab;
                        param2.field_eb = ((eg) this).field_eb;
                        if (param2.field_N == null) {
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
                        stackOut_1_0 = (eg) param2;
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
                        if (stackIn_2_0.field_N.length >= ((eg) this).field_L) {
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
                        param2.field_N = new int[((eg) this).field_L + 100];
                        param2.field_W = new int[((eg) this).field_L + 100];
                        param2.field_E = new int[((eg) this).field_L + 100];
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
                    var9 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        if (var9 >= ((eg) this).field_L) {
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
                        param2.field_N[var9] = ((eg) this).field_N[var9];
                        param2.field_W[var9] = ((eg) this).field_W[var9];
                        param2.field_E[var9] = ((eg) this).field_E[var9];
                        var9++;
                        statePc = 9;
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
                    try {
                        if (!param0) {
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
                        param2.field_m = ((eg) this).field_m;
                        statePc = 25;
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
                    param2.field_m = param3;
                    if (((eg) this).field_m != null) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var9 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        if (var9 >= ((eg) this).field_ab) {
                            statePc = 25;
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
                        param2.field_m[var9] = (byte) 0;
                        var9++;
                        statePc = 17;
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
                case 21: {
                    var9 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        if (var9 >= ((eg) this).field_ab) {
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
                        param2.field_m[var9] = ((eg) this).field_m[var9];
                        var9++;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 25: {
                    try {
                        if (!param1) {
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
                        param2.field_p = ((eg) this).field_p;
                        param2.field_kb = ((eg) this).field_kb;
                        param2.field_v = ((eg) this).field_v;
                        param2.field_n = ((eg) this).field_n;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 28: {
                    param2.field_p = param4;
                    param2.field_kb = param5;
                    param2.field_v = param6;
                    param2.field_n = param7;
                    var9 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        if (var9 >= ((eg) this).field_ab) {
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
                        param2.field_p[var9] = ((eg) this).field_p[var9];
                        param2.field_kb[var9] = ((eg) this).field_kb[var9];
                        param2.field_v[var9] = ((eg) this).field_v[var9];
                        param2.field_n[var9] = ((eg) this).field_n[var9];
                        var9++;
                        statePc = 29;
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
                    param2.field_gb = ((eg) this).field_gb;
                    param2.field_S = ((eg) this).field_S;
                    param2.field_h = ((eg) this).field_h;
                    param2.field_w = ((eg) this).field_w;
                    param2.field_o = ((eg) this).field_o;
                    param2.field_x = ((eg) this).field_x;
                    param2.field_mb = ((eg) this).field_mb;
                    param2.field_C = ((eg) this).field_C;
                    param2.field_qb = ((eg) this).field_qb;
                    param2.field_I = ((eg) this).field_I;
                    param2.field_nb = ((eg) this).field_nb;
                    param2.field_ob = ((eg) this).field_ob;
                    param2.field_fb = ((eg) this).field_fb;
                    param2.field_M = false;
                    return (qc) (Object) param2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        int var14 = 0;
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
        var9 = param1.length;
        if (param0 != 0) {
          if (param0 != 1) {
            if (param0 != 2) {
              if (param0 != 3) {
                if (param0 != 5) {
                  if (param0 != 7) {
                    return;
                  } else {
                    L0: {
                      if (((eg) this).field_nb == null) {
                        break L0;
                      } else {
                        var10 = 0;
                        L1: while (true) {
                          if (var10 >= var9) {
                            break L0;
                          } else {
                            L2: {
                              var11 = param1[var10];
                              if (var11 >= ((eg) this).field_nb.length) {
                                break L2;
                              } else {
                                var12 = ((eg) this).field_nb[var11];
                                var13 = 0;
                                L3: while (true) {
                                  if (var13 >= var12.length) {
                                    ((eg) this).field_X = true;
                                    break L2;
                                  } else {
                                    L4: {
                                      L5: {
                                        var14 = var12[var13];
                                        if (((eg) this).field_fb == null) {
                                          break L5;
                                        } else {
                                          if ((param6 & ((eg) this).field_fb[var14]) != 0) {
                                            break L5;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                      L6: {
                                        var15 = ((eg) this).field_p[var14] & 65535;
                                        var16 = var15 >> 10 & 63;
                                        var17 = var15 >> 7 & 7;
                                        var18 = var15 & 127;
                                        var16 = var16 + param2 & 63;
                                        var17 = var17 + param3;
                                        if (var17 >= 0) {
                                          if (var17 <= 7) {
                                            break L6;
                                          } else {
                                            var17 = 7;
                                            break L6;
                                          }
                                        } else {
                                          var17 = 0;
                                          break L6;
                                        }
                                      }
                                      L7: {
                                        var18 = var18 + param4;
                                        if (var18 >= 0) {
                                          if (var18 <= 127) {
                                            break L7;
                                          } else {
                                            var18 = 127;
                                            break L7;
                                          }
                                        } else {
                                          var18 = 0;
                                          break L7;
                                        }
                                      }
                                      ((eg) this).field_p[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                                      break L4;
                                    }
                                    var13++;
                                    continue L3;
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L1;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    if (((eg) this).field_nb == null) {
                      break L8;
                    } else {
                      if (((eg) this).field_m == null) {
                        break L8;
                      } else {
                        var10 = 0;
                        L9: while (true) {
                          if (var10 >= var9) {
                            break L8;
                          } else {
                            L10: {
                              var11 = param1[var10];
                              if (var11 >= ((eg) this).field_nb.length) {
                                break L10;
                              } else {
                                var12 = ((eg) this).field_nb[var11];
                                var13 = 0;
                                L11: while (true) {
                                  if (var13 >= var12.length) {
                                    break L10;
                                  } else {
                                    L12: {
                                      L13: {
                                        var14 = var12[var13];
                                        if (((eg) this).field_fb == null) {
                                          break L13;
                                        } else {
                                          if ((param6 & ((eg) this).field_fb[var14]) != 0) {
                                            break L13;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L14: {
                                        var15 = (((eg) this).field_m[var14] & 255) + param2 * 8;
                                        if (var15 >= 0) {
                                          if (var15 <= 255) {
                                            break L14;
                                          } else {
                                            var15 = 255;
                                            break L14;
                                          }
                                        } else {
                                          var15 = 0;
                                          break L14;
                                        }
                                      }
                                      ((eg) this).field_m[var14] = (byte)var15;
                                      break L12;
                                    }
                                    var13++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L15: {
                  if (param7 == null) {
                    var10 = 0;
                    L16: while (true) {
                      if (var10 >= var9) {
                        break L15;
                      } else {
                        L17: {
                          var11 = param1[var10];
                          if (var11 >= ((eg) this).field_I.length) {
                            break L17;
                          } else {
                            var12 = ((eg) this).field_I[var11];
                            var13 = 0;
                            L18: while (true) {
                              if (var13 >= var12.length) {
                                break L17;
                              } else {
                                L19: {
                                  L20: {
                                    var14 = var12[var13];
                                    if (((eg) this).field_ob == null) {
                                      break L20;
                                    } else {
                                      if ((param6 & ((eg) this).field_ob[var14]) != 0) {
                                        break L20;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  ((eg) this).field_N[var14] = ((eg) this).field_N[var14] - field_pb;
                                  ((eg) this).field_W[var14] = ((eg) this).field_W[var14] - field_hb;
                                  ((eg) this).field_E[var14] = ((eg) this).field_E[var14] - field_A;
                                  ((eg) this).field_N[var14] = ((eg) this).field_N[var14] * param2 / 128;
                                  ((eg) this).field_W[var14] = ((eg) this).field_W[var14] * param3 / 128;
                                  ((eg) this).field_E[var14] = ((eg) this).field_E[var14] * param4 / 128;
                                  ((eg) this).field_N[var14] = ((eg) this).field_N[var14] + field_pb;
                                  ((eg) this).field_W[var14] = ((eg) this).field_W[var14] + field_hb;
                                  ((eg) this).field_E[var14] = ((eg) this).field_E[var14] + field_A;
                                  break L19;
                                }
                                var13++;
                                continue L18;
                              }
                            }
                          }
                        }
                        var10++;
                        continue L16;
                      }
                    }
                  } else {
                    L21: {
                      var10 = param7[9];
                      var11 = param7[10];
                      var12_int = param7[11];
                      var13 = param7[12];
                      var14 = param7[13];
                      var15 = param7[14];
                      if (!field_O) {
                        break L21;
                      } else {
                        var16 = param7[0] * field_pb + param7[3] * field_hb + param7[6] * field_A + 16384 >> 15;
                        var17 = param7[1] * field_pb + param7[4] * field_hb + param7[7] * field_A + 16384 >> 15;
                        var18 = param7[2] * field_pb + param7[5] * field_hb + param7[8] * field_A + 16384 >> 15;
                        var16 = var16 + var13;
                        var17 = var17 + var14;
                        var18 = var18 + var15;
                        field_pb = var16;
                        field_hb = var17;
                        field_A = var18;
                        field_O = false;
                        break L21;
                      }
                    }
                    var16 = param2 << 15 >> 7;
                    var17 = param3 << 15 >> 7;
                    var18 = param4 << 15 >> 7;
                    var19 = var16 * -field_pb + 16384 >> 15;
                    var20 = var17 * -field_hb + 16384 >> 15;
                    var21 = var18 * -field_A + 16384 >> 15;
                    var22 = var19 + field_pb;
                    var23 = var20 + field_hb;
                    var24 = var21 + field_A;
                    var25 = new int[9];
                    var25[0] = var16 * param7[0] + 16384 >> 15;
                    var25[1] = var16 * param7[3] + 16384 >> 15;
                    var25[2] = var16 * param7[6] + 16384 >> 15;
                    var25[3] = var17 * param7[1] + 16384 >> 15;
                    var25[4] = var17 * param7[4] + 16384 >> 15;
                    var25[5] = var17 * param7[7] + 16384 >> 15;
                    var25[6] = var18 * param7[2] + 16384 >> 15;
                    var25[7] = var18 * param7[5] + 16384 >> 15;
                    var25[8] = var18 * param7[8] + 16384 >> 15;
                    var26 = var16 * var13 + 16384 >> 15;
                    var27 = var17 * var14 + 16384 >> 15;
                    var28 = var18 * var15 + 16384 >> 15;
                    var26 = var26 + var22;
                    var27 = var27 + var23;
                    var28 = var28 + var24;
                    var29 = new int[9];
                    var30 = 0;
                    L22: while (true) {
                      if (var30 >= 3) {
                        var30 = param7[0] * var26 + param7[1] * var27 + param7[2] * var28 + 16384 >> 15;
                        var31 = param7[3] * var26 + param7[4] * var27 + param7[5] * var28 + 16384 >> 15;
                        var32 = param7[6] * var26 + param7[7] * var27 + param7[8] * var28 + 16384 >> 15;
                        var30 = var30 + var10;
                        var31 = var31 + var11;
                        var32 = var32 + var12_int;
                        var33 = 0;
                        L23: while (true) {
                          if (var33 >= var9) {
                            break L15;
                          } else {
                            L24: {
                              var34 = param1[var33];
                              if (var34 >= ((eg) this).field_I.length) {
                                break L24;
                              } else {
                                var35 = ((eg) this).field_I[var34];
                                var36 = 0;
                                L25: while (true) {
                                  if (var36 >= var35.length) {
                                    break L24;
                                  } else {
                                    L26: {
                                      L27: {
                                        var37 = var35[var36];
                                        if (((eg) this).field_ob == null) {
                                          break L27;
                                        } else {
                                          if ((param6 & ((eg) this).field_ob[var37]) != 0) {
                                            break L27;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var38 = var29[0] * ((eg) this).field_N[var37] + var29[1] * ((eg) this).field_W[var37] + var29[2] * ((eg) this).field_E[var37] + 16384 >> 15;
                                      var39 = var29[3] * ((eg) this).field_N[var37] + var29[4] * ((eg) this).field_W[var37] + var29[5] * ((eg) this).field_E[var37] + 16384 >> 15;
                                      var40 = var29[6] * ((eg) this).field_N[var37] + var29[7] * ((eg) this).field_W[var37] + var29[8] * ((eg) this).field_E[var37] + 16384 >> 15;
                                      var38 = var38 + var30;
                                      var39 = var39 + var31;
                                      var40 = var40 + var32;
                                      ((eg) this).field_N[var37] = var38;
                                      ((eg) this).field_W[var37] = var39;
                                      ((eg) this).field_E[var37] = var40;
                                      break L26;
                                    }
                                    var36++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                            var33++;
                            continue L23;
                          }
                        }
                      } else {
                        var31 = 0;
                        L28: while (true) {
                          if (var31 >= 3) {
                            var30++;
                            continue L22;
                          } else {
                            var32 = 0;
                            var33 = 0;
                            L29: while (true) {
                              if (var33 >= 3) {
                                var29[var30 * 3 + var31] = var32 + 16384 >> 15;
                                var31++;
                                continue L28;
                              } else {
                                var32 = var32 + param7[var30 * 3 + var33] * var25[var31 + var33 * 3];
                                var33++;
                                continue L29;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L30: {
                if (param7 == null) {
                  var10 = 0;
                  L31: while (true) {
                    if (var10 >= var9) {
                      break L30;
                    } else {
                      L32: {
                        var11 = param1[var10];
                        if (var11 >= ((eg) this).field_I.length) {
                          break L32;
                        } else {
                          var12 = ((eg) this).field_I[var11];
                          var13 = 0;
                          L33: while (true) {
                            if (var13 >= var12.length) {
                              break L32;
                            } else {
                              L34: {
                                L35: {
                                  var14 = var12[var13];
                                  if (((eg) this).field_ob == null) {
                                    break L35;
                                  } else {
                                    if ((param6 & ((eg) this).field_ob[var14]) != 0) {
                                      break L35;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                L36: {
                                  ((eg) this).field_N[var14] = ((eg) this).field_N[var14] - field_pb;
                                  ((eg) this).field_W[var14] = ((eg) this).field_W[var14] - field_hb;
                                  ((eg) this).field_E[var14] = ((eg) this).field_E[var14] - field_A;
                                  if (param4 == 0) {
                                    break L36;
                                  } else {
                                    var15 = t.field_f[param4];
                                    var16 = t.field_o[param4];
                                    var17 = ((eg) this).field_W[var14] * var15 + ((eg) this).field_N[var14] * var16 + 32767 >> 16;
                                    ((eg) this).field_W[var14] = ((eg) this).field_W[var14] * var16 - ((eg) this).field_N[var14] * var15 + 32767 >> 16;
                                    ((eg) this).field_N[var14] = var17;
                                    break L36;
                                  }
                                }
                                L37: {
                                  if (param2 == 0) {
                                    break L37;
                                  } else {
                                    var15 = t.field_f[param2];
                                    var16 = t.field_o[param2];
                                    var17 = ((eg) this).field_W[var14] * var16 - ((eg) this).field_E[var14] * var15 + 32767 >> 16;
                                    ((eg) this).field_E[var14] = ((eg) this).field_W[var14] * var15 + ((eg) this).field_E[var14] * var16 + 32767 >> 16;
                                    ((eg) this).field_W[var14] = var17;
                                    break L37;
                                  }
                                }
                                L38: {
                                  if (param3 == 0) {
                                    break L38;
                                  } else {
                                    var15 = t.field_f[param3];
                                    var16 = t.field_o[param3];
                                    var17 = ((eg) this).field_E[var14] * var15 + ((eg) this).field_N[var14] * var16 + 32767 >> 16;
                                    ((eg) this).field_E[var14] = ((eg) this).field_E[var14] * var16 - ((eg) this).field_N[var14] * var15 + 32767 >> 16;
                                    ((eg) this).field_N[var14] = var17;
                                    break L38;
                                  }
                                }
                                ((eg) this).field_N[var14] = ((eg) this).field_N[var14] + field_pb;
                                ((eg) this).field_W[var14] = ((eg) this).field_W[var14] + field_hb;
                                ((eg) this).field_E[var14] = ((eg) this).field_E[var14] + field_A;
                                break L34;
                              }
                              var13++;
                              continue L33;
                            }
                          }
                        }
                      }
                      var10++;
                      continue L31;
                    }
                  }
                } else {
                  L39: {
                    var10 = param7[9];
                    var11 = param7[10];
                    var12_int = param7[11];
                    var13 = param7[12];
                    var14 = param7[13];
                    var15 = param7[14];
                    if (!field_O) {
                      break L39;
                    } else {
                      var16 = param7[0] * field_pb + param7[3] * field_hb + param7[6] * field_A + 16384 >> 15;
                      var17 = param7[1] * field_pb + param7[4] * field_hb + param7[7] * field_A + 16384 >> 15;
                      var18 = param7[2] * field_pb + param7[5] * field_hb + param7[8] * field_A + 16384 >> 15;
                      var16 = var16 + var13;
                      var17 = var17 + var14;
                      var18 = var18 + var15;
                      field_pb = var16;
                      field_hb = var17;
                      field_A = var18;
                      field_O = false;
                      break L39;
                    }
                  }
                  var16_ref_int__ = new int[9];
                  var17 = t.field_o[param2] >> 1;
                  var18 = t.field_f[param2] >> 1;
                  var19 = t.field_o[param3] >> 1;
                  var20 = t.field_f[param3] >> 1;
                  var21 = t.field_o[param4] >> 1;
                  var22 = t.field_f[param4] >> 1;
                  var23 = var18 * var21 + 16384 >> 15;
                  var24 = var18 * var22 + 16384 >> 15;
                  var16_ref_int__[0] = var19 * var21 + var20 * var24 + 16384 >> 15;
                  var16_ref_int__[1] = -var19 * var22 + var20 * var23 + 16384 >> 15;
                  var16_ref_int__[2] = var20 * var17 + 16384 >> 15;
                  var16_ref_int__[3] = var17 * var22 + 16384 >> 15;
                  var16_ref_int__[4] = var17 * var21 + 16384 >> 15;
                  var16_ref_int__[5] = -var18;
                  var16_ref_int__[6] = -var20 * var21 + var19 * var24 + 16384 >> 15;
                  var16_ref_int__[7] = var20 * var22 + var19 * var23 + 16384 >> 15;
                  var16_ref_int__[8] = var19 * var17 + 16384 >> 15;
                  var25_int = var16_ref_int__[0] * -field_pb + var16_ref_int__[1] * -field_hb + var16_ref_int__[2] * -field_A + 16384 >> 15;
                  var26 = var16_ref_int__[3] * -field_pb + var16_ref_int__[4] * -field_hb + var16_ref_int__[5] * -field_A + 16384 >> 15;
                  var27 = var16_ref_int__[6] * -field_pb + var16_ref_int__[7] * -field_hb + var16_ref_int__[8] * -field_A + 16384 >> 15;
                  var28 = var25_int + field_pb;
                  var29_int = var26 + field_hb;
                  var30 = var27 + field_A;
                  var31_ref_int__ = new int[9];
                  var32 = 0;
                  L40: while (true) {
                    if (var32 >= 3) {
                      var32 = var16_ref_int__[0] * var13 + var16_ref_int__[1] * var14 + var16_ref_int__[2] * var15 + 16384 >> 15;
                      var33 = var16_ref_int__[3] * var13 + var16_ref_int__[4] * var14 + var16_ref_int__[5] * var15 + 16384 >> 15;
                      var34 = var16_ref_int__[6] * var13 + var16_ref_int__[7] * var14 + var16_ref_int__[8] * var15 + 16384 >> 15;
                      var32 = var32 + var28;
                      var33 = var33 + var29_int;
                      var34 = var34 + var30;
                      var35 = new int[9];
                      var36 = 0;
                      L41: while (true) {
                        if (var36 >= 3) {
                          var36 = param7[0] * var32 + param7[1] * var33 + param7[2] * var34 + 16384 >> 15;
                          var37 = param7[3] * var32 + param7[4] * var33 + param7[5] * var34 + 16384 >> 15;
                          var38 = param7[6] * var32 + param7[7] * var33 + param7[8] * var34 + 16384 >> 15;
                          var36 = var36 + var10;
                          var37 = var37 + var11;
                          var38 = var38 + var12_int;
                          var39 = 0;
                          L42: while (true) {
                            if (var39 >= var9) {
                              break L30;
                            } else {
                              L43: {
                                var40 = param1[var39];
                                if (var40 >= ((eg) this).field_I.length) {
                                  break L43;
                                } else {
                                  var41 = ((eg) this).field_I[var40];
                                  var42 = 0;
                                  L44: while (true) {
                                    if (var42 >= var41.length) {
                                      break L43;
                                    } else {
                                      L45: {
                                        L46: {
                                          var43 = var41[var42];
                                          if (((eg) this).field_ob == null) {
                                            break L46;
                                          } else {
                                            if ((param6 & ((eg) this).field_ob[var43]) != 0) {
                                              break L46;
                                            } else {
                                              break L45;
                                            }
                                          }
                                        }
                                        var44 = var35[0] * ((eg) this).field_N[var43] + var35[1] * ((eg) this).field_W[var43] + var35[2] * ((eg) this).field_E[var43] + 16384 >> 15;
                                        var45 = var35[3] * ((eg) this).field_N[var43] + var35[4] * ((eg) this).field_W[var43] + var35[5] * ((eg) this).field_E[var43] + 16384 >> 15;
                                        var46 = var35[6] * ((eg) this).field_N[var43] + var35[7] * ((eg) this).field_W[var43] + var35[8] * ((eg) this).field_E[var43] + 16384 >> 15;
                                        var44 = var44 + var36;
                                        var45 = var45 + var37;
                                        var46 = var46 + var38;
                                        ((eg) this).field_N[var43] = var44;
                                        ((eg) this).field_W[var43] = var45;
                                        ((eg) this).field_E[var43] = var46;
                                        break L45;
                                      }
                                      var42++;
                                      continue L44;
                                    }
                                  }
                                }
                              }
                              var39++;
                              continue L42;
                            }
                          }
                        } else {
                          var37 = 0;
                          L47: while (true) {
                            if (var37 >= 3) {
                              var36++;
                              continue L41;
                            } else {
                              var38 = 0;
                              var39 = 0;
                              L48: while (true) {
                                if (var39 >= 3) {
                                  var35[var36 * 3 + var37] = var38 + 16384 >> 15;
                                  var37++;
                                  continue L47;
                                } else {
                                  var38 = var38 + param7[var36 * 3 + var39] * var31_ref_int__[var37 + var39 * 3];
                                  var39++;
                                  continue L48;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = 0;
                      L49: while (true) {
                        if (var33 >= 3) {
                          var32++;
                          continue L40;
                        } else {
                          var34 = 0;
                          var35_int = 0;
                          L50: while (true) {
                            if (var35_int >= 3) {
                              var31_ref_int__[var32 * 3 + var33] = var34 + 16384 >> 15;
                              var33++;
                              continue L49;
                            } else {
                              var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var33 * 3 + var35_int];
                              var35_int++;
                              continue L50;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L51: {
              if (param7 == null) {
                break L51;
              } else {
                var10 = param7[0] * param2 + param7[1] * param3 + param7[2] * param4 + 16384 >> 15;
                var11 = param7[3] * param2 + param7[4] * param3 + param7[5] * param4 + 16384 >> 15;
                var12_int = param7[6] * param2 + param7[7] * param3 + param7[8] * param4 + 16384 >> 15;
                param2 = var10;
                param3 = var11;
                param4 = var12_int;
                break L51;
              }
            }
            var10 = 0;
            L52: while (true) {
              if (var10 >= var9) {
                return;
              } else {
                L53: {
                  var11 = param1[var10];
                  if (var11 >= ((eg) this).field_I.length) {
                    break L53;
                  } else {
                    var12 = ((eg) this).field_I[var11];
                    var13 = 0;
                    L54: while (true) {
                      if (var13 >= var12.length) {
                        break L53;
                      } else {
                        L55: {
                          L56: {
                            var14 = var12[var13];
                            if (((eg) this).field_ob == null) {
                              break L56;
                            } else {
                              if ((param6 & ((eg) this).field_ob[var14]) != 0) {
                                break L56;
                              } else {
                                break L55;
                              }
                            }
                          }
                          ((eg) this).field_N[var14] = ((eg) this).field_N[var14] + param2;
                          ((eg) this).field_W[var14] = ((eg) this).field_W[var14] + param3;
                          ((eg) this).field_E[var14] = ((eg) this).field_E[var14] + param4;
                          break L55;
                        }
                        var13++;
                        continue L54;
                      }
                    }
                  }
                }
                var10++;
                continue L52;
              }
            }
          }
        } else {
          var10 = 0;
          field_pb = 0;
          field_hb = 0;
          field_A = 0;
          var11 = 0;
          L57: while (true) {
            if (var11 >= var9) {
              L58: {
                if (var10 <= 0) {
                  field_pb = param2;
                  field_hb = param3;
                  field_A = param4;
                  break L58;
                } else {
                  field_pb = field_pb / var10 + param2;
                  field_hb = field_hb / var10 + param3;
                  field_A = field_A / var10 + param4;
                  field_O = true;
                  break L58;
                }
              }
              return;
            } else {
              L59: {
                var12_int = param1[var11];
                if (var12_int >= ((eg) this).field_I.length) {
                  break L59;
                } else {
                  var13_ref_int__ = ((eg) this).field_I[var12_int];
                  var14 = 0;
                  L60: while (true) {
                    if (var14 >= var13_ref_int__.length) {
                      break L59;
                    } else {
                      L61: {
                        L62: {
                          var15 = var13_ref_int__[var14];
                          if (((eg) this).field_ob == null) {
                            break L62;
                          } else {
                            if ((param6 & ((eg) this).field_ob[var15]) != 0) {
                              break L62;
                            } else {
                              break L61;
                            }
                          }
                        }
                        field_pb = field_pb + ((eg) this).field_N[var15];
                        field_hb = field_hb + ((eg) this).field_W[var15];
                        field_A = field_A + ((eg) this).field_E[var15];
                        var10++;
                        break L61;
                      }
                      var14++;
                      continue L60;
                    }
                  }
                }
              }
              var11++;
              continue L57;
            }
          }
        }
    }

    final void a(int[] param0, int[] param1) {
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Exception var21 = null;
        int var21_int = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_28_0 = null;
        int stackIn_34_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        Object stackOut_27_0 = null;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((eg) this).field_M) {
                            statePc = 4;
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
                        this.e();
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 4: {
                    var15 = param0[3] >> 2;
                    var16 = param0[4] >> 2;
                    var17 = param0[5] >> 2;
                    var18 = param0[6] >> 2;
                    var19 = param0[7] >> 2;
                    var20 = param0[8] >> 2;
                    var21_int = param0[9] >> 2;
                    var22 = param0[10] >> 2;
                    var23 = param0[11] >> 2;
                    var6 = var15 * param1[3] + var16 * param1[4] + var17 * param1[5] >> 14;
                    var7 = var18 * param1[3] + var19 * param1[4] + var20 * param1[5] >> 14;
                    var8 = var21_int * param1[3] + var22 * param1[4] + var23 * param1[5] >> 14;
                    var9 = var15 * param1[6] + var16 * param1[7] + var17 * param1[8] >> 14;
                    var10 = var18 * param1[6] + var19 * param1[7] + var20 * param1[8] >> 14;
                    var11 = var21_int * param1[6] + var22 * param1[7] + var23 * param1[8] >> 14;
                    var12 = var15 * param1[9] + var16 * param1[10] + var17 * param1[11] >> 14;
                    var13 = var18 * param1[9] + var19 * param1[10] + var20 * param1[11] >> 14;
                    var14 = var21_int * param1[9] + var22 * param1[10] + var23 * param1[11] >> 14;
                    var15 = param1[0] - param0[0];
                    var16 = param1[1] - param0[1];
                    var17 = param1[2] - param0[2];
                    var3 = var15 * param0[3] + var16 * param0[4] + var17 * param0[5] >> 16;
                    var4 = var15 * param0[6] + var16 * param0[7] + var17 * param0[8] >> 16;
                    var5 = var15 * param0[9] + var16 * param0[10] + var17 * param0[11] >> 16;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        if (var5 >= 50 - ((eg) this).field_lb) {
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
                    var15 = ((eg) this).field_lb * 92682 >> 16;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        if (var3 >= -var5 - var15) {
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
                        if (var3 <= var5 + var15) {
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
                    try {
                        if (var4 >= -var5 - var15) {
                            statePc = 18;
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
                        return;
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
                    try {
                        if (var4 <= var5 + var15) {
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
                        return;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    try {
                        if (var5 > 50 + ((eg) this).field_lb) {
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
                        stackOut_22_0 = 1;
                        stackIn_25_0 = stackOut_22_0;
                        statePc = 25;
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
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var16 = stackIn_25_0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        if (var16 != 0) {
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
                        if (((eg) this).field_eb <= 0) {
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
                        stackOut_31_0 = 1;
                        stackIn_34_0 = stackOut_31_0;
                        statePc = 34;
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
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var17 = stackIn_34_0;
                    var18 = t.field_p;
                    var19 = t.field_e;
                    var20 = 0;
                    var21_int = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var21_int >= ((eg) this).field_L) {
                        statePc = 46;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var22 = ((eg) this).field_N[var21_int];
                    var23 = ((eg) this).field_W[var21_int];
                    var24 = ((eg) this).field_E[var21_int];
                    var25 = var22 * var6 + var23 * var9 + var24 * var12 >> 16;
                    var26 = var22 * var7 + var23 * var10 + var24 * var13 >> 16;
                    var24 = var22 * var8 + var23 * var11 + var24 * var14 >> 16;
                    var22 = var25;
                    var23 = var26;
                    field_U[var21_int] = var24;
                    var22 = var22 + var3;
                    var23 = var23 + var4;
                    var24 = var24 + var5;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    try {
                        if (var24 < 50) {
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
                        field_i[var21_int] = var18 + (var22 << 9) / var24;
                        field_s[var21_int] = var19 + (var23 << 9) / var24;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 40: {
                    field_i[var21_int] = -5000;
                    var20 = 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    try {
                        if (var17 == 0) {
                            statePc = 45;
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
                        field_R[var21_int] = var22;
                        field_B[var21_int] = var23;
                        field_u[var21_int] = var24;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 45: {
                    var21_int++;
                    statePc = 35;
                    continue stateLoop;
                }
                case 46: {
                    try {
                        this.a((var20 & var16) != 0, false, 0L, (int) ((eg) this).field_lb, ((eg) this).field_lb << 1);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    var21 = (Exception) (Object) caughtException;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 >= param2) {
                            statePc = 11;
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
                        stackOut_1_0 = param1;
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
                        if (stackIn_2_0 >= param3) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = param1;
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
                        if (stackIn_6_0 >= param4) {
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
                        return false;
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
                    try {
                        if (param1 <= param2) {
                            statePc = 22;
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
                        stackOut_12_0 = param1;
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
                        if (stackIn_13_0 <= param3) {
                            statePc = 22;
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
                        stackOut_16_0 = param1;
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
                        if (stackIn_17_0 <= param4) {
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
                        return false;
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
                    try {
                        if (param0 >= param5) {
                            statePc = 33;
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
                        stackOut_23_0 = param0;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 >= param6) {
                            statePc = 33;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = param0;
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
                        if (stackIn_28_0 >= param7) {
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
                        return false;
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
                        if (param0 <= param5) {
                            statePc = 44;
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
                        stackOut_34_0 = param0;
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
                        if (stackIn_35_0 <= param6) {
                            statePc = 44;
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
                        stackOut_38_0 = param0;
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
                        if (stackIn_39_0 <= param7) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
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
                case 42: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 44: {
                    return true;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e() {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (var9 = 0; var9 < ((eg) this).field_T; var9++) {
            var10 = ((eg) this).field_N[var9];
            var11 = ((eg) this).field_W[var9];
            var12 = ((eg) this).field_E[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            var13 = var13 + var11 * var11;
            if (var13 > var8) {
                var8 = var13;
            }
        }
        ((eg) this).field_lb = (short)(int)(Math.sqrt((double)var8) + 0.99);
        ((eg) this).field_M = true;
    }

    final qc a(boolean param0, boolean param1, boolean param2) {
        byte[] stackIn_2_0 = null;
        short[] stackIn_10_0 = null;
        byte[] stackOut_1_0 = null;
        short[] stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0) {
                            statePc = 8;
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
                        stackOut_1_0 = (byte[]) field_jb;
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
                        if (stackIn_2_0.length >= ((eg) this).field_ab) {
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
                        field_jb = new byte[((eg) this).field_ab + 100];
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
                        if (param1) {
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
                        stackOut_9_0 = (short[]) field_y;
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
                        if (stackIn_10_0.length >= ((eg) this).field_ab) {
                            statePc = 16;
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
                        field_G = new int[((eg) this).field_ab + 100];
                        field_cb = new int[((eg) this).field_ab + 100];
                        field_j = new int[((eg) this).field_ab + 100];
                        field_y = new short[((eg) this).field_ab + 100];
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    return this.a(param0, param1, field_r, field_jb, field_y, field_G, field_cb, field_j);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b() {
        RuntimeException decompiledCaughtException = null;
        try {
          if (((eg) this).field_I != null) {
          } else {
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw decompiledCaughtException;
        }
        field_pb = 0;
        field_hb = 0;
        field_A = 0;
        return true;
    }

    private eg() {
        ((eg) this).field_T = 0;
        ((eg) this).field_M = false;
        ((eg) this).field_X = false;
        ((eg) this).field_L = 0;
        ((eg) this).field_ab = 0;
        ((eg) this).field_eb = 0;
    }

    eg(vn param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ia var13 = null;
        rn var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        qf stackIn_6_0 = null;
        vn stackIn_34_0 = null;
        vn stackIn_47_0 = null;
        Object stackIn_63_0 = null;
        qf stackOut_5_0 = null;
        vn stackOut_33_0 = null;
        vn stackOut_46_0 = null;
        Object stackOut_62_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((eg) this).field_T = 0;
                    ((eg) this).field_M = false;
                    ((eg) this).field_X = false;
                    ((eg) this).field_L = 0;
                    ((eg) this).field_ab = 0;
                    ((eg) this).field_eb = 0;
                    param0.b();
                    param0.a();
                    ((eg) this).field_L = param0.field_m;
                    ((eg) this).field_T = param0.field_t;
                    ((eg) this).field_N = param0.field_H;
                    ((eg) this).field_W = param0.field_l;
                    ((eg) this).field_E = param0.field_A;
                    ((eg) this).field_ab = param0.field_D;
                    ((eg) this).field_gb = param0.field_r;
                    ((eg) this).field_S = param0.field_L;
                    ((eg) this).field_h = param0.field_w;
                    ((eg) this).field_w = param0.field_z;
                    ((eg) this).field_m = param0.field_k;
                    ((eg) this).field_p = param0.field_p;
                    ((eg) this).field_I = param0.field_s;
                    ((eg) this).field_nb = param0.field_v;
                    ((eg) this).field_fb = param0.field_K;
                    ((eg) this).field_ob = param0.field_n;
                    var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
                    var8 = param2 * var7 >> 8;
                    ((eg) this).field_kb = new int[((eg) this).field_ab];
                    ((eg) this).field_v = new int[((eg) this).field_ab];
                    ((eg) this).field_n = new int[((eg) this).field_ab];
                    if (param0.field_u == null) {
                        statePc = 14;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((eg) this).field_x = new short[((eg) this).field_ab];
                    var9 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var9 >= ((eg) this).field_ab) {
                        statePc = 15;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var10 = param0.field_u[var9];
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (var10 == -1) {
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
                        stackOut_5_0 = t.field_d;
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
                        if (!((qf) (Object) stackIn_6_0).a(var10, 2738)) {
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
                        ((eg) this).field_x[var9] = (short) var10;
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
                    ((eg) this).field_x[var9] = (short) -1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var9++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 14: {
                    ((eg) this).field_x = null;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        if (param0.field_R <= 0) {
                            statePc = 70;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param0.field_I == null) {
                            statePc = 70;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    var9_ref_int__ = new int[param0.field_R];
                    var10 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        if (var10 >= ((eg) this).field_ab) {
                            statePc = 28;
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
                        if (param0.field_I[var10] == -1) {
                            statePc = 27;
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
                        var9_ref_int__[param0.field_I[var10] & 255] = var9_ref_int__[param0.field_I[var10] & 255] + 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    var10++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 28: {
                    ((eg) this).field_eb = 0;
                    var10 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        if (var10 >= param0.field_R) {
                            statePc = 41;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var9_ref_int__[var10] <= 0) {
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
                        stackOut_33_0 = (vn) param0;
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
                        if (stackIn_34_0.field_T[var10] != 0) {
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
                        ((eg) this).field_eb = ((eg) this).field_eb + 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 40: {
                    var10++;
                    statePc = 29;
                    continue stateLoop;
                }
                case 41: {
                    ((eg) this).field_mb = new int[((eg) this).field_eb];
                    ((eg) this).field_C = new int[((eg) this).field_eb];
                    ((eg) this).field_qb = new int[((eg) this).field_eb];
                    var10 = 0;
                    var11 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    try {
                        if (var11 >= param0.field_R) {
                            statePc = 54;
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
                        if (var9_ref_int__[var11] <= 0) {
                            statePc = 52;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = (vn) param0;
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
                        if (stackIn_47_0.field_T[var11] != 0) {
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
                        ((eg) this).field_mb[var10] = param0.field_h[var11] & 65535;
                        ((eg) this).field_C[var10] = param0.field_B[var11] & 65535;
                        ((eg) this).field_qb[var10] = param0.field_y[var11] & 65535;
                        var10++;
                        var9_ref_int__[var11] = var10;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 52: {
                    var9_ref_int__[var11] = -1;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var11++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 54: {
                    ((eg) this).field_o = new byte[((eg) this).field_ab];
                    var11 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    try {
                        if (var11 >= ((eg) this).field_ab) {
                            statePc = 70;
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
                        if (param0.field_I[var11] == -1) {
                            statePc = 68;
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
                        ((eg) this).field_o[var11] = (byte)var9_ref_int__[param0.field_I[var11] & 255];
                        if (((eg) this).field_o[var11] != -1) {
                            statePc = 69;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = this;
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
                        if (((eg) this).field_x == null) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        ((eg) this).field_x[var11] = (short) -1;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 68: {
                    ((eg) this).field_o[var11] = (byte) -1;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var11++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 70: {
                    var9 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    try {
                        if (var9 >= ((eg) this).field_ab) {
                            statePc = 147;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (param0.field_o != null) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
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
                    var10 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    var10 = param0.field_o[var9];
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (param0.field_k != null) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var11 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 79: {
                    var11 = param0.field_k[var9];
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (((eg) this).field_x != null) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var12 = -1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    var12 = ((eg) this).field_x[var9];
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (var11 != -2) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var10 = 3;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (var11 != -1) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var10 = 2;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    try {
                        if (var12 != -1) {
                            statePc = 119;
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
                        if (var10 != 0) {
                            statePc = 113;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 91: {
                    var15 = param0.field_p[var9] & 65535;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    try {
                        if (param0.field_q == null) {
                            statePc = 97;
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
                        if (param0.field_q[((eg) this).field_gb[var9]] == null) {
                            statePc = 97;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 96: {
                    var13_ref = param0.field_q[((eg) this).field_gb[var9]];
                    statePc = 98;
                    continue stateLoop;
                }
                case 97: {
                    var13_ref = param0.field_i[((eg) this).field_gb[var9]];
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    var14 = param1 + (param3 * var13_ref.field_a + param4 * var13_ref.field_b + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g) << 17;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    try {
                        ((eg) this).field_kb[var9] = var14 | eg.a(var15, var14 >> 17);
                        if (param0.field_q == null) {
                            statePc = 104;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (param0.field_q[((eg) this).field_S[var9]] == null) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 103: {
                    var13_ref = param0.field_q[((eg) this).field_S[var9]];
                    statePc = 105;
                    continue stateLoop;
                }
                case 104: {
                    var13_ref = param0.field_i[((eg) this).field_S[var9]];
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var14 = param1 + (param3 * var13_ref.field_a + param4 * var13_ref.field_b + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g) << 17;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    try {
                        ((eg) this).field_v[var9] = var14 | eg.a(var15, var14 >> 17);
                        if (param0.field_q == null) {
                            statePc = 111;
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
                        if (param0.field_q[((eg) this).field_h[var9]] == null) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 109: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 110: {
                    var13_ref = param0.field_q[((eg) this).field_h[var9]];
                    statePc = 112;
                    continue stateLoop;
                }
                case 111: {
                    var13_ref = param0.field_i[((eg) this).field_h[var9]];
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var14 = param1 + (param3 * var13_ref.field_a + param4 * var13_ref.field_b + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g) << 17;
                    ((eg) this).field_n[var9] = var14 | eg.a(var15, var14 >> 17);
                    statePc = 146;
                    continue stateLoop;
                }
                case 113: {
                    if (var10 != 1) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var13 = param0.field_J[var9];
                    var14 = param1 + (param3 * var13.field_f + param4 * var13.field_a + param5 * var13.field_g) / (var8 + var8 / 2) << 17;
                    ((eg) this).field_kb[var9] = var14 | eg.a(param0.field_p[var9] & 65535, var14 >> 17);
                    ((eg) this).field_n[var9] = -1;
                    statePc = 146;
                    continue stateLoop;
                }
                case 115: {
                    try {
                        if (var10 != 3) {
                            statePc = 118;
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
                        ((eg) this).field_kb[var9] = 128;
                        ((eg) this).field_n[var9] = -1;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 117: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 118: {
                    ((eg) this).field_n[var9] = -2;
                    statePc = 146;
                    continue stateLoop;
                }
                case 119: {
                    try {
                        if (var10 != 0) {
                            statePc = 143;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (param0.field_q == null) {
                            statePc = 127;
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
                        if (param0.field_q[((eg) this).field_gb[var9]] == null) {
                            statePc = 127;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 125: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 126: {
                    var13_ref = param0.field_q[((eg) this).field_gb[var9]];
                    statePc = 128;
                    continue stateLoop;
                }
                case 127: {
                    var13_ref = param0.field_i[((eg) this).field_gb[var9]];
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    var14 = param1 + (param3 * var13_ref.field_a + param4 * var13_ref.field_b + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g);
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    try {
                        ((eg) this).field_kb[var9] = eg.d(var14);
                        if (param0.field_q == null) {
                            statePc = 134;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (param0.field_q[((eg) this).field_S[var9]] == null) {
                            statePc = 134;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 132: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 133: {
                    var13_ref = param0.field_q[((eg) this).field_S[var9]];
                    statePc = 135;
                    continue stateLoop;
                }
                case 134: {
                    var13_ref = param0.field_i[((eg) this).field_S[var9]];
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var14 = param1 + (param3 * var13_ref.field_a + param4 * var13_ref.field_b + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g);
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    try {
                        ((eg) this).field_v[var9] = eg.d(var14);
                        if (param0.field_q == null) {
                            statePc = 141;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (param0.field_q[((eg) this).field_h[var9]] == null) {
                            statePc = 141;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 139: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 140: {
                    var13_ref = param0.field_q[((eg) this).field_h[var9]];
                    statePc = 142;
                    continue stateLoop;
                }
                case 141: {
                    var13_ref = param0.field_i[((eg) this).field_h[var9]];
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    var14 = param1 + (param3 * var13_ref.field_a + param4 * var13_ref.field_b + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g);
                    ((eg) this).field_n[var9] = eg.d(var14);
                    statePc = 146;
                    continue stateLoop;
                }
                case 143: {
                    if (var10 != 1) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var13 = param0.field_J[var9];
                    var14 = param1 + (param3 * var13.field_f + param4 * var13.field_a + param5 * var13.field_g) / (var8 + var8 / 2);
                    ((eg) this).field_kb[var9] = eg.d(var14);
                    ((eg) this).field_n[var9] = -1;
                    statePc = 146;
                    continue stateLoop;
                }
                case 145: {
                    ((eg) this).field_n[var9] = -2;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    var9++;
                    statePc = 71;
                    continue stateLoop;
                }
                case 147: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        field_r = new eg();
                        field_cb = new int[1];
                        field_y = new short[1];
                        field_j = new int[1];
                        field_jb = new byte[1];
                        field_G = new int[1];
                        eg discarded$4 = new eg();
                        eg discarded$5 = new eg();
                        field_Z = new int[4096];
                        field_q = new int[12];
                        field_U = new int[4096];
                        field_z = new int[12];
                        field_i = new int[4096];
                        field_s = new int[4096];
                        field_bb = 0;
                        field_Y = new int[12][4096];
                        field_u = new int[4096];
                        field_R = new int[4096];
                        field_ib = new boolean[4096];
                        field_O = false;
                        field_H = new int[10];
                        field_db = new int[10];
                        field_B = new int[4096];
                        field_l = false;
                        field_V = new int[4096];
                        field_t = new int[10];
                        if (!field_l) {
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
                        field_J = new int[4096];
                        field_k = new int[4096];
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
                    field_D = new int[1600];
                    field_Q = new int[1600][64];
                    field_P = new int[32];
                    field_K = new int[32][512];
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    field_F = new boolean[4096];
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }
}
