/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static int field_a;
    static fe field_b;

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        e var4_ref_e = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        e var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        rk.field_n = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
                        var1_int = rf.field_eb.length;
                        var21 = new int[var1_int];
                        var20 = var21;
                        var2 = var20;
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1_int <= var3) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4_ref_e = rf.field_eb[var3];
                        var17 = var4_ref_e;
                        var17 = var4_ref_e;
                        var4_ref_e.a(22856);
                        l.a(var3, -87);
                        var5 = var4_ref_e.field_t + var4_ref_e.field_P >> -1731126143;
                        var6 = var4_ref_e.field_O + var4_ref_e.field_u >> 1412566657;
                        var7 = var4_ref_e.field_i + var4_ref_e.field_k >> -1596816735;
                        var8 = rk.field_n[9] >> -390669566;
                        var9 = rk.field_n[10] >> 1258268034;
                        var10_int = rk.field_n[11] >> -1071120062;
                        var11 = var10_int * qd.field_a[5] + var9 * qd.field_a[4] + var8 * qd.field_a[3] >> 279874894;
                        var12 = var9 * qd.field_a[7] + qd.field_a[6] * var8 + qd.field_a[8] * var10_int >> -1906025650;
                        var13 = qd.field_a[9] * var8 - (-(var9 * qd.field_a[10]) + -(qd.field_a[11] * var10_int)) >> -537249234;
                        var2[var3] = var13 * var7 + var6 * var12 + var11 * var5 >> -1363314128;
                        var3++;
                        if (var19 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var19 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = rk.field_n[9] >> -754950712;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = rk.field_n[10] >> -738775320;
                        var5 = rk.field_n[11] >> -1235034008;
                        var6 = si.field_l << -957934428;
                        if (param0 == 16) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        f.a(true);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = 0;
                        var8 = pe.a(4096, var6) >> 117989000;
                        var9 = ri.a(-124, var6) >> 1189305032;
                        if (oa.field_j == -1) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-1 == bk.field_a) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = -320 + oa.field_j;
                        var9 = -128;
                        var8 = 240 - bk.field_a;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var8 * var8 + var7 * var7)));
                        var7 = (int)((double)var7 * var10);
                        var8 = (int)((double)var8 * var10);
                        var9 = (int)((double)var9 * var10);
                        var12 = -var3 + var7;
                        var13 = -var4 + var8;
                        var14 = var9 - var5;
                        var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 - -(var13 * var13)));
                        var14 = (int)((double)var14 * var10);
                        var13 = (int)((double)var13 * var10);
                        var12 = (int)((double)var12 * var10);
                        var15 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = rf.field_eb.length;
                        stackIn_14_1 = var15;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 <= stackIn_14_1) {
                            statePc = 32;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var16 = 0;
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        return;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var17_int = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var17_int >= rf.field_eb.length) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_14_0 = var21[var17_int] ^ -1;
                        stackIn_20_0 = stackIn_14_0;
                        stackIn_14_1 = var21[var16] ^ -1;
                        stackIn_20_1 = stackIn_14_1;
                        if (var19 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 >= stackIn_20_1) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var16 = var17_int;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var17_int++;
                        if (var19 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var21[var16] = -2147483648;
                        var17 = rf.field_eb[var16];
                        l.a(var16, -95);
                        var18 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (3 <= var18) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        qd.field_a[var18] = qd.field_a[var18] + ae.field_a[var15][var18];
                        var18++;
                        if (var19 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var19 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        gg.a((byte) 119, rk.field_n, true, false, var17, false, qd.field_a);
                        vd.a(var12, var14, var7, var8, -110, var13, var17, var9);
                        var15++;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var19 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) runtimeException), "f.C(" + param0 + ')');
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_b = (fe) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static ii a(int param0) {
        ii var1 = new ii(pj.field_y, ll.field_U, gj.field_j[0], re.field_a[0], ql.field_b[0], wk.field_b[param0], re.field_K[0], rg.field_D);
        wd.d(param0 ^ 9);
        return var1;
    }

    static {
    }
}
