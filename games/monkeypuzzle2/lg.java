/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static wl field_n;
    td[] field_h;
    int[] field_k;
    int[] field_J;
    byte[][] field_L;
    static te field_E;
    int[] field_q;
    int[] field_a;
    int field_K;
    int field_e;
    int[] field_A;
    int field_f;
    int[] field_b;
    int[] field_C;
    int[] field_x;
    private int field_G;
    int[] field_c;
    private ud field_i;
    int[][] field_t;
    static lg field_M;
    int[][] field_y;
    private int[] field_p;
    int[] field_N;
    int[] field_B;
    int[][] field_z;
    int field_j;
    int[] field_H;
    int[] field_O;
    int[] field_g;
    int[] field_d;
    int[] field_v;
    int[] field_o;
    static int field_w;
    int[] field_m;
    int[] field_F;
    private int[] field_l;
    int[][] field_u;
    int[][] field_r;
    int field_s;
    private int field_D;
    static String field_I;

    public static void b(int param0) {
        field_I = null;
        if (param0 != -24358) {
            lg.a((byte) 12);
        }
        field_M = null;
        field_E = null;
        field_n = null;
    }

    final static void a(byte param0) {
        if (param0 < 62) {
            lg.a((byte) 84);
        }
        cl.field_e = MonkeyPuzzle2.field_D.f(-1);
        CharSequence var2 = (CharSequence) ((Object) cl.field_e);
        uj.field_f = pl.a((byte) 112, var2);
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        td var4 = null;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_19_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (this.field_i != null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var2 = 1;
                    if (param0 == -1) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    lg.a((byte) -30);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var3 >= this.field_h.length) {
                        statePc = 17;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_19_0 = this;
                    stackIn_7_0 = stackIn_19_0;
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (((lg) (this)).field_h[var3] == null) {
                        statePc = 9;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((this.field_c[var3] >> 185712036 ^ -1) != -1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4 = this.field_i.a(param0 + -18479, this.field_l[var3], this.field_p[var3]);
                    if (var5 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 = this.field_i.a(this.field_p[var3], this.field_l[var3], true);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var4 == null) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var2 = 0;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_c[var3] = ch.a(this.field_c[var3], 15);
                    this.field_h[var3] = var4;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var3++;
                    if (var5 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var2 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_i = null;
                    this.field_l = null;
                    stackIn_19_0 = this;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    ((lg) (this)).field_p = null;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    lg(gk param0, ud param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] array$4 = null;
        int dupTemp$5 = 0;
        int[] array$6 = null;
        int dupTemp$7 = 0;
        int[] array$8 = null;
        int dupTemp$9 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        byte[] var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_i = param1;
                        this.field_s = 1 + param0.a((byte) 114);
                        param0.a((byte) 114);
                        this.field_j = 1 + param0.a((byte) 114);
                        this.field_D = 1 + param0.a((byte) 114);
                        this.field_G = param0.a((byte) 114) + 1;
                        var3_int = param0.a((byte) 114);
                        this.field_e = 1 & var3_int;
                        this.field_f = param0.a((byte) 114);
                        this.field_K = param0.a((byte) 114);
                        this.field_q = new int[this.field_s];
                        var4 = 0;
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_s <= var5) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        dupTemp$0 = var4 + param0.a((byte) 114);
                        var4 = dupTemp$0;
                        this.field_q[var5] = ch.a(255, dupTemp$0);
                        var5++;
                        if (var12 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var12 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_L = new byte[256][];
                        this.field_x = new int[256];
                        gl.a(this.field_x, 0, 256, 64);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var5 ^ -1) <= -257) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_L[var5] = ah.field_c;
                        var5++;
                        if (var12 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var12 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (this.field_D <= var5) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_x[var5] = 1 + param0.a((byte) 114);
                        var6 = param0.j(17277);
                        var16 = new byte[var6];
                        stackIn_18_0 = -1;
                        stackIn_13_0 = stackIn_18_0;
                        stackIn_18_1 = var6 ^ -1;
                        stackIn_13_1 = stackIn_18_1;
                        if (var12 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 <= stackIn_13_1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        param0.a(var16, var6, -121, 0);
                        this.field_L[var5] = var16;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_r = new int[this.field_G][];
                        this.field_H = new int[this.field_G];
                        this.field_J = new int[this.field_G];
                        this.field_y = new int[this.field_G][];
                        this.field_t = new int[this.field_G][96];
                        this.field_z = new int[this.field_G][];
                        this.field_k = new int[this.field_G];
                        this.field_C = new int[this.field_G];
                        this.field_F = new int[this.field_G];
                        this.field_d = new int[this.field_G];
                        this.field_v = new int[this.field_G];
                        this.field_b = new int[this.field_G];
                        this.field_m = new int[this.field_G];
                        this.field_u = new int[this.field_G][];
                        var5 = param0.j(17277);
                        this.field_l = new int[var5];
                        this.field_B = new int[var5];
                        this.field_h = new td[var5];
                        this.field_c = new int[var5];
                        this.field_g = new int[var5];
                        this.field_a = new int[var5];
                        this.field_N = new int[var5];
                        this.field_A = new int[var5];
                        this.field_p = new int[var5];
                        this.field_o = new int[var5];
                        this.field_O = new int[var5];
                        var5 = 0;
                        var6 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = this.field_G ^ -1;
                        stackIn_18_1 = var6 ^ -1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 >= stackIn_18_1) {
                            statePc = 52;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = param0.a((byte) 114);
                        if (var12 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-1 <= (var7 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = 0;
                        var8 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-97 >= (var8 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        dupTemp$1 = var4 + param0.a((byte) 114);
                        var4 = dupTemp$1;
                        this.field_t[var6][var8] = ch.a(255, dupTemp$1) + var5;
                        var8++;
                        if (var12 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var12 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_d[var6] = param0.a((byte) 114);
                        var8 = param0.a((byte) 114);
                        this.field_k[var6] = param0.a((byte) 114);
                        this.field_b[var6] = param0.a((byte) 114);
                        this.field_H[var6] = this.field_b[var6] + param0.a((byte) 114);
                        this.field_J[var6] = param0.a((byte) 114);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9 = param0.a((byte) 114);
                        this.field_F[var6] = param0.a((byte) 114);
                        this.field_C[var6] = param0.a((byte) 114);
                        this.field_v[var6] = this.field_C[var6] + param0.a((byte) 114);
                        var4 = 0;
                        array$2 = new int[var8];
                        this.field_y[var6] = array$2;
                        var10 = 0;
                        var11 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var8 ^ -1) >= (var11 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        dupTemp$3 = var10 + param0.h(-129);
                        var10 = dupTemp$3;
                        var4 = var4 + dupTemp$3;
                        this.field_y[var6][var11] = var4 + dupTemp$3;
                        var11++;
                        if (var12 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var12 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        array$4 = new int[var8];
                        this.field_u[var6] = array$4;
                        var4 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var11 >= var8) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        dupTemp$5 = var4 + param0.a((byte) 114);
                        var4 = dupTemp$5;
                        this.field_u[var6][var11] = ch.a(255, dupTemp$5);
                        var11++;
                        if (var12 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var12 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        array$6 = new int[var9];
                        this.field_r[var6] = array$6;
                        var4 = 0;
                        var10 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var11 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var11 ^ -1) <= (var9 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        dupTemp$7 = var10 + param0.h(-129);
                        var10 = dupTemp$7;
                        var4 = var4 + dupTemp$7;
                        this.field_r[var6][var11] = var4 + dupTemp$7;
                        var11++;
                        if (var12 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var12 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4 = 0;
                        array$8 = new int[var9];
                        this.field_z[var6] = array$8;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var11 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var9 ^ -1) >= (var11 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        dupTemp$9 = var4 + param0.a((byte) 114);
                        var4 = dupTemp$9;
                        this.field_z[var6][var11] = ch.a(dupTemp$9, 255);
                        var11++;
                        if (var12 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var12 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_m[var6] = param0.j(17277);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var11 >= var7) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_o[var5] = param0.c((byte) -127);
                        this.field_B[var5] = param0.c((byte) 109);
                        this.field_A[var5] = this.field_B[var5] + param0.c((byte) 86);
                        this.field_a[var5] = param0.a((byte) 114);
                        this.field_g[var5] = param0.k(102);
                        this.field_c[var5] = param0.a((byte) 114);
                        this.field_N[var5] = param0.a((byte) 114);
                        this.field_O[var5] = param0.k(28) + -1;
                        this.field_l[var5] = param0.j(17277);
                        this.field_p[var5] = param0.j(17277);
                        var5++;
                        var11++;
                        if (var12 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var12 == 0) {
                            statePc = 47;
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
                        var6++;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var12 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.a(-1);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_56_0 = (RuntimeException) (var3);
                    stackIn_55_0 = stackIn_56_0;
                    stackIn_56_1 = new StringBuilder().append("lg.<init>(");
                    stackIn_55_1 = stackIn_56_1;
                    if (param0 == null) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_57_0 = (RuntimeException) ((Object) stackIn_55_0);
                    stackIn_57_1 = (StringBuilder) ((Object) stackIn_55_1);
                    stackIn_57_2 = "{...}";
                    statePc = 57;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackIn_57_2 = "null";
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_59_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackIn_58_0 = stackIn_59_0;
                    stackIn_59_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(',');
                    stackIn_58_1 = stackIn_59_1;
                    if (param1 == null) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_60_2 = "{...}";
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_60_2 = "null";
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    throw la.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_E = new te(9, 0, 4, 1);
        field_I = "The tips are currently off.";
    }
}
