/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_b;
    static byte[][][] field_a;
    static int[] field_f;
    static nn field_d;
    static String field_e;
    static int field_c;

    final static void a(boolean param0, int param1, int param2, boolean param3, fr param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        boolean stackIn_41_0 = false;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
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
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = ed.b(9, 3 * (-param1 + param2));
                        var6 = param1 * 3;
                        lj.a(0);
                        var7 = var5_int + -10;
                        if (-1 <= (param4.field_A ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param4.field_p) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        qi.a((byte) 109);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        mc.field_c = 0;
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param4.field_C ^ -1) >= (var8 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param4.field_G[var8];
                        var10 = param4.field_b[var8];
                        var11 = param4.field_c[var8];
                        stackIn_41_0 = param0;
                        stackIn_10_0 = stackIn_41_0;
                        if (var19 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = da.field_M[var9];
                        var13 = ed.field_e[var9];
                        var14 = da.field_M[var10] - var12;
                        var15 = -var12 + da.field_M[var11];
                        var16 = ed.field_e[var10] - var13;
                        var17 = -var13 + ed.field_e[var11];
                        if ((var14 * var17 + -(var15 * var16) ^ -1) <= -1) {
                            statePc = 39;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = vo.field_v[var9];
                        if (var12 == -2147483648) {
                            statePc = 39;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var13 = vo.field_v[var10];
                        if ((var13 ^ -1) == 2147483647) {
                            statePc = 39;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var14 = vo.field_v[var11];
                        if ((var14 ^ -1) == 2147483647) {
                            statePc = 39;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var15 = var12 + (var13 - -var14 + -var6);
                        if ((var7 ^ -1) > -1) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_22_0 = var15 >> var7;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = var15 << -var7;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var16 = -stackIn_22_0 + (fi.field_w.length + -1);
                        var17 = fi.field_w[var16];
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var17 >> -150279260 ^ -1) == -1) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var16--;
                        stackIn_32_0 = -1;
                        stackIn_25_0 = stackIn_32_0;
                        stackIn_32_1 = var16 ^ -1;
                        stackIn_25_1 = stackIn_32_1;
                        if (var19 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 < stackIn_25_1) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var17 = fi.field_w[var16];
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = var16 << 476883268;
                        stackIn_32_1 = var17;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var18 = stackIn_32_0 + stackIn_32_1;
                        ek.field_jb[var18] = var8;
                        fi.field_w[var16] = var17 + 1;
                        if (param4.field_A <= 0) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param4.field_p == null) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        dupTemp$0 = param4.field_p[var8];
                        ke.field_m[dupTemp$0] = ke.field_m[dupTemp$0] + 1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        mc.field_c = mc.field_c + 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = param3;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!stackIn_41_0) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        field_e = (String) null;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (0 >= param4.field_A) {
                            statePc = 60;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (param4.field_p == null) {
                            statePc = 60;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var9 >= ke.field_m.length) {
                            statePc = 60;
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
                        var10 = ke.field_m[var9];
                        ke.field_m[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 60;
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
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_58_0 = (RuntimeException) (var5);
                    stackIn_56_0 = stackIn_58_0;
                    stackIn_58_1 = new StringBuilder().append("bm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_56_1 = stackIn_58_1;
                    if (param4 == null) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_59_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackIn_59_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackIn_59_2 = "{...}";
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_59_2 = "null";
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    throw qb.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ')');
                }
                case 60: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, mf param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        pi var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        fr var5 = null;
        int[] var6 = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new pi(param1.a(-72, "logo.fo3d", ""));
                        var3 = var2.l(param0 + 325);
                        var2.n(param0 + -47);
                        um.field_o = rk.a(var2, 24);
                        gg.field_i = new fr[var3];
                        rn.field_e = new int[var3][];
                        if (param0 == -70) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var4 ^ -1) <= (var3 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        gg.field_i[var4] = hc.a(16, var2);
                        var4++;
                        if (var7 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2.f((byte) 116);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var4 ^ -1) <= (var3 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = gg.field_i[var4];
                        var5.a(6, 127, 1, 6, 6);
                        var5.c(param0 + 93);
                        var6 = new int[]{var5.field_N + var5.field_f >> 940687521, var5.field_d + var5.field_y >> -687323711, var5.field_x + var5.field_q >> -229240351};
                        rn.field_e[var4] = var6;
                        var5.a(-var6[2], param0 ^ -70, -var6[0], -var6[1]);
                        var4++;
                        if (var7 != 0) {
                            statePc = 22;
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
                        if (var7 == 0) {
                            statePc = 11;
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
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var2_ref);
                    stackIn_18_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("bm.E(").append(param0).append(',');
                    stackIn_18_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_18_1);
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
                    throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, j param3, int param4, int param5, String param6, byte param7) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        double var9 = 0.0;
        int var11 = 0;
        try {
          L0: {
            if ((param3.field_U ^ -1) > -51) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8_int = -50 + param3.field_U;
                var9 = 250.0 * Math.abs(Math.cos(0.1 * (double)var8_int)) * Math.exp((double)(-var8_int) / 40.0);
                if (param7 >= 69) {
                  break L1;
                } else {
                  field_c = -9;
                  break L1;
                }
              }
              L2: {
                if ((var8_int ^ -1) > -111) {
                  break L2;
                } else {
                  var9 = 0.0;
                  break L2;
                }
              }
              L3: {
                var9 = var9 / (double)param5;
                vn.field_w.d(param0 - 7 / param5, -(7 / param5) + (param1 + -(int)var9));
                vn.field_w.g(-(7 / param5) + param0, (int)var9 + -(7 / param5) + (param1 - -vn.field_w.field_z));
                if (-131 >= (var8_int ^ -1)) {
                  L4: {
                    var11 = var8_int + -130;
                    if (-101 <= (var11 ^ -1)) {
                      break L4;
                    } else {
                      var11 = 100;
                      break L4;
                    }
                  }
                  var11 = var11 * 128 / 50;
                  nn.field_g.b(param6, param0 + param4 / (2 * param5), nn.field_g.field_B + (param2 / (2 * param5) + (param1 + -(100 / param5))), 0, -1, var11);
                  lo.a(param4, var11, 60, param0, param5, param1, param2, param3);
                  break L3;
                } else {
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8);

            stackIn_18_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_19_0), stackIn_23_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, vl param4) {
        int stackIn_74_0 = 0;
        kl stackIn_78_0 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        qc var6 = null;
        kl var6_ref = null;
        Object var7_ref = null;
        int var7 = 0;
        oe[] var8_ref_oe__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param3 == -30791) {
                break L1;
              } else {
                bm.a(98, -116, false, -50, (vl) null);
                break L1;
              }
            }
            var6 = (qc) ((Object) param4.d(-65));
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 == null) {
                    break L4;
                  } else {
                    var7_ref = null;
                    stackIn_74_0 = 1;

                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_74_0 != var6.field_m) {
                          L6: {
                            if (var6.field_m == 0) {
                              break L6;
                            } else {
                              if (-3 != (var6.field_m ^ -1)) {
                                if (-5 == (var6.field_m ^ -1)) {
                                  var5_int++;
                                  if (var10 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  if ((var6.field_m ^ -1) == -6) {
                                    var7_ref = ta.field_e[5];
                                    break L5;
                                  } else {
                                    if (6 != var6.field_m) {
                                      if (var6.field_m == 7) {
                                        var7_ref = ta.field_e[7];
                                        break L5;
                                      } else {
                                        if (3 == var6.field_m) {
                                          var7_ref = ef.field_a[var6.field_j];
                                          break L5;
                                        } else {
                                          if (8 == var6.field_m) {
                                            var7_ref = ta.field_e[10];
                                            break L5;
                                          } else {
                                            if (9 == var6.field_m) {
                                              var7_ref = ta.field_e[11];
                                              break L5;
                                            } else {
                                              if (-11 == (var6.field_m ^ -1)) {
                                                var7_ref = ta.field_e[12];
                                                break L5;
                                              } else {
                                                if (-12 == (var6.field_m ^ -1)) {
                                                  var7_ref = cg.field_p[oo.field_w.a(-37880252, cg.field_p.length)];
                                                  break L5;
                                                } else {
                                                  if (-13 != (var6.field_m ^ -1)) {
                                                    if ((var6.field_m ^ -1) == -15) {
                                                      var7_ref = ta.field_e[14];
                                                      break L5;
                                                    } else {
                                                      if (-14 != (var6.field_m ^ -1)) {
                                                        break L5;
                                                      } else {
                                                        var7_ref = ta.field_e[15];
                                                        break L5;
                                                      }
                                                    }
                                                  } else {
                                                    var7_ref = ta.field_e[13];
                                                    break L5;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var7_ref = ta.field_e[6];
                                      break L5;
                                    }
                                  }
                                }
                              } else {
                                var7_ref = fr.field_e[oo.field_w.a(-37880252, fr.field_e.length)];
                                break L5;
                              }
                            }
                          }
                          var7_ref = mh.field_ob[oo.field_w.a(-37880252, mh.field_ob.length)];
                          break L5;
                        } else {
                          if (oa.field_Sb != null) {
                            L7: {
                              var8_ref_oe__ = oa.field_Sb.a(0);
                              if (0 < oa.field_Sb.field_l) {
                                var7_ref = var8_ref_oe__[oo.field_w.a(-37880252, oa.field_Sb.field_l)];
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L8: {
                        if (null != var7_ref) {
                          j.a((oe) (var7_ref), -56, param0);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var6 = (qc) ((Object) param4.a((byte) 116));
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_74_0 = param2 ? 1 : 0;
                break L3;
              }
              L9: {
                if (stackIn_74_0 == 0) {
                  stackIn_78_0 = to.field_k;
                  break L9;
                } else {
                  stackIn_78_0 = me.field_d;
                  break L9;
                }
              }
              L10: {
                var6_ref = stackIn_78_0;
                var7 = var5_int * param1;
                var8 = var6_ref.h();
                var9 = var5_int + 1 << 979290722;
                if (var8 - -var9 >= var7) {
                  break L10;
                } else {
                  var7 = var8 - -var9;
                  break L10;
                }
              }
              L11: {
                if ((var8 - var9 ^ -1) < (var7 ^ -1)) {
                  var7 = var8 + -var9;
                  break L11;
                } else {
                  break L11;
                }
              }
              var6_ref.d(ki.field_d * var7 / 256);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_89_0 = (RuntimeException) (var5);

            stackIn_89_1 = new StringBuilder().append("bm.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_90_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "null";
              break L12;
            } else {
              stackIn_90_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "{...}";
              break L12;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_90_0), stackIn_90_2 + ')');
        }
    }

    final static void a(mf param0, mf param1, int param2, mf param3, wp param4, mf param5, mf param6) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              L2: {
                ln.a(param6, param4, param0, param5, param1, param2 ^ -24870, param3);
                fd.field_d[1] = (ki) ((Object) new fi(1, "BaB_arctic", "BaB_block_arctic", 6));
                fd.field_d[2] = (ki) ((Object) new oo(2, "BaB_chocolate", "BaB_block_chocolate", 8));
                fd.field_d[3] = (ki) ((Object) new sn(3, "BaB_construction", "BaB_block_construction", 8));
                fd.field_d[4] = (ki) ((Object) new gi(4, "BaB_desert", "BaB_block_desert", 4));
                fd.field_d[6] = (ki) ((Object) new ip(6, "BaB_jungle", "BaB_block_jungle", 4));
                fd.field_d[7] = (ki) ((Object) new ai(7, "BaB_city_paris", "BaB_block_city", 5));
                fd.field_d[8] = (ki) ((Object) new ci(8, "BaB_space", "BaB_block_space", 8));
                fd.field_d[9] = (ki) ((Object) new td(9, "BaB_volcano", "BaB_block_volcano", 6));
                fd.field_d[10] = (ki) ((Object) new jk(10, "BaB_underthesea", "BaB_block_underwater", 5));
                if (lc.a(0, param2 ^ -24881)) {
                  break L2;
                } else {
                  fd.field_d[5] = (ki) ((Object) new qb(5, "BaB_farmyard", "BaB_block_farmyard", 7));
                  if (!BrickABrac.field_J) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              fd.field_d[5] = (ki) ((Object) new dp(5, "BaB_halloween", "BaB_block_halloween", 8));
              break L1;
            }
            L3: {
              if (param2 == 24876) {
                break L3;
              } else {
                bm.a((byte) 96);
                break L3;
              }
            }
            fd.field_d[11] = (ki) ((Object) new qa(11, "BAB_ninja", "BaB_block_ninja", 7));
            sk.field_H = 11;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7);

            stackIn_14_1 = new StringBuilder().append("bm.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param5 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param6 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_35_2 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_e = null;
            field_d = null;
            field_b = null;
            field_f = null;
            int var1_int = -21 / ((param0 - -44) / 60);
            field_a = (byte[][][]) null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "bm.F(" + param0 + ')');
        }
    }

    static {
        field_b = "Set up new game";
        field_f = new int[]{29, 31, 30, 8};
        field_e = "<%0> cannot join; the game has started.";
        field_c = 200;
    }
}
