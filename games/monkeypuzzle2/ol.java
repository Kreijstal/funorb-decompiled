/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private int field_b;
    private int[] field_i;
    private int[] field_a;
    private int field_d;
    static na field_h;
    private int field_f;
    private int field_c;
    static id field_g;
    static int field_e;

    public static void a(int param0) {
        field_g = null;
        if (param0 < 108) {
            field_h = (na) null;
        }
        field_h = null;
    }

    final int c(int param0) {
        if (!(param0 != this.field_d)) {
            this.b(param0 ^ 0);
            this.field_d = 256;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_a[fieldTemp$0];
    }

    private final void d(int param0) {
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (param0 == 8273) {
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
                    var6 = -1640531527;
                    var4 = -1640531527;
                    var3 = -1640531527;
                    var10 = -1640531527;
                    var9 = -1640531527;
                    var8 = -1640531527;
                    var5 = -1640531527;
                    var7 = -1640531527;
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (4 <= var2) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = var3 ^ var4 << 573062603;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 929804802;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 19940136;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 1533786544;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 1573691690;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1167363356;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 1607644456;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -869402487;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    var2++;
                    if (var11 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var11 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var2 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((var2 ^ -1) <= -257) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = var5 + this.field_a[2 + var2];
                    var4 = var4 + this.field_a[var2 - -1];
                    var6 = var6 + this.field_a[var2 + 3];
                    var9 = var9 + this.field_a[6 + var2];
                    var7 = var7 + this.field_a[4 + var2];
                    var10 = var10 + this.field_a[var2 - -7];
                    var3 = var3 + this.field_a[var2];
                    var8 = var8 + this.field_a[var2 - -5];
                    var3 = var3 ^ var4 << -850095765;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 1288611490;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -914708728;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 532454032;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1520898710;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -45382492;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 1187904808;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 2076644009;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_i[var2] = var3;
                    this.field_i[1 + var2] = var4;
                    this.field_i[var2 + 2] = var5;
                    this.field_i[3 + var2] = var6;
                    this.field_i[4 + var2] = var7;
                    this.field_i[5 + var2] = var8;
                    this.field_i[6 + var2] = var9;
                    this.field_i[var2 - -7] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var11 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var2 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if ((var2 ^ -1) <= -257) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var6 = var6 + this.field_i[3 + var2];
                    var8 = var8 + this.field_i[var2 - -5];
                    var7 = var7 + this.field_i[var2 - -4];
                    var3 = var3 + this.field_i[var2];
                    var5 = var5 + this.field_i[2 + var2];
                    var4 = var4 + this.field_i[var2 + 1];
                    var10 = var10 + this.field_i[var2 - -7];
                    var9 = var9 + this.field_i[var2 + 6];
                    var3 = var3 ^ var4 << -1534587381;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 585986754;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -364741208;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -531678064;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -1428087446;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -577372732;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -1415483064;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 248481641;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_i[var2] = var3;
                    this.field_i[1 + var2] = var4;
                    this.field_i[2 + var2] = var5;
                    this.field_i[var2 + 3] = var6;
                    this.field_i[4 + var2] = var7;
                    this.field_i[var2 - -5] = var8;
                    this.field_i[6 + var2] = var9;
                    this.field_i[var2 - -7] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var11 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.b(0);
                    this.field_d = 256;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        gk var16 = null;
        gk var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var16 = new gk(param0);
                        var17 = var16;
                        var17.field_h = -2 + param0.length;
                        eg.field_c = var17.j(17277);
                        ra.field_ab = new int[eg.field_c];
                        j.field_d = new boolean[eg.field_c];
                        cb.field_b = new byte[eg.field_c][];
                        qc.field_P = new int[eg.field_c];
                        da.field_c = new int[eg.field_c];
                        mb.field_b = new int[eg.field_c];
                        jj.field_E = new byte[eg.field_c][];
                        var17.field_h = -7 + param0.length - 8 * eg.field_c;
                        nj.field_d = var17.j(17277);
                        qk.field_a = var17.j(17277);
                        var3 = (255 & var17.a((byte) 114)) - -1;
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 >= eg.field_c) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        qc.field_P[var4] = var16.j(17277);
                        var4++;
                        if (var15 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var15 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 <= -53) {
                            statePc = 8;
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
                        field_e = 83;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4 >= eg.field_c) {
                            statePc = 13;
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
                        mb.field_b[var4] = var16.j(17277);
                        var4++;
                        if (var15 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var15 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var4 >= eg.field_c) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        da.field_c[var4] = var16.j(17277);
                        var4++;
                        if (var15 != 0) {
                            statePc = 19;
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
                        if (var15 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var4 >= eg.field_c) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ra.field_ab[var4] = var16.j(17277);
                        var4++;
                        if (var15 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var15 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var17.field_h = -(3 * (var3 + -1)) + -(8 * eg.field_c) + (-7 + param0.length);
                        fk.field_d = new int[var3];
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4 = 1;
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
                        if (var3 <= var4) {
                            statePc = 30;
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
                        fk.field_d[var4] = var16.c((byte) -121);
                        stackIn_31_0 = fk.field_d[var4];
                        stackIn_27_0 = stackIn_31_0;
                        if (var15 != 0) {
                            statePc = 31;
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
                        if (stackIn_27_0 != 0) {
                            statePc = 29;
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
                        fk.field_d[var4] = 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4++;
                        if (var15 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var17.field_h = 0;
                        stackIn_31_0 = 0;
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
                        var4 = stackIn_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = var4;
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
                        stackIn_34_0 = stackIn_33_0;
                        stackIn_34_1 = eg.field_c;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 >= stackIn_34_1) {
                            statePc = 83;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = da.field_c[var4];
                        var6 = ra.field_ab[var4];
                        var7 = var6 * var5;
                        var20 = new byte[var7];
                        var18 = var20;
                        var8 = var18;
                        cb.field_b[var4] = var20;
                        var21 = new byte[var7];
                        var19 = var21;
                        var9 = var19;
                        jj.field_E[var4] = var21;
                        var10 = 0;
                        var11 = var17.a((byte) 114);
                        if (var15 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_38_0 = -1;
                        stackIn_38_1 = var11 & 1 ^ -1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = stackIn_37_0;
                        stackIn_38_1 = stackIn_37_1 ^ stackIn_37_2;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 != stackIn_38_1) {
                            statePc = 53;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var12 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var12 >= var7) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var8[var12] = var16.k(-77);
                        var12++;
                        if (var15 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var15 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (0 == (2 & var11)) {
                            statePc = 76;
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
                        var12 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var12 >= var7) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        dupTemp$0 = var16.k(-108);
                        var9[var12] = dupTemp$0;
                        var13 = dupTemp$0;
                        stackIn_34_0 = var10;
                        stackIn_48_0 = stackIn_34_0;
                        stackIn_34_1 = var13 ^ -1;
                        stackIn_48_1 = stackIn_34_1;
                        if (var15 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_50_0 = stackIn_48_0;
                        stackIn_49_0 = stackIn_50_0;
                        if (stackIn_48_1 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_51_0 = stackIn_49_0;
                        stackIn_51_1 = 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = stackIn_50_0;
                        stackIn_51_1 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var10 = stackIn_51_0 | stackIn_51_1;
                        var12++;
                        if (var15 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var15 == 0) {
                            statePc = 76;
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
                        var12 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var12 >= var5) {
                            statePc = 63;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_64_0 = 0;
                        stackIn_56_0 = stackIn_64_0;
                        if (var15 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var13 = stackIn_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var6 <= var13) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var8[var12 + var5 * var13] = var16.k(34);
                        var13++;
                        if (var15 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var15 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var12++;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var15 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = 0;
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
                        if (stackIn_64_0 == (var11 & 2)) {
                            statePc = 76;
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
                        var12 = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var12 >= var5) {
                            statePc = 76;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_33_0 = 0;
                        stackIn_68_0 = stackIn_33_0;
                        if (var15 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var13 = stackIn_68_0;
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
                        if (var6 <= var13) {
                            statePc = 75;
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
                        dupTemp$1 = var16.k(-117);
                        var9[var5 * var13 + var12] = dupTemp$1;
                        var14 = dupTemp$1;
                        stackIn_37_0 = var10;
                        stackIn_71_0 = stackIn_37_0;
                        stackIn_37_1 = -1;
                        stackIn_71_1 = stackIn_37_1;
                        stackIn_37_2 = var14;
                        stackIn_71_2 = stackIn_37_2;
                        if (var15 != 0) {
                            statePc = 37;
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
                        stackIn_73_0 = stackIn_71_0;
                        stackIn_72_0 = stackIn_73_0;
                        if (stackIn_71_1 == stackIn_71_2) {
                            statePc = 73;
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
                        stackIn_74_0 = stackIn_72_0;
                        stackIn_74_1 = 1;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackIn_74_0 = stackIn_73_0;
                        stackIn_74_1 = 0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var10 = stackIn_74_0 | stackIn_74_1;
                        var13++;
                        if (var15 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var12++;
                        if (var15 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        j.field_d[var4] = var10 != 0;
                        var4++;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var15 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 79: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_81_0 = (RuntimeException) (var2);
                    stackIn_80_0 = stackIn_81_0;
                    stackIn_81_1 = new StringBuilder().append("ol.B(");
                    stackIn_80_1 = stackIn_81_1;
                    if (param0 == null) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_82_2 = "{...}";
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_82_2 = "null";
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    throw la.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ',' + param1 + ')');
                }
                case 83: {
                    return;
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = MonkeyPuzzle2.field_F ? 1 : 0;
                    fieldTemp$0 = this.field_c + 1;
                    this.field_c = this.field_c + 1;
                    this.field_f = this.field_f + fieldTemp$0;
                    var2 = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-257 >= (var2 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = this.field_i[var2];
                    if (var5 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if ((var2 & 2) == 0) {
                        statePc = 9;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (0 != (var2 & 1)) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_b = this.field_b ^ this.field_b << -316251678;
                    if (var5 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_b = this.field_b ^ this.field_b >>> 200121584;
                    if (var5 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-1 != (1 & var2 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_b = this.field_b ^ this.field_b << 1363682445;
                    if (var5 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_b = this.field_b ^ this.field_b >>> 1428725478;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    this.field_b = this.field_b + this.field_i[var2 - -128 & 255];
                    dupTemp$1 = this.field_i[ch.a(1020, var3) >> -765259934] + (this.field_b - -this.field_f);
                    var4 = dupTemp$1;
                    this.field_i[var2] = dupTemp$1;
                    dupTemp$2 = var3 + this.field_i[ch.a(var4, 261285) >> 662818120 >> -1828268158];
                    this.field_f = dupTemp$2;
                    this.field_a[var2] = dupTemp$2;
                    var2++;
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ol(int[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_a = new int[256];
                        this.field_i = new int[256];
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0.length <= var2_int) {
                            statePc = 5;
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
                        this.field_a[var2_int] = param0[var2_int];
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 11;
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
                        if (var3 == 0) {
                            statePc = 2;
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
                        this.d(8273);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_9_0 = (RuntimeException) (runtimeException);
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = new StringBuilder().append("ol.<init>(");
                    stackIn_8_1 = stackIn_9_1;
                    if (param0 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_8_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_8_1);
                    stackIn_10_2 = "{...}";
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_10_2 = "null";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ad a(int param0, int param1) {
        if (param0 >= -87) {
            field_g = (id) null;
        }
        return em.a(false, param1, false, true, 1, 50);
    }

    static {
        field_h = new na();
        field_e = 256;
    }
}
