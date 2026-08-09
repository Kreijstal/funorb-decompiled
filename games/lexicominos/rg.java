/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static int[] field_c;
    static int field_b;
    static String field_d;
    static String field_a;

    final static void a(db[] param0, int param1, byte param2, int param3) {
        ki.field_a = new wh(param0);
        wh.field_f = param3;
        if (param2 != -105) {
            return;
        }
        try {
            id.field_v = param1;
            ge.f(72);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "rg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 < -91) {
            break L0;
          } else {
            field_c = (int[]) null;
            break L0;
          }
        }
        if (null != ol.field_l) {
          var1 = ol.field_l;
          synchronized (var1) {
            L1: {
              ol.field_l = null;
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 0) {
            rg.b(8);
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        pk var4_ref_pk = null;
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
        pk var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ae.field_M = new int[]{param0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
                        var1_int = ae.field_J.length;
                        var21 = new int[var1_int];
                        var20 = var21;
                        var2 = var20;
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
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
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4_ref_pk = ae.field_J[var3];
                        var17 = var4_ref_pk;
                        var17 = var4_ref_pk;
                        var4_ref_pk.a((byte) -50);
                        u.b(var3, -119);
                        var5 = var4_ref_pk.field_v + var4_ref_pk.field_m >> -351007007;
                        var6 = var4_ref_pk.field_G + var4_ref_pk.field_M >> -1727207135;
                        var7 = var4_ref_pk.field_O - -var4_ref_pk.field_F >> 232142913;
                        var8 = ae.field_M[9] >> -1467711358;
                        var9 = ae.field_M[10] >> -1040104862;
                        var10_int = ae.field_M[11] >> -1922749086;
                        var11 = var10_int * oj.field_l[5] + var8 * oj.field_l[3] - -(var9 * oj.field_l[4]) >> -1888821970;
                        var12 = var8 * oj.field_l[6] - -(oj.field_l[7] * var9) + oj.field_l[8] * var10_int >> 1625374030;
                        var13 = var8 * oj.field_l[9] + (oj.field_l[10] * var9 - -(var10_int * oj.field_l[11])) >> -476690770;
                        var2[var3] = var7 * var13 + var12 * var6 + var5 * var11 >> 1508913360;
                        var3++;
                        if (var19 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 30;
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
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = ae.field_M[9] >> -89894072;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = ae.field_M[10] >> 1113561416;
                        var5 = ae.field_M[11] >> -1990331032;
                        var6 = mc.field_k << -370566780;
                        var7 = 0;
                        var8 = m.a(var6, (byte) 30) >> -2144669688;
                        var9 = nb.a(-95, var6) >> -2072174136;
                        if (-1 == bk.field_b) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (sh.field_e != -1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = -sh.field_e + 240;
                        var7 = bk.field_b + -320;
                        var9 = -128;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 - -(var9 * var9))));
                        var7 = (int)((double)var7 * var10);
                        var9 = (int)((double)var9 * var10);
                        var8 = (int)((double)var8 * var10);
                        var12 = var7 - var3;
                        var13 = var8 + -var4;
                        var14 = var9 + -var5;
                        var10 = 256.0 / Math.sqrt((double)(var12 * var12 - (-(var13 * var13) - var14 * var14)));
                        var12 = (int)((double)var12 * var10);
                        var14 = (int)((double)var14 * var10);
                        var13 = (int)((double)var13 * var10);
                        var15 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = ae.field_J.length;
                        stackIn_13_1 = var15;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 <= stackIn_13_1) {
                            statePc = 31;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var16 = 0;
                        if (var19 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        return;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var17_int = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var17_int >= ae.field_J.length) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_13_0 = var21[var16] ^ -1;
                        stackIn_19_0 = stackIn_13_0;
                        stackIn_13_1 = var21[var17_int] ^ -1;
                        stackIn_19_1 = stackIn_13_1;
                        if (var19 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 <= stackIn_19_1) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var16 = var17_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var17_int++;
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var21[var16] = -2147483648;
                        var17 = ae.field_J[var16];
                        u.b(var16, -114);
                        var18 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var18 >= 3) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        oj.field_l[var18] = oj.field_l[var18] + uj.field_f[var15][var18];
                        var18++;
                        if (var19 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        da.a(oj.field_l, true, ae.field_M, false, false, var17, (byte) -58);
                        ff.a(var13, var7, var8, var12, var14, var9, (byte) -116, var17);
                        var15++;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var19 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) runtimeException), "rg.A(" + param0 + ')');
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_d = "Passwords can only contain letters and numbers";
        field_a = "Names cannot contain consecutive spaces";
    }
}
