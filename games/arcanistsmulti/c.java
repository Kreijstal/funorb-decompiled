/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static java.security.SecureRandom field_b;
    static String field_c;
    static ll[] field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var9 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param3 ^ -1) > (param0 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3 < param5) {
                            statePc = 14;
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
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param5 > param0) {
                            statePc = 11;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        wg.a(param6, 2973, param7, param0, de.field_l, param3, param2, param5, param4);
                        if (var9 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
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
                        wg.a(param7, 2973, param6, param5, de.field_l, param3, param2, param0, param4);
                        if (var9 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        wg.a(param4, 2973, param6, param3, de.field_l, param5, param2, param0, param7);
                        if (var9 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param5 > param0) {
                            statePc = 29;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param5 <= param3) {
                            statePc = 26;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        wg.a(param7, 2973, param4, param5, de.field_l, param0, param2, param3, param6);
                        if (var9 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        wg.a(param4, 2973, param7, param3, de.field_l, param0, param2, param5, param6);
                        if (var9 == 0) {
                            statePc = 32;
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
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        wg.a(param6, 2973, param4, param0, de.field_l, param5, param2, param3, param7);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param1 > 60) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        field_c = null;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var8 = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) var8, "c.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_c = null;
              field_a = null;
              if (param0 >= 26) {
                break L0;
              } else {
                field_c = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_b = null;
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        kc var5_ref = null;
        kc var6 = null;
        kc var7 = null;
        kc var8 = null;
        String var9_ref = null;
        int var9 = 0;
        String var10_ref = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vn var17 = null;
        cg var18 = null;
        int var18_int = 0;
        int var19 = 0;
        boolean stackIn_19_0 = false;
        kc stackIn_27_0 = null;
        kc stackIn_28_0 = null;
        long stackIn_28_1 = 0L;
        kc stackIn_29_0 = null;
        kc stackIn_31_0 = null;
        kc stackIn_33_0 = null;
        kc stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_95_0 = 0;
        Object stackIn_105_0 = null;
        Object stackIn_109_0 = null;
        boolean[][] stackIn_120_0 = null;
        Object stackIn_124_0 = null;
        int[][] stackIn_152_0 = null;
        boolean stackIn_160_0 = false;
        boolean stackIn_175_0 = false;
        cg stackIn_185_0 = null;
        int stackIn_213_0 = 0;
        boolean[] stackIn_215_0 = null;
        boolean stackIn_243_0 = false;
        int stackIn_252_0 = 0;
        kc stackIn_273_0 = null;
        kc stackIn_274_0 = null;
        boolean stackIn_274_1 = false;
        kc stackIn_275_0 = null;
        kc stackIn_277_0 = null;
        kc stackIn_278_0 = null;
        boolean stackIn_278_1 = false;
        kc stackIn_279_0 = null;
        kc stackIn_281_0 = null;
        kc stackIn_283_0 = null;
        kc stackIn_284_0 = null;
        int stackIn_284_1 = 0;
        kc stackIn_285_0 = null;
        kc stackIn_286_0 = null;
        boolean stackIn_286_1 = false;
        kc stackIn_287_0 = null;
        kc stackIn_289_0 = null;
        kc stackIn_290_0 = null;
        boolean stackIn_290_1 = false;
        kc stackIn_291_0 = null;
        kc stackIn_293_0 = null;
        kc stackIn_295_0 = null;
        kc stackIn_296_0 = null;
        int stackIn_296_1 = 0;
        kc stackIn_297_0 = null;
        kc stackIn_298_0 = null;
        boolean stackIn_298_1 = false;
        kc stackIn_299_0 = null;
        kc stackIn_301_0 = null;
        kc stackIn_302_0 = null;
        boolean stackIn_302_1 = false;
        kc stackIn_303_0 = null;
        kc stackIn_305_0 = null;
        kc stackIn_307_0 = null;
        kc stackIn_308_0 = null;
        int stackIn_308_1 = 0;
        Throwable caughtException = null;
        boolean stackOut_18_0 = false;
        kc stackOut_26_0 = null;
        kc stackOut_27_0 = null;
        long stackOut_27_1 = 0L;
        kc stackOut_28_0 = null;
        kc stackOut_29_0 = null;
        kc stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        kc stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_94_0 = 0;
        Object stackOut_104_0 = null;
        Object stackOut_108_0 = null;
        boolean[][] stackOut_119_0 = null;
        Object stackOut_123_0 = null;
        int[][] stackOut_151_0 = null;
        boolean stackOut_159_0 = false;
        boolean stackOut_174_0 = false;
        cg stackOut_184_0 = null;
        int stackOut_212_0 = 0;
        boolean[] stackOut_214_0 = null;
        boolean stackOut_242_0 = false;
        int stackOut_251_0 = 0;
        kc stackOut_272_0 = null;
        kc stackOut_273_0 = null;
        boolean stackOut_273_1 = false;
        kc stackOut_274_0 = null;
        kc stackOut_275_0 = null;
        kc stackOut_277_0 = null;
        boolean stackOut_277_1 = false;
        kc stackOut_278_0 = null;
        kc stackOut_279_0 = null;
        kc stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        kc stackOut_283_0 = null;
        int stackOut_283_1 = 0;
        kc stackOut_284_0 = null;
        kc stackOut_285_0 = null;
        boolean stackOut_285_1 = false;
        kc stackOut_286_0 = null;
        kc stackOut_287_0 = null;
        kc stackOut_289_0 = null;
        boolean stackOut_289_1 = false;
        kc stackOut_290_0 = null;
        kc stackOut_291_0 = null;
        kc stackOut_293_0 = null;
        int stackOut_293_1 = 0;
        kc stackOut_295_0 = null;
        int stackOut_295_1 = 0;
        kc stackOut_296_0 = null;
        kc stackOut_297_0 = null;
        boolean stackOut_297_1 = false;
        kc stackOut_298_0 = null;
        kc stackOut_299_0 = null;
        kc stackOut_301_0 = null;
        boolean stackOut_301_1 = false;
        kc stackOut_302_0 = null;
        kc stackOut_303_0 = null;
        kc stackOut_305_0 = null;
        int stackOut_305_1 = 0;
        kc stackOut_307_0 = null;
        int stackOut_307_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    ej.a(16, oo.field_y);
                    if (wi.field_f == null) {
                        statePc = 272;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    mo.field_o.field_ub = true;
                    var5_ref = go.field_d;
                    go.field_d.field_I = 0;
                    var5_ref.field_x = 0;
                    dk.field_k.field_I = 0;
                    var6 = dk.field_k;
                    var6.field_x = 0;
                    var7 = jf.field_d;
                    jf.field_d.field_I = 0;
                    var7.field_x = 0;
                    if (!qk.k((byte) 105)) {
                        statePc = 261;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    nl.field_Db.field_rb = fb.field_c.toUpperCase();
                    var9 = (2 + oh.field_h.field_x) / 2;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    go.field_d.a(-2 + var9, 0, -40 + oh.field_h.field_I, 40, (byte) -120);
                    if (wi.field_f.field_Rb >= wi.field_f.field_dc) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    go.field_d.field_rb = mb.field_O.toUpperCase();
                    go.field_d.field_ub = true;
                    if (var19 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    go.field_d.field_rb = ck.field_f.toUpperCase();
                    go.field_d.field_ub = false;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    go.field_d.field_v = ko.field_h.field_v;
                    if (0 < oe.field_b) {
                        statePc = 14;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((oe.field_b ^ -1) == -2) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var10_ref = tj.a(-36, new String[1], mm.field_y);
                    if (var19 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10_ref = qk.field_pb;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((16 & sb.field_e ^ -1) != -1) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = so.field_j;
                    stackIn_19_0 = stackOut_18_0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    go.field_d.field_v = ko.field_h.field_Ab;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    go.field_d.field_rb = go.field_d.field_rb + "<br>" + var10_ref;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    dk.field_k.a(oh.field_h.field_x + -var9, var9, -40 + oh.field_h.field_I, 40, (byte) -120);
                    dk.field_k.field_rb = nn.field_m.toUpperCase();
                    stackOut_26_0 = dk.field_k;
                    stackIn_33_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (!param2) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = (kc) (Object) stackIn_27_0;
                    stackOut_27_1 = ba.field_a;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = (kc) (Object) stackIn_28_0;
                    stackIn_33_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if ((stackIn_28_1 ^ -1L) != -1L) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = (kc) (Object) stackIn_29_0;
                    stackIn_31_0 = stackOut_29_0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = (kc) (Object) stackIn_31_0;
                    stackOut_31_1 = 1;
                    stackIn_34_0 = stackOut_31_0;
                    stackIn_34_1 = stackOut_31_1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = (kc) (Object) stackIn_33_0;
                    stackOut_33_1 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    ((kc) (Object) stackIn_34_0).field_ub = stackIn_34_1 != 0;
                    var8 = dk.field_k;
                    var10 = 2;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (null == um.field_a) {
                        statePc = 100;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (qa.field_l != null) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    tk.field_q = new boolean[vf.field_l];
                    qa.field_l = new byte[vf.field_l];
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var11_int = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var11_int >= vf.field_l) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    tk.field_q[var11_int] = false;
                    var11_int++;
                    if (var19 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var19 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var10 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var10 >= 2) {
                        statePc = 94;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var11_int = 0;
                    stackOut_50_0 = 0;
                    stackIn_95_0 = stackOut_50_0;
                    stackIn_51_0 = stackOut_50_0;
                    if (var19 != 0) {
                        statePc = 95;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var12 = stackIn_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    stackOut_52_0 = var12 ^ -1;
                    stackOut_52_1 = um.field_a.length ^ -1;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (stackIn_53_0 <= stackIn_53_1) {
                        statePc = 89;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var13_array = um.field_a[var12];
                    stackOut_54_0 = 0;
                    stackIn_90_0 = stackOut_54_0;
                    stackIn_55_0 = stackOut_54_0;
                    if (var19 != 0) {
                        statePc = 90;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var14_int = stackIn_55_0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if ((var14_int ^ -1) <= (var13_array.length ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var15 = var13_array[var14_int];
                    var16 = var13_array[1 + var14_int];
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = 0;
                    stackOut_58_1 = var15 ^ -1;
                    stackIn_81_0 = stackOut_58_0;
                    stackIn_81_1 = stackOut_58_1;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    if (var19 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 != stackIn_59_1) {
                        statePc = 73;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (0 == var10) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = wi.field_f.field_Rb;
                    stackIn_68_0 = stackOut_65_0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = wi.field_f.field_dc;
                    stackIn_68_0 = stackOut_67_0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var17_int = stackIn_68_0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if ((var17_int ^ -1) != (var16 ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var19 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if ((wi.field_f.field_Wb[var15] & 255 ^ -1) != (var16 ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var14_int += 2;
                    if (var19 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var11_int = 1;
                    var14_int = -1;
                    var15 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    stackOut_80_0 = var15;
                    stackOut_80_1 = var13_array.length;
                    stackIn_81_0 = stackOut_80_0;
                    stackIn_81_1 = stackOut_80_1;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (stackIn_81_0 >= stackIn_81_1) {
                        statePc = 87;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var16 = var13_array[var15];
                    stackOut_82_0 = var16;
                    stackOut_82_1 = var14_int;
                    stackIn_53_0 = stackOut_82_0;
                    stackIn_53_1 = stackOut_82_1;
                    stackIn_83_0 = stackOut_82_0;
                    stackIn_83_1 = stackOut_82_1;
                    if (var19 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (stackIn_83_0 > stackIn_83_1) {
                        statePc = 85;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var14_int = var16;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    tk.field_q[var14_int] = true;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    stackOut_89_0 = var11_int;
                    stackIn_90_0 = stackOut_89_0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (stackIn_90_0 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    stackOut_94_0 = qf.field_d ^ -1;
                    stackIn_95_0 = stackOut_94_0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (stackIn_95_0 > -3) {
                        statePc = 100;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (!ri.field_b[12]) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var10 = 2;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (-3 < (var10 ^ -1)) {
                        statePc = 235;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (null != dh.field_Hb) {
                        statePc = 115;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackOut_104_0 = null;
                    stackIn_105_0 = stackOut_104_0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((Object) (Object) stackIn_105_0 != (Object) (Object) pe.field_Fb) {
                        statePc = 115;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackOut_108_0 = null;
                    stackIn_109_0 = stackOut_108_0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if ((Object) (Object) stackIn_109_0 != (Object) (Object) dk.field_a) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (ue.field_b == null) {
                        statePc = 260;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var11_int = 0;
                    var12 = 0;
                    var13_int = 0;
                    var14_int = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (vf.field_l <= var16) {
                        statePc = 171;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var17_int = wi.field_f.field_Wb[var16] & 255;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (var19 != 0) {
                        statePc = 172;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackOut_119_0 = dh.field_Hb;
                    stackIn_120_0 = stackOut_119_0;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if (stackIn_120_0 == null) {
                        statePc = 133;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackOut_123_0 = null;
                    stackIn_124_0 = stackOut_123_0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if ((Object) (Object) stackIn_124_0 != (Object) (Object) dh.field_Hb[var16]) {
                        statePc = 129;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (dh.field_Hb[var16][var17_int]) {
                        statePc = 132;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var11_int = 1;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (pe.field_Fb == null) {
                        statePc = 145;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (pe.field_Fb[var16] == null) {
                        statePc = 145;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var18_int = pe.field_Fb[var16][var17_int];
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if (0 == var18_int) {
                        statePc = 143;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (gm.field_c) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var11_int = 1;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if ((var18_int ^ -1) >= (var13_int ^ -1)) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var13_int = var18_int;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (null == ue.field_b) {
                        statePc = 150;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (null == ue.field_b[var16]) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var15 = var15 | ue.field_b[var16][var17_int];
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if (null == dk.field_a) {
                        statePc = 170;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    stackOut_151_0 = dk.field_a;
                    stackIn_152_0 = stackOut_151_0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (stackIn_152_0[var16] != null) {
                        statePc = 157;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var18_int = dk.field_a[var16][var17_int];
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (var18_int == 0) {
                        statePc = 166;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    stackOut_159_0 = gm.field_c;
                    stackIn_160_0 = stackOut_159_0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (!stackIn_160_0) {
                        statePc = 165;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var11_int = 1;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if ((var14_int ^ -1) > (var18_int ^ -1)) {
                        statePc = 169;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var14_int = var18_int;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var16 = 0;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    var17 = lf.field_b.field_Cb.field_G;
                    var18 = (cg) (Object) var17.b(12623);
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (var18 == null) {
                        statePc = 212;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackOut_174_0 = var18.e(183874081);
                    stackIn_213_0 = stackOut_174_0 ? 1 : 0;
                    stackIn_175_0 = stackOut_174_0;
                    if (var19 != 0) {
                        statePc = 213;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (!stackIn_175_0) {
                        statePc = 181;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (var19 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (var11_int == 0) {
                        statePc = 192;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackOut_184_0 = (cg) var18;
                    stackIn_185_0 = stackOut_184_0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (!((cg) (Object) stackIn_185_0).field_Jb) {
                        statePc = 190;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var16 = 1;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (var19 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if ((var18.field_Pb ^ -1) <= (var13_int ^ -1)) {
                        statePc = 197;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var16 = 1;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (var19 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (var14_int <= var18.field_Vb) {
                        statePc = 202;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var16 = 1;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (var19 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (((var18.field_Bb ^ -1) & var15 ^ -1) >= -1) {
                        statePc = 207;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var16 = 1;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (var19 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (var12 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var18 = (cg) (Object) var17.a(0);
                    if (var19 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    stackOut_212_0 = 2;
                    stackIn_213_0 = stackOut_212_0;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (stackIn_213_0 > qf.field_d) {
                        statePc = 221;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    stackOut_214_0 = ri.field_b;
                    stackIn_215_0 = stackOut_214_0;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (stackIn_215_0[12]) {
                        statePc = 220;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var16 = 0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (var16 != 0) {
                        statePc = 224;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 224: {
                    dk.field_k.field_ub = false;
                    if (dk.field_k.field_A) {
                        statePc = 227;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (-1 == (tn.field_Ob.field_c.field_Mb ^ -1)) {
                        statePc = 231;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    kh.field_c = tj.a(param3 ^ 119, new String[1], q.field_O);
                    if (var19 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    kh.field_c = ea.field_G;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    if (var19 == 0) {
                        statePc = 260;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    dk.field_k.field_ub = false;
                    if (dk.field_k.field_A) {
                        statePc = 240;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if ((var13_int ^ -1) <= (vf.field_l ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    stackOut_242_0 = tk.field_q[var13_int];
                    stackIn_252_0 = stackOut_242_0 ? 1 : 0;
                    stackIn_243_0 = stackOut_242_0;
                    if (var19 != 0) {
                        statePc = 252;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (stackIn_243_0) {
                        statePc = 247;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var14 = "<col=A00000>" + ob.field_bb[var13_int] + "</col>";
                    if (null == var11) {
                        statePc = 249;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var12 = 1;
                    var11 = var11 + ", " + var14;
                    if (var19 == 0) {
                        statePc = 250;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var11 = var14;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    stackOut_251_0 = -1;
                    stackIn_252_0 = stackOut_251_0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if (stackIn_252_0 != (var10 ^ -1)) {
                        statePc = 256;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var13 = hd.field_c;
                    if (var12 != 0) {
                        statePc = 255;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var14 = tj.a(-42, new String[1], fo.field_b);
                    if (var19 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var14 = rf.field_g + var11;
                    statePc = 259;
                    continue stateLoop;
                }
                case 256: {
                    var13 = on.field_i;
                    if (var12 != 0) {
                        statePc = 258;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var14 = tj.a(-11, new String[1], hb.field_Hb);
                    if (var19 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var14 = oj.field_d + var11;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    kh.field_c = "<col=A00000>" + var13 + "<br>" + var14;
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    if (var19 == 0) {
                        statePc = 262;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var9_ref = wi.field_f.field_ic;
                    nl.field_Db.field_rb = tj.a(param3 ^ 118, new String[1], ul.field_j).toUpperCase();
                    jf.field_d.a(oh.field_h.field_x, 0, oh.field_h.field_I + -40, 40, (byte) -120);
                    jf.field_d.field_rb = tj.a(param3 + 112, new String[1], uf.field_b);
                    var8 = jf.field_d;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if (-1L != (ba.field_a ^ -1L)) {
                        statePc = 265;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var9 = (int)(ba.field_a - qj.b(param3 ^ -26570));
                    var9 = (var9 - -999) / 1000;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if (var9 < 1) {
                        statePc = 269;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var9 = 1;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    var8.field_rb = tj.a(113, new String[1], ef.field_v);
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    aj.field_d.field_rb = tj.a(116, new String[2], ug.field_h);
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    stackOut_272_0 = hl.field_m;
                    stackIn_283_0 = stackOut_272_0;
                    stackIn_273_0 = stackOut_272_0;
                    if (!param4) {
                        statePc = 283;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    stackOut_273_0 = (kc) (Object) stackIn_273_0;
                    stackOut_273_1 = param1;
                    stackIn_274_0 = stackOut_273_0;
                    stackIn_274_1 = stackOut_273_1;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    stackOut_274_0 = (kc) (Object) stackIn_274_0;
                    stackIn_283_0 = stackOut_274_0;
                    stackIn_275_0 = stackOut_274_0;
                    if (stackIn_274_1) {
                        statePc = 283;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    stackOut_275_0 = (kc) (Object) stackIn_275_0;
                    stackIn_277_0 = stackOut_275_0;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    stackOut_277_0 = (kc) (Object) stackIn_277_0;
                    stackOut_277_1 = so.field_j;
                    stackIn_278_0 = stackOut_277_0;
                    stackIn_278_1 = stackOut_277_1;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    stackOut_278_0 = (kc) (Object) stackIn_278_0;
                    stackIn_283_0 = stackOut_278_0;
                    stackIn_279_0 = stackOut_278_0;
                    if (stackIn_278_1) {
                        statePc = 283;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    stackOut_279_0 = (kc) (Object) stackIn_279_0;
                    stackIn_281_0 = stackOut_279_0;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    stackOut_281_0 = (kc) (Object) stackIn_281_0;
                    stackOut_281_1 = 1;
                    stackIn_284_0 = stackOut_281_0;
                    stackIn_284_1 = stackOut_281_1;
                    statePc = 284;
                    continue stateLoop;
                }
                case 283: {
                    stackOut_283_0 = (kc) (Object) stackIn_283_0;
                    stackOut_283_1 = 0;
                    stackIn_284_0 = stackOut_283_0;
                    stackIn_284_1 = stackOut_283_1;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    ((kc) (Object) stackIn_284_0).b(stackIn_284_1 != 0, (byte) 60);
                    stackOut_284_0 = oh.field_h;
                    stackIn_295_0 = stackOut_284_0;
                    stackIn_285_0 = stackOut_284_0;
                    if (!param4) {
                        statePc = 295;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    stackOut_285_0 = (kc) (Object) stackIn_285_0;
                    stackOut_285_1 = param1;
                    stackIn_286_0 = stackOut_285_0;
                    stackIn_286_1 = stackOut_285_1;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    stackOut_286_0 = (kc) (Object) stackIn_286_0;
                    stackIn_295_0 = stackOut_286_0;
                    stackIn_287_0 = stackOut_286_0;
                    if (stackIn_286_1) {
                        statePc = 295;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    stackOut_287_0 = (kc) (Object) stackIn_287_0;
                    stackIn_289_0 = stackOut_287_0;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    stackOut_289_0 = (kc) (Object) stackIn_289_0;
                    stackOut_289_1 = so.field_j;
                    stackIn_290_0 = stackOut_289_0;
                    stackIn_290_1 = stackOut_289_1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    stackOut_290_0 = (kc) (Object) stackIn_290_0;
                    stackIn_295_0 = stackOut_290_0;
                    stackIn_291_0 = stackOut_290_0;
                    if (stackIn_290_1) {
                        statePc = 295;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = (kc) (Object) stackIn_291_0;
                    stackIn_293_0 = stackOut_291_0;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    stackOut_293_0 = (kc) (Object) stackIn_293_0;
                    stackOut_293_1 = 1;
                    stackIn_296_0 = stackOut_293_0;
                    stackIn_296_1 = stackOut_293_1;
                    statePc = 296;
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = (kc) (Object) stackIn_295_0;
                    stackOut_295_1 = 0;
                    stackIn_296_0 = stackOut_295_0;
                    stackIn_296_1 = stackOut_295_1;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    ((kc) (Object) stackIn_296_0).b(stackIn_296_1 != 0, (byte) 69);
                    stackOut_296_0 = nl.field_Fb;
                    stackIn_307_0 = stackOut_296_0;
                    stackIn_297_0 = stackOut_296_0;
                    if (!param4) {
                        statePc = 307;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    stackOut_297_0 = (kc) (Object) stackIn_297_0;
                    stackOut_297_1 = param1;
                    stackIn_298_0 = stackOut_297_0;
                    stackIn_298_1 = stackOut_297_1;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    stackOut_298_0 = (kc) (Object) stackIn_298_0;
                    stackIn_307_0 = stackOut_298_0;
                    stackIn_299_0 = stackOut_298_0;
                    if (stackIn_298_1) {
                        statePc = 307;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = (kc) (Object) stackIn_299_0;
                    stackIn_301_0 = stackOut_299_0;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    stackOut_301_0 = (kc) (Object) stackIn_301_0;
                    stackOut_301_1 = so.field_j;
                    stackIn_302_0 = stackOut_301_0;
                    stackIn_302_1 = stackOut_301_1;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    stackOut_302_0 = (kc) (Object) stackIn_302_0;
                    stackIn_307_0 = stackOut_302_0;
                    stackIn_303_0 = stackOut_302_0;
                    if (!stackIn_302_1) {
                        statePc = 307;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    stackOut_303_0 = (kc) (Object) stackIn_303_0;
                    stackIn_305_0 = stackOut_303_0;
                    statePc = 305;
                    continue stateLoop;
                }
                case 305: {
                    stackOut_305_0 = (kc) (Object) stackIn_305_0;
                    stackOut_305_1 = 1;
                    stackIn_308_0 = stackOut_305_0;
                    stackIn_308_1 = stackOut_305_1;
                    statePc = 308;
                    continue stateLoop;
                }
                case 307: {
                    stackOut_307_0 = (kc) (Object) stackIn_307_0;
                    stackOut_307_1 = 0;
                    stackIn_308_0 = stackOut_307_0;
                    stackIn_308_1 = stackOut_307_1;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    ((kc) (Object) stackIn_308_0).b(stackIn_308_1 != 0, (byte) 115);
                    tn.field_Ob.field_c.h((byte) 118);
                    if (param3 == 2) {
                        statePc = 310;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    return;
                }
                case 310: {
                    if (wi.field_f != null) {
                        statePc = 313;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if ((mo.field_o.field_U ^ -1) == -1) {
                        statePc = 317;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    qc.a(false, wi.field_f.h((byte) 94), param0);
                    statePc = 317;
                    continue stateLoop;
                }
                case 317: {
                    if (0 != go.field_d.field_U) {
                        statePc = 320;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 320: {
                    so.field_j = true;
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    if (dk.field_k.field_U != 0) {
                        statePc = 324;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 324: {
                    bj.field_ub = true;
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    if (0 == gj.field_d.field_U) {
                        statePc = 329;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    so.field_j = false;
                    statePc = 329;
                    continue stateLoop;
                }
                case 329: {
                    lm.a(false, param0, wi.field_f, 0);
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
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
        field_c = "<%0> has declined the invitation.";
    }
}
