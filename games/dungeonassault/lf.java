/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends kl {
    private String field_r;
    static cn field_x;
    static u[] field_y;
    private pp field_o;
    static String field_v;
    private pp field_s;
    static String field_p;
    static wh field_w;
    boolean field_u;
    static cn field_n;
    private String field_t;
    static String field_m;
    static String field_q;

    final void a(boolean param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        super.a(param0);
                        if (hh.field_s == null) {
                            statePc = 10;
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
                        stackOut_1_0 = this;
                        stackIn_6_0 = stackOut_1_0;
                        stackIn_2_0 = stackOut_1_0;
                        if ((Object) (Object) hh.field_s != (Object) (Object) ((lf) this).field_o) {
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
                        stackOut_2_0 = this;
                        stackIn_4_0 = stackOut_2_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackOut_4_1 = 1;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
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
                        ((lf) this).field_u = stackIn_7_1 != 0;
                        ((lf) this).field_d = true;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw vk.a((Throwable) (Object) var2, "lf.A(" + param0 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(int param0) {
        try {
            field_w = null;
            int var1_int = 36 / ((-82 - param0) / 35);
            field_v = null;
            field_p = null;
            field_q = null;
            field_y = null;
            field_m = null;
            field_n = null;
            field_x = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "lf.C(" + param0 + 41);
        }
    }

    lf(String param0, String param1) {
        this(param0, param1, 300);
    }

    final void b(int param0) {
        int var3 = 0;
        int var4 = 0;
        try {
            int var2_int = -31 / ((param0 - 41) / 63);
            super.b(-91);
            var3 = ((lf) this).field_k - -(((lf) this).field_a >> 94289665);
            var4 = ((lf) this).field_j + 10;
            ne.field_c.c(((lf) this).field_t, var3, ne.field_c.field_H + var4, 16777215, -1);
            var4 = var4 + ne.field_c.field_H;
            int discarded$0 = la.field_b.a(((lf) this).field_r, 20 + ((lf) this).field_k, var4, ((lf) this).field_a - 40, -(jm.field_i.field_v * 2) + (-24 + -var4) + (((lf) this).field_i + ((lf) this).field_j), 16777215, -1, 1, 1, la.field_b.field_H);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "lf.F(" + param0 + 41);
        }
    }

    private lf(String param0, String param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        ((lf) this).field_t = param0;
                        ((lf) this).field_r = param1;
                        var4_int = 88 - (-(2 * jm.field_i.field_v) + -(oj.a(((lf) this).field_r, -1, new int[1], (se) (Object) la.field_b) * la.field_b.field_H));
                        ((lf) this).a(param2, 0, var4_int);
                        ((lf) this).field_d = false;
                        ((lf) this).field_o = tn.a(((lf) this).field_k + (-jm.field_i.field_y + ((lf) this).field_a >> 1876504897), ((lf) this).field_i + (((lf) this).field_j - 24 + -(jm.field_i.field_v * 2)), (se) (Object) ne.field_c, jm.field_i, -81, mp.field_e);
                        ((lf) this).field_s = tn.a(((lf) this).field_k - -(-jm.field_i.field_y + ((lf) this).field_a >> -1717012031), -16 + ((lf) this).field_j - (-((lf) this).field_i + jm.field_i.field_v), (se) (Object) ne.field_c, jm.field_i, -111, um.field_d);
                        ((lf) this).field_f.a((ne) (Object) ((lf) this).field_o, false);
                        ((lf) this).field_f.a((ne) (Object) ((lf) this).field_s, false);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) var4;
                        stackOut_4_1 = new StringBuilder().append("lf.<init>(");
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
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param1 == null) {
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
                    throw vk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
                }
                case 13: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void d(byte param0) {
        RuntimeException var1 = null;
        wj var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref = null;
        int var4 = 0;
        bo var5 = null;
        String var6 = null;
        String var7 = null;
        bo var7_ref = null;
        int var8 = 0;
        int stackIn_13_0 = 0;
        String stackIn_64_0 = null;
        boolean stackIn_65_0 = false;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        String stackOut_63_0 = null;
        boolean stackOut_64_0 = false;
        int stackOut_73_0 = 0;
        int stackOut_74_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_ref = ra.field_c;
                        var2 = var1_ref.c(true);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 == (var2 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null != lh.field_p) {
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
                        lh.field_p = new tb(128);
                        kp.field_e = 0;
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
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-2 != (var1_ref.c(true) ^ -1)) {
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
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
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
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3_int = stackIn_13_0;
                        var4_ref = var1_ref.d(-119);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var3_int != 0) {
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
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        String discarded$1 = var1_ref.d(-103);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = vj.a(var4_ref, 49);
                        var6 = var1_ref.d(-99);
                        var7 = jm.a((byte) 59, (CharSequence) (Object) var4_ref);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 == null) {
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = var4_ref;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5 == null) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5 = vj.a(var6, 116);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var5 != null) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
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
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        lh.field_p.a((ll) (Object) var5, (long)var7.hashCode(), -106);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var5 == null) {
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
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var5 = new bo();
                        lh.field_p.a((ll) (Object) var5, (long)var7.hashCode(), param0 ^ -59);
                        kp.field_e = kp.field_e + 1;
                        var5.field_Ib = kp.field_e;
                        fm.field_b.a((ne) (Object) var5, false);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5.field_Hb = var4_ref;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return;
                }
                case 37: {
                    try {
                        if (var2 == 1) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (fk.field_v == null) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        fk.field_v = new tb(128);
                        o.field_m = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var3 = var1_ref.d(-127);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var3.equals((Object) (Object) "")) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3 = null;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var4_ref = var1_ref.d(param0 + -230);
                        var5 = (bo) (Object) var1_ref.d(-117);
                        var6 = (String) (Object) ll.a(var4_ref, (byte) -47);
                        if (null != var6) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var6 = (String) (Object) ll.a((String) (Object) var5, (byte) -47);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (null != var6) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        fk.field_v.a((ll) (Object) var6, (long)jm.a((byte) 59, (CharSequence) (Object) var4_ref).hashCode(), -86);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (null != var6) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var6 = (String) (Object) new bo();
                        fk.field_v.a((ll) (Object) var6, (long)jm.a((byte) 59, (CharSequence) (Object) var4_ref).hashCode(), param0 ^ -69);
                        o.field_m = o.field_m + 1;
                        ((bo) (Object) var6).field_Ib = o.field_m;
                        jm.field_f.a((ne) (Object) var6, false);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var3 != null) {
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
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var3 = var3.intern();
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        ((bo) (Object) var6).field_Nb = var3;
                        ((bo) (Object) var6).field_Hb = var4_ref;
                        ((bo) (Object) var6).a(false);
                        var7_ref = (bo) (Object) jm.field_f.e(-24172);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var7_ref == null) {
                            statePc = 69;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = (String) var6;
                        stackIn_64_0 = stackOut_63_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = eg.a((bo) (Object) stackIn_64_0, param0 + 77, var7_ref);
                        stackIn_76_0 = stackOut_64_0 ? 1 : 0;
                        stackIn_65_0 = stackOut_64_0;
                        if (var8 != 0) {
                            statePc = 76;
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
                        if (!stackIn_65_0) {
                            statePc = 69;
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
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var7_ref = (bo) (Object) jm.field_f.a(param0 + -119);
                        if (var8 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var7_ref != null) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        jm.field_f.a((ne) (Object) var6, false);
                        if (var8 == 0) {
                            statePc = 77;
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
                        stackOut_73_0 = 55;
                        stackIn_74_0 = stackOut_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = stackIn_74_0;
                        stackIn_76_0 = stackOut_74_0;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        so.a((byte) stackIn_76_0, (ne) (Object) var7_ref, (ne) (Object) var6);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 77: {
                    return;
                }
                case 78: {
                    try {
                        if (param0 == 123) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        lf.d((byte) 37);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var2 != 2) {
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
                        if ((ke.field_d ^ -1) == -2) {
                            statePc = 88;
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
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        ke.field_d = 2;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 89: {
                    return;
                }
                case 90: {
                    try {
                        if (-4 != (var2 ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if ((ke.field_d ^ -1) != -3) {
                            statePc = 97;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        ke.field_d = 1;
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
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 97: {
                    return;
                }
                case 98: {
                    try {
                        if (4 == var2) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        ke.field_d = 1;
                        var3 = var1_ref.d(param0 + -247);
                        gm.field_b = var3.intern();
                        var4 = var1_ref.c(true);
                        r.a((byte) -112, var4);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    return;
                }
                case 103: {
                    try {
                        sm.a((Throwable) null, 1, "F1: " + sj.l(param0 + 69));
                        tl.a(param0 ^ -61);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 105: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw vk.a((Throwable) (Object) var1, "lf.D(" + param0 + 41);
                }
                case 106: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Ogre Thug";
        field_p = "Berserker";
        field_q = "Please send me news and updates (I can unsubscribe at any time)";
        field_m = "This guardian is lethal.";
    }
}
