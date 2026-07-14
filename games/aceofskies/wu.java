/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wu {
    short field_r;
    int[] field_o;
    int[] field_Q;
    private boolean field_O;
    short[] field_B;
    byte field_f;
    short[] field_I;
    int[] field_a;
    short[] field_t;
    short[] field_L;
    short[] field_d;
    short[] field_v;
    int[] field_M;
    short[] field_u;
    int field_h;
    short[] field_C;
    short[] field_P;
    int field_b;
    short[] field_z;
    int[] field_p;
    int field_A;
    int[] field_e;
    short[] field_y;
    int field_N;
    static kp field_w;
    int field_J;
    short[] field_H;
    int[] field_j;
    short[] field_F;
    short field_q;
    short field_K;
    short[] field_g;
    int[] field_i;
    short[] field_n;
    int[] field_k;
    short[] field_m;
    short[] field_D;
    short[] field_G;
    static int[] field_c;
    int field_s;
    static en field_l;
    byte[] field_x;

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param4) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((wu) this).a(-126, 92, 16, -17);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6_int = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var6_int ^ -1) <= (((wu) this).field_r ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((wu) this).field_z[var6_int] = (short)(((wu) this).field_z[var6_int] * param0 / param1);
                        ((wu) this).field_P[var6_int] = (short)(((wu) this).field_P[var6_int] * param2 / param1);
                        ((wu) this).field_F[var6_int] = (short)(((wu) this).field_F[var6_int] * param3 / param1);
                        var6_int++;
                        if (var7 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 == 0) {
                            statePc = 6;
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
                        this.a(92);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var6 = (RuntimeException) (Object) caughtException;
                    throw pn.a((Throwable) (Object) var6, "wu.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) {
        try {
            ((wu) this).field_O = false;
            if (param0 < 34) {
                ((wu) this).a(15, 71, -46, 71);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wu.C(" + param0 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 >= 93) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_w = (kp) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5_int = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var5_int ^ -1) <= (((wu) this).field_r ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((wu) this).field_z[var5_int] = (short)(((wu) this).field_z[var5_int] + param0);
                        ((wu) this).field_P[var5_int] = (short)(((wu) this).field_P[var5_int] + param2);
                        ((wu) this).field_F[var5_int] = (short)(((wu) this).field_F[var5_int] + param3);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6 == 0) {
                            statePc = 6;
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
                        this.a(76);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw pn.a((Throwable) (Object) var5, "wu.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        try {
            field_l = null;
            field_w = null;
            field_c = null;
            if (!param0) {
                field_w = (kp) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wu.D(" + param0 + 41);
        }
    }

    final static void a(int param0, boolean param1, java.awt.Component param2, rk param3, int param4, jt param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        wj.a(41, param3, param2, param0, param1, param5, param0, 1024);
                        if (param4 == 32767) {
                            statePc = 17;
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
                        wu.a(47, false, (java.awt.Component) null, (rk) null, 11, (jt) null);
                        statePc = 17;
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
                        stackOut_4_1 = new StringBuilder().append("wu.F(").append(param0).append(44).append(param1).append(44);
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param2 == null) {
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
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param3 == null) {
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
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
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
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param4).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param5 == null) {
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
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
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
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw pn.a((Throwable) (Object) stackIn_16_0, (String) (Object) (stackIn_16_2 + 41));
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        RuntimeException runtimeException = null;
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
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!((wu) this).field_O) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        ((wu) this).field_O = true;
                        var2_int = 32767;
                        var3 = 32767;
                        var4 = param0;
                        var5 = -32768;
                        var6 = -32768;
                        var7 = -32768;
                        var8 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var8 >= ((wu) this).field_r) {
                            statePc = 31;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = ((wu) this).field_z[var8];
                        var10 = ((wu) this).field_P[var8];
                        var11 = ((wu) this).field_F[var8];
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var12 != 0) {
                            statePc = 34;
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
                        stackOut_7_0 = var2_int;
                        stackIn_8_0 = stackOut_7_0;
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
                        if (stackIn_8_0 > var9) {
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2_int = var9;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 > var5) {
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
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5 = var9;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var6 < var10) {
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
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6 = var10;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var10 < var3) {
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
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var3 = var10;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var11 >= var4) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4 = var11;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var11 ^ -1) >= (var7 ^ -1)) {
                            statePc = 30;
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
                        var7 = var11;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((wu) this).field_N = var2_int;
                        ((wu) this).field_s = var4;
                        ((wu) this).field_h = var6;
                        ((wu) this).field_b = var5;
                        ((wu) this).field_J = var3;
                        ((wu) this).field_A = var7;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw pn.a((Throwable) (Object) runtimeException, "wu.B(" + param0 + 41);
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, gk param1) {
        byte[] var2 = null;
        L0: {
          q.field_q = param1;
          var2 = im.a(83, "gamename");
          if (null == var2) {
            break L0;
          } else {
            String discarded$3 = ea.a(0, var2);
            break L0;
          }
        }
        L1: {
          var2 = im.a(63, "youwon");
          if (null != var2) {
            String discarded$4 = ea.a(0, var2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = im.a(76, "institle");
          if (var2 != null) {
            bt.field_b = ea.a(0, var2);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var2 = im.a(121, "pausetitle");
          if (var2 != null) {
            kg.field_c = ea.a(0, var2);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var2 = im.a(110, "settingstitle");
          if (var2 != null) {
            sd.field_m = ea.a(0, var2);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var2 = im.a(46, "scoretitle");
          if (var2 == null) {
            break L5;
          } else {
            fd.field_c = ea.a(0, var2);
            break L5;
          }
        }
        L6: {
          var2 = im.a(97, "wavetitle");
          if (var2 != null) {
            ao.field_a = ea.a(0, var2);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var2 = im.a(47, "nametitle");
          if (var2 != null) {
            ob.field_f = ea.a(0, var2);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = im.a(49, "bsths");
          if (var2 != null) {
            jo.field_l = ea.a(0, var2);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = im.a(63, "myhs");
          if (var2 == null) {
            break L9;
          } else {
            wl.field_zc = ea.a(0, var2);
            break L9;
          }
        }
        L10: {
          var2 = im.a(37, "allhs");
          if (var2 == null) {
            break L10;
          } else {
            mf.field_a = ea.a(0, var2);
            break L10;
          }
        }
        L11: {
          var2 = im.a(91, "thisishidden");
          if (var2 == null) {
            break L11;
          } else {
            pe.field_c = ea.a(0, var2);
            break L11;
          }
        }
        L12: {
          var2 = im.a(57, "orbcoin");
          if (null == var2) {
            break L12;
          } else {
            sd.field_e = ea.a(0, var2);
            break L12;
          }
        }
        L13: {
          var2 = im.a(63, "unknownstuff");
          if (null != var2) {
            fh.field_g = ea.a(0, var2);
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          var2 = im.a(73, "orbpoints");
          if (var2 != null) {
            jk.field_c = ea.a(0, var2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = im.a(96, "achievethisgame");
          if (var2 != null) {
            pm.field_d = ea.a(0, var2);
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          var2 = im.a(37, "achieve");
          if (var2 == null) {
            break L16;
          } else {
            ro.field_p = ea.a(0, var2);
            break L16;
          }
        }
        L17: {
          var2 = im.a(85, "thousandseperator");
          if (var2 == null) {
            break L17;
          } else {
            kp.field_b = ea.a(0, var2);
            break L17;
          }
        }
        L18: {
          var2 = im.a(38, "classicmodeonly");
          if (null == var2) {
            break L18;
          } else {
            ef.field_g = ea.a(0, var2);
            break L18;
          }
        }
        L19: {
          var2 = im.a(104, "startgame");
          if (var2 == null) {
            break L19;
          } else {
            gl.field_c = ea.a(0, var2);
            break L19;
          }
        }
        L20: {
          var2 = im.a(102, "startarcadegame");
          if (var2 == null) {
            break L20;
          } else {
            iu.field_f = ea.a(0, var2);
            break L20;
          }
        }
        L21: {
          var2 = im.a(83, "arcadescores");
          if (null != var2) {
            wq.field_i = ea.a(0, var2);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          var2 = im.a(94, "regularscores");
          if (var2 == null) {
            break L22;
          } else {
            ki.field_c = ea.a(0, var2);
            break L22;
          }
        }
        L23: {
          var2 = im.a(103, "settings");
          if (null != var2) {
            ii.field_l = ea.a(0, var2);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          var2 = im.a(89, "wave_announce,0");
          if (var2 == null) {
            break L24;
          } else {
            oe.field_f[0] = ea.a(0, var2);
            break L24;
          }
        }
        L25: {
          var2 = im.a(110, "wave_announce,1");
          if (var2 == null) {
            break L25;
          } else {
            oe.field_f[1] = ea.a(0, var2);
            break L25;
          }
        }
        L26: {
          var2 = im.a(94, "wave_announce,2");
          if (null != var2) {
            oe.field_f[2] = ea.a(0, var2);
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          var2 = im.a(75, "wave_announce,3");
          if (null == var2) {
            break L27;
          } else {
            oe.field_f[3] = ea.a(0, var2);
            break L27;
          }
        }
        L28: {
          var2 = im.a(100, "wave_announce,4");
          if (var2 != null) {
            oe.field_f[4] = ea.a(0, var2);
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          var2 = im.a(75, "wave_announce,5");
          if (null == var2) {
            break L29;
          } else {
            oe.field_f[5] = ea.a(0, var2);
            break L29;
          }
        }
        L30: {
          var2 = im.a(87, "wave_announce,6");
          if (null != var2) {
            oe.field_f[6] = ea.a(0, var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = im.a(89, "wave_announce,7");
          if (null != var2) {
            oe.field_f[7] = ea.a(0, var2);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          var2 = im.a(118, "wave_announce,8");
          if (null != var2) {
            oe.field_f[8] = ea.a(0, var2);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = im.a(108, "wave_announce,9");
          if (var2 == null) {
            break L33;
          } else {
            oe.field_f[9] = ea.a(0, var2);
            break L33;
          }
        }
        L34: {
          var2 = im.a(127, "wave_announce,10");
          if (var2 != null) {
            oe.field_f[10] = ea.a(0, var2);
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          var2 = im.a(77, "wave_announce,11");
          if (var2 == null) {
            break L35;
          } else {
            oe.field_f[11] = ea.a(0, var2);
            break L35;
          }
        }
        L36: {
          var2 = im.a(44, "wave_announce,12");
          if (null != var2) {
            oe.field_f[12] = ea.a(0, var2);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = im.a(101, "wave_announce,13");
          if (null == var2) {
            break L37;
          } else {
            oe.field_f[13] = ea.a(0, var2);
            break L37;
          }
        }
        L38: {
          var2 = im.a(70, "wave_announce,14");
          if (var2 != null) {
            oe.field_f[14] = ea.a(0, var2);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          var2 = im.a(80, "wave_announce,15");
          if (var2 == null) {
            break L39;
          } else {
            oe.field_f[15] = ea.a(0, var2);
            break L39;
          }
        }
        L40: {
          var2 = im.a(63, "wave_announce,16");
          if (var2 == null) {
            break L40;
          } else {
            oe.field_f[16] = ea.a(0, var2);
            break L40;
          }
        }
        L41: {
          var2 = im.a(105, "wave_announce,17");
          if (var2 == null) {
            break L41;
          } else {
            oe.field_f[17] = ea.a(0, var2);
            break L41;
          }
        }
        L42: {
          var2 = im.a(117, "wave_announce,18");
          if (null != var2) {
            oe.field_f[18] = ea.a(0, var2);
            break L42;
          } else {
            break L42;
          }
        }
        L43: {
          var2 = im.a(59, "wave_announce,19");
          if (var2 != null) {
            oe.field_f[19] = ea.a(0, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          var2 = im.a(44, "wave_announce,20");
          if (null != var2) {
            oe.field_f[20] = ea.a(0, var2);
            break L44;
          } else {
            break L44;
          }
        }
        L45: {
          var2 = im.a(112, "powerup_messages,0");
          if (var2 == null) {
            break L45;
          } else {
            ke.field_c[0] = ea.a(0, var2);
            break L45;
          }
        }
        L46: {
          var2 = im.a(66, "powerup_messages,1");
          if (null != var2) {
            ke.field_c[1] = ea.a(0, var2);
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          var2 = im.a(73, "powerup_messages,2");
          if (null == var2) {
            break L47;
          } else {
            ke.field_c[2] = ea.a(0, var2);
            break L47;
          }
        }
        L48: {
          var2 = im.a(127, "powerup_messages,3");
          if (null != var2) {
            ke.field_c[3] = ea.a(0, var2);
            break L48;
          } else {
            break L48;
          }
        }
        L49: {
          var2 = im.a(67, "achievement_names,0");
          if (null != var2) {
            lb.field_a[0] = ea.a(0, var2);
            break L49;
          } else {
            break L49;
          }
        }
        L50: {
          var2 = im.a(98, "achievement_names,1");
          if (null == var2) {
            break L50;
          } else {
            lb.field_a[1] = ea.a(0, var2);
            break L50;
          }
        }
        L51: {
          var2 = im.a(103, "achievement_names,2");
          if (null != var2) {
            lb.field_a[2] = ea.a(0, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = im.a(42, "achievement_names,3");
          if (var2 != null) {
            lb.field_a[3] = ea.a(0, var2);
            break L52;
          } else {
            break L52;
          }
        }
        L53: {
          var2 = im.a(121, "achievement_names,4");
          if (var2 == null) {
            break L53;
          } else {
            lb.field_a[4] = ea.a(0, var2);
            break L53;
          }
        }
        L54: {
          var2 = im.a(113, "achievement_names,5");
          if (var2 == null) {
            break L54;
          } else {
            lb.field_a[5] = ea.a(0, var2);
            break L54;
          }
        }
        L55: {
          var2 = im.a(84, "achievement_names,6");
          if (null == var2) {
            break L55;
          } else {
            lb.field_a[6] = ea.a(0, var2);
            break L55;
          }
        }
        L56: {
          var2 = im.a(75, "achievement_names,7");
          if (null == var2) {
            break L56;
          } else {
            lb.field_a[7] = ea.a(0, var2);
            break L56;
          }
        }
        L57: {
          var2 = im.a(99, "achievement_names,8");
          if (null != var2) {
            lb.field_a[8] = ea.a(0, var2);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          var2 = im.a(106, "achievement_criteria,0");
          if (null != var2) {
            hn.field_b[0] = ea.a(0, var2);
            break L58;
          } else {
            break L58;
          }
        }
        L59: {
          var2 = im.a(117, "achievement_criteria,1");
          if (null == var2) {
            break L59;
          } else {
            hn.field_b[1] = ea.a(0, var2);
            break L59;
          }
        }
        L60: {
          var2 = im.a(78, "achievement_criteria,2");
          if (var2 == null) {
            break L60;
          } else {
            hn.field_b[2] = ea.a(0, var2);
            break L60;
          }
        }
        L61: {
          var2 = im.a(35, "achievement_criteria,3");
          if (null != var2) {
            hn.field_b[3] = ea.a(0, var2);
            break L61;
          } else {
            break L61;
          }
        }
        L62: {
          var2 = im.a(65, "achievement_criteria,4");
          if (null == var2) {
            break L62;
          } else {
            hn.field_b[4] = ea.a(0, var2);
            break L62;
          }
        }
        L63: {
          var2 = im.a(99, "achievement_criteria,5");
          if (null == var2) {
            break L63;
          } else {
            hn.field_b[5] = ea.a(0, var2);
            break L63;
          }
        }
        L64: {
          var2 = im.a(82, "achievement_criteria,6");
          if (var2 == null) {
            break L64;
          } else {
            hn.field_b[6] = ea.a(0, var2);
            break L64;
          }
        }
        L65: {
          var2 = im.a(123, "achievement_criteria,7");
          if (var2 != null) {
            hn.field_b[7] = ea.a(0, var2);
            break L65;
          } else {
            break L65;
          }
        }
        L66: {
          var2 = im.a(48, "achievement_criteria,8");
          if (var2 == null) {
            break L66;
          } else {
            hn.field_b[8] = ea.a(0, var2);
            break L66;
          }
        }
        L67: {
          var2 = im.a(68, "score_colon_space");
          if (null != var2) {
            String discarded$5 = ea.a(0, var2);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          var2 = im.a(79, "instructions_pages,0");
          if (var2 != null) {
            io.field_a[0] = ea.a(0, var2);
            break L68;
          } else {
            break L68;
          }
        }
        L69: {
          var2 = im.a(102, "instructions_pages,1");
          if (var2 == null) {
            break L69;
          } else {
            io.field_a[1] = ea.a(0, var2);
            break L69;
          }
        }
        L70: {
          var2 = im.a(54, "instructions_pages,2");
          if (null == var2) {
            break L70;
          } else {
            io.field_a[2] = ea.a(0, var2);
            break L70;
          }
        }
        L71: {
          var2 = im.a(105, "instructions_pages,3");
          if (null != var2) {
            io.field_a[3] = ea.a(0, var2);
            break L71;
          } else {
            break L71;
          }
        }
        L72: {
          var2 = im.a(95, "purchasables,0");
          if (var2 != null) {
            ii.field_e[0] = ea.a(0, var2);
            break L72;
          } else {
            break L72;
          }
        }
        L73: {
          var2 = im.a(55, "purchasables,1");
          if (var2 == null) {
            break L73;
          } else {
            ii.field_e[1] = ea.a(0, var2);
            break L73;
          }
        }
        L74: {
          var2 = im.a(109, "purchasables,2");
          if (var2 != null) {
            ii.field_e[2] = ea.a(0, var2);
            break L74;
          } else {
            break L74;
          }
        }
        L75: {
          var2 = im.a(35, "purchasables,3");
          if (null != var2) {
            ii.field_e[3] = ea.a(0, var2);
            break L75;
          } else {
            break L75;
          }
        }
        L76: {
          var2 = im.a(125, "purchasables,4");
          if (null == var2) {
            break L76;
          } else {
            ii.field_e[4] = ea.a(0, var2);
            break L76;
          }
        }
        L77: {
          var2 = im.a(48, "purchasables,5");
          if (null != var2) {
            ii.field_e[5] = ea.a(0, var2);
            break L77;
          } else {
            break L77;
          }
        }
        L78: {
          var2 = im.a(107, "purchasables,6");
          if (var2 == null) {
            break L78;
          } else {
            ii.field_e[6] = ea.a(0, var2);
            break L78;
          }
        }
        L79: {
          var2 = im.a(118, "purchasemessages,0");
          if (null != var2) {
            ae.field_h[0] = ea.a(0, var2);
            break L79;
          } else {
            break L79;
          }
        }
        L80: {
          var2 = im.a(97, "purchasemessages,1");
          if (var2 != null) {
            ae.field_h[1] = ea.a(0, var2);
            break L80;
          } else {
            break L80;
          }
        }
        L81: {
          var2 = im.a(72, "purchasemessages,2");
          if (null != var2) {
            ae.field_h[2] = ea.a(0, var2);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          if (param0 < -35) {
            break L82;
          } else {
            wu.a(true);
            break L82;
          }
        }
        L83: {
          var2 = im.a(80, "purchasemessages,3");
          if (null == var2) {
            break L83;
          } else {
            ae.field_h[3] = ea.a(0, var2);
            break L83;
          }
        }
        L84: {
          var2 = im.a(48, "purchasemessages,4");
          if (var2 != null) {
            ae.field_h[4] = ea.a(0, var2);
            break L84;
          } else {
            break L84;
          }
        }
        L85: {
          var2 = im.a(122, "purchasemessages,5");
          if (null == var2) {
            break L85;
          } else {
            ae.field_h[5] = ea.a(0, var2);
            break L85;
          }
        }
        L86: {
          var2 = im.a(109, "purchasemessages,6");
          if (var2 == null) {
            break L86;
          } else {
            ae.field_h[6] = ea.a(0, var2);
            break L86;
          }
        }
        L87: {
          var2 = im.a(85, "arcadeunlocked");
          if (null == var2) {
            break L87;
          } else {
            ab.field_r = ea.a(0, var2);
            break L87;
          }
        }
        q.field_q = null;
    }

    wu() {
        ((wu) this).field_f = (byte) 0;
        ((wu) this).field_O = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_w = new kp();
    }
}
