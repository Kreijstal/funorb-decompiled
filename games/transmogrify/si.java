/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends wf {
    private int[] field_o;
    static int field_l;
    byte[] field_p;
    hb[] field_j;
    static j field_i;
    nh[] field_m;
    short[] field_k;
    int field_h;
    byte[] field_g;
    byte[] field_n;

    final void d(int param0) {
        if (param0 <= 56) {
            field_i = (j) null;
        }
        this.field_o = null;
    }

    public static void a(byte param0) {
        field_i = null;
        if (param0 < 74) {
            field_i = (j) null;
        }
    }

    final boolean a(bl param0, int[] param1, int param2, byte[] param3) {
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == -1) {
                            statePc = 4;
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
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var5_int = 1;
                        var6 = 0;
                        var7 = null;
                        var8 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var8 ^ -1) <= -129) {
                            statePc = 22;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param3 == null) {
                            statePc = 9;
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
                        if (param3[var8] != 0) {
                            statePc = 9;
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = this.field_o[var8];
                        if (0 != var9) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var10 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var6 ^ -1) != (var9 ^ -1)) {
                            statePc = 14;
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
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = var9;
                        var9--;
                        if ((1 & var9) == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7 = param0.a(param2 + 1673501265, var9 >> 16721986, param1);
                        if (var10 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7 = param0.a(param1, var9 >> -2035343518, (byte) 17);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7 != null) {
                            statePc = 19;
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
                        var5_int = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 == null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_j[var8] = (hb) (var7);
                        this.field_o[var8] = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = var5_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 24: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var5);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("si.A(");
                    stackIn_25_1 = stackIn_26_1;
                    if (param0 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
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
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param1 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_0 = stackIn_32_0;
                    stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');
                    stackIn_31_1 = stackIn_32_1;
                    if (param3 == null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_31_1);
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
                    throw ch.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    si(byte[] param0) {
        int incrementValue$0 = 0;
        nh dupTemp$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        byte[] stackIn_50_0 = null;
        byte[] stackIn_53_0 = null;
        int stackIn_74_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        Object stackIn_130_0 = null;
        byte[] stackIn_130_1 = null;
        byte[] stackIn_155_0 = null;
        Object stackIn_165_0 = null;
        byte[] stackIn_165_1 = null;
        Object stackIn_173_0 = null;
        byte[] stackIn_173_1 = null;
        byte[] stackIn_175_0 = null;
        int stackIn_187_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_210_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_218_1 = 0;
        int stackIn_220_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        int stackIn_237_0 = 0;
        nh stackIn_244_0 = null;
        int stackIn_258_0 = 0;
        int stackIn_262_0 = 0;
        nh stackIn_266_0 = null;
        RuntimeException stackIn_271_0 = null;
        StringBuilder stackIn_271_1 = null;
        RuntimeException stackIn_272_0 = null;
        StringBuilder stackIn_272_1 = null;
        RuntimeException stackIn_273_0 = null;
        StringBuilder stackIn_273_1 = null;
        String stackIn_273_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        nh[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        nh var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28_int = 0;
        nh var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        oa var37 = null;
        byte[] var38 = null;
        nh var39 = null;
        byte[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        nh var44 = null;
        byte[] var45 = null;
        byte[] var46 = null;
        nh var47 = null;
        nh var48 = null;
        nh var49 = null;
        nh var50 = null;
        nh var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var36 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_p = new byte[128];
                    this.field_o = new int[128];
                    this.field_k = new short[128];
                    this.field_n = new byte[128];
                    this.field_j = new hb[128];
                    this.field_g = new byte[128];
                    this.field_m = new nh[128];
                    var37 = new oa(param0);
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (-1 == (var37.field_g[var3 + var37.field_h] ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3++;
                    if (var36 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var54 = new byte[var3];
                    var41 = var54;
                    var4 = var41;
                    var5 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var5 ^ -1) <= (var3 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4[var5] = var37.b(true);
                    var5++;
                    if (var36 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var36 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var37.field_h = var37.field_h + 1;
                    var3++;
                    var5 = var37.field_h;
                    var37.field_h = var37.field_h + var3;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var6 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var37.field_g[var37.field_h - -var6] == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var6++;
                    if (var36 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var55 = new byte[var6];
                    var42 = var55;
                    var7 = var42;
                    var8 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var8 >= var6) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7[var8] = var37.b(true);
                    var8++;
                    if (var36 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var36 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var6++;
                    var37.field_h = var37.field_h + 1;
                    var8 = var37.field_h;
                    var37.field_h = var37.field_h + var6;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var9 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (-1 == (var37.field_g[var37.field_h - -var9] ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var9++;
                    if (var36 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var56 = new byte[var9];
                    var43 = var56;
                    var10 = var43;
                    var11_int = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var9 <= var11_int) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var10[var11_int] = var37.b(true);
                    var11_int++;
                    if (var36 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var36 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var37.field_h = var37.field_h + 1;
                    var9++;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var52 = new byte[var9];
                    var38 = var52;
                    var11 = var38;
                    if (-2 <= (var9 ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var52[1] = (byte) 1;
                    var12 = 2;
                    var13_int = 1;
                    var14 = 2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var9 <= var14) {
                        statePc = 35;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var15_int = var37.d((byte) 72);
                    stackIn_38_0 = var15_int;
                    stackIn_29_0 = stackIn_38_0;
                    if (var36 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    incrementValue$0 = var12;
                    var12++;
                    var13_int = incrementValue$0;
                    if (var36 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((var15_int ^ -1) < (var13_int ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var15_int--;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var13_int = var15_int;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var11[var14] = (byte)var13_int;
                    var14++;
                    if (var36 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var36 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var12 = var9;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = var12;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var13 = new nh[stackIn_38_0];
                    var14 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var13.length <= var14) {
                        statePc = 46;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    dupTemp$1 = new nh();
                    var13[var14] = dupTemp$1;
                    var39 = dupTemp$1;
                    var15 = var39;
                    var16_int = var37.d((byte) 63);
                    stackIn_49_0 = 0;
                    stackIn_41_0 = stackIn_49_0;
                    stackIn_49_1 = var16_int;
                    stackIn_41_1 = stackIn_49_1;
                    if (var36 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 >= stackIn_41_1) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var15.field_g = new byte[var16_int * 2];
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var16_int = var37.d((byte) 90);
                    if (var16_int <= 0) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var15.field_c = new byte[2 + var16_int * 2];
                    var39.field_c[1] = (byte)64;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var14++;
                    if (var36 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var14 = var37.d((byte) 91);
                    if (var14 > 0) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_50_0 = null;
                    statePc = 50;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = 2;
                    stackIn_49_1 = var14;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = new byte[stackIn_49_0 * stackIn_49_1];
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var57 = stackIn_50_0;
                    var45 = var57;
                    var15_array = var45;
                    var14 = var37.d((byte) 87);
                    if ((var14 ^ -1) >= -1) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_53_0 = new byte[var14 * 2];
                    statePc = 53;
                    continue stateLoop;
                }
                case 52: {
                    stackIn_53_0 = null;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var46 = stackIn_53_0;
                    var16 = var46;
                    var17 = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if ((var37.field_g[var17 + var37.field_h] ^ -1) == -1) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var17++;
                    if (var36 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var53 = new byte[var17];
                    var40 = var53;
                    var18 = var40;
                    var19 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var17 <= var19) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var18[var19] = var37.b(true);
                    var19++;
                    if (var36 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (var36 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var17++;
                    var37.field_h = var37.field_h + 1;
                    var19 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var20 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (128 <= var20) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var19 = var19 + var37.d((byte) 45);
                    this.field_k[var20] = (short)var19;
                    var20++;
                    if (var36 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var36 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var19 = 0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    var20 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if ((var20 ^ -1) <= -129) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var19 = var19 + var37.d((byte) 56);
                    this.field_k[var20] = (short)(this.field_k[var20] + (var19 << -2087784504));
                    var20++;
                    if (var36 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var36 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var20 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var21 = 0;
                    var22 = 0;
                    var23 = 0;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (128 <= var23) {
                        statePc = 80;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_81_0 = var20 ^ -1;
                    stackIn_74_0 = stackIn_81_0;
                    if (var36 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (stackIn_74_0 != -1) {
                        statePc = 79;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if ((var53.length ^ -1) >= (var21 ^ -1)) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    incrementValue$2 = var21;
                    var21++;
                    var20 = var18[incrementValue$2];
                    if (var36 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var20 = -1;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var22 = var37.i(17783);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    this.field_k[var23] = (short)(this.field_k[var23] + (vg.c(2, var22 + -1) << -524218994));
                    this.field_o[var23] = var22;
                    var20--;
                    var23++;
                    if (var36 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var21 = 0;
                    var20 = 0;
                    var23 = 0;
                    stackIn_81_0 = 0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var24 = stackIn_81_0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (-129 >= (var24 ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackIn_93_0 = this.field_o[var24] ^ -1;
                    stackIn_84_0 = stackIn_93_0;
                    if (var36 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0 == -1) {
                        statePc = 91;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var20 != 0) {
                        statePc = 90;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if ((var54.length ^ -1) < (var21 ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var20 = -1;
                    if (var36 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    incrementValue$3 = var21;
                    var21++;
                    var20 = var4[incrementValue$3];
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    incrementValue$4 = var5;
                    var5++;
                    var23 = var37.field_g[incrementValue$4] + -1;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    this.field_g[var24] = (byte)var23;
                    var20--;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var24++;
                    if (var36 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var20 = 0;
                    var21 = 0;
                    var24 = 0;
                    stackIn_93_0 = 0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    var25_int = stackIn_93_0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (var25_int >= 128) {
                        statePc = 103;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackIn_104_0 = this.field_o[var25_int];
                    stackIn_96_0 = stackIn_104_0;
                    if (var36 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (stackIn_96_0 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if ((var20 ^ -1) != -1) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    incrementValue$5 = var8;
                    var8++;
                    var24 = var37.field_g[incrementValue$5] + 16 << 967768098;
                    if (var55.length > var21) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var20 = -1;
                    if (var36 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    incrementValue$6 = var21;
                    var21++;
                    var20 = var7[incrementValue$6];
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    this.field_p[var25_int] = (byte)var24;
                    var20--;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var25_int++;
                    if (var36 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var20 = 0;
                    stackIn_104_0 = 0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var21 = stackIn_104_0;
                    var25 = null;
                    var26 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (128 <= var26) {
                        statePc = 115;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_116_0 = -1;
                    stackIn_107_0 = stackIn_116_0;
                    if (var36 != 0) {
                        statePc = 116;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (stackIn_107_0 != (this.field_o[var26] ^ -1)) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var36 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (var20 != 0) {
                        statePc = 113;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var25 = var13[var52[var21]];
                    if ((var21 ^ -1) > (var56.length ^ -1)) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var20 = -1;
                    if (var36 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    incrementValue$7 = var21;
                    var21++;
                    var20 = var10[incrementValue$7];
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var20--;
                    this.field_m[var26] = (nh) (var25);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    var26++;
                    if (var36 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var20 = 0;
                    var21 = 0;
                    var26 = 0;
                    stackIn_116_0 = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var27 = stackIn_116_0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (-129 >= (var27 ^ -1)) {
                        statePc = 126;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackIn_128_0 = -1;
                    stackIn_119_0 = stackIn_128_0;
                    stackIn_128_1 = var20 ^ -1;
                    stackIn_119_1 = stackIn_128_1;
                    if (var36 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (stackIn_119_0 != stackIn_119_1) {
                        statePc = 125;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (var53.length <= var21) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    incrementValue$8 = var21;
                    var21++;
                    var20 = var18[incrementValue$8];
                    if (var36 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var20 = -1;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (-1 <= (this.field_o[var27] ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var26 = var37.d((byte) 99) + 1;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    this.field_n[var27] = (byte)var26;
                    var20--;
                    var27++;
                    if (var36 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_h = 1 + var37.d((byte) 22);
                    var27 = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    stackIn_128_0 = var12 ^ -1;
                    stackIn_128_1 = var27 ^ -1;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 >= stackIn_128_1) {
                        statePc = 142;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var44 = var13[var27];
                    stackIn_173_0 = null;
                    stackIn_130_0 = stackIn_173_0;
                    stackIn_173_1 = var44.field_g;
                    stackIn_130_1 = stackIn_173_1;
                    if (var36 != 0) {
                        statePc = 173;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (stackIn_130_0 == stackIn_130_1) {
                        statePc = 135;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var29 = 1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (var44.field_g.length <= var29) {
                        statePc = 135;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var44.field_g[var29] = var37.b(true);
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 136;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (var36 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (null == var44.field_c) {
                        statePc = 140;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var29 = 3;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if ((var44.field_c.length - 2 ^ -1) >= (var29 ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var44.field_c[var29] = var37.b(true);
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 141;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (var36 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var27++;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (var36 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (var15_array == null) {
                        statePc = 147;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var27 = 1;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (var57.length <= var27) {
                        statePc = 147;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var15_array[var27] = var37.b(true);
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 148;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (var36 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var16 == null) {
                        statePc = 152;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var27 = 1;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if ((var27 ^ -1) <= (var46.length ^ -1)) {
                        statePc = 152;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var16[var27] = var37.b(true);
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 153;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (var36 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var27 = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (var27 >= var12) {
                        statePc = 162;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var47 = var13[var27];
                    stackIn_175_0 = var47.field_c;
                    stackIn_155_0 = stackIn_175_0;
                    if (var36 != 0) {
                        statePc = 175;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (stackIn_155_0 == null) {
                        statePc = 160;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var19 = 0;
                    var29 = 2;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if ((var47.field_c.length ^ -1) >= (var29 ^ -1)) {
                        statePc = 160;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var19 = var19 + (1 - -var37.d((byte) 86));
                    var47.field_c[var29] = (byte)var19;
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 161;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (var36 == 0) {
                        statePc = 157;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var27++;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (var36 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var27 = 0;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    if (var12 <= var27) {
                        statePc = 172;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var48 = var13[var27];
                    stackIn_173_0 = null;
                    stackIn_165_0 = stackIn_173_0;
                    stackIn_173_1 = var48.field_g;
                    stackIn_165_1 = stackIn_173_1;
                    if (var36 != 0) {
                        statePc = 173;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (stackIn_165_0 == stackIn_165_1) {
                        statePc = 170;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var19 = 0;
                    var29 = 2;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (var29 >= var48.field_g.length) {
                        statePc = 170;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var19 = 1 + var19 - -var37.d((byte) 71);
                    var48.field_g[var29] = (byte)var19;
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 171;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (var36 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var27++;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (var36 == 0) {
                        statePc = 163;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    stackIn_173_0 = null;
                    stackIn_173_1 = (byte[]) (var15_array);
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 == stackIn_173_1) {
                        statePc = 196;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var19 = var37.d((byte) 99);
                    stackIn_175_0 = (byte[]) (var15_array);
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    stackIn_175_0[0] = (byte)var19;
                    var27 = 2;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (var57.length <= var27) {
                        statePc = 179;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var19 = var37.d((byte) 98) + var19 + 1;
                    var15_array[var27] = (byte)var19;
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 180;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (var36 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var27 = var57[0];
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    var28_int = var57[1];
                    var29 = 0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (var29 >= var27) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    this.field_n[var29] = (byte)(this.field_n[var29] * var28_int + 32 >> 1824374406);
                    var29++;
                    if (var36 != 0) {
                        statePc = 185;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var36 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var29 = 2;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (var29 >= var57.length) {
                        statePc = 193;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var30 = var57[var29];
                    var31 = var15_array[var29 - -1];
                    var32 = (-var27 + var30) / 2 + var28_int * (var30 - var27);
                    stackIn_202_0 = var27;
                    stackIn_187_0 = stackIn_202_0;
                    if (var36 != 0) {
                        statePc = 202;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var33 = stackIn_187_0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    if ((var33 ^ -1) <= (var30 ^ -1)) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var34 = dh.b(15, var30 + -var27, var32);
                    var32 = var32 + (-var28_int + var31);
                    this.field_n[var33] = (byte)(32 + var34 * this.field_n[var33] >> -440579962);
                    var33++;
                    if (var36 != 0) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (var36 == 0) {
                        statePc = 188;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var27 = var30;
                    var29 += 2;
                    var28_int = var31;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (var36 == 0) {
                        statePc = 185;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var15_array = null;
                    var30 = var27;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (-129 >= (var30 ^ -1)) {
                        statePc = 196;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    this.field_n[var30] = (byte)(this.field_n[var30] * var28_int + 32 >> 965878374);
                    var30++;
                    statePc = 194;
                    continue stateLoop;
                }
                case 196: {
                    if (var16 != null) {
                        statePc = 201;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var27 = 0;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if (var12 <= var27) {
                        statePc = 241;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var13[var27].field_k = var37.d((byte) 90);
                    var27++;
                    if (var36 != 0) {
                        statePc = 242;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (var36 == 0) {
                        statePc = 198;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var19 = var37.d((byte) 53);
                    var16[0] = (byte)var19;
                    stackIn_202_0 = 2;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    var27 = stackIn_202_0;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if ((var27 ^ -1) <= (var46.length ^ -1)) {
                        statePc = 206;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var19 = var37.d((byte) 38) + var19 - -1;
                    var16[var27] = (byte)var19;
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 207;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (var36 == 0) {
                        statePc = 203;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var27 = var46[0];
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    var28_int = var46[1] << 1109827777;
                    var29 = 0;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    if (var29 >= var27) {
                        statePc = 215;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var30 = var28_int + (255 & this.field_p[var29]);
                    stackIn_216_0 = var30;
                    stackIn_210_0 = stackIn_216_0;
                    if (var36 != 0) {
                        statePc = 216;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (stackIn_210_0 >= 0) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var30 = 0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    if (128 >= var30) {
                        statePc = 214;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var30 = 128;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    this.field_p[var29] = (byte)var30;
                    var29++;
                    if (var36 == 0) {
                        statePc = 208;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    stackIn_216_0 = 2;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    var29 = stackIn_216_0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    stackIn_218_0 = var46.length;
                    stackIn_218_1 = var29;
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    if (stackIn_218_0 <= stackIn_218_1) {
                        statePc = 229;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    var30 = var46[var29];
                    var31 = var16[1 + var29] << -1713192063;
                    var32 = (var30 + -var27) * var28_int + (var30 - var27) / 2;
                    stackIn_237_0 = var27;
                    stackIn_220_0 = stackIn_237_0;
                    if (var36 != 0) {
                        statePc = 237;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var33 = stackIn_220_0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if ((var33 ^ -1) <= (var30 ^ -1)) {
                        statePc = 228;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var34 = dh.b(15, -var27 + var30, var32);
                    var35 = var34 + (255 & this.field_p[var33]);
                    stackIn_218_0 = var35 ^ -1;
                    stackIn_223_0 = stackIn_218_0;
                    stackIn_218_1 = -1;
                    stackIn_223_1 = stackIn_218_1;
                    if (var36 != 0) {
                        statePc = 218;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    if (stackIn_223_0 <= stackIn_223_1) {
                        statePc = 225;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var35 = 0;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    if (128 >= var35) {
                        statePc = 227;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    var35 = 128;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    var32 = var32 + (-var28_int + var31);
                    this.field_p[var33] = (byte)var35;
                    var33++;
                    if (var36 == 0) {
                        statePc = 221;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    var28_int = var31;
                    var29 += 2;
                    var27 = var30;
                    if (var36 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    var16 = null;
                    var30 = var27;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if (128 <= var30) {
                        statePc = 236;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var31 = var28_int + (255 & this.field_p[var30]);
                    if (-1 >= (var31 ^ -1)) {
                        statePc = 233;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    var31 = 0;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    if (-129 <= (var31 ^ -1)) {
                        statePc = 235;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var31 = 128;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    this.field_p[var30] = (byte)var31;
                    var30++;
                    statePc = 230;
                    continue stateLoop;
                }
                case 236: {
                    stackIn_237_0 = 0;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    var27 = stackIn_237_0;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if (var12 <= var27) {
                        statePc = 241;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var13[var27].field_k = var37.d((byte) 90);
                    var27++;
                    if (var36 != 0) {
                        statePc = 242;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (var36 == 0) {
                        statePc = 238;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    var27 = 0;
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (var12 <= var27) {
                        statePc = 251;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var49 = var13[var27];
                    var28 = var49;
                    stackIn_266_0 = (nh) (var49);
                    stackIn_244_0 = stackIn_266_0;
                    if (var36 != 0) {
                        statePc = 266;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (stackIn_244_0.field_g == null) {
                        statePc = 246;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    var49.field_f = var37.d((byte) 50);
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    if (null == var49.field_c) {
                        statePc = 248;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var49.field_d = var37.d((byte) 125);
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (var49.field_k <= 0) {
                        statePc = 250;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var49.field_b = var37.d((byte) 22);
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    var27++;
                    if (var36 == 0) {
                        statePc = 242;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var27 = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if ((var27 ^ -1) <= (var12 ^ -1)) {
                        statePc = 255;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var13[var27].field_a = var37.d((byte) 113);
                    var27++;
                    if (var36 != 0) {
                        statePc = 256;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (var36 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var27 = 0;
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    if ((var12 ^ -1) >= (var27 ^ -1)) {
                        statePc = 261;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var50 = var13[var27];
                    stackIn_262_0 = var50.field_a;
                    stackIn_258_0 = stackIn_262_0;
                    if (var36 != 0) {
                        statePc = 262;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (stackIn_258_0 <= 0) {
                        statePc = 260;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var50.field_e = var37.d((byte) 125);
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    var27++;
                    if (var36 == 0) {
                        statePc = 256;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    stackIn_262_0 = 0;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    var27 = stackIn_262_0;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    if (var27 >= var12) {
                        statePc = 274;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    var51 = var13[var27];
                    var28 = var51;
                    if (var36 != 0) {
                        statePc = 275;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    stackIn_266_0 = (nh) (var51);
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if (stackIn_266_0.field_e <= 0) {
                        statePc = 268;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var28.field_i = var37.d((byte) 92);
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    var27++;
                    if (var36 == 0) {
                        statePc = 263;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    return;
                }
                case 275: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_i = new j(8, 161, 247);
    }
}
