/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pw {
    static int field_a;
    private static String field_z;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        wma var4_ref_wma = null;
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
        wma var17 = null;
        int var17_int = 0;
        wma var17_ref = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        uib.field_p = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
                        var1_int = eha.field_o.length;
                        var23 = new int[var1_int];
                        var22 = var23;
                        var21 = var22;
                        var20 = var21;
                        var2 = var20;
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 >= var1_int) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4_ref_wma = eha.field_o[var3];
                        var17 = var4_ref_wma;
                        var17 = var4_ref_wma;
                        var4_ref_wma.a(84);
                        rv.a(-37, var3);
                        var5 = var4_ref_wma.field_B + var4_ref_wma.field_d >> 444455841;
                        var6 = var4_ref_wma.field_u + var4_ref_wma.field_a >> 394147265;
                        var7 = var4_ref_wma.field_s - -var4_ref_wma.field_q >> 1189930849;
                        var8 = uib.field_p[9] >> -1310901534;
                        var9 = uib.field_p[10] >> 1051754402;
                        var10_int = uib.field_p[11] >> 172944546;
                        var11 = var9 * eob.field_p[4] + (var8 * eob.field_p[3] + eob.field_p[5] * var10_int) >> -1939472690;
                        var12 = var9 * eob.field_p[7] + eob.field_p[6] * var8 + var10_int * eob.field_p[8] >> -1341327570;
                        var13 = eob.field_p[11] * var10_int + var9 * eob.field_p[10] + eob.field_p[9] * var8 >> -1047338450;
                        var2[var3] = var13 * var7 + var5 * var11 - -(var6 * var12) >> 1993440496;
                        var3++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == 74) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        pw.a((byte) 57);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = uib.field_p[9] >> 301890344;
                        var4 = uib.field_p[10] >> -846164440;
                        var5 = uib.field_p[11] >> 1832288584;
                        var6 = nd.field_r << -297999964;
                        var7 = 0;
                        var8 = eu.a(var6, 57) >> 417026088;
                        var9 = fc.a(var6, (byte) 61) >> -1876127800;
                        if (0 == (kc.field_b ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (uia.field_b == -1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = 240 + -uia.field_b;
                        var9 = -128;
                        var7 = kc.field_b - 320;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 - -(var9 * var9)));
                        var8 = (int)((double)var8 * var10);
                        var9 = (int)((double)var9 * var10);
                        var7 = (int)((double)var7 * var10);
                        var12 = -var3 + var7;
                        var13 = var8 + -var4;
                        var14 = var9 - var5;
                        var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 - -(var14 * var14))));
                        var12 = (int)((double)var12 * var10);
                        var14 = (int)((double)var14 * var10);
                        var13 = (int)((double)var13 * var10);
                        var15 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var15 >= eha.field_o.length) {
                            statePc = 23;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var16 = 0;
                        var17_int = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var17_int >= eha.field_o.length) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var23[var17_int] > var23[var16]) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var16 = var17_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var17_int++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var23[var16] = -2147483648;
                        var17_ref = eha.field_o[var16];
                        rv.a(param0 ^ -34, var16);
                        var18 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var18 >= 3) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        eob.field_p[var18] = eob.field_p[var18] + raa.field_p[var15][var18];
                        var18++;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        wl.a(var17_ref, eob.field_p, false, true, false, uib.field_p, false);
                        kt.a(var17_ref, var13, var12, -119, var14, var8, var9, var7);
                        var15++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw rta.a((Throwable) (Object) var1, field_z + param0 + 41);
                }
                case 23: {
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
        field_z = "pw.B(";
    }
}
