/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    boolean field_J;
    dk field_h;
    int field_f;
    int field_E;
    int field_j;
    int field_d;
    int field_B;
    boolean field_r;
    boolean field_m;
    private r field_D;
    static ci field_g;
    r[] field_C;
    int field_k;
    hk field_e;
    static rh field_l;
    boolean field_M;
    th field_n;
    private int field_z;
    int field_N;
    r field_q;
    boolean field_b;
    static int[] field_t;
    static ci[] field_p;
    int field_a;
    boolean field_u;
    gi[] field_F;
    int field_i;
    int field_x;
    private boolean field_A;
    String field_K;
    boolean field_v;
    private boolean field_I;
    int field_c;
    private int field_s;
    boolean field_w;
    int field_L;
    static String field_o;
    int field_H;
    int field_y;
    Terraphoenix field_G;

    private final void a(boolean param0, r param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        dl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_h.b((byte) -109);
                        if (!param0) {
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
                        param1.field_w = 1;
                        var4 = -1 + param1.field_F;
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
                        if ((1 + param1.field_F ^ -1) > (var4 ^ -1)) {
                            statePc = 23;
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
                        if (var6 != 0) {
                            statePc = 30;
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
                        var5 = -1 + param1.field_H;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1.field_H - -1 < var5) {
                            statePc = 21;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = this.field_h.a(107, var5, param1.field_E, var4);
                        if (var6 != 0) {
                            statePc = 22;
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
                        if (null == var3) {
                            statePc = 20;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_h.field_g[param1.field_F][param1.field_H] < this.field_h.field_g[var4][var5]) {
                            statePc = 17;
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
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var3.a(-param1.field_H + var5, var4 + -param1.field_F, -128) ^ -1) < -51) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param1.field_jb = 20;
                        param1.field_d = param1.field_B;
                        param1.field_w = 0;
                        param1.field_S = true;
                        param1.field_r = null;
                        param1.field_Y = true;
                        param1.field_n = var5;
                        param1.field_A = 0;
                        param1.field_X = var4;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    try {
                        var5++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4++;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
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
                        param1.field_Y = true;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var3_ref);
                    stackIn_26_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("e.F(").append(param0).append(',');
                    stackIn_26_1 = stackIn_28_1;
                    if (param1 == null) {
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
                    throw qk.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, ci param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        ci var7 = null;
        RuntimeException var7_ref = null;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = u.field_e[param3];
                        var8 = param1;
                        var8 = var8 + param5.field_p;
                        var9 = param4;
                        var9 = var9 + param5.field_v;
                        var10 = 0;
                        var11 = param5.field_p + param1;
                        var14 = 104 % ((-39 - param2) / 63);
                        var12 = param4 + param5.field_v;
                        var13 = param5.field_t;
                        var15 = param5.field_r;
                        var16 = 0;
                        var17 = param5.field_p - -(param5.field_v * var7.field_r);
                        if (l.field_d > var9) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var19 = l.field_d - var9;
                        var17 = var17 + var19 * var15;
                        var13 = var13 - var19;
                        var9 = l.field_d;
                        var12 = var12 + var19;
                        var10 = var10 + var15 * var19;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var18 = 64 + -param5.field_r;
                        if (var8 < l.field_b) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var19 = -var8 + l.field_b;
                        var10 = var10 + var19;
                        var8 = l.field_b;
                        var17 = var17 + var19;
                        var15 = var15 - var19;
                        var16 = var16 + var19;
                        var11 = var11 + var19;
                        var18 = var18 + var19;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((l.field_c ^ -1) <= (var9 + var13 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var13 = var13 - (var13 + (var9 + -l.field_c));
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var8 - -var15 ^ -1) >= (l.field_f ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var19 = -l.field_f + var15 + var8;
                        var16 = var16 + var19;
                        var18 = var18 + var19;
                        var15 = var15 - var19;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (0 >= var15) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var13 <= 0) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    try {
                        var20 = var11;
                        var21 = var12;
                        var22 = -(var15 >> -1531228030);
                        var15 = -(3 & var15);
                        var9 = -var13;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-1 >= (var9 ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var23 != 0) {
                            statePc = 73;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8 = var22;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (0 <= var8) {
                            statePc = 53;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        incrementValue$0 = var10;
                        var10++;
                        var19 = param5.field_z[incrementValue$0];
                        stackIn_66_0 = var19 ^ -1;
                        stackIn_26_0 = stackIn_66_0;
                        stackIn_66_1 = -1;
                        stackIn_26_1 = stackIn_66_1;
                        if (var23 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 != stackIn_26_1) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var20++;
                        var17++;
                        if (var23 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        incrementValue$1 = var20;
                        var20++;
                        incrementValue$2 = var17;
                        var17++;
                        gd.field_a[incrementValue$1][var21] = 144 * param0 + (var21 + var7.field_z[incrementValue$2] / 5);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        incrementValue$3 = var10;
                        var10++;
                        var19 = param5.field_z[incrementValue$3];
                        if (var19 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var20++;
                        var17++;
                        if (var23 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        incrementValue$4 = var20;
                        var20++;
                        incrementValue$5 = var17;
                        var17++;
                        gd.field_a[incrementValue$4][var21] = param0 * 144 + (var21 - -(var7.field_z[incrementValue$5] / 5));
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        incrementValue$6 = var10;
                        var10++;
                        var19 = param5.field_z[incrementValue$6];
                        if (0 != var19) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var20++;
                        var17++;
                        if (var23 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        incrementValue$7 = var20;
                        var20++;
                        incrementValue$8 = var17;
                        var17++;
                        gd.field_a[incrementValue$7][var21] = var21 + (param0 * 144 + var7.field_z[incrementValue$8] / 5);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        incrementValue$9 = var10;
                        var10++;
                        var19 = param5.field_z[incrementValue$9];
                        if ((var19 ^ -1) != -1) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var20++;
                        var17++;
                        if (var23 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        incrementValue$10 = var20;
                        var20++;
                        incrementValue$11 = var17;
                        var17++;
                        gd.field_a[incrementValue$10][var21] = var21 - -(param0 * 144) + var7.field_z[incrementValue$11] / 5;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var8++;
                        if (var23 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var8 = var15;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var8 >= 0) {
                            statePc = 65;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        incrementValue$12 = var10;
                        var10++;
                        var19 = param5.field_z[incrementValue$12];
                        stackIn_66_0 = -1;
                        stackIn_56_0 = stackIn_66_0;
                        stackIn_66_1 = var19 ^ -1;
                        stackIn_56_1 = stackIn_66_1;
                        if (var23 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 != stackIn_56_1) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var17++;
                        var20++;
                        if (var23 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        incrementValue$13 = var20;
                        var20++;
                        incrementValue$14 = var17;
                        var17++;
                        gd.field_a[incrementValue$13][var21] = 144 * param0 + (var21 + var7.field_z[incrementValue$14] / 5);
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var8++;
                        if (var23 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var17 = var17 + var18;
                        var20 = var11;
                        stackIn_66_0 = var10;
                        stackIn_66_1 = var16;
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
                        var10 = stackIn_66_0 + stackIn_66_1;
                        var21++;
                        var9++;
                        if (var23 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    var7_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_71_0 = (RuntimeException) (var7_ref);
                    stackIn_69_0 = stackIn_71_0;
                    stackIn_71_1 = new StringBuilder().append("e.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                    stackIn_69_1 = stackIn_71_1;
                    if (param5 == null) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_72_2 = "{...}";
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_72_2 = "null";
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    throw qk.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ')');
                }
                case 73: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        if (!ib.p(86)) {
            return;
        }
        try {
            int var1_int = -25 / ((param0 - 65) / 50);
            ja.a(-110, false, 4);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "e.L(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        th var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var3 = this.field_n;
              if (param0 == 29518) {
                break L1;
              } else {
                this.a((Terraphoenix) null, false);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var3 == null) {
                      break L5;
                    } else {
                      stackIn_13_0 = param1 ^ -1;

                      stackIn_13_1 = var3.field_a ^ -1;

                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (stackIn_13_0 == stackIn_13_1) {
                          break L5;
                        } else {
                          var3 = var3.field_f;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackIn_13_0 = param1 ^ -1;
                    stackIn_13_1 = var3.field_a ^ -1;
                    break L4;
                  }
                }
                if (stackIn_13_0 == stackIn_13_1) {
                  if (var3.field_h) {
                    break L3;
                  } else {
                    var3.field_h = true;
                    var3.field_d = 250;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "e.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.field_G.field_db) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        qd.a((byte) 69, 11);
                        if (var3 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (1 != this.field_G.field_Bb) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        qd.a((byte) 26, 13);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((this.field_G.field_Bb ^ -1) == -3) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        qd.a((byte) 113, 11);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-4 != (this.field_G.field_Bb ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        qd.a((byte) 104, 11);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (4 == this.field_G.field_Bb) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        qd.a((byte) 122, 11);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((this.field_G.field_Bb ^ -1) == -6) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        qd.a((byte) 76, 5);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((this.field_G.field_Bb ^ -1) != -7) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        qd.a((byte) 58, 11);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (7 != this.field_G.field_Bb) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        qd.a((byte) 32, 5);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (-9 != (this.field_G.field_Bb ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        qd.a((byte) 44, 11);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (this.field_G.field_Bb != 9) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        qd.a((byte) 24, 5);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (-11 == (this.field_G.field_Bb ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        qd.a((byte) 52, 11);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-12 == (this.field_G.field_Bb ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        qd.a((byte) 53, 4);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((this.field_G.field_Bb ^ -1) == -13) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        qd.a((byte) 29, 11);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (13 != this.field_G.field_Bb) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        qd.a((byte) 70, 11);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (param0 <= -74) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.field_B = 101;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var2_int = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((var2_int ^ -1) <= (this.field_C.length ^ -1)) {
                            statePc = 96;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var3 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (null != this.field_C[var2_int]) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (this.field_C[var2_int].field_Z == null) {
                            statePc = 85;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (-6 == (this.field_G.field_Bb ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (-8 == (this.field_G.field_Bb ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((this.field_G.field_Bb ^ -1) != -10) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        this.field_C[var2_int].field_h = true;
                        this.field_C[var2_int].field_R = this.field_C[var2_int].field_E;
                        this.field_C[var2_int].field_i = this.field_C[var2_int].field_F;
                        this.field_C[var2_int].field_gb = this.field_C[var2_int].field_H;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (!this.field_J) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        this.field_C[var2_int].b(60);
                        if (var3 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        this.field_C[var2_int].b(60);
                        this.field_C[var2_int].field_jb = 0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (null != this.field_q) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        this.field_q = this.field_C[var2_int];
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        this.field_C[var2_int].a(false);
                        if (var3 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (!this.field_J) {
                            statePc = 91;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        this.field_C[var2_int].b(60);
                        this.field_C[var2_int].field_q = -(int)(Math.random() * (double)this.field_C[var2_int].field_jb);
                        if (var3 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        this.field_C[var2_int].b(60);
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var2_int++;
                        if (var3 == 0) {
                            statePc = 56;
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
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) var2), "e.I(" + param0 + ')');
                }
                case 96: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(byte param0, r param1, r param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.field_F + -param1.field_F;
              var5 = -param1.field_H + param2.field_H;
              if (param0 == -60) {
                break L1;
              } else {
                this.field_i = 27;
                break L1;
              }
            }
            stackIn_4_0 = (int)Math.sqrt((double)(var4_int * var4_int + var5 * var5));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("e.R(").append(param0).append(',');

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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(Terraphoenix param0, boolean param1) {
        r stackIn_47_0 = null;
        r stackIn_131_0 = null;
        r stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        r stackIn_315_0 = null;
        r stackIn_316_0 = null;
        int stackIn_316_1 = 0;
        r stackIn_538_0 = null;
        r stackIn_538_1 = null;
        int stackIn_557_0 = 0;
        int stackIn_558_0 = 0;
        int stackIn_558_1 = 0;
        int stackIn_562_0 = 0;
        r stackIn_670_0 = null;
        ga stackIn_673_0 = null;
        int stackIn_826_0 = 0;
        int stackIn_827_0 = 0;
        int stackIn_827_1 = 0;
        int stackIn_927_0 = 0;
        int stackIn_928_0 = 0;
        int stackIn_928_1 = 0;
        Object stackIn_1003_0 = null;
        StringBuilder stackIn_1003_1 = null;
        Object stackIn_1004_0 = null;
        StringBuilder stackIn_1004_1 = null;
        String stackIn_1004_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        Object var3 = null;
        int var4 = 0;
        Object var4_ref = null;
        dl var5 = null;
        int var5_int = 0;
        oh var5_ref = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (le.field_q == null) {
                break L1;
              } else {
                le.field_q.field_g = this.field_y;
                le.field_q.field_z = this.field_N;
                le.field_q.field_c = this.field_j;
                if (le.field_q.b(0)) {
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      if (null == this.field_q) {
                        break L6;
                      } else {
                        if (this.field_q.field_P > 0) {
                          break L6;
                        } else {
                          this.b((byte) -3);
                          var3_int = 0;
                          var4 = 0;
                          L7: while (true) {
                            L8: {
                              if (var4 >= 12) {
                                break L8;
                              } else {
                                stackIn_538_0 = this.field_q;

                                stackIn_538_1 = this.field_C[var4];

                                if (var9 != 0) {
                                  break L4;
                                } else {
                                  L9: {
                                    if (stackIn_538_0 != stackIn_538_1) {
                                      break L9;
                                    } else {
                                      var3_int = var4;
                                      break L9;
                                    }
                                  }
                                  var4++;
                                  if (var9 == 0) {
                                    continue L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            var4 = 0;
                            L10: while (true) {
                              L11: {
                                var4++;
                                var3_int++;
                                if (12 <= var3_int) {
                                  var3_int -= 12;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                if (var4 >= 12) {
                                  break L12;
                                } else {
                                  if (this.field_C[var3_int] == null) {
                                    continue L10;
                                  } else {
                                    stackIn_47_0 = this.field_C[var3_int];

                                    if (var9 != 0) {
                                      break L5;
                                    } else {
                                      if (stackIn_47_0.field_Z == null) {
                                        continue L10;
                                      } else {
                                        if (0 >= this.field_C[var3_int].field_jb) {
                                          continue L10;
                                        } else {
                                          if (0 >= this.field_C[var3_int].field_P) {
                                            continue L10;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L13: {
                                if (null == this.field_C[var3_int]) {
                                  break L13;
                                } else {
                                  if (null == this.field_C[var3_int].field_Z) {
                                    break L13;
                                  } else {
                                    if (-1 <= (this.field_C[var3_int].field_P ^ -1)) {
                                      break L13;
                                    } else {
                                      this.field_q = this.field_C[var3_int];
                                      sj.field_b = (this.field_q.field_F + -this.field_q.field_H) * 32;
                                      lg.field_c = 16 * (this.field_q.field_F - -this.field_q.field_H) - this.field_q.field_E * 48;
                                      eg.field_p = this.field_q.field_E;
                                      break L13;
                                    }
                                  }
                                }
                              }
                              L14: {
                                if (7 > this.field_B) {
                                  break L14;
                                } else {
                                  if (10 <= this.field_B) {
                                    break L14;
                                  } else {
                                    this.field_B = this.field_B + 1;
                                    break L14;
                                  }
                                }
                              }
                              this.a(-1);
                              this.field_m = false;
                              this.field_L = 0;
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    stackIn_47_0 = this.field_q;
                    break L5;
                  }
                  L15: {
                    if (stackIn_47_0 == null) {
                      break L15;
                    } else {
                      if (this.field_q.field_b != null) {
                        break L15;
                      } else {
                        this.field_m = false;
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (1 == this.field_N) {
                      if (!gj.a((e) (this), this.field_y, (byte) 114, this.field_j)) {
                        break L16;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (this.field_j >= 365) {
                      break L17;
                    } else {
                      if ((this.field_j ^ -1) >= -40) {
                        break L17;
                      } else {
                        L18: {
                          if (null == this.field_q) {
                            break L18;
                          } else {
                            if (this.field_q.field_P > 0) {
                              break L18;
                            } else {
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                        L19: {
                          var3 = null;
                          var4_ref = null;
                          if (!ha.field_o) {
                            L20: {
                              var5 = this.field_h.a(94, vf.field_a, cm.field_d, uf.field_c);
                              if (null == this.field_q) {
                                break L20;
                              } else {
                                if (uf.field_c == -1) {
                                  break L20;
                                } else {
                                  L21: {
                                    var3 = ke.field_g;
                                    var4_ref = va.field_b;
                                    if (uf.field_c != ql.field_i) {
                                      break L21;
                                    } else {
                                      if ((vf.field_a ^ -1) != (ld.field_e ^ -1)) {
                                        break L21;
                                      } else {
                                        var3 = wg.field_k;
                                        if (null == var5) {
                                          break L21;
                                        } else {
                                          if (var5.field_w) {
                                            var3 = bm.field_b;
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (this.field_w) {
                                    L22: {
                                      var3 = rl.field_c;
                                      if ((oh.field_f ^ -1) == -1) {
                                        break L22;
                                      } else {
                                        sj.field_b = 32 * uf.field_c + -(32 * vf.field_a);
                                        lg.field_c = -(eg.field_p * 48) + vf.field_a * 16 + 16 * uf.field_c;
                                        break L22;
                                      }
                                    }
                                    var4_ref = null;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            L23: {
                              if (var5 == null) {
                                break L23;
                              } else {
                                if (null == var5.field_h) {
                                  break L23;
                                } else {
                                  if (var5.field_h.field_C != 0) {
                                    break L23;
                                  } else {
                                    if (var5.field_h.field_Z == null) {
                                      break L23;
                                    } else {
                                      var3 = ef.field_a + var5.field_h.field_Z.b(1);
                                      break L23;
                                    }
                                  }
                                }
                              }
                            }
                            if (null == var5) {
                              break L19;
                            } else {
                              L24: {
                                L25: {
                                  if (null == var5.field_h) {
                                    break L25;
                                  } else {
                                    if ((var5.field_h.field_C ^ -1) == -1) {
                                      break L25;
                                    } else {
                                      if (var5.field_h.field_k) {
                                        break L24;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                                if (this.field_L != 1) {
                                  break L19;
                                } else {
                                  break L24;
                                }
                              }
                              L26: {
                                var3 = q.field_Fb;
                                if (!this.field_m) {
                                  break L26;
                                } else {
                                  var3 = hm.field_G;
                                  break L26;
                                }
                              }
                              L27: {
                                if (this.field_L != 1) {
                                  break L27;
                                } else {
                                  var4_ref = cm.field_a;
                                  break L27;
                                }
                              }
                              L28: {
                                var6 = this.field_q.field_U;
                                var7 = this.field_q.field_ab;
                                this.field_q.a(true, uf.field_c, vf.field_a);
                                if (Math.abs(var6 - this.field_q.field_U) < 2) {
                                  break L28;
                                } else {
                                  if (Math.abs(-this.field_q.field_U + var6) > 6) {
                                    break L28;
                                  } else {
                                    this.field_q.field_ab = 0;
                                    break L28;
                                  }
                                }
                              }
                              L29: {
                                stackIn_131_0 = this.field_q;

                                if (param1) {
                                  stackIn_132_0 = (r) ((Object) stackIn_131_0);
                                  stackIn_132_1 = 0;
                                  break L29;
                                } else {
                                  stackIn_132_0 = (r) ((Object) stackIn_131_0);
                                  stackIn_132_1 = 1;
                                  break L29;
                                }
                              }
                              L30: {
                                var8 = ((r) (Object) stackIn_132_0).c(stackIn_132_1 != 0);
                                this.field_q.field_ab = var7;
                                if (var5.field_A != this.field_q.field_F) {
                                  break L30;
                                } else {
                                  if (var5.field_n != this.field_q.field_H) {
                                    break L30;
                                  } else {
                                    var3 = var4_ref;
                                    var4_ref = null;
                                    break L30;
                                  }
                                }
                              }
                              L31: {
                                this.field_q.field_U = var6;
                                if (this.field_m) {
                                  var8 = 15;
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                              L32: {
                                if (this.field_q.field_jb >= var8) {
                                  break L32;
                                } else {
                                  L33: {
                                    if (-10 + var8 > this.field_q.field_jb) {
                                      break L33;
                                    } else {
                                      if (this.field_m) {
                                        break L33;
                                      } else {
                                        if (10 <= this.field_q.field_jb) {
                                          break L32;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                  }
                                  var3 = m.field_h;
                                  break L32;
                                }
                              }
                              if (this.field_m) {
                                break L19;
                              } else {
                                if (this.field_q.field_nb.field_c > 0) {
                                  break L19;
                                } else {
                                  if (7 == this.field_q.field_nb.field_g) {
                                    break L19;
                                  } else {
                                    if (this.field_q.field_nb.field_g != 6) {
                                      var4_ref = null;
                                      var3 = fl.field_d + "<br>" + ql.field_f;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L19;
                          }
                        }
                        L34: {
                          if (2 != this.field_N) {
                            break L34;
                          } else {
                            L35: {
                              if (!ha.field_o) {
                                break L35;
                              } else {
                                if (5 <= this.field_B) {
                                  break L35;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L36: {
                              this.b((byte) -3);
                              qd.a((byte) 39, 34);
                              if (this.field_B != 5) {
                                break L36;
                              } else {
                                this.field_B = 6;
                                break L36;
                              }
                            }
                            L37: {
                              L38: {
                                if (-1 > (this.field_L ^ -1)) {
                                  break L38;
                                } else {
                                  if (!this.field_m) {
                                    break L37;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              this.field_L = 0;
                              this.field_m = false;
                              if (var9 == 0) {
                                break L34;
                              } else {
                                break L37;
                              }
                            }
                            if (0 >= this.field_q.field_jb) {
                              break L34;
                            } else {
                              if (this.field_w) {
                                break L34;
                              } else {
                                var5_int = this.field_q.field_U;
                                this.field_q.a(true, uf.field_c, vf.field_a);
                                ok.field_i = true;
                                if ((var5_int ^ -1) != (this.field_q.field_U ^ -1)) {
                                  this.field_q.field_jb = this.field_q.field_jb - 1;
                                  this.field_q.field_ab = 0;
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                        }
                        L39: {
                          if (this.field_m) {
                            this.field_L = 1;
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        L40: {
                          L41: {
                            L42: {
                              if (uf.field_c == -1) {
                                break L42;
                              } else {
                                L43: {
                                  L44: {
                                    if (-2 != (oh.field_f ^ -1)) {
                                      break L44;
                                    } else {
                                      if (!this.field_m) {
                                        break L43;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                  if (-2 != (this.field_N ^ -1)) {
                                    break L42;
                                  } else {
                                    break L43;
                                  }
                                }
                                if (this.field_L <= 0) {
                                  break L42;
                                } else {
                                  L45: {
                                    if (!ha.field_o) {
                                      break L45;
                                    } else {
                                      if (4 > this.field_B) {
                                        break L42;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                  if (uf.field_c != this.field_q.field_F) {
                                    break L41;
                                  } else {
                                    if ((this.field_q.field_H ^ -1) != (vf.field_a ^ -1)) {
                                      break L41;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                              }
                            }
                            if ((this.field_N ^ -1) != -2) {
                              break L40;
                            } else {
                              if (-1 != (this.field_L ^ -1)) {
                                break L40;
                              } else {
                                L46: {
                                  L47: {
                                    qd.a((byte) 45, 22);
                                    ok.field_i = true;
                                    var5 = this.field_h.a(117, vf.field_a, cm.field_d, uf.field_c);
                                    this.field_m = false;
                                    if (this.field_q == null) {
                                      break L47;
                                    } else {
                                      L48: {
                                        L49: {
                                          if (!ha.field_o) {
                                            break L49;
                                          } else {
                                            if (-9 >= (this.field_B ^ -1)) {
                                              break L49;
                                            } else {
                                              L50: {
                                                if ((this.field_B ^ -1) != -1) {
                                                  break L50;
                                                } else {
                                                  if ((uf.field_c ^ -1) > -9) {
                                                    break L50;
                                                  } else {
                                                    if (-11 > (uf.field_c ^ -1)) {
                                                      break L50;
                                                    } else {
                                                      if (-5 == (vf.field_a ^ -1)) {
                                                        break L49;
                                                      } else {
                                                        break L50;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (-3 != (this.field_B ^ -1)) {
                                                break L48;
                                              } else {
                                                if (8 > uf.field_c) {
                                                  break L48;
                                                } else {
                                                  if (uf.field_c > 10) {
                                                    break L48;
                                                  } else {
                                                    if ((vf.field_a ^ -1) != -9) {
                                                      break L48;
                                                    } else {
                                                      break L49;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (!this.field_w) {
                                          this.field_q.field_n = vf.field_a;
                                          this.field_q.field_S = true;
                                          this.field_q.field_r = null;
                                          this.field_q.field_A = 0;
                                          this.field_q.field_d = this.field_q.field_B;
                                          this.field_q.field_X = uf.field_c;
                                          this.field_q.field_N = cm.field_d;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                      L51: {
                                        if (null != var5) {
                                          break L51;
                                        } else {
                                          this.b((byte) -3);
                                          this.field_q.field_S = false;
                                          if (var9 == 0) {
                                            break L46;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                      L52: {
                                        if (var5.field_h == null) {
                                          break L52;
                                        } else {
                                          if (var5.field_h.field_C != 0) {
                                            break L52;
                                          } else {
                                            if (var5.field_h.field_Z == null) {
                                              break L52;
                                            } else {
                                              L53: {
                                                if (!ha.field_o) {
                                                  break L53;
                                                } else {
                                                  if (7 > this.field_B) {
                                                    break L52;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                              }
                                              L54: {
                                                this.field_q.field_S = false;
                                                if (7 > this.field_B) {
                                                  break L54;
                                                } else {
                                                  if (this.field_B >= 10) {
                                                    break L54;
                                                  } else {
                                                    this.field_B = this.field_B + 1;
                                                    break L54;
                                                  }
                                                }
                                              }
                                              this.field_q = this.field_h.a(102, vf.field_a, cm.field_d, uf.field_c).field_h;
                                              this.a(-1);
                                              this.field_m = false;
                                              this.field_L = 0;
                                              break L52;
                                            }
                                          }
                                        }
                                      }
                                      L55: {
                                        if (var5.field_h == null) {
                                          break L55;
                                        } else {
                                          if ((var5.field_h.field_C ^ -1) != -2) {
                                            break L55;
                                          } else {
                                            if (!var5.field_h.field_k) {
                                              break L55;
                                            } else {
                                              L56: {
                                                if (!ha.field_o) {
                                                  break L56;
                                                } else {
                                                  if (5 <= this.field_B) {
                                                    break L56;
                                                  } else {
                                                    break L55;
                                                  }
                                                }
                                              }
                                              L57: {
                                                this.field_q.field_X = uf.field_c;
                                                this.field_q.field_d = 2;
                                                this.field_q.field_N = cm.field_d;
                                                ok.field_i = true;
                                                this.field_q.field_n = vf.field_a;
                                                this.field_q.field_S = true;
                                                this.field_q.field_A = 0;
                                                if (!this.field_m) {
                                                  break L57;
                                                } else {
                                                  this.field_q.field_d = 4;
                                                  break L57;
                                                }
                                              }
                                              L58: {
                                                var6 = this.field_q.field_U;
                                                var7 = this.field_q.field_ab;
                                                this.field_q.a(param1, this.field_q.field_X, this.field_q.field_n);
                                                stackIn_315_0 = this.field_q;

                                                if (param1) {
                                                  stackIn_316_0 = (r) ((Object) stackIn_315_0);
                                                  stackIn_316_1 = 0;
                                                  break L58;
                                                } else {
                                                  stackIn_316_0 = (r) ((Object) stackIn_315_0);
                                                  stackIn_316_1 = 1;
                                                  break L58;
                                                }
                                              }
                                              L59: {
                                                var8 = ((r) (Object) stackIn_316_0).c(stackIn_316_1 != 0);
                                                if (-3 < (Math.abs(var6 + -this.field_q.field_U) ^ -1)) {
                                                  break L59;
                                                } else {
                                                  if (Math.abs(-this.field_q.field_U + var6) <= 6) {
                                                    this.field_q.field_ab = 0;
                                                    break L59;
                                                  } else {
                                                    break L59;
                                                  }
                                                }
                                              }
                                              L60: {
                                                this.field_q.field_ab = var7;
                                                if (!this.field_m) {
                                                  break L60;
                                                } else {
                                                  var8 = 15;
                                                  break L60;
                                                }
                                              }
                                              L61: {
                                                this.field_q.field_U = var6;
                                                if (this.field_q.field_jb >= var8) {
                                                  break L61;
                                                } else {
                                                  L62: {
                                                    if (this.field_q.field_jb < 10) {
                                                      break L62;
                                                    } else {
                                                      if (this.field_m) {
                                                        break L62;
                                                      } else {
                                                        if (10 > this.field_q.field_jb) {
                                                          break L62;
                                                        } else {
                                                          break L61;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  this.field_q.field_S = false;
                                                  break L61;
                                                }
                                              }
                                              L63: {
                                                if (-1 != (this.field_q.field_nb.field_c ^ -1)) {
                                                  break L63;
                                                } else {
                                                  if (this.field_m) {
                                                    break L63;
                                                  } else {
                                                    this.field_q.field_S = false;
                                                    break L63;
                                                  }
                                                }
                                              }
                                              if (!this.field_q.field_S) {
                                                break L55;
                                              } else {
                                                if (this.field_m) {
                                                  this.field_L = 0;
                                                  break L55;
                                                } else {
                                                  break L55;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L64: {
                                        if (!this.field_q.field_S) {
                                          break L64;
                                        } else {
                                          if ((this.field_q.field_d ^ -1) == -3) {
                                            break L64;
                                          } else {
                                            if ((this.field_q.field_d ^ -1) == -5) {
                                              break L64;
                                            } else {
                                              if (this.field_w) {
                                                break L46;
                                              } else {
                                                L65: {
                                                  L66: {
                                                    if (-1 == var5.field_v) {
                                                      break L66;
                                                    } else {
                                                      if (var5.field_v == 2) {
                                                        break L66;
                                                      } else {
                                                        if ((var5.field_v ^ -1) != -4) {
                                                          break L65;
                                                        } else {
                                                          break L66;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  ql.field_i = uf.field_c;
                                                  fi.field_m = null;
                                                  this.field_q.field_S = false;
                                                  ld.field_e = vf.field_a;
                                                  og.field_d = -1;
                                                  if (var9 == 0) {
                                                    break L46;
                                                  } else {
                                                    break L65;
                                                  }
                                                }
                                                L67: {
                                                  if (ql.field_i != uf.field_c) {
                                                    break L67;
                                                  } else {
                                                    if (ld.field_e != vf.field_a) {
                                                      break L67;
                                                    } else {
                                                      L68: {
                                                        if (fi.field_m == null) {
                                                          break L68;
                                                        } else {
                                                          if (Math.random() * 100.0 >= (double)fi.field_m.a(param1)) {
                                                            break L68;
                                                          } else {
                                                            L69: {
                                                              var6_ref_int__ = new int[]{2, 10, 11};
                                                              var7_ref_int__ = new int[]{15, 20, 21};
                                                              if (this.field_q.field_Z.field_y) {
                                                                qd.a((byte) 54, var6_ref_int__[(int)(Math.random() * (double)var6_ref_int__.length)]);
                                                                break L69;
                                                              } else {
                                                                break L69;
                                                              }
                                                            }
                                                            if (this.field_q.field_Z.field_y) {
                                                              break L68;
                                                            } else {
                                                              qd.a((byte) 125, var7_ref_int__[(int)(Math.random() * (double)var7_ref_int__.length)]);
                                                              break L68;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      this.b((byte) -3);
                                                      if (-1 != (this.field_B ^ -1)) {
                                                        break L46;
                                                      } else {
                                                        this.field_B = 1;
                                                        if (var9 == 0) {
                                                          break L46;
                                                        } else {
                                                          break L67;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                ql.field_i = uf.field_c;
                                                ld.field_e = vf.field_a;
                                                og.field_d = -1;
                                                this.field_q.field_S = false;
                                                this.field_q.field_c.field_h = null;
                                                fi.field_m = this.field_h.a(false, this.field_q.field_n, this.field_q.field_H, -89, true, this.field_q.field_N, this.field_q.field_E, this.field_q.field_X, this.field_q.field_F);
                                                this.field_q.field_c.field_h = this.field_q;
                                                if (fi.field_m == null) {
                                                  break L46;
                                                } else {
                                                  og.field_d = fi.field_m.a(param1);
                                                  if (var9 == 0) {
                                                    break L46;
                                                  } else {
                                                    break L64;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      this.b((byte) -3);
                                      if (var9 == 0) {
                                        break L46;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                  if (null != var5) {
                                    if (null == var5.field_h) {
                                      break L46;
                                    } else {
                                      if (0 != var5.field_h.field_C) {
                                        break L46;
                                      } else {
                                        if (null != var5.field_h.field_Z) {
                                          this.b((byte) -3);
                                          this.field_m = false;
                                          this.field_q = var5.field_h;
                                          this.field_L = 0;
                                          this.a(-1);
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    }
                                  } else {
                                    break L46;
                                  }
                                }
                                if (var9 == 0) {
                                  break L40;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                          L70: {
                            this.b((byte) -3);
                            this.field_q.field_X = uf.field_c;
                            ok.field_i = true;
                            if (-5 != (this.field_B ^ -1)) {
                              break L70;
                            } else {
                              this.field_B = 5;
                              break L70;
                            }
                          }
                          L71: {
                            this.field_q.field_n = vf.field_a;
                            this.field_q.field_N = cm.field_d;
                            this.field_q.field_d = 2;
                            this.field_q.field_S = true;
                            if (!this.field_m) {
                              break L71;
                            } else {
                              this.field_q.field_d = 4;
                              break L71;
                            }
                          }
                          L72: {
                            this.field_q.field_A = 0;
                            var5_int = this.field_q.field_U;
                            var6 = this.field_q.field_ab;
                            this.field_q.a(true, uf.field_c, vf.field_a);
                            if ((Math.abs(-this.field_q.field_U + var5_int) ^ -1) > -3) {
                              break L72;
                            } else {
                              if (-7 <= (Math.abs(-this.field_q.field_U + var5_int) ^ -1)) {
                                this.field_q.field_ab = 0;
                                break L72;
                              } else {
                                break L72;
                              }
                            }
                          }
                          L73: {
                            var7 = this.field_q.c(false);
                            if (!this.field_m) {
                              break L73;
                            } else {
                              var7 = 15;
                              break L73;
                            }
                          }
                          L74: {
                            this.field_q.field_U = var5_int;
                            this.field_q.field_ab = var6;
                            if ((var7 ^ -1) >= (this.field_q.field_jb ^ -1)) {
                              break L74;
                            } else {
                              L75: {
                                if ((this.field_q.field_jb ^ -1) > (var7 - 10 ^ -1)) {
                                  break L75;
                                } else {
                                  if (this.field_m) {
                                    break L75;
                                  } else {
                                    if ((this.field_q.field_jb ^ -1) > -11) {
                                      break L75;
                                    } else {
                                      break L74;
                                    }
                                  }
                                }
                              }
                              this.field_q.field_S = false;
                              break L74;
                            }
                          }
                          L76: {
                            if (this.field_q.field_nb.field_c != 0) {
                              break L76;
                            } else {
                              if (!this.field_m) {
                                this.field_q.field_S = false;
                                break L76;
                              } else {
                                break L76;
                              }
                            }
                          }
                          if (!this.field_q.field_S) {
                            break L40;
                          } else {
                            if (this.field_m) {
                              this.field_L = 0;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                        }
                        L77: {
                          L78: {
                            L79: {
                              if (null == var3) {
                                break L79;
                              } else {
                                if (null != var4_ref) {
                                  break L78;
                                } else {
                                  break L79;
                                }
                              }
                            }
                            L80: {
                              if (var3 != null) {
                                param0.field_Eb = new String[1];
                                param0.field_Eb[0] = (String) (var3);
                                break L80;
                              } else {
                                break L80;
                              }
                            }
                            if (null != var4_ref) {
                              param0.field_Eb = new String[1];
                              param0.field_Eb[0] = (String) (var4_ref);
                              if (var9 == 0) {
                                break L77;
                              } else {
                                break L78;
                              }
                            } else {
                              break L77;
                            }
                          }
                          param0.field_Eb = new String[2];
                          param0.field_Eb[1] = (String) (var4_ref);
                          param0.field_Eb[0] = (String) (var3);
                          break L77;
                        }
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  L81: {
                    var3_int = this.field_y;
                    var4 = this.field_j - 385;
                    if ((var3_int ^ -1) > -100) {
                      break L81;
                    } else {
                      if ((var3_int ^ -1) <= -126) {
                        break L81;
                      } else {
                        if (var4 < 66) {
                          break L81;
                        } else {
                          if (-93 >= (var4 ^ -1)) {
                            break L81;
                          } else {
                            L82: {
                              if (!ha.field_o) {
                                break L82;
                              } else {
                                if (-12 < (this.field_B ^ -1)) {
                                  break L81;
                                } else {
                                  break L82;
                                }
                              }
                            }
                            if (this.field_q.field_B == 0) {
                              param0.field_Eb = new String[1];
                              param0.field_Eb[0] = fa.field_e;
                              if (this.field_N == 1) {
                                L83: {
                                  qd.a((byte) 16, 33);
                                  var5_int = this.field_q.g(12384);
                                  this.field_q.field_B = 1;
                                  this.field_q.field_jb = this.field_q.field_jb - var5_int;
                                  this.field_q.field_jb = this.field_q.field_jb - this.field_q.field_jb / 2;
                                  if (this.field_q.field_jb < 0) {
                                    this.field_q.field_jb = 0;
                                    break L83;
                                  } else {
                                    break L83;
                                  }
                                }
                                this.field_q.b(var5_int, (byte) -126);
                                break L81;
                              } else {
                                break L81;
                              }
                            } else {
                              break L81;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (-128 < (var3_int ^ -1)) {
                    break L3;
                  } else {
                    if (var3_int >= 153) {
                      break L3;
                    } else {
                      if (var4 < 66) {
                        break L3;
                      } else {
                        if (92 <= var4) {
                          break L3;
                        } else {
                          if (1 != this.field_q.field_B) {
                            break L3;
                          } else {
                            L84: {
                              if (!ha.field_o) {
                                break L84;
                              } else {
                                if (this.field_B < 11) {
                                  break L3;
                                } else {
                                  break L84;
                                }
                              }
                            }
                            L85: {
                              if (-2 != (this.field_q.field_B ^ -1)) {
                                break L85;
                              } else {
                                param0.field_Eb = new String[1];
                                param0.field_Eb[0] = db.field_a;
                                break L85;
                              }
                            }
                            if ((this.field_N ^ -1) != -2) {
                              break L3;
                            } else {
                              qd.a((byte) 47, 33);
                              this.field_q.field_B = 0;
                              stackIn_538_0 = this.field_q;
                              stackIn_538_1 = this.field_q;
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_538_0.field_jb = stackIn_538_1.field_jb + this.field_q.field_jb / 2;
                break L3;
              }
              L86: {
                if ((var3_int ^ -1) > -156) {
                  break L86;
                } else {
                  if ((var3_int ^ -1) <= -182) {
                    break L86;
                  } else {
                    if (66 > var4) {
                      break L86;
                    } else {
                      if (var4 >= 92) {
                        break L86;
                      } else {
                        param0.field_Eb = new String[1];
                        param0.field_Eb[0] = of.field_i;
                        if (-2 == (this.field_N ^ -1)) {
                          L87: {
                            stackIn_557_0 = 39;

                            if (d.field_H) {
                              stackIn_558_0 = stackIn_557_0;
                              stackIn_558_1 = 34;
                              break L87;
                            } else {
                              stackIn_558_0 = stackIn_557_0;
                              stackIn_558_1 = 33;
                              break L87;
                            }
                          }
                          L88: {
                            qd.a((byte) stackIn_558_0, stackIn_558_1);
                            if (d.field_H) {
                              stackIn_562_0 = 0;
                              break L88;
                            } else {
                              stackIn_562_0 = 1;
                              break L88;
                            }
                          }
                          d.field_H = stackIn_562_0 != 0;
                          break L86;
                        } else {
                          break L86;
                        }
                      }
                    }
                  }
                }
              }
              L89: {
                if (var3_int < 184) {
                  break L89;
                } else {
                  if ((var3_int ^ -1) <= -211) {
                    break L89;
                  } else {
                    if (var4 < 66) {
                      break L89;
                    } else {
                      if (-93 >= (var4 ^ -1)) {
                        break L89;
                      } else {
                        if (-1 <= (eg.field_p ^ -1)) {
                          break L89;
                        } else {
                          L90: {
                            if (!ha.field_o) {
                              break L90;
                            } else {
                              if (this.field_B >= 12) {
                                break L90;
                              } else {
                                break L89;
                              }
                            }
                          }
                          L91: {
                            if ((eg.field_p ^ -1) < -2) {
                              param0.field_Eb = new String[1];
                              param0.field_Eb[0] = di.field_g + (eg.field_p - 1);
                              break L91;
                            } else {
                              break L91;
                            }
                          }
                          L92: {
                            if ((eg.field_p ^ -1) != -2) {
                              break L92;
                            } else {
                              param0.field_Eb = new String[1];
                              param0.field_Eb[0] = ph.field_u;
                              break L92;
                            }
                          }
                          if (-2 == (this.field_N ^ -1)) {
                            L93: {
                              qd.a((byte) 80, 25);
                              if (this.field_B != 12) {
                                break L93;
                              } else {
                                this.field_B = 13;
                                break L93;
                              }
                            }
                            eg.field_p = eg.field_p - 1;
                            break L89;
                          } else {
                            break L89;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L94: {
                if (212 > var3_int) {
                  break L94;
                } else {
                  if (238 <= var3_int) {
                    break L94;
                  } else {
                    if ((var4 ^ -1) > -67) {
                      break L94;
                    } else {
                      if (92 <= var4) {
                        break L94;
                      } else {
                        if (eg.field_p >= 5) {
                          break L94;
                        } else {
                          L95: {
                            if (!ha.field_o) {
                              break L95;
                            } else {
                              if (-13 >= (this.field_B ^ -1)) {
                                break L95;
                              } else {
                                break L94;
                              }
                            }
                          }
                          param0.field_Eb = new String[1];
                          param0.field_Eb[0] = di.field_g + (eg.field_p + 1);
                          if ((this.field_N ^ -1) == -2) {
                            L96: {
                              qd.a((byte) 107, 24);
                              if (-13 != (this.field_B ^ -1)) {
                                break L96;
                              } else {
                                this.field_B = 13;
                                break L96;
                              }
                            }
                            eg.field_p = eg.field_p + 1;
                            break L94;
                          } else {
                            break L94;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L97: {
                if ((var3_int ^ -1) > -242) {
                  break L97;
                } else {
                  if (267 <= var3_int) {
                    break L97;
                  } else {
                    if (66 > var4) {
                      break L97;
                    } else {
                      if (92 <= var4) {
                        break L97;
                      } else {
                        L98: {
                          if (!ha.field_o) {
                            break L98;
                          } else {
                            if ((this.field_B ^ -1) <= -8) {
                              break L98;
                            } else {
                              break L97;
                            }
                          }
                        }
                        param0.field_Eb = new String[1];
                        param0.field_Eb[0] = sd.field_f;
                        if (this.field_N == 1) {
                          qd.a((byte) 109, 24);
                          var5_int = 0;
                          var6 = 0;
                          L99: while (true) {
                            L100: {
                              L101: {
                                L102: {
                                  if ((var6 ^ -1) <= -13) {
                                    break L102;
                                  } else {
                                    stackIn_670_0 = this.field_q;

                                    if (var9 != 0) {
                                      break L101;
                                    } else {
                                      L103: {
                                        if (stackIn_670_0 != this.field_C[var6]) {
                                          break L103;
                                        } else {
                                          var5_int = var6;
                                          break L103;
                                        }
                                      }
                                      var6++;
                                      if (var9 == 0) {
                                        continue L99;
                                      } else {
                                        break L102;
                                      }
                                    }
                                  }
                                }
                                var6 = 0;
                                L104: while (true) {
                                  L105: {
                                    var6++;
                                    var5_int++;
                                    if (var5_int >= 12) {
                                      var5_int -= 12;
                                      break L105;
                                    } else {
                                      break L105;
                                    }
                                  }
                                  L106: {
                                    if (var6 >= 12) {
                                      break L106;
                                    } else {
                                      if (this.field_C[var5_int] == null) {
                                        continue L104;
                                      } else {
                                        stackIn_673_0 = this.field_C[var5_int].field_Z;

                                        if (var9 != 0) {
                                          break L100;
                                        } else {
                                          if (stackIn_673_0 == null) {
                                            continue L104;
                                          } else {
                                            if (-1 <= (this.field_C[var5_int].field_jb ^ -1)) {
                                              continue L104;
                                            } else {
                                              if (this.field_C[var5_int].field_P <= 0) {
                                                continue L104;
                                              } else {
                                                break L106;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackIn_670_0 = this.field_C[var5_int];
                                  break L101;
                                }
                              }
                              if (stackIn_670_0 == null) {
                                break L97;
                              } else {
                                stackIn_673_0 = this.field_C[var5_int].field_Z;
                                break L100;
                              }
                            }
                            if (stackIn_673_0 == null) {
                              break L97;
                            } else {
                              if ((this.field_C[var5_int].field_P ^ -1) < -1) {
                                L107: {
                                  this.field_q = this.field_C[var5_int];
                                  lg.field_c = -(this.field_q.field_E * 48) + (this.field_q.field_H + this.field_q.field_F) * 16;
                                  this.field_m = false;
                                  if (-8 < (this.field_B ^ -1)) {
                                    break L107;
                                  } else {
                                    if (this.field_B >= 10) {
                                      break L107;
                                    } else {
                                      this.field_B = this.field_B + 1;
                                      break L107;
                                    }
                                  }
                                }
                                sj.field_b = 32 * (-this.field_q.field_H + this.field_q.field_F);
                                eg.field_p = this.field_q.field_E;
                                this.field_L = 0;
                                this.a(-1);
                                break L97;
                              } else {
                                break L97;
                              }
                            }
                          }
                        } else {
                          break L97;
                        }
                      }
                    }
                  }
                }
              }
              L108: {
                L109: {
                  L110: {
                    if ((var3_int ^ -1) > -14) {
                      break L110;
                    } else {
                      if ((var3_int ^ -1) <= -82) {
                        break L110;
                      } else {
                        if (12 > var4) {
                          break L110;
                        } else {
                          if ((var4 ^ -1) > -81) {
                            break L109;
                          } else {
                            break L110;
                          }
                        }
                      }
                    }
                  }
                  if (-270 < (var3_int ^ -1)) {
                    break L108;
                  } else {
                    if ((var3_int ^ -1) <= -296) {
                      break L108;
                    } else {
                      if (66 > var4) {
                        break L108;
                      } else {
                        if ((var4 ^ -1) <= -93) {
                          break L108;
                        } else {
                          break L109;
                        }
                      }
                    }
                  }
                }
                L111: {
                  if (!ha.field_o) {
                    break L111;
                  } else {
                    if (-10 < (this.field_B ^ -1)) {
                      break L108;
                    } else {
                      break L111;
                    }
                  }
                }
                param0.field_Eb = new String[1];
                param0.field_Eb[0] = ab.field_f;
                if ((this.field_N ^ -1) != -2) {
                  break L108;
                } else {
                  qd.a((byte) 18, 33);
                  lg.field_c = -(48 * this.field_q.field_E) + (this.field_q.field_F - -this.field_q.field_H) * 16;
                  eg.field_p = this.field_q.field_E;
                  sj.field_b = 32 * (this.field_q.field_F + -this.field_q.field_H);
                  break L108;
                }
              }
              L112: {
                if ((var3_int ^ -1) > -310) {
                  break L112;
                } else {
                  if (var3_int >= 457) {
                    break L112;
                  } else {
                    if (var4 < 10) {
                      break L112;
                    } else {
                      if ((var4 ^ -1) <= -84) {
                        break L112;
                      } else {
                        L113: {
                          if (!ha.field_o) {
                            break L113;
                          } else {
                            if (5 <= this.field_B) {
                              break L113;
                            } else {
                              if (3 == this.field_B) {
                                break L113;
                              } else {
                                break L112;
                              }
                            }
                          }
                        }
                        L114: {
                          var5_ref = this.field_q.field_nb;
                          if (null == var5_ref) {
                            break L114;
                          } else {
                            L115: {
                              if (0 == var5_ref.field_g) {
                                break L115;
                              } else {
                                if (var5_ref.field_g == 3) {
                                  break L115;
                                } else {
                                  if (8 == var5_ref.field_g) {
                                    break L115;
                                  } else {
                                    if (12 != var5_ref.field_g) {
                                      break L114;
                                    } else {
                                      break L115;
                                    }
                                  }
                                }
                              }
                            }
                            var5_ref = this.field_q.field_eb;
                            break L114;
                          }
                        }
                        if (null == var5_ref) {
                          break L112;
                        } else {
                          L116: {
                            param0.field_Eb = new String[1];
                            param0.field_Eb[0] = ne.field_b + od.field_c[var5_ref.field_g].field_j + " " + gl.field_h;
                            if (-2 != (this.field_L ^ -1)) {
                              break L116;
                            } else {
                              param0.field_Eb[0] = ne.field_b + od.field_c[var5_ref.field_g].field_j + " " + td.field_a;
                              break L116;
                            }
                          }
                          L117: {
                            if (ef.field_j < 324) {
                              break L117;
                            } else {
                              if ((ef.field_j ^ -1) < -355) {
                                break L117;
                              } else {
                                if (var4 < 50) {
                                  break L117;
                                } else {
                                  if (80 < var4) {
                                    break L117;
                                  } else {
                                    if (var5_ref.field_c >= var5_ref.a(true)) {
                                      break L117;
                                    } else {
                                      if ((var5_ref.field_g ^ -1) == -7) {
                                        break L117;
                                      } else {
                                        if (-8 == (var5_ref.field_g ^ -1)) {
                                          break L117;
                                        } else {
                                          param0.field_Eb = new String[1];
                                          param0.field_Eb[0] = rf.field_q + od.field_c[var5_ref.field_g].field_j + hi.field_Y;
                                          if (1 == this.field_N) {
                                            L118: {
                                              var6 = 14;
                                              if ((var6 ^ -1) < (this.field_q.field_jb ^ -1)) {
                                                break L118;
                                              } else {
                                                var5_ref.a(0);
                                                qd.a((byte) 120, od.field_c[var5_ref.field_g].field_n);
                                                this.field_q.field_jb = this.field_q.field_jb - var6;
                                                this.field_q.b(var6, (byte) -116);
                                                this.field_q.field_ab = 0;
                                                break L118;
                                              }
                                            }
                                            if (var9 == 0) {
                                              break L112;
                                            } else {
                                              break L117;
                                            }
                                          } else {
                                            break L112;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (1 != this.field_N) {
                            break L112;
                          } else {
                            L119: {
                              L120: {
                                if (this.field_q.field_eb == null) {
                                  break L120;
                                } else {
                                  L121: {
                                    if (this.field_q.field_nb.field_g == 0) {
                                      break L121;
                                    } else {
                                      if (8 == this.field_q.field_nb.field_g) {
                                        break L121;
                                      } else {
                                        if ((this.field_q.field_nb.field_g ^ -1) == -4) {
                                          break L121;
                                        } else {
                                          if (-13 != (this.field_q.field_nb.field_g ^ -1)) {
                                            break L120;
                                          } else {
                                            break L121;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L122: {
                                    var5_ref = this.field_q.field_nb;
                                    this.field_q.field_nb = this.field_q.field_eb;
                                    if (this.field_m) {
                                      this.field_L = 0;
                                      break L122;
                                    } else {
                                      break L122;
                                    }
                                  }
                                  this.field_q.field_eb = var5_ref;
                                  this.field_q.field_ab = 0;
                                  if (var9 == 0) {
                                    break L119;
                                  } else {
                                    break L120;
                                  }
                                }
                              }
                              L123: {
                                if (!this.field_m) {
                                  break L123;
                                } else {
                                  this.field_L = 0;
                                  if (var9 == 0) {
                                    break L119;
                                  } else {
                                    break L123;
                                  }
                                }
                              }
                              this.field_L = 1 + -this.field_L;
                              break L119;
                            }
                            L124: {
                              if ((this.field_B ^ -1) == -4) {
                                this.field_B = 4;
                                break L124;
                              } else {
                                break L124;
                              }
                            }
                            L125: {
                              this.field_m = false;
                              stackIn_826_0 = 41;

                              if (this.field_L == 0) {
                                stackIn_827_0 = stackIn_826_0;
                                stackIn_827_1 = 34;
                                break L125;
                              } else {
                                stackIn_827_0 = stackIn_826_0;
                                stackIn_827_1 = 33;
                                break L125;
                              }
                            }
                            qd.a((byte) stackIn_827_0, stackIn_827_1);
                            break L112;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L126: {
                if (-468 < (var3_int ^ -1)) {
                  break L126;
                } else {
                  if (var3_int >= 540) {
                    break L126;
                  } else {
                    if (var4 < 10) {
                      break L126;
                    } else {
                      if (83 <= var4) {
                        break L126;
                      } else {
                        L127: {
                          if (!ha.field_o) {
                            break L127;
                          } else {
                            if (this.field_B >= 5) {
                              break L127;
                            } else {
                              if (this.field_B != 3) {
                                break L126;
                              } else {
                                break L127;
                              }
                            }
                          }
                        }
                        L128: {
                          L129: {
                            var5_ref = this.field_q.field_eb;
                            if (null == var5_ref) {
                              break L129;
                            } else {
                              if ((var5_ref.field_g ^ -1) == -1) {
                                break L128;
                              } else {
                                if (-4 == (var5_ref.field_g ^ -1)) {
                                  break L128;
                                } else {
                                  if (8 == var5_ref.field_g) {
                                    break L128;
                                  } else {
                                    if ((var5_ref.field_g ^ -1) == -13) {
                                      break L128;
                                    } else {
                                      break L129;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var5_ref = this.field_q.field_nb;
                          break L128;
                        }
                        if (var5_ref == null) {
                          break L126;
                        } else {
                          L130: {
                            param0.field_Eb = new String[1];
                            param0.field_Eb[0] = ne.field_b + od.field_c[var5_ref.field_g].field_j + " " + gl.field_h;
                            if ((this.field_L ^ -1) != -2) {
                              break L130;
                            } else {
                              param0.field_Eb[0] = ne.field_b + od.field_c[var5_ref.field_g].field_j + " " + td.field_a;
                              break L130;
                            }
                          }
                          L131: {
                            L132: {
                              if (-482 < (ef.field_j ^ -1)) {
                                break L132;
                              } else {
                                if ((ef.field_j ^ -1) < -512) {
                                  break L132;
                                } else {
                                  if ((var4 ^ -1) > -51) {
                                    break L132;
                                  } else {
                                    if (var4 > 80) {
                                      break L132;
                                    } else {
                                      if ((var5_ref.field_c ^ -1) <= (var5_ref.a(true) ^ -1)) {
                                        break L132;
                                      } else {
                                        if (-7 == (var5_ref.field_g ^ -1)) {
                                          break L132;
                                        } else {
                                          if (7 != var5_ref.field_g) {
                                            break L131;
                                          } else {
                                            break L132;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (-2 != (this.field_N ^ -1)) {
                              break L126;
                            } else {
                              L133: {
                                L134: {
                                  if (null == this.field_q.field_eb) {
                                    break L134;
                                  } else {
                                    if (0 == this.field_q.field_nb.field_g) {
                                      break L134;
                                    } else {
                                      if ((this.field_q.field_nb.field_g ^ -1) == -9) {
                                        break L134;
                                      } else {
                                        if (-4 == (this.field_q.field_nb.field_g ^ -1)) {
                                          break L134;
                                        } else {
                                          if (this.field_q.field_nb.field_g == 12) {
                                            break L134;
                                          } else {
                                            L135: {
                                              var5_ref = this.field_q.field_nb;
                                              this.field_q.field_nb = this.field_q.field_eb;
                                              this.field_q.field_ab = 0;
                                              if (this.field_m) {
                                                this.field_L = 0;
                                                break L135;
                                              } else {
                                                break L135;
                                              }
                                            }
                                            this.field_q.field_eb = var5_ref;
                                            if (var9 == 0) {
                                              break L133;
                                            } else {
                                              break L134;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L136: {
                                  if (this.field_m) {
                                    break L136;
                                  } else {
                                    this.field_L = 1 + -this.field_L;
                                    if (var9 == 0) {
                                      break L133;
                                    } else {
                                      break L136;
                                    }
                                  }
                                }
                                this.field_L = 0;
                                break L133;
                              }
                              L137: {
                                if ((this.field_B ^ -1) != -4) {
                                  break L137;
                                } else {
                                  this.field_B = 4;
                                  break L137;
                                }
                              }
                              L138: {
                                this.field_m = false;
                                if (-6 == (this.field_B ^ -1)) {
                                  this.field_B = 6;
                                  break L138;
                                } else {
                                  break L138;
                                }
                              }
                              L139: {
                                stackIn_927_0 = 16;

                                if (-1 == (this.field_L ^ -1)) {
                                  stackIn_928_0 = stackIn_927_0;
                                  stackIn_928_1 = 34;
                                  break L139;
                                } else {
                                  stackIn_928_0 = stackIn_927_0;
                                  stackIn_928_1 = 33;
                                  break L139;
                                }
                              }
                              qd.a((byte) stackIn_928_0, stackIn_928_1);
                              if (var9 == 0) {
                                break L126;
                              } else {
                                break L131;
                              }
                            }
                          }
                          param0.field_Eb = new String[1];
                          param0.field_Eb[0] = rf.field_q + od.field_c[var5_ref.field_g].field_j + hi.field_Y;
                          if (-2 == (this.field_N ^ -1)) {
                            var6 = 14;
                            if ((this.field_q.field_jb ^ -1) <= (var6 ^ -1)) {
                              var5_ref.a(0);
                              qd.a((byte) 25, od.field_c[var5_ref.field_g].field_n);
                              this.field_q.field_jb = this.field_q.field_jb - var6;
                              this.field_q.b(var6, (byte) -117);
                              this.field_q.field_ab = 0;
                              break L126;
                            } else {
                              break L126;
                            }
                          } else {
                            break L126;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L140: {
                if (547 > var3_int) {
                  break L140;
                } else {
                  if (595 <= var3_int) {
                    break L140;
                  } else {
                    if (var4 < 35) {
                      break L140;
                    } else {
                      if (-84 >= (var4 ^ -1)) {
                        break L140;
                      } else {
                        L141: {
                          if (!ha.field_o) {
                            break L141;
                          } else {
                            if (-15 < (this.field_B ^ -1)) {
                              break L140;
                            } else {
                              break L141;
                            }
                          }
                        }
                        L142: {
                          param0.field_Eb = new String[1];
                          param0.field_Eb[0] = wg.field_g;
                          if (!this.field_m) {
                            break L142;
                          } else {
                            param0.field_Eb[0] = kd.field_d;
                            break L142;
                          }
                        }
                        if (1 != this.field_N) {
                          break L140;
                        } else {
                          L143: {
                            if (0 == this.field_L) {
                              break L143;
                            } else {
                              if (!this.field_m) {
                                break L143;
                              } else {
                                qd.a((byte) 108, 34);
                                this.field_m = false;
                                this.field_L = 0;
                                if (var9 == 0) {
                                  break L140;
                                } else {
                                  break L143;
                                }
                              }
                            }
                          }
                          this.field_L = 1;
                          this.field_m = true;
                          qd.a((byte) 102, 33);
                          break L140;
                        }
                      }
                    }
                  }
                }
              }
              if (var3_int < ge.field_b) {
                break L2;
              } else {
                if (var3_int >= vb.field_i + ge.field_b) {
                  break L2;
                } else {
                  if (var4 < 9) {
                    break L2;
                  } else {
                    if (-85 >= (var4 ^ -1)) {
                      break L2;
                    } else {
                      L144: {
                        if (!ha.field_o) {
                          break L144;
                        } else {
                          if (-11 >= (this.field_B ^ -1)) {
                            break L144;
                          } else {
                            break L2;
                          }
                        }
                      }
                      param0.field_Eb = new String[1];
                      param0.field_Eb[0] = kd.field_e;
                      if (-2 != (this.field_N ^ -1)) {
                        break L2;
                      } else {
                        L145: {
                          if (-11 != (this.field_B ^ -1)) {
                            break L145;
                          } else {
                            this.field_B = 11;
                            break L145;
                          }
                        }
                        this.a(param0, (byte) 69);
                        qd.a((byte) 59, 32);
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            L146: {
              if (param1) {
                break L146;
              } else {
                this.field_e = (hk) null;
                break L146;
              }
            }
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L147: {
            var3 = decompiledCaughtException;
            stackIn_1003_0 = var3;

            stackIn_1003_1 = new StringBuilder().append("e.A(");

            if (param0 == null) {
              stackIn_1004_0 = stackIn_1003_0;
              stackIn_1004_1 = (StringBuilder) ((Object) stackIn_1003_1);
              stackIn_1004_2 = "null";
              break L147;
            } else {
              stackIn_1004_0 = stackIn_1003_0;
              stackIn_1004_1 = (StringBuilder) ((Object) stackIn_1003_1);
              stackIn_1004_2 = "{...}";
              break L147;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_1004_0), stackIn_1004_2 + ',' + param1 + ')');
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

    final void a(byte param0, int param1) {
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_33_0 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        r stackIn_163_0 = null;
        r stackIn_283_0 = null;
        r stackIn_283_1 = null;
        int stackIn_330_0 = 0;
        int stackIn_330_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        oh var4_ref_oh = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param1 != 64) {
                break L1;
              } else {
                if ((mm.field_e ^ -1) <= -3) {
                  L2: {
                    stackIn_10_0 = this;

                    if (this.field_I) {
                      stackIn_11_0 = this;
                      stackIn_11_1 = 0;
                      break L2;
                    } else {
                      stackIn_11_0 = this;
                      stackIn_11_1 = 1;
                      break L2;
                    }
                  }
                  ((e) (this)).field_I = stackIn_11_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if ((param1 ^ -1) != -50) {
                break L3;
              } else {
                if (ha.field_o) {
                  break L3;
                } else {
                  L4: {
                    if (d.field_H) {
                      stackIn_22_0 = 0;
                      break L4;
                    } else {
                      stackIn_22_0 = 1;
                      break L4;
                    }
                  }
                  d.field_H = stackIn_22_0 != 0;
                  break L3;
                }
              }
            }
            L5: {
              if (param1 != 40) {
                break L5;
              } else {
                if (ha.field_o) {
                  break L5;
                } else {
                  L6: {
                    if (ce.field_e) {
                      stackIn_33_0 = 0;
                      break L6;
                    } else {
                      stackIn_33_0 = 1;
                      break L6;
                    }
                  }
                  ce.field_e = stackIn_33_0 != 0;
                  break L5;
                }
              }
            }
            L7: {
              if (wb.field_e != param1) {
                break L7;
              } else {
                if (!ha.field_o) {
                  L8: {
                    stackIn_43_0 = this;

                    if (this.field_w) {
                      stackIn_44_0 = this;
                      stackIn_44_1 = 0;
                      break L8;
                    } else {
                      stackIn_44_0 = this;
                      stackIn_44_1 = 1;
                      break L8;
                    }
                  }
                  ((e) (this)).field_w = stackIn_44_1 != 0;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if ((param1 ^ -1) != -33) {
                break L9;
              } else {
                if ((mm.field_e ^ -1) <= -3) {
                  L10: {
                    if (g.field_tb) {
                      stackIn_55_0 = 0;
                      break L10;
                    } else {
                      stackIn_55_0 = 1;
                      break L10;
                    }
                  }
                  g.field_tb = stackIn_55_0 != 0;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (-40 != (param1 ^ -1)) {
                break L11;
              } else {
                if (!ha.field_o) {
                  L12: {
                    if (fd.field_o) {
                      stackIn_66_0 = 0;
                      break L12;
                    } else {
                      stackIn_66_0 = 1;
                      break L12;
                    }
                  }
                  fd.field_o = stackIn_66_0 != 0;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            L13: {
              if (!this.field_J) {
                break L13;
              } else {
                if ((rh.field_c ^ -1) != (param1 ^ -1)) {
                  break L13;
                } else {
                  if (this.field_q.field_S) {
                    break L13;
                  } else {
                    L14: {
                      if (!ha.field_o) {
                        break L14;
                      } else {
                        if (11 > this.field_B) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (-1 == (this.field_q.field_B ^ -1)) {
                      L15: {
                        var3_int = this.field_q.g(12384);
                        this.field_q.field_jb = this.field_q.field_jb - var3_int;
                        this.field_q.field_B = 1;
                        this.field_q.field_jb = this.field_q.field_jb - this.field_q.field_jb / 2;
                        if (this.field_q.field_jb >= 0) {
                          break L15;
                        } else {
                          this.field_q.field_jb = 0;
                          break L15;
                        }
                      }
                      this.field_q.b(var3_int, (byte) -64);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
              }
            }
            L16: {
              if (!this.field_J) {
                break L16;
              } else {
                if (param1 != 35) {
                  break L16;
                } else {
                  if (this.field_q.field_S) {
                    break L16;
                  } else {
                    L17: {
                      if (!ha.field_o) {
                        break L17;
                      } else {
                        if (this.field_B < 11) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    if (1 != this.field_q.field_B) {
                      break L16;
                    } else {
                      this.field_q.field_jb = this.field_q.field_jb + this.field_q.field_jb / 2;
                      this.field_q.field_B = 0;
                      break L16;
                    }
                  }
                }
              }
            }
            L18: {
              if (!this.field_J) {
                break L18;
              } else {
                if (param1 != 36) {
                  break L18;
                } else {
                  if (mm.field_e >= 2) {
                    this.field_q.field_jb = this.field_q.field_v;
                    kg.field_q = true;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
            }
            L19: {
              if (!this.field_J) {
                break L19;
              } else {
                if (-57 != (param1 ^ -1)) {
                  break L19;
                } else {
                  var3_int = 14;
                  var4_ref_oh = this.field_q.field_nb;
                  if ((od.field_c[var4_ref_oh.field_g].field_o ^ -1) >= (var4_ref_oh.field_c ^ -1)) {
                    break L19;
                  } else {
                    if ((this.field_q.field_jb ^ -1) <= (var3_int ^ -1)) {
                      var4_ref_oh.a(0);
                      qd.a((byte) 73, od.field_c[var4_ref_oh.field_g].field_n);
                      this.field_q.field_jb = this.field_q.field_jb - var3_int;
                      this.field_q.b(var3_int, (byte) -111);
                      this.field_q.field_ab = 0;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              }
            }
            L20: {
              L21: {
                L22: {
                  L23: {
                    L24: {
                      if (!this.field_J) {
                        break L24;
                      } else {
                        if (param1 != 69) {
                          break L24;
                        } else {
                          L25: {
                            if (!ha.field_o) {
                              break L25;
                            } else {
                              if ((this.field_B ^ -1) <= -8) {
                                break L25;
                              } else {
                                break L24;
                              }
                            }
                          }
                          this.b((byte) -3);
                          var3_int = 0;
                          var4 = 0;
                          L26: while (true) {
                            L27: {
                              if (var4 >= 12) {
                                break L27;
                              } else {
                                stackIn_283_0 = this.field_q;

                                stackIn_283_1 = this.field_C[var4];

                                if (var5 != 0) {
                                  break L23;
                                } else {
                                  L28: {
                                    if (stackIn_283_0 != stackIn_283_1) {
                                      break L28;
                                    } else {
                                      var3_int = var4;
                                      break L28;
                                    }
                                  }
                                  var4++;
                                  if (var5 == 0) {
                                    continue L26;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                            var4 = 0;
                            L29: while (true) {
                              L30: {
                                var3_int++;
                                if (-13 >= (var3_int ^ -1)) {
                                  var3_int -= 12;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              L31: {
                                L32: {
                                  var4++;
                                  if ((var4 ^ -1) <= -13) {
                                    break L32;
                                  } else {
                                    if (null == this.field_C[var3_int]) {
                                      continue L29;
                                    } else {
                                      stackIn_163_0 = this.field_C[var3_int];

                                      if (var5 != 0) {
                                        break L31;
                                      } else {
                                        if (stackIn_163_0.field_Z == null) {
                                          continue L29;
                                        } else {
                                          if ((this.field_C[var3_int].field_jb ^ -1) >= -1) {
                                            continue L29;
                                          } else {
                                            if ((this.field_C[var3_int].field_P ^ -1) >= -1) {
                                              continue L29;
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackIn_163_0 = this.field_C[var3_int];
                                break L31;
                              }
                              L33: {
                                if (stackIn_163_0 == null) {
                                  break L33;
                                } else {
                                  if (null == this.field_C[var3_int].field_Z) {
                                    break L33;
                                  } else {
                                    if (-1 > (this.field_C[var3_int].field_P ^ -1)) {
                                      this.field_q = this.field_C[var3_int];
                                      sj.field_b = 32 * (-this.field_q.field_H + this.field_q.field_F);
                                      eg.field_p = this.field_q.field_E;
                                      lg.field_c = (this.field_q.field_H + this.field_q.field_F) * 16 - this.field_q.field_E * 48;
                                      break L33;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                              }
                              L34: {
                                if (-8 < (this.field_B ^ -1)) {
                                  break L34;
                                } else {
                                  if (this.field_B < 10) {
                                    this.field_B = this.field_B + 1;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              this.a(-1);
                              this.field_m = false;
                              ok.field_i = true;
                              this.field_L = 0;
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    L35: {
                      if (!this.field_J) {
                        break L35;
                      } else {
                        if (param1 != ef.field_h) {
                          break L35;
                        } else {
                          L36: {
                            if (!ha.field_o) {
                              break L36;
                            } else {
                              if ((this.field_B ^ -1) > -10) {
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          lg.field_c = 16 * (this.field_q.field_F - -this.field_q.field_H) + -(this.field_q.field_E * 48);
                          sj.field_b = 32 * (this.field_q.field_F - this.field_q.field_H);
                          eg.field_p = this.field_q.field_E;
                          break L35;
                        }
                      }
                    }
                    if (param0 == -106) {
                      L37: {
                        if (!this.field_J) {
                          break L37;
                        } else {
                          if (param1 == 80) {
                            var3_int = 0;
                            var4 = 0;
                            L38: while (true) {
                              if (0 != var4) {
                                break L37;
                              } else {
                                if (110 <= var3_int) {
                                  break L37;
                                } else {
                                  L39: {
                                    this.field_s = this.field_s + 1;
                                    var3_int++;
                                    if ((this.field_s ^ -1) <= -101) {
                                      this.field_s = 0;
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  if (this.field_C[this.field_s] == null) {
                                    continue L38;
                                  } else {
                                    stackIn_330_0 = this.field_C[this.field_s].field_C;

                                    stackIn_330_1 = 1;

                                    if (var5 != 0) {
                                      break L20;
                                    } else {
                                      if (stackIn_330_0 != stackIn_330_1) {
                                        continue L38;
                                      } else {
                                        if (this.field_h.a((byte) -93, this.field_q, this.field_C[this.field_s])) {
                                          sj.field_b = 32 * (-this.field_C[this.field_s].field_H + this.field_C[this.field_s].field_F);
                                          var4 = 1;
                                          lg.field_c = -(48 * this.field_C[this.field_s].field_E) + (this.field_C[this.field_s].field_H + this.field_C[this.field_s].field_F) * 16;
                                          eg.field_p = this.field_C[this.field_s].field_E;
                                          if (var5 == 0) {
                                            continue L38;
                                          } else {
                                            break L37;
                                          }
                                        } else {
                                          continue L38;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L37;
                          }
                        }
                      }
                      L40: {
                        if (!this.field_J) {
                          break L40;
                        } else {
                          if (param1 != fl.field_b) {
                            break L40;
                          } else {
                            L41: {
                              if (!ha.field_o) {
                                break L41;
                              } else {
                                if (-4 == (this.field_B ^ -1)) {
                                  break L41;
                                } else {
                                  if (this.field_B >= 5) {
                                    break L41;
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                            }
                            L42: {
                              this.b((byte) -3);
                              if (3 == this.field_B) {
                                this.field_B = 4;
                                break L42;
                              } else {
                                break L42;
                              }
                            }
                            L43: {
                              L44: {
                                if (!this.field_m) {
                                  break L44;
                                } else {
                                  this.field_m = false;
                                  if (var5 == 0) {
                                    break L43;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              this.field_L = 1 + -this.field_L;
                              break L43;
                            }
                            if (5 == this.field_B) {
                              this.field_B = 6;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                        }
                      }
                      L45: {
                        if (!this.field_J) {
                          break L45;
                        } else {
                          if (-53 != (param1 ^ -1)) {
                            break L45;
                          } else {
                            L46: {
                              if (!ha.field_o) {
                                break L46;
                              } else {
                                if (14 <= this.field_B) {
                                  break L46;
                                } else {
                                  break L45;
                                }
                              }
                            }
                            this.b((byte) -3);
                            if (null == this.field_q.field_b) {
                              break L45;
                            } else {
                              L47: {
                                if (this.field_m) {
                                  break L47;
                                } else {
                                  this.field_L = 1;
                                  this.field_m = true;
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                              this.field_m = false;
                              this.field_L = 0;
                              break L45;
                            }
                          }
                        }
                      }
                      if (!this.field_J) {
                        break L21;
                      } else {
                        if (-68 != (param1 ^ -1)) {
                          break L21;
                        } else {
                          if (ha.field_o) {
                            break L21;
                          } else {
                            if (this.field_q.field_jb <= 0) {
                              break L21;
                            } else {
                              this.b((byte) -3);
                              var3_int = this.field_q.field_U;
                              this.field_q.a(true, uf.field_c, vf.field_a);
                              if ((this.field_q.field_U ^ -1) != (var3_int ^ -1)) {
                                stackIn_283_0 = this.field_q;
                                stackIn_283_1 = this.field_q;
                                break L23;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  stackIn_283_0.field_jb = stackIn_283_1.field_jb - 1;
                  this.field_q.field_ab = 0;
                  break L22;
                }
                ok.field_i = true;
                break L21;
              }
              L48: {
                if (!this.field_J) {
                  break L48;
                } else {
                  if (-43 != (param1 ^ -1)) {
                    break L48;
                  } else {
                    if (g.field_tb) {
                      break L48;
                    } else {
                      L49: {
                        if (!ha.field_o) {
                          break L49;
                        } else {
                          if (this.field_B < 12) {
                            break L48;
                          } else {
                            break L49;
                          }
                        }
                      }
                      L50: {
                        this.b((byte) -3);
                        eg.field_p = eg.field_p - 1;
                        if ((this.field_B ^ -1) != -13) {
                          break L50;
                        } else {
                          this.field_B = 13;
                          break L50;
                        }
                      }
                      if (eg.field_p >= 0) {
                        break L48;
                      } else {
                        eg.field_p = 0;
                        break L48;
                      }
                    }
                  }
                }
              }
              L51: {
                if (!this.field_J) {
                  break L51;
                } else {
                  if (43 != param1) {
                    break L51;
                  } else {
                    if (g.field_tb) {
                      break L51;
                    } else {
                      L52: {
                        if (!ha.field_o) {
                          break L52;
                        } else {
                          if (-13 >= (this.field_B ^ -1)) {
                            break L52;
                          } else {
                            break L51;
                          }
                        }
                      }
                      L53: {
                        this.b((byte) -3);
                        if (this.field_B == 12) {
                          this.field_B = 13;
                          break L53;
                        } else {
                          break L53;
                        }
                      }
                      eg.field_p = eg.field_p + 1;
                      if (-6 > (eg.field_p ^ -1)) {
                        eg.field_p = 5;
                        break L51;
                      } else {
                        break L51;
                      }
                    }
                  }
                }
              }
              stackIn_330_0 = 55;
              stackIn_330_1 = param1;
              break L20;
            }
            L54: {
              if (stackIn_330_0 != stackIn_330_1) {
                break L54;
              } else {
                if (mm.field_e < 2) {
                  break L54;
                } else {
                  this.a(true);
                  this.a(this.field_G, (byte) -67);
                  break L54;
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "e.H(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_o = null;
              if (param0 == 20) {
                break L1;
              } else {
                e.b(-97);
                break L1;
              }
            }
            field_g = null;
            field_l = null;
            field_t = null;
            field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "e.Q(" + param0 + ')');
        }
    }

    private final void a(int param0, Terraphoenix param1, boolean param2) {
        int incrementValue$0 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_60_0 = null;
        r stackIn_70_0 = null;
        int stackIn_111_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        int stackIn_177_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_220_0 = 0;
        int stackIn_220_1 = 0;
        int stackIn_227_0 = 0;
        int stackIn_247_0 = 0;
        Object stackIn_277_0 = null;
        Object stackIn_413_0 = null;
        dl stackIn_413_1 = null;
        int stackIn_431_0 = 0;
        Object stackIn_433_0 = null;
        dk stackIn_433_1 = null;
        int stackIn_433_2 = 0;
        int stackIn_433_3 = 0;
        int stackIn_433_4 = 0;
        int stackIn_433_5 = 0;
        Object stackIn_435_0 = null;
        dk stackIn_435_1 = null;
        int stackIn_435_2 = 0;
        int stackIn_435_3 = 0;
        int stackIn_435_4 = 0;
        int stackIn_435_5 = 0;
        Object stackIn_437_0 = null;
        dk stackIn_437_1 = null;
        int stackIn_437_2 = 0;
        int stackIn_437_3 = 0;
        int stackIn_437_4 = 0;
        int stackIn_437_5 = 0;
        Object stackIn_438_0 = null;
        dk stackIn_438_1 = null;
        int stackIn_438_2 = 0;
        int stackIn_438_3 = 0;
        int stackIn_438_4 = 0;
        int stackIn_438_5 = 0;
        int stackIn_438_6 = 0;
        Object stackIn_446_0 = null;
        dl stackIn_446_1 = null;
        int stackIn_453_0 = 0;
        int stackIn_454_0 = 0;
        int stackIn_456_0 = 0;
        int stackIn_457_0 = 0;
        int stackIn_457_1 = 0;
        int stackIn_489_0 = 0;
        int stackIn_489_1 = 0;
        boolean stackIn_492_0 = false;
        boolean stackIn_496_0 = false;
        int stackIn_521_0 = 0;
        int stackIn_523_0 = 0;
        int stackIn_523_1 = 0;
        Object stackIn_647_0 = null;
        StringBuilder stackIn_647_1 = null;
        Object stackIn_649_0 = null;
        StringBuilder stackIn_649_1 = null;
        Object stackIn_650_0 = null;
        StringBuilder stackIn_650_1 = null;
        String stackIn_650_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        r stackOut_69_0;
        int statePc = 0;
        Object var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        dl var9_ref_dl = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        dl var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var4 = null;
                    if (param0 == 22341) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.a(95, (Terraphoenix) null, false);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var6 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var6 >= this.field_C.length) {
                        statePc = 37;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (null == this.field_C[var6]) {
                        statePc = 36;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (this.field_C[var6].field_Z != null) {
                        statePc = 36;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (-1 != (param1.field_Bb ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (this.field_C[var6].field_k) {
                        statePc = 29;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (this.field_C[var6].field_h) {
                        statePc = 29;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (-17 >= (this.field_B ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if ((fa.field_a ^ -1) < -1) {
                        statePc = 29;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_C[var6].field_P <= 0) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (!this.field_C[var6].field_Y) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var4 = this.field_C[var6];
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    var6++;
                    statePc = 5;
                    continue stateLoop;
                }
                case 37: {
                    var5 = null;
                    if (null != var4) {
                        statePc = 48;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var6 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var6 >= 50) {
                        statePc = 46;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var16 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (null == this.field_F[var6]) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return;
                }
                case 45: {
                    var6++;
                    if (var16 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.a(param1, (byte) 99);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (this.field_D == var4) {
                        statePc = 59;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var6 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (-51 >= (var6 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_60_0 = this;
                    stackIn_54_0 = stackIn_60_0;
                    if (var16 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (((e) (this)).field_F[var6] == null) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                case 58: {
                    var6++;
                    if (var16 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    ((r) (var4)).field_f = false;
                    stackIn_60_0 = this;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    ((e) (this)).field_D = (r) (var4);
                    var6 = 0;
                    var7 = 20000;
                    if (null == ((r) (var4)).field_a) {
                        statePc = 67;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (0 >= ((r) (var4)).field_a.field_P) {
                        statePc = 66;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 66: {
                    ((r) (var4)).field_a = null;
                    ((r) (var4)).field_w = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    var8 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var8 >= this.field_C.length) {
                        statePc = 263;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = this.field_C[var8];
                    stackIn_277_0 = stackOut_69_0;
                    stackIn_70_0 = stackOut_69_0;
                    if (var16 != 0) {
                        statePc = 277;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (stackIn_70_0 == null) {
                        statePc = 262;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if ((this.field_C[var8].field_P ^ -1) >= -1) {
                        statePc = 262;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if ((((r) (var4)).field_C ^ -1) == (this.field_C[var8].field_C ^ -1)) {
                        statePc = 262;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (this.field_C[var8].field_k) {
                        statePc = 87;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (this.field_C[var8].field_h) {
                        statePc = 87;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var9 = 1;
                    var10 = this.field_C[var8].field_F;
                    var11_int = this.field_C[var8].field_H;
                    if (!this.field_C[var8].field_k) {
                        statePc = 90;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var10 = this.field_C[var8].field_i;
                    var11_int = this.field_C[var8].field_gb;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    ((r) (var4)).a(true, var10, var11_int);
                    var12 = this.field_h.a((byte) -93, (r) (var4), this.field_C[var8]) ? 1 : 0;
                    var13 = -((r) (var4)).field_F + var10;
                    var14 = -((r) (var4)).field_H + var11_int;
                    var15 = var13 * var13 + var14 * var14;
                    if (null == var5) {
                        statePc = 197;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var12 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (var6 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var12 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var12 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var9 = 0;
                    if (var16 == 0) {
                        statePc = 260;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (7 == param1.field_Bb) {
                        statePc = 143;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackIn_115_0 = 0;
                    stackIn_111_0 = stackIn_115_0;
                    if (param1.field_db) {
                        statePc = 115;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    stackIn_113_0 = stackIn_111_0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    stackIn_116_0 = stackIn_113_0;
                    stackIn_116_1 = 1;
                    statePc = 116;
                    continue stateLoop;
                }
                case 115: {
                    stackIn_116_0 = stackIn_115_0;
                    stackIn_116_1 = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (stackIn_116_0 != stackIn_116_1) {
                        statePc = 118;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if ((((r) (var5)).field_E ^ -1) != (((r) (var4)).field_E ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if ((this.field_C[var8].field_E ^ -1) == (((r) (var4)).field_E ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (var12 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var9 = 0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (((r) (var4)).field_E >= ((r) (var5)).field_E) {
                        statePc = 136;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (((r) (var4)).field_E <= this.field_C[var8].field_E) {
                        statePc = 136;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (var12 != 0) {
                        statePc = 136;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var9 = 0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (var12 != 0) {
                        statePc = 143;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if ((this.field_C[var8].field_E ^ -1) > (((r) (var4)).field_E ^ -1)) {
                        statePc = 142;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var9 = 0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (var12 != 0) {
                        statePc = 164;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if ((((r) (var4)).field_z ^ -1) != -2) {
                        statePc = 164;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (((r) (var4)).field_c.field_d) {
                        statePc = 152;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    stackIn_153_0 = 1;
                    statePc = 153;
                    continue stateLoop;
                }
                case 152: {
                    stackIn_153_0 = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    stackIn_156_0 = stackIn_153_0;
                    stackIn_154_0 = stackIn_156_0;
                    if (this.field_C[var8].field_c.field_d) {
                        statePc = 156;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackIn_157_0 = stackIn_154_0;
                    stackIn_157_1 = 1;
                    statePc = 157;
                    continue stateLoop;
                }
                case 156: {
                    stackIn_157_0 = stackIn_156_0;
                    stackIn_157_1 = 0;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if (stackIn_157_0 == stackIn_157_1) {
                        statePc = 164;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (!this.field_A) {
                        statePc = 163;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var9 = 0;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (var12 != 0) {
                        statePc = 185;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (((r) (var4)).field_z != 2) {
                        statePc = 185;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if ((this.field_C[var8].field_E ^ -1) <= (((r) (var4)).field_E ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (((r) (var4)).field_c.field_d) {
                        statePc = 176;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackIn_177_0 = 1;
                    statePc = 177;
                    continue stateLoop;
                }
                case 176: {
                    stackIn_177_0 = 0;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    if (stackIn_177_0 != (this.field_C[var8].field_c.field_d ? 1 : 0)) {
                        statePc = 185;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (!this.field_A) {
                        statePc = 184;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if ((param1.field_Bb ^ -1) == -7) {
                        statePc = 185;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var9 = 0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (var12 != 0) {
                        statePc = 195;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if (3 > ((r) (var4)).field_z) {
                        statePc = 195;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if ((this.field_C[var8].field_E ^ -1) > (((r) (var4)).field_E ^ -1)) {
                        statePc = 194;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var9 = 0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (var7 >= var15) {
                        statePc = 260;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var9 = 0;
                    if (var16 == 0) {
                        statePc = 260;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (var12 != 0) {
                        statePc = 206;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if ((this.field_C[var8].field_E ^ -1) > (((r) (var4)).field_E ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var9 = 0;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (var12 != 0) {
                        statePc = 231;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (((r) (var4)).field_z != 1) {
                        statePc = 231;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (this.field_C[var8].field_c.field_d) {
                        statePc = 215;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    stackIn_216_0 = 1;
                    statePc = 216;
                    continue stateLoop;
                }
                case 215: {
                    stackIn_216_0 = 0;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    stackIn_219_0 = stackIn_216_0;
                    stackIn_217_0 = stackIn_219_0;
                    if (((r) (var4)).field_c.field_d) {
                        statePc = 219;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    stackIn_220_0 = stackIn_217_0;
                    stackIn_220_1 = 1;
                    statePc = 220;
                    continue stateLoop;
                }
                case 219: {
                    stackIn_220_0 = stackIn_219_0;
                    stackIn_220_1 = 0;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (stackIn_220_0 == stackIn_220_1) {
                        statePc = 231;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (this.field_A) {
                        statePc = 226;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    stackIn_227_0 = 1;
                    statePc = 227;
                    continue stateLoop;
                }
                case 226: {
                    stackIn_227_0 = 0;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if (stackIn_227_0 == 1) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var9 = 0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (var12 != 0) {
                        statePc = 252;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (2 != ((r) (var4)).field_z) {
                        statePc = 252;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (((r) (var4)).field_E <= this.field_C[var8].field_E) {
                        statePc = 252;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (this.field_C[var8].field_c.field_d == ((r) (var4)).field_c.field_d) {
                        statePc = 252;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (this.field_A) {
                        statePc = 246;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    stackIn_247_0 = 1;
                    statePc = 247;
                    continue stateLoop;
                }
                case 246: {
                    stackIn_247_0 = 0;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    if (stackIn_247_0 != 0) {
                        statePc = 251;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (param1.field_Bb == 6) {
                        statePc = 252;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var9 = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if (var12 != 0) {
                        statePc = 260;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (-4 < (((r) (var4)).field_z ^ -1)) {
                        statePc = 260;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (((r) (var4)).field_E <= this.field_C[var8].field_E) {
                        statePc = 260;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var9 = 0;
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    if (var9 == 0) {
                        statePc = 262;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var6 = var12;
                    var5 = this.field_C[var8];
                    var7 = var15;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    var8++;
                    if (var16 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (null == ((r) (var4)).field_a) {
                        statePc = 271;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (-1 <= (((r) (var4)).field_a.field_P ^ -1)) {
                        statePc = 271;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (!((r) (var4)).field_a.field_k) {
                        statePc = 271;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    var8 = ((r) (var4)).field_a.field_F - ((r) (var4)).field_F;
                    var9 = ((r) (var4)).field_a.field_H - ((r) (var4)).field_H;
                    var10 = var9 * var9 + var8 * var8;
                    var5 = ((r) (var4)).field_a;
                    var6 = this.field_h.a((byte) -93, (r) (var4), (r) (var5)) ? 1 : 0;
                    var7 = var10;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    if (var6 == 0) {
                        statePc = 275;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    ((r) (var4)).field_a = (r) (var5);
                    if (var16 == 0) {
                        statePc = 278;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    stackIn_277_0 = var4;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    ((r) ((Object) stackIn_277_0)).field_a = null;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    var7 = (int)Math.sqrt((double)var7);
                    if (0 == ((r) (var4)).field_w) {
                        statePc = 281;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var8 = od.field_c[((r) (var4)).field_nb.field_g].field_m;
                    if (0 == var8) {
                        statePc = 288;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (1 != var8) {
                        statePc = 294;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if (10.0 <= Math.random() * 100.0) {
                        statePc = 294;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (-2 == (((r) (var4)).field_B ^ -1)) {
                        statePc = 293;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 293: {
                    ((r) (var4)).field_B = 0;
                    ((r) (var4)).field_jb = ((r) (var4)).field_jb * 3 / 2;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    if (var8 != 4) {
                        statePc = 303;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (((r) (var4)).field_B != 1) {
                        statePc = 303;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (((r) (var4)).field_mb <= ((r) (var4)).field_P) {
                        statePc = 303;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    ((r) (var4)).field_jb = ((r) (var4)).field_jb * 3 / 2;
                    ((r) (var4)).field_B = 0;
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    if (var5 == null) {
                        statePc = 333;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (var6 == 0) {
                        statePc = 330;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    ((r) (var4)).field_w = 3;
                    if (1 != var8) {
                        statePc = 318;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    ((r) (var4)).field_w = 4;
                    if ((((r) (var4)).field_ab ^ -1) != -1) {
                        statePc = 318;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if ((double)var7 <= Math.random() * 10.0 + 10.0) {
                        statePc = 318;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    ((r) (var4)).field_w = 3;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if ((var8 ^ -1) == -3) {
                        statePc = 321;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 321: {
                    ((r) (var4)).field_w = 4;
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if (3 == var8) {
                        statePc = 325;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 325: {
                    ((r) (var4)).field_w = 5;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    if (-3 >= (((r) (var4)).field_z ^ -1)) {
                        statePc = 329;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 329: {
                    ((r) (var4)).field_w = 5;
                    if (var16 == 0) {
                        statePc = 334;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    ((r) (var4)).field_w = 2;
                    if (var16 == 0) {
                        statePc = 334;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    ((r) (var4)).field_w = 1;
                    var6 = 0;
                    statePc = 334;
                    continue stateLoop;
                }
                case 334: {
                    var8 = ((r) (var4)).field_w;
                    if (-1 == (var8 ^ -1)) {
                        statePc = 358;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    if ((var8 ^ -1) == -2) {
                        statePc = 359;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    if (2 != var8) {
                        statePc = 344;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 341: {
                    if (var16 == 0) {
                        statePc = 469;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    if ((var8 ^ -1) != -4) {
                        statePc = 350;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    if (var16 == 0) {
                        statePc = 469;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    if (-5 == (var8 ^ -1)) {
                        statePc = 562;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    if (-6 == (var8 ^ -1)) {
                        statePc = 594;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 358: {
                    ((r) (var4)).field_Y = true;
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    if (7 == ((r) (var4)).field_t) {
                        statePc = 362;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 362: {
                    ((r) (var4)).field_Y = true;
                    statePc = 363;
                    continue stateLoop;
                }
                case 363: {
                    return;
                }
                case 364: {
                    if (param2) {
                        statePc = 651;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    if (var6 == 0) {
                        statePc = 389;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    if (null == var5) {
                        statePc = 389;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    if (-1 <= (((r) (var5)).field_P ^ -1)) {
                        statePc = 389;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    if (var6 != 0) {
                        statePc = 383;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 377: {
                    if (var5 == null) {
                        statePc = 386;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    if ((((r) (var5)).field_P ^ -1) >= -1) {
                        statePc = 386;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    ((r) (var4)).field_w = 4;
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    ((r) (var4)).field_Y = true;
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    if ((Math.abs(((r) (var4)).field_X - ((r) (var4)).field_F) ^ -1) <= -3) {
                        statePc = 395;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    if (Math.abs(-((r) (var4)).field_H + ((r) (var4)).field_n) < 2) {
                        statePc = 401;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    if (null == this.field_h.a(false, ((r) (var4)).field_X, ((r) (var4)).field_E, ((r) (var4)).field_F, ((r) (var4)).field_n, ((r) (var4)).field_H, 86)) {
                        statePc = 401;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    ((r) (var4)).field_A = 0;
                    ((r) (var4)).field_d = ((r) (var4)).field_B;
                    ((r) (var4)).field_S = true;
                    if (var16 == 0) {
                        statePc = 461;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    ((r) (var4)).field_A = 0;
                    ((r) (var4)).field_S = true;
                    ((r) (var4)).field_d = ((r) (var4)).field_B;
                    var8 = 0;
                    var10 = 0;
                    statePc = 402;
                    continue stateLoop;
                }
                case 402: {
                    ((r) (var4)).field_X = 4 + (int)(Math.random() * (double)(this.field_h.field_b - 8));
                    ((r) (var4)).field_n = 4 + (int)(Math.random() * (double)(-8 + this.field_h.field_e));
                    ((r) (var4)).field_N = ((r) (var4)).field_E;
                    if (((r) (var4)).field_z != 2) {
                        statePc = 404;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    ((r) (var4)).field_N = 1;
                    statePc = 404;
                    continue stateLoop;
                }
                case 404: {
                    if (-4 == (((r) (var4)).field_z ^ -1)) {
                        statePc = 407;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 407: {
                    ((r) (var4)).field_N = 2;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    if (4 == ((r) (var4)).field_z) {
                        statePc = 411;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 411: {
                    ((r) (var4)).field_N = 4;
                    statePc = 412;
                    continue stateLoop;
                }
                case 412: {
                    var9_ref_dl = this.field_h.a(-115, ((r) (var4)).field_n, ((r) (var4)).field_E, ((r) (var4)).field_X);
                    ((r) (var4)).field_c.field_h = null;
                    stackIn_413_0 = null;
                    stackIn_413_1 = (dl) (var9_ref_dl);
                    statePc = 413;
                    continue stateLoop;
                }
                case 413: {
                    if (stackIn_413_0 == stackIn_413_1) {
                        statePc = 427;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    if ((((r) (var4)).field_X ^ -1) != (((r) (var4)).field_F ^ -1)) {
                        statePc = 420;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    if (((r) (var4)).field_n != ((r) (var4)).field_H) {
                        statePc = 420;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 420: {
                    var8 = 1;
                    if (0 != ((r) (var4)).field_z) {
                        statePc = 427;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    if (var9_ref_dl.field_d) {
                        statePc = 426;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 426: {
                    var8 = 0;
                    statePc = 427;
                    continue stateLoop;
                }
                case 427: {
                    if (var8 != 0) {
                        statePc = 430;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    stackIn_431_0 = 1;
                    statePc = 431;
                    continue stateLoop;
                }
                case 430: {
                    stackIn_431_0 = 0;
                    statePc = 431;
                    continue stateLoop;
                }
                case 431: {
                    if (stackIn_431_0 != 0) {
                        statePc = 442;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    stackIn_437_0 = null;
                    stackIn_433_0 = stackIn_437_0;
                    stackIn_437_1 = this.field_h;
                    stackIn_433_1 = stackIn_437_1;
                    stackIn_437_2 = ((r) (var4)).field_n;
                    stackIn_433_2 = stackIn_437_2;
                    stackIn_437_3 = ((r) (var4)).field_H;
                    stackIn_433_3 = stackIn_437_3;
                    stackIn_437_4 = ((r) (var4)).field_F;
                    stackIn_433_4 = stackIn_437_4;
                    stackIn_437_5 = ((r) (var4)).field_N;
                    stackIn_433_5 = stackIn_437_5;
                    if (((r) (var4)).field_C <= 0) {
                        statePc = 437;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 433: {
                    stackIn_435_0 = stackIn_433_0;
                    stackIn_435_1 = (dk) ((Object) stackIn_433_1);
                    stackIn_435_2 = stackIn_433_2;
                    stackIn_435_3 = stackIn_433_3;
                    stackIn_435_4 = stackIn_433_4;
                    stackIn_435_5 = stackIn_433_5;
                    statePc = 435;
                    continue stateLoop;
                }
                case 435: {
                    stackIn_438_0 = stackIn_435_0;
                    stackIn_438_1 = (dk) ((Object) stackIn_435_1);
                    stackIn_438_2 = stackIn_435_2;
                    stackIn_438_3 = stackIn_435_3;
                    stackIn_438_4 = stackIn_435_4;
                    stackIn_438_5 = stackIn_435_5;
                    stackIn_438_6 = 1;
                    statePc = 438;
                    continue stateLoop;
                }
                case 437: {
                    stackIn_438_0 = stackIn_437_0;
                    stackIn_438_1 = (dk) ((Object) stackIn_437_1);
                    stackIn_438_2 = stackIn_437_2;
                    stackIn_438_3 = stackIn_437_3;
                    stackIn_438_4 = stackIn_437_4;
                    stackIn_438_5 = stackIn_437_5;
                    stackIn_438_6 = 0;
                    statePc = 438;
                    continue stateLoop;
                }
                case 438: {
                    if (stackIn_438_0 == ((dk) (Object) stackIn_438_1).a(stackIn_438_2, stackIn_438_3, stackIn_438_4, stackIn_438_5, stackIn_438_6 != 0, ((r) (var4)).field_X, ((r) (var4)).field_E, true)) {
                        statePc = 441;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 441: {
                    var8 = 0;
                    statePc = 442;
                    continue stateLoop;
                }
                case 442: {
                    ((r) (var4)).field_c.field_h = (r) (var4);
                    var10++;
                    if (25 >= var10) {
                        statePc = 444;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    var8 = 1;
                    ((r) (var4)).field_Y = true;
                    ((r) (var4)).field_S = false;
                    statePc = 444;
                    continue stateLoop;
                }
                case 444: {
                    if (0 == var8) {
                        statePc = 402;
                    } else {
                        statePc = 445;
                    }
                    continue stateLoop;
                }
                case 445: {
                    stackIn_413_0 = null;
                    stackIn_446_0 = stackIn_413_0;
                    stackIn_413_1 = (dl) (var9_ref_dl);
                    stackIn_446_1 = stackIn_413_1;
                    if (var16 != 0) {
                        statePc = 413;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    if (stackIn_446_0 == stackIn_446_1) {
                        statePc = 460;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    if (var9_ref_dl.field_d) {
                        statePc = 452;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 450: {
                    stackIn_453_0 = 1;
                    statePc = 453;
                    continue stateLoop;
                }
                case 452: {
                    stackIn_453_0 = 0;
                    statePc = 453;
                    continue stateLoop;
                }
                case 453: {
                    stackIn_456_0 = stackIn_453_0;
                    stackIn_454_0 = stackIn_456_0;
                    if (((r) (var4)).field_c.field_d) {
                        statePc = 456;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    stackIn_457_0 = stackIn_454_0;
                    stackIn_457_1 = 1;
                    statePc = 457;
                    continue stateLoop;
                }
                case 456: {
                    stackIn_457_0 = stackIn_456_0;
                    stackIn_457_1 = 0;
                    statePc = 457;
                    continue stateLoop;
                }
                case 457: {
                    if (stackIn_457_0 != stackIn_457_1) {
                        statePc = 459;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 459: {
                    ((r) (var4)).field_Y = true;
                    ((r) (var4)).field_S = false;
                    statePc = 460;
                    continue stateLoop;
                }
                case 460: {
                    ((r) (var4)).field_r = null;
                    ((r) (var4)).field_w = 0;
                    statePc = 461;
                    continue stateLoop;
                }
                case 461: {
                    if ((double)((r) (var4)).field_jb >= (double)((r) (var4)).field_v * Math.random()) {
                        statePc = 651;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 462: {
                    if (!param2) {
                        statePc = 467;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 467: {
                    this.a(false, (r) (var4));
                    statePc = 468;
                    continue stateLoop;
                }
                case 468: {
                    ((r) (var4)).field_Y = true;
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 469;
                    }
                    continue stateLoop;
                }
                case 469: {
                    if (-8 == (((r) (var4)).field_t ^ -1)) {
                        statePc = 474;
                    } else {
                        statePc = 476;
                    }
                    continue stateLoop;
                }
                case 474: {
                    ((r) (var4)).field_Y = true;
                    statePc = 475;
                    continue stateLoop;
                }
                case 475: {
                    return;
                }
                case 476: {
                    if (-4 != (((r) (var4)).field_w ^ -1)) {
                        statePc = 477;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    if (null != var5) {
                        statePc = 481;
                    } else {
                        statePc = 478;
                    }
                    continue stateLoop;
                }
                case 478: {
                    ((r) (var4)).field_w = 0;
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    if (!param2) {
                        statePc = 486;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 486: {
                    ((r) (var4)).field_A = 0;
                    ((r) (var4)).field_d = ((r) (var4)).field_B;
                    ((r) (var4)).field_S = true;
                    var8 = 0;
                    var9 = 0;
                    statePc = 487;
                    continue stateLoop;
                }
                case 487: {
                    var8 = 1;
                    var10 = 0;
                    var11 = null;
                    statePc = 488;
                    continue stateLoop;
                }
                case 488: {
                    ((r) (var4)).field_X = ((r) (var5)).field_F - -(int)(9.0 * Math.random() - 4.0);
                    ((r) (var4)).field_n = ((r) (var5)).field_H + (int)(9.0 * Math.random() - 4.0);
                    ((r) (var4)).field_N = ((r) (var5)).field_E;
                    var11_ref = ((r) (var4)).field_c.field_s.a(-82, ((r) (var4)).field_n, ((r) (var4)).field_N, ((r) (var4)).field_X);
                    incrementValue$0 = var10;
                    var10++;
                    stackIn_489_0 = incrementValue$0 ^ -1;
                    stackIn_489_1 = -6;
                    statePc = 489;
                    continue stateLoop;
                }
                case 489: {
                    if (stackIn_489_0 <= stackIn_489_1) {
                        statePc = 495;
                    } else {
                        statePc = 490;
                    }
                    continue stateLoop;
                }
                case 490: {
                    if (null == var11_ref) {
                        statePc = 488;
                    } else {
                        statePc = 491;
                    }
                    continue stateLoop;
                }
                case 491: {
                    stackIn_496_0 = var11_ref.field_z;
                    stackIn_492_0 = stackIn_496_0;
                    if (var16 != 0) {
                        statePc = 496;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 492: {
                    if (!stackIn_492_0) {
                        statePc = 488;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    stackIn_496_0 = ((r) (var5)).field_k;
                    statePc = 496;
                    continue stateLoop;
                }
                case 496: {
                    if (!stackIn_496_0) {
                        statePc = 498;
                    } else {
                        statePc = 499;
                    }
                    continue stateLoop;
                }
                case 498: {
                    ((r) (var4)).field_X = ((r) (var5)).field_i - -(int)(-4.0 + Math.random() * 9.0);
                    ((r) (var4)).field_n = ((r) (var5)).field_gb - -(int)(9.0 * Math.random() - 4.0);
                    ((r) (var4)).field_N = ((r) (var5)).field_R;
                    statePc = 499;
                    continue stateLoop;
                }
                case 499: {
                    ((r) (var4)).field_c.field_h = null;
                    ((r) (var4)).field_r = null;
                    if (((r) (var4)).field_C != 0) {
                        statePc = 506;
                    } else {
                        statePc = 500;
                    }
                    continue stateLoop;
                }
                case 500: {
                    ((r) (var4)).field_r = this.field_h.a(((r) (var4)).field_n, ((r) (var4)).field_H, ((r) (var4)).field_F, ((r) (var4)).field_N, false, ((r) (var4)).field_X, ((r) (var4)).field_E, true);
                    if (((r) (var4)).field_r == null) {
                        statePc = 505;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 505: {
                    var8 = 0;
                    if (var16 == 0) {
                        statePc = 510;
                    } else {
                        statePc = 506;
                    }
                    continue stateLoop;
                }
                case 506: {
                    this.field_h.b((byte) 75);
                    ((r) (var4)).field_r = this.field_h.a(((r) (var4)).field_n, ((r) (var4)).field_N, ((r) (var4)).field_X, ((r) (var4)).field_E, ((r) (var4)).field_H, ((r) (var4)).field_F, true);
                    if (null != ((r) (var4)).field_r) {
                        statePc = 510;
                    } else {
                        statePc = 509;
                    }
                    continue stateLoop;
                }
                case 509: {
                    var8 = 0;
                    statePc = 510;
                    continue stateLoop;
                }
                case 510: {
                    ((r) (var4)).field_c.field_h = (r) (var4);
                    var9++;
                    if (var9 > 25) {
                        statePc = 513;
                    } else {
                        statePc = 517;
                    }
                    continue stateLoop;
                }
                case 513: {
                    ((r) (var4)).field_w = 1;
                    var8 = 1;
                    if (od.field_c[((r) (var4)).field_nb.field_g].field_m <= 1) {
                        statePc = 516;
                    } else {
                        statePc = 514;
                    }
                    continue stateLoop;
                }
                case 514: {
                    ((r) (var4)).field_Y = true;
                    statePc = 516;
                    continue stateLoop;
                }
                case 516: {
                    ((r) (var4)).field_X = ((r) (var4)).field_F;
                    ((r) (var4)).field_S = false;
                    ((r) (var4)).field_n = ((r) (var4)).field_H;
                    statePc = 517;
                    continue stateLoop;
                }
                case 517: {
                    if (var8 != 0) {
                        statePc = 520;
                    } else {
                        statePc = 518;
                    }
                    continue stateLoop;
                }
                case 518: {
                    stackIn_521_0 = 1;
                    statePc = 521;
                    continue stateLoop;
                }
                case 520: {
                    stackIn_521_0 = 0;
                    statePc = 521;
                    continue stateLoop;
                }
                case 521: {
                    if (stackIn_521_0 == 1) {
                        statePc = 487;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 522: {
                    stackIn_489_0 = 2;
                    stackIn_523_0 = stackIn_489_0;
                    stackIn_489_1 = ((r) (var4)).field_w;
                    stackIn_523_1 = stackIn_489_1;
                    if (var16 != 0) {
                        statePc = 489;
                    } else {
                        statePc = 523;
                    }
                    continue stateLoop;
                }
                case 523: {
                    if (stackIn_523_0 != stackIn_523_1) {
                        statePc = 529;
                    } else {
                        statePc = 524;
                    }
                    continue stateLoop;
                }
                case 524: {
                    if (var6 == 0) {
                        statePc = 529;
                    } else {
                        statePc = 527;
                    }
                    continue stateLoop;
                }
                case 527: {
                    ((r) (var4)).field_S = false;
                    ((r) (var4)).field_w = 0;
                    ((r) (var4)).field_X = ((r) (var4)).field_F;
                    ((r) (var4)).field_n = ((r) (var4)).field_H;
                    statePc = 529;
                    continue stateLoop;
                }
                case 529: {
                    var8 = (int)(10.0 * Math.random() + 10.0);
                    if (((r) (var4)).field_t != 9) {
                        statePc = 531;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 530: {
                    ((r) (var4)).field_ab = 0;
                    var8 = 2;
                    statePc = 531;
                    continue stateLoop;
                }
                case 531: {
                    if (3 != ((r) (var4)).field_w) {
                        statePc = 561;
                    } else {
                        statePc = 532;
                    }
                    continue stateLoop;
                }
                case 532: {
                    if ((var8 ^ -1) < (var7 ^ -1)) {
                        statePc = 538;
                    } else {
                        statePc = 535;
                    }
                    continue stateLoop;
                }
                case 535: {
                    if (((r) (var4)).field_ab <= 0) {
                        statePc = 561;
                    } else {
                        statePc = 538;
                    }
                    continue stateLoop;
                }
                case 538: {
                    if (var6 == 0) {
                        statePc = 561;
                    } else {
                        statePc = 541;
                    }
                    continue stateLoop;
                }
                case 541: {
                    if ((((r) (var4)).field_jb ^ -1) <= (((r) (var4)).c(false) ^ -1)) {
                        statePc = 547;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 544: {
                    if ((((r) (var4)).field_jb ^ -1) >= -11) {
                        statePc = 561;
                    } else {
                        statePc = 547;
                    }
                    continue stateLoop;
                }
                case 547: {
                    if (var5 == null) {
                        statePc = 559;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 550: {
                    ((r) (var4)).field_N = ((r) (var5)).field_E;
                    ((r) (var4)).field_n = ((r) (var5)).field_H;
                    ((r) (var4)).field_A = 0;
                    ((r) (var4)).field_d = 2;
                    ((r) (var4)).field_S = true;
                    ((r) (var4)).field_X = ((r) (var5)).field_F;
                    if (-9 >= (this.a((byte) -60, (r) (var5), (r) (var4)) ^ -1)) {
                        statePc = 561;
                    } else {
                        statePc = 553;
                    }
                    continue stateLoop;
                }
                case 553: {
                    if (null == ((r) (var4)).field_b) {
                        statePc = 561;
                    } else {
                        statePc = 556;
                    }
                    continue stateLoop;
                }
                case 556: {
                    ((r) (var4)).field_d = 4;
                    if (var16 == 0) {
                        statePc = 561;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 559: {
                    ((r) (var4)).field_w = 0;
                    statePc = 561;
                    continue stateLoop;
                }
                case 561: {
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 562;
                    }
                    continue stateLoop;
                }
                case 562: {
                    if (((r) (var4)).field_jb <= ((r) (var4)).c(false)) {
                        statePc = 583;
                    } else {
                        statePc = 565;
                    }
                    continue stateLoop;
                }
                case 565: {
                    if (var5 == null) {
                        statePc = 571;
                    } else {
                        statePc = 568;
                    }
                    continue stateLoop;
                }
                case 568: {
                    if (((r) (var5)).field_P > 0) {
                        statePc = 574;
                    } else {
                        statePc = 571;
                    }
                    continue stateLoop;
                }
                case 571: {
                    ((r) (var4)).field_w = 0;
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 574;
                    }
                    continue stateLoop;
                }
                case 574: {
                    ((r) (var4)).field_n = ((r) (var5)).field_H;
                    ((r) (var4)).field_X = ((r) (var5)).field_F;
                    ((r) (var4)).field_S = true;
                    ((r) (var4)).field_A = 0;
                    ((r) (var4)).field_d = 2;
                    ((r) (var4)).field_N = ((r) (var5)).field_E;
                    if (-9 >= (this.a((byte) -60, (r) (var5), (r) (var4)) ^ -1)) {
                        statePc = 651;
                    } else {
                        statePc = 577;
                    }
                    continue stateLoop;
                }
                case 577: {
                    if (null == ((r) (var4)).field_b) {
                        statePc = 651;
                    } else {
                        statePc = 580;
                    }
                    continue stateLoop;
                }
                case 580: {
                    ((r) (var4)).field_d = 4;
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 583: {
                    if (!param2) {
                        statePc = 588;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 588: {
                    if (((r) (var4)).field_t == 7) {
                        statePc = 591;
                    } else {
                        statePc = 593;
                    }
                    continue stateLoop;
                }
                case 591: {
                    ((r) (var4)).field_Y = true;
                    statePc = 592;
                    continue stateLoop;
                }
                case 592: {
                    return;
                }
                case 593: {
                    this.a(false, (r) (var4));
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 594;
                    }
                    continue stateLoop;
                }
                case 594: {
                    if (var6 == 0) {
                        statePc = 606;
                    } else {
                        statePc = 597;
                    }
                    continue stateLoop;
                }
                case 597: {
                    if ((((r) (var4)).field_jb ^ -1) <= (((r) (var4)).c(false) ^ -1)) {
                        statePc = 615;
                    } else {
                        statePc = 600;
                    }
                    continue stateLoop;
                }
                case 600: {
                    if (-1 > (((r) (var4)).field_ab ^ -1)) {
                        statePc = 615;
                    } else {
                        statePc = 603;
                    }
                    continue stateLoop;
                }
                case 603: {
                    if (((r) (var4)).field_jb > 10) {
                        statePc = 615;
                    } else {
                        statePc = 606;
                    }
                    continue stateLoop;
                }
                case 606: {
                    if (!param2) {
                        statePc = 611;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 611: {
                    if (7 != ((r) (var4)).field_t) {
                        statePc = 614;
                    } else {
                        statePc = 612;
                    }
                    continue stateLoop;
                }
                case 612: {
                    ((r) (var4)).field_Y = true;
                    statePc = 613;
                    continue stateLoop;
                }
                case 613: {
                    return;
                }
                case 614: {
                    this.a(false, (r) (var4));
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 615;
                    }
                    continue stateLoop;
                }
                case 615: {
                    if ((((r) (var4)).field_jb ^ -1) <= (((r) (var4)).c(false) ^ -1)) {
                        statePc = 630;
                    } else {
                        statePc = 618;
                    }
                    continue stateLoop;
                }
                case 618: {
                    if ((((r) (var4)).field_jb ^ -1) < -11) {
                        statePc = 630;
                    } else {
                        statePc = 621;
                    }
                    continue stateLoop;
                }
                case 621: {
                    if (!param2) {
                        statePc = 626;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 626: {
                    if (-8 != (((r) (var4)).field_t ^ -1)) {
                        statePc = 629;
                    } else {
                        statePc = 627;
                    }
                    continue stateLoop;
                }
                case 627: {
                    ((r) (var4)).field_Y = true;
                    statePc = 628;
                    continue stateLoop;
                }
                case 628: {
                    return;
                }
                case 629: {
                    this.a(false, (r) (var4));
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 630;
                    }
                    continue stateLoop;
                }
                case 630: {
                    if (null != var5) {
                        statePc = 636;
                    } else {
                        statePc = 633;
                    }
                    continue stateLoop;
                }
                case 633: {
                    ((r) (var4)).field_w = 0;
                    if (var16 == 0) {
                        statePc = 651;
                    } else {
                        statePc = 636;
                    }
                    continue stateLoop;
                }
                case 636: {
                    ((r) (var4)).field_d = 2;
                    ((r) (var4)).field_S = true;
                    ((r) (var4)).field_A = 0;
                    ((r) (var4)).field_N = ((r) (var5)).field_E;
                    ((r) (var4)).field_X = ((r) (var5)).field_F;
                    ((r) (var4)).field_n = ((r) (var5)).field_H;
                    if ((this.a((byte) -60, (r) (var5), (r) (var4)) ^ -1) <= -9) {
                        statePc = 651;
                    } else {
                        statePc = 639;
                    }
                    continue stateLoop;
                }
                case 639: {
                    if (((r) (var4)).field_b != null) {
                        statePc = 644;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 644: {
                    ((r) (var4)).field_d = 4;
                    statePc = 651;
                    continue stateLoop;
                }
                case 651: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(gi param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param1 == -51) {
                break L1;
              } else {
                this.a((Terraphoenix) null, false);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (-51 >= (var3_int ^ -1)) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (this.field_F[var3_int] == null) {
                        this.field_F[var3_int] = param0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3_int++;
                        if (var4 == 0) {
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
          L5: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("e.J(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -1) {
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
                        var2_int = 0;
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
                        if (this.field_C.length <= var2_int) {
                            statePc = 26;
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
                        if (var3 != 0) {
                            statePc = 26;
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
                        if (this.field_C[var2_int] == null) {
                            statePc = 23;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null != this.field_C[var2_int].field_Z) {
                            statePc = 23;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-1 <= (this.field_C[var2_int].field_P ^ -1)) {
                            statePc = 23;
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
                        if (this.field_h.a((byte) -93, this.field_q, this.field_C[var2_int])) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
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
                case 18: {
                    try {
                        this.field_C[var2_int].field_ib = false;
                        if (var3 == 0) {
                            statePc = 23;
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_C[var2_int].field_ib = true;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var2_int++;
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) runtimeException), "e.B(" + param0 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, ci param3, boolean param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int stackIn_175_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_216_0 = 0;
        RuntimeException stackIn_219_0 = null;
        StringBuilder stackIn_219_1 = null;
        RuntimeException stackIn_221_0 = null;
        StringBuilder stackIn_221_1 = null;
        RuntimeException stackIn_222_0 = null;
        StringBuilder stackIn_222_1 = null;
        String stackIn_222_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param5 == 28144) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.a(42, 90);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (param4) {
                        statePc = 73;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var7_int = param0;
                    var8 = param1;
                    var7_int = var7_int + param3.field_p;
                    var8 = var8 + param3.field_v;
                    var9 = 0;
                    var10 = param0 - -param3.field_p;
                    var11 = param3.field_v + param1;
                    var12 = param3.field_t;
                    var13 = param3.field_r;
                    var14 = 0;
                    if ((l.field_d ^ -1) >= (var8 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var15 = l.field_d + -var8;
                    var11 = var11 + var15;
                    var8 = l.field_d;
                    var9 = var9 + var13 * var15;
                    var12 = var12 - var15;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((var8 + var12 ^ -1) < (l.field_c ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var12 = var12 - (var12 + (var8 - l.field_c));
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (l.field_b > var7_int) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var15 = l.field_b + -var7_int;
                    var7_int = l.field_b;
                    var13 = var13 - var15;
                    var14 = var14 + var15;
                    var10 = var10 + var15;
                    var9 = var9 + var15;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var7_int - -var13 > l.field_f) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var15 = -l.field_f + (var7_int + var13);
                    var14 = var14 + var15;
                    var13 = var13 - var15;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (0 >= var13) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if ((var12 ^ -1) < -1) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    var16 = var10;
                    var17 = var11;
                    var18 = -(var13 >> -1702500478);
                    var13 = -(var13 & 3);
                    var8 = -var12;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if ((var8 ^ -1) <= -1) {
                        statePc = 72;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var20 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var7_int = var18;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var7_int >= 0) {
                        statePc = 57;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    incrementValue$0 = var9;
                    var9++;
                    var15 = param3.field_z[incrementValue$0];
                    stackIn_59_0 = var15 ^ -1;
                    stackIn_30_0 = stackIn_59_0;
                    stackIn_59_1 = -1;
                    stackIn_30_1 = stackIn_59_1;
                    if (var20 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 == stackIn_30_1) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    incrementValue$1 = var16;
                    var16++;
                    gd.field_a[incrementValue$1][var17] = param2 * 144 + var17;
                    if (var20 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var16++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    incrementValue$2 = var9;
                    var9++;
                    var15 = param3.field_z[incrementValue$2];
                    if (var15 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    incrementValue$3 = var16;
                    var16++;
                    gd.field_a[incrementValue$3][var17] = param2 * 144 + var17;
                    if (var20 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var16++;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    incrementValue$4 = var9;
                    var9++;
                    var15 = param3.field_z[incrementValue$4];
                    if (-1 == (var15 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    incrementValue$5 = var16;
                    var16++;
                    gd.field_a[incrementValue$5][var17] = 144 * param2 + var17;
                    if (var20 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var16++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    incrementValue$6 = var9;
                    var9++;
                    var15 = param3.field_z[incrementValue$6];
                    if (0 != var15) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var16++;
                    if (var20 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    incrementValue$7 = var16;
                    var16++;
                    gd.field_a[incrementValue$7][var17] = 144 * param2 + var17;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var7_int++;
                    if (var20 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var7_int = var13;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = var7_int ^ -1;
                    stackIn_59_1 = -1;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 <= stackIn_59_1) {
                        statePc = 70;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    incrementValue$8 = var9;
                    var9++;
                    var15 = param3.field_z[incrementValue$8];
                    stackIn_71_0 = 0;
                    stackIn_61_0 = stackIn_71_0;
                    stackIn_71_1 = var15;
                    stackIn_61_1 = stackIn_71_1;
                    if (var20 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 != stackIn_61_1) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var16++;
                    if (var20 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    incrementValue$9 = var16;
                    var16++;
                    gd.field_a[incrementValue$9][var17] = var17 - -(param2 * 144);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var7_int++;
                    if (var20 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var16 = var10;
                    stackIn_71_0 = var9;
                    stackIn_71_1 = var14;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var9 = stackIn_71_0 + stackIn_71_1;
                    var17++;
                    var8++;
                    if (var20 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var20 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var7_int = -16 + (param3.field_u + param2 * 144);
                    if (60 != param3.field_u) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var7_int = param2 * 144 + (param3.field_u + -12);
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var8 = param0;
                    var8 = var8 + param3.field_p;
                    var9 = param1;
                    var9 = var9 + param3.field_v;
                    var10 = 0;
                    var11 = param3.field_p + param0;
                    var12 = param3.field_v + param1;
                    var13 = param3.field_t;
                    var14 = param3.field_r;
                    var15 = 0;
                    if (var9 >= l.field_d) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var16 = l.field_d + -var9;
                    var9 = l.field_d;
                    var10 = var10 + var16 * var14;
                    var12 = var12 + var16;
                    var13 = var13 - var16;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (l.field_b <= var8) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var16 = -var8 + l.field_b;
                    var8 = l.field_b;
                    var10 = var10 + var16;
                    var15 = var15 + var16;
                    var11 = var11 + var16;
                    var14 = var14 - var16;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (var13 + var9 <= l.field_c) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var13 = var13 - (-l.field_c + var9 - -var13);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (var14 + var8 <= l.field_f) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var16 = var8 - -var14 + -l.field_f;
                    var14 = var14 - var16;
                    var15 = var15 + var16;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (-1 <= (var14 ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (var13 <= 0) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    return;
                }
                case 90: {
                    var17 = var11;
                    var18 = var12;
                    if (-113 == (param3.field_u ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (param3.field_u != 60) {
                        statePc = 130;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var19 = -(var14 >> 2094240962);
                    var14 = -(var14 & 3);
                    var9 = -var13;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (var9 >= 0) {
                        statePc = 129;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (var20 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var8 = var19;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (0 <= var8) {
                        statePc = 118;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    incrementValue$10 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$10];
                    stackIn_128_0 = var16 ^ -1;
                    stackIn_100_0 = stackIn_128_0;
                    stackIn_128_1 = -1;
                    stackIn_100_1 = stackIn_128_1;
                    if (var20 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 == stackIn_100_1) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    gd.field_a[var17][var18] = Math.abs(var17 - param0 + -param3.field_q) / 2 + var7_int + param1;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var17++;
                    incrementValue$11 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$11];
                    if ((var16 ^ -1) != -1) {
                        statePc = 108;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 108: {
                    gd.field_a[var17][var18] = Math.abs(-param3.field_q + (var17 + -param0)) / 2 + (var7_int + param1);
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    incrementValue$12 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$12];
                    var17++;
                    if ((var16 ^ -1) != -1) {
                        statePc = 112;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 112: {
                    gd.field_a[var17][var18] = param1 - -var7_int + Math.abs(var17 - (param0 - -param3.field_q)) / 2;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    incrementValue$13 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$13];
                    var17++;
                    if (var16 != 0) {
                        statePc = 116;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 116: {
                    gd.field_a[var17][var18] = Math.abs(-param0 + (var17 + -param3.field_q)) / 2 + param1 + var7_int;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var17++;
                    var8++;
                    if (var20 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var8 = var14;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (var8 >= 0) {
                        statePc = 127;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    incrementValue$14 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$14];
                    stackIn_128_0 = 0;
                    stackIn_121_0 = stackIn_128_0;
                    stackIn_128_1 = var16;
                    stackIn_121_1 = stackIn_128_1;
                    if (var20 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (stackIn_121_0 == stackIn_121_1) {
                        statePc = 126;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    gd.field_a[var17][var18] = Math.abs(-param0 + var17 + -param3.field_q) / 2 + (var7_int + param1);
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    var17++;
                    var8++;
                    if (var20 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var17 = var11;
                    stackIn_128_0 = var10;
                    stackIn_128_1 = var15;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    var10 = stackIn_128_0 + stackIn_128_1;
                    var18++;
                    var9++;
                    if (var20 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (var20 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if ((param0 ^ -1) != (var17 ^ -1)) {
                        statePc = 169;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var19 = -(var14 >> -732073726);
                    var14 = -(3 & var14);
                    var9 = -var13;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (-1 >= (var9 ^ -1)) {
                        statePc = 168;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var20 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var8 = var19;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (-1 >= (var8 ^ -1)) {
                        statePc = 156;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    incrementValue$15 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$15];
                    stackIn_158_0 = -1;
                    stackIn_139_0 = stackIn_158_0;
                    stackIn_158_1 = var16 ^ -1;
                    stackIn_139_1 = stackIn_158_1;
                    if (var20 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (stackIn_139_0 != stackIn_139_1) {
                        statePc = 143;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 143: {
                    gd.field_a[var17][var18] = var7_int + param1 + -((var17 - param0) / 2);
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    var17++;
                    incrementValue$16 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$16];
                    if (-1 != (var16 ^ -1)) {
                        statePc = 147;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 147: {
                    gd.field_a[var17][var18] = param1 + var7_int + -((var17 - param0) / 2);
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    var17++;
                    incrementValue$17 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$17];
                    if (0 == var16) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    gd.field_a[var17][var18] = var7_int + (param1 - (-param0 + var17) / 2);
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    var17++;
                    incrementValue$18 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$18];
                    if (var16 != 0) {
                        statePc = 154;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 154: {
                    gd.field_a[var17][var18] = var7_int + param1 + -((-param0 + var17) / 2);
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    var17++;
                    var8++;
                    if (var20 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var8 = var14;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    stackIn_158_0 = 0;
                    stackIn_158_1 = var8;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (stackIn_158_0 <= stackIn_158_1) {
                        statePc = 166;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    incrementValue$19 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$19];
                    stackIn_167_0 = -1;
                    stackIn_160_0 = stackIn_167_0;
                    stackIn_167_1 = var16 ^ -1;
                    stackIn_160_1 = stackIn_167_1;
                    if (var20 != 0) {
                        statePc = 167;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (stackIn_160_0 == stackIn_160_1) {
                        statePc = 165;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    gd.field_a[var17][var18] = -((-param0 + var17) / 2) + var7_int + param1;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var17++;
                    var8++;
                    if (var20 == 0) {
                        statePc = 157;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var17 = var11;
                    var18++;
                    stackIn_167_0 = var10;
                    stackIn_167_1 = var15;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var10 = stackIn_167_0 + stackIn_167_1;
                    var9++;
                    if (var20 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (var20 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var19 = -(var14 >> 1336811746);
                    var14 = -(3 & var14);
                    var9 = -var13;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (-1 >= (var9 ^ -1)) {
                        statePc = 223;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (var20 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var8 = var19;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (-1 >= (var8 ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    incrementValue$20 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$20];
                    stackIn_203_0 = var16;
                    stackIn_175_0 = stackIn_203_0;
                    if (var20 != 0) {
                        statePc = 203;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (stackIn_175_0 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    incrementValue$21 = var17;
                    var17++;
                    gd.field_a[incrementValue$21][var18] = param1 + (var7_int + -((64 + (-var17 - -param0)) / 2));
                    if (var20 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var17++;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    incrementValue$22 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$22];
                    if (-1 == (var16 ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    incrementValue$23 = var17;
                    var17++;
                    gd.field_a[incrementValue$23][var18] = -((64 + -var17 - -param0) / 2) + var7_int + param1;
                    if (var20 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var17++;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    incrementValue$24 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$24];
                    if ((var16 ^ -1) != -1) {
                        statePc = 193;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var17++;
                    if (var20 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    incrementValue$25 = var17;
                    var17++;
                    gd.field_a[incrementValue$25][var18] = param1 + var7_int - (param0 + -var17 - -64) / 2;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    incrementValue$26 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$26];
                    if (-1 == (var16 ^ -1)) {
                        statePc = 199;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    incrementValue$27 = var17;
                    var17++;
                    gd.field_a[incrementValue$27][var18] = -((64 + -var17 + param0) / 2) + (var7_int + param1);
                    if (var20 == 0) {
                        statePc = 201;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var17++;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    var8++;
                    if (var20 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    stackIn_203_0 = var14;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var8 = stackIn_203_0;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (var8 >= 0) {
                        statePc = 215;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    incrementValue$28 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$28];
                    stackIn_216_0 = var16;
                    stackIn_206_0 = stackIn_216_0;
                    if (var20 != 0) {
                        statePc = 216;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (stackIn_206_0 != 0) {
                        statePc = 212;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var17++;
                    if (var20 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    incrementValue$29 = var17;
                    var17++;
                    gd.field_a[incrementValue$29][var18] = -((param0 + -var17 + 64) / 2) + param1 + var7_int;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    var8++;
                    if (var20 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var18++;
                    var10 = var10 + var15;
                    stackIn_216_0 = var11;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    var17 = stackIn_216_0;
                    var9++;
                    if (var20 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, Terraphoenix param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        r dupTemp$4 = null;
        ga dupTemp$5 = null;
        ga dupTemp$6 = null;
        ga dupTemp$7 = null;
        ga dupTemp$8 = null;
        ga dupTemp$9 = null;
        ga dupTemp$10 = null;
        ga dupTemp$11 = null;
        ga dupTemp$12 = null;
        ga dupTemp$13 = null;
        ga dupTemp$14 = null;
        ga dupTemp$15 = null;
        int dupTemp$16 = 0;
        int dupTemp$17 = 0;
        int dupTemp$18 = 0;
        r stackIn_4_0 = null;
        ga stackIn_27_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_103_0 = null;
        hk stackIn_136_0 = null;
        hk stackIn_138_0 = null;
        hk stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        hk stackIn_147_0 = null;
        hk stackIn_149_0 = null;
        hk stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        r stackIn_209_0 = null;
        ga stackIn_210_0 = null;
        hk stackIn_266_0 = null;
        hk stackIn_268_0 = null;
        hk stackIn_270_0 = null;
        hk stackIn_271_0 = null;
        int stackIn_271_1 = 0;
        hk stackIn_289_0 = null;
        hk stackIn_291_0 = null;
        hk stackIn_293_0 = null;
        hk stackIn_294_0 = null;
        int stackIn_294_1 = 0;
        hk stackIn_301_0 = null;
        hk stackIn_303_0 = null;
        hk stackIn_305_0 = null;
        hk stackIn_306_0 = null;
        int stackIn_306_1 = 0;
        int stackIn_382_0 = 0;
        int stackIn_382_1 = 0;
        int stackIn_455_0 = 0;
        int stackIn_476_0 = 0;
        int stackIn_523_0 = 0;
        int stackIn_523_1 = 0;
        r stackIn_528_0 = null;
        r stackIn_548_0 = null;
        RuntimeException stackIn_597_0 = null;
        StringBuilder stackIn_597_1 = null;
        RuntimeException stackIn_599_0 = null;
        StringBuilder stackIn_599_1 = null;
        RuntimeException stackIn_600_0 = null;
        StringBuilder stackIn_600_1 = null;
        String stackIn_600_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        oh var11_ref_oh = null;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    ja.field_i = 7;
                    rk.field_c = 32;
                    wb.field_g = 20;
                    hh.field_m.a();
                    l.a();
                    k.field_f.a(0);
                    var4 = -88 % ((-66 - param0) / 59);
                    var3_int = 0;
                    var5 = 0;
                    var6 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_C.length <= var6) {
                        statePc = 24;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_209_0 = this.field_C[var6];
                    stackIn_4_0 = stackIn_209_0;
                    if (var12 != 0) {
                        statePc = 209;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 != null) {
                        statePc = 8;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (-1 > (this.field_C[var6].field_P ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (null == this.field_C[var6].field_c) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_C[var6].field_c.field_h = null;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (null != this.field_C[var6].field_Z) {
                        statePc = 21;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-1 == (this.field_C[var6].field_C ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var3_int++;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var6 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if ((var6 ^ -1) <= (param1.field_nb.length ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_210_0 = param1.field_nb[var6];
                    stackIn_27_0 = stackIn_210_0;
                    if (var12 != 0) {
                        statePc = 210;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 == null) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_e.field_e = this.field_e.field_e + 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var3_int <= 0) {
                        statePc = 40;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var5 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (!this.field_r) {
                        statePc = 217;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.field_f = 2;
                    if (!this.field_r) {
                        statePc = 104;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.field_e.field_i = -1;
                    var6 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var6 >= this.field_C.length) {
                        statePc = 102;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_103_0 = this;
                    stackIn_46_0 = stackIn_103_0;
                    if (var12 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (((e) (this)).field_C[var6] != null) {
                        statePc = 51;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (this.field_C[var6].field_Z == null) {
                        statePc = 65;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (param1.field_Bb == 12) {
                        statePc = 101;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (null != this.field_C[var6].field_Z.field_b) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (this.field_C[var6].field_Z.field_A == null) {
                        statePc = 101;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                    if (var12 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if ((this.field_C[var6].field_t ^ -1) == -1) {
                        statePc = 70;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.field_e.field_g = this.field_e.field_g + 1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if ((this.field_C[var6].field_t ^ -1) != -2) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if ((this.field_C[var6].field_t ^ -1) != -3) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (-4 != (this.field_C[var6].field_t ^ -1)) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    this.field_e.field_l.field_a[17] = this.field_e.field_l.field_a[17] + 1;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (4 != this.field_C[var6].field_t) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_e.field_b = this.field_e.field_b + 1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if ((this.field_C[var6].field_t ^ -1) == -6) {
                        statePc = 86;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 86: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (6 != this.field_C[var6].field_t) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (9 == this.field_C[var6].field_t) {
                        statePc = 93;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 93: {
                    this.field_e.field_m = this.field_e.field_m + 1;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (this.field_C[var6].field_nb != null) {
                        statePc = 97;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 97: {
                    dupTemp$0 = this.field_C[var6].field_nb.field_g;
                    this.field_e.field_l.field_a[dupTemp$0] = this.field_e.field_l.field_a[dupTemp$0] + 1;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (this.field_C[var6].field_b == null) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    dupTemp$1 = this.field_C[var6].field_b.field_g;
                    this.field_e.field_l.field_a[dupTemp$1] = this.field_e.field_l.field_a[dupTemp$1] + this.field_C[var6].field_b.field_d;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackIn_103_0 = this;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    ((e) (this)).field_i = 6;
                    if (var12 == 0) {
                        statePc = 379;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    this.field_i = 5;
                    if (-2 == (param1.field_Bb ^ -1)) {
                        statePc = 109;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 109: {
                    this.field_e.field_i = -2;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if ((param1.field_Bb ^ -1) == -3) {
                        statePc = 113;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 113: {
                    this.field_e.field_i = -2;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if ((param1.field_Bb ^ -1) == -4) {
                        statePc = 117;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 117: {
                    this.field_e.field_i = -2;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (-5 == (param1.field_Bb ^ -1)) {
                        statePc = 121;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 121: {
                    this.field_e.field_i = -1;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (-6 != (param1.field_Bb ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_e.field_i = -2;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if ((param1.field_Bb ^ -1) != -7) {
                        statePc = 128;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_e.field_i = -1;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if ((param1.field_Bb ^ -1) == -8) {
                        statePc = 131;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 131: {
                    this.field_e.field_i = -2;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (-9 == (param1.field_Bb ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 135: {
                    stackIn_138_0 = this.field_e;
                    stackIn_136_0 = stackIn_138_0;
                    if (-2 != (param1.field_vb ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    stackIn_139_0 = (hk) ((Object) stackIn_136_0);
                    stackIn_139_1 = -3;
                    statePc = 139;
                    continue stateLoop;
                }
                case 138: {
                    stackIn_139_0 = (hk) ((Object) stackIn_138_0);
                    stackIn_139_1 = -1;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    stackIn_139_0.field_i = stackIn_139_1;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (9 != param1.field_Bb) {
                        statePc = 143;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    this.field_e.field_i = -2;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (10 == param1.field_Bb) {
                        statePc = 146;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 146: {
                    stackIn_149_0 = this.field_e;
                    stackIn_147_0 = stackIn_149_0;
                    if (param1.field_vb != 1) {
                        statePc = 149;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackIn_150_0 = (hk) ((Object) stackIn_147_0);
                    stackIn_150_1 = -1;
                    statePc = 150;
                    continue stateLoop;
                }
                case 149: {
                    stackIn_150_0 = (hk) ((Object) stackIn_149_0);
                    stackIn_150_1 = -3;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    stackIn_150_0.field_i = stackIn_150_1;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if ((param1.field_Bb ^ -1) == -12) {
                        statePc = 154;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 154: {
                    this.field_e.field_i = -4;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (12 == param1.field_Bb) {
                        statePc = 158;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 158: {
                    this.field_e.field_i = -3;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if ((param1.field_Bb ^ -1) != -14) {
                        statePc = 162;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    this.field_e.field_i = -5;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (!param1.field_db) {
                        statePc = 165;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    this.field_e.field_i = -6;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var6 = 0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (var6 >= this.field_C.length) {
                        statePc = 379;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (null != this.field_C[var6]) {
                        statePc = 170;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (null != this.field_C[var6].field_Z) {
                        statePc = 203;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (-1 > (this.field_C[var6].field_P ^ -1)) {
                        statePc = 216;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (this.field_C[var6].field_t != 0) {
                        statePc = 179;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    this.field_e.field_g = this.field_e.field_g + 1;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if (this.field_C[var6].field_t != 1) {
                        statePc = 182;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if (-3 != (this.field_C[var6].field_t ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (this.field_C[var6].field_t == 3) {
                        statePc = 188;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 188: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    this.field_e.field_l.field_a[17] = this.field_e.field_l.field_a[17] + 1;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (this.field_C[var6].field_t == 4) {
                        statePc = 192;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 192: {
                    this.field_e.field_b = this.field_e.field_b + 1;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if ((this.field_C[var6].field_t ^ -1) != -6) {
                        statePc = 196;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (6 != this.field_C[var6].field_t) {
                        statePc = 199;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (this.field_C[var6].field_t == 9) {
                        statePc = 202;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 202: {
                    this.field_e.field_m = this.field_e.field_m + 1;
                    if (var12 == 0) {
                        statePc = 216;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if (-13 != (param1.field_Bb ^ -1)) {
                        statePc = 208;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 208: {
                    stackIn_209_0 = this.field_C[var6];
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    stackIn_210_0 = stackIn_209_0.field_Z;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    if (stackIn_210_0.field_b == null) {
                        statePc = 213;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (null == this.field_C[var6].field_Z.field_A) {
                        statePc = 216;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (param1.field_db) {
                        statePc = 246;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if ((param1.field_Bb ^ -1) != -3) {
                        statePc = 223;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    mh.a((byte) 117, 9, 246);
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (param1.field_Bb == 6) {
                        statePc = 226;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 226: {
                    mh.a((byte) 123, 10, 245);
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if (-11 != (param1.field_Bb ^ -1)) {
                        statePc = 230;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    mh.a((byte) 113, 11, 244);
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if ((param1.field_Bb ^ -1) != -14) {
                        statePc = 246;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    mh.a((byte) 127, 12, 243);
                    if (param1.field_fb) {
                        statePc = 236;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 236: {
                    mh.a((byte) 119, 13, 242);
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    if (!param1.field_ob) {
                        statePc = 243;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if ((fa.field_a ^ -1) != -2) {
                        statePc = 243;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    mh.a((byte) 117, 14, 241);
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    if ((fa.field_a ^ -1) != -3) {
                        statePc = 246;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    mh.a((byte) 121, 15, 240);
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    if (!param1.field_db) {
                        statePc = 253;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    param1.field_M = param1.field_M + 1;
                    param1.field_Fb = param1.field_Fb + 1;
                    qc.field_c = qc.field_c + 1;
                    if (mb.b(0, -64)) {
                        statePc = 252;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 252: {
                    mh.a((byte) 120, 16, 239);
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    this.field_f = 1;
                    this.field_i = 6;
                    if (13 == param1.field_Bb) {
                        statePc = 256;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 256: {
                    this.field_i = 4;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if ((param1.field_Bb ^ -1) == -2) {
                        statePc = 260;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 260: {
                    this.field_e.field_i = 1;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if (2 != param1.field_Bb) {
                        statePc = 264;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    this.field_e.field_i = 2;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    if (3 != param1.field_Bb) {
                        statePc = 272;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    stackIn_270_0 = this.field_e;
                    stackIn_266_0 = stackIn_270_0;
                    if (-2 == (param1.field_ub ^ -1)) {
                        statePc = 270;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    stackIn_268_0 = (hk) ((Object) stackIn_266_0);
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    stackIn_271_0 = (hk) ((Object) stackIn_268_0);
                    stackIn_271_1 = 4;
                    statePc = 271;
                    continue stateLoop;
                }
                case 270: {
                    stackIn_271_0 = (hk) ((Object) stackIn_270_0);
                    stackIn_271_1 = 3;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    stackIn_271_0.field_i = stackIn_271_1;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    if (4 == param1.field_Bb) {
                        statePc = 275;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 275: {
                    this.field_e.field_i = 5;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if (5 == param1.field_Bb) {
                        statePc = 279;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 279: {
                    this.field_e.field_i = 2;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    if (6 != param1.field_Bb) {
                        statePc = 283;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    this.field_e.field_i = 6;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    if (param1.field_Bb == 7) {
                        statePc = 286;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 286: {
                    this.field_e.field_i = 2;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    if ((param1.field_Bb ^ -1) != -9) {
                        statePc = 295;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    stackIn_293_0 = this.field_e;
                    stackIn_289_0 = stackIn_293_0;
                    if (1 != param1.field_vb) {
                        statePc = 293;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    stackIn_291_0 = (hk) ((Object) stackIn_289_0);
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    stackIn_294_0 = (hk) ((Object) stackIn_291_0);
                    stackIn_294_1 = 7;
                    statePc = 294;
                    continue stateLoop;
                }
                case 293: {
                    stackIn_294_0 = (hk) ((Object) stackIn_293_0);
                    stackIn_294_1 = 8;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    stackIn_294_0.field_i = stackIn_294_1;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    if (9 == param1.field_Bb) {
                        statePc = 298;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 298: {
                    this.field_e.field_i = 2;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    if (10 != param1.field_Bb) {
                        statePc = 307;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    stackIn_305_0 = this.field_e;
                    stackIn_301_0 = stackIn_305_0;
                    if (param1.field_vb == 1) {
                        statePc = 305;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    stackIn_303_0 = (hk) ((Object) stackIn_301_0);
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    stackIn_306_0 = (hk) ((Object) stackIn_303_0);
                    stackIn_306_1 = 7;
                    statePc = 306;
                    continue stateLoop;
                }
                case 305: {
                    stackIn_306_0 = (hk) ((Object) stackIn_305_0);
                    stackIn_306_1 = 8;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    stackIn_306_0.field_i = stackIn_306_1;
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    if ((param1.field_Bb ^ -1) != -12) {
                        statePc = 310;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    this.field_e.field_i = 9;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    if (param1.field_Bb != 12) {
                        statePc = 313;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    this.field_e.field_i = 10;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if (-14 != (param1.field_Bb ^ -1)) {
                        statePc = 316;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    this.field_e.field_i = 11;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if (!param1.field_db) {
                        statePc = 319;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    this.field_e.field_i = 12;
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    var6 = 0;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    if (this.field_C.length <= var6) {
                        statePc = 379;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    if (null != this.field_C[var6]) {
                        statePc = 324;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if (this.field_C[var6].field_Z == null) {
                        statePc = 337;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if (param1.field_Bb != 12) {
                        statePc = 330;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 330: {
                    if (this.field_C[var6].field_Z.field_b == null) {
                        statePc = 333;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    if (this.field_C[var6].field_Z.field_A == null) {
                        statePc = 378;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                    if (var12 == 0) {
                        statePc = 378;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    if (this.field_C[var6].field_t == 0) {
                        statePc = 342;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 342: {
                    this.field_e.field_g = this.field_e.field_g + 1;
                    statePc = 343;
                    continue stateLoop;
                }
                case 343: {
                    if (-2 == (this.field_C[var6].field_t ^ -1)) {
                        statePc = 346;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 346: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    if (2 == this.field_C[var6].field_t) {
                        statePc = 350;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 350: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if (this.field_C[var6].field_t != 3) {
                        statePc = 354;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    this.field_e.field_l.field_a[17] = this.field_e.field_l.field_a[17] + 1;
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    if (-5 != (this.field_C[var6].field_t ^ -1)) {
                        statePc = 357;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    this.field_e.field_b = this.field_e.field_b + 1;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    if ((this.field_C[var6].field_t ^ -1) != -6) {
                        statePc = 360;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 360;
                    continue stateLoop;
                }
                case 360: {
                    if (6 == this.field_C[var6].field_t) {
                        statePc = 363;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 363: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    if ((this.field_C[var6].field_t ^ -1) == -10) {
                        statePc = 367;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 367: {
                    this.field_e.field_m = this.field_e.field_m + 1;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    if (this.field_C[var6].field_nb == null) {
                        statePc = 374;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    if (19 <= this.field_C[var6].field_nb.field_g) {
                        statePc = 374;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    dupTemp$2 = this.field_C[var6].field_nb.field_g;
                    this.field_e.field_l.field_a[dupTemp$2] = this.field_e.field_l.field_a[dupTemp$2] + 1;
                    statePc = 374;
                    continue stateLoop;
                }
                case 374: {
                    if (null != this.field_C[var6].field_b) {
                        statePc = 377;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 377: {
                    dupTemp$3 = this.field_C[var6].field_b.field_g;
                    this.field_e.field_l.field_a[dupTemp$3] = this.field_e.field_l.field_a[dupTemp$3] + this.field_C[var6].field_b.field_d;
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 320;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    var7 = 0;
                    var8 = 0;
                    var9 = 0;
                    var6 = 0;
                    statePc = 380;
                    continue stateLoop;
                }
                case 380: {
                    if ((var6 ^ -1) <= (ak.field_q ^ -1)) {
                        statePc = 522;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    stackIn_523_0 = var6 ^ -1;
                    stackIn_382_0 = stackIn_523_0;
                    stackIn_523_1 = -13;
                    stackIn_382_1 = stackIn_523_1;
                    if (var12 != 0) {
                        statePc = 523;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    if (stackIn_382_0 <= stackIn_382_1) {
                        statePc = 387;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    param1.field_nb[var6] = null;
                    statePc = 387;
                    continue stateLoop;
                }
                case 387: {
                    if (this.field_C[var6] == null) {
                        statePc = 521;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 388: {
                    if (null == this.field_C[var6].field_Z) {
                        statePc = 405;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if (0 < this.field_C[var6].field_P) {
                        statePc = 405;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    if (this.field_C[var6].field_T <= 0) {
                        statePc = 405;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    if (-2 == (this.field_f ^ -1)) {
                        statePc = 403;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    if (!this.field_r) {
                        statePc = 405;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    dupTemp$4 = this.field_C[var6];
                    dupTemp$4.field_P = dupTemp$4.field_P + this.field_C[var6].field_T;
                    this.field_C[var6].field_T = 0;
                    this.field_e.field_f = this.field_e.field_f + 1;
                    statePc = 405;
                    continue stateLoop;
                }
                case 405: {
                    if ((this.field_C[var6].field_P ^ -1) >= -1) {
                        statePc = 502;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    if (null != this.field_C[var6].field_Z) {
                        statePc = 411;
                    } else {
                        statePc = 521;
                    }
                    continue stateLoop;
                }
                case 411: {
                    param1.field_nb[var6] = this.field_C[var6].field_Z;
                    param1.field_nb[var6].field_b = this.field_C[var6].field_nb;
                    param1.field_nb[var6].field_A = this.field_C[var6].field_eb;
                    if (null != param1.field_nb[var6].field_b) {
                        statePc = 414;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 414: {
                    var10 = param1.field_nb[var6].field_b.field_g;
                    if (0 == var10) {
                        statePc = 424;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    if (3 == var10) {
                        statePc = 424;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    if ((var10 ^ -1) == -9) {
                        statePc = 424;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    if (-13 != (var10 ^ -1)) {
                        statePc = 425;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    var11_ref_oh = param1.field_nb[var6].field_A;
                    param1.field_nb[var6].field_A = param1.field_nb[var6].field_b;
                    param1.field_nb[var6].field_b = var11_ref_oh;
                    statePc = 425;
                    continue stateLoop;
                }
                case 425: {
                    param1.field_nb[var6].field_i = this.field_C[var6].field_b;
                    if ((this.field_C[var6].field_Z.field_e ^ -1) >= -1) {
                        statePc = 432;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 426: {
                    if (this.field_C[var6].field_Z.field_h == 0) {
                        statePc = 431;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 431: {
                    this.field_C[var6].field_Z.field_h = 1;
                    statePc = 432;
                    continue stateLoop;
                }
                case 432: {
                    if (-3 != (this.field_C[var6].field_Z.field_h ^ -1)) {
                        statePc = 435;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 433: {
                    var8++;
                    statePc = 435;
                    continue stateLoop;
                }
                case 435: {
                    if ((this.field_C[var6].field_Z.field_h ^ -1) == -4) {
                        statePc = 438;
                    } else {
                        statePc = 439;
                    }
                    continue stateLoop;
                }
                case 438: {
                    var9++;
                    statePc = 439;
                    continue stateLoop;
                }
                case 439: {
                    if (-2 == (this.field_C[var6].field_Z.field_h ^ -1)) {
                        statePc = 442;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 442: {
                    var7++;
                    statePc = 443;
                    continue stateLoop;
                }
                case 443: {
                    this.field_C[var6].field_Z.d((byte) 126);
                    var10 = -this.field_C[var6].field_Z.field_v + this.field_C[var6].field_Z.field_x;
                    if (-1 > (var10 ^ -1)) {
                        statePc = 446;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 446: {
                    if (-21 <= (var10 ^ -1)) {
                        statePc = 448;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    var10 = 20;
                    statePc = 448;
                    continue stateLoop;
                }
                case 448: {
                    dupTemp$5 = this.field_C[var6].field_Z;
                    dupTemp$5.field_v = (int)((double)dupTemp$5.field_v + (3.0 * Math.random() * (double)var10 / 4.0 + (double)(var10 / 4)));
                    if (this.field_C[var6].field_Z.field_v > 100) {
                        statePc = 451;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 451: {
                    this.field_C[var6].field_Z.field_v = 100;
                    statePc = 452;
                    continue stateLoop;
                }
                case 452: {
                    var11 = 0;
                    statePc = 453;
                    continue stateLoop;
                }
                case 453: {
                    if (var11 >= this.field_C[var6].field_Z.field_h) {
                        statePc = 475;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    stackIn_476_0 = (100.0 * Math.random() < (double)this.field_C[var6].field_Z.field_t ? -1 : (100.0 * Math.random() == (double)this.field_C[var6].field_Z.field_t ? 0 : 1));
                    stackIn_455_0 = stackIn_476_0;
                    if (var12 != 0) {
                        statePc = 476;
                    } else {
                        statePc = 455;
                    }
                    continue stateLoop;
                }
                case 455: {
                    if (stackIn_455_0 > 0) {
                        statePc = 459;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 459: {
                    dupTemp$6 = this.field_C[var6].field_Z;
                    dupTemp$6.field_t = dupTemp$6.field_t + 1;
                    statePc = 460;
                    continue stateLoop;
                }
                case 460: {
                    if (100.0 * Math.random() > (double)this.field_C[var6].field_Z.field_w) {
                        statePc = 463;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 463: {
                    dupTemp$7 = this.field_C[var6].field_Z;
                    dupTemp$7.field_w = dupTemp$7.field_w + 1;
                    statePc = 464;
                    continue stateLoop;
                }
                case 464: {
                    if (Math.random() * 100.0 <= (double)this.field_C[var6].field_Z.field_v) {
                        statePc = 467;
                    } else {
                        statePc = 465;
                    }
                    continue stateLoop;
                }
                case 465: {
                    dupTemp$8 = this.field_C[var6].field_Z;
                    dupTemp$8.field_v = dupTemp$8.field_v + 1;
                    statePc = 467;
                    continue stateLoop;
                }
                case 467: {
                    if (Math.random() * 100.0 > (double)this.field_C[var6].field_Z.field_B) {
                        statePc = 470;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 470: {
                    dupTemp$9 = this.field_C[var6].field_Z;
                    dupTemp$9.field_B = dupTemp$9.field_B + 1;
                    statePc = 471;
                    continue stateLoop;
                }
                case 471: {
                    if (Math.random() * 100.0 <= (double)this.field_C[var6].field_Z.field_q) {
                        statePc = 474;
                    } else {
                        statePc = 472;
                    }
                    continue stateLoop;
                }
                case 472: {
                    dupTemp$10 = this.field_C[var6].field_Z;
                    dupTemp$10.field_q = dupTemp$10.field_q + 1;
                    statePc = 474;
                    continue stateLoop;
                }
                case 474: {
                    var11++;
                    if (var12 == 0) {
                        statePc = 453;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 475: {
                    stackIn_476_0 = 0;
                    statePc = 476;
                    continue stateLoop;
                }
                case 476: {
                    if (stackIn_476_0 < this.field_C[var6].field_Z.field_h) {
                        statePc = 479;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 479: {
                    if ((33 * this.field_C[var6].field_Z.field_h - -1 ^ -1) >= (this.field_C[var6].field_Z.field_t ^ -1)) {
                        statePc = 482;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    dupTemp$11 = this.field_C[var6].field_Z;
                    dupTemp$11.field_t = dupTemp$11.field_t + 1;
                    statePc = 482;
                    continue stateLoop;
                }
                case 482: {
                    if (33 * this.field_C[var6].field_Z.field_h - -1 <= this.field_C[var6].field_Z.field_w) {
                        statePc = 485;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    dupTemp$12 = this.field_C[var6].field_Z;
                    dupTemp$12.field_w = dupTemp$12.field_w + 1;
                    statePc = 485;
                    continue stateLoop;
                }
                case 485: {
                    if ((33 * this.field_C[var6].field_Z.field_h + 1 ^ -1) >= (this.field_C[var6].field_Z.field_v ^ -1)) {
                        statePc = 488;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    dupTemp$13 = this.field_C[var6].field_Z;
                    dupTemp$13.field_v = dupTemp$13.field_v + 1;
                    statePc = 488;
                    continue stateLoop;
                }
                case 488: {
                    if ((this.field_C[var6].field_Z.field_h * 33 - -1 ^ -1) >= (this.field_C[var6].field_Z.field_B ^ -1)) {
                        statePc = 491;
                    } else {
                        statePc = 489;
                    }
                    continue stateLoop;
                }
                case 489: {
                    dupTemp$14 = this.field_C[var6].field_Z;
                    dupTemp$14.field_B = dupTemp$14.field_B + 1;
                    statePc = 491;
                    continue stateLoop;
                }
                case 491: {
                    if ((this.field_C[var6].field_Z.field_h * 33 - -1 ^ -1) >= (this.field_C[var6].field_Z.field_q ^ -1)) {
                        statePc = 494;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 492: {
                    dupTemp$15 = this.field_C[var6].field_Z;
                    dupTemp$15.field_q = dupTemp$15.field_q + 1;
                    statePc = 494;
                    continue stateLoop;
                }
                case 494: {
                    if ((this.field_C[var6].field_Z.field_B ^ -1) <= -91) {
                        statePc = 497;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 497: {
                    mh.a((byte) 121, 0, 255);
                    statePc = 498;
                    continue stateLoop;
                }
                case 498: {
                    if ((this.field_C[var6].field_Z.field_t ^ -1) > -91) {
                        statePc = 501;
                    } else {
                        statePc = 499;
                    }
                    continue stateLoop;
                }
                case 499: {
                    mh.a((byte) 125, 1, 254);
                    statePc = 501;
                    continue stateLoop;
                }
                case 501: {
                    if (var12 == 0) {
                        statePc = 521;
                    } else {
                        statePc = 502;
                    }
                    continue stateLoop;
                }
                case 502: {
                    if (this.field_C[var6].field_Z != null) {
                        statePc = 507;
                    } else {
                        statePc = 508;
                    }
                    continue stateLoop;
                }
                case 507: {
                    this.field_e.field_k = this.field_e.field_k + 1;
                    statePc = 508;
                    continue stateLoop;
                }
                case 508: {
                    if (-2 == (this.field_f ^ -1)) {
                        statePc = 511;
                    } else {
                        statePc = 521;
                    }
                    continue stateLoop;
                }
                case 511: {
                    if (null != this.field_C[var6].field_nb) {
                        statePc = 514;
                    } else {
                        statePc = 515;
                    }
                    continue stateLoop;
                }
                case 514: {
                    dupTemp$16 = this.field_C[var6].field_nb.field_g;
                    this.field_e.field_l.field_a[dupTemp$16] = this.field_e.field_l.field_a[dupTemp$16] + 1;
                    statePc = 515;
                    continue stateLoop;
                }
                case 515: {
                    if (null == this.field_C[var6].field_eb) {
                        statePc = 518;
                    } else {
                        statePc = 516;
                    }
                    continue stateLoop;
                }
                case 516: {
                    dupTemp$17 = this.field_C[var6].field_eb.field_g;
                    this.field_e.field_l.field_a[dupTemp$17] = this.field_e.field_l.field_a[dupTemp$17] + 1;
                    statePc = 518;
                    continue stateLoop;
                }
                case 518: {
                    if (null == this.field_C[var6].field_b) {
                        statePc = 521;
                    } else {
                        statePc = 519;
                    }
                    continue stateLoop;
                }
                case 519: {
                    dupTemp$18 = this.field_C[var6].field_b.field_g;
                    this.field_e.field_l.field_a[dupTemp$18] = this.field_e.field_l.field_a[dupTemp$18] + this.field_C[var6].field_b.field_d;
                    statePc = 521;
                    continue stateLoop;
                }
                case 521: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 380;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 522: {
                    stackIn_523_0 = (var8 + 1) * 2 ^ -1;
                    stackIn_523_1 = var7 ^ -1;
                    statePc = 523;
                    continue stateLoop;
                }
                case 523: {
                    if (stackIn_523_0 > stackIn_523_1) {
                        statePc = 525;
                    } else {
                        statePc = 549;
                    }
                    continue stateLoop;
                }
                case 525: {
                    var10 = 0;
                    var6 = 0;
                    statePc = 526;
                    continue stateLoop;
                }
                case 526: {
                    if (var6 >= ak.field_q) {
                        statePc = 547;
                    } else {
                        statePc = 527;
                    }
                    continue stateLoop;
                }
                case 527: {
                    stackIn_548_0 = this.field_C[var6];
                    stackIn_528_0 = stackIn_548_0;
                    if (var12 != 0) {
                        statePc = 548;
                    } else {
                        statePc = 528;
                    }
                    continue stateLoop;
                }
                case 528: {
                    if (stackIn_528_0 == null) {
                        statePc = 546;
                    } else {
                        statePc = 531;
                    }
                    continue stateLoop;
                }
                case 531: {
                    if (null == this.field_C[var6].field_Z) {
                        statePc = 546;
                    } else {
                        statePc = 534;
                    }
                    continue stateLoop;
                }
                case 534: {
                    if (this.field_C[var6].field_Z.field_h != 1) {
                        statePc = 546;
                    } else {
                        statePc = 537;
                    }
                    continue stateLoop;
                }
                case 537: {
                    if (var10 == 0) {
                        statePc = 545;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 540: {
                    if ((this.field_C[var6].field_Z.field_e ^ -1) < (this.field_C[var10].field_Z.field_e ^ -1)) {
                        statePc = 545;
                    } else {
                        statePc = 546;
                    }
                    continue stateLoop;
                }
                case 545: {
                    var10 = var6;
                    statePc = 546;
                    continue stateLoop;
                }
                case 546: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 526;
                    } else {
                        statePc = 547;
                    }
                    continue stateLoop;
                }
                case 547: {
                    var8++;
                    var7--;
                    stackIn_548_0 = this.field_C[var10];
                    statePc = 548;
                    continue stateLoop;
                }
                case 548: {
                    stackIn_548_0.field_Z.field_h = 2;
                    statePc = 549;
                    continue stateLoop;
                }
                case 549: {
                    if (var8 <= 2 * var9 - -2) {
                        statePc = 575;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 550: {
                    if (-1 != (var9 ^ -1)) {
                        statePc = 575;
                    } else {
                        statePc = 553;
                    }
                    continue stateLoop;
                }
                case 553: {
                    var10 = 0;
                    var6 = 0;
                    statePc = 554;
                    continue stateLoop;
                }
                case 554: {
                    if ((var6 ^ -1) <= (ak.field_q ^ -1)) {
                        statePc = 573;
                    } else {
                        statePc = 555;
                    }
                    continue stateLoop;
                }
                case 555: {
                    if (var12 != 0) {
                        statePc = 574;
                    } else {
                        statePc = 556;
                    }
                    continue stateLoop;
                }
                case 556: {
                    if (null == this.field_C[var6]) {
                        statePc = 572;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 559: {
                    if (null == this.field_C[var6].field_Z) {
                        statePc = 572;
                    } else {
                        statePc = 562;
                    }
                    continue stateLoop;
                }
                case 562: {
                    if (this.field_C[var6].field_Z.field_h > 2) {
                        statePc = 572;
                    } else {
                        statePc = 565;
                    }
                    continue stateLoop;
                }
                case 565: {
                    if (0 == var10) {
                        statePc = 571;
                    } else {
                        statePc = 568;
                    }
                    continue stateLoop;
                }
                case 568: {
                    if (this.field_C[var6].field_Z.field_e <= this.field_C[var10].field_Z.field_e) {
                        statePc = 572;
                    } else {
                        statePc = 571;
                    }
                    continue stateLoop;
                }
                case 571: {
                    var10 = var6;
                    statePc = 572;
                    continue stateLoop;
                }
                case 572: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 554;
                    } else {
                        statePc = 573;
                    }
                    continue stateLoop;
                }
                case 573: {
                    this.field_C[var10].field_Z.field_h = 3;
                    mh.a((byte) 118, 4, 251);
                    var9++;
                    statePc = 574;
                    continue stateLoop;
                }
                case 574: {
                    var8--;
                    statePc = 575;
                    continue stateLoop;
                }
                case 575: {
                    if (5 != this.field_i) {
                        statePc = 578;
                    } else {
                        statePc = 594;
                    }
                    continue stateLoop;
                }
                case 578: {
                    if (param1.field_Y) {
                        statePc = 581;
                    } else {
                        statePc = 582;
                    }
                    continue stateLoop;
                }
                case 581: {
                    mh.a((byte) 125, 5, 250);
                    statePc = 582;
                    continue stateLoop;
                }
                case 582: {
                    if (param1.field_E) {
                        statePc = 585;
                    } else {
                        statePc = 586;
                    }
                    continue stateLoop;
                }
                case 585: {
                    mh.a((byte) 124, 6, 249);
                    statePc = 586;
                    continue stateLoop;
                }
                case 586: {
                    if (param1.field_Ab) {
                        statePc = 589;
                    } else {
                        statePc = 590;
                    }
                    continue stateLoop;
                }
                case 589: {
                    mh.a((byte) 112, 7, 248);
                    statePc = 590;
                    continue stateLoop;
                }
                case 590: {
                    if (param1.field_H) {
                        statePc = 593;
                    } else {
                        statePc = 594;
                    }
                    continue stateLoop;
                }
                case 593: {
                    mh.a((byte) 113, 8, 247);
                    statePc = 594;
                    continue stateLoop;
                }
                case 594: {
                    cb.a(false, this.field_i);
                    statePc = 601;
                    continue stateLoop;
                }
                case 601: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, boolean param1) {
        int stackIn_22_0 = 0;
        dl stackIn_53_0 = null;
        dk stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        dk stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        dk stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        int stackIn_157_2 = 0;
        Object stackIn_162_0 = null;
        Object stackIn_173_0 = null;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_181_1 = 0;
        int stackIn_187_0 = 0;
        ci[] stackIn_199_0 = null;
        int stackIn_199_1 = 0;
        int stackIn_199_2 = 0;
        ci[] stackIn_200_0 = null;
        ci[] stackIn_202_0 = null;
        ci[] stackIn_203_0 = null;
        ci[] stackIn_205_0 = null;
        ci[] stackIn_206_0 = null;
        ci[] stackIn_208_0 = null;
        ci[] stackIn_209_0 = null;
        ci[] stackIn_211_0 = null;
        ci[] stackIn_213_0 = null;
        ci[] stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        int stackIn_252_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_256_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_257_1 = 0;
        int stackIn_267_0 = 0;
        int stackIn_267_1 = 0;
        int stackIn_267_2 = 0;
        int stackIn_267_3 = 0;
        int stackIn_267_4 = 0;
        int stackIn_268_0 = 0;
        int stackIn_268_1 = 0;
        int stackIn_268_2 = 0;
        int stackIn_270_0 = 0;
        int stackIn_270_1 = 0;
        int stackIn_270_2 = 0;
        int stackIn_272_0 = 0;
        int stackIn_272_1 = 0;
        int stackIn_272_2 = 0;
        int stackIn_273_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_273_2 = 0;
        int stackIn_273_3 = 0;
        int stackIn_274_0 = 0;
        int stackIn_274_1 = 0;
        int stackIn_274_2 = 0;
        int stackIn_274_3 = 0;
        int stackIn_276_0 = 0;
        int stackIn_276_1 = 0;
        int stackIn_276_2 = 0;
        int stackIn_276_3 = 0;
        int stackIn_277_0 = 0;
        int stackIn_277_1 = 0;
        int stackIn_277_2 = 0;
        int stackIn_277_3 = 0;
        int stackIn_277_4 = 0;
        int stackIn_329_0 = 0;
        int stackIn_329_1 = 0;
        int stackIn_329_2 = 0;
        int stackIn_329_3 = 0;
        int stackIn_329_4 = 0;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        int stackIn_358_2 = 0;
        int stackIn_358_3 = 0;
        int stackIn_358_4 = 0;
        int stackIn_359_0 = 0;
        int stackIn_359_1 = 0;
        int stackIn_359_2 = 0;
        int stackIn_361_0 = 0;
        int stackIn_361_1 = 0;
        int stackIn_361_2 = 0;
        int stackIn_363_0 = 0;
        int stackIn_363_1 = 0;
        int stackIn_363_2 = 0;
        int stackIn_364_0 = 0;
        int stackIn_364_1 = 0;
        int stackIn_364_2 = 0;
        int stackIn_364_3 = 0;
        int stackIn_365_0 = 0;
        int stackIn_365_1 = 0;
        int stackIn_365_2 = 0;
        int stackIn_365_3 = 0;
        int stackIn_367_0 = 0;
        int stackIn_367_1 = 0;
        int stackIn_367_2 = 0;
        int stackIn_367_3 = 0;
        int stackIn_368_0 = 0;
        int stackIn_368_1 = 0;
        int stackIn_368_2 = 0;
        int stackIn_368_3 = 0;
        int stackIn_368_4 = 0;
        int stackIn_426_0 = 0;
        int stackIn_426_1 = 0;
        int stackIn_426_2 = 0;
        int stackIn_426_3 = 0;
        int stackIn_426_4 = 0;
        Object stackIn_475_0 = null;
        Object stackIn_475_1 = null;
        int stackIn_501_0 = 0;
        int stackIn_501_1 = 0;
        dl stackIn_573_0 = null;
        Object stackIn_708_0 = null;
        Object stackIn_708_1 = null;
        Object stackIn_719_0 = null;
        Object stackIn_728_0 = null;
        Object stackIn_732_0 = null;
        Object stackIn_732_1 = null;
        int stackIn_745_0 = 0;
        int stackIn_745_1 = 0;
        ci[] stackIn_753_0 = null;
        int stackIn_753_1 = 0;
        int stackIn_753_2 = 0;
        boolean stackIn_769_0 = false;
        boolean stackIn_782_0 = false;
        dk stackIn_810_0 = null;
        dk stackIn_815_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dl var8_ref_dl = null;
        ci var8_ref_ci = null;
        th var8_ref_th = null;
        int var9 = 0;
        Object var9_ref = null;
        int var10_int = 0;
        ci var10 = null;
        dl var10_ref = null;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var15_ref_String = null;
        String var16_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var3_int = li.field_a ? 1 : 0;
                    tg.field_l = -1;
                    rd.field_t = 0;
                    li.field_a = false;
                    if (this.field_u) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_h.a(24, (byte) -122, 92);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (this.field_q != null) {
                        statePc = 7;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 7: {
                    tg.field_l = -1;
                    if (null == this.field_q.field_c.field_C) {
                        statePc = 17;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_q.field_c.field_C.field_C == null) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    tg.field_l = 1 + this.field_q.field_E;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (0 != (this.field_q.field_c.field_C.field_b ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    tg.field_l = this.field_q.field_E;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    tg.field_l = eg.field_p;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var4 = 0;
                    if (hl.field_a) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_22_0 = 1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var5 = stackIn_22_0;
                    if (jb.field_b >= 365) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (39 < jb.field_b) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var5 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (!param1) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (ld.field_b) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var5 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (!this.field_J) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var5 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    this.field_h.a(false, var5 != 0);
                    var6 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (this.field_C.length <= var6) {
                        statePc = 47;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var19 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (null != this.field_C[var6]) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.field_C[var6].e((byte) 41);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var6++;
                    if (var19 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (!eh.field_m) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var6 = -(32 * ui.field_f.field_H) + (-sj.field_b + (320 + 32 * ui.field_f.field_F));
                    var7 = ui.field_f.field_H * 16 + 16 * ui.field_f.field_F + (240 + (-lg.field_c + -(ui.field_f.field_E * 48 / 100)) - 32);
                    var8 = -320 + var6;
                    var8 += 304;
                    var9 = -240 + var7 - 32;
                    var9 += 224;
                    ui.field_f.field_g.a(var9, 4, var8, -22899, ui.field_f);
                    ck.a(ui.field_f.field_g, -31661);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var5 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var4 = -sj.field_b + 320;
                    var4 = var4 + 32 * (-vf.field_a + uf.field_c);
                    var6 = 240 + -lg.field_c;
                    var6 = var6 + 16 * (vf.field_a + uf.field_c);
                    var7 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var7 > eg.field_p) {
                        statePc = 143;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var8_ref_dl = this.field_h.a(-99, vf.field_a, var7, uf.field_c);
                    stackIn_573_0 = (dl) (var8_ref_dl);
                    stackIn_53_0 = stackIn_573_0;
                    if (var19 != 0) {
                        statePc = 573;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (stackIn_53_0 != null) {
                        statePc = 57;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var9_ref = hb.field_p[0];
                    if (var8_ref_dl.field_h == null) {
                        statePc = 71;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if ((eg.field_p ^ -1) != (var7 ^ -1)) {
                        statePc = 71;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (null == var8_ref_dl.field_h.field_Z) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var9_ref = hb.field_p[2];
                    if (var19 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (1 == var8_ref_dl.field_h.field_C) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var9_ref = null;
                    statePc = 71;
                    continue stateLoop;
                }
                case 69: {
                    if (!var8_ref_dl.field_h.field_k) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var9_ref = hb.field_p[1];
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (-1 == (this.field_L ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if ((eg.field_p ^ -1) != (var7 ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var9_ref = hb.field_p[1];
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (var9_ref == hb.field_p[1]) {
                        statePc = 79;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (this.field_q == null) {
                        statePc = 122;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var10_int = this.field_q.field_U;
                    var11_int = this.field_q.field_ab;
                    this.field_q.a(param0, uf.field_c, vf.field_a);
                    if (2 > Math.abs(var10_int + -this.field_q.field_U)) {
                        statePc = 86;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if ((Math.abs(var10_int - this.field_q.field_U) ^ -1) < -7) {
                        statePc = 86;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    this.field_q.field_ab = 0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var12 = this.field_q.c(false);
                    if (this.field_m) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var12 = 15;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    this.field_q.field_U = var10_int;
                    this.field_q.field_ab = var11_int;
                    if (this.field_m) {
                        statePc = 100;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (0 < this.field_q.field_nb.field_c) {
                        statePc = 100;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (7 == this.field_q.field_nb.field_g) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (6 != this.field_q.field_nb.field_g) {
                        statePc = 120;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if ((var12 ^ -1) >= (this.field_q.field_jb ^ -1)) {
                        statePc = 115;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (var12 + -10 > this.field_q.field_jb) {
                        statePc = 112;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (this.field_m) {
                        statePc = 112;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if ((this.field_q.field_jb ^ -1) <= -11) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    this.field_h.a(-(48 * var7) + -36 + var6, 16711680, var4, -2, hj.field_A);
                    if (var19 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (var12 <= this.field_q.field_jb) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var12 = this.field_q.field_jb;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    var13 = var12;
                    this.field_h.a(-(var7 * 48) + (var6 - 36), 16711680, var4, -2, Integer.toString(var13));
                    if (var19 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    this.field_h.a(-36 + var6 - 48 * var7, 16711680, var4, -2, ta.field_a);
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (hb.field_p[0] != var9_ref) {
                        statePc = 142;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (var7 != eg.field_p) {
                        statePc = 142;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (var8_ref_dl.field_z) {
                        statePc = 134;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (!var8_ref_dl.field_d) {
                        statePc = 134;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (-5 == (var8_ref_dl.field_v ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 137: {
                    rh.field_b[9].b(-16 + var4, var6 + (-36 - 48 * var7));
                    rh.field_b[9].b(-16 + var4, var6 + -36 + (-(var7 * 48) - -8));
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if (5 == var8_ref_dl.field_v) {
                        statePc = 141;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 141: {
                    rh.field_b[10].b(-16 + var4, -(var7 * 48) + -36 + var6);
                    rh.field_b[10].b(var4 + -16, 8 + (var6 - (36 - -(var7 * 48))));
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    var7++;
                    if (var19 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if ((ql.field_i ^ -1) >= 0) {
                        statePc = 159;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (0 <= (ld.field_e ^ -1)) {
                        statePc = 159;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var5 != 0) {
                        statePc = 152;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var4 = -sj.field_b + 320;
                    var6 = -lg.field_c + 240;
                    var4 = var4 + 32 * (ql.field_i - ld.field_e);
                    var6 = var6 + 16 * (ld.field_e + ql.field_i);
                    var7 = this.field_q.field_N;
                    if ((og.field_d ^ -1) >= -1) {
                        statePc = 158;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var8_ref_ci = hb.field_p[3];
                    var9 = (int)(24.0 + Math.sin(mm.field_f) * 24.0);
                    ve.a(var8_ref_ci, -5353, var7 * 144 + var9, var6 + (-(var7 * 48) - var9), var4 - 24);
                    var9 = (int)(Math.cos(mm.field_f) * 24.0 + 24.0);
                    ve.a(var8_ref_ci, -5353, var9 + var7 * 144, -var9 + -(48 * var7) + var6, -24 + var4);
                    var10_int = og.field_d;
                    stackIn_156_0 = this.field_h;
                    stackIn_154_0 = stackIn_156_0;
                    stackIn_156_1 = var6 + (-24 + -(var7 * 48));
                    stackIn_154_1 = stackIn_156_1;
                    if ((var10_int ^ -1) < (this.field_q.field_jb ^ -1)) {
                        statePc = 156;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackIn_157_0 = (dk) ((Object) stackIn_154_0);
                    stackIn_157_1 = stackIn_154_1;
                    stackIn_157_2 = 65280;
                    statePc = 157;
                    continue stateLoop;
                }
                case 156: {
                    stackIn_157_0 = (dk) ((Object) stackIn_156_0);
                    stackIn_157_1 = stackIn_156_1;
                    stackIn_157_2 = 16711680;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    ((dk) (Object) stackIn_157_0).a(stackIn_157_1, stackIn_157_2, var4, -2, Integer.toString(var10_int));
                    if (var19 == 0) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var8_ref_ci = hb.field_p[3];
                    var9 = (int)(24.0 + Math.sin(mm.field_f) * 24.0);
                    ve.a(var8_ref_ci, -5353, var9 + var7 * 144, -(48 * var7) + (var6 + -var9), var4 + -24);
                    var9 = (int)(24.0 + 24.0 * Math.cos(mm.field_f));
                    ve.a(var8_ref_ci, -5353, 144 * var7 - -var9, -(48 * var7) + (var6 - var9), -24 + var4);
                    this.field_h.a(-(48 * var7) + (-24 + var6), 16711680, var4, -2, rj.field_f);
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    var6 = 0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (50 <= var6) {
                        statePc = 168;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    stackIn_173_0 = this;
                    stackIn_162_0 = stackIn_173_0;
                    if (var19 != 0) {
                        statePc = 173;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (((e) (this)).field_F[var6] == null) {
                        statePc = 167;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    this.field_F[var6].c(16);
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var6++;
                    if (var19 == 0) {
                        statePc = 160;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (le.field_q != null) {
                        statePc = 171;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 171: {
                    le.field_q.d((byte) 124);
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    stackIn_173_0 = this;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (!((e) (this)).field_I) {
                        statePc = 186;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var6 = 0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    stackIn_176_0 = 640;
                    stackIn_176_1 = var6;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (stackIn_176_0 <= stackIn_176_1) {
                        statePc = 186;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    stackIn_187_0 = 0;
                    stackIn_178_0 = stackIn_187_0;
                    if (var19 != 0) {
                        statePc = 187;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var7 = stackIn_178_0;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if ((var7 ^ -1) <= -481) {
                        statePc = 185;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    stackIn_176_0 = -1;
                    stackIn_181_0 = stackIn_176_0;
                    stackIn_176_1 = gd.field_a[var6][var7] ^ -1;
                    stackIn_181_1 = stackIn_176_1;
                    if (var19 != 0) {
                        statePc = 176;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (stackIn_181_0 <= stackIn_181_1) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    l.a(var6, var7, (2048 * gd.field_a[var6][var7] + (gd.field_a[var6][var7] * 16 - -(262144 * gd.field_a[var6][var7]))) % 16777215);
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    var7++;
                    if (var19 == 0) {
                        statePc = 179;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var6++;
                    if (var19 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    jl.h((byte) -108);
                    stackIn_187_0 = param0 ? 1 : 0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (stackIn_187_0 == 1) {
                        statePc = 189;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    return;
                }
                case 189: {
                    var6 = 608;
                    var7 = 448;
                    if (this.field_J) {
                        statePc = 192;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var7 = 320;
                    wc.a((e) (this), var7, var6, -11669);
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (this.field_J) {
                        statePc = 196;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var8 = 385;
                    ic.field_t.b(0, var8);
                    var9 = 0;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (7 <= var9) {
                        statePc = 215;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    stackIn_753_0 = nb.field_d;
                    stackIn_199_0 = stackIn_753_0;
                    stackIn_753_1 = 28 * var9 + 97 ^ -1;
                    stackIn_199_1 = stackIn_753_1;
                    stackIn_753_2 = this.field_y ^ -1;
                    stackIn_199_2 = stackIn_753_2;
                    if (var19 != 0) {
                        statePc = 753;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    stackIn_211_0 = (ci[]) ((Object) stackIn_199_0);
                    stackIn_200_0 = stackIn_211_0;
                    if (stackIn_199_1 < stackIn_199_2) {
                        statePc = 211;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    stackIn_202_0 = (ci[]) ((Object) stackIn_200_0);
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    stackIn_211_0 = (ci[]) ((Object) stackIn_202_0);
                    stackIn_203_0 = stackIn_211_0;
                    if ((99 + (28 * var9 + 24) ^ -1) >= (this.field_y ^ -1)) {
                        statePc = 211;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    stackIn_205_0 = (ci[]) ((Object) stackIn_203_0);
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    stackIn_211_0 = (ci[]) ((Object) stackIn_205_0);
                    stackIn_206_0 = stackIn_211_0;
                    if (-2 + var8 + 66 >= this.field_j) {
                        statePc = 211;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    stackIn_208_0 = (ci[]) ((Object) stackIn_206_0);
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    stackIn_213_0 = (ci[]) ((Object) stackIn_208_0);
                    stackIn_209_0 = stackIn_213_0;
                    if ((26 + (-2 + var8 + 66) ^ -1) < (this.field_j ^ -1)) {
                        statePc = 213;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    stackIn_211_0 = (ci[]) ((Object) stackIn_209_0);
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    stackIn_214_0 = (ci[]) ((Object) stackIn_211_0);
                    stackIn_214_1 = var9;
                    statePc = 214;
                    continue stateLoop;
                }
                case 213: {
                    stackIn_214_0 = (ci[]) ((Object) stackIn_213_0);
                    stackIn_214_1 = var9 - -8;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    ((ci) (Object) stackIn_214_0[stackIn_214_1]).b(99 + (var9 * 28 - 2), -2 + (66 + var8));
                    var9++;
                    if (var19 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (this.field_q == null) {
                        statePc = 444;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (this.field_J) {
                        statePc = 221;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 221: {
                    nf.field_g[this.field_q.field_Z.field_d].b(10, 9 + var8);
                    var9_ref = this.field_q.field_nb;
                    if (null == var9_ref) {
                        statePc = 235;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (-1 == (((oh) (var9_ref)).field_g ^ -1)) {
                        statePc = 234;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if ((((oh) (var9_ref)).field_g ^ -1) == -4) {
                        statePc = 234;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (((oh) (var9_ref)).field_g == 8) {
                        statePc = 234;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (-13 != (((oh) (var9_ref)).field_g ^ -1)) {
                        statePc = 235;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var9_ref = this.field_q.field_eb;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    if (var9_ref != null) {
                        statePc = 245;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (this.field_q.field_Z.field_b == null) {
                        statePc = 309;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if ((this.field_q.field_Z.field_b.field_g ^ -1) != -18) {
                        statePc = 309;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    cc.field_i[17].a(192, 93, 367, 10 + (var8 + 36), (byte) 21);
                    if (var19 == 0) {
                        statePc = 309;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    cc.field_i[((oh) (var9_ref)).field_g].a(192, 93, 383, var8 - -46, (byte) 21);
                    if (this.field_q.field_nb != var9_ref) {
                        statePc = 260;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    l.e(310, var8 + 10, 148, 73, 16777215);
                    if (this.field_L != 1) {
                        statePc = 260;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    stackIn_256_0 = 1;
                    stackIn_252_0 = stackIn_256_0;
                    if (this.field_m) {
                        statePc = 256;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    stackIn_254_0 = stackIn_252_0;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    stackIn_257_0 = stackIn_254_0;
                    stackIn_257_1 = 1;
                    statePc = 257;
                    continue stateLoop;
                }
                case 256: {
                    stackIn_257_0 = stackIn_256_0;
                    stackIn_257_1 = 0;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (stackIn_257_0 != stackIn_257_1) {
                        statePc = 260;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    l.e(311, 11 - -var8, 146, 71, 16711680);
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    if (0 >= ((oh) (var9_ref)).a(true)) {
                        statePc = 278;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var10_int = 73 / ((oh) (var9_ref)).a(true);
                    if (var10_int >= 1) {
                        statePc = 263;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var10_int = 1;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    if (1 > var10_int) {
                        statePc = 278;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    var12 = 1;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    if ((var12 ^ -1) < (((oh) (var9_ref)).a(true) ^ -1)) {
                        statePc = 278;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var11_int = (int)(((double)(-var12) + (double)((oh) (var9_ref)).a(param0) / 2.0) * (double)var10_int + (double)(var8 + 47));
                    stackIn_329_0 = 314;
                    stackIn_267_0 = stackIn_329_0;
                    stackIn_329_1 = var11_int;
                    stackIn_267_1 = stackIn_329_1;
                    stackIn_329_2 = 4;
                    stackIn_267_2 = stackIn_329_2;
                    stackIn_329_3 = 1;
                    stackIn_267_3 = stackIn_329_3;
                    stackIn_329_4 = var10_int;
                    stackIn_267_4 = stackIn_329_4;
                    if (var19 != 0) {
                        statePc = 329;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    stackIn_272_0 = stackIn_267_0;
                    stackIn_268_0 = stackIn_272_0;
                    stackIn_272_1 = stackIn_267_1;
                    stackIn_268_1 = stackIn_272_1;
                    stackIn_272_2 = stackIn_267_2;
                    stackIn_268_2 = stackIn_272_2;
                    if (stackIn_267_3 < stackIn_267_4) {
                        statePc = 272;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    stackIn_270_0 = stackIn_268_0;
                    stackIn_270_1 = stackIn_268_1;
                    stackIn_270_2 = stackIn_268_2;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    stackIn_273_0 = stackIn_270_0;
                    stackIn_273_1 = stackIn_270_1;
                    stackIn_273_2 = stackIn_270_2;
                    stackIn_273_3 = 1;
                    statePc = 273;
                    continue stateLoop;
                }
                case 272: {
                    stackIn_273_0 = stackIn_272_0;
                    stackIn_273_1 = stackIn_272_1;
                    stackIn_273_2 = stackIn_272_2;
                    stackIn_273_3 = var10_int + -1;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    stackIn_276_0 = stackIn_273_0;
                    stackIn_274_0 = stackIn_276_0;
                    stackIn_276_1 = stackIn_273_1;
                    stackIn_274_1 = stackIn_276_1;
                    stackIn_276_2 = stackIn_273_2;
                    stackIn_274_2 = stackIn_276_2;
                    stackIn_276_3 = stackIn_273_3;
                    stackIn_274_3 = stackIn_276_3;
                    if (((oh) (var9_ref)).field_c < var12) {
                        statePc = 276;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    stackIn_277_0 = stackIn_274_0;
                    stackIn_277_1 = stackIn_274_1;
                    stackIn_277_2 = stackIn_274_2;
                    stackIn_277_3 = stackIn_274_3;
                    stackIn_277_4 = 65280;
                    statePc = 277;
                    continue stateLoop;
                }
                case 276: {
                    stackIn_277_0 = stackIn_276_0;
                    stackIn_277_1 = stackIn_276_1;
                    stackIn_277_2 = stackIn_276_2;
                    stackIn_277_3 = stackIn_276_3;
                    stackIn_277_4 = 16711680;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    l.f(stackIn_277_0, stackIn_277_1, stackIn_277_2, stackIn_277_3, stackIn_277_4);
                    var12++;
                    if (var19 == 0) {
                        statePc = 265;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (var9_ref != this.field_q.field_nb) {
                        statePc = 309;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var10_int = (int)Math.sqrt((double)(this.field_q.c((byte) -16) * this.field_q.field_y));
                    if (95 >= var10_int) {
                        statePc = 281;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var10_int = 95;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    og.field_f.a(var10_int + "%", 449, 80 + var8, 16777215, -1);
                    if (6 == ((oh) (var9_ref)).field_g) {
                        statePc = 309;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (7 == ((oh) (var9_ref)).field_g) {
                        statePc = 309;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if ((((oh) (var9_ref)).field_c ^ -1) <= (((oh) (var9_ref)).a(true) ^ -1)) {
                        statePc = 309;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    nb.field_d[7].b(324, 50 + var8);
                    if (-325 < (ef.field_j ^ -1)) {
                        statePc = 303;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (ef.field_j > 354) {
                        statePc = 303;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    if (jb.field_b < var8 + 50) {
                        statePc = 303;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (80 + var8 >= jb.field_b) {
                        statePc = 302;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 302: {
                    nb.field_d[15].b(324, 50 + var8);
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    if (((oh) (var9_ref)).field_c > 0) {
                        statePc = 309;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (mm.field_f > 3.14) {
                        statePc = 309;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    l.d(324, 50 + var8, 30, 30, 16711680, 128);
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    var9_ref = this.field_q.field_eb;
                    if (var9_ref == null) {
                        statePc = 324;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if (((oh) (var9_ref)).field_g == 0) {
                        statePc = 325;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (3 == ((oh) (var9_ref)).field_g) {
                        statePc = 325;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (8 == ((oh) (var9_ref)).field_g) {
                        statePc = 325;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (12 != ((oh) (var9_ref)).field_g) {
                        statePc = 324;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 324: {
                    var9_ref = this.field_q.field_nb;
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    if (var9_ref != null) {
                        statePc = 328;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 328: {
                    var10_int = 467;
                    stackIn_329_0 = var10_int;
                    stackIn_329_1 = 10 + var8;
                    stackIn_329_2 = var10_int - -73;
                    stackIn_329_3 = var8 - -10;
                    stackIn_329_4 = 73;
                    statePc = 329;
                    continue stateLoop;
                }
                case 329: {
                    l.c(stackIn_329_0, stackIn_329_1, stackIn_329_2, stackIn_329_3 + stackIn_329_4);
                    if (-1 != (((oh) (var9_ref)).field_g ^ -1)) {
                        statePc = 333;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    cc.field_i[((oh) (var9_ref)).field_g].a(192, 93, var10_int - -81, var8 - -46, (byte) 21);
                    if (var19 == 0) {
                        statePc = 335;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    cc.field_i[((oh) (var9_ref)).field_g].a(192, 93, var10_int + 73, 36 + var8 - -10, (byte) 21);
                    statePc = 335;
                    continue stateLoop;
                }
                case 335: {
                    l.c();
                    if (var9_ref == this.field_q.field_nb) {
                        statePc = 338;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 338: {
                    l.e(var10_int, 10 - -var8, 73, 73, 16777215);
                    if (1 != this.field_L) {
                        statePc = 345;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if (!this.field_m) {
                        statePc = 344;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 344: {
                    l.e(1 + var10_int, var8 + 11, 71, 71, 16711680);
                    statePc = 345;
                    continue stateLoop;
                }
                case 345: {
                    if (0 < ((oh) (var9_ref)).a(true)) {
                        statePc = 348;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 348: {
                    var11_int = 73 / ((oh) (var9_ref)).a(true);
                    if ((var11_int ^ -1) > -2) {
                        statePc = 351;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 351: {
                    var11_int = 1;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    if (1 <= var11_int) {
                        statePc = 355;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 355: {
                    var13 = 1;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if ((((oh) (var9_ref)).a(true) ^ -1) > (var13 ^ -1)) {
                        statePc = 369;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    var12 = (int)((double)(var8 - -47) + ((double)(-var13) + (double)((oh) (var9_ref)).a(true) / 2.0) * (double)var11_int);
                    stackIn_426_0 = var10_int + 4;
                    stackIn_358_0 = stackIn_426_0;
                    stackIn_426_1 = var12;
                    stackIn_358_1 = stackIn_426_1;
                    stackIn_426_2 = 4;
                    stackIn_358_2 = stackIn_426_2;
                    stackIn_426_3 = -2;
                    stackIn_358_3 = stackIn_426_3;
                    stackIn_426_4 = var11_int ^ -1;
                    stackIn_358_4 = stackIn_426_4;
                    if (var19 != 0) {
                        statePc = 426;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    stackIn_363_0 = stackIn_358_0;
                    stackIn_359_0 = stackIn_363_0;
                    stackIn_363_1 = stackIn_358_1;
                    stackIn_359_1 = stackIn_363_1;
                    stackIn_363_2 = stackIn_358_2;
                    stackIn_359_2 = stackIn_363_2;
                    if (stackIn_358_3 <= stackIn_358_4) {
                        statePc = 363;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    stackIn_361_0 = stackIn_359_0;
                    stackIn_361_1 = stackIn_359_1;
                    stackIn_361_2 = stackIn_359_2;
                    statePc = 361;
                    continue stateLoop;
                }
                case 361: {
                    stackIn_364_0 = stackIn_361_0;
                    stackIn_364_1 = stackIn_361_1;
                    stackIn_364_2 = stackIn_361_2;
                    stackIn_364_3 = -1 + var11_int;
                    statePc = 364;
                    continue stateLoop;
                }
                case 363: {
                    stackIn_364_0 = stackIn_363_0;
                    stackIn_364_1 = stackIn_363_1;
                    stackIn_364_2 = stackIn_363_2;
                    stackIn_364_3 = 1;
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    stackIn_367_0 = stackIn_364_0;
                    stackIn_365_0 = stackIn_367_0;
                    stackIn_367_1 = stackIn_364_1;
                    stackIn_365_1 = stackIn_367_1;
                    stackIn_367_2 = stackIn_364_2;
                    stackIn_365_2 = stackIn_367_2;
                    stackIn_367_3 = stackIn_364_3;
                    stackIn_365_3 = stackIn_367_3;
                    if ((((oh) (var9_ref)).field_c ^ -1) > (var13 ^ -1)) {
                        statePc = 367;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    stackIn_368_0 = stackIn_365_0;
                    stackIn_368_1 = stackIn_365_1;
                    stackIn_368_2 = stackIn_365_2;
                    stackIn_368_3 = stackIn_365_3;
                    stackIn_368_4 = 65280;
                    statePc = 368;
                    continue stateLoop;
                }
                case 367: {
                    stackIn_368_0 = stackIn_367_0;
                    stackIn_368_1 = stackIn_367_1;
                    stackIn_368_2 = stackIn_367_2;
                    stackIn_368_3 = stackIn_367_3;
                    stackIn_368_4 = 16711680;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    l.f(stackIn_368_0, stackIn_368_1, stackIn_368_2, stackIn_368_3, stackIn_368_4);
                    var13++;
                    if (var19 == 0) {
                        statePc = 356;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    if (-7 == (((oh) (var9_ref)).field_g ^ -1)) {
                        statePc = 396;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    if ((((oh) (var9_ref)).field_g ^ -1) == -8) {
                        statePc = 396;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    if (((oh) (var9_ref)).field_c >= ((oh) (var9_ref)).a(true)) {
                        statePc = 396;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    nb.field_d[7].b(478, var8 - -50);
                    if (((oh) (var9_ref)).field_c > 0) {
                        statePc = 396;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    if (3.14 >= mm.field_f) {
                        statePc = 384;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 384: {
                    l.d(478, var8 - -50, 30, 30, 16711680, 128);
                    if (-464 + (var10_int + 478) > ef.field_j) {
                        statePc = 396;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    if (-464 + (508 + var10_int) < ef.field_j) {
                        statePc = 396;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 388: {
                    if ((jb.field_b ^ -1) > (var8 - -50 ^ -1)) {
                        statePc = 396;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if ((jb.field_b ^ -1) < (var8 - -80 ^ -1)) {
                        statePc = 396;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    nb.field_d[15].b(478, var8 - -50);
                    statePc = 396;
                    continue stateLoop;
                }
                case 396: {
                    if (this.field_q.field_nb == var9_ref) {
                        statePc = 399;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 399: {
                    var11_int = (int)Math.sqrt((double)(this.field_q.c((byte) -16) * this.field_q.field_y));
                    if (95 < var11_int) {
                        statePc = 402;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 402: {
                    var11_int = 95;
                    statePc = 403;
                    continue stateLoop;
                }
                case 403: {
                    og.field_f.a(var11_int + "%", -464 + (531 + var10_int), 80 + var8, 16777215, -1);
                    statePc = 404;
                    continue stateLoop;
                }
                case 404: {
                    if (null == this.field_q.field_b) {
                        statePc = 416;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    l.c(547, 35 + var8, 595, 48 + var8 + 35);
                    var10 = cc.field_i[this.field_q.field_b.field_g].d();
                    var10.b();
                    if ((this.field_q.field_b.field_g ^ -1) == -6) {
                        statePc = 408;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 408: {
                    var10.b(547 - var10.field_p - -6, 26 + (var8 - -(var10.field_v / 2)));
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    if (-12 != (this.field_q.field_b.field_g ^ -1)) {
                        statePc = 412;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    var10.b(547 - var10.field_p, -3 + (var8 - (-32 + -(var10.field_v / 2))));
                    statePc = 412;
                    continue stateLoop;
                }
                case 412: {
                    l.c();
                    if (!this.field_m) {
                        statePc = 415;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    l.e(547, var8 + 35, 48, 48, 16777215);
                    l.e(548, var8 + 36, 46, 46, 16711680);
                    statePc = 415;
                    continue stateLoop;
                }
                case 415: {
                    og.field_f.a(Integer.toString(this.field_q.field_b.field_d), 589, var8 - -81, 16777215, -1);
                    statePc = 416;
                    continue stateLoop;
                }
                case 416: {
                    if ((this.field_q.field_B ^ -1) != -1) {
                        statePc = 419;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    l.d(100, var8 - -67, 24, 24, 0, 128);
                    statePc = 419;
                    continue stateLoop;
                }
                case 419: {
                    if ((this.field_q.field_B ^ -1) != -2) {
                        statePc = 422;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    l.d(128, 67 + var8, 24, 24, 0, 128);
                    statePc = 422;
                    continue stateLoop;
                }
                case 422: {
                    if (eg.field_p == 0) {
                        statePc = 425;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 425: {
                    stackIn_426_0 = 185;
                    stackIn_426_1 = var8 - -67;
                    stackIn_426_2 = 24;
                    stackIn_426_3 = 24;
                    stackIn_426_4 = 0;
                    statePc = 426;
                    continue stateLoop;
                }
                case 426: {
                    l.d(stackIn_426_0, stackIn_426_1, stackIn_426_2, stackIn_426_3, stackIn_426_4, 128);
                    statePc = 427;
                    continue stateLoop;
                }
                case 427: {
                    if (5 > eg.field_p) {
                        statePc = 430;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    l.d(213, var8 + 67, 24, 24, 0, 128);
                    statePc = 430;
                    continue stateLoop;
                }
                case 430: {
                    var10_int = 133;
                    var11_int = this.field_q.field_P * var10_int / this.field_q.field_mb;
                    var12 = var10_int * this.field_q.field_T / this.field_q.field_mb;
                    var13 = (this.field_q.field_u + this.field_q.field_m) * var10_int / 200;
                    l.d(var11_int + 159, var8 + 28, var10_int - var11_int, 7, 16776960, 128);
                    l.d(var11_int + 159 + var12, var8 - -28, -var12 - (var11_int - var10_int), 7, 0, 192);
                    l.d(159 - -var13, 45 + var8, var10_int + -var13, 7, 0, 192);
                    var14 = this.field_q.field_jb;
                    if (this.field_q.field_B == 0) {
                        statePc = 432;
                    } else {
                        statePc = 431;
                    }
                    continue stateLoop;
                }
                case 431: {
                    var15 = var10_int * this.field_q.field_jb / this.field_q.field_v;
                    l.d(159 - -var15, var8 - -11, -var15 + var10_int, 7, 0, 192);
                    if (var19 == 0) {
                        statePc = 433;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    var14 = 2 * var14 / 3;
                    var15 = var10_int * var14 / this.field_q.field_v;
                    l.d(159, var8 + 11, var15, 7, 16777215, 128);
                    l.d(159 - -var15, var8 - -11, -var15 + var10_int, 7, 0, 192);
                    statePc = 433;
                    continue stateLoop;
                }
                case 433: {
                    var14 = this.field_q.field_jb;
                    var15_ref_String = Integer.toString(var14);
                    if (-1 == (this.field_q.field_B ^ -1)) {
                        statePc = 436;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 436: {
                    var15_ref_String = "<lt>" + var15_ref_String + "<gt>";
                    statePc = 437;
                    continue stateLoop;
                }
                case 437: {
                    var16_ref_String = Integer.toString(this.field_q.field_P);
                    if ((this.field_q.field_T ^ -1) >= -1) {
                        statePc = 443;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    var17 = this.field_q.field_P - -this.field_q.field_T;
                    if (99 < var17) {
                        statePc = 441;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 441: {
                    var17 = 99;
                    statePc = 442;
                    continue stateLoop;
                }
                case 442: {
                    var16_ref_String = var16_ref_String + "/" + var17;
                    statePc = 443;
                    continue stateLoop;
                }
                case 443: {
                    og.field_f.c(var15_ref_String, 134, 18 + var8, 0, 0);
                    og.field_f.c(var16_ref_String, 134, 35 + var8, 0, 0);
                    og.field_f.c(Integer.toString(this.field_q.field_u + this.field_q.field_m), 134, var8 - -52, 0, 0);
                    og.field_f.c(var15_ref_String, 135, 17 + var8, 0, 0);
                    og.field_f.c(var16_ref_String, 135, var8 + 34, 0, 0);
                    og.field_f.c(Integer.toString(this.field_q.field_m + this.field_q.field_u), 135, var8 - -51, 0, 0);
                    og.field_f.c(var15_ref_String, 135, 18 + var8, 8421631, -1);
                    og.field_f.c(var16_ref_String, 135, 35 + var8, 16719904, -1);
                    og.field_f.c(Integer.toString(this.field_q.field_u - -this.field_q.field_m), 135, 52 + var8, 2162464, -1);
                    statePc = 444;
                    continue stateLoop;
                }
                case 444: {
                    if (ha.field_o) {
                        statePc = 447;
                    } else {
                        statePc = 472;
                    }
                    continue stateLoop;
                }
                case 447: {
                    if (this.field_B >= 2) {
                        statePc = 450;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    l.f(306, 7 - -var8, 234, 79, 0);
                    statePc = 450;
                    continue stateLoop;
                }
                case 450: {
                    if (this.field_B < 7) {
                        statePc = 453;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 453: {
                    l.f(241, 66 + var8, 26, 26, 0);
                    statePc = 454;
                    continue stateLoop;
                }
                case 454: {
                    if ((this.field_B ^ -1) > -10) {
                        statePc = 457;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 457: {
                    l.f(269, var8 + 66, 26, 26, 0);
                    statePc = 458;
                    continue stateLoop;
                }
                case 458: {
                    if (this.field_B < 10) {
                        statePc = 461;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 461: {
                    l.f(606, 7 - -var8, 29, 79, 0);
                    statePc = 462;
                    continue stateLoop;
                }
                case 462: {
                    if (-12 >= (this.field_B ^ -1)) {
                        statePc = 465;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    l.f(99, 66 + var8, 54, 26, 0);
                    statePc = 465;
                    continue stateLoop;
                }
                case 465: {
                    if (this.field_B >= 12) {
                        statePc = 468;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 466: {
                    l.f(184, var8 + 66, 54, 26, 0);
                    statePc = 468;
                    continue stateLoop;
                }
                case 468: {
                    if ((this.field_B ^ -1) > -15) {
                        statePc = 471;
                    } else {
                        statePc = 472;
                    }
                    continue stateLoop;
                }
                case 471: {
                    l.f(541, 7 - -var8, 54, 54, 0);
                    statePc = 472;
                    continue stateLoop;
                }
                case 472: {
                    var9 = 0;
                    var10_int = -1;
                    var11_int = 0;
                    var12 = 0;
                    statePc = 473;
                    continue stateLoop;
                }
                case 473: {
                    if (12 <= var12) {
                        statePc = 493;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    stackIn_732_0 = null;
                    stackIn_475_0 = stackIn_732_0;
                    stackIn_732_1 = this;
                    stackIn_475_1 = stackIn_732_1;
                    if (var19 != 0) {
                        statePc = 732;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 475: {
                    if (stackIn_475_0 == ((e) (this)).field_C[var12]) {
                        statePc = 492;
                    } else {
                        statePc = 478;
                    }
                    continue stateLoop;
                }
                case 478: {
                    if (null == this.field_C[var12].field_Z) {
                        statePc = 492;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    if ((this.field_C[var12].field_P ^ -1) >= -1) {
                        statePc = 492;
                    } else {
                        statePc = 484;
                    }
                    continue stateLoop;
                }
                case 484: {
                    if (this.field_q != null) {
                        statePc = 489;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 487: {
                    this.field_q = this.field_C[var11_int];
                    statePc = 489;
                    continue stateLoop;
                }
                case 489: {
                    if (this.field_C[var12] != this.field_q) {
                        statePc = 491;
                    } else {
                        statePc = 490;
                    }
                    continue stateLoop;
                }
                case 490: {
                    var10_int = var9;
                    statePc = 491;
                    continue stateLoop;
                }
                case 491: {
                    var11_int = var12;
                    var9++;
                    statePc = 492;
                    continue stateLoop;
                }
                case 492: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 473;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 493: {
                    if (-2 > (var9 ^ -1)) {
                        statePc = 495;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 494: {
                    var12 = 90;
                    if (var19 == 0) {
                        statePc = 496;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    var12 = 550 / (-1 + var9);
                    statePc = 496;
                    continue stateLoop;
                }
                case 496: {
                    if (var12 <= 90) {
                        statePc = 498;
                    } else {
                        statePc = 497;
                    }
                    continue stateLoop;
                }
                case 497: {
                    var12 = 90;
                    statePc = 498;
                    continue stateLoop;
                }
                case 498: {
                    var13 = -1 + var9;
                    statePc = 499;
                    continue stateLoop;
                }
                case 499: {
                    if (-1 < (var13 ^ -1)) {
                        statePc = 566;
                    } else {
                        statePc = 500;
                    }
                    continue stateLoop;
                }
                case 500: {
                    var14 = var12;
                    stackIn_745_0 = var10_int ^ -1;
                    stackIn_501_0 = stackIn_745_0;
                    stackIn_745_1 = var13 ^ -1;
                    stackIn_501_1 = stackIn_745_1;
                    if (var19 != 0) {
                        statePc = 745;
                    } else {
                        statePc = 501;
                    }
                    continue stateLoop;
                }
                case 501: {
                    if (stackIn_501_0 != stackIn_501_1) {
                        statePc = 505;
                    } else {
                        statePc = 504;
                    }
                    continue stateLoop;
                }
                case 504: {
                    var14 = 90;
                    statePc = 505;
                    continue stateLoop;
                }
                case 505: {
                    var4 = var13 * var12;
                    if ((var10_int ^ -1) <= (var13 ^ -1)) {
                        statePc = 507;
                    } else {
                        statePc = 506;
                    }
                    continue stateLoop;
                }
                case 506: {
                    var4 = var4 + (90 - var12);
                    statePc = 507;
                    continue stateLoop;
                }
                case 507: {
                    if (null == this.field_C[var11_int]) {
                        statePc = 509;
                    } else {
                        statePc = 508;
                    }
                    continue stateLoop;
                }
                case 508: {
                    if ((this.field_C[var11_int].field_P ^ -1) < -1) {
                        statePc = 512;
                    } else {
                        statePc = 509;
                    }
                    continue stateLoop;
                }
                case 509: {
                    var11_int--;
                    if (var19 == 0) {
                        statePc = 507;
                    } else {
                        statePc = 512;
                    }
                    continue stateLoop;
                }
                case 512: {
                    var8 = 384;
                    if (var4 + (-th.field_i.field_r - -var14) > ef.field_j) {
                        statePc = 547;
                    } else {
                        statePc = 513;
                    }
                    continue stateLoop;
                }
                case 513: {
                    if (jb.field_b < 365) {
                        statePc = 547;
                    } else {
                        statePc = 516;
                    }
                    continue stateLoop;
                }
                case 516: {
                    if (394 < jb.field_b) {
                        statePc = 547;
                    } else {
                        statePc = 519;
                    }
                    continue stateLoop;
                }
                case 519: {
                    if ((ef.field_j ^ -1) < (var14 + var4 ^ -1)) {
                        statePc = 547;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 522: {
                    if (!ha.field_o) {
                        statePc = 530;
                    } else {
                        statePc = 525;
                    }
                    continue stateLoop;
                }
                case 525: {
                    if (this.field_B >= 7) {
                        statePc = 530;
                    } else {
                        statePc = 547;
                    }
                    continue stateLoop;
                }
                case 530: {
                    this.field_G.field_Eb = new String[1];
                    this.field_G.field_Eb[0] = ne.field_b + this.field_C[var11_int].field_Z.b(1);
                    if (oh.field_f == 1) {
                        statePc = 533;
                    } else {
                        statePc = 547;
                    }
                    continue stateLoop;
                }
                case 533: {
                    if (this.field_B < 7) {
                        statePc = 546;
                    } else {
                        statePc = 534;
                    }
                    continue stateLoop;
                }
                case 534: {
                    if (-11 >= (this.field_B ^ -1)) {
                        statePc = 546;
                    } else {
                        statePc = 537;
                    }
                    continue stateLoop;
                }
                case 537: {
                    if (sj.field_b == 32 * (this.field_q.field_F + -this.field_q.field_H)) {
                        statePc = 546;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 540: {
                    if (16 * (this.field_q.field_F + this.field_q.field_H) != lg.field_c) {
                        statePc = 545;
                    } else {
                        statePc = 546;
                    }
                    continue stateLoop;
                }
                case 545: {
                    this.field_B = this.field_B + 1;
                    statePc = 546;
                    continue stateLoop;
                }
                case 546: {
                    this.field_q = this.field_C[var11_int];
                    eg.field_p = this.field_q.field_E;
                    sj.field_b = (-this.field_q.field_H + this.field_q.field_F) * 32;
                    lg.field_c = 16 * (this.field_q.field_F + this.field_q.field_H);
                    this.a(-1);
                    this.field_L = 0;
                    this.field_m = false;
                    statePc = 547;
                    continue stateLoop;
                }
                case 547: {
                    var15 = this.field_C[var11_int].field_jb;
                    var16 = 52428;
                    var17 = 65535;
                    var18 = 16777215;
                    if (this.field_C[var11_int].field_B != 0) {
                        statePc = 549;
                    } else {
                        statePc = 548;
                    }
                    continue stateLoop;
                }
                case 548: {
                    var17 = 16711680;
                    var18 = 16744576;
                    var16 = 13369344;
                    statePc = 549;
                    continue stateLoop;
                }
                case 549: {
                    if ((var10_int ^ -1) == (var13 ^ -1)) {
                        statePc = 553;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 550: {
                    th.field_i.b(var4 - th.field_i.field_r - -var14, 365);
                    og.field_f.b(this.field_C[var11_int].field_Z.a(-1426, -12 + var14 + -8), var4, var8 + -5, 52224, -1);
                    og.field_f.a(Integer.toString(var15), -5 + (var14 + var4), -5 + var8, var16, -1);
                    if (var19 == 0) {
                        statePc = 555;
                    } else {
                        statePc = 553;
                    }
                    continue stateLoop;
                }
                case 553: {
                    vl.field_c.b(var14 + var4 + -vl.field_c.field_r, 365);
                    og.field_f.b(this.field_C[var11_int].field_Z.a(-1426, -20 + var14), var4, var8 - 5, 65280, -1);
                    og.field_f.a(Integer.toString(var15), -5 + (var4 - -var14), -5 + var8, var17, -1);
                    statePc = 555;
                    continue stateLoop;
                }
                case 555: {
                    if (this.field_C[var11_int].field_ob) {
                        statePc = 558;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 558: {
                    l.e(89 + -vl.field_c.field_r + var4 - (-var14 - -1), 383, 4, 16777215);
                    l.e(89 + (-vl.field_c.field_r + (var4 + var14)) + 1, 383, 4, 16777215);
                    l.e(-vl.field_c.field_r + var4 + (var14 + 89), 383, 3, 16711680);
                    l.e(var4 + (-vl.field_c.field_r - -var14) - -89, 383, 2, 0);
                    statePc = 559;
                    continue stateLoop;
                }
                case 559: {
                    if (this.field_C[var11_int].field_v != this.field_C[var11_int].field_jb) {
                        statePc = 565;
                    } else {
                        statePc = 560;
                    }
                    continue stateLoop;
                }
                case 560: {
                    if (1 != this.field_C[var11_int].field_B) {
                        statePc = 565;
                    } else {
                        statePc = 563;
                    }
                    continue stateLoop;
                }
                case 563: {
                    og.field_f.a(Integer.toString(var15), var14 + var4 - 5, var8 - 5, var18, -1);
                    statePc = 565;
                    continue stateLoop;
                }
                case 565: {
                    var11_int--;
                    var13--;
                    if (var19 == 0) {
                        statePc = 499;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 566: {
                    if (!g.field_tb) {
                        statePc = 727;
                    } else {
                        statePc = 567;
                    }
                    continue stateLoop;
                }
                case 567: {
                    if ((mm.field_e ^ -1) <= -3) {
                        statePc = 572;
                    } else {
                        statePc = 727;
                    }
                    continue stateLoop;
                }
                case 572: {
                    vc.field_f.b("QA MODE", 10, 70, 16711823, 0);
                    stackIn_573_0 = this.field_h.a(-111, vf.field_a, eg.field_p, uf.field_c);
                    statePc = 573;
                    continue stateLoop;
                }
                case 573: {
                    var8_ref_dl = stackIn_573_0;
                    if (null != var8_ref_dl) {
                        statePc = 576;
                    } else {
                        statePc = 727;
                    }
                    continue stateLoop;
                }
                case 576: {
                    if (null == oi.field_J) {
                        statePc = 579;
                    } else {
                        statePc = 577;
                    }
                    continue stateLoop;
                }
                case 577: {
                    l.f(0, 100, oi.field_J.field_q, oi.field_J.field_u, 16711823);
                    oi.field_J.b(0, 100);
                    statePc = 579;
                    continue stateLoop;
                }
                case 579: {
                    var9_ref = var8_ref_dl.field_h;
                    var10_int = 80;
                    if (null == var9_ref) {
                        statePc = 674;
                    } else {
                        statePc = 580;
                    }
                    continue stateLoop;
                }
                case 580: {
                    og.field_f.a(((r) (var9_ref)).field_K, 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    og.field_f.a("Health " + ((r) (var9_ref)).field_P + "/" + ((r) (var9_ref)).field_mb, 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    og.field_f.a("Armour " + ((r) (var9_ref)).field_u + "/" + ((r) (var9_ref)).field_fb, 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    og.field_f.a("Shield " + ((r) (var9_ref)).field_m + "/" + ((r) (var9_ref)).field_J, 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    og.field_f.a("Weapon: " + od.field_c[((r) (var9_ref)).field_nb.field_g].field_j, 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    if (null != ((r) (var9_ref)).field_b) {
                        statePc = 585;
                    } else {
                        statePc = 586;
                    }
                    continue stateLoop;
                }
                case 585: {
                    og.field_f.a("Nades:  " + od.field_c[((r) (var9_ref)).field_b.field_g].field_j + "*" + ((r) (var9_ref)).field_b.field_d, 630, var10_int, 16777215, 0);
                    statePc = 586;
                    continue stateLoop;
                }
                case 586: {
                    var10_int += 12;
                    og.field_f.a("Tus " + ((r) (var9_ref)).field_jb + "/" + ((r) (var9_ref)).field_v, 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    og.field_f.a("Interupt " + ((r) (var9_ref)).field_q, 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    var10_int += 12;
                    og.field_f.a("Use [ and ] to change weapon", 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    og.field_f.a("Use <lt> and > to change tus", 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    og.field_f.a("Hold shift and use <lt> and > to change interupttus", 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    og.field_f.a("Press / to kill this unit", 630, var10_int, 16777215, 0);
                    if (!bh.field_e[uf.field_b]) {
                        statePc = 608;
                    } else {
                        statePc = 587;
                    }
                    continue stateLoop;
                }
                case 587: {
                    if (!bh.field_e[81]) {
                        statePc = 599;
                    } else {
                        statePc = 590;
                    }
                    continue stateLoop;
                }
                case 590: {
                    ((r) (var9_ref)).field_q = ((r) (var9_ref)).field_q - 1;
                    if ((((r) (var9_ref)).field_q ^ -1) <= (-((r) (var9_ref)).field_v ^ -1)) {
                        statePc = 595;
                    } else {
                        statePc = 593;
                    }
                    continue stateLoop;
                }
                case 593: {
                    ((r) (var9_ref)).field_q = -((r) (var9_ref)).field_v;
                    statePc = 595;
                    continue stateLoop;
                }
                case 595: {
                    if (-((r) (var9_ref)).field_jb > ((r) (var9_ref)).field_q) {
                        statePc = 598;
                    } else {
                        statePc = 608;
                    }
                    continue stateLoop;
                }
                case 598: {
                    ((r) (var9_ref)).field_jb = -((r) (var9_ref)).field_q;
                    if (var19 == 0) {
                        statePc = 608;
                    } else {
                        statePc = 599;
                    }
                    continue stateLoop;
                }
                case 599: {
                    ((r) (var9_ref)).field_jb = ((r) (var9_ref)).field_jb - 1;
                    if (((r) (var9_ref)).field_jb >= 0) {
                        statePc = 604;
                    } else {
                        statePc = 602;
                    }
                    continue stateLoop;
                }
                case 602: {
                    ((r) (var9_ref)).field_jb = 0;
                    statePc = 604;
                    continue stateLoop;
                }
                case 604: {
                    if ((((r) (var9_ref)).field_q ^ -1) > (-((r) (var9_ref)).field_jb ^ -1)) {
                        statePc = 607;
                    } else {
                        statePc = 608;
                    }
                    continue stateLoop;
                }
                case 607: {
                    ((r) (var9_ref)).field_q = -((r) (var9_ref)).field_jb;
                    statePc = 608;
                    continue stateLoop;
                }
                case 608: {
                    var10_int += 12;
                    if (!bh.field_e[ne.field_e]) {
                        statePc = 631;
                    } else {
                        statePc = 609;
                    }
                    continue stateLoop;
                }
                case 609: {
                    if (bh.field_e[81]) {
                        statePc = 622;
                    } else {
                        statePc = 612;
                    }
                    continue stateLoop;
                }
                case 612: {
                    ((r) (var9_ref)).field_jb = ((r) (var9_ref)).field_jb + 1;
                    if (((r) (var9_ref)).field_v < ((r) (var9_ref)).field_jb) {
                        statePc = 617;
                    } else {
                        statePc = 618;
                    }
                    continue stateLoop;
                }
                case 617: {
                    ((r) (var9_ref)).field_jb = ((r) (var9_ref)).field_v;
                    statePc = 618;
                    continue stateLoop;
                }
                case 618: {
                    if ((((r) (var9_ref)).field_q + ((r) (var9_ref)).field_jb ^ -1) >= (((r) (var9_ref)).field_v ^ -1)) {
                        statePc = 631;
                    } else {
                        statePc = 619;
                    }
                    continue stateLoop;
                }
                case 619: {
                    ((r) (var9_ref)).field_q = ((r) (var9_ref)).field_v + -((r) (var9_ref)).field_jb;
                    if (var19 == 0) {
                        statePc = 631;
                    } else {
                        statePc = 622;
                    }
                    continue stateLoop;
                }
                case 622: {
                    ((r) (var9_ref)).field_q = ((r) (var9_ref)).field_q + 1;
                    if ((((r) (var9_ref)).field_q ^ -1) >= (((r) (var9_ref)).field_v ^ -1)) {
                        statePc = 627;
                    } else {
                        statePc = 625;
                    }
                    continue stateLoop;
                }
                case 625: {
                    ((r) (var9_ref)).field_q = ((r) (var9_ref)).field_v;
                    statePc = 627;
                    continue stateLoop;
                }
                case 627: {
                    if ((((r) (var9_ref)).field_v ^ -1) > (((r) (var9_ref)).field_q + ((r) (var9_ref)).field_jb ^ -1)) {
                        statePc = 630;
                    } else {
                        statePc = 631;
                    }
                    continue stateLoop;
                }
                case 630: {
                    ((r) (var9_ref)).field_jb = ((r) (var9_ref)).field_v + -((r) (var9_ref)).field_q;
                    statePc = 631;
                    continue stateLoop;
                }
                case 631: {
                    if (25 <= nd.field_k) {
                        statePc = 670;
                    } else {
                        statePc = 632;
                    }
                    continue stateLoop;
                }
                case 632: {
                    if (!bh.field_e[42]) {
                        statePc = 650;
                    } else {
                        statePc = 635;
                    }
                    continue stateLoop;
                }
                case 635: {
                    ((r) (var9_ref)).field_nb.field_g = ((r) (var9_ref)).field_nb.field_g - 1;
                    if (-18 == (((r) (var9_ref)).field_nb.field_g ^ -1)) {
                        statePc = 640;
                    } else {
                        statePc = 641;
                    }
                    continue stateLoop;
                }
                case 640: {
                    ((r) (var9_ref)).field_nb.field_g = 16;
                    statePc = 641;
                    continue stateLoop;
                }
                case 641: {
                    if (((r) (var9_ref)).field_nb.field_g != 5) {
                        statePc = 644;
                    } else {
                        statePc = 642;
                    }
                    continue stateLoop;
                }
                case 642: {
                    ((r) (var9_ref)).field_nb.field_g = 4;
                    statePc = 644;
                    continue stateLoop;
                }
                case 644: {
                    if (11 != ((r) (var9_ref)).field_nb.field_g) {
                        statePc = 647;
                    } else {
                        statePc = 645;
                    }
                    continue stateLoop;
                }
                case 645: {
                    ((r) (var9_ref)).field_nb.field_g = 10;
                    statePc = 647;
                    continue stateLoop;
                }
                case 647: {
                    nd.field_k = 25;
                    if (0 > (((r) (var9_ref)).field_nb.field_g ^ -1)) {
                        statePc = 650;
                    } else {
                        statePc = 648;
                    }
                    continue stateLoop;
                }
                case 648: {
                    ((r) (var9_ref)).field_nb.field_g = 18;
                    statePc = 650;
                    continue stateLoop;
                }
                case 650: {
                    if (!bh.field_e[43]) {
                        statePc = 670;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 651: {
                    ((r) (var9_ref)).field_nb.field_g = ((r) (var9_ref)).field_nb.field_g + 1;
                    if (17 == ((r) (var9_ref)).field_nb.field_g) {
                        statePc = 656;
                    } else {
                        statePc = 657;
                    }
                    continue stateLoop;
                }
                case 656: {
                    ((r) (var9_ref)).field_nb.field_g = 18;
                    statePc = 657;
                    continue stateLoop;
                }
                case 657: {
                    if ((((r) (var9_ref)).field_nb.field_g ^ -1) == -6) {
                        statePc = 660;
                    } else {
                        statePc = 661;
                    }
                    continue stateLoop;
                }
                case 660: {
                    ((r) (var9_ref)).field_nb.field_g = 6;
                    statePc = 661;
                    continue stateLoop;
                }
                case 661: {
                    if (((r) (var9_ref)).field_nb.field_g == 11) {
                        statePc = 664;
                    } else {
                        statePc = 665;
                    }
                    continue stateLoop;
                }
                case 664: {
                    ((r) (var9_ref)).field_nb.field_g = 12;
                    statePc = 665;
                    continue stateLoop;
                }
                case 665: {
                    if (-20 >= (((r) (var9_ref)).field_nb.field_g ^ -1)) {
                        statePc = 668;
                    } else {
                        statePc = 669;
                    }
                    continue stateLoop;
                }
                case 668: {
                    ((r) (var9_ref)).field_nb.field_g = 0;
                    statePc = 669;
                    continue stateLoop;
                }
                case 669: {
                    nd.field_k = 25;
                    statePc = 670;
                    continue stateLoop;
                }
                case 670: {
                    if (!bh.field_e[73]) {
                        statePc = 727;
                    } else {
                        statePc = 671;
                    }
                    continue stateLoop;
                }
                case 671: {
                    ((r) (var9_ref)).field_d = 5;
                    ((r) (var9_ref)).field_A = 0;
                    ((r) (var9_ref)).field_S = true;
                    ((r) (var9_ref)).field_P = 0;
                    if (var19 == 0) {
                        statePc = 727;
                    } else {
                        statePc = 674;
                    }
                    continue stateLoop;
                }
                case 674: {
                    if ((var8_ref_dl.field_v ^ -1) == -1) {
                        statePc = 680;
                    } else {
                        statePc = 677;
                    }
                    continue stateLoop;
                }
                case 677: {
                    if ((var8_ref_dl.field_v ^ -1) != -2) {
                        statePc = 682;
                    } else {
                        statePc = 680;
                    }
                    continue stateLoop;
                }
                case 680: {
                    og.field_f.a("Press the numberkeys from 0 to 6 to create a unit here", 630, var10_int, 16777215, 0);
                    var10_int += 12;
                    statePc = 682;
                    continue stateLoop;
                }
                case 682: {
                    var11 = null;
                    if (bh.field_e[25]) {
                        statePc = 685;
                    } else {
                        statePc = 686;
                    }
                    continue stateLoop;
                }
                case 685: {
                    var11 = new r(0, this.field_G.field_Bb);
                    statePc = 686;
                    continue stateLoop;
                }
                case 686: {
                    if (bh.field_e[16]) {
                        statePc = 689;
                    } else {
                        statePc = 690;
                    }
                    continue stateLoop;
                }
                case 689: {
                    var11 = new r(1, this.field_G.field_Bb);
                    statePc = 690;
                    continue stateLoop;
                }
                case 690: {
                    if (!bh.field_e[17]) {
                        statePc = 692;
                    } else {
                        statePc = 691;
                    }
                    continue stateLoop;
                }
                case 691: {
                    var11 = new r(2, this.field_G.field_Bb);
                    statePc = 692;
                    continue stateLoop;
                }
                case 692: {
                    if (!bh.field_e[18]) {
                        statePc = 694;
                    } else {
                        statePc = 693;
                    }
                    continue stateLoop;
                }
                case 693: {
                    var11 = new r(3, this.field_G.field_Bb);
                    statePc = 694;
                    continue stateLoop;
                }
                case 694: {
                    if (!bh.field_e[19]) {
                        statePc = 696;
                    } else {
                        statePc = 695;
                    }
                    continue stateLoop;
                }
                case 695: {
                    var11 = new r(4, this.field_G.field_Bb);
                    statePc = 696;
                    continue stateLoop;
                }
                case 696: {
                    if (bh.field_e[20]) {
                        statePc = 699;
                    } else {
                        statePc = 700;
                    }
                    continue stateLoop;
                }
                case 699: {
                    var11 = new r(5, this.field_G.field_Bb);
                    statePc = 700;
                    continue stateLoop;
                }
                case 700: {
                    if (!bh.field_e[21]) {
                        statePc = 702;
                    } else {
                        statePc = 701;
                    }
                    continue stateLoop;
                }
                case 701: {
                    var11 = new r(6, this.field_G.field_Bb);
                    statePc = 702;
                    continue stateLoop;
                }
                case 702: {
                    if (null != var11) {
                        statePc = 705;
                    } else {
                        statePc = 715;
                    }
                    continue stateLoop;
                }
                case 705: {
                    var12 = 0;
                    statePc = 706;
                    continue stateLoop;
                }
                case 706: {
                    if ((this.field_C.length ^ -1) >= (var12 ^ -1)) {
                        statePc = 715;
                    } else {
                        statePc = 707;
                    }
                    continue stateLoop;
                }
                case 707: {
                    stackIn_732_0 = null;
                    stackIn_708_0 = stackIn_732_0;
                    stackIn_732_1 = this;
                    stackIn_708_1 = stackIn_732_1;
                    if (var19 != 0) {
                        statePc = 732;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 708: {
                    if (stackIn_708_0 == ((e) (this)).field_C[var12]) {
                        statePc = 713;
                    } else {
                        statePc = 714;
                    }
                    continue stateLoop;
                }
                case 713: {
                    this.field_C[var12] = (r) (var11);
                    ((r) (var11)).field_c = var8_ref_dl;
                    ((r) (var11)).field_H = vf.field_a;
                    ((r) (var11)).field_E = eg.field_p;
                    var8_ref_dl.field_h = (r) (var11);
                    ((r) (var11)).field_F = uf.field_c;
                    var11 = null;
                    statePc = 715;
                    continue stateLoop;
                }
                case 714: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 706;
                    } else {
                        statePc = 715;
                    }
                    continue stateLoop;
                }
                case 715: {
                    if (var11 == null) {
                        statePc = 727;
                    } else {
                        statePc = 716;
                    }
                    continue stateLoop;
                }
                case 716: {
                    var12 = 0;
                    statePc = 717;
                    continue stateLoop;
                }
                case 717: {
                    if (this.field_C.length <= var12) {
                        statePc = 727;
                    } else {
                        statePc = 718;
                    }
                    continue stateLoop;
                }
                case 718: {
                    stackIn_728_0 = this;
                    stackIn_719_0 = stackIn_728_0;
                    if (var19 != 0) {
                        statePc = 728;
                    } else {
                        statePc = 719;
                    }
                    continue stateLoop;
                }
                case 719: {
                    if (((e) (this)).field_C[var12] == null) {
                        statePc = 726;
                    } else {
                        statePc = 722;
                    }
                    continue stateLoop;
                }
                case 722: {
                    if (0 < this.field_C[var12].field_P) {
                        statePc = 726;
                    } else {
                        statePc = 725;
                    }
                    continue stateLoop;
                }
                case 725: {
                    this.field_C[var12] = (r) (var11);
                    ((r) (var11)).field_H = vf.field_a;
                    ((r) (var11)).field_c = var8_ref_dl;
                    ((r) (var11)).field_E = eg.field_p;
                    var8_ref_dl.field_h = (r) (var11);
                    ((r) (var11)).field_F = uf.field_c;
                    var11 = null;
                    statePc = 727;
                    continue stateLoop;
                }
                case 726: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 717;
                    } else {
                        statePc = 727;
                    }
                    continue stateLoop;
                }
                case 727: {
                    stackIn_728_0 = this;
                    statePc = 728;
                    continue stateLoop;
                }
                case 728: {
                    if (!((e) (this)).field_w) {
                        statePc = 731;
                    } else {
                        statePc = 729;
                    }
                    continue stateLoop;
                }
                case 729: {
                    this.field_h.c(5);
                    statePc = 731;
                    continue stateLoop;
                }
                case 731: {
                    stackIn_732_0 = null;
                    stackIn_732_1 = this;
                    statePc = 732;
                    continue stateLoop;
                }
                case 732: {
                    if (stackIn_732_0 != ((e) (this)).field_K) {
                        statePc = 741;
                    } else {
                        statePc = 733;
                    }
                    continue stateLoop;
                }
                case 733: {
                    if (this.field_J) {
                        statePc = 741;
                    } else {
                        statePc = 736;
                    }
                    continue stateLoop;
                }
                case 736: {
                    this.field_K = mk.field_f;
                    var8 = vc.field_f.b(this.field_K);
                    var9 = 24;
                    if (-321 >= (var8 ^ -1)) {
                        statePc = 739;
                    } else {
                        statePc = 740;
                    }
                    continue stateLoop;
                }
                case 739: {
                    var8 = 320;
                    statePc = 740;
                    continue stateLoop;
                }
                case 740: {
                    var9 = 24 * vc.field_f.c(this.field_K, var8);
                    l.f(320 + -(var8 / 2) + -10, 237 - (var9 / 2 - 122), var8 + 20, 8 + var9, 8388608);
                    jl.a(jc.field_G, 6 + var9 + 8, 116 + (-(var9 / 2) + 240), 20 + var8 - -6, (byte) -115, -13 + (-(var8 / 2) + 320));
                    kb.a(116, 24, var8 + (-(var8 / 2) + 320), this.field_K, -(var8 / 2) + 320, 50 + (240 + -var9 + 105), 16777215);
                    this.field_K = null;
                    statePc = 741;
                    continue stateLoop;
                }
                case 741: {
                    if (null != this.field_K) {
                        statePc = 744;
                    } else {
                        statePc = 754;
                    }
                    continue stateLoop;
                }
                case 744: {
                    jm.field_h = jm.field_h + 1;
                    stackIn_745_0 = jm.field_h ^ -1;
                    stackIn_745_1 = -101;
                    statePc = 745;
                    continue stateLoop;
                }
                case 745: {
                    if (stackIn_745_0 >= stackIn_745_1) {
                        statePc = 748;
                    } else {
                        statePc = 746;
                    }
                    continue stateLoop;
                }
                case 746: {
                    lg.field_c = this.field_k;
                    this.field_K = null;
                    sj.field_b = this.field_c;
                    jm.field_h = 0;
                    eg.field_p = this.field_E;
                    statePc = 748;
                    continue stateLoop;
                }
                case 748: {
                    var8 = vc.field_f.b(this.field_K);
                    var9 = 24;
                    if (-321 < (var8 ^ -1)) {
                        statePc = 750;
                    } else {
                        statePc = 749;
                    }
                    continue stateLoop;
                }
                case 749: {
                    var8 = 320;
                    statePc = 750;
                    continue stateLoop;
                }
                case 750: {
                    if (var8 >= og.field_f.b(jc.field_B)) {
                        statePc = 752;
                    } else {
                        statePc = 751;
                    }
                    continue stateLoop;
                }
                case 751: {
                    var8 = og.field_f.b(jc.field_B);
                    statePc = 752;
                    continue stateLoop;
                }
                case 752: {
                    var9 = 24 + 24 * vc.field_f.c(this.field_K, var8);
                    l.f(-10 + -(var8 / 2) + 320, 50 + (-28 + -(var9 / 2) + 240), var8 - -20, 8 + var9, 8388608);
                    stackIn_753_0 = jc.field_G;
                    stackIn_753_1 = var9 - -14;
                    stackIn_753_2 = 209 + (-(var9 / 2) + 50);
                    statePc = 753;
                    continue stateLoop;
                }
                case 753: {
                    jl.a(stackIn_753_0, stackIn_753_1, stackIn_753_2, var8 - -26, (byte) 103, -3 + (310 - var8 / 2));
                    vc.field_f.a(this.field_K, -(var8 / 2) + 320, 24 + (240 - var9 / 2), var8, var9, 16777215, 0, 1, 0, vc.field_f.field_s);
                    og.field_f.c(jc.field_B, 320, 24 + (var9 / 2 + 240), 16777215, -1);
                    statePc = 754;
                    continue stateLoop;
                }
                case 754: {
                    vb.field_i = 25;
                    ge.field_b = 610;
                    if (!this.field_J) {
                        statePc = 757;
                    } else {
                        statePc = 755;
                    }
                    continue stateLoop;
                }
                case 755: {
                    tf.a(vb.field_i, (byte) 29, 390, ge.field_b, true, 89);
                    statePc = 757;
                    continue stateLoop;
                }
                case 757: {
                    if (!this.field_w) {
                        statePc = 763;
                    } else {
                        statePc = 758;
                    }
                    continue stateLoop;
                }
                case 758: {
                    if (!this.field_J) {
                        statePc = 763;
                    } else {
                        statePc = 781;
                    }
                    continue stateLoop;
                }
                case 763: {
                    var8_ref_th = this.field_n;
                    var9 = 361;
                    if (!this.field_J) {
                        statePc = 766;
                    } else {
                        statePc = 767;
                    }
                    continue stateLoop;
                }
                case 766: {
                    var9 = 472;
                    statePc = 767;
                    continue stateLoop;
                }
                case 767: {
                    if (var8_ref_th == null) {
                        statePc = 781;
                    } else {
                        statePc = 768;
                    }
                    continue stateLoop;
                }
                case 768: {
                    rh.field_b[11].a(0, -14 + var9, 16, 16);
                    stackIn_782_0 = var8_ref_th.field_h;
                    stackIn_769_0 = stackIn_782_0;
                    if (var19 != 0) {
                        statePc = 782;
                    } else {
                        statePc = 769;
                    }
                    continue stateLoop;
                }
                case 769: {
                    if (stackIn_769_0) {
                        statePc = 775;
                    } else {
                        statePc = 772;
                    }
                    continue stateLoop;
                }
                case 772: {
                    var10_int = 65280;
                    if (1 != var8_ref_th.field_d / 5 % 2) {
                        statePc = 774;
                    } else {
                        statePc = 773;
                    }
                    continue stateLoop;
                }
                case 773: {
                    var10_int = 16777215;
                    statePc = 774;
                    continue stateLoop;
                }
                case 774: {
                    og.field_f.b(var8_ref_th.field_b, 21, var9, 0, -1);
                    og.field_f.b(var8_ref_th.field_b, 19, var9, 0, -1);
                    og.field_f.b(var8_ref_th.field_b, 20, var9 - -1, 0, -1);
                    og.field_f.b(var8_ref_th.field_b, 20, -1 + var9, 0, -1);
                    og.field_f.b(var8_ref_th.field_b, 20, var9, var10_int, -1);
                    if (var19 == 0) {
                        statePc = 776;
                    } else {
                        statePc = 775;
                    }
                    continue stateLoop;
                }
                case 775: {
                    var10_int = 65793 * var8_ref_th.field_d;
                    og.field_f.b(var8_ref_th.field_b, 21, var9, 0, -1);
                    og.field_f.b(var8_ref_th.field_b, 19, var9, 0, -1);
                    og.field_f.b(var8_ref_th.field_b, 20, var9 - -1, 0, -1);
                    og.field_f.b(var8_ref_th.field_b, 20, -1 + var9, 0, -1);
                    og.field_f.b(var8_ref_th.field_b, 20, var9, var10_int, -1);
                    statePc = 776;
                    continue stateLoop;
                }
                case 776: {
                    if (null != var8_ref_th) {
                        statePc = 779;
                    } else {
                        statePc = 780;
                    }
                    continue stateLoop;
                }
                case 779: {
                    var8_ref_th = var8_ref_th.field_f;
                    statePc = 780;
                    continue stateLoop;
                }
                case 780: {
                    var9 -= 16;
                    if (var19 == 0) {
                        statePc = 767;
                    } else {
                        statePc = 781;
                    }
                    continue stateLoop;
                }
                case 781: {
                    stackIn_782_0 = param1;
                    statePc = 782;
                    continue stateLoop;
                }
                case 782: {
                    if (!stackIn_782_0) {
                        statePc = 785;
                    } else {
                        statePc = 783;
                    }
                    continue stateLoop;
                }
                case 783: {
                    this.field_G.field_Eb = null;
                    statePc = 785;
                    continue stateLoop;
                }
                case 785: {
                    if (this.field_J) {
                        statePc = 788;
                    } else {
                        statePc = 797;
                    }
                    continue stateLoop;
                }
                case 788: {
                    l.d(162, 7, 364, 33, 0, 128);
                    l.b(162, 39, 364, 4473924);
                    ua.field_b.b(0, 0);
                    if (null != this.field_G.field_Eb) {
                        statePc = 791;
                    } else {
                        statePc = 797;
                    }
                    continue stateLoop;
                }
                case 791: {
                    if (this.field_G.field_Eb.length != 1) {
                        statePc = 795;
                    } else {
                        statePc = 792;
                    }
                    continue stateLoop;
                }
                case 792: {
                    og.field_f.a(this.field_G.field_Eb[0], 178, 6, 332, 33, 16777215, -1, 1, 1, 12);
                    if (var19 == 0) {
                        statePc = 797;
                    } else {
                        statePc = 795;
                    }
                    continue stateLoop;
                }
                case 795: {
                    og.field_f.a(this.field_G.field_Eb[0], 178, 6, 162, 33, 16777215, -1, 1, 1, 12);
                    l.f(344, 10, 27, 4473924);
                    og.field_f.a(this.field_G.field_Eb[1], 348, 6, 162, 33, 16777215, -1, 1, 1, 12);
                    statePc = 797;
                    continue stateLoop;
                }
                case 797: {
                    if (!this.field_b) {
                        statePc = 800;
                    } else {
                        statePc = 798;
                    }
                    continue stateLoop;
                }
                case 798: {
                    le.field_q = null;
                    statePc = 800;
                    continue stateLoop;
                }
                case 800: {
                    if (le.field_q != null) {
                        statePc = 803;
                    } else {
                        statePc = 804;
                    }
                    continue stateLoop;
                }
                case 803: {
                    le.field_q.a((byte) -100);
                    statePc = 804;
                    continue stateLoop;
                }
                case 804: {
                    if (var3_int == 0) {
                        statePc = 826;
                    } else {
                        statePc = 805;
                    }
                    continue stateLoop;
                }
                case 805: {
                    if (li.field_a) {
                        statePc = 826;
                    } else {
                        statePc = 808;
                    }
                    continue stateLoop;
                }
                case 808: {
                    var8 = 0;
                    statePc = 809;
                    continue stateLoop;
                }
                case 809: {
                    stackIn_810_0 = this.field_h;
                    statePc = 810;
                    continue stateLoop;
                }
                case 810: {
                    if ((stackIn_810_0.field_b ^ -1) >= (var8 ^ -1)) {
                        statePc = 826;
                    } else {
                        statePc = 811;
                    }
                    continue stateLoop;
                }
                case 811: {
                    if (var19 != 0) {
                        statePc = 826;
                    } else {
                        statePc = 812;
                    }
                    continue stateLoop;
                }
                case 812: {
                    var9 = 0;
                    statePc = 813;
                    continue stateLoop;
                }
                case 813: {
                    if ((this.field_h.field_e ^ -1) >= (var9 ^ -1)) {
                        statePc = 823;
                    } else {
                        statePc = 814;
                    }
                    continue stateLoop;
                }
                case 814: {
                    stackIn_810_0 = this.field_h;
                    stackIn_815_0 = stackIn_810_0;
                    if (var19 != 0) {
                        statePc = 810;
                    } else {
                        statePc = 815;
                    }
                    continue stateLoop;
                }
                case 815: {
                    var10_ref = stackIn_815_0.field_f[var8][var9];
                    statePc = 816;
                    continue stateLoop;
                }
                case 816: {
                    if (null == var10_ref) {
                        statePc = 821;
                    } else {
                        statePc = 817;
                    }
                    continue stateLoop;
                }
                case 817: {
                    var10_ref.field_p = 0;
                    var10_ref = var10_ref.field_C;
                    if (var19 != 0) {
                        statePc = 822;
                    } else {
                        statePc = 818;
                    }
                    continue stateLoop;
                }
                case 818: {
                    if (var19 == 0) {
                        statePc = 816;
                    } else {
                        statePc = 821;
                    }
                    continue stateLoop;
                }
                case 821: {
                    var9++;
                    statePc = 822;
                    continue stateLoop;
                }
                case 822: {
                    if (var19 == 0) {
                        statePc = 813;
                    } else {
                        statePc = 823;
                    }
                    continue stateLoop;
                }
                case 823: {
                    var8++;
                    if (var19 == 0) {
                        statePc = 809;
                    } else {
                        statePc = 826;
                    }
                    continue stateLoop;
                }
                case 826: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) {
        try {
            fi.field_m = null;
            ql.field_i = -1;
            ld.field_e = -1;
            og.field_d = -1;
            if (param0 != -3) {
                this.field_d = 61;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "e.G(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, ci param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = -16 + param3.field_u;
                        if (60 != param3.field_u) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5_int = -12 + param3.field_u;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = param2;
                        var6 = var6 + param3.field_p;
                        var7 = param1;
                        var7 = var7 + param3.field_v;
                        var8 = 0;
                        var9 = param3.field_p + param2;
                        var10 = param1 - -param3.field_v;
                        var11 = param3.field_t;
                        var12 = param3.field_r;
                        if (param0 == -101) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        if (l.field_d <= var7) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var14 = l.field_d + -var7;
                        var11 = var11 - var14;
                        var8 = var8 + var14 * var12;
                        var7 = l.field_d;
                        var10 = var10 + var14;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var13 = 0;
                        if (l.field_c >= var7 + var11) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var11 = var11 - (-l.field_c + (var11 + var7));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 < l.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var14 = l.field_b + -var6;
                        var13 = var13 + var14;
                        var8 = var8 + var14;
                        var12 = var12 - var14;
                        var9 = var9 + var14;
                        var6 = l.field_b;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (l.field_f < var6 + var12) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var14 = var12 + var6 - l.field_f;
                        var12 = var12 - var14;
                        var13 = var13 + var14;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (0 >= var12) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-1 <= (var11 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        var15 = var9;
                        var16 = var10;
                        var17 = -(var12 >> 193240131);
                        var12 = -(var12 & 7);
                        var7 = -var11;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0 <= var7) {
                            statePc = 85;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var18 != 0) {
                            statePc = 85;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6 = var17;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-1 >= (var6 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        incrementValue$0 = var8;
                        var8++;
                        var14 = param3.field_z[incrementValue$0];
                        stackIn_69_0 = 0;
                        stackIn_30_0 = stackIn_69_0;
                        stackIn_69_1 = var14;
                        stackIn_30_1 = stackIn_69_1;
                        if (var18 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 != stackIn_30_1) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        gd.field_a[var15][var16] = param1 + (var5_int - -(Math.abs(var15 - var9) / 2));
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var15++;
                        incrementValue$1 = var8;
                        var8++;
                        var14 = param3.field_z[incrementValue$1];
                        if (-1 == (var14 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        gd.field_a[var15][var16] = param1 + var5_int - -(Math.abs(var15 + -var9) / 2);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        incrementValue$2 = var8;
                        var8++;
                        var14 = param3.field_z[incrementValue$2];
                        var15++;
                        if ((var14 ^ -1) == -1) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        gd.field_a[var15][var16] = Math.abs(var15 - var9) / 2 + (param1 - -var5_int);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var15++;
                        incrementValue$3 = var8;
                        var8++;
                        var14 = param3.field_z[incrementValue$3];
                        if ((var14 ^ -1) != -1) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        gd.field_a[var15][var16] = Math.abs(-var9 + var15) / 2 + param1 + var5_int;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var15++;
                        var6++;
                        if (var18 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var6 = var17;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var6 >= 0) {
                            statePc = 67;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        incrementValue$4 = var8;
                        var8++;
                        var14 = param3.field_z[incrementValue$4];
                        stackIn_69_0 = -1;
                        stackIn_49_0 = stackIn_69_0;
                        stackIn_69_1 = var14 ^ -1;
                        stackIn_49_1 = stackIn_69_1;
                        if (var18 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 != stackIn_49_1) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        gd.field_a[var15][var16] = Math.abs(var15 - var9 + var17 * 8) / 2 + var5_int + param1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var15++;
                        incrementValue$5 = var8;
                        var8++;
                        var14 = param3.field_z[incrementValue$5];
                        if (-1 != (var14 ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        gd.field_a[var15][var16] = var5_int + param1 + Math.abs(var17 * 8 + (var15 - var9)) / 2;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var15++;
                        incrementValue$6 = var8;
                        var8++;
                        var14 = param3.field_z[incrementValue$6];
                        if (0 != var14) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        gd.field_a[var15][var16] = Math.abs(8 * var17 + var15 + -var9) / 2 + (param1 + var5_int);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var15++;
                        incrementValue$7 = var8;
                        var8++;
                        var14 = param3.field_z[incrementValue$7];
                        if (-1 != (var14 ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        gd.field_a[var15][var16] = param1 - -var5_int + Math.abs(var17 * 8 + var15 - var9) / 2;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var15++;
                        var6++;
                        if (var18 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var6 = var12;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = var6 ^ -1;
                        stackIn_69_1 = -1;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (stackIn_69_0 <= stackIn_69_1) {
                            statePc = 77;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        incrementValue$8 = var8;
                        var8++;
                        var14 = param3.field_z[incrementValue$8];
                        stackIn_78_0 = 0;
                        stackIn_71_0 = stackIn_78_0;
                        stackIn_78_1 = var14;
                        stackIn_71_1 = stackIn_78_1;
                        if (var18 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (stackIn_71_0 == stackIn_71_1) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        gd.field_a[var15][var16] = var5_int + (param1 - -(Math.abs(var17 * 8 + (var15 + -var9)) / 2));
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var15++;
                        var6++;
                        if (var18 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_78_0 = var8;
                        stackIn_78_1 = var13;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var8 = stackIn_78_0 + stackIn_78_1;
                        var16++;
                        var15 = var9;
                        var7++;
                        if (var18 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_83_0 = (RuntimeException) (var5);
                    stackIn_81_0 = stackIn_83_0;
                    stackIn_83_1 = new StringBuilder().append("e.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_81_1 = stackIn_83_1;
                    if (param3 == null) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_84_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_84_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_84_2 = "{...}";
                    statePc = 84;
                    continue stateLoop;
                }
                case 83: {
                    stackIn_84_0 = (RuntimeException) ((Object) stackIn_83_0);
                    stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
                    stackIn_84_2 = "null";
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    throw qk.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ')');
                }
                case 85: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, String param1, int param2) {
        th var4 = null;
        int var5 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = this.field_n;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    stackIn_17_0 = param0;

                    stackIn_17_1 = var4.field_a;

                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_17_0 == stackIn_17_1) {
                        if (0 != var4.field_b.compareTo(param1)) {
                          this.field_n = new th(param0, param1, this.field_n);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        var4 = var4.field_f;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (null != var4) {
                    break L4;
                  } else {
                    this.field_n = new th(param0, param1, this.field_n);
                    break L4;
                  }
                }
                stackIn_17_0 = param2;
                stackIn_17_1 = -3;
                break L2;
              }
              L5: {
                if (stackIn_17_0 <= stackIn_17_1) {
                  break L5;
                } else {
                  this.field_z = -33;
                  break L5;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4_ref);

            stackIn_24_1 = new StringBuilder().append("e.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
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

    private final void a(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= this.field_C.length) {
                      break L3;
                    } else {
                      if (var3 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (null == this.field_C[var2_int]) {
                            break L4;
                          } else {
                            if (null == this.field_C[var2_int].field_Z) {
                              this.field_C[var2_int].field_P = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int++;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "e.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(Terraphoenix param0, byte param1) {
        dl dupTemp$0 = null;
        dl dupTemp$1 = null;
        r stackIn_4_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        r stackIn_53_0 = null;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_91_0 = 0;
        r stackIn_94_0 = null;
        r stackIn_144_0 = null;
        r stackIn_170_0 = null;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        RuntimeException stackIn_218_0 = null;
        StringBuilder stackIn_218_1 = null;
        RuntimeException stackIn_219_0 = null;
        StringBuilder stackIn_219_1 = null;
        String stackIn_219_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        r var4_ref_r = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_L = 0;
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3_int >= 12) {
                            statePc = 13;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_53_0 = this.field_C[var3_int];
                        stackIn_4_0 = stackIn_53_0;
                        if (var7 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == null) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (this.field_C[var3_int].field_Z == null) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_C[var3_int].field_ob = false;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3_int++;
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = 100 % ((param1 - 17) / 46);
                        this.b((byte) -3);
                        this.field_D = null;
                        stackIn_16_0 = this;
                        stackIn_14_0 = stackIn_16_0;
                        if (this.field_J) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_17_0 = this;
                        stackIn_17_1 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = this;
                        stackIn_17_1 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((e) (this)).field_J = stackIn_17_1 != 0;
                        if (!this.field_J) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        jh.field_n = jh.field_n + 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (this.field_J) {
                            statePc = 64;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (12 == param0.field_Bb) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (13 == param0.field_Bb) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (Math.random() * 100.0 >= 50.0) {
                            statePc = 45;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (this.field_h.field_f[this.field_h.field_b / 2][2].field_z) {
                            statePc = 45;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (this.field_h.a(this.field_h.field_b / 2, false, 0, 2)) {
                            statePc = 45;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3_int = 0;
                        var4_ref_r = this.field_C[0];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var4_ref_r == null) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_58_0 = this.field_C.length + -1 ^ -1;
                        stackIn_39_0 = stackIn_58_0;
                        stackIn_58_1 = var3_int ^ -1;
                        stackIn_39_1 = stackIn_58_1;
                        if (var7 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 >= stackIn_39_1) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3_int++;
                        var4_ref_r = this.field_C[var3_int];
                        if (var7 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null != var4_ref_r) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        this.field_C[var3_int] = new r(4, param0.field_Bb);
                        var4_ref_r = this.field_C[var3_int];
                        var4_ref_r.field_F = this.field_h.field_b / 2;
                        var4_ref_r.field_H = 2;
                        var4_ref_r.field_c = this.field_h.field_f[this.field_h.field_b / 2][2];
                        var4_ref_r.field_c.field_h = var4_ref_r;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (50.0 <= Math.random() * 100.0) {
                            statePc = 64;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (this.field_h.field_f[2][this.field_h.field_e / 2].field_z) {
                            statePc = 64;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (this.field_h.a(2, false, 0, this.field_h.field_e / 2)) {
                            statePc = 64;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3_int = 0;
                        stackIn_53_0 = this.field_C[0];
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var4_ref_r = stackIn_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var4_ref_r == null) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_65_0 = var3_int;
                        stackIn_56_0 = stackIn_65_0;
                        if (var7 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_58_0 = stackIn_56_0;
                        stackIn_58_1 = this.field_C.length - 1;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 >= stackIn_58_1) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var3_int++;
                        var4_ref_r = this.field_C[var3_int];
                        if (var7 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var4_ref_r == null) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        this.field_C[var3_int] = new r(4, param0.field_Bb);
                        var4_ref_r = this.field_C[var3_int];
                        var4_ref_r.field_F = 2;
                        var4_ref_r.field_H = this.field_h.field_e / 2;
                        var4_ref_r.field_c = this.field_h.field_f[2][this.field_h.field_e / 2];
                        var4_ref_r.field_c.field_h = var4_ref_r;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var3_int = 0;
                        stackIn_65_0 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var5 = stackIn_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = this.field_h.field_b ^ -1;
                        stackIn_67_1 = var5 ^ -1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 >= stackIn_67_1) {
                            statePc = 90;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_91_0 = 0;
                        stackIn_69_0 = stackIn_91_0;
                        if (var7 != 0) {
                            statePc = 91;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var6 = stackIn_69_0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var6 >= this.field_h.field_e) {
                            statePc = 89;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        this.field_h.field_f[var5][var6].field_B = false;
                        stackIn_67_0 = 0;
                        stackIn_72_0 = stackIn_67_0;
                        stackIn_67_1 = this.field_h.field_f[var5][var6].field_i;
                        stackIn_72_1 = stackIn_67_1;
                        if (var7 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (stackIn_72_0 < stackIn_72_1) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (-1 <= (1 & this.field_h.field_f[var5][var6].field_i ^ -1)) {
                            statePc = 81;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (-4 == (this.field_h.field_f[var5][var6].field_g % 4 ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        dupTemp$0 = this.field_h.field_f[var5][var6];
                        dupTemp$0.field_g = dupTemp$0.field_g - 3;
                        this.field_h.field_f[var5][var6].a(1, true, 114);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (0 >= (2 & this.field_h.field_f[var5][var6].field_i)) {
                            statePc = 88;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (this.field_h.field_f[var5][var6].field_k % 4 == 3) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        dupTemp$1 = this.field_h.field_f[var5][var6];
                        dupTemp$1.field_k = dupTemp$1.field_k - 3;
                        this.field_h.field_f[var5][var6].a(2, true, 87);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var6++;
                        if (var7 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackIn_91_0 = 0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var4 = stackIn_91_0;
                        this.field_A = false;
                        var5 = 0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var5 >= this.field_C.length) {
                            statePc = 163;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_170_0 = this.field_C[var5];
                        stackIn_94_0 = stackIn_170_0;
                        if (var7 != 0) {
                            statePc = 170;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 == null) {
                            statePc = 162;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (-1 <= (this.field_C[var5].field_P ^ -1)) {
                            statePc = 162;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (null != this.field_C[var5].field_Z) {
                            statePc = 106;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (this.field_C[var5].field_C != 0) {
                            statePc = 130;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var3_int++;
                        if (this.field_z <= 0) {
                            statePc = 117;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (this.field_C[var5].field_c == null) {
                            statePc = 117;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (!this.field_C[var5].field_c.field_d) {
                            statePc = 117;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        this.field_A = true;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (this.field_C[var5].field_Z == null) {
                            statePc = 123;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (null == this.field_C[var5].field_c) {
                            statePc = 123;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        this.field_q = this.field_C[var5];
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (!this.field_J) {
                            statePc = 127;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        this.field_C[var5].b(60);
                        if (var7 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        this.field_C[var5].f(100);
                        if (var7 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if ((this.field_C[var5].field_C ^ -1) != -2) {
                            statePc = 135;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var4++;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (this.field_J) {
                            statePc = 139;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        this.field_C[var5].b(60);
                        if (var7 == 0) {
                            statePc = 141;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        this.field_C[var5].f(106);
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        this.field_C[var5].field_k = false;
                        var6 = 0;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (this.field_C.length <= var6) {
                            statePc = 162;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        stackIn_170_0 = this.field_C[var6];
                        stackIn_144_0 = stackIn_170_0;
                        if (var7 != 0) {
                            statePc = 170;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (stackIn_144_0 == null) {
                            statePc = 161;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (-1 != (this.field_C[var6].field_C ^ -1)) {
                            statePc = 161;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if ((this.field_C[var6].field_P ^ -1) >= -1) {
                            statePc = 161;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if ((this.field_C[var5].field_E ^ -1) == (this.field_C[var6].field_E ^ -1)) {
                            statePc = 158;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (!this.field_h.a((byte) -93, this.field_C[var6], this.field_C[var5])) {
                            statePc = 161;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        this.field_C[var5].field_k = true;
                        this.field_C[var5].field_h = true;
                        this.field_C[var5].field_i = this.field_C[var5].field_F;
                        this.field_C[var5].field_gb = this.field_C[var5].field_H;
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        var6++;
                        if (var7 == 0) {
                            statePc = 142;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (!this.field_J) {
                            statePc = 171;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (null != this.field_q) {
                            statePc = 169;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        lg.field_c = -(this.field_q.field_E * 48) + 16 * (this.field_q.field_F + this.field_q.field_H);
                        stackIn_170_0 = this.field_q;
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        eg.field_p = stackIn_170_0.field_E;
                        sj.field_b = 32 * (this.field_q.field_F - this.field_q.field_H);
                        this.a(-1);
                        this.field_d = this.field_d + 1;
                        this.field_m = false;
                        this.field_L = 0;
                        jm.field_h = 0;
                        this.field_k = lg.field_c;
                        this.field_E = eg.field_p;
                        this.field_c = sj.field_b;
                        this.field_K = mc.field_a + this.field_d;
                        this.field_a = this.field_q.field_F;
                        this.field_x = this.field_q.field_H;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (this.field_A) {
                            statePc = 192;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (-1 <= (this.field_z ^ -1)) {
                            statePc = 192;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        if (this.field_J) {
                            statePc = 180;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (-1 > (this.field_z ^ -1)) {
                            statePc = 183;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        this.field_z = this.field_z - 1;
                        if ((this.field_z ^ -1) >= -1) {
                            statePc = 190;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (-4 <= (this.field_z ^ -1)) {
                            statePc = 189;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        qd.a((byte) 91, 89);
                        if (var7 == 0) {
                            statePc = 192;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        qd.a((byte) 57, 90);
                        this.a(0, param0);
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if (!this.field_A) {
                            statePc = 204;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (4 <= this.field_z) {
                            statePc = 204;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (!this.field_J) {
                            statePc = 204;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        if (this.field_z <= 0) {
                            statePc = 204;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        this.field_z = 4;
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        if (-1 != (var4 ^ -1)) {
                            statePc = 208;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        if (!this.field_J) {
                            statePc = 211;
                        } else {
                            statePc = 206;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        if ((var3_int ^ -1) != -1) {
                            statePc = 213;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        this.a(-125, param0);
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        this.field_h.b((byte) -19);
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 215: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_218_0 = (RuntimeException) (var3);
                    stackIn_216_0 = stackIn_218_0;
                    stackIn_218_1 = new StringBuilder().append("e.O(");
                    stackIn_216_1 = stackIn_218_1;
                    if (param0 == null) {
                        statePc = 218;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    stackIn_219_0 = (RuntimeException) ((Object) stackIn_216_0);
                    stackIn_219_1 = (StringBuilder) ((Object) stackIn_216_1);
                    stackIn_219_2 = "{...}";
                    statePc = 219;
                    continue stateLoop;
                }
                case 218: {
                    stackIn_219_0 = (RuntimeException) ((Object) stackIn_218_0);
                    stackIn_219_1 = (StringBuilder) ((Object) stackIn_218_1);
                    stackIn_219_2 = "null";
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    throw qk.a((Throwable) ((Object) stackIn_219_0), stackIn_219_2 + ',' + param1 + ')');
                }
                case 220: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, Terraphoenix param1) {
        r dupTemp$0 = null;
        r dupTemp$1 = null;
        r dupTemp$2 = null;
        r dupTemp$3 = null;
        dl dupTemp$4 = null;
        dl dupTemp$5 = null;
        dl dupTemp$6 = null;
        dl dupTemp$7 = null;
        int stackIn_27_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        boolean stackIn_97_0 = false;
        Object stackIn_114_0 = null;
        Object stackIn_114_1 = null;
        Object stackIn_130_0 = null;
        Object stackIn_130_1 = null;
        r stackIn_149_0 = null;
        r stackIn_221_0 = null;
        boolean stackIn_236_0 = false;
        Object stackIn_254_0 = null;
        r stackIn_254_1 = null;
        Object stackIn_256_0 = null;
        r stackIn_256_1 = null;
        r stackIn_262_0 = null;
        r stackIn_272_0 = null;
        r stackIn_273_0 = null;
        r stackIn_292_0 = null;
        Object stackIn_313_0 = null;
        r stackIn_313_1 = null;
        Object stackIn_332_0 = null;
        r stackIn_332_1 = null;
        Object stackIn_333_0 = null;
        r stackIn_333_1 = null;
        r stackIn_349_0 = null;
        r stackIn_390_0 = null;
        Object stackIn_439_0 = null;
        r stackIn_439_1 = null;
        Object stackIn_494_0 = null;
        r stackIn_494_1 = null;
        int stackIn_568_0 = 0;
        Object stackIn_574_0 = null;
        Object stackIn_574_1 = null;
        Object stackIn_576_0 = null;
        r stackIn_576_1 = null;
        int stackIn_598_0 = 0;
        int stackIn_611_0 = 0;
        int stackIn_681_0 = 0;
        r stackIn_686_0 = null;
        Object stackIn_763_0 = null;
        r stackIn_763_1 = null;
        Object stackIn_797_0 = null;
        r stackIn_797_1 = null;
        Object stackIn_831_0 = null;
        Object stackIn_831_1 = null;
        Object stackIn_850_0 = null;
        Object stackIn_850_1 = null;
        Object stackIn_864_0 = null;
        Object stackIn_864_1 = null;
        Object stackIn_865_0 = null;
        r stackIn_865_1 = null;
        r stackIn_884_0 = null;
        r stackIn_909_0 = null;
        RuntimeException stackIn_927_0 = null;
        StringBuilder stackIn_927_1 = null;
        RuntimeException stackIn_929_0 = null;
        StringBuilder stackIn_929_1 = null;
        RuntimeException stackIn_930_0 = null;
        StringBuilder stackIn_930_1 = null;
        String stackIn_930_2 = null;
        Throwable caughtException = null;
        boolean stackOut_96_0;
        boolean stackOut_235_0;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        th var4 = null;
        int var5 = 0;
        int var6 = 0;
        dl var7_ref_dl = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (null != le.field_q) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    le.field_q.a(false);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    hl.field_a = false;
                    if (!this.field_u) {
                        statePc = 8;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (1 == this.field_N) {
                        statePc = 11;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.field_u = true;
                    var3_int = 0;
                    var4_int = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if ((var4_int ^ -1) <= (ak.field_q ^ -1)) {
                        statePc = 109;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var12 != 0) {
                        statePc = 110;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null == this.field_C[var4_int]) {
                        statePc = 108;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_C[var4_int].field_c != null) {
                        statePc = 108;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var3_int >= 1) {
                        statePc = 106;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var3_int++;
                    var5 = 0;
                    var6 = 1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var10 = 1;
                    var8 = (int)((double)(-var6) + (double)var6 * Math.random() * 2.0) - -uf.field_c;
                    if (1 > var8) {
                        statePc = 26;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = 1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var8 = stackIn_27_0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var9 = (int)((double)(-var6) + 2.0 * (Math.random() * (double)var6)) - -vf.field_a;
                    if ((var9 ^ -1) <= -2) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var9 = 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (-2 + this.field_h.field_b < var8) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var8 = -2 + this.field_h.field_b;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (this.field_h.field_e - 2 >= var9) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var9 = this.field_h.field_e - 2;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    this.field_C[var4_int].field_F = var8;
                    var5++;
                    this.field_C[var4_int].field_H = var9;
                    var7_ref_dl = this.field_h.a(109, this.field_C[var4_int].field_H, 0, this.field_C[var4_int].field_F);
                    if (var5 <= 10) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var5 = 0;
                    var6++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (2 != this.field_h.field_a) {
                        statePc = 68;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.field_C[var4_int].a(true, this.field_h.field_b / 2, this.field_h.field_e / 2);
                    dupTemp$0 = this.field_C[var4_int];
                    dupTemp$0.field_U = dupTemp$0.field_U + 4;
                    if (8 <= this.field_C[var4_int].field_U) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    dupTemp$1 = this.field_C[var4_int];
                    dupTemp$1.field_U = dupTemp$1.field_U - 8;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var11 = this.field_h.field_b / 4;
                    if (param1.field_Bb == 11) {
                        statePc = 48;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var11 = this.field_h.field_b / 8 - -1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var8 < -var11 + this.field_h.field_b / 2) {
                        statePc = 59;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if ((var8 ^ -1) < (var11 + this.field_h.field_b / 2 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (this.field_h.field_e / 2 + -var11 > var9) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if ((this.field_h.field_e / 2 - -var11 ^ -1) <= (var9 ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var10 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var9 >= this.field_h.field_e / 2 + -var11 + 3) {
                        statePc = 68;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (this.field_h.field_b / 2 - 1 > var8) {
                        statePc = 68;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if ((var8 ^ -1) < (this.field_h.field_b / 2 - -1 ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var10 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (this.field_h.field_a == 3) {
                        statePc = 71;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 71: {
                    this.field_C[var4_int].a(true, this.field_h.field_b / 2, this.field_h.field_e / 2);
                    if ((var8 ^ -1) >= (this.field_h.field_b / 8 ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if ((this.field_h.field_b * 7 / 8 ^ -1) >= (var8 ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (this.field_h.field_e / 8 >= var9) {
                        statePc = 82;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((this.field_h.field_e * 7 / 8 ^ -1) >= (var9 ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var10 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (-5 == (this.field_h.field_a ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (1 == this.field_h.field_a) {
                        statePc = 88;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_C[var4_int].a(true, this.field_h.field_b / 2, this.field_h.field_e / 2);
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if ((this.field_h.field_f[this.field_C[var4_int].field_F][this.field_C[var4_int].field_H].field_v ^ -1) > -4) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var10 = 0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    stackIn_94_0 = 0;
                    stackIn_92_0 = stackIn_94_0;
                    if (var10 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackIn_95_0 = stackIn_92_0;
                    stackIn_95_1 = 1;
                    statePc = 95;
                    continue stateLoop;
                }
                case 94: {
                    stackIn_95_0 = stackIn_94_0;
                    stackIn_95_1 = 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (stackIn_95_0 != stackIn_95_1) {
                        statePc = 24;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackOut_96_0 = this.field_h.a(this.field_C[var4_int].field_F, false, 0, this.field_C[var4_int].field_H);
                    stackIn_27_0 = stackOut_96_0 ? 1 : 0;
                    stackIn_97_0 = stackOut_96_0;
                    if (var12 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (stackIn_97_0) {
                        statePc = 24;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var7_ref_dl.field_d) {
                        statePc = 24;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    this.field_h.field_f[this.field_C[var4_int].field_F][this.field_C[var4_int].field_H].field_h = this.field_C[var4_int];
                    this.field_C[var4_int].field_c = this.field_h.field_f[this.field_C[var4_int].field_F][this.field_C[var4_int].field_H];
                    this.field_q = this.field_C[var4_int];
                    lg.field_c = 16 * (this.field_q.field_F - -this.field_q.field_H);
                    eg.field_p = this.field_q.field_E;
                    sj.field_b = (-this.field_q.field_H + this.field_q.field_F) * 32;
                    if (null == this.field_C[var4_int].field_nb) {
                        statePc = 103;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    qd.a((byte) 114, od.field_c[this.field_C[var4_int].field_nb.field_g].field_n);
                    if (var12 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    qd.a((byte) 127, od.field_c[this.field_C[var4_int].field_eb.field_g].field_n);
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    this.a(-1);
                    if (var12 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    this.field_u = false;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    var4_int++;
                    if (var12 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    this.field_u = false;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    return;
                }
                case 111: {
                    var3_int = 1;
                    var4_int = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (-13 >= (var4_int ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_130_0 = null;
                    stackIn_114_0 = stackIn_130_0;
                    stackIn_130_1 = this;
                    stackIn_114_1 = stackIn_130_1;
                    if (var12 != 0) {
                        statePc = 130;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (stackIn_114_0 == ((e) (this)).field_C[var4_int]) {
                        statePc = 124;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if ((this.field_C[var4_int].field_P ^ -1) >= -1) {
                        statePc = 124;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (this.field_C[var4_int].field_Z == null) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var3_int = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    var4_int++;
                    if (var12 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (var3_int != 0) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    this.a(29518, 2);
                    this.a(-1, rf.field_s, -41);
                    this.field_b = true;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    stackIn_130_0 = null;
                    stackIn_130_1 = this;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (stackIn_130_0 == ((e) (this)).field_n) {
                        statePc = 139;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (!this.field_n.field_h) {
                        statePc = 139;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if ((this.field_n.field_d ^ -1) < -1) {
                        statePc = 139;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    this.field_n = this.field_n.field_f;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var4 = this.field_n;
                    if (var4 != null) {
                        statePc = 234;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (this.field_b) {
                        statePc = 145;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (!this.field_v) {
                        statePc = 180;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var5 = 0;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if ((var5 ^ -1) <= (this.field_C.length ^ -1)) {
                        statePc = 180;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    stackIn_221_0 = this.field_C[var5];
                    stackIn_149_0 = stackIn_221_0;
                    if (var12 != 0) {
                        statePc = 221;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (stackIn_149_0 == null) {
                        statePc = 163;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (this.field_C[var5].field_Z == null) {
                        statePc = 157;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (0 < this.field_C[var5].field_P) {
                        statePc = 161;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    this.field_C[var5].field_nb = null;
                    this.field_C[var5].field_b = null;
                    if (var12 == 0) {
                        statePc = 163;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    this.field_C[var5] = null;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    if (this.field_C[var5] == null) {
                        statePc = 179;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (null != this.field_C[var5].field_Z) {
                        statePc = 169;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (-1 > (this.field_C[var5].field_P ^ -1)) {
                        statePc = 179;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if ((this.field_C[var5].field_P + this.field_C[var5].field_T ^ -1) >= -1) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    this.field_e.field_f = this.field_e.field_f + 1;
                    if (var12 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    this.field_e.field_k = this.field_e.field_k + 1;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    this.field_C[var5] = null;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (!this.field_r) {
                        statePc = 232;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var5 = 0;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if ((var5 ^ -1) <= (this.field_C.length ^ -1)) {
                        statePc = 232;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var12 != 0) {
                        statePc = 233;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (null == this.field_C[var5]) {
                        statePc = 220;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (this.field_C[var5].field_c.field_d) {
                        statePc = 192;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (this.field_C[var5].field_Z != null) {
                        statePc = 211;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if ((this.field_C[var5].field_P ^ -1) >= -1) {
                        statePc = 198;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if ((this.field_C[var5].field_t ^ -1) != -5) {
                        statePc = 201;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (-10 == (this.field_C[var5].field_t ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    if (var12 == 0) {
                        statePc = 207;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    this.field_e.field_m = this.field_e.field_m + 1;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (-5 == (this.field_C[var5].field_t ^ -1)) {
                        statePc = 210;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 210: {
                    this.field_e.field_b = this.field_e.field_b + 1;
                    if (var12 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if ((this.field_C[var5].field_T + this.field_C[var5].field_P ^ -1) < -1) {
                        statePc = 217;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    this.field_e.field_k = this.field_e.field_k + 1;
                    if (var12 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    this.field_e.field_h = this.field_e.field_h + 1;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    this.field_C[var5] = null;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    stackIn_221_0 = this.field_C[var5];
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (stackIn_221_0 == null) {
                        statePc = 231;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (this.field_C[var5].field_Z != null) {
                        statePc = 231;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (-1 > (this.field_C[var5].field_P ^ -1)) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    this.field_C[var5] = null;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    this.a(41, param1);
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    return;
                }
                case 234: {
                    if (null == var4) {
                        statePc = 567;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    stackOut_235_0 = this.field_b;
                    stackIn_568_0 = stackOut_235_0 ? 1 : 0;
                    stackIn_236_0 = stackOut_235_0;
                    if (var12 != 0) {
                        statePc = 568;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (stackIn_236_0) {
                        statePc = 240;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var4.field_h = true;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (param1.field_Bb > 0) {
                        statePc = 245;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (var4.field_a != 1) {
                        statePc = 536;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (var4.field_h) {
                        statePc = 536;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (-1 != (var4.field_a ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var5 = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if (-13 >= (var5 ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    stackIn_494_0 = null;
                    stackIn_254_0 = stackIn_494_0;
                    stackIn_494_1 = this.field_C[var5];
                    stackIn_254_1 = stackIn_494_1;
                    if (var12 != 0) {
                        statePc = 494;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    stackIn_256_0 = stackIn_254_0;
                    stackIn_256_1 = (r) ((Object) stackIn_254_1);
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    if (stackIn_256_0 == stackIn_256_1) {
                        statePc = 266;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (null == this.field_C[var5].field_Z) {
                        statePc = 266;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    stackIn_262_0 = this.field_C[var5];
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if ((stackIn_262_0.field_c.field_C.field_v ^ -1) != 0) {
                        statePc = 265;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 265: {
                    this.a(29518, 0);
                    var5 = 12;
                    this.a(1, pl.field_G, -84);
                    if (var12 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (-2 == (var4.field_a ^ -1)) {
                        statePc = 269;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var3_int = 1;
                    var5 = 0;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    if ((var5 ^ -1) <= (this.field_C.length ^ -1)) {
                        statePc = 282;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    stackIn_272_0 = this.field_C[var5];
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    stackIn_262_0 = (r) ((Object) stackIn_272_0);
                    stackIn_273_0 = stackIn_262_0;
                    if (var12 != 0) {
                        statePc = 262;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (stackIn_273_0 == null) {
                        statePc = 281;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (this.field_C[var5].field_P <= 0) {
                        statePc = 281;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (-2 != (this.field_C[var5].field_C ^ -1)) {
                        statePc = 281;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var3_int = 0;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 270;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (var3_int != 0) {
                        statePc = 285;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 285: {
                    this.a(29518, 1);
                    this.field_b = true;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (-3 == (var4.field_a ^ -1)) {
                        statePc = 289;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 289: {
                    var3_int = 1;
                    var5 = 0;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    if (-13 >= (var5 ^ -1)) {
                        statePc = 303;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackIn_272_0 = this.field_C[var5];
                    stackIn_292_0 = stackIn_272_0;
                    if (var12 != 0) {
                        statePc = 272;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if (stackIn_292_0 == null) {
                        statePc = 302;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    if (this.field_C[var5].field_P <= 0) {
                        statePc = 302;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (this.field_C[var5].field_Z != null) {
                        statePc = 301;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var3_int = 0;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 290;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if (var3_int != 0) {
                        statePc = 306;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 306: {
                    this.a(29518, 2);
                    this.a(-1, rf.field_s, -8);
                    this.field_b = true;
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    if ((var4.field_a ^ -1) == -4) {
                        statePc = 310;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 310: {
                    var5 = 0;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    if (var5 >= this.field_C.length) {
                        statePc = 328;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    stackIn_332_0 = null;
                    stackIn_313_0 = stackIn_332_0;
                    stackIn_332_1 = this.field_C[var5];
                    stackIn_313_1 = stackIn_332_1;
                    if (var12 != 0) {
                        statePc = 332;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (stackIn_313_0 == stackIn_313_1) {
                        statePc = 327;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (6 != this.field_C[var5].field_t) {
                        statePc = 327;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (this.field_C[var5].field_k) {
                        statePc = 325;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if ((this.field_C[var5].field_P ^ -1) < -1) {
                        statePc = 327;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    this.a(param0 ^ -29519, 3);
                    this.a(9, ki.field_Z, -7);
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (-10 != (var4.field_a ^ -1)) {
                        statePc = 344;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    var5 = 0;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    if (this.field_C.length <= var5) {
                        statePc = 344;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    stackIn_332_0 = null;
                    stackIn_332_1 = this.field_C[var5];
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    stackIn_313_0 = stackIn_332_0;
                    stackIn_333_0 = stackIn_313_0;
                    stackIn_313_1 = (r) ((Object) stackIn_332_1);
                    stackIn_333_1 = stackIn_313_1;
                    if (var12 != 0) {
                        statePc = 313;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    if (stackIn_333_0 == stackIn_333_1) {
                        statePc = 343;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if (!this.field_C[var5].field_s) {
                        statePc = 343;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    if (null != this.field_C[var5].field_Z) {
                        statePc = 342;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 342: {
                    this.a(29518, 9);
                    this.a(4, ch.field_h, -110);
                    statePc = 343;
                    continue stateLoop;
                }
                case 343: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 330;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    if (-5 == (var4.field_a ^ -1)) {
                        statePc = 346;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 346: {
                    var3_int = 1;
                    var5 = 0;
                    var6 = 0;
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    if (var6 >= 12) {
                        statePc = 379;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    stackIn_686_0 = this.field_C[var6];
                    stackIn_349_0 = stackIn_686_0;
                    if (var12 != 0) {
                        statePc = 686;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    if (stackIn_349_0 == null) {
                        statePc = 365;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    if (this.field_C[var6].field_P <= 0) {
                        statePc = 365;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    if (!this.field_C[var6].field_s) {
                        statePc = 365;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    if (this.field_C[var6].field_Z == null) {
                        statePc = 365;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    if (this.field_C[var6].field_c.field_d) {
                        statePc = 365;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    var5 = 1;
                    statePc = 365;
                    continue stateLoop;
                }
                case 365: {
                    if (null == this.field_C[var6]) {
                        statePc = 378;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    if ((this.field_C[var6].field_P ^ -1) >= -1) {
                        statePc = 378;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    if (null == this.field_C[var6].field_Z) {
                        statePc = 378;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    if (this.field_C[var6].field_c.field_d) {
                        statePc = 377;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 377: {
                    var3_int = 0;
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 347;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    this.field_h.field_m = 1;
                    if (var3_int == 0) {
                        statePc = 386;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    if (var5 != 0) {
                        statePc = 385;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 385: {
                    this.a(29518, 4);
                    this.field_b = true;
                    this.field_v = true;
                    statePc = 386;
                    continue stateLoop;
                }
                case 386: {
                    if ((var4.field_a ^ -1) != -6) {
                        statePc = 433;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    var3_int = 1;
                    var5 = 0;
                    var6 = 0;
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    if (-13 >= (var6 ^ -1)) {
                        statePc = 426;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    stackIn_686_0 = this.field_C[var6];
                    stackIn_390_0 = stackIn_686_0;
                    if (var12 != 0) {
                        statePc = 686;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    if (stackIn_390_0 == null) {
                        statePc = 408;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    if ((this.field_C[var6].field_P ^ -1) >= -1) {
                        statePc = 408;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    if (null == this.field_C[var6].field_Z) {
                        statePc = 408;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    if (Math.abs(-(this.field_h.field_b / 2) + this.field_C[var6].field_F) >= this.field_h.field_b / 2 + -5) {
                        statePc = 408;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    if ((Math.abs(-(this.field_h.field_e / 2) + this.field_C[var6].field_H) ^ -1) > (this.field_h.field_e / 2 + -5 ^ -1)) {
                        statePc = 407;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 407: {
                    var3_int = 0;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    if (this.field_C[var6] == null) {
                        statePc = 425;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    if (-1 <= (this.field_C[var6].field_P ^ -1)) {
                        statePc = 425;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    if (!this.field_C[var6].field_s) {
                        statePc = 425;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    if (this.field_C[var6].field_Z == null) {
                        statePc = 425;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    if (Math.abs(this.field_C[var6].field_F + -(this.field_h.field_b / 2)) >= -5 + this.field_h.field_b / 2) {
                        statePc = 424;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    if (Math.abs(-(this.field_h.field_e / 2) + this.field_C[var6].field_H) < -5 + this.field_h.field_e / 2) {
                        statePc = 425;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    var5 = 1;
                    statePc = 425;
                    continue stateLoop;
                }
                case 425: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 388;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 426: {
                    this.field_h.field_m = 2;
                    if (var3_int == 0) {
                        statePc = 433;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 427: {
                    if (var5 != 0) {
                        statePc = 432;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 432: {
                    this.a(29518, 5);
                    this.field_v = true;
                    this.field_b = true;
                    statePc = 433;
                    continue stateLoop;
                }
                case 433: {
                    if (6 == var4.field_a) {
                        statePc = 436;
                    } else {
                        statePc = 488;
                    }
                    continue stateLoop;
                }
                case 436: {
                    var3_int = 1;
                    var5 = 0;
                    var6 = 0;
                    statePc = 437;
                    continue stateLoop;
                }
                case 437: {
                    if (12 <= var6) {
                        statePc = 481;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    stackIn_576_0 = null;
                    stackIn_439_0 = stackIn_576_0;
                    stackIn_576_1 = this.field_C[var6];
                    stackIn_439_1 = stackIn_576_1;
                    if (var12 != 0) {
                        statePc = 576;
                    } else {
                        statePc = 439;
                    }
                    continue stateLoop;
                }
                case 439: {
                    if (stackIn_439_0 == stackIn_439_1) {
                        statePc = 463;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 442: {
                    if (-1 <= (this.field_C[var6].field_P ^ -1)) {
                        statePc = 463;
                    } else {
                        statePc = 445;
                    }
                    continue stateLoop;
                }
                case 445: {
                    if (this.field_C[var6].field_Z == null) {
                        statePc = 463;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    if (1 != this.field_C[var6].field_E) {
                        statePc = 463;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 451: {
                    if ((this.field_C[var6].field_F ^ -1) < -13) {
                        statePc = 463;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    if (this.field_C[var6].field_H > 12) {
                        statePc = 463;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 457: {
                    if (this.field_C[var6].field_s) {
                        statePc = 462;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 462: {
                    var5 = 1;
                    statePc = 463;
                    continue stateLoop;
                }
                case 463: {
                    if (this.field_C[var6] == null) {
                        statePc = 480;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 464: {
                    if ((this.field_C[var6].field_P ^ -1) >= -1) {
                        statePc = 480;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 467: {
                    if (null == this.field_C[var6].field_Z) {
                        statePc = 480;
                    } else {
                        statePc = 470;
                    }
                    continue stateLoop;
                }
                case 470: {
                    if ((this.field_C[var6].field_E ^ -1) != -2) {
                        statePc = 479;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 473: {
                    if (-13 > (this.field_C[var6].field_F ^ -1)) {
                        statePc = 479;
                    } else {
                        statePc = 476;
                    }
                    continue stateLoop;
                }
                case 476: {
                    if (-13 <= (this.field_C[var6].field_H ^ -1)) {
                        statePc = 480;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 479: {
                    var3_int = 0;
                    statePc = 480;
                    continue stateLoop;
                }
                case 480: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    this.field_h.field_m = 3;
                    if (var3_int == 0) {
                        statePc = 488;
                    } else {
                        statePc = 482;
                    }
                    continue stateLoop;
                }
                case 482: {
                    if (var5 != 0) {
                        statePc = 487;
                    } else {
                        statePc = 488;
                    }
                    continue stateLoop;
                }
                case 487: {
                    this.a(param0 ^ -29519, 6);
                    this.field_v = true;
                    this.field_b = true;
                    statePc = 488;
                    continue stateLoop;
                }
                case 488: {
                    if ((var4.field_a ^ -1) == -8) {
                        statePc = 491;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 491: {
                    this.field_h.field_m = 4;
                    var5 = 0;
                    statePc = 492;
                    continue stateLoop;
                }
                case 492: {
                    if (-13 >= (var5 ^ -1)) {
                        statePc = 510;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 493: {
                    stackIn_332_0 = null;
                    stackIn_494_0 = stackIn_332_0;
                    stackIn_332_1 = this.field_C[var5];
                    stackIn_494_1 = stackIn_332_1;
                    if (var12 != 0) {
                        statePc = 332;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 494: {
                    if (stackIn_494_0 == stackIn_494_1) {
                        statePc = 509;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    if ((this.field_C[var5].field_P ^ -1) >= -1) {
                        statePc = 509;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 498: {
                    if (!this.field_C[var5].field_s) {
                        statePc = 509;
                    } else {
                        statePc = 501;
                    }
                    continue stateLoop;
                }
                case 501: {
                    if (null == this.field_C[var5].field_Z) {
                        statePc = 509;
                    } else {
                        statePc = 504;
                    }
                    continue stateLoop;
                }
                case 504: {
                    if (-3 != (this.field_C[var5].field_E ^ -1)) {
                        statePc = 509;
                    } else {
                        statePc = 507;
                    }
                    continue stateLoop;
                }
                case 507: {
                    this.a(29518, 7);
                    dd.field_M = 8;
                    this.a(4, va.field_j, param0 + -13);
                    statePc = 509;
                    continue stateLoop;
                }
                case 509: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 492;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    if (-9 == (var4.field_a ^ -1)) {
                        statePc = 513;
                    } else {
                        statePc = 536;
                    }
                    continue stateLoop;
                }
                case 513: {
                    if (3 != this.field_z) {
                        statePc = 519;
                    } else {
                        statePc = 514;
                    }
                    continue stateLoop;
                }
                case 514: {
                    if (var4.field_b == vk.field_a) {
                        statePc = 519;
                    } else {
                        statePc = 517;
                    }
                    continue stateLoop;
                }
                case 517: {
                    var4.field_b = vk.field_a;
                    var4.field_d = 0;
                    statePc = 519;
                    continue stateLoop;
                }
                case 519: {
                    if (2 != this.field_z) {
                        statePc = 526;
                    } else {
                        statePc = 520;
                    }
                    continue stateLoop;
                }
                case 520: {
                    if (fc.field_h != var4.field_b) {
                        statePc = 525;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 525: {
                    var4.field_b = fc.field_h;
                    var4.field_d = 0;
                    statePc = 526;
                    continue stateLoop;
                }
                case 526: {
                    if (-2 != (this.field_z ^ -1)) {
                        statePc = 532;
                    } else {
                        statePc = 527;
                    }
                    continue stateLoop;
                }
                case 527: {
                    if (var4.field_b == jm.field_a) {
                        statePc = 532;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 530: {
                    var4.field_d = 0;
                    var4.field_b = jm.field_a;
                    statePc = 532;
                    continue stateLoop;
                }
                case 532: {
                    if (-1 == (this.field_z ^ -1)) {
                        statePc = 535;
                    } else {
                        statePc = 536;
                    }
                    continue stateLoop;
                }
                case 535: {
                    this.a(29518, 8);
                    this.a(-1, rf.field_s, -104);
                    this.field_b = true;
                    this.field_r = true;
                    statePc = 536;
                    continue stateLoop;
                }
                case 536: {
                    if (null == var4.field_f) {
                        statePc = 545;
                    } else {
                        statePc = 537;
                    }
                    continue stateLoop;
                }
                case 537: {
                    if (!var4.field_f.field_h) {
                        statePc = 545;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 540: {
                    if (-1 > (var4.field_f.field_d ^ -1)) {
                        statePc = 545;
                    } else {
                        statePc = 543;
                    }
                    continue stateLoop;
                }
                case 543: {
                    var4.field_f = var4.field_f.field_f;
                    statePc = 545;
                    continue stateLoop;
                }
                case 545: {
                    if (var4.field_h) {
                        statePc = 558;
                    } else {
                        statePc = 546;
                    }
                    continue stateLoop;
                }
                case 546: {
                    if ((var4.field_d ^ -1) <= -251) {
                        statePc = 552;
                    } else {
                        statePc = 549;
                    }
                    continue stateLoop;
                }
                case 549: {
                    var4.field_d = var4.field_d + 1;
                    if (var12 == 0) {
                        statePc = 563;
                    } else {
                        statePc = 552;
                    }
                    continue stateLoop;
                }
                case 552: {
                    if (le.field_q == null) {
                        statePc = 563;
                    } else {
                        statePc = 555;
                    }
                    continue stateLoop;
                }
                case 555: {
                    var4.field_d = 0;
                    if (var12 == 0) {
                        statePc = 563;
                    } else {
                        statePc = 558;
                    }
                    continue stateLoop;
                }
                case 558: {
                    if ((var4.field_d ^ -1) >= -1) {
                        statePc = 563;
                    } else {
                        statePc = 561;
                    }
                    continue stateLoop;
                }
                case 561: {
                    var4.field_d = var4.field_d - 1;
                    statePc = 563;
                    continue stateLoop;
                }
                case 563: {
                    if (null != var4) {
                        statePc = 566;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 566: {
                    var4 = var4.field_f;
                    if (var12 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 567;
                    }
                    continue stateLoop;
                }
                case 567: {
                    stackIn_568_0 = ja.field_n;
                    statePc = 568;
                    continue stateLoop;
                }
                case 568: {
                    if (stackIn_568_0 <= 0) {
                        statePc = 571;
                    } else {
                        statePc = 569;
                    }
                    continue stateLoop;
                }
                case 569: {
                    ja.field_n = ja.field_n - 1;
                    statePc = 571;
                    continue stateLoop;
                }
                case 571: {
                    var6 = 0;
                    var5 = 0;
                    statePc = 572;
                    continue stateLoop;
                }
                case 572: {
                    if ((var5 ^ -1) <= (this.field_C.length ^ -1)) {
                        statePc = 830;
                    } else {
                        statePc = 573;
                    }
                    continue stateLoop;
                }
                case 573: {
                    stackIn_831_0 = null;
                    stackIn_574_0 = stackIn_831_0;
                    stackIn_831_1 = this;
                    stackIn_574_1 = stackIn_831_1;
                    if (var12 != 0) {
                        statePc = 831;
                    } else {
                        statePc = 574;
                    }
                    continue stateLoop;
                }
                case 574: {
                    stackIn_576_0 = stackIn_574_0;
                    stackIn_576_1 = ((e) (this)).field_C[var5];
                    statePc = 576;
                    continue stateLoop;
                }
                case 576: {
                    if (stackIn_576_0 == stackIn_576_1) {
                        statePc = 829;
                    } else {
                        statePc = 577;
                    }
                    continue stateLoop;
                }
                case 577: {
                    if (0 >= this.field_C[var5].field_cb) {
                        statePc = 582;
                    } else {
                        statePc = 580;
                    }
                    continue stateLoop;
                }
                case 580: {
                    dupTemp$2 = this.field_C[var5];
                    dupTemp$2.field_cb = dupTemp$2.field_cb - 8;
                    statePc = 582;
                    continue stateLoop;
                }
                case 582: {
                    if (this.field_C[var5].field_ib) {
                        statePc = 668;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 583: {
                    if (this.field_C[var5].field_Z != null) {
                        statePc = 645;
                    } else {
                        statePc = 586;
                    }
                    continue stateLoop;
                }
                case 586: {
                    if (-8 == (this.field_C[var5].field_t ^ -1)) {
                        statePc = 668;
                    } else {
                        statePc = 589;
                    }
                    continue stateLoop;
                }
                case 589: {
                    if (!this.field_J) {
                        statePc = 618;
                    } else {
                        statePc = 592;
                    }
                    continue stateLoop;
                }
                case 592: {
                    if (this.field_C[var5].field_k) {
                        statePc = 597;
                    } else {
                        statePc = 595;
                    }
                    continue stateLoop;
                }
                case 595: {
                    stackIn_598_0 = 1;
                    statePc = 598;
                    continue stateLoop;
                }
                case 597: {
                    stackIn_598_0 = 0;
                    statePc = 598;
                    continue stateLoop;
                }
                case 598: {
                    if (stackIn_598_0 == 1) {
                        statePc = 618;
                    } else {
                        statePc = 599;
                    }
                    continue stateLoop;
                }
                case 599: {
                    if (this.field_q == null) {
                        statePc = 618;
                    } else {
                        statePc = 602;
                    }
                    continue stateLoop;
                }
                case 602: {
                    if (this.field_q.field_B == 1) {
                        statePc = 612;
                    } else {
                        statePc = 605;
                    }
                    continue stateLoop;
                }
                case 605: {
                    if (this.field_q.field_S) {
                        statePc = 610;
                    } else {
                        statePc = 608;
                    }
                    continue stateLoop;
                }
                case 608: {
                    stackIn_611_0 = 1;
                    statePc = 611;
                    continue stateLoop;
                }
                case 610: {
                    stackIn_611_0 = 0;
                    statePc = 611;
                    continue stateLoop;
                }
                case 611: {
                    if (stackIn_611_0 == 0) {
                        statePc = 618;
                    } else {
                        statePc = 612;
                    }
                    continue stateLoop;
                }
                case 612: {
                    if (-1 <= (this.field_C[var5].field_P ^ -1)) {
                        statePc = 618;
                    } else {
                        statePc = 615;
                    }
                    continue stateLoop;
                }
                case 615: {
                    if (this.field_h.a((byte) -93, this.field_q, this.field_C[var5])) {
                        statePc = 621;
                    } else {
                        statePc = 618;
                    }
                    continue stateLoop;
                }
                case 618: {
                    this.field_C[var5].field_p = 0;
                    if (var12 == 0) {
                        statePc = 668;
                    } else {
                        statePc = 621;
                    }
                    continue stateLoop;
                }
                case 621: {
                    if (!this.field_J) {
                        statePc = 638;
                    } else {
                        statePc = 624;
                    }
                    continue stateLoop;
                }
                case 624: {
                    if (this.field_q == null) {
                        statePc = 638;
                    } else {
                        statePc = 627;
                    }
                    continue stateLoop;
                }
                case 627: {
                    if ((this.field_q.field_d ^ -1) == -1) {
                        statePc = 633;
                    } else {
                        statePc = 630;
                    }
                    continue stateLoop;
                }
                case 630: {
                    if (1 != this.field_q.field_d) {
                        statePc = 638;
                    } else {
                        statePc = 633;
                    }
                    continue stateLoop;
                }
                case 633: {
                    if (-1 == (this.field_q.field_B ^ -1)) {
                        statePc = 638;
                    } else {
                        statePc = 636;
                    }
                    continue stateLoop;
                }
                case 636: {
                    this.field_q.field_X = this.field_q.field_F;
                    this.field_q.field_n = this.field_q.field_H;
                    this.field_q.field_r = null;
                    statePc = 638;
                    continue stateLoop;
                }
                case 638: {
                    if (!this.field_C[var5].field_l) {
                        statePc = 641;
                    } else {
                        statePc = 644;
                    }
                    continue stateLoop;
                }
                case 641: {
                    this.field_C[var5].field_l = true;
                    this.field_a = this.field_C[var5].field_F;
                    this.field_x = this.field_C[var5].field_H;
                    this.field_k = lg.field_c;
                    this.field_c = sj.field_b;
                    this.field_E = eg.field_p;
                    eg.field_p = this.field_C[var5].field_E;
                    this.field_K = ib.field_X;
                    if (-2 < (this.field_C[var5].field_t ^ -1)) {
                        statePc = 644;
                    } else {
                        statePc = 642;
                    }
                    continue stateLoop;
                }
                case 642: {
                    this.field_K = p.field_d;
                    statePc = 644;
                    continue stateLoop;
                }
                case 644: {
                    this.field_C[var5].field_ib = true;
                    qd.a((byte) 26, 3);
                    if (var12 == 0) {
                        statePc = 668;
                    } else {
                        statePc = 645;
                    }
                    continue stateLoop;
                }
                case 645: {
                    if (0 < this.field_C[var5].field_P) {
                        statePc = 660;
                    } else {
                        statePc = 648;
                    }
                    continue stateLoop;
                }
                case 648: {
                    if (null != this.field_K) {
                        statePc = 660;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 651: {
                    param1.field_Y = false;
                    dupTemp$3 = this.field_C[var5];
                    dupTemp$3.field_p = dupTemp$3.field_p + 1;
                    if (-26 > (this.field_C[var5].field_p ^ -1)) {
                        statePc = 656;
                    } else {
                        statePc = 668;
                    }
                    continue stateLoop;
                }
                case 656: {
                    this.field_a = this.field_C[var5].field_F;
                    this.field_x = this.field_C[var5].field_H;
                    this.field_c = sj.field_b;
                    this.field_k = lg.field_c;
                    this.field_E = eg.field_p;
                    eg.field_p = this.field_C[var5].field_E;
                    this.field_K = this.field_C[var5].field_Z.b(1) + aa.field_r;
                    if (-1 <= (this.field_C[var5].field_T ^ -1)) {
                        statePc = 659;
                    } else {
                        statePc = 657;
                    }
                    continue stateLoop;
                }
                case 657: {
                    this.field_K = this.field_C[var5].field_Z.b(1) + d.field_O;
                    statePc = 659;
                    continue stateLoop;
                }
                case 659: {
                    this.field_C[var5].field_ib = true;
                    qd.a((byte) 126, 3);
                    if (var12 == 0) {
                        statePc = 668;
                    } else {
                        statePc = 660;
                    }
                    continue stateLoop;
                }
                case 660: {
                    if (-1 > (this.field_C[var5].field_P ^ -1)) {
                        statePc = 666;
                    } else {
                        statePc = 663;
                    }
                    continue stateLoop;
                }
                case 663: {
                    this.field_C[var5].field_p = 26;
                    if (var12 == 0) {
                        statePc = 668;
                    } else {
                        statePc = 666;
                    }
                    continue stateLoop;
                }
                case 666: {
                    this.field_C[var5].field_p = 0;
                    statePc = 668;
                    continue stateLoop;
                }
                case 668: {
                    if (7 == this.field_C[var5].field_t) {
                        statePc = 685;
                    } else {
                        statePc = 669;
                    }
                    continue stateLoop;
                }
                case 669: {
                    if (this.field_C[var5].field_Z == null) {
                        statePc = 674;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 674: {
                    if (this.field_C[var5].field_d != 5) {
                        statePc = 685;
                    } else {
                        statePc = 675;
                    }
                    continue stateLoop;
                }
                case 675: {
                    if (this.field_C[var5].field_S) {
                        statePc = 680;
                    } else {
                        statePc = 678;
                    }
                    continue stateLoop;
                }
                case 678: {
                    stackIn_681_0 = 1;
                    statePc = 681;
                    continue stateLoop;
                }
                case 680: {
                    stackIn_681_0 = 0;
                    statePc = 681;
                    continue stateLoop;
                }
                case 681: {
                    if (stackIn_681_0 == 1) {
                        statePc = 684;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 684: {
                    this.field_C[var5].field_d = 6;
                    statePc = 685;
                    continue stateLoop;
                }
                case 685: {
                    stackIn_686_0 = this.field_C[var5];
                    statePc = 686;
                    continue stateLoop;
                }
                case 686: {
                    if ((stackIn_686_0.field_P ^ -1) < -1) {
                        statePc = 689;
                    } else {
                        statePc = 829;
                    }
                    continue stateLoop;
                }
                case 689: {
                    if (-1 <= (1 & this.field_h.a(112, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i ^ -1)) {
                        statePc = 701;
                    } else {
                        statePc = 690;
                    }
                    continue stateLoop;
                }
                case 690: {
                    if (this.field_h.a(-63, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_g % 4 == 0) {
                        statePc = 695;
                    } else {
                        statePc = 701;
                    }
                    continue stateLoop;
                }
                case 695: {
                    dupTemp$4 = this.field_C[var5].field_c;
                    dupTemp$4.field_g = dupTemp$4.field_g + 3;
                    this.field_C[var5].field_c.a(1, true, -114);
                    if (24 <= this.field_C[var5].field_c.field_g) {
                        statePc = 699;
                    } else {
                        statePc = 696;
                    }
                    continue stateLoop;
                }
                case 696: {
                    qd.a((byte) 125, 87);
                    if (var12 == 0) {
                        statePc = 701;
                    } else {
                        statePc = 699;
                    }
                    continue stateLoop;
                }
                case 699: {
                    qd.a((byte) 84, 86);
                    statePc = 701;
                    continue stateLoop;
                }
                case 701: {
                    if (-1 <= (this.field_h.a(param0 + -35, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i & 2 ^ -1)) {
                        statePc = 713;
                    } else {
                        statePc = 702;
                    }
                    continue stateLoop;
                }
                case 702: {
                    if (0 != this.field_h.a(-124, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_k % 4) {
                        statePc = 713;
                    } else {
                        statePc = 705;
                    }
                    continue stateLoop;
                }
                case 705: {
                    dupTemp$5 = this.field_C[var5].field_c;
                    dupTemp$5.field_k = dupTemp$5.field_k + 3;
                    this.field_C[var5].field_c.a(2, true, 81);
                    if (this.field_C[var5].field_c.field_k >= 24) {
                        statePc = 711;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 708: {
                    qd.a((byte) 70, 87);
                    if (var12 == 0) {
                        statePc = 713;
                    } else {
                        statePc = 711;
                    }
                    continue stateLoop;
                }
                case 711: {
                    qd.a((byte) 54, 86);
                    statePc = 713;
                    continue stateLoop;
                }
                case 713: {
                    if ((4 & this.field_h.a(105, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i) <= 0) {
                        statePc = 725;
                    } else {
                        statePc = 714;
                    }
                    continue stateLoop;
                }
                case 714: {
                    if ((this.field_h.a(127, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F + 1).field_g % 4 ^ -1) == -1) {
                        statePc = 719;
                    } else {
                        statePc = 725;
                    }
                    continue stateLoop;
                }
                case 719: {
                    dupTemp$6 = this.field_h.a(param0 ^ -112, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F - -1);
                    dupTemp$6.field_g = dupTemp$6.field_g + 3;
                    this.field_h.a(98, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F + 1).a(1, true, -111);
                    if ((this.field_h.a(-64, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F + 1).field_g ^ -1) > -25) {
                        statePc = 723;
                    } else {
                        statePc = 720;
                    }
                    continue stateLoop;
                }
                case 720: {
                    qd.a((byte) 101, 86);
                    if (var12 == 0) {
                        statePc = 725;
                    } else {
                        statePc = 723;
                    }
                    continue stateLoop;
                }
                case 723: {
                    qd.a((byte) 82, 87);
                    statePc = 725;
                    continue stateLoop;
                }
                case 725: {
                    if ((this.field_h.a(param0 ^ 72, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i & 8 ^ -1) >= -1) {
                        statePc = 737;
                    } else {
                        statePc = 726;
                    }
                    continue stateLoop;
                }
                case 726: {
                    if ((this.field_h.a(param0 + -116, 1 + this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_k % 4 ^ -1) == -1) {
                        statePc = 731;
                    } else {
                        statePc = 737;
                    }
                    continue stateLoop;
                }
                case 731: {
                    dupTemp$7 = this.field_h.a(91, this.field_C[var5].field_H + 1, this.field_C[var5].field_E, this.field_C[var5].field_F);
                    dupTemp$7.field_k = dupTemp$7.field_k + 3;
                    this.field_h.a(86, 1 + this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).a(2, true, -113);
                    if (-25 >= (this.field_h.a(param0 + -78, this.field_C[var5].field_H - -1, this.field_C[var5].field_E, this.field_C[var5].field_F).field_k ^ -1)) {
                        statePc = 735;
                    } else {
                        statePc = 732;
                    }
                    continue stateLoop;
                }
                case 732: {
                    qd.a((byte) 36, 87);
                    if (var12 == 0) {
                        statePc = 737;
                    } else {
                        statePc = 735;
                    }
                    continue stateLoop;
                }
                case 735: {
                    qd.a((byte) 116, 86);
                    statePc = 737;
                    continue stateLoop;
                }
                case 737: {
                    if ((this.field_C[var5].field_C ^ -1) == -2) {
                        statePc = 786;
                    } else {
                        statePc = 738;
                    }
                    continue stateLoop;
                }
                case 738: {
                    if (this.field_C[var5].field_k) {
                        statePc = 743;
                    } else {
                        statePc = 744;
                    }
                    continue stateLoop;
                }
                case 743: {
                    this.field_C[var5].field_h = true;
                    this.field_C[var5].field_i = this.field_C[var5].field_F;
                    this.field_C[var5].field_gb = this.field_C[var5].field_H;
                    this.field_C[var5].field_R = this.field_C[var5].field_E;
                    this.field_C[var5].field_k = false;
                    statePc = 744;
                    continue stateLoop;
                }
                case 744: {
                    if (this.field_J) {
                        statePc = 750;
                    } else {
                        statePc = 745;
                    }
                    continue stateLoop;
                }
                case 745: {
                    if (!ok.field_i) {
                        statePc = 750;
                    } else {
                        statePc = 748;
                    }
                    continue stateLoop;
                }
                case 748: {
                    this.field_C[var5].a((byte) -46, false);
                    statePc = 750;
                    continue stateLoop;
                }
                case 750: {
                    if (!this.field_J) {
                        statePc = 760;
                    } else {
                        statePc = 751;
                    }
                    continue stateLoop;
                }
                case 751: {
                    if (this.field_q != this.field_C[var5]) {
                        statePc = 760;
                    } else {
                        statePc = 754;
                    }
                    continue stateLoop;
                }
                case 754: {
                    if (ok.field_i) {
                        statePc = 759;
                    } else {
                        statePc = 760;
                    }
                    continue stateLoop;
                }
                case 759: {
                    this.field_C[var5].a((byte) -51, true);
                    statePc = 760;
                    continue stateLoop;
                }
                case 760: {
                    this.field_C[var5].field_k = false;
                    var7 = 0;
                    statePc = 761;
                    continue stateLoop;
                }
                case 761: {
                    if ((this.field_C.length ^ -1) >= (var7 ^ -1)) {
                        statePc = 782;
                    } else {
                        statePc = 762;
                    }
                    continue stateLoop;
                }
                case 762: {
                    stackIn_865_0 = null;
                    stackIn_763_0 = stackIn_865_0;
                    stackIn_865_1 = this.field_C[var7];
                    stackIn_763_1 = stackIn_865_1;
                    if (var12 != 0) {
                        statePc = 865;
                    } else {
                        statePc = 763;
                    }
                    continue stateLoop;
                }
                case 763: {
                    if (stackIn_763_0 == stackIn_763_1) {
                        statePc = 781;
                    } else {
                        statePc = 766;
                    }
                    continue stateLoop;
                }
                case 766: {
                    if ((this.field_C[var7].field_C ^ -1) != -2) {
                        statePc = 781;
                    } else {
                        statePc = 769;
                    }
                    continue stateLoop;
                }
                case 769: {
                    if (-1 <= (this.field_C[var7].field_P ^ -1)) {
                        statePc = 781;
                    } else {
                        statePc = 772;
                    }
                    continue stateLoop;
                }
                case 772: {
                    if (this.field_h.a((byte) -93, this.field_C[var7], this.field_C[var5])) {
                        statePc = 777;
                    } else {
                        statePc = 778;
                    }
                    continue stateLoop;
                }
                case 777: {
                    this.field_C[var5].field_k = true;
                    this.field_C[var5].field_h = true;
                    this.field_C[var5].field_i = this.field_C[var5].field_F;
                    this.field_C[var5].field_gb = this.field_C[var5].field_H;
                    this.field_C[var5].field_R = this.field_C[var5].field_E;
                    statePc = 778;
                    continue stateLoop;
                }
                case 778: {
                    if (!this.field_C[var5].field_db) {
                        statePc = 781;
                    } else {
                        statePc = 779;
                    }
                    continue stateLoop;
                }
                case 779: {
                    this.field_C[var5].field_h = true;
                    this.field_C[var5].field_i = this.field_C[var5].field_F;
                    this.field_C[var5].field_gb = this.field_C[var5].field_H;
                    this.field_C[var5].field_R = this.field_C[var5].field_E;
                    statePc = 781;
                    continue stateLoop;
                }
                case 781: {
                    var7++;
                    if (var12 == 0) {
                        statePc = 761;
                    } else {
                        statePc = 782;
                    }
                    continue stateLoop;
                }
                case 782: {
                    if (this.field_C[var5].field_k) {
                        statePc = 785;
                    } else {
                        statePc = 829;
                    }
                    continue stateLoop;
                }
                case 785: {
                    this.field_C[var5].field_h = false;
                    if (var12 == 0) {
                        statePc = 829;
                    } else {
                        statePc = 786;
                    }
                    continue stateLoop;
                }
                case 786: {
                    if (this.field_C[var5].field_k) {
                        statePc = 792;
                    } else {
                        statePc = 789;
                    }
                    continue stateLoop;
                }
                case 789: {
                    if ((this.field_C[var5].field_t ^ -1) != -7) {
                        statePc = 794;
                    } else {
                        statePc = 792;
                    }
                    continue stateLoop;
                }
                case 792: {
                    this.field_C[var5].field_h = true;
                    this.field_C[var5].field_i = this.field_C[var5].field_F;
                    this.field_C[var5].field_gb = this.field_C[var5].field_H;
                    this.field_C[var5].field_R = this.field_C[var5].field_E;
                    this.field_C[var5].field_k = false;
                    statePc = 794;
                    continue stateLoop;
                }
                case 794: {
                    var7 = 0;
                    var8 = 0;
                    statePc = 795;
                    continue stateLoop;
                }
                case 795: {
                    if (this.field_C.length <= var8) {
                        statePc = 823;
                    } else {
                        statePc = 796;
                    }
                    continue stateLoop;
                }
                case 796: {
                    stackIn_865_0 = null;
                    stackIn_797_0 = stackIn_865_0;
                    stackIn_865_1 = this.field_C[var8];
                    stackIn_797_1 = stackIn_865_1;
                    if (var12 != 0) {
                        statePc = 865;
                    } else {
                        statePc = 797;
                    }
                    continue stateLoop;
                }
                case 797: {
                    if (stackIn_797_0 == stackIn_797_1) {
                        statePc = 822;
                    } else {
                        statePc = 800;
                    }
                    continue stateLoop;
                }
                case 800: {
                    if (this.field_C[var8].field_C != 0) {
                        statePc = 822;
                    } else {
                        statePc = 803;
                    }
                    continue stateLoop;
                }
                case 803: {
                    if (this.field_C[var8].field_P > 0) {
                        statePc = 808;
                    } else {
                        statePc = 822;
                    }
                    continue stateLoop;
                }
                case 808: {
                    if (!this.field_h.a((byte) -93, this.field_C[var8], this.field_C[var5])) {
                        statePc = 812;
                    } else {
                        statePc = 809;
                    }
                    continue stateLoop;
                }
                case 809: {
                    this.field_C[var5].field_k = true;
                    this.field_C[var5].field_h = true;
                    this.field_C[var5].field_i = this.field_C[var5].field_F;
                    this.field_C[var5].field_gb = this.field_C[var5].field_H;
                    this.field_C[var5].field_R = this.field_C[var5].field_E;
                    if (var12 == 0) {
                        statePc = 819;
                    } else {
                        statePc = 812;
                    }
                    continue stateLoop;
                }
                case 812: {
                    if (!this.field_C[var5].field_h) {
                        statePc = 819;
                    } else {
                        statePc = 815;
                    }
                    continue stateLoop;
                }
                case 815: {
                    if (!this.field_h.a(param0 + 10057, this.field_C[var5], this.field_C[var8], true)) {
                        statePc = 819;
                    } else {
                        statePc = 818;
                    }
                    continue stateLoop;
                }
                case 818: {
                    var7 = 1;
                    statePc = 819;
                    continue stateLoop;
                }
                case 819: {
                    if (!this.field_C[var5].field_db) {
                        statePc = 822;
                    } else {
                        statePc = 820;
                    }
                    continue stateLoop;
                }
                case 820: {
                    this.field_C[var5].field_h = true;
                    this.field_C[var5].field_i = this.field_C[var5].field_F;
                    this.field_C[var5].field_gb = this.field_C[var5].field_H;
                    this.field_C[var5].field_R = this.field_C[var5].field_E;
                    statePc = 822;
                    continue stateLoop;
                }
                case 822: {
                    var8++;
                    if (var12 == 0) {
                        statePc = 795;
                    } else {
                        statePc = 823;
                    }
                    continue stateLoop;
                }
                case 823: {
                    if (this.field_C[var5].field_k) {
                        statePc = 827;
                    } else {
                        statePc = 824;
                    }
                    continue stateLoop;
                }
                case 824: {
                    if (var7 == 0) {
                        statePc = 829;
                    } else {
                        statePc = 827;
                    }
                    continue stateLoop;
                }
                case 827: {
                    this.field_C[var5].field_h = false;
                    statePc = 829;
                    continue stateLoop;
                }
                case 829: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 572;
                    } else {
                        statePc = 830;
                    }
                    continue stateLoop;
                }
                case 830: {
                    stackIn_831_0 = null;
                    stackIn_831_1 = this;
                    statePc = 831;
                    continue stateLoop;
                }
                case 831: {
                    if (stackIn_831_0 == ((e) (this)).field_K) {
                        statePc = 841;
                    } else {
                        statePc = 832;
                    }
                    continue stateLoop;
                }
                case 832: {
                    if (le.field_q == null) {
                        statePc = 841;
                    } else {
                        statePc = 835;
                    }
                    continue stateLoop;
                }
                case 835: {
                    if ("" == le.field_q.field_o) {
                        statePc = 840;
                    } else {
                        statePc = 841;
                    }
                    continue stateLoop;
                }
                case 840: {
                    this.field_K = null;
                    statePc = 841;
                    continue stateLoop;
                }
                case 841: {
                    ok.field_i = false;
                    if (param0 == -1) {
                        statePc = 844;
                    } else {
                        statePc = 842;
                    }
                    continue stateLoop;
                }
                case 842: {
                    this.field_s = 75;
                    statePc = 844;
                    continue stateLoop;
                }
                case 844: {
                    q.field_Ib = false;
                    if (!this.field_J) {
                        statePc = 847;
                    } else {
                        statePc = 845;
                    }
                    continue stateLoop;
                }
                case 845: {
                    q.field_Ib = true;
                    statePc = 847;
                    continue stateLoop;
                }
                case 847: {
                    var7 = 0;
                    var5 = 0;
                    statePc = 848;
                    continue stateLoop;
                }
                case 848: {
                    if (50 <= var5) {
                        statePc = 859;
                    } else {
                        statePc = 849;
                    }
                    continue stateLoop;
                }
                case 849: {
                    stackIn_864_0 = null;
                    stackIn_850_0 = stackIn_864_0;
                    stackIn_864_1 = this;
                    stackIn_850_1 = stackIn_864_1;
                    if (var12 != 0) {
                        statePc = 864;
                    } else {
                        statePc = 850;
                    }
                    continue stateLoop;
                }
                case 850: {
                    if (stackIn_850_0 == ((e) (this)).field_F[var5]) {
                        statePc = 858;
                    } else {
                        statePc = 853;
                    }
                    continue stateLoop;
                }
                case 853: {
                    if (null != this.field_F[var5].field_e) {
                        statePc = 857;
                    } else {
                        statePc = 856;
                    }
                    continue stateLoop;
                }
                case 856: {
                    var7 = 1;
                    statePc = 857;
                    continue stateLoop;
                }
                case 857: {
                    this.field_F[var5] = this.field_F[var5].a((byte) 11);
                    statePc = 858;
                    continue stateLoop;
                }
                case 858: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 848;
                    } else {
                        statePc = 859;
                    }
                    continue stateLoop;
                }
                case 859: {
                    var5 = 0;
                    statePc = 860;
                    continue stateLoop;
                }
                case 860: {
                    if ((var5 ^ -1) <= (this.field_C.length ^ -1)) {
                        statePc = 872;
                    } else {
                        statePc = 861;
                    }
                    continue stateLoop;
                }
                case 861: {
                    if (var12 != 0) {
                        statePc = 874;
                    } else {
                        statePc = 862;
                    }
                    continue stateLoop;
                }
                case 862: {
                    stackIn_864_0 = null;
                    stackIn_864_1 = this;
                    statePc = 864;
                    continue stateLoop;
                }
                case 864: {
                    stackIn_865_0 = stackIn_864_0;
                    stackIn_865_1 = ((e) (this)).field_C[var5];
                    statePc = 865;
                    continue stateLoop;
                }
                case 865: {
                    if (stackIn_865_0 != stackIn_865_1) {
                        statePc = 867;
                    } else {
                        statePc = 871;
                    }
                    continue stateLoop;
                }
                case 867: {
                    if (this.field_C[var5].field_S) {
                        statePc = 870;
                    } else {
                        statePc = 871;
                    }
                    continue stateLoop;
                }
                case 870: {
                    this.field_C[var5].a(var7 != 0, (byte) -127);
                    var6 = 1;
                    statePc = 871;
                    continue stateLoop;
                }
                case 871: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 860;
                    } else {
                        statePc = 872;
                    }
                    continue stateLoop;
                }
                case 872: {
                    if (!li.field_a) {
                        statePc = 874;
                    } else {
                        statePc = 873;
                    }
                    continue stateLoop;
                }
                case 873: {
                    var6 = 1;
                    statePc = 874;
                    continue stateLoop;
                }
                case 874: {
                    if (this.field_w) {
                        statePc = 877;
                    } else {
                        statePc = 878;
                    }
                    continue stateLoop;
                }
                case 877: {
                    this.field_h.c((byte) -96);
                    statePc = 878;
                    continue stateLoop;
                }
                case 878: {
                    if (var6 != 0) {
                        statePc = 881;
                    } else {
                        statePc = 894;
                    }
                    continue stateLoop;
                }
                case 881: {
                    var8 = 0;
                    statePc = 882;
                    continue stateLoop;
                }
                case 882: {
                    if (var8 >= 12) {
                        statePc = 894;
                    } else {
                        statePc = 883;
                    }
                    continue stateLoop;
                }
                case 883: {
                    stackIn_909_0 = this.field_C[var8];
                    stackIn_884_0 = stackIn_909_0;
                    if (var12 != 0) {
                        statePc = 909;
                    } else {
                        statePc = 884;
                    }
                    continue stateLoop;
                }
                case 884: {
                    if (stackIn_884_0 == null) {
                        statePc = 893;
                    } else {
                        statePc = 887;
                    }
                    continue stateLoop;
                }
                case 887: {
                    if (this.field_C[var8].field_Z != null) {
                        statePc = 892;
                    } else {
                        statePc = 893;
                    }
                    continue stateLoop;
                }
                case 892: {
                    this.field_C[var8].field_ob = false;
                    statePc = 893;
                    continue stateLoop;
                }
                case 893: {
                    var8++;
                    if (var12 == 0) {
                        statePc = 882;
                    } else {
                        statePc = 894;
                    }
                    continue stateLoop;
                }
                case 894: {
                    if (var6 == 0) {
                        statePc = 897;
                    } else {
                        statePc = 903;
                    }
                    continue stateLoop;
                }
                case 897: {
                    if (this.field_J) {
                        statePc = 901;
                    } else {
                        statePc = 898;
                    }
                    continue stateLoop;
                }
                case 898: {
                    this.a(22341, param1, var7 != 0);
                    if (var12 == 0) {
                        statePc = 903;
                    } else {
                        statePc = 901;
                    }
                    continue stateLoop;
                }
                case 901: {
                    this.a(param1, true);
                    statePc = 903;
                    continue stateLoop;
                }
                case 903: {
                    if (0 > this.field_B) {
                        statePc = 924;
                    } else {
                        statePc = 904;
                    }
                    continue stateLoop;
                }
                case 904: {
                    if ((this.field_B ^ -1) <= -17) {
                        statePc = 924;
                    } else {
                        statePc = 907;
                    }
                    continue stateLoop;
                }
                case 907: {
                    stackIn_909_0 = this.field_C[9];
                    statePc = 909;
                    continue stateLoop;
                }
                case 909: {
                    if (stackIn_909_0.field_k) {
                        statePc = 922;
                    } else {
                        statePc = 910;
                    }
                    continue stateLoop;
                }
                case 910: {
                    if (this.field_C[10].field_k) {
                        statePc = 922;
                    } else {
                        statePc = 913;
                    }
                    continue stateLoop;
                }
                case 913: {
                    if (this.field_C[11].field_k) {
                        statePc = 922;
                    } else {
                        statePc = 916;
                    }
                    continue stateLoop;
                }
                case 916: {
                    if (this.field_C[6].field_P <= 0) {
                        statePc = 922;
                    } else {
                        statePc = 919;
                    }
                    continue stateLoop;
                }
                case 919: {
                    if (-1 > (this.field_C[7].field_P ^ -1)) {
                        statePc = 924;
                    } else {
                        statePc = 922;
                    }
                    continue stateLoop;
                }
                case 922: {
                    this.field_B = 16;
                    statePc = 924;
                    continue stateLoop;
                }
                case 924: {
                    ha.field_o = false;
                    statePc = 931;
                    continue stateLoop;
                }
                case 931: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    e(Terraphoenix param0) {
        Terraphoenix stackIn_2_0 = null;
        Terraphoenix stackIn_4_0 = null;
        Terraphoenix stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Terraphoenix stackIn_6_0 = null;
        Terraphoenix stackIn_8_0 = null;
        Terraphoenix stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Terraphoenix stackIn_10_0 = null;
        Terraphoenix stackIn_12_0 = null;
        Terraphoenix stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Terraphoenix stackIn_14_0 = null;
        Terraphoenix stackIn_16_0 = null;
        Terraphoenix stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ga stackIn_225_0 = null;
        r stackIn_301_0 = null;
        ga stackIn_306_0 = null;
        int stackIn_313_0 = 0;
        int stackIn_313_1 = 0;
        int stackIn_333_0 = 0;
        int stackIn_333_1 = 0;
        r stackIn_336_0 = null;
        int stackIn_409_0 = 0;
        int stackIn_411_0 = 0;
        int stackIn_455_0 = 0;
        Object stackIn_458_0 = null;
        r stackIn_528_0 = null;
        int stackIn_563_0 = 0;
        int stackIn_639_0 = 0;
        r stackIn_686_0 = null;
        Object stackIn_702_0 = null;
        Object stackIn_709_0 = null;
        Object stackIn_767_0 = null;
        RuntimeException stackIn_770_0 = null;
        StringBuilder stackIn_770_1 = null;
        RuntimeException stackIn_772_0 = null;
        StringBuilder stackIn_772_1 = null;
        RuntimeException stackIn_773_0 = null;
        StringBuilder stackIn_773_1 = null;
        String stackIn_773_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        dl var17_ref_dl = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dl var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var24 = Terraphoenix.field_V;
                    this.field_D = null;
                    this.field_F = new gi[50];
                    this.field_w = false;
                    this.field_n = null;
                    this.field_C = new r[100];
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    System.gc();
                    this.field_i = 1;
                    le.field_q = null;
                    this.b((byte) -3);
                    this.field_f = 0;
                    this.field_G = param0;
                    this.field_z = 0;
                    this.field_v = false;
                    this.field_L = 0;
                    ok.field_i = true;
                    this.field_J = false;
                    this.field_b = false;
                    this.field_B = -1;
                    eg.field_p = 0;
                    li.field_a = false;
                    this.field_r = false;
                    this.field_A = false;
                    this.field_e = new hk();
                    var2_int = 0;
                    var3 = 0;
                    var4 = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    var9 = 0;
                    var10 = 0;
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    stackIn_4_0 = (Terraphoenix) (param0);
                    stackIn_2_0 = stackIn_4_0;
                    if ((param0.field_Bb ^ -1) >= -3) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_5_0 = (Terraphoenix) ((Object) stackIn_2_0);
                    stackIn_5_1 = 1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = (Terraphoenix) ((Object) stackIn_4_0);
                    stackIn_5_1 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_5_0.field_Ab = stackIn_5_1 != 0;
                    stackIn_8_0 = (Terraphoenix) (param0);
                    stackIn_6_0 = stackIn_8_0;
                    if ((param0.field_Bb ^ -1) >= -3) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_9_0 = (Terraphoenix) ((Object) stackIn_6_0);
                    stackIn_9_1 = 1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = (Terraphoenix) ((Object) stackIn_8_0);
                    stackIn_9_1 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_9_0.field_H = stackIn_9_1 != 0;
                    stackIn_12_0 = (Terraphoenix) (param0);
                    stackIn_10_0 = stackIn_12_0;
                    if (-3 <= (param0.field_Bb ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_13_0 = (Terraphoenix) ((Object) stackIn_10_0);
                    stackIn_13_1 = 1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (Terraphoenix) ((Object) stackIn_12_0);
                    stackIn_13_1 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_13_0.field_E = stackIn_13_1 != 0;
                    stackIn_16_0 = (Terraphoenix) (param0);
                    stackIn_14_0 = stackIn_16_0;
                    if (-3 <= (param0.field_Bb ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_17_0 = (Terraphoenix) ((Object) stackIn_14_0);
                    stackIn_17_1 = 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (Terraphoenix) ((Object) stackIn_16_0);
                    stackIn_17_1 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_17_0.field_Y = stackIn_17_1 != 0;
                    var14 = 0;
                    if (param0.field_db) {
                        statePc = 138;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var15 = param0.field_Bb;
                    if (var15 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (-2 == (var15 ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var15 == 2) {
                        statePc = 98;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (3 != var15) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var24 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (-5 != (var15 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var24 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (5 != var15) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var24 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if ((var15 ^ -1) != -7) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var24 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (7 != var15) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var24 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (-9 != (var15 ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var24 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (9 != var15) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var24 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (-11 != (var15 ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var24 == 0) {
                        statePc = 129;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (-12 == (var15 ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var15 == 12) {
                        statePc = 136;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (-14 != (var15 ^ -1)) {
                        statePc = 222;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var24 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    this.field_B = 0;
                    var2_int = 10;
                    le.field_q = new ad(0);
                    le.field_q.field_A = (e) (this);
                    if (fa.field_a < 1) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    this.a(1, kl.field_d[76], -87);
                    if (var24 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    this.a(-1, ak.field_c, -32);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (2 != fa.field_a) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var2_int = 14;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    this.field_J = true;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var2_int = 16;
                    var6 = 4;
                    this.field_J = false;
                    if (fa.field_a == 2) {
                        statePc = 97;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var2_int = 20;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var9 = 2;
                    var2_int = 12;
                    var8 = 2;
                    this.field_J = true;
                    if ((fa.field_a ^ -1) == -3) {
                        statePc = 101;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var2_int = 20;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var3 = 1;
                    var2_int = 16;
                    this.field_J = true;
                    if (fa.field_a != 2) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var2_int = 20;
                    var3 = 2;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    this.field_i = 2;
                    if (param0.field_ub == 2) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var10 = 2;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var9 = 1;
                    var8 = 1;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var3 = 6;
                    this.field_z = 15;
                    var11 = 0;
                    var12 = 2;
                    this.field_J = false;
                    if (fa.field_a != 2) {
                        statePc = 222;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var12 = 4;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var12 = 6;
                    var3 = 6;
                    var11 = 4;
                    if (-3 != (fa.field_a ^ -1)) {
                        statePc = 111;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var12 = 8;
                    var11 = 6;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    this.field_J = true;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var3 = 6;
                    this.field_z = 10;
                    var11 = 4;
                    var13 = 4;
                    var12 = 4;
                    var8 = 3;
                    if ((fa.field_a ^ -1) != -1) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var11 = 2;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    this.field_J = false;
                    if (-3 != (fa.field_a ^ -1)) {
                        statePc = 222;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var12 = 8;
                    var13 = 6;
                    var11 = 6;
                    var3 = 4;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var13 = 6;
                    var3 = 4;
                    var12 = 8;
                    this.field_J = true;
                    var11 = 4;
                    if (2 != fa.field_a) {
                        statePc = 222;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var13 = 8;
                    var3 = 2;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    this.field_J = true;
                    this.field_i = 3;
                    if (1 != param0.field_vb) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var13 = 4;
                    var3 = 4;
                    var12 = 2;
                    var4 = 1;
                    var8 = 10;
                    var9 = 2;
                    var5 = 4;
                    var14 = 6;
                    if (var24 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var9 = 2;
                    var8 = 6;
                    this.field_z = 5;
                    var12 = 6;
                    var3 = 4;
                    var13 = 4;
                    this.field_J = false;
                    var4 = 1;
                    var14 = 6;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    dd.field_M = 7;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var13 = 6;
                    var14 = 6;
                    var12 = 6;
                    var3 = 18;
                    if (-3 == (fa.field_a ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var12 = 12;
                    var3 = 12;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    this.field_J = true;
                    var11 = 0;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    this.field_i = 3;
                    if ((param0.field_vb ^ -1) != -2) {
                        statePc = 133;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var9 = 2;
                    var4 = 1;
                    var8 = 6;
                    var5 = 6;
                    var12 = 4;
                    this.field_z = 5;
                    this.field_J = false;
                    var13 = 4;
                    var14 = 6;
                    if (var24 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var5 = 10;
                    var13 = 4;
                    var12 = 0;
                    var14 = 6;
                    var4 = 1;
                    var9 = 2;
                    var8 = 10;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    dd.field_M = 7;
                    this.field_J = true;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    dd.field_M = 4;
                    this.field_i = 2;
                    var12 = 6;
                    var14 = 6;
                    var13 = 6;
                    var5 = 6;
                    this.field_J = true;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    this.field_J = true;
                    dd.field_M = 4;
                    this.field_i = 3;
                    var8 = 8;
                    var5 = 2;
                    var14 = 8;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var8 = 12;
                    var5 = 4;
                    this.field_J = true;
                    dd.field_M = 4;
                    this.field_i = 3;
                    var14 = 12;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var15 = param0.field_Bb;
                    if ((var15 ^ -1) == -1) {
                        statePc = 219;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (var15 == 1) {
                        statePc = 219;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (-3 == (var15 ^ -1)) {
                        statePc = 219;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (3 == var15) {
                        statePc = 202;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if ((var15 ^ -1) != -5) {
                        statePc = 154;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (var24 == 0) {
                        statePc = 209;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (var15 != 5) {
                        statePc = 160;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (6 == var15) {
                        statePc = 216;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (var15 != 7) {
                        statePc = 169;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (var15 != 8) {
                        statePc = 175;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (var24 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (9 != var15) {
                        statePc = 181;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if ((var15 ^ -1) == -11) {
                        statePc = 218;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (11 != var15) {
                        statePc = 190;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (12 != var15) {
                        statePc = 196;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (var15 != 13) {
                        statePc = 219;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (qc.field_c < 4) {
                        statePc = 207;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var6 = -qc.field_c + 4;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    var2_int = qc.field_c + 6;
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (4 > qc.field_c) {
                        statePc = 214;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var6 = 4 - qc.field_c;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    var2_int = 8 - -qc.field_c;
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var2_int = qc.field_c + 10;
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    var2_int = 12 - -qc.field_c;
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var2_int = 14 + qc.field_c;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    this.field_i = 2;
                    if (!mb.b(0, 109)) {
                        statePc = 221;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var7 = 88;
                    var6 = 0;
                    var2_int = 0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    this.field_J = true;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    var16 = 0;
                    this.field_u = false;
                    ak.field_q = 0;
                    var15 = 0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if ((var15 ^ -1) <= -13) {
                        statePc = 231;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    stackIn_306_0 = param0.field_nb[var15];
                    stackIn_225_0 = stackIn_306_0;
                    if (var24 != 0) {
                        statePc = 306;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (stackIn_225_0 != null) {
                        statePc = 229;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 229: {
                    this.field_C[ak.field_q] = new r(param0.field_nb[var15]);
                    ak.field_q = ak.field_q + 1;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    var15++;
                    if (var24 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    this.field_h = new dk((e) (this));
                    if (param0.field_Bb != 0) {
                        statePc = 233;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    var15 = 0;
                    this.field_C[var15].field_F = 3;
                    this.field_C[var15].field_H = 4;
                    this.field_C[var15].field_E = 0;
                    this.field_C[var15].field_U = 2;
                    var17_ref_dl = this.field_h.a(120, this.field_C[var15].field_H, this.field_C[var15].field_E, this.field_C[var15].field_F);
                    var17_ref_dl.field_h = this.field_C[var15];
                    this.field_C[var15].field_c = var17_ref_dl;
                    this.field_q = this.field_C[var15];
                    this.field_u = true;
                    this.field_C[1] = null;
                    this.field_C[2] = null;
                    eg.field_p = this.field_q.field_E;
                    this.field_C[3] = null;
                    lg.field_c = (this.field_q.field_F + this.field_q.field_H) * 16;
                    sj.field_b = (this.field_q.field_F + -this.field_q.field_H) * 32;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    if (param0.field_Bb == 1) {
                        statePc = 236;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var15 = 0;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    if ((var15 ^ -1) <= -13) {
                        statePc = 278;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (var24 != 0) {
                        statePc = 279;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (null == this.field_C[var15]) {
                        statePc = 277;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (null == this.field_C[var15].field_Z) {
                        statePc = 277;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (0 == var15) {
                        statePc = 250;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 250: {
                    this.field_C[var15].field_F = 42;
                    this.field_C[var15].field_H = 31;
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    if (-2 == (var15 ^ -1)) {
                        statePc = 254;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 254: {
                    this.field_C[var15].field_F = 41;
                    this.field_C[var15].field_H = 30;
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    if (var15 != 2) {
                        statePc = 258;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    this.field_C[var15].field_F = 41;
                    this.field_C[var15].field_H = 28;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if (var15 != 3) {
                        statePc = 261;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    this.field_C[var15].field_F = 42;
                    this.field_C[var15].field_H = 27;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if ((var15 ^ -1) == -5) {
                        statePc = 264;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 264: {
                    this.field_C[var15].field_F = 44;
                    this.field_C[var15].field_H = 31;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    if (var15 == 5) {
                        statePc = 268;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 268: {
                    this.field_C[var15].field_F = 45;
                    this.field_C[var15].field_H = 30;
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    if (6 == var15) {
                        statePc = 272;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 272: {
                    this.field_C[var15].field_F = 45;
                    this.field_C[var15].field_H = 28;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    if (var15 != 7) {
                        statePc = 276;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    this.field_C[var15].field_F = 44;
                    this.field_C[var15].field_H = 27;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    this.field_C[var15].field_U = 6;
                    this.field_C[var15].field_E = 0;
                    var17_ref_dl = this.field_h.a(-75, this.field_C[var15].field_H, this.field_C[var15].field_E, this.field_C[var15].field_F);
                    var17_ref_dl.field_h = this.field_C[var15];
                    var17_ref_dl.field_j = -1;
                    var17_ref_dl.field_v = 0;
                    this.field_C[var15].field_c = var17_ref_dl;
                    this.field_q = this.field_C[var15];
                    eg.field_p = this.field_q.field_E;
                    lg.field_c = (this.field_q.field_F + this.field_q.field_H) * 16;
                    sj.field_b = (-this.field_q.field_H + this.field_q.field_F) * 32;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    var15++;
                    if (var24 == 0) {
                        statePc = 237;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    this.field_u = true;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    if (param0.field_db) {
                        statePc = 310;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (param0.field_Bb != 8) {
                        statePc = 286;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (param0.field_vb == 1) {
                        statePc = 298;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if ((param0.field_Bb ^ -1) != -11) {
                        statePc = 292;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if ((param0.field_vb ^ -1) == -3) {
                        statePc = 298;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if ((param0.field_Bb ^ -1) == -13) {
                        statePc = 298;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (13 != param0.field_Bb) {
                        statePc = 310;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var15 = 0;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    if (12 <= var15) {
                        statePc = 309;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    stackIn_336_0 = this.field_C[var15];
                    stackIn_301_0 = stackIn_336_0;
                    if (var24 != 0) {
                        statePc = 336;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    if (stackIn_301_0 == null) {
                        statePc = 308;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    stackIn_306_0 = this.field_C[var15].field_Z;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (stackIn_306_0 == null) {
                        statePc = 308;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    this.field_C[var15].field_F = var15 / 3 % 2 + (2 * (var15 % 3) + (this.field_h.field_b + -9));
                    this.field_C[var15].field_H = this.field_h.field_e + -8 + var15 / 3;
                    this.field_C[var15].field_E = 0;
                    this.field_C[var15].field_U = 5;
                    var17_ref_dl = this.field_h.a(-121, this.field_C[var15].field_H, this.field_C[var15].field_E, this.field_C[var15].field_F);
                    var17_ref_dl.field_h = this.field_C[var15];
                    this.field_C[var15].field_c = var17_ref_dl;
                    this.field_q = this.field_C[var15];
                    lg.field_c = (this.field_q.field_F - -this.field_q.field_H) * 16;
                    eg.field_p = this.field_q.field_E;
                    sj.field_b = (this.field_q.field_F + -this.field_q.field_H) * 32;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    var15++;
                    if (var24 == 0) {
                        statePc = 299;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    this.field_u = true;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    var16 = ak.field_q;
                    var15 = 0;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    if ((var15 ^ -1) <= (var6 ^ -1)) {
                        statePc = 332;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    this.field_C[var16] = new r(7, param0.field_Bb);
                    stackIn_333_0 = param0.field_Bb ^ -1;
                    stackIn_313_0 = stackIn_333_0;
                    stackIn_333_1 = -2;
                    stackIn_313_1 = stackIn_333_1;
                    if (var24 != 0) {
                        statePc = 333;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (stackIn_313_0 == stackIn_313_1) {
                        statePc = 317;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (var15 != 0) {
                        statePc = 320;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    this.field_C[var16].field_F = 28;
                    this.field_C[var16].field_H = 37;
                    this.field_C[var16].field_U = 6;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    if (1 == var15) {
                        statePc = 323;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 323: {
                    this.field_C[var16].field_F = 42;
                    this.field_C[var16].field_H = 43;
                    this.field_C[var16].field_U = 4;
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    if (2 != var15) {
                        statePc = 327;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    this.field_C[var16].field_F = 34;
                    this.field_C[var16].field_H = 19;
                    this.field_C[var16].field_U = 2;
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    if (-4 != (var15 ^ -1)) {
                        statePc = 330;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    this.field_C[var16].field_F = 27;
                    this.field_C[var16].field_H = 21;
                    this.field_C[var16].field_U = 4;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    this.field_C[var16].field_E = 0;
                    var17_ref_dl = this.field_h.a(-49, this.field_C[var16].field_H, this.field_C[var16].field_E, this.field_C[var16].field_F);
                    var17_ref_dl.field_h = this.field_C[var16];
                    this.field_C[var16].field_c = var17_ref_dl;
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    var16++;
                    ak.field_q = ak.field_q + 1;
                    var15++;
                    if (var24 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    stackIn_333_0 = -12;
                    stackIn_333_1 = param0.field_Bb ^ -1;
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    if (stackIn_333_0 == stackIn_333_1) {
                        statePc = 335;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 335: {
                    stackIn_336_0 = this.field_C[0];
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    stackIn_336_0.field_s = true;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    if (12 != param0.field_Bb) {
                        statePc = 340;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    this.field_C[0].field_s = true;
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    if (-14 == (param0.field_Bb ^ -1)) {
                        statePc = 343;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 343: {
                    this.field_C[0].field_s = true;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    var15 = 0;
                    statePc = 345;
                    continue stateLoop;
                }
                case 345: {
                    if (var2_int <= var15) {
                        statePc = 350;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    this.field_C[var16] = new r(0, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 351;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    if (var24 == 0) {
                        statePc = 345;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    var15 = 0;
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if ((var15 ^ -1) <= (var3 ^ -1)) {
                        statePc = 358;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    this.field_C[var16] = new r(1, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 359;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    if (var24 == 0) {
                        statePc = 351;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    var15 = 0;
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    if ((var12 ^ -1) >= (var15 ^ -1)) {
                        statePc = 366;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    this.field_C[var16] = new r(2, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 367;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    if (var24 == 0) {
                        statePc = 359;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    var15 = 0;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    if (var15 >= var13) {
                        statePc = 374;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    this.field_C[var16] = new r(3, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 375;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    if (var24 == 0) {
                        statePc = 367;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    var15 = 0;
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    if (var15 >= var5) {
                        statePc = 382;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    this.field_C[var16] = new r(4, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 383;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    if (var24 == 0) {
                        statePc = 375;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    var15 = 0;
                    statePc = 383;
                    continue stateLoop;
                }
                case 383: {
                    if ((var15 ^ -1) <= (var14 ^ -1)) {
                        statePc = 390;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    this.field_C[var16] = new r(5, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 391;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    if (var24 == 0) {
                        statePc = 383;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    var15 = 0;
                    statePc = 391;
                    continue stateLoop;
                }
                case 391: {
                    if ((var4 ^ -1) >= (var15 ^ -1)) {
                        statePc = 398;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    this.field_C[var16] = new r(6, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 399;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    if (var24 == 0) {
                        statePc = 391;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    var15 = 0;
                    statePc = 399;
                    continue stateLoop;
                }
                case 399: {
                    if ((var7 ^ -1) >= (var15 ^ -1)) {
                        statePc = 406;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    this.field_C[var16] = new r(9, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 407;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    if (var24 == 0) {
                        statePc = 399;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    var15 = var16 - 1;
                    statePc = 407;
                    continue stateLoop;
                }
                case 407: {
                    if (var15 < ak.field_q) {
                        statePc = 454;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    stackIn_455_0 = this.field_C[var15].field_t ^ -1;
                    stackIn_409_0 = stackIn_455_0;
                    if (var24 != 0) {
                        statePc = 455;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    stackIn_411_0 = stackIn_409_0;
                    statePc = 411;
                    continue stateLoop;
                }
                case 411: {
                    if (stackIn_411_0 == -5) {
                        statePc = 453;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    if ((this.field_C[var15].field_t ^ -1) == -7) {
                        statePc = 453;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    if (var10 > 0) {
                        statePc = 432;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    if (-1 > (var9 ^ -1)) {
                        statePc = 429;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    if (0 >= var8) {
                        statePc = 434;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 426: {
                    var8--;
                    this.field_C[var15].field_z = 2;
                    if (var24 == 0) {
                        statePc = 434;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    this.field_C[var15].field_z = 3;
                    var9--;
                    if (var24 == 0) {
                        statePc = 434;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    this.field_C[var15].field_z = 4;
                    var10--;
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    if ((param0.field_Bb ^ -1) != -4) {
                        statePc = 444;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    if ((this.field_C[var15].field_t ^ -1) != -2) {
                        statePc = 444;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    if (param0.field_ub == 2) {
                        statePc = 443;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 443: {
                    this.field_C[var15].field_z = 2;
                    statePc = 444;
                    continue stateLoop;
                }
                case 444: {
                    if ((param0.field_Bb ^ -1) != -4) {
                        statePc = 453;
                    } else {
                        statePc = 445;
                    }
                    continue stateLoop;
                }
                case 445: {
                    if (this.field_C[var15].field_t != 1) {
                        statePc = 453;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    if (param0.field_ub != 1) {
                        statePc = 453;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 451: {
                    this.field_C[var15].field_z = 1;
                    statePc = 453;
                    continue stateLoop;
                }
                case 453: {
                    var15--;
                    if (var24 == 0) {
                        statePc = 407;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    stackIn_455_0 = 0;
                    statePc = 455;
                    continue stateLoop;
                }
                case 455: {
                    var17 = stackIn_455_0;
                    var15 = 0;
                    statePc = 456;
                    continue stateLoop;
                }
                case 456: {
                    if (var15 >= this.field_C.length) {
                        statePc = 753;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 457: {
                    stackIn_767_0 = null;
                    stackIn_458_0 = stackIn_767_0;
                    if (var24 != 0) {
                        statePc = 767;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    if (stackIn_458_0 == this.field_C[var15]) {
                        statePc = 752;
                    } else {
                        statePc = 461;
                    }
                    continue stateLoop;
                }
                case 461: {
                    if (this.field_C[var15].field_Z != null) {
                        statePc = 752;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 464: {
                    if (this.field_C[var15].field_c == null) {
                        statePc = 469;
                    } else {
                        statePc = 752;
                    }
                    continue stateLoop;
                }
                case 469: {
                    var17 = 0;
                    if (0 == param0.field_Bb) {
                        statePc = 472;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 472: {
                    var17 = 2;
                    statePc = 473;
                    continue stateLoop;
                }
                case 473: {
                    if (-2 != (param0.field_Bb ^ -1)) {
                        statePc = 480;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    if (-1 == (this.field_C[var15].field_t ^ -1)) {
                        statePc = 479;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 479: {
                    var17 = 1;
                    statePc = 480;
                    continue stateLoop;
                }
                case 480: {
                    if ((param0.field_Bb ^ -1) != -12) {
                        statePc = 482;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    var17 = 1;
                    statePc = 482;
                    continue stateLoop;
                }
                case 482: {
                    if ((this.field_C[var15].field_z ^ -1) != -1) {
                        statePc = 487;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    if (var11 <= 0) {
                        statePc = 487;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    var11--;
                    var17 = 1;
                    statePc = 487;
                    continue stateLoop;
                }
                case 487: {
                    if (this.field_C[var15].field_t == 9) {
                        statePc = 490;
                    } else {
                        statePc = 491;
                    }
                    continue stateLoop;
                }
                case 490: {
                    var17 = 1;
                    statePc = 491;
                    continue stateLoop;
                }
                case 491: {
                    if (0 != var17) {
                        statePc = 687;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 492: {
                    if (0 != this.field_C[var15].field_C) {
                        statePc = 497;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    this.field_C[var15].field_z = 0;
                    statePc = 497;
                    continue stateLoop;
                }
                case 497: {
                    if ((this.field_C[var15].field_z ^ -1) != -1) {
                        statePc = 521;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 498: {
                    if ((this.field_C[var15].field_t ^ -1) >= -1) {
                        statePc = 521;
                    } else {
                        statePc = 501;
                    }
                    continue stateLoop;
                }
                case 501: {
                    if ((this.field_C[var15].field_C ^ -1) != -2) {
                        statePc = 521;
                    } else {
                        statePc = 504;
                    }
                    continue stateLoop;
                }
                case 504: {
                    if ((param0.field_Bb ^ -1) == -5) {
                        statePc = 518;
                    } else {
                        statePc = 507;
                    }
                    continue stateLoop;
                }
                case 507: {
                    if (6 == param0.field_Bb) {
                        statePc = 518;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    if ((param0.field_Bb ^ -1) == -9) {
                        statePc = 518;
                    } else {
                        statePc = 513;
                    }
                    continue stateLoop;
                }
                case 513: {
                    if (-11 == (param0.field_Bb ^ -1)) {
                        statePc = 518;
                    } else {
                        statePc = 521;
                    }
                    continue stateLoop;
                }
                case 518: {
                    if (50.0 <= Math.random() * 100.0) {
                        statePc = 521;
                    } else {
                        statePc = 519;
                    }
                    continue stateLoop;
                }
                case 519: {
                    this.field_C[var15].field_z = 1;
                    statePc = 521;
                    continue stateLoop;
                }
                case 521: {
                    this.field_C[var15].field_U = (int)(8.0 * Math.random());
                    var23 = 0;
                    statePc = 522;
                    continue stateLoop;
                }
                case 522: {
                    var18 = (int)(Math.random() * (double)this.field_h.field_b / 2.0) - -(this.field_h.field_b / 4);
                    var23++;
                    var19 = (int)(Math.random() * (double)this.field_h.field_e / 2.0) + this.field_h.field_e / 4;
                    if (this.field_C[var15].field_t < 1) {
                        statePc = 525;
                    } else {
                        statePc = 523;
                    }
                    continue stateLoop;
                }
                case 523: {
                    if (6 < this.field_C[var15].field_t) {
                        statePc = 525;
                    } else {
                        statePc = 524;
                    }
                    continue stateLoop;
                }
                case 524: {
                    var18 = 2 + (int)(Math.random() * (double)(-4 + this.field_h.field_b));
                    var19 = (int)(Math.random() * (double)(-4 + this.field_h.field_e)) + 2;
                    statePc = 525;
                    continue stateLoop;
                }
                case 525: {
                    if (9 != param0.field_Bb) {
                        statePc = 527;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 526: {
                    var18 = 2 + (int)(Math.random() * (double)(-4 + this.field_h.field_b));
                    var19 = (int)(Math.random() * (double)(this.field_h.field_e - 4)) - -2;
                    statePc = 527;
                    continue stateLoop;
                }
                case 527: {
                    var20 = 0;
                    stackIn_528_0 = this.field_C[var15];
                    statePc = 528;
                    continue stateLoop;
                }
                case 528: {
                    if (stackIn_528_0.field_t == 0) {
                        statePc = 572;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 529: {
                    if (this.field_C[var15].field_t == 7) {
                        statePc = 572;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 530: {
                    if (9 == this.field_C[var15].field_t) {
                        statePc = 572;
                    } else {
                        statePc = 533;
                    }
                    continue stateLoop;
                }
                case 533: {
                    var21 = this.field_h.a(-118, var19, var20, var18);
                    if (var21.field_C == null) {
                        statePc = 540;
                    } else {
                        statePc = 534;
                    }
                    continue stateLoop;
                }
                case 534: {
                    if (this.field_C[var15].field_z >= 2) {
                        statePc = 539;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 539: {
                    var20++;
                    var21 = this.field_h.a(-51, var19, var20, var18);
                    statePc = 540;
                    continue stateLoop;
                }
                case 540: {
                    if (null == var21.field_C) {
                        statePc = 545;
                    } else {
                        statePc = 541;
                    }
                    continue stateLoop;
                }
                case 541: {
                    if (3 > this.field_C[var15].field_z) {
                        statePc = 545;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 544: {
                    var20++;
                    var21 = this.field_h.a(-48, var19, var20, var18);
                    statePc = 545;
                    continue stateLoop;
                }
                case 545: {
                    if (var21.field_C == null) {
                        statePc = 552;
                    } else {
                        statePc = 546;
                    }
                    continue stateLoop;
                }
                case 546: {
                    if (-5 == (this.field_C[var15].field_z ^ -1)) {
                        statePc = 551;
                    } else {
                        statePc = 552;
                    }
                    continue stateLoop;
                }
                case 551: {
                    var20++;
                    var21 = this.field_h.a(102, var19, var20, var18);
                    statePc = 552;
                    continue stateLoop;
                }
                case 552: {
                    if (null == var21.field_C) {
                        statePc = 559;
                    } else {
                        statePc = 553;
                    }
                    continue stateLoop;
                }
                case 553: {
                    if ((this.field_C[var15].field_z ^ -1) == -5) {
                        statePc = 558;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 558: {
                    var20++;
                    var21 = this.field_h.a(-63, var19, var20, var18);
                    statePc = 559;
                    continue stateLoop;
                }
                case 559: {
                    if (this.field_h.a(var18, false, var20, var19)) {
                        statePc = 562;
                    } else {
                        statePc = 560;
                    }
                    continue stateLoop;
                }
                case 560: {
                    stackIn_563_0 = 1;
                    statePc = 563;
                    continue stateLoop;
                }
                case 562: {
                    stackIn_563_0 = 0;
                    statePc = 563;
                    continue stateLoop;
                }
                case 563: {
                    var22 = stackIn_563_0;
                    if ((this.field_C[var15].field_z - 1 ^ -1) >= (var21.field_r ^ -1)) {
                        statePc = 565;
                    } else {
                        statePc = 564;
                    }
                    continue stateLoop;
                }
                case 564: {
                    var22 = 0;
                    statePc = 565;
                    continue stateLoop;
                }
                case 565: {
                    if (4 == var21.field_b) {
                        statePc = 684;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 566: {
                    if (var21.field_b != 14) {
                        statePc = 571;
                    } else {
                        statePc = 684;
                    }
                    continue stateLoop;
                }
                case 571: {
                    var22 = 0;
                    if (var24 == 0) {
                        statePc = 684;
                    } else {
                        statePc = 572;
                    }
                    continue stateLoop;
                }
                case 572: {
                    var21 = this.field_h.a(124, var19, var20, var18);
                    if (var21.field_C == null) {
                        statePc = 579;
                    } else {
                        statePc = 573;
                    }
                    continue stateLoop;
                }
                case 573: {
                    if ((this.field_C[var15].field_z ^ -1) <= -3) {
                        statePc = 578;
                    } else {
                        statePc = 579;
                    }
                    continue stateLoop;
                }
                case 578: {
                    var20++;
                    var21 = this.field_h.a(-32, var19, var20, var18);
                    statePc = 579;
                    continue stateLoop;
                }
                case 579: {
                    if (var21.field_C == null) {
                        statePc = 584;
                    } else {
                        statePc = 580;
                    }
                    continue stateLoop;
                }
                case 580: {
                    if (this.field_C[var15].field_z < 3) {
                        statePc = 584;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 583: {
                    var20++;
                    var21 = this.field_h.a(114, var19, var20, var18);
                    statePc = 584;
                    continue stateLoop;
                }
                case 584: {
                    if (null == var21.field_C) {
                        statePc = 589;
                    } else {
                        statePc = 585;
                    }
                    continue stateLoop;
                }
                case 585: {
                    if (this.field_C[var15].field_z != 4) {
                        statePc = 589;
                    } else {
                        statePc = 588;
                    }
                    continue stateLoop;
                }
                case 588: {
                    var20++;
                    var21 = this.field_h.a(-36, var19, var20, var18);
                    statePc = 589;
                    continue stateLoop;
                }
                case 589: {
                    if (null == var21.field_C) {
                        statePc = 596;
                    } else {
                        statePc = 590;
                    }
                    continue stateLoop;
                }
                case 590: {
                    if (this.field_C[var15].field_z == 4) {
                        statePc = 595;
                    } else {
                        statePc = 596;
                    }
                    continue stateLoop;
                }
                case 595: {
                    var20++;
                    var21 = this.field_h.a(-111, var19, var20, var18);
                    statePc = 596;
                    continue stateLoop;
                }
                case 596: {
                    if (-1001 <= (var23 ^ -1)) {
                        statePc = 603;
                    } else {
                        statePc = 597;
                    }
                    continue stateLoop;
                }
                case 597: {
                    if ((this.field_C[var15].field_z ^ -1) == -5) {
                        statePc = 602;
                    } else {
                        statePc = 603;
                    }
                    continue stateLoop;
                }
                case 602: {
                    this.field_C[var15].field_z = 3;
                    statePc = 603;
                    continue stateLoop;
                }
                case 603: {
                    if (1250 >= var23) {
                        statePc = 610;
                    } else {
                        statePc = 604;
                    }
                    continue stateLoop;
                }
                case 604: {
                    if (this.field_C[var15].field_z == 3) {
                        statePc = 609;
                    } else {
                        statePc = 610;
                    }
                    continue stateLoop;
                }
                case 609: {
                    this.field_C[var15].field_z = 2;
                    statePc = 610;
                    continue stateLoop;
                }
                case 610: {
                    if (var23 <= 1500) {
                        statePc = 617;
                    } else {
                        statePc = 611;
                    }
                    continue stateLoop;
                }
                case 611: {
                    if (2 == this.field_C[var15].field_z) {
                        statePc = 616;
                    } else {
                        statePc = 617;
                    }
                    continue stateLoop;
                }
                case 616: {
                    this.field_C[var15].field_z = 0;
                    statePc = 617;
                    continue stateLoop;
                }
                case 617: {
                    if (var21.field_C == null) {
                        statePc = 625;
                    } else {
                        statePc = 618;
                    }
                    continue stateLoop;
                }
                case 618: {
                    if (!param0.field_db) {
                        statePc = 625;
                    } else {
                        statePc = 621;
                    }
                    continue stateLoop;
                }
                case 621: {
                    if (Math.random() * 100.0 >= 75.0) {
                        statePc = 625;
                    } else {
                        statePc = 624;
                    }
                    continue stateLoop;
                }
                case 624: {
                    var20++;
                    var21 = this.field_h.a(88, var19, var20, var18);
                    statePc = 625;
                    continue stateLoop;
                }
                case 625: {
                    if (var21.field_C == null) {
                        statePc = 635;
                    } else {
                        statePc = 626;
                    }
                    continue stateLoop;
                }
                case 626: {
                    if (!param0.field_db) {
                        statePc = 635;
                    } else {
                        statePc = 629;
                    }
                    continue stateLoop;
                }
                case 629: {
                    if (75.0 > Math.random() * 100.0) {
                        statePc = 634;
                    } else {
                        statePc = 635;
                    }
                    continue stateLoop;
                }
                case 634: {
                    var20++;
                    var21 = this.field_h.a(124, var19, var20, var18);
                    statePc = 635;
                    continue stateLoop;
                }
                case 635: {
                    if (this.field_h.a(var18, false, var20, var19)) {
                        statePc = 638;
                    } else {
                        statePc = 636;
                    }
                    continue stateLoop;
                }
                case 636: {
                    stackIn_639_0 = 1;
                    statePc = 639;
                    continue stateLoop;
                }
                case 638: {
                    stackIn_639_0 = 0;
                    statePc = 639;
                    continue stateLoop;
                }
                case 639: {
                    var22 = stackIn_639_0;
                    if (!param0.field_db) {
                        statePc = 644;
                    } else {
                        statePc = 640;
                    }
                    continue stateLoop;
                }
                case 640: {
                    if (6 != var21.field_b) {
                        statePc = 644;
                    } else {
                        statePc = 643;
                    }
                    continue stateLoop;
                }
                case 643: {
                    var22 = 0;
                    statePc = 644;
                    continue stateLoop;
                }
                case 644: {
                    if (!param0.field_db) {
                        statePc = 651;
                    } else {
                        statePc = 645;
                    }
                    continue stateLoop;
                }
                case 645: {
                    if (12 == var21.field_b) {
                        statePc = 650;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 650: {
                    var22 = 0;
                    statePc = 651;
                    continue stateLoop;
                }
                case 651: {
                    if (1 >= param0.field_Bb) {
                        statePc = 656;
                    } else {
                        statePc = 652;
                    }
                    continue stateLoop;
                }
                case 652: {
                    if (var21.field_b != 0) {
                        statePc = 656;
                    } else {
                        statePc = 655;
                    }
                    continue stateLoop;
                }
                case 655: {
                    var22 = 0;
                    statePc = 656;
                    continue stateLoop;
                }
                case 656: {
                    if ((-1 + this.field_C[var15].field_z ^ -1) >= (var21.field_r ^ -1)) {
                        statePc = 663;
                    } else {
                        statePc = 657;
                    }
                    continue stateLoop;
                }
                case 657: {
                    if ((this.field_C[var15].field_z ^ -1) > -5) {
                        statePc = 662;
                    } else {
                        statePc = 663;
                    }
                    continue stateLoop;
                }
                case 662: {
                    var22 = 0;
                    statePc = 663;
                    continue stateLoop;
                }
                case 663: {
                    if ((this.field_C[var15].field_z ^ -1) >= (var21.field_r ^ -1)) {
                        statePc = 670;
                    } else {
                        statePc = 664;
                    }
                    continue stateLoop;
                }
                case 664: {
                    if ((this.field_C[var15].field_z ^ -1) == -5) {
                        statePc = 669;
                    } else {
                        statePc = 670;
                    }
                    continue stateLoop;
                }
                case 669: {
                    var22 = 0;
                    statePc = 670;
                    continue stateLoop;
                }
                case 670: {
                    if (var21.field_b == 3) {
                        statePc = 673;
                    } else {
                        statePc = 674;
                    }
                    continue stateLoop;
                }
                case 673: {
                    var22 = 0;
                    statePc = 674;
                    continue stateLoop;
                }
                case 674: {
                    if (var21.field_b == 5) {
                        statePc = 677;
                    } else {
                        statePc = 678;
                    }
                    continue stateLoop;
                }
                case 677: {
                    var22 = 0;
                    statePc = 678;
                    continue stateLoop;
                }
                case 678: {
                    if (8 != var21.field_b) {
                        statePc = 680;
                    } else {
                        statePc = 679;
                    }
                    continue stateLoop;
                }
                case 679: {
                    var22 = 0;
                    statePc = 680;
                    continue stateLoop;
                }
                case 680: {
                    if (-1 == var21.field_b) {
                        statePc = 683;
                    } else {
                        statePc = 684;
                    }
                    continue stateLoop;
                }
                case 683: {
                    var22 = 0;
                    statePc = 684;
                    continue stateLoop;
                }
                case 684: {
                    if (var22 == 0) {
                        statePc = 522;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 685: {
                    this.field_C[var15].field_F = var18;
                    this.field_C[var15].field_H = var19;
                    this.field_C[var15].field_E = var20;
                    var21 = this.field_h.a(-119, var19, var20, var18);
                    var21.field_h = this.field_C[var15];
                    stackIn_528_0 = this.field_C[var15];
                    stackIn_686_0 = stackIn_528_0;
                    if (var24 != 0) {
                        statePc = 528;
                    } else {
                        statePc = 686;
                    }
                    continue stateLoop;
                }
                case 686: {
                    stackIn_686_0.field_c = var21;
                    statePc = 687;
                    continue stateLoop;
                }
                case 687: {
                    if (1 == var17) {
                        statePc = 690;
                    } else {
                        statePc = 710;
                    }
                    continue stateLoop;
                }
                case 690: {
                    this.field_C[var15].field_U = (int)(8.0 * Math.random());
                    this.field_C[var15].field_z = 0;
                    statePc = 691;
                    continue stateLoop;
                }
                case 691: {
                    var20 = (int)(Math.random() * 4.0);
                    var18 = (int)(Math.random() * (double)(-6 + this.field_h.field_b)) + 3;
                    var19 = 3 + (int)(Math.random() * (double)(-6 + this.field_h.field_e));
                    if (param0.field_Bb == 1) {
                        statePc = 693;
                    } else {
                        statePc = 694;
                    }
                    continue stateLoop;
                }
                case 693: {
                    var20 = 0;
                    statePc = 694;
                    continue stateLoop;
                }
                case 694: {
                    if (0 == var20) {
                        statePc = 697;
                    } else {
                        statePc = 698;
                    }
                    continue stateLoop;
                }
                case 697: {
                    var18 = (int)(Math.random() * 3.0 + 2.0);
                    statePc = 698;
                    continue stateLoop;
                }
                case 698: {
                    if (1 == var20) {
                        statePc = 701;
                    } else {
                        statePc = 703;
                    }
                    continue stateLoop;
                }
                case 701: {
                    stackIn_702_0 = this;
                    statePc = 702;
                    continue stateLoop;
                }
                case 702: {
                    var18 = ((e) (this)).field_h.field_b - (int)(3.0 * Math.random() + 2.0);
                    statePc = 703;
                    continue stateLoop;
                }
                case 703: {
                    if (-3 != (var20 ^ -1)) {
                        statePc = 705;
                    } else {
                        statePc = 704;
                    }
                    continue stateLoop;
                }
                case 704: {
                    var19 = (int)(2.0 + Math.random() * 3.0);
                    statePc = 705;
                    continue stateLoop;
                }
                case 705: {
                    if (3 != var20) {
                        statePc = 707;
                    } else {
                        statePc = 706;
                    }
                    continue stateLoop;
                }
                case 706: {
                    var19 = this.field_h.field_e + -(int)(3.0 * Math.random() + 2.0);
                    statePc = 707;
                    continue stateLoop;
                }
                case 707: {
                    if (this.field_h.a(var18, false, 0, var19)) {
                        statePc = 691;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 708: {
                    this.field_C[var15].field_F = var18;
                    this.field_C[var15].field_H = var19;
                    this.field_h.field_f[var18][var19].field_h = this.field_C[var15];
                    stackIn_702_0 = this;
                    stackIn_709_0 = stackIn_702_0;
                    if (var24 != 0) {
                        statePc = 702;
                    } else {
                        statePc = 709;
                    }
                    continue stateLoop;
                }
                case 709: {
                    ((e) (this)).field_C[var15].field_c = this.field_h.field_f[var18][var19];
                    statePc = 710;
                    continue stateLoop;
                }
                case 710: {
                    if (2 == var17) {
                        statePc = 713;
                    } else {
                        statePc = 752;
                    }
                    continue stateLoop;
                }
                case 713: {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                    if ((var15 ^ -1) == (0 - -ak.field_q ^ -1)) {
                        statePc = 716;
                    } else {
                        statePc = 717;
                    }
                    continue stateLoop;
                }
                case 716: {
                    var19 = 16;
                    var20 = 0;
                    this.field_C[var15].field_nb = new oh(2);
                    var18 = 20;
                    statePc = 717;
                    continue stateLoop;
                }
                case 717: {
                    if (ak.field_q + 1 != var15) {
                        statePc = 719;
                    } else {
                        statePc = 718;
                    }
                    continue stateLoop;
                }
                case 718: {
                    this.field_C[var15].field_nb = new oh(2);
                    var19 = 20;
                    var18 = 19;
                    var20 = 0;
                    statePc = 719;
                    continue stateLoop;
                }
                case 719: {
                    if (ak.field_q + 2 != var15) {
                        statePc = 721;
                    } else {
                        statePc = 720;
                    }
                    continue stateLoop;
                }
                case 720: {
                    var20 = 0;
                    var18 = 26;
                    var19 = 21;
                    this.field_C[var15].field_nb = new oh(1);
                    statePc = 721;
                    continue stateLoop;
                }
                case 721: {
                    if ((ak.field_q + 3 ^ -1) == (var15 ^ -1)) {
                        statePc = 724;
                    } else {
                        statePc = 725;
                    }
                    continue stateLoop;
                }
                case 724: {
                    var20 = 0;
                    var18 = 27;
                    this.field_C[var15].field_nb = new oh(1);
                    var19 = 18;
                    statePc = 725;
                    continue stateLoop;
                }
                case 725: {
                    if (4 + ak.field_q != var15) {
                        statePc = 727;
                    } else {
                        statePc = 726;
                    }
                    continue stateLoop;
                }
                case 726: {
                    var20 = 0;
                    var19 = 30;
                    this.field_C[var15].field_nb = new oh(0);
                    var18 = 28;
                    statePc = 727;
                    continue stateLoop;
                }
                case 727: {
                    if (var15 != ak.field_q + 5) {
                        statePc = 729;
                    } else {
                        statePc = 728;
                    }
                    continue stateLoop;
                }
                case 728: {
                    this.field_C[var15].field_nb = new oh(1);
                    var19 = 33;
                    var20 = 0;
                    var18 = 27;
                    statePc = 729;
                    continue stateLoop;
                }
                case 729: {
                    if (var15 != ak.field_q + 6) {
                        statePc = 731;
                    } else {
                        statePc = 730;
                    }
                    continue stateLoop;
                }
                case 730: {
                    var19 = 31;
                    this.field_C[var15].field_nb = new oh(1);
                    var20 = 0;
                    var18 = 29;
                    statePc = 731;
                    continue stateLoop;
                }
                case 731: {
                    if ((7 - -ak.field_q ^ -1) != (var15 ^ -1)) {
                        statePc = 733;
                    } else {
                        statePc = 732;
                    }
                    continue stateLoop;
                }
                case 732: {
                    this.field_C[var15].field_nb = new oh(3);
                    var20 = 0;
                    var18 = 25;
                    var19 = 5;
                    statePc = 733;
                    continue stateLoop;
                }
                case 733: {
                    if (var15 == ak.field_q + 8) {
                        statePc = 736;
                    } else {
                        statePc = 737;
                    }
                    continue stateLoop;
                }
                case 736: {
                    var18 = 26;
                    var19 = 5;
                    this.field_C[var15].field_nb = new oh(1);
                    var20 = 0;
                    statePc = 737;
                    continue stateLoop;
                }
                case 737: {
                    if ((var15 ^ -1) != (ak.field_q + 9 ^ -1)) {
                        statePc = 739;
                    } else {
                        statePc = 738;
                    }
                    continue stateLoop;
                }
                case 738: {
                    this.field_C[var15].field_nb = new oh(3);
                    var20 = 0;
                    var18 = 27;
                    var19 = 5;
                    statePc = 739;
                    continue stateLoop;
                }
                case 739: {
                    if ((var15 ^ -1) != (10 - -ak.field_q ^ -1)) {
                        statePc = 741;
                    } else {
                        statePc = 740;
                    }
                    continue stateLoop;
                }
                case 740: {
                    var19 = 37;
                    var20 = 0;
                    var18 = 2;
                    this.field_C[var15].field_nb = new oh(2);
                    statePc = 741;
                    continue stateLoop;
                }
                case 741: {
                    if (var15 != ak.field_q + 11) {
                        statePc = 743;
                    } else {
                        statePc = 742;
                    }
                    continue stateLoop;
                }
                case 742: {
                    this.field_C[var15].field_nb = new oh(2);
                    var18 = 3;
                    var20 = 0;
                    var19 = 38;
                    statePc = 743;
                    continue stateLoop;
                }
                case 743: {
                    if ((var15 ^ -1) == (ak.field_q + 12 ^ -1)) {
                        statePc = 746;
                    } else {
                        statePc = 747;
                    }
                    continue stateLoop;
                }
                case 746: {
                    var18 = 29;
                    var19 = 2;
                    var20 = 0;
                    this.field_C[var15].field_nb = new oh(2);
                    statePc = 747;
                    continue stateLoop;
                }
                case 747: {
                    if (13 + ak.field_q == var15) {
                        statePc = 750;
                    } else {
                        statePc = 751;
                    }
                    continue stateLoop;
                }
                case 750: {
                    var20 = 0;
                    var18 = 29;
                    this.field_C[var15].field_nb = new oh(2);
                    var19 = 1;
                    statePc = 751;
                    continue stateLoop;
                }
                case 751: {
                    this.field_C[var15].field_F = var18;
                    this.field_C[var15].field_H = var19;
                    this.field_C[var15].field_E = var20;
                    var21 = this.field_h.a(-125, var19, var20, var18);
                    var21.field_h = this.field_C[var15];
                    this.field_C[var15].field_c = var21;
                    this.field_C[var15].field_U = 6;
                    statePc = 752;
                    continue stateLoop;
                }
                case 752: {
                    var15++;
                    if (var24 == 0) {
                        statePc = 456;
                    } else {
                        statePc = 753;
                    }
                    continue stateLoop;
                }
                case 753: {
                    this.field_d = 0;
                    if (this.field_J) {
                        statePc = 756;
                    } else {
                        statePc = 757;
                    }
                    continue stateLoop;
                }
                case 756: {
                    this.field_d = 1;
                    statePc = 757;
                    continue stateLoop;
                }
                case 757: {
                    if (!this.field_u) {
                        statePc = 760;
                    } else {
                        statePc = 758;
                    }
                    continue stateLoop;
                }
                case 758: {
                    this.c((byte) -116);
                    statePc = 760;
                    continue stateLoop;
                }
                case 760: {
                    if (le.field_q == null) {
                        statePc = 774;
                    } else {
                        statePc = 761;
                    }
                    continue stateLoop;
                }
                case 761: {
                    if (-1 > (fa.field_a ^ -1)) {
                        statePc = 766;
                    } else {
                        statePc = 774;
                    }
                    continue stateLoop;
                }
                case 766: {
                    le.field_q.c((byte) 51);
                    this.field_B = -1;
                    stackIn_767_0 = null;
                    statePc = 767;
                    continue stateLoop;
                }
                case 767: {
                    le.field_q = (ad) ((Object) stackIn_767_0);
                    statePc = 774;
                    continue stateLoop;
                }
                case 774: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_t = new int[4];
        field_o = null;
        field_l = new rh(13, 0, 1, 0);
    }
}
