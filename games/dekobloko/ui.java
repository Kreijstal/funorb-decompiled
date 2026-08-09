/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    int field_N;
    int[] field_d;
    int[] field_M;
    int[][] field_q;
    static w field_x;
    int[] field_B;
    static gh field_t;
    int[] field_I;
    int[] field_G;
    int[][] field_a;
    int field_m;
    int[] field_j;
    private int field_A;
    int[] field_J;
    int[] field_l;
    int[] field_s;
    int[][] field_F;
    private int[] field_D;
    int[] field_O;
    int[] field_f;
    private int[] field_y;
    int[] field_b;
    static w[] field_E;
    int[] field_z;
    private int field_u;
    int[] field_w;
    int[][] field_c;
    int[] field_K;
    static String field_o;
    byte[][] field_e;
    int field_H;
    int[] field_n;
    int field_k;
    int[][] field_p;
    int[] field_C;
    int[] field_r;
    int[] field_v;
    int field_i;
    ud[] field_g;
    private pl field_h;
    static String field_L;

    final static ta a(int param0, String param1) {
        RuntimeException var2 = null;
        ta stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_E = (w[]) null;
                break L1;
              }
            }
            stackIn_3_0 = new ta(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ui.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(int param0) {
        if (param0 != -12040) {
            return (String) null;
        }
        return de.field_V.c((byte) -38);
    }

    public static void b(int param0) {
        field_o = null;
        field_t = null;
        field_L = null;
        field_x = null;
        field_E = null;
        if (param0 != 31158) {
            field_x = (w) null;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ud var4 = null;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_19_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = client.field_A ? 1 : 0;
                    if (this.field_h != null) {
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
                    if (param0 == 103) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ui.a(-5);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var3 ^ -1) <= (this.field_g.length ^ -1)) {
                        statePc = 16;
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
                    if (((ui) (this)).field_g[var3] == null) {
                        statePc = 9;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (this.field_M[var3] >> 1040524164 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4 = this.field_h.b(this.field_y[var3], this.field_D[var3], -1);
                    if (var5 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 = this.field_h.a(-62, this.field_y[var3], this.field_D[var3]);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var4 != null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2 = 0;
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_M[var3] = lb.a(this.field_M[var3], 15);
                    this.field_g[var3] = var4;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var3++;
                    if (var5 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var2 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_h = null;
                    this.field_D = null;
                    stackIn_19_0 = this;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    ((ui) (this)).field_y = null;
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

    ui(wl param0, pl param1) {
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
                    var12 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_h = param1;
                        this.field_i = 1 + param0.d((byte) -58);
                        param0.d((byte) -61);
                        this.field_H = 1 + param0.d((byte) -112);
                        this.field_u = 1 + param0.d((byte) -84);
                        this.field_A = param0.d((byte) -122) + 1;
                        var3_int = param0.d((byte) -98);
                        this.field_N = 1 & var3_int;
                        this.field_k = param0.d((byte) -27);
                        this.field_m = param0.d((byte) -30);
                        this.field_s = new int[this.field_i];
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
                        if ((var5 ^ -1) <= (this.field_i ^ -1)) {
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
                        dupTemp$0 = var4 + param0.d((byte) -126);
                        var4 = dupTemp$0;
                        this.field_s[var5] = lb.a(255, dupTemp$0);
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
                        this.field_e = new byte[256][];
                        this.field_d = new int[256];
                        an.a(this.field_d, 0, 256, 64);
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
                        this.field_e[var5] = client.field_D;
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
                        if (var5 >= this.field_u) {
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
                        this.field_d[var5] = 1 + param0.d((byte) -103);
                        var6 = param0.e(3);
                        var16 = new byte[var6];
                        stackIn_18_0 = 0;
                        stackIn_13_0 = stackIn_18_0;
                        stackIn_18_1 = var6;
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
                        if (stackIn_13_0 >= stackIn_13_1) {
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
                        param0.a(var16, 0, (byte) 127, var6);
                        this.field_e[var5] = var16;
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
                        this.field_z = new int[this.field_A];
                        this.field_v = new int[this.field_A];
                        this.field_J = new int[this.field_A];
                        this.field_F = new int[this.field_A][];
                        this.field_K = new int[this.field_A];
                        this.field_p = new int[this.field_A][96];
                        this.field_j = new int[this.field_A];
                        this.field_a = new int[this.field_A][];
                        this.field_C = new int[this.field_A];
                        this.field_I = new int[this.field_A];
                        this.field_c = new int[this.field_A][];
                        this.field_O = new int[this.field_A];
                        this.field_r = new int[this.field_A];
                        this.field_q = new int[this.field_A][];
                        var5 = param0.e(3);
                        this.field_M = new int[var5];
                        this.field_D = new int[var5];
                        this.field_f = new int[var5];
                        this.field_b = new int[var5];
                        this.field_w = new int[var5];
                        this.field_y = new int[var5];
                        this.field_G = new int[var5];
                        this.field_n = new int[var5];
                        this.field_l = new int[var5];
                        this.field_g = new ud[var5];
                        this.field_B = new int[var5];
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
                        stackIn_18_0 = this.field_A;
                        stackIn_18_1 = var6;
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
                        if (stackIn_18_0 <= stackIn_18_1) {
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
                        var7 = param0.d((byte) -33);
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
                        if (96 <= var8) {
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
                        dupTemp$1 = var4 + param0.d((byte) -79);
                        var4 = dupTemp$1;
                        this.field_p[var6][var8] = var5 - -lb.a(dupTemp$1, 255);
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
                        this.field_z[var6] = param0.d((byte) -64);
                        var8 = param0.d((byte) -99);
                        this.field_r[var6] = param0.d((byte) -19);
                        this.field_j[var6] = param0.d((byte) -110);
                        this.field_K[var6] = this.field_j[var6] + param0.d((byte) -66);
                        this.field_O[var6] = param0.d((byte) -110);
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
                        var9 = param0.d((byte) -78);
                        this.field_J[var6] = param0.d((byte) -64);
                        this.field_C[var6] = param0.d((byte) -46);
                        this.field_I[var6] = this.field_C[var6] + param0.d((byte) -58);
                        array$2 = new int[var8];
                        this.field_q[var6] = array$2;
                        var4 = 0;
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
                        if (var8 <= var11) {
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
                        dupTemp$3 = var10 + param0.e((byte) 126);
                        var10 = dupTemp$3;
                        var4 = var4 + dupTemp$3;
                        this.field_q[var6][var11] = var4 + dupTemp$3;
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
                        var4 = 0;
                        array$4 = new int[var8];
                        this.field_F[var6] = array$4;
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
                        dupTemp$5 = var4 + param0.d((byte) -27);
                        var4 = dupTemp$5;
                        this.field_F[var6][var11] = lb.a(255, dupTemp$5);
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
                        var10 = 0;
                        array$6 = new int[var9];
                        this.field_c[var6] = array$6;
                        var4 = 0;
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
                        if ((var9 ^ -1) >= (var11 ^ -1)) {
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
                        dupTemp$7 = var10 + param0.e((byte) -2);
                        var10 = dupTemp$7;
                        var4 = var4 + dupTemp$7;
                        this.field_c[var6][var11] = var4 + dupTemp$7;
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
                        this.field_a[var6] = array$8;
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
                        if (var9 <= var11) {
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
                        dupTemp$9 = var4 + param0.d((byte) -110);
                        var4 = dupTemp$9;
                        this.field_a[var6][var11] = lb.a(255, dupTemp$9);
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
                        this.field_v[var6] = param0.e(3);
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
                        if (var7 <= var11) {
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
                        this.field_B[var5] = param0.h(65280);
                        this.field_w[var5] = param0.h(65280);
                        this.field_f[var5] = this.field_w[var5] + param0.h(65280);
                        this.field_G[var5] = param0.d((byte) -112);
                        this.field_l[var5] = param0.g((byte) -104);
                        this.field_M[var5] = param0.d((byte) -65);
                        this.field_n[var5] = param0.d((byte) -54);
                        this.field_b[var5] = -1 + param0.g((byte) -108);
                        this.field_D[var5] = param0.e(3);
                        this.field_y[var5] = param0.e(3);
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
                        this.a((byte) 103);
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
                    stackIn_56_1 = new StringBuilder().append("ui.<init>(");
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
                    throw dh.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_o = "Steady...";
        field_t = new gh(2);
        field_L = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
