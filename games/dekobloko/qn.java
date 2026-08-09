/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends t {
    private boolean field_qb;
    private r field_ob;
    private String field_kb;
    private String field_mb;
    static int field_lb;
    static String field_pb;
    private boolean field_nb;
    static String field_rb;

    final static vj a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        vj var8 = new vj();
        uk var9 = new uk();
        var9.field_n = 10000;
        var9.field_A = param5;
        var9.field_q = new pi[param0 * param5];
        var9.field_r = param2;
        var9.field_w = param4;
        var9.field_u = param1;
        var9.field_t = param0;
        var9.field_v = param6;
        var8.a(var9, 2777);
        int var10 = -11 / ((param7 - 10) / 35);
        var9.b(11976, param3);
        return var8;
    }

    qn(ka param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_kb = param1;
            if (this.field_kb != null) {
                var3_int = ec.field_p.b(this.field_kb, 260, ec.field_p.field_R);
                this.a(112, 300, var3_int + 150);
            }
            this.field_ob = new r(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_nb = false;
            this.field_ob.field_L = true;
            this.field_qb = false;
            this.b(this.field_ob, (byte) -55);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(byte param0) {
        ck var2;
        field_pb = null;
        if (param0 <= 60) {
          var2 = (ck) null;
          qn.a((ck) null, (ck) null, (byte) -20);
          field_rb = null;
          return;
        } else {
          field_rb = null;
          return;
        }
    }

    final static void c(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ug var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -20494) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_pb = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = (ug) ((Object) qi.field_Q.c((byte) 125));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == null) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        in.a(var4, (byte) -70, param1);
                        var4 = (ug) ((Object) qi.field_Q.d(true));
                        if (var3 == 0) {
                            statePc = 7;
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
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
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
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var2), "qn.HA(" + param0 + ',' + param1 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void m(byte param0) {
        this.field_ob.field_L = false;
        this.field_nb = true;
        if (param0 < 75) {
            this.m((byte) -99);
        }
    }

    final static void a(ck param0, ck param1, byte param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ck var17 = null;
        int[] var24 = null;
        int[] var25 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = 1.0f;
                        var6 = param1.field_I;
                        var7 = param1.field_H;
                        var24 = param1.field_D;
                        var25 = param0.field_D;
                        var10 = 0;
                        if (param2 <= -73) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var17 = (ck) null;
                        qn.a((ck) null, (ck) null, (byte) 15);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 <= var11) {
                            statePc = 22;
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
                        if (var16 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var12 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6 <= var12) {
                            statePc = 12;
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
                        var13 = 255 & var24[var10];
                        var14 = var12 + var11 - -(var13 / 5) - -uf.field_A & 127;
                        var5 = (float)var13 / 255.0f;
                        var3_float = (float)var14 / 128.0f;
                        var15 = nm.a(var3_float, var5, false, var4);
                        var25[var10] = var15;
                        var10++;
                        var12++;
                        if (var16 != 0) {
                            statePc = 13;
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
                        if (var16 == 0) {
                            statePc = 8;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11++;
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
                        if (var16 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var3);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("qn.EA(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
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
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
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
                    throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, fd param1, int param2, wl param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            kl var15 = null;
            byte[][] var16 = null;
            String var17 = null;
            String var18 = null;
            byte[][] var19 = null;
            int var20 = 0;
            int var21 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var14 = client.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var15 = new kl();
                            var15.field_o = param3.d((byte) -116);
                            var15.field_C = param3.i(7553);
                            var15.field_q = new int[var15.field_o];
                            var15.field_A = new int[var15.field_o];
                            var15.field_s = new byte[var15.field_o][][];
                            var15.field_y = new mh[var15.field_o];
                            var15.field_u = new int[var15.field_o];
                            var15.field_t = new mh[var15.field_o];
                            var5 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var5 >= var15.field_o) {
                                statePc = 43;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var6_int = param3.d((byte) -21);
                            var21 = var6_int;
                            var20 = 0;
                            if (var14 != 0) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_3 instanceof SecurityException ? 38 : ((Object) stateCaught_3 instanceof NullPointerException ? 39 : ((Object) stateCaught_3 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var20 == var21) {
                                statePc = 32;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = ((Object) stateCaught_4 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_4 instanceof SecurityException ? 38 : ((Object) stateCaught_4 instanceof NullPointerException ? 39 : ((Object) stateCaught_4 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_5 instanceof SecurityException ? 38 : ((Object) stateCaught_5 instanceof NullPointerException ? 39 : ((Object) stateCaught_5 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var20 == var21) {
                                statePc = 45;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_6 instanceof SecurityException ? 38 : ((Object) stateCaught_6 instanceof NullPointerException ? 39 : ((Object) stateCaught_6 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_7 instanceof SecurityException ? 38 : ((Object) stateCaught_7 instanceof NullPointerException ? 39 : ((Object) stateCaught_7 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((var6_int ^ -1) == -2) {
                                statePc = 32;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_8 instanceof SecurityException ? 38 : ((Object) stateCaught_8 instanceof NullPointerException ? 39 : ((Object) stateCaught_8 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (-3 == (var6_int ^ -1)) {
                                statePc = 32;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_9 instanceof SecurityException ? 38 : ((Object) stateCaught_9 instanceof NullPointerException ? 39 : ((Object) stateCaught_9 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if ((var6_int ^ -1) == -4) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_10 instanceof SecurityException ? 38 : ((Object) stateCaught_10 instanceof NullPointerException ? 39 : ((Object) stateCaught_10 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (4 == var6_int) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_11 instanceof SecurityException ? 38 : ((Object) stateCaught_11 instanceof NullPointerException ? 39 : ((Object) stateCaught_11 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_12 instanceof SecurityException ? 38 : ((Object) stateCaught_12 instanceof NullPointerException ? 39 : ((Object) stateCaught_12 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var17 = param3.c((byte) -38);
                            var8 = param3.c((byte) -38);
                            var9 = param3.d((byte) -72);
                            var10 = new String[var9];
                            var11_int = 0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_13 instanceof SecurityException ? 38 : ((Object) stateCaught_13 instanceof NullPointerException ? 39 : ((Object) stateCaught_13 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var11_int >= var9) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_14 instanceof SecurityException ? 38 : ((Object) stateCaught_14 instanceof NullPointerException ? 39 : ((Object) stateCaught_14 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var10[var11_int] = param3.c((byte) -38);
                            var11_int++;
                            if (var14 != 0) {
                                statePc = 42;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_15 instanceof SecurityException ? 38 : ((Object) stateCaught_15 instanceof NullPointerException ? 39 : ((Object) stateCaught_15 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var14 == 0) {
                                statePc = 14;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_16 instanceof SecurityException ? 38 : ((Object) stateCaught_16 instanceof NullPointerException ? 39 : ((Object) stateCaught_16 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = ((Object) stateCaught_17 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_17 instanceof SecurityException ? 38 : ((Object) stateCaught_17 instanceof NullPointerException ? 39 : ((Object) stateCaught_17 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var19 = new byte[var9][];
                            var16 = var19;
                            var11 = var16;
                            if (-4 != (var6_int ^ -1)) {
                                statePc = 24;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_18 instanceof SecurityException ? 38 : ((Object) stateCaught_18 instanceof NullPointerException ? 39 : ((Object) stateCaught_18 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var12_int = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = ((Object) stateCaught_19 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_19 instanceof SecurityException ? 38 : ((Object) stateCaught_19 instanceof NullPointerException ? 39 : ((Object) stateCaught_19 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var9 <= var12_int) {
                                statePc = 24;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = ((Object) stateCaught_20 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_20 instanceof SecurityException ? 38 : ((Object) stateCaught_20 instanceof NullPointerException ? 39 : ((Object) stateCaught_20 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var13 = param3.i(7553);
                            array$0 = new byte[var13];
                            var11[var12_int] = array$0;
                            param3.a(var19[var12_int], 0, (byte) 127, var13);
                            var12_int++;
                            if (var14 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_21 instanceof SecurityException ? 38 : ((Object) stateCaught_21 instanceof NullPointerException ? 39 : ((Object) stateCaught_21 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var14 == 0) {
                                statePc = 20;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = ((Object) stateCaught_22 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_22 instanceof SecurityException ? 38 : ((Object) stateCaught_22 instanceof NullPointerException ? 39 : ((Object) stateCaught_22 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_23 instanceof SecurityException ? 38 : ((Object) stateCaught_23 instanceof NullPointerException ? 39 : ((Object) stateCaught_23 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var15.field_u[var5] = var6_int;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_24 instanceof SecurityException ? 38 : ((Object) stateCaught_24 instanceof NullPointerException ? 39 : ((Object) stateCaught_24 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var12 = new Class[var9];
                            var13 = 0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_25 instanceof SecurityException ? 38 : ((Object) stateCaught_25 instanceof NullPointerException ? 39 : ((Object) stateCaught_25 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var9 <= var13) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_26 instanceof SecurityException ? 38 : ((Object) stateCaught_26 instanceof NullPointerException ? 39 : ((Object) stateCaught_26 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var12[var13] = cg.a(var10[var13], (byte) -122);
                            var13++;
                            if (var14 != 0) {
                                statePc = 31;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_27 instanceof SecurityException ? 38 : ((Object) stateCaught_27 instanceof NullPointerException ? 39 : ((Object) stateCaught_27 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var14 == 0) {
                                statePc = 26;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_28 instanceof SecurityException ? 38 : ((Object) stateCaught_28 instanceof NullPointerException ? 39 : ((Object) stateCaught_28 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_29 instanceof SecurityException ? 38 : ((Object) stateCaught_29 instanceof NullPointerException ? 39 : ((Object) stateCaught_29 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var15.field_t[var5] = param1.a(-10962, var8, cg.a(var17, (byte) -108), var12);
                            var15.field_s[var5] = var19;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_30 instanceof SecurityException ? 38 : ((Object) stateCaught_30 instanceof NullPointerException ? 39 : ((Object) stateCaught_30 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var14 == 0) {
                                statePc = 42;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_31 instanceof SecurityException ? 38 : ((Object) stateCaught_31 instanceof NullPointerException ? 39 : ((Object) stateCaught_31 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var18 = param3.c((byte) -38);
                            var8 = param3.c((byte) -38);
                            var9 = 0;
                            if (1 == var6_int) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_32 instanceof SecurityException ? 38 : ((Object) stateCaught_32 instanceof NullPointerException ? 39 : ((Object) stateCaught_32 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_33 instanceof SecurityException ? 38 : ((Object) stateCaught_33 instanceof NullPointerException ? 39 : ((Object) stateCaught_33 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var9 = param3.i(7553);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_34 instanceof SecurityException ? 38 : ((Object) stateCaught_34 instanceof NullPointerException ? 39 : ((Object) stateCaught_34 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var15.field_u[var5] = var6_int;
                            var15.field_q[var5] = var9;
                            var15.field_y[var5] = param1.a(false, var8, cg.a(var18, (byte) 9));
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_35 instanceof SecurityException ? 38 : ((Object) stateCaught_35 instanceof NullPointerException ? 39 : ((Object) stateCaught_35 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            var15.field_A[var5] = -1;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6_ref = (SecurityException) ((Object) caughtException);
                            var15.field_A[var5] = -2;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var6_ref2 = (NullPointerException) ((Object) caughtException);
                            var15.field_A[var5] = -3;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6_ref3 = (Exception) ((Object) caughtException);
                            var15.field_A[var5] = -4;
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
                            var6_ref4 = caughtException;
                            var15.field_A[var5] = -5;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var5++;
                            if (var14 == 0) {
                                statePc = 2;
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
                            if (param2 == 4210752) {
                                statePc = 45;
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
                            field_pb = (String) null;
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
                            aa.field_f.a(var15, 2777);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        var4 = (RuntimeException) ((Object) caughtException);
                        stackIn_49_0 = (RuntimeException) (var4);
                        stackIn_48_0 = stackIn_49_0;
                        stackIn_49_1 = new StringBuilder().append("qn.JA(").append(param0).append(',');
                        stackIn_48_1 = stackIn_49_1;
                        if (param1 == null) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                        stackIn_50_1 = (StringBuilder) ((Object) stackIn_48_1);
                        stackIn_50_2 = "{...}";
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 49: {
                        stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                        stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                        stackIn_50_2 = "null";
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        stackIn_52_0 = (RuntimeException) ((Object) stackIn_50_0);
                        stackIn_51_0 = stackIn_52_0;
                        stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param2).append(',');
                        stackIn_51_1 = stackIn_52_1;
                        if (param3 == null) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        stackIn_53_0 = (RuntimeException) ((Object) stackIn_51_0);
                        stackIn_53_1 = (StringBuilder) ((Object) stackIn_51_1);
                        stackIn_53_2 = "{...}";
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 52: {
                        stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
                        stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                        stackIn_53_2 = "null";
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        throw dh.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
                    }
                    case 54: {
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

    final void a(boolean param0, float param1, int param2, String param3) {
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 != (this.field_qb ? 1 : 0)) {
                break L2;
              } else {
                L3: {
                  stackIn_6_0 = this;

                  if (!param0) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L3;
                  }
                }
                ((qn) (this)).field_qb = stackIn_7_1 != 0;
                if (this.field_qb) {
                  this.field_ob.a(4210752, 4088, 8405024);
                  this.field_ob.field_L = true;
                  break L2;
                } else {
                  this.field_ob.a(4210752, 4088, 2113632);
                  if (!this.field_nb) {
                    break L2;
                  } else {
                    this.field_ob.field_L = false;
                    if (!client.field_A) {
                      break L2;
                    } else {
                      this.field_ob.a(4210752, 4088, 8405024);
                      this.field_ob.field_L = true;
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (param2 == 4210752) {
                break L4;
              } else {
                qn.l(68);
                break L4;
              }
            }
            this.field_ob.field_Q = (int)(param1 / 100.0f * 65536.0f);
            this.field_mb = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("qn.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(-128, param1, param2);
        ec.field_p.b(this.field_mb, (this.field_t >> -544182591) + param2, 103 + param1, 16777215, -1);
        if (param0 >= -127) {
          return;
        } else {
          L0: {
            if (null == this.field_kb) {
              break L0;
            } else {
              hk.a(param2 - -20, param1 - -113, 260, 8421504);
              ec.field_p.a(this.field_kb, param2 - -20, 128 + param1, 260, 100, 16777215, -1, 1, 0, ec.field_p.field_R);
              break L0;
            }
          }
          return;
        }
    }

    final static void l(int param0) {
        if (!jh.field_h) {
          if (param0 != 13) {
            field_rb = (String) null;
            return;
          } else {
            return;
          }
        } else {
          pf.a(false);
          if (param0 == 13) {
            return;
          } else {
            field_rb = (String) null;
            return;
          }
        }
    }

    static {
        field_pb = "This game has started.";
        field_rb = "Log in / Create account";
    }
}
