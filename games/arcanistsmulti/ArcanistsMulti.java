/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ArcanistsMulti extends ud {
    static String field_H;
    static String field_F;
    public static boolean field_G;

    final static boolean i(byte param0) {
        RuntimeException var1 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 < -45) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_H = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (lc.a((byte) 112)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = ah.field_c;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 > 0) {
                            statePc = 11;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 1;
                        stackIn_12_0 = stackOut_9_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
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
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) var1, "ArcanistsMulti.PA(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = 115 / ((param0 - -83) / 41);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        sb.a(8000);
                        if (null == ka.field_m) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        u.b(6);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
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
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        hg.a(false);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) runtimeException, "ArcanistsMulti.G(" + param0 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null == va.field_c) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        rg.a(va.field_c, (byte) 22);
                        va.field_c = null;
                        bk.a(2);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        hb.field_Fb = sd.a(6, (byte) 62);
                        ue.field_d = sd.a(1, (byte) 23);
                        so.field_k = sd.a(7, (byte) 11);
                        vg.field_l = sd.a(2, (byte) 55);
                        mg.field_E = sd.a(3, (byte) 36);
                        if (param0) {
                            statePc = 8;
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
                        this.m(-126);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
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
                        ki.field_s = sd.a(4, (byte) 123);
                        tc.field_x = sd.a(5, (byte) 121);
                        ck.field_b = sd.a(10, (byte) 6);
                        wh.field_l = sd.a(12, (byte) 49);
                        ua.field_K = sd.a(13, (byte) 27);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) var2, "ArcanistsMulti.LA(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2 = param0.getParameter("username");
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (null == var2) {
                            statePc = 8;
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
                        stackOut_2_0 = (String) var2;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (be.a((CharSequence) (Object) stackIn_3_0, false) == 0L) {
                            statePc = 8;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        if (param1 == -1) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_F = null;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) runtimeException;
                        stackOut_13_1 = new StringBuilder().append("ArcanistsMulti.VA(");
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param0 == null) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw aa.a((Throwable) (Object) stackIn_17_0, (String) (Object) (stackIn_17_2 + 44 + param1 + 41));
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f(byte param0) {
        RuntimeException var2 = null;
        cm var2_ref = null;
        int var2_int = 0;
        le var2_ref2 = null;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        int[][] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        boolean[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        le var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        uk stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_101_0 = 0;
        boolean stackIn_109_0 = false;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        boolean stackIn_139_0 = false;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        boolean stackIn_150_0 = false;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_156_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_196_0 = 0;
        int[] stackIn_199_0 = null;
        int stackIn_199_1 = 0;
        int stackIn_199_2 = 0;
        int stackIn_199_3 = 0;
        int[] stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        int stackIn_204_2 = 0;
        int stackIn_204_3 = 0;
        int[] stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        int[] stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        int[] stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        int stackIn_208_2 = 0;
        boolean[] stackIn_210_0 = null;
        int stackIn_210_1 = 0;
        boolean[] stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        boolean[] stackIn_213_0 = null;
        int stackIn_213_1 = 0;
        int stackIn_213_2 = 0;
        int stackIn_218_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_254_0 = 0;
        boolean stackIn_260_0 = false;
        le stackIn_267_0 = null;
        int stackIn_287_0 = 0;
        int stackIn_287_1 = 0;
        int stackIn_300_0 = 0;
        boolean stackIn_334_0 = false;
        Object stackIn_347_0 = null;
        Throwable caughtException = null;
        uk stackOut_2_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_60_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_100_0 = 0;
        boolean stackOut_108_0 = false;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        boolean stackOut_138_0 = false;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        boolean stackOut_149_0 = false;
        int stackOut_153_0 = 0;
        int stackOut_153_1 = 0;
        int stackOut_155_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_195_0 = 0;
        int[] stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        int stackOut_198_2 = 0;
        int stackOut_198_3 = 0;
        int[] stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        int stackOut_203_2 = 0;
        int stackOut_203_3 = 0;
        int[] stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        int[] stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        int[] stackOut_207_0 = null;
        int stackOut_207_1 = 0;
        int stackOut_207_2 = 0;
        boolean[] stackOut_209_0 = null;
        int stackOut_209_1 = 0;
        boolean[] stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        int stackOut_210_2 = 0;
        boolean[] stackOut_212_0 = null;
        int stackOut_212_1 = 0;
        int stackOut_212_2 = 0;
        int stackOut_217_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_251_0 = 0;
        int stackOut_253_0 = 0;
        boolean stackOut_259_0 = false;
        le stackOut_266_0 = null;
        int stackOut_286_0 = 0;
        int stackOut_286_1 = 0;
        int stackOut_299_0 = 0;
        boolean stackOut_333_0 = false;
        Object stackOut_346_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    int discarded$2 = be.a(1497225488);
                    hk.field_o = ao.a(true);
                    mo.e(200);
                    if (null == ka.field_m) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = ka.field_m;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (!((uk) (Object) stackIn_3_0).field_e) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    u.b(6);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 1;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_12_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (null == ka.field_m) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = this;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 1;
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_13_1 = stackOut_10_1;
                    stackIn_13_2 = stackOut_10_2;
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackOut_12_0 = this;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    ((ArcanistsMulti) this).a(stackIn_13_1 != 0, stackIn_13_2 != 0);
                    an.field_j = ce.field_m.field_m;
                    an.field_f = ce.field_m.field_e;
                    bi.field_I = (an.field_f + -640) / 2;
                    uc.field_a = (-480 + an.field_j) / 2;
                    if (ja.field_y) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.e(true);
                    ja.field_y = false;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    jb.field_v = jb.field_v + 1;
                    if (!oc.a(-15576)) {
                        statePc = 28;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ((ArcanistsMulti) this).d(-107);
                    if (!oc.a(-15576)) {
                        statePc = 28;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (ue.a(123)) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    boolean discarded$3 = this.a(123, false);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return;
                }
                case 28: {
                    if (!ue.field_e) {
                        statePc = 89;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (!hn.a((byte) -52)) {
                        statePc = 86;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (rc.b(-1)) {
                        statePc = 57;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (!um.a((byte) -5)) {
                        statePc = 54;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if ((ii.field_c ^ -1) != (ii.field_a ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var2_int = we.b(-3);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (1 != var2_int) {
                        statePc = 50;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (si.field_g != 0) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    pi.field_c = true;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    ul.a(ud.field_o, (byte) -98, 0);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    this.a((byte) -89, true);
                    if (var27 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.a((byte) -89, false);
                    if (var27 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.a((byte) -89, false);
                    if (var27 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (ka.field_m == null) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackOut_60_0 = 1;
                    stackIn_63_0 = stackOut_60_0;
                    statePc = 63;
                    continue stateLoop;
                }
                case 62: {
                    stackOut_62_0 = 0;
                    stackIn_63_0 = stackOut_62_0;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var2_int = ka.a(stackIn_63_0 != 0, (byte) 22, (ud) this);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (2364824 == var2_int) {
                        statePc = 82;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (1 == var2_int) {
                        statePc = 74;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackOut_68_0 = 2;
                    stackIn_69_0 = stackOut_68_0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (stackIn_69_0 == var2_int) {
                        statePc = 74;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (ka.field_m != null) {
                        statePc = 77;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 77: {
                    u.b(6);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (2 == var2_int) {
                        statePc = 81;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 81: {
                    im.a((byte) 75, cd.e(123));
                    if (var27 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    ao.a(5623);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    this.a((byte) -89, true);
                    if (var27 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    rn.m(0);
                    if (var27 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    ia.a(-14296, wn.field_y);
                    if (!this.a(-109, true)) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    ue.field_e = true;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (!lc.a((byte) 112)) {
                        statePc = 98;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var2_ref = (cm) (Object) wh.field_h.c(true);
                    if (null != var2_ref) {
                        statePc = 104;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (var27 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = var27;
                    stackIn_101_0 = stackOut_100_0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (stackIn_101_0 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    ld.a(var2_ref, 118, 4);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackOut_108_0 = am.a((byte) 26, di.field_n);
                    stackIn_109_0 = stackOut_108_0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (!stackIn_109_0) {
                        statePc = 286;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackOut_110_0 = on.field_g ^ -1;
                    stackOut_110_1 = -78;
                    stackIn_287_0 = stackOut_110_0;
                    stackIn_287_1 = stackOut_110_1;
                    stackIn_111_0 = stackOut_110_0;
                    stackIn_111_1 = stackOut_110_1;
                    if (var27 != 0) {
                        statePc = 287;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (stackIn_111_0 != stackIn_111_1) {
                        statePc = 117;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    dg.field_s = true;
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if (79 == on.field_g) {
                        statePc = 120;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 120: {
                    bc.field_b = df.field_z.e((byte) 100);
                    mf.field_a = df.field_z.e((byte) 50);
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (-10 == (on.field_g ^ -1)) {
                        statePc = 124;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 124: {
                    lf.a((byte) 80);
                    kh.field_b = false;
                    mn.field_r = 9;
                    jm.field_b = df.field_z.l(-1);
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if ((on.field_g ^ -1) == -15) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    lf.a((byte) 80);
                    jn.a(150, dn.f((byte) -112), -13173, ql.a(1), li.field_E, wk.f((byte) -125), 1024, wh.a(1000, 678231216), wh.a(6, 678231216), jk.field_a.length);
                    ra.a(v.b((byte) 115), 64, pa.c((byte) -122));
                    mn.field_r = -2;
                    wa.field_Ob = true;
                    kh.field_b = false;
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (15 != on.field_g) {
                        statePc = 137;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (wa.field_Ob) {
                        statePc = 135;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 135: {
                    lf.a((byte) 80);
                    ho.a(0);
                    cn.c(true);
                    hi.field_a = false;
                    wa.field_Ob = false;
                    mj.field_w = false;
                    fi.field_h = true;
                    wa.field_Kb = true;
                    io.field_A = false;
                    mn.field_r = 0;
                    bc.a((byte) -50);
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    kh.field_b = false;
                    oc.field_g = false;
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (-11 != (on.field_g ^ -1)) {
                        statePc = 145;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackOut_138_0 = wa.field_Ob;
                    stackIn_139_0 = stackOut_138_0;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if (!stackIn_139_0) {
                        statePc = 145;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    u.a((byte) -108);
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (73 != on.field_g) {
                        statePc = 165;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var2_int = df.field_z.e((byte) -122);
                    var3_ref_int__ = new int[var2_int];
                    var4 = 0;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    stackOut_147_0 = var2_int;
                    stackOut_147_1 = var4;
                    stackIn_148_0 = stackOut_147_0;
                    stackIn_148_1 = stackOut_147_1;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (stackIn_148_0 <= stackIn_148_1) {
                        statePc = 164;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var3_ref_int__[var4] = df.field_z.d(-10674);
                    var3_ref_int__[var4] = dg.a(var3_ref_int__[var4], ad.field_f[var4] ^ -1);
                    stackOut_149_0 = pe.field_Jb;
                    stackIn_109_0 = stackOut_149_0;
                    stackIn_150_0 = stackOut_149_0;
                    if (var27 != 0) {
                        statePc = 109;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (!stackIn_150_0) {
                        statePc = 163;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var5 = 0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (var5 >= 32) {
                        statePc = 163;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var6 = 1 << var5;
                    stackOut_153_0 = -96;
                    stackOut_153_1 = var5 - -(32 * var4) ^ -1;
                    stackIn_148_0 = stackOut_153_0;
                    stackIn_148_1 = stackOut_153_1;
                    stackIn_154_0 = stackOut_153_0;
                    stackIn_154_1 = stackOut_153_1;
                    if (var27 != 0) {
                        statePc = 148;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (stackIn_154_0 >= stackIn_154_1) {
                        statePc = 162;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackOut_155_0 = var6;
                    stackIn_156_0 = stackOut_155_0;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if ((stackIn_156_0 & var3_ref_int__[var4] ^ -1) != -1) {
                        statePc = 161;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 161: {
                    b.field_a.b((pg) (Object) new qa(32 * var4 + var5), -1);
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    var5++;
                    if (var27 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    ad.field_f[var4] = fj.b(ad.field_f[var4], var3_ref_int__[var4]);
                    var4++;
                    if (var27 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if ((on.field_g ^ -1) == -75) {
                        statePc = 168;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (td.e(true)) {
                        statePc = 172;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    jf.field_j = df.field_z.n(-98);
                    cb.field_e = df.field_z.c(-943038560);
                    ad.field_d = df.field_z.e((byte) -100);
                    if (var27 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var2_int = df.field_z.n(-98);
                    var3_long = df.field_z.c(-943038560);
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    ad.field_d = df.field_z.e((byte) 62);
                    if ((var2_int ^ -1) >= (jf.field_j ^ -1)) {
                        statePc = 177;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    jf.field_j = var2_int;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    cb.field_e = cb.field_e | var3_long;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    ua.field_P = md.a(false, cb.field_e);
                    nm.field_h = -1;
                    la.field_a = true;
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (on.field_g == 57) {
                        statePc = 183;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (on.field_g != 58) {
                        statePc = 255;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    lf.a((byte) 80);
                    var2_int = df.field_z.e((byte) -124);
                    var3 = df.field_z.e((byte) -101);
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if (0 == df.field_z.e((byte) 106)) {
                        statePc = 187;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    stackOut_185_0 = 1;
                    stackIn_188_0 = stackOut_185_0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 187: {
                    stackOut_187_0 = 0;
                    stackIn_188_0 = stackOut_187_0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    var4 = stackIn_188_0;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (-1 == (df.field_z.e((byte) 111) ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    stackOut_190_0 = 1;
                    stackIn_193_0 = stackOut_190_0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 192: {
                    stackOut_192_0 = 0;
                    stackIn_193_0 = stackOut_192_0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    var5 = stackIn_193_0;
                    var6 = df.field_z.n(-98);
                    var7 = new String[df.field_z.e((byte) 115)];
                    var8 = -2;
                    var8 = df.field_z.o(6);
                    var9 = new int[var7.length][18];
                    var10 = new int[var7.length][16];
                    var11 = new int[var7.length];
                    var12 = new boolean[var7.length];
                    var13 = 0;
                    var14 = 0;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (var7.length <= var14) {
                        statePc = 225;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var7[var14] = df.field_z.e(-32461);
                    stackOut_195_0 = 0;
                    stackIn_226_0 = stackOut_195_0;
                    stackIn_196_0 = stackOut_195_0;
                    if (var27 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var15 = stackIn_196_0;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (var15 >= 18) {
                        statePc = 201;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    stackOut_198_0 = var9[var14];
                    stackOut_198_1 = var15;
                    stackOut_198_2 = df.field_z.e((byte) -88);
                    stackOut_198_3 = 255;
                    stackIn_199_0 = stackOut_198_0;
                    stackIn_199_1 = stackOut_198_1;
                    stackIn_199_2 = stackOut_198_2;
                    stackIn_199_3 = stackOut_198_3;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    stackIn_199_0[stackIn_199_1] = dg.a(stackIn_199_2, stackIn_199_3);
                    var15++;
                    if (var27 != 0) {
                        statePc = 202;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (var27 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var15 = 0;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    if (var15 >= 16) {
                        statePc = 209;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var16 = df.field_z.e((byte) 109) & 255;
                    stackOut_203_0 = var10[var14];
                    stackOut_203_1 = var15;
                    stackOut_203_2 = -256;
                    stackOut_203_3 = var16 ^ -1;
                    stackIn_199_0 = stackOut_203_0;
                    stackIn_199_1 = stackOut_203_1;
                    stackIn_199_2 = stackOut_203_2;
                    stackIn_199_3 = stackOut_203_3;
                    stackIn_204_0 = stackOut_203_0;
                    stackIn_204_1 = stackOut_203_1;
                    stackIn_204_2 = stackOut_203_2;
                    stackIn_204_3 = stackOut_203_3;
                    if (var27 != 0) {
                        statePc = 199;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    stackOut_204_0 = (int[]) (Object) stackIn_204_0;
                    stackOut_204_1 = stackIn_204_1;
                    stackIn_207_0 = stackOut_204_0;
                    stackIn_207_1 = stackOut_204_1;
                    stackIn_205_0 = stackOut_204_0;
                    stackIn_205_1 = stackOut_204_1;
                    if (stackIn_204_2 == stackIn_204_3) {
                        statePc = 207;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    stackOut_205_0 = (int[]) (Object) stackIn_205_0;
                    stackOut_205_1 = stackIn_205_1;
                    stackOut_205_2 = var16;
                    stackIn_208_0 = stackOut_205_0;
                    stackIn_208_1 = stackOut_205_1;
                    stackIn_208_2 = stackOut_205_2;
                    statePc = 208;
                    continue stateLoop;
                }
                case 207: {
                    stackOut_207_0 = (int[]) (Object) stackIn_207_0;
                    stackOut_207_1 = stackIn_207_1;
                    stackOut_207_2 = -1;
                    stackIn_208_0 = stackOut_207_0;
                    stackIn_208_1 = stackOut_207_1;
                    stackIn_208_2 = stackOut_207_2;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    stackIn_208_0[stackIn_208_1] = stackIn_208_2;
                    var15++;
                    if (var27 == 0) {
                        statePc = 202;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var11[var14] = df.field_z.e((byte) 76);
                    stackOut_209_0 = (boolean[]) var12;
                    stackOut_209_1 = var14;
                    stackIn_212_0 = stackOut_209_0;
                    stackIn_212_1 = stackOut_209_1;
                    stackIn_210_0 = stackOut_209_0;
                    stackIn_210_1 = stackOut_209_1;
                    if ((df.field_z.e((byte) 123) ^ -1) != -2) {
                        statePc = 212;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    stackOut_210_0 = (boolean[]) (Object) stackIn_210_0;
                    stackOut_210_1 = stackIn_210_1;
                    stackOut_210_2 = 1;
                    stackIn_213_0 = stackOut_210_0;
                    stackIn_213_1 = stackOut_210_1;
                    stackIn_213_2 = stackOut_210_2;
                    statePc = 213;
                    continue stateLoop;
                }
                case 212: {
                    stackOut_212_0 = (boolean[]) (Object) stackIn_212_0;
                    stackOut_212_1 = stackIn_212_1;
                    stackOut_212_2 = 0;
                    stackIn_213_0 = stackOut_212_0;
                    stackIn_213_1 = stackOut_212_1;
                    stackIn_213_2 = stackOut_212_2;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    stackIn_213_0[stackIn_213_1] = stackIn_213_2 != 0;
                    if (var12[var14]) {
                        statePc = 216;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (0 != var10[var14][0]) {
                        statePc = 224;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    stackOut_217_0 = -12;
                    stackIn_218_0 = stackOut_217_0;
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    if (stackIn_218_0 == (var10[var14][11] ^ -1)) {
                        statePc = 223;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var9[var14][12] = 28;
                    var9[var14][13] = 0;
                    var9[var14][14] = 29;
                    var9[var14][15] = 33;
                    var9[var14][16] = 47;
                    var9[var14][17] = 50;
                    var9[var14][0] = 204;
                    var9[var14][1] = 170;
                    var9[var14][2] = 238;
                    var9[var14][3] = 255;
                    var9[var14][4] = 192;
                    var9[var14][5] = 255;
                    var9[var14][6] = 32;
                    var9[var14][7] = 32;
                    var9[var14][8] = 32;
                    var9[var14][9] = 128;
                    var9[var14][10] = 64;
                    var9[var14][11] = 128;
                    var13 = 1;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    var14++;
                    if (var27 == 0) {
                        statePc = 194;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var14 = df.field_z.d(-10674);
                    stackOut_225_0 = df.field_z.e((byte) -118);
                    stackIn_226_0 = stackOut_225_0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    var15 = stackIn_226_0;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if ((var15 & 128) == 0) {
                        statePc = 230;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    stackOut_228_0 = 1;
                    stackIn_231_0 = stackOut_228_0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 230: {
                    stackOut_230_0 = 0;
                    stackIn_231_0 = stackOut_230_0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    var16 = stackIn_231_0;
                    r.field_b = null;
                    var15 = var15 & 127;
                    jb.field_z = null;
                    System.gc();
                    var17 = new le(true, var2_int, var3, var4 != 0, var7, var8, var9, var10, var11, var14, var15, var5 != 0, var6, var12);
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    mi.a(jh.field_c[var17.field_V.a(-31497) + 1], 3);
                    var17.m(413355681);
                    if (var13 != 0) {
                        statePc = 235;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var18 = ij.field_Tb.field_A.length;
                    var19 = 0;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    if (var19 >= var18) {
                        statePc = 242;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var20 = ij.field_Tb.field_A[var19];
                    var21 = (var20 & 16711680) >> -1316744816;
                    var22 = var20 >> -1482456280 & 255;
                    var23 = 255 & var20;
                    var24 = (var21 + var22) / 2;
                    var25 = (var23 + var21) / 2;
                    var26 = (var22 - -var23) / 2;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    ij.field_Tb.field_A[var19] = (var25 << -848308600) + ((var24 << 1661973680) + var26);
                    var19++;
                    if (var27 != 0) {
                        statePc = 249;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (var27 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (on.field_g == 57) {
                        statePc = 246;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    r.field_b = var17;
                    mj.field_w = true;
                    if (var27 == 0) {
                        statePc = 250;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    jb.field_z = var17;
                    hi.field_a = true;
                    jg.a(-3);
                    jk.a((byte) 121);
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    sc.i((byte) -53);
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (var16 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    stackOut_251_0 = -1;
                    stackIn_254_0 = stackOut_251_0;
                    statePc = 254;
                    continue stateLoop;
                }
                case 253: {
                    stackOut_253_0 = 5;
                    stackIn_254_0 = stackOut_253_0;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    mn.field_r = stackIn_254_0;
                    io.field_A = true;
                    oc.field_g = false;
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (on.field_g == 59) {
                        statePc = 258;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (hi.field_a) {
                        statePc = 263;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    stackOut_259_0 = mj.field_w;
                    stackIn_260_0 = stackOut_259_0;
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    if (!stackIn_260_0) {
                        statePc = 274;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    lf.a((byte) 80);
                    if (!hi.field_a) {
                        statePc = 273;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    stackOut_266_0 = jb.field_z;
                    stackIn_267_0 = stackOut_266_0;
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    if (stackIn_267_0 == null) {
                        statePc = 273;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    jb.field_z.a(-112, false);
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    fi.field_h = true;
                    hi.field_a = false;
                    mj.field_w = false;
                    io.field_A = false;
                    mn.field_r = -2;
                    ao.field_d = true;
                    vh.field_t = 0;
                    bc.a((byte) -50);
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    oc.field_g = false;
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var2_ref = null;
                    if (!hi.field_a) {
                        statePc = 277;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var2_ref2 = jb.field_z;
                    statePc = 281;
                    continue stateLoop;
                }
                case 277: {
                    if (mj.field_w) {
                        statePc = 280;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var2_ref2 = r.field_b;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    if (null == var2_ref2) {
                        statePc = 285;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (var2_ref2.e((byte) -78)) {
                        statePc = 108;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    ((ArcanistsMulti) this).g(-24);
                    if (var27 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    stackOut_286_0 = -27;
                    stackOut_286_1 = (0 - param0) / 36;
                    stackIn_287_0 = stackOut_286_0;
                    stackIn_287_1 = stackOut_286_1;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    var2_int = stackIn_287_0 % stackIn_287_1;
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    we.a(0, (byte) 121);
                    if (-2 != si.field_g) {
                        statePc = 292;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    ao.field_d = true;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    if (ao.field_d) {
                        statePc = 295;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 295: {
                    vh.field_t = 0;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    if (!ka.c((byte) -44)) {
                        statePc = 355;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    var3 = ((ArcanistsMulti) this).e(118);
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    if (-1 == (var3 ^ -1)) {
                        statePc = 305;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = -2;
                    stackIn_300_0 = stackOut_299_0;
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    if (stackIn_300_0 == (var3 ^ -1)) {
                        statePc = 305;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 305: {
                    ub.a((byte) 127, 4);
                    jn.a((byte) -64, 6);
                    of.b(7, 16);
                    ta.field_b = false;
                    if (nm.field_h != -1) {
                        statePc = 308;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 308: {
                    bg.a(2, nm.field_h);
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    pi.a(true);
                    if ((var3 ^ -1) != -2) {
                        statePc = 313;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    kh.field_b = true;
                    oc.field_g = true;
                    if (var27 == 0) {
                        statePc = 327;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (wa.field_Ob) {
                        statePc = 318;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 318: {
                    io.field_A = false;
                    fi.field_h = true;
                    wa.field_Kb = true;
                    if (!hi.field_a) {
                        statePc = 322;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    jm.field_b = we.field_e;
                    gj.a(false, true, 9, mn.field_r);
                    if (var27 == 0) {
                        statePc = 325;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    gj.a(false, true, 0, mn.field_r);
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    lf.a((byte) 80);
                    tl.field_f[si.field_g].a(false, 0, (byte) -123);
                    mj.field_w = false;
                    wa.field_Ob = false;
                    hi.field_a = false;
                    bc.a((byte) -50);
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    oc.field_g = false;
                    kh.field_b = false;
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    var4 = 0;
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if (var3 == 2) {
                        statePc = 331;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var4 = 1;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    if (wa.field_Ob) {
                        statePc = 340;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    stackOut_333_0 = kh.field_b;
                    stackIn_334_0 = stackOut_333_0;
                    statePc = 334;
                    continue stateLoop;
                }
                case 334: {
                    if (stackIn_334_0) {
                        statePc = 340;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    if (!oc.field_g) {
                        statePc = 341;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    var4 = 1;
                    statePc = 341;
                    continue stateLoop;
                }
                case 341: {
                    if (!ka.c((byte) -44)) {
                        statePc = 344;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 344: {
                    var4 = 0;
                    statePc = 345;
                    continue stateLoop;
                }
                case 345: {
                    if (var4 == 0) {
                        statePc = 355;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    stackOut_346_0 = null;
                    stackIn_347_0 = stackOut_346_0;
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    if ((Object) (Object) stackIn_347_0 == (Object) (Object) tj.field_t) {
                        statePc = 355;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    ah.a(ve.field_t, tj.field_t.field_o, 8, 8, wd.field_h, (dj) (Object) tj.field_t, an.field_f / 2, an.field_j / 2, 2, tj.field_t.field_m + tj.field_t.field_o, -97);
                    statePc = 355;
                    continue stateLoop;
                }
                case 355: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, wf param2, int[] param3, boolean param4, wf[] param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!param4) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_H = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param5[param1] = param2;
                        param3[param1] = param0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var7;
                        stackOut_7_1 = new StringBuilder().append("ArcanistsMulti.NA(").append(param0).append(44).append(param1).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param2 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param3 == null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                        stackOut_12_2 = "{...}";
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_15_2 = stackOut_12_2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                    stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                    stackOut_14_2 = "null";
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param4).append(44);
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param5 == null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                    stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                    stackOut_18_2 = "null";
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw aa.a((Throwable) (Object) stackIn_19_0, (String) (Object) (stackIn_19_2 + 41));
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, boolean param1) {
        int var3_int = 0;
        int var4_int = 0;
        ll[] var4 = null;
        qb[][] var5 = null;
        qb[][] var6 = null;
        qb var7 = null;
        ll[] var8 = null;
        int var9 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_125_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_124_0 = 0;
        L0: {
          var9 = field_G ? 1 : 0;
          if (ec.field_c == null) {
            L1: {
              mb.field_bb = (int)(Math.random() * 8.0);
              var3_int = mb.field_bb;
              if (-1 == (var3_int ^ -1)) {
                ec.field_c = "flame";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-2 == (var3_int ^ -1)) {
                ec.field_c = "frost";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var3_int == 2) {
                ec.field_c = "rock";
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-4 == (var3_int ^ -1)) {
                ec.field_c = "overlight";
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var3_int != 4) {
                break L5;
              } else {
                ec.field_c = "storm";
                break L5;
              }
            }
            L6: {
              if (var3_int != 5) {
                break L6;
              } else {
                ec.field_c = "underdark";
                break L6;
              }
            }
            L7: {
              if (var3_int != 6) {
                break L7;
              } else {
                ec.field_c = "nature";
                break L7;
              }
            }
            L8: {
              if (7 != var3_int) {
                break L8;
              } else {
                ec.field_c = "water";
                break L8;
              }
            }
            if ((var3_int ^ -1) == -9) {
              ec.field_c = "clockwork";
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        ti.a((byte) -90);
        if (null != vg.field_l) {
          L9: {
            if (!rc.field_a.c(-10923)) {
              break L9;
            } else {
              if (!rc.field_a.a("basic", -24417)) {
                break L9;
              } else {
                L10: {
                  if (!rc.field_a.c(-10923)) {
                    break L10;
                  } else {
                    if (!rc.field_a.a("roman20", -24417)) {
                      break L10;
                    } else {
                      L11: {
                        if (!ud.field_D.c(-10923)) {
                          break L11;
                        } else {
                          if (ud.field_D.a("roman20", -24417)) {
                            L12: {
                              if (!rc.field_a.c(-10923)) {
                                break L12;
                              } else {
                                if (!rc.field_a.a("lobby", -24417)) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (!ud.field_D.c(-10923)) {
                                      break L13;
                                    } else {
                                      if (ud.field_D.a("lobby", -24417)) {
                                        L14: {
                                          if (!vg.field_l.c(-10923)) {
                                            break L14;
                                          } else {
                                            if (!vg.field_l.a(106)) {
                                              break L14;
                                            } else {
                                              L15: {
                                                if (!mg.field_E.c(-10923)) {
                                                  break L15;
                                                } else {
                                                  if (mg.field_E.a(-15)) {
                                                    L16: {
                                                      if (!ki.field_s.c(-10923)) {
                                                        break L16;
                                                      } else {
                                                        if (!ki.field_s.a(125)) {
                                                          break L16;
                                                        } else {
                                                          L17: {
                                                            if (!tc.field_x.c(-10923)) {
                                                              break L17;
                                                            } else {
                                                              if (!tc.field_x.a(true, "arcanists_titlescreen", "")) {
                                                                break L17;
                                                              } else {
                                                                if (!tc.field_x.a(true, "arcanists_grassland", "")) {
                                                                  break L17;
                                                                } else {
                                                                  L18: {
                                                                    if (!ue.field_d.c(-10923)) {
                                                                      break L18;
                                                                    } else {
                                                                      if (!ue.field_d.a("", -24417)) {
                                                                        break L18;
                                                                      } else {
                                                                        if (ue.field_d.a(ec.field_c, -24417)) {
                                                                          L19: {
                                                                            if (!so.field_k.c(-10923)) {
                                                                              break L19;
                                                                            } else {
                                                                              if (so.field_k.a(109)) {
                                                                                L20: {
                                                                                  if (!hb.field_Fb.c(-10923)) {
                                                                                    break L20;
                                                                                  } else {
                                                                                    if (!hb.field_Fb.a(-33)) {
                                                                                      break L20;
                                                                                    } else {
                                                                                      L21: {
                                                                                        if (!ua.field_K.c(-10923)) {
                                                                                          break L21;
                                                                                        } else {
                                                                                          if (!ua.field_K.a(-121)) {
                                                                                            break L21;
                                                                                          } else {
                                                                                            wm.g(0);
                                                                                            rb.a(sn.field_N, false, 60.0f);
                                                                                            ((ArcanistsMulti) this).c((byte) -89);
                                                                                            if (param1) {
                                                                                              lo.field_w = new gi(vg.field_l, mg.field_E);
                                                                                              vg.field_l = null;
                                                                                              mg.field_E = null;
                                                                                              bk.a(2);
                                                                                              return false;
                                                                                            } else {
                                                                                              return false;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      rb.a(qe.a(mm.field_t, 74, ua.field_K, di.field_c), false, 55.0f);
                                                                                      return false;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                rb.a(qe.a(mm.field_t, 115, hb.field_Fb, di.field_c), false, 50.0f);
                                                                                return false;
                                                                              } else {
                                                                                break L19;
                                                                              }
                                                                            }
                                                                          }
                                                                          rb.a(qe.a(gd.field_nb, 113, so.field_k, sc.field_Z), false, 45.0f);
                                                                          return false;
                                                                        } else {
                                                                          rb.a(nm.a(17153, gd.field_nb, ue.field_d, sc.field_Z, ec.field_c), false, 40.0f);
                                                                          return false;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  rb.a(nm.a(17153, gd.field_nb, ue.field_d, sc.field_Z, ""), false, 35.0f);
                                                                  return false;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          rb.a(qe.a(ii.field_e, 96, tc.field_x, kh.field_e), false, 32.0f);
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    rb.a(qe.a(ii.field_e, 76, ki.field_s, kh.field_e), false, 29.0f);
                                                    return false;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              rb.a(qe.a(mj.field_v, 76, mg.field_E, fn.field_a), false, 23.0f);
                                              return false;
                                            }
                                          }
                                        }
                                        rb.a(qe.a(mj.field_v, 122, vg.field_l, fn.field_a), false, 20.0f);
                                        return false;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  rb.a(nm.a(17153, ra.field_d, ud.field_D, wh.field_a, "lobby"), false, 17.0f);
                                  return false;
                                }
                              }
                            }
                            rb.a(nm.a(17153, gd.field_nb, rc.field_a, sc.field_Z, "lobby"), false, 14.0f);
                            return false;
                          } else {
                            break L11;
                          }
                        }
                      }
                      rb.a(nm.a(17153, ra.field_d, ud.field_D, wh.field_a, "roman20"), false, 11.0f);
                      return false;
                    }
                  }
                }
                rb.a(nm.a(17153, gd.field_nb, rc.field_a, sc.field_Z, "roman20"), false, 8.0f);
                return false;
              }
            }
          }
          rb.a(nm.a(17153, gd.field_nb, rc.field_a, sc.field_Z, "basic"), false, 5.0f);
          return false;
        } else {
          L22: {
            if (tc.field_x == null) {
              break L22;
            } else {
              if (jh.field_c != null) {
                break L22;
              } else {
                rb.a(vi.field_J, false, 85.0f);
                ((ArcanistsMulti) this).c((byte) -89);
                jh.field_c = new ha[10];
                bk.a(2);
                return false;
              }
            }
          }
          L23: {
            var3_int = -84 / ((14 - param0) / 56);
            if (null != so.field_k) {
              if (hf.field_o == null) {
                rb.a(hi.field_c, false, 90.0f);
                ((ArcanistsMulti) this).c((byte) -89);
                hf.field_o = fj.a("", -22612, ue.field_d, "funorblogo");
                vn.field_b = fj.a("", -22612, ue.field_d, "newlogo");
                g.field_a = fj.a("", -22612, ue.field_d, "newlogostars");
                sm.field_d = fj.a("", -22612, ue.field_d, "newlogostars2");
                vi.field_I = fj.a("", -22612, ue.field_d, "arrowbuttonsmall");
                to.field_q = fj.a("", -22612, ue.field_d, "arrowbutton");
                km.field_e = fj.a("", -22612, ue.field_d, "border_corner");
                wk.field_l = fj.a("", -22612, ue.field_d, "border_bar_h");
                hk.field_k = fj.a("", -22612, ue.field_d, "border_bar_v");
                mc.field_a = qe.a(ue.field_d, "charactericons", "", 55);
                rb.field_o = qe.a(ue.field_d, "bonushats", "", 63);
                bk.a(2);
                return false;
              } else {
                if (e.field_M == null) {
                  rb.a(hi.field_c, false, 91.0f);
                  ((ArcanistsMulti) this).c((byte) -89);
                  wm.field_H = qe.a(ue.field_d, "menu_overlays", "", 41);
                  e.field_M = new ll[9];
                  oo.field_t = fj.a("", -22612, ue.field_d, "logo_arcanists");
                  wm.field_H[13].a();
                  vn.field_b.field_x = -(vn.field_b.field_n / 2) + 320;
                  vn.field_b.field_o = 16;
                  rk.g(491697968);
                  kf.field_b = qe.a(ue.field_d, "frame2", "", 83);
                  uj.field_f = fj.a("", -22612, ue.field_d, "gamespell");
                  fe.field_g = fj.a("", -22612, ue.field_d, "gamebars");
                  pm.field_a = fj.a("", -22612, ue.field_d, "cldgame");
                  rg.field_a = fj.a("", -22612, ue.field_d, "cldtr");
                  o.field_F = fj.a("", -22612, ue.field_d, "cldbl");
                  pe.field_Ib = fj.a("", -22612, ue.field_d, "cldtl");
                  j.field_a = fj.a("", -22612, ue.field_d, "cldbr");
                  gd.field_mb = fj.a("", -22612, ue.field_d, "cldflat");
                  fe.field_o = fj.a("", -22612, ue.field_d, "spell_book");
                  bk.a(2);
                  return false;
                } else {
                  if (null != ea.field_E) {
                    if (mb.field_ab == null) {
                      rb.a(hi.field_c, false, 93.0f);
                      ((ArcanistsMulti) this).c((byte) -89);
                      mb.field_ab = pk.a("", 0, "spellclasses", ue.field_d);
                      vd.field_b = fj.a("basic", -22612, rc.field_a, "unachieved");
                      ii.field_d = fj.a("basic", -22612, rc.field_a, "locked");
                      di.field_d = fj.a("basic", -22612, rc.field_a, "orbcoin");
                      kc.field_kb = qe.a(ue.field_d, "heads", "", 95);
                      jd.field_j = qe.a(ue.field_d, "bodies", "", 67);
                      ea.field_u = qe.a(ue.field_d, "phands", "", 58);
                      qe.field_i = qe.a(ue.field_d, "mhands", "", 57);
                      hn.field_d = qe.a(ue.field_d, "beards", "", 106);
                      tj.field_A = qe.a(ue.field_d, "hats", "", 124);
                      bo.field_a = qe.a(ue.field_d, "mouths", "", 42);
                      h.field_I = qe.a(ue.field_d, "pfeet", "", 58);
                      fn.field_b = qe.a(ue.field_d, "mfeet", "", 113);
                      bk.a(2);
                      return false;
                    } else {
                      if (null != ij.field_Pb) {
                        if (null == nm.field_i) {
                          rb.a(hi.field_c, false, 95.0f);
                          ((ArcanistsMulti) this).c((byte) -89);
                          bb.field_g = qe.a(ue.field_d, "spellicons", "", 75);
                          nm.field_i = qe.a(ue.field_d, "frame", "", 51);
                          nm.field_i[1].field_n = nm.field_i[1].field_q;
                          nm.field_i[4] = null;
                          nm.field_i[3].field_w = nm.field_i[3].field_y;
                          nm.field_i[7].field_n = nm.field_i[7].field_q;
                          nm.field_i[5].field_w = nm.field_i[5].field_y;
                          wd.field_h = qe.a(ue.field_d, "button_frame", "", 69);
                          bk.a(2);
                          return false;
                        } else {
                          if (null == ve.field_t) {
                            rb.a(hi.field_c, false, 96.0f);
                            ((ArcanistsMulti) this).c((byte) -89);
                            ve.field_t = qe.a(ue.field_d, "button_frame_r", "", 94);
                            qb[] discarded$1 = qe.a(ue.field_d, "button_frame_d", "", 44);
                            mo.field_a = qe.a(ue.field_d, "achievements_large", "", 98);
                            var4_int = 95;
                            L24: while (true) {
                              L25: {
                                L26: {
                                  if ((var4_int ^ -1) <= (mo.field_a.length ^ -1)) {
                                    break L26;
                                  } else {
                                    mo.field_a[var4_int] = null;
                                    var4_int++;
                                    if (var9 != 0) {
                                      break L25;
                                    } else {
                                      if (var9 == 0) {
                                        continue L24;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                                ih.field_e = new qb(32, 32);
                                ih.field_e.a();
                                di.field_d.d(0, 0, 32, 32);
                                ce.field_m.a(true);
                                bk.a(2);
                                break L25;
                              }
                              return false;
                            }
                          } else {
                            if (so.field_k != null) {
                              L27: {
                                L28: {
                                  rb.a(hi.field_c, false, 97.0f);
                                  ((ArcanistsMulti) this).c((byte) -89);
                                  rc.field_a.field_f = 0;
                                  ud.field_D.field_f = 0;
                                  wn.a((byte) 111, (dj) (Object) rc.a(ud.field_D, -24755, "lobby", "chatfont", rc.field_a));
                                  rc.field_a.field_f = 1;
                                  ud.field_D.field_f = 1;
                                  var4 = pk.a("", 0, "minibonushats", ue.field_d);
                                  var5 = new qb[3][];
                                  var6 = new qb[3][];
                                  var5[0] = qe.a(ue.field_d, "turntime_icons", "", 76);
                                  var5[1] = qe.a(ue.field_d, "levelstyle_iconssmall", "", 56);
                                  var5[2] = qe.a(ue.field_d, "team_iconssmall", "", 76);
                                  var6[0] = null;
                                  var6[1] = qe.a(ue.field_d, "levelstyle_icons", "", 121);
                                  var6[2] = null;
                                  var7 = var5[1][3];
                                  var5[1][3] = var5[1][2];
                                  var5[1][2] = var5[1][1];
                                  var5[1][1] = var5[1][0];
                                  var5[1][0] = var7;
                                  var7 = var6[1][3];
                                  var6[1][3] = var6[1][2];
                                  var6[1][2] = var6[1][1];
                                  var6[1][1] = var6[1][0];
                                  var6[1][0] = var7;
                                  rb.a(li.field_E, ua.field_K, var4, var5, true, jh.field_d, rm.field_l, 6, ud.field_D, (int[]) null, var6, cn.field_O, (byte) -67, jk.field_a, 3, aj.field_a, rc.field_a);
                                  fn.a(200, (byte) -106);
                                  um.field_a = qf.field_c;
                                  gm.field_c = false;
                                  dh.field_Hb = co.field_a;
                                  qn.a(-24539, rc.field_a, ud.field_D);
                                  ud.field_D = null;
                                  so.field_k = null;
                                  if (lc.a((byte) 112)) {
                                    break L28;
                                  } else {
                                    if (0 >= ah.field_c) {
                                      break L28;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var8 = pk.a("", 0, "expansion_screens", ue.field_d);
                                to.field_s = new hf((java.applet.Applet) this, be.field_i, var8, dh.field_Kb);
                                break L27;
                              }
                              bk.a(2);
                              return false;
                            } else {
                              break L23;
                            }
                          }
                        }
                      } else {
                        rb.a(hi.field_c, false, 94.0f);
                        ((ArcanistsMulti) this).c((byte) -89);
                        ij.field_Pb = qe.a(ue.field_d, "conductororb", "", 60);
                        fc.field_e = qe.a(ue.field_d, "phylactery", "", 92);
                        tf.field_j = qe.a(ue.field_d, "stonemonster", "", 64);
                        fo.field_g = qe.a(ue.field_d, "frostsprite", "", 56);
                        rc.field_k = qe.a(ue.field_d, "fungus", "", 102);
                        lf.field_c = qe.a(ue.field_d, "flamesprite", "", 69);
                        eo.field_a = qe.a(ue.field_d, "watersprite", "", 58);
                        ji.field_h = qe.a(ue.field_d, "gaurdianangel", "", 69);
                        ae.field_a = qe.a(ue.field_d, "clockwork", "", 93);
                        wg.field_J = qe.a(ue.field_d, "aura", "", 124);
                        kl.field_E = qe.a(ue.field_d, "clockworkaura", "", 75);
                        jg.field_c = pk.a("", 0, "runes", ue.field_d);
                        rm.field_o = qe.a(ue.field_d, "spellbooks", "", 93);
                        bk.a(2);
                        return false;
                      }
                    }
                  } else {
                    rb.a(hi.field_c, false, 92.0f);
                    ((ArcanistsMulti) this).c((byte) -89);
                    ea.field_E = new qb[15];
                    var4_int = 0;
                    L29: while (true) {
                      L30: {
                        L31: {
                          if ((var4_int ^ -1) <= -16) {
                            break L31;
                          } else {
                            ea.field_E[var4_int] = wm.field_H[var4_int].g();
                            var4_int++;
                            if (var9 != 0) {
                              break L30;
                            } else {
                              if (var9 == 0) {
                                continue L29;
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                        var4_int = 0;
                        break L30;
                      }
                      L32: while (true) {
                        L33: {
                          L34: {
                            if (15 <= var4_int) {
                              break L34;
                            } else {
                              lj.a(true, var4_int);
                              stackOut_115_0 = 0;
                              stackIn_125_0 = stackOut_115_0;
                              stackIn_116_0 = stackOut_115_0;
                              if (var9 != 0) {
                                break L33;
                              } else {
                                stackOut_116_0 = stackIn_116_0;
                                stackIn_117_0 = stackOut_116_0;
                                L35: {
                                  if (stackIn_117_0 >= var4_int) {
                                    break L35;
                                  } else {
                                    if ((var4_int ^ -1) > -14) {
                                      wm.field_H[var4_int] = null;
                                      break L35;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                                var4_int++;
                                if (var9 == 0) {
                                  continue L32;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                          ea.field_E[0] = null;
                          vn.field_b = null;
                          ce.field_m.a(true);
                          dh.a(ue.field_d, (byte) -66);
                          tj.field_t = rc.a(so.field_k, -24755, "", "font", ue.field_d);
                          mi.field_B = rc.a(so.field_k, -24755, "", "smallfont", ue.field_d);
                          bk.a(2);
                          stackOut_124_0 = 0;
                          stackIn_125_0 = stackOut_124_0;
                          break L33;
                        }
                        return stackIn_125_0 != 0;
                      }
                    }
                  }
                }
              }
            } else {
              break L23;
            }
          }
          if (hb.field_Fb != null) {
            gh.a(-92, new u(hb.field_Fb.a("huffman", "", -1)));
            hb.field_Fb = null;
            bk.a(2);
            return false;
          } else {
            wk.d((byte) -98);
            return true;
          }
        }
    }

    final static void j(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        u.field_k = false;
                        if (param0 == 48) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ArcanistsMulti.h((byte) -33);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fg.field_o = null;
                        if (hk.field_s) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var1_int = dd.field_j;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var1_int ^ -1) < -1) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var1_int != 1) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        fg.field_o = re.field_k;
                        if (var2 == 0) {
                            statePc = 17;
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
                        fg.field_o = tj.a(param0 ^ -80, new String[1], sk.field_g);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        fg.field_o = ua.a(new CharSequence[3], -93);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        vf.field_k.h(77);
                        ba.c(0);
                        if (var2 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        vf.field_k.g(true);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) var1, "ArcanistsMulti.UA(" + param0 + 41);
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int[] param1, dn param2, String param3, long param4, int param5, int param6, String param7, kc param8) {
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        dd.field_h = param2;
                        eo.field_c = new ne(param8, param4, param3, param7, param6, param5, param1);
                        if (param0 == -26335) {
                            statePc = 25;
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
                        boolean discarded$3 = ArcanistsMulti.i((byte) 116);
                        statePc = 25;
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
                        stackOut_4_1 = new StringBuilder().append("ArcanistsMulti.SA(").append(param0).append(44);
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param1 == null) {
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
                        if (param2 == null) {
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
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param3 == null) {
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
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param7 == null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param8 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_24_2 = stackOut_21_2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                    stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                    stackOut_23_2 = "null";
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw aa.a((Throwable) (Object) stackIn_24_0, (String) (Object) (stackIn_24_2 + 41));
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ArcanistsMulti.h((byte) -91);
                        fn.a((byte) -60);
                        qa.a((byte) 92);
                        vn.e(true);
                        cb.a((byte) 44);
                        ik.a(0);
                        c.a(30);
                        to.c(false);
                        kc.d(-21224);
                        ji.a(-733);
                        bh.a(-97);
                        bc.a(1);
                        ci.a(0);
                        uf.a((byte) -81);
                        ud.d(true);
                        p.a((byte) -46);
                        dc.a(false);
                        hn.a(66);
                        je.a(-10338);
                        hh.b(1);
                        de.c();
                        eg.a(false);
                        dj.a();
                        rg.a(35);
                        wk.b(true);
                        qj.c(-13019);
                        ra.b(64);
                        oj.a(1);
                        uc.a((byte) -58);
                        ck.b((byte) 85);
                        hm.a(124);
                        ub.a(-70);
                        um.a(0);
                        ad.a(96);
                        jg.c(-25776);
                        mf.a(-1);
                        md.a((byte) 115);
                        hg.b((byte) -105);
                        dk.b(false);
                        rc.a(-1);
                        uk.a(115);
                        v.b(-18033);
                        gi.a((byte) 59);
                        lc.c(true);
                        le.f((byte) 95);
                        pm.a(0);
                        kf.a((byte) -121);
                        hf.a(false);
                        lk.d(11959);
                        pa.a(32336);
                        gk.a((byte) -90);
                        sd.b(-1);
                        k.c(11138);
                        nf.r(0);
                        pg.c((byte) -115);
                        pn.b((byte) 122);
                        cc.a((byte) 107);
                        so.a(param0);
                        gh.d((byte) 115);
                        di.b(13);
                        o.c(true);
                        en.b();
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 1;
                        stackIn_4_0 = stackOut_1_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        hk.b(stackIn_4_0 != 0);
                        lb.c();
                        io.c(118);
                        fo.a(0);
                        ec.b(0);
                        kj.a(true);
                        lf.a(-15);
                        jk.a(0);
                        nb.a(-79);
                        tl.a((byte) -51);
                        ml.h(false);
                        qc.a(54);
                        tf.a(49);
                        mi.g(2);
                        oc.b(false);
                        hi.a((byte) 60);
                        jd.d((byte) -109);
                        ai.b();
                        ni.a();
                        jj.a();
                        ah.a(false);
                        r.a(8);
                        oi.a(103);
                        vi.h((byte) 62);
                        h.h(1);
                        ie.m((byte) 25);
                        gd.g(103);
                        no.l((byte) -11);
                        ed.i(-29222);
                        ln.g(10);
                        td.a((byte) 115);
                        e.a(-1);
                        sn.g((byte) 127);
                        hc.a((byte) -60);
                        vh.b(-60);
                        if (param0) {
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
                        stackOut_5_0 = 1;
                        stackIn_8_0 = stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        fb.a(stackIn_8_0 != 0);
                        pc.a(false);
                        dd.a(-5451);
                        ue.a((byte) 62);
                        g.a(30586);
                        tm.b(-79);
                        cf.a((byte) 83);
                        nl.e(-10765);
                        dn.e(1);
                        af.e(93);
                        in.g((byte) -120);
                        pe.g(0);
                        hb.e(0);
                        ne.c(-14);
                        w.g((byte) 126);
                        cg.e(param0);
                        i.a((byte) 6);
                        na.g((byte) 120);
                        jb.c(122);
                        we.c(120);
                        wj.a(0);
                        mo.c(0);
                        tg.c(-92);
                        mc.a(73);
                        ao.b(0);
                        sb.c(-1);
                        s.a((byte) -109);
                        bm.a(false);
                        fc.a((byte) -71);
                        nm.a(-1);
                        ph.a((byte) -42);
                        fi.a((byte) 5);
                        gj.a(false);
                        ch.a(false);
                        bd.b(0);
                        ab.q(21657);
                        da.a(-121);
                        u.a(1);
                        vm.a((byte) -75);
                        ug.a(109);
                        ic.a(0);
                        ge.a(-117);
                        cn.g((byte) 112);
                        qn.h(1);
                        cj.a(param0);
                        sa.e(26820);
                        jn.a((byte) -99);
                        rj.a((byte) -94);
                        oh.a(-791);
                        kb.d(255);
                        ff.a((byte) 46);
                        si.b((byte) 36);
                        mj.a((byte) -95);
                        of.a(-56);
                        lh.a(2);
                        jm.c(63);
                        qm.f((byte) -17);
                        wn.e(23123);
                        kh.a(6481);
                        kn.h(3);
                        uj.a(true);
                        qo.a(6);
                        ob.f(false);
                        ti.k(0);
                        ag.e(-125);
                        ua.f(-1);
                        df.c(true);
                        kl.a((byte) -90);
                        ae.a((byte) -125);
                        qf.a((byte) 92);
                        ef.g(-1);
                        vk.f((byte) 20);
                        be.a((byte) -60);
                        ea.f((byte) 78);
                        tj.b(107);
                        jo.a(0);
                        ve.d(2039583);
                        b.a(67);
                        id.c();
                        gl.a((byte) 15);
                        vg.a(40);
                        bo.a(120);
                        he.a(-31399);
                        oa.a((byte) 98);
                        wd.a(0);
                        rd.a(0);
                        lm.a(-888);
                        pi.a((byte) -68);
                        jh.a((byte) 87);
                        eo.a(-14449);
                        n.a(8577);
                        bg.a((byte) -79);
                        bf.a();
                        ul.a(4);
                        bb.a((byte) -127);
                        fl.a(true);
                        wh.a((byte) -118);
                        sk.b(121);
                        la.a((byte) 49);
                        hd.a((byte) 107);
                        ij.g(12);
                        kg.a(0);
                        gn.a((byte) -122);
                        oo.e(31908);
                        tk.c(-1016755547);
                        ig.a(0);
                        go.a(false);
                        hj.a((byte) 111);
                        lj.c(-80);
                        ga.a((byte) -109);
                        vf.a(27494);
                        if (param0) {
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
                        stackOut_9_0 = 1;
                        stackIn_12_0 = stackOut_9_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ia.a(stackIn_12_0 != 0);
                        rb.a(37);
                        oe.a(120);
                        rm.a(-6566);
                        fg.b(param0);
                        ba.a((byte) 94);
                        jc.a();
                        ke.f(2);
                        bi.o(0);
                        rn.n(1);
                        qk.g(0);
                        om.a((byte) -127);
                        li.a(1313);
                        ej.f(20445);
                        mk.g((byte) -125);
                        sc.g(15428);
                        bk.f(0);
                        rl.c((byte) -114);
                        gg.b(28);
                        ng.a(40);
                        rk.h(-116);
                        wg.d(param0);
                        tn.f((byte) -97);
                        dh.f((byte) 77);
                        fd.a(-1);
                        bl.c((byte) -79);
                        wl.k(0);
                        nj.a((byte) -72);
                        mg.i(42);
                        sl.g(123);
                        jl.c(-125);
                        re.b(0);
                        se.f(-114);
                        q.f(-1764031359);
                        bj.l((byte) -46);
                        gf.k((byte) -108);
                        wm.f(-5903);
                        ma.g((byte) 54);
                        wi.a(92);
                        pk.a(-14987);
                        gb.b((byte) 33);
                        nn.c(63);
                        aj.a(20028);
                        nh.h((byte) -102);
                        ka.a(-1);
                        sm.a(false);
                        jf.a((byte) -120);
                        fh.a((byte) 88);
                        fk.a(-1333592895);
                        nk.a(30025);
                        ce.b(false);
                        mm.d(2188450);
                        gm.a(-9922);
                        ib.a(true);
                        tc.b((byte) 25);
                        ii.b((byte) 106);
                        dm.c(true);
                        cd.a((byte) 99);
                        rf.a(85);
                        fj.a(90);
                        on.a(3);
                        wa.f((byte) -121);
                        ta.a(5);
                        ol.b(-23971);
                        hl.a(-1513388336);
                        fe.a(32369);
                        cm.a(49);
                        pb.a((byte) 126);
                        f.a(-1);
                        qg.b(83);
                        co.b(-62);
                        ho.b(0);
                        km.b(400);
                        am.a(false);
                        qe.c(-100);
                        me.a((byte) 115);
                        uh.a(-69);
                        fm.a(0);
                        th.a((byte) -113);
                        ql.a((byte) -107);
                        im.a((byte) -14);
                        ld.b((byte) 13);
                        an.a((byte) -104);
                        ih.a((byte) 48);
                        vc.b(202);
                        vd.a(0);
                        va.a(121);
                        eb.a((byte) 49);
                        j.a((byte) -122);
                        mh.h((byte) 114);
                        mb.a(122);
                        aa.b(false);
                        ko.a(32);
                        dg.d(-1);
                        ui.d(70);
                        ki.d((byte) 90);
                        ja.d(0);
                        lo.d(15672);
                        mn.d((byte) -119);
                        db.a(255);
                        vl.a((byte) -76);
                        eh.a((byte) 121);
                        ee.c(true);
                        ri.a((byte) 76);
                        ((ArcanistsMulti) this).field_q = null;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) var2, "ArcanistsMulti.N(" + param0 + 41);
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        le var5 = null;
        int var5_int = 0;
        int[][] var5_array = null;
        int var6_int = 0;
        int[][] var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        boolean[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_104_0 = 0;
        boolean stackIn_118_0 = false;
        boolean stackIn_122_0 = false;
        boolean stackIn_130_0 = false;
        Object stackIn_142_0 = null;
        boolean stackIn_150_0 = false;
        boolean stackIn_171_0 = false;
        boolean[] stackIn_200_0 = null;
        boolean[] stackIn_200_1 = null;
        int stackIn_200_2 = 0;
        boolean[] stackIn_202_0 = null;
        boolean[] stackIn_202_1 = null;
        int stackIn_202_2 = 0;
        boolean[] stackIn_203_0 = null;
        boolean[] stackIn_203_1 = null;
        int stackIn_203_2 = 0;
        int stackIn_203_3 = 0;
        int stackIn_206_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_235_0 = 0;
        int stackIn_250_0 = 0;
        int stackIn_259_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_103_0 = 0;
        boolean stackOut_117_0 = false;
        boolean stackOut_121_0 = false;
        boolean stackOut_129_0 = false;
        Object stackOut_141_0 = null;
        boolean stackOut_149_0 = false;
        boolean stackOut_170_0 = false;
        boolean[] stackOut_199_0 = null;
        boolean[] stackOut_199_1 = null;
        int stackOut_199_2 = 0;
        boolean[] stackOut_200_0 = null;
        boolean[] stackOut_200_1 = null;
        int stackOut_200_2 = 0;
        int stackOut_200_3 = 0;
        boolean[] stackOut_202_0 = null;
        boolean[] stackOut_202_1 = null;
        int stackOut_202_2 = 0;
        int stackOut_202_3 = 0;
        int stackOut_205_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_234_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_258_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (bj.g(false)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param1 = true;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (b.field_a.b(12623) == null) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = -336;
                        stackIn_7_0 = stackOut_6_0;
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
                        wi.field_h = wi.field_h + 1;
                        if (stackIn_7_0 != (wi.field_h + 1 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        wi.field_h = 0;
                        pg discarded$2 = b.field_a.c(true);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((ii.field_c ^ -1) == (ii.field_a ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (ie.field_Vb == ii.field_a) {
                            statePc = 44;
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
                        if (ii.field_a == sl.field_I) {
                            statePc = 26;
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
                        u.field_i = u.field_i - 1;
                        if (u.field_i != 0) {
                            statePc = 192;
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
                        ii.field_a = ii.field_c;
                        if (var13 == 0) {
                            statePc = 192;
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
                        if (lc.a((byte) 112)) {
                            statePc = 43;
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
                        mn.field_r = cj.field_b;
                        vk.c(false);
                        if (w.field_Cb) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        w.field_Cb = false;
                        km.a(1, 10, 240, 16, (dj) (Object) mi.field_B, 320, (byte) 40, mi.field_B.field_o, false, wd.field_h, mi.field_B.field_m + mi.field_B.field_o, ve.field_t);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!pi.field_c) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        pi.field_c = false;
                        gj.a(false, true, -4, mn.field_r);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (!ij.b(mn.field_r, 10)) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        lf.a((byte) 80);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ii.field_a = ub.field_h;
                        if (var13 == 0) {
                            statePc = 192;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        u.field_i = u.field_i + 1;
                        if (-17 != (u.field_i ^ -1)) {
                            statePc = 192;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (w.field_Cb) {
                            statePc = 53;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        vn.a((byte) 4);
                        if (var13 == 0) {
                            statePc = 56;
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
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        am.a(3020);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ii.field_a = sl.field_I;
                        if (var13 == 0) {
                            statePc = 192;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var3_int = 0;
                        var4 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (param1) {
                            statePc = 116;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((si.field_g ^ -1) == (mn.field_r ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        km.field_c = km.field_c + 1;
                        if ((km.field_c ^ -1) == -33) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        lf.a((byte) 80);
                        if (var13 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var5 = jb.field_z;
                        if (null != var5) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var5 = r.field_b;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (-1 == si.field_g) {
                            statePc = 100;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (14 == si.field_g) {
                            statePc = 93;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = si.field_g;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((stackIn_75_0 ^ -1) == -3) {
                            statePc = 93;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackOut_78_0 = -5;
                        stackIn_79_0 = stackOut_78_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (stackIn_79_0 == (si.field_g ^ -1)) {
                            statePc = 93;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if ((si.field_g ^ -1) == 1) {
                            statePc = 91;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (!ij.b(si.field_g, param0 ^ -83)) {
                            statePc = 116;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        tl.field_f[si.field_g].b(91);
                        if (var13 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var3_int = 1;
                        stackOut_91_0 = var13;
                        stackIn_92_0 = stackOut_91_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var5.field_ab) {
                            statePc = 99;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var5.a(true, false);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        tl.field_f[si.field_g].b(param0 ^ -2);
                        if (var13 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (!wa.field_Ob) {
                            statePc = 105;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var4 = 1;
                        var3_int = 1;
                        stackOut_103_0 = var13;
                        stackIn_104_0 = stackOut_103_0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (stackIn_104_0 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (var5.field_ab) {
                            statePc = 111;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var5.a(true, true);
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (!ib.b(false)) {
                            statePc = 116;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var5.k(1);
                        if (var13 != 0) {
                            statePc = 174;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var13 == 0) {
                            statePc = 111;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (!wa.field_Ob) {
                            statePc = 174;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = kh.field_b;
                        stackIn_118_0 = stackOut_117_0;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (stackIn_118_0) {
                            statePc = 174;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackOut_121_0 = oc.field_g;
                        stackIn_122_0 = stackOut_121_0;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (!stackIn_122_0) {
                            statePc = 127;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var5_int = var4;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (!hi.field_a) {
                            statePc = 136;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = ef.field_r;
                        stackIn_130_0 = stackOut_129_0;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (stackIn_130_0) {
                            statePc = 135;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var3_int = 0;
                        var4 = 0;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        ae.a(var3_int != 0, 13);
                        if (mj.field_w) {
                            statePc = 139;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        r.field_b.a(true, var4 != 0);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (!hi.field_a) {
                            statePc = 148;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        stackOut_141_0 = null;
                        stackIn_142_0 = stackOut_141_0;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if ((Object) (Object) stackIn_142_0 == (Object) (Object) jb.field_z) {
                            statePc = 148;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        nh.a((byte) -66, 320, 180, var5_int != 0);
                        jb.field_z.a(true, var4 != 0);
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (!ib.b(false)) {
                            statePc = 170;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackOut_149_0 = ao.field_d;
                        stackIn_171_0 = stackOut_149_0;
                        stackIn_150_0 = stackOut_149_0;
                        if (var13 != 0) {
                            statePc = 171;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (stackIn_150_0) {
                            statePc = 154;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (!hi.field_a) {
                            statePc = 161;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (!tg.a(12, 27, 15, 13)) {
                            statePc = 162;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        jb.field_z.field_O = true;
                        if (var13 == 0) {
                            statePc = 148;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        boolean discarded$3 = pe.a(15, 12, (byte) 32, 13);
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (!mj.field_w) {
                            statePc = 166;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        r.field_b.k(1);
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        if (hi.field_a) {
                            statePc = 169;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        jb.field_z.k(param0 ^ -90);
                        if (var13 == 0) {
                            statePc = 148;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackOut_170_0 = ao.field_d;
                        stackIn_171_0 = stackOut_170_0;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (!stackIn_171_0) {
                            statePc = 173;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        ef.field_r = false;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (wa.field_Ob) {
                            statePc = 178;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        lf.b(-4);
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (ao.field_d) {
                            statePc = 185;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (-1 > (rd.field_b ^ -1)) {
                            statePc = 184;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        rd.field_b = rd.field_b - 1;
                        if (var13 == 0) {
                            statePc = 191;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if ((rd.field_b ^ -1) <= (ea.field_F ^ -1)) {
                            statePc = 191;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        rd.field_b = rd.field_b + 1;
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        var5_int = ea.field_F * ea.field_F;
                        var6_int = -(rd.field_b * rd.field_b) + var5_int;
                        var7_int = an.field_j - 120 - -(120 * var6_int / var5_int);
                        rc.a(var7_int, -30218);
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if (2 != (mn.field_r ^ -1)) {
                            statePc = 236;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        var3_ref = ah.field_b;
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        if (var3_ref == null) {
                            statePc = 197;
                        } else {
                            statePc = 195;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        var3_ref = k.field_p;
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        var4_ref_String__ = new String[]{var3_ref, ga.field_n, rf.field_l, rg.field_c};
                        var5_array = new int[6][18];
                        var6 = new int[6][16];
                        var7 = new int[]{ad.field_d, 0, 0, 0, 0, 0};
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        stackOut_199_0 = new boolean[6];
                        stackOut_199_1 = new boolean[6];
                        stackOut_199_2 = 0;
                        stackIn_202_0 = stackOut_199_0;
                        stackIn_202_1 = stackOut_199_1;
                        stackIn_202_2 = stackOut_199_2;
                        stackIn_200_0 = stackOut_199_0;
                        stackIn_200_1 = stackOut_199_1;
                        stackIn_200_2 = stackOut_199_2;
                        if (qf.field_d < 2) {
                            statePc = 202;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        stackOut_200_0 = (boolean[]) (Object) stackIn_200_0;
                        stackOut_200_1 = (boolean[]) (Object) stackIn_200_1;
                        stackOut_200_2 = stackIn_200_2;
                        stackOut_200_3 = 1;
                        stackIn_203_0 = stackOut_200_0;
                        stackIn_203_1 = stackOut_200_1;
                        stackIn_203_2 = stackOut_200_2;
                        stackIn_203_3 = stackOut_200_3;
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        stackOut_202_0 = (boolean[]) (Object) stackIn_202_0;
                        stackOut_202_1 = (boolean[]) (Object) stackIn_202_1;
                        stackOut_202_2 = stackIn_202_2;
                        stackOut_202_3 = 0;
                        stackIn_203_0 = stackOut_202_0;
                        stackIn_203_1 = stackOut_202_1;
                        stackIn_203_2 = stackOut_202_2;
                        stackIn_203_3 = stackOut_202_3;
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        stackIn_203_1[stackIn_203_2] = stackIn_203_3 != 0;
                        stackIn_203_0[1] = false;
                        stackIn_203_0[2] = false;
                        stackIn_203_0[3] = false;
                        stackIn_203_0[4] = false;
                        stackIn_203_0[5] = false;
                        var8 = (boolean[]) (Object) stackIn_203_0;
                        var9 = 0;
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        if (var9 >= 6) {
                            statePc = 234;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        var10 = 0;
                        stackOut_205_0 = 0;
                        stackIn_235_0 = stackOut_205_0;
                        stackIn_206_0 = stackOut_205_0;
                        if (var13 != 0) {
                            statePc = 235;
                        } else {
                            statePc = 206;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        var11 = stackIn_206_0;
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        if (var11 >= 4) {
                            statePc = 217;
                        } else {
                            statePc = 208;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        stackOut_208_0 = 0;
                        stackIn_218_0 = stackOut_208_0;
                        stackIn_209_0 = stackOut_208_0;
                        if (var13 != 0) {
                            statePc = 218;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        var12 = stackIn_209_0;
                        statePc = 210;
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        if (var12 >= 3) {
                            statePc = 215;
                        } else {
                            statePc = 211;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        var10++;
                        var5_array[var9][var10] = kg.field_d[var11][var12];
                        var12++;
                        if (var13 != 0) {
                            statePc = 216;
                        } else {
                            statePc = 212;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        if (var13 == 0) {
                            statePc = 210;
                        } else {
                            statePc = 213;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        var11++;
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        if (var13 == 0) {
                            statePc = 207;
                        } else {
                            statePc = 217;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        stackOut_217_0 = 0;
                        stackIn_218_0 = stackOut_217_0;
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        var11 = stackIn_218_0;
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        if (var11 >= 6) {
                            statePc = 224;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        var10++;
                        var5_array[var9][var10] = so.field_c[var11];
                        var11++;
                        if (var13 != 0) {
                            statePc = 225;
                        } else {
                            statePc = 221;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        if (var13 == 0) {
                            statePc = 219;
                        } else {
                            statePc = 222;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        var11 = 0;
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        if ((var11 ^ -1) <= -17) {
                            statePc = 232;
                        } else {
                            statePc = 226;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        var6[var9][var11] = b.field_f[var11];
                        var11++;
                        if (var13 != 0) {
                            statePc = 233;
                        } else {
                            statePc = 227;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        if (var13 == 0) {
                            statePc = 225;
                        } else {
                            statePc = 230;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        var9++;
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        if (var13 == 0) {
                            statePc = 204;
                        } else {
                            statePc = 234;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        jb.field_z = new le(false, 0, 3, false, var4_ref_String__, 0, var5_array, var6, var7, 0, 0, false, 0, var8);
                        gj.a(ta.field_d, true, 14, -1);
                        stackOut_234_0 = 1;
                        stackIn_235_0 = stackOut_234_0;
                        statePc = 235;
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        io.field_A = stackIn_235_0 != 0;
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        if (param0 == -89) {
                            statePc = 240;
                        } else {
                            statePc = 237;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 239;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        ArcanistsMulti.h((byte) 78);
                        statePc = 238;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 239;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        statePc = 240;
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        if (-4 == mn.field_r) {
                            statePc = 243;
                        } else {
                            statePc = 241;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 242;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 242;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        if (jh.field_c[0] == f.field_g) {
                            statePc = 246;
                        } else {
                            statePc = 244;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        mi.a(jh.field_c[0], param0 + 92);
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        he.field_e.b((byte) -59, 64);
                        var3_int = 0;
                        statePc = 248;
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        if ((var3_int ^ -1) <= -5) {
                            statePc = 258;
                        } else {
                            statePc = 249;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        stackOut_249_0 = 0;
                        stackIn_259_0 = stackOut_249_0;
                        stackIn_250_0 = stackOut_249_0;
                        if (var13 != 0) {
                            statePc = 259;
                        } else {
                            statePc = 250;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        var4 = stackIn_250_0;
                        statePc = 251;
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        if ((var4 ^ -1) <= -4) {
                            statePc = 256;
                        } else {
                            statePc = 252;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        he.field_e.f(kg.field_d[var3_int][var4], (byte) -60);
                        var4++;
                        if (var13 != 0) {
                            statePc = 257;
                        } else {
                            statePc = 253;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        if (var13 == 0) {
                            statePc = 251;
                        } else {
                            statePc = 254;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        statePc = 256;
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        var3_int++;
                        statePc = 257;
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        if (var13 == 0) {
                            statePc = 248;
                        } else {
                            statePc = 258;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        stackOut_258_0 = 0;
                        stackIn_259_0 = stackOut_258_0;
                        statePc = 259;
                        continue stateLoop;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        var3_int = stackIn_259_0;
                        statePc = 260;
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        if (var3_int >= 6) {
                            statePc = 265;
                        } else {
                            statePc = 261;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        he.field_e.f(so.field_c[var3_int], (byte) -81);
                        var3_int++;
                        if (var13 != 0) {
                            statePc = 266;
                        } else {
                            statePc = 262;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        if (var13 == 0) {
                            statePc = 260;
                        } else {
                            statePc = 263;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        var3_int = 0;
                        statePc = 266;
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        if (var3_int >= 16) {
                            statePc = 273;
                        } else {
                            statePc = 267;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 269;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        he.field_e.f(b.field_f[var3_int], (byte) -47);
                        var3_int++;
                        if (var13 != 0) {
                            statePc = 274;
                        } else {
                            statePc = 268;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 272;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        statePc = 270;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 272;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 272;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        if (var13 == 0) {
                            statePc = 266;
                        } else {
                            statePc = 271;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 272;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        statePc = 273;
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        he.field_e.b((byte) -127, 9);
                        mn.field_r = si.field_g;
                        statePc = 274;
                        continue stateLoop;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        kh.field_b = true;
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        if (mn.field_r == -5) {
                            statePc = 278;
                        } else {
                            statePc = 276;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        statePc = 281;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        qc.a(false, wi.field_f.h((byte) 72), 11);
                        oc.field_g = true;
                        mn.field_r = si.field_g;
                        statePc = 281;
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 280: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) var3, "ArcanistsMulti.RA(" + param0 + 44 + param1 + 41);
                }
                case 281: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        gh var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ArcanistsMulti) this).a(true, 14, 19, 0, 5000, 9, 11, 8);
                        ri.field_f = false;
                        gb.a((byte) -9);
                        la.field_a = false;
                        nm.field_h = -1;
                        jf.field_j = 0;
                        ua.field_P = 0;
                        kg.field_a = false;
                        cb.field_e = 0L;
                        ta.field_b = false;
                        var2_ref = new gh();
                        var2_ref.b(128, 68, 9);
                        im.a(22050, var2_ref, fi.field_d, (java.awt.Component) (Object) on.field_c, -22836, true);
                        pn.field_d = 16728128;
                        wm.field_I = 16777215;
                        ql.field_a = 0;
                        ((ArcanistsMulti) this).a(false, true, false, true, true, (byte) -128, false);
                        di.field_n[69] = 1;
                        di.field_n[63] = 16;
                        di.field_n[60] = 1;
                        di.field_n[61] = 0;
                        kg.field_d[0] = ld.field_n[0];
                        di.field_n[62] = 2;
                        di.field_n[57] = -2;
                        di.field_n[70] = 1;
                        di.field_n[79] = 2;
                        di.field_n[66] = 4;
                        di.field_n[77] = 0;
                        di.field_n[64] = 0;
                        di.field_n[65] = 1;
                        di.field_n[68] = 1;
                        di.field_n[71] = 1;
                        di.field_n[73] = -1;
                        di.field_n[78] = 4;
                        di.field_n[67] = 2;
                        di.field_n[74] = 11;
                        di.field_n[58] = -2;
                        he.field_a = new int[256];
                        cj.field_g = new int[256];
                        kg.field_d[3] = hi.field_b[0];
                        kg.field_d[2] = ug.field_d[0];
                        var3 = -120 % ((-68 - param0) / 33);
                        kg.field_d[1] = ud.field_z[0];
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (256 <= var4) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        he.field_a[var4] = (var4 << 2108215088) + var4;
                        cj.field_g[var4] = (var4 << 1356938832) - (-(var4 / 2 << -621868600) - var4 / 4);
                        var4++;
                        if (var5 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) var2, "ArcanistsMulti.E(" + param0 + 41);
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void init() {
        try {
            ((ArcanistsMulti) this).a(an.field_f, "arcanistsmulti", an.field_j, (byte) -92, 15);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ArcanistsMulti.init()");
        }
    }

    final void c(byte param0) {
        Object var2 = null;
        int var3_int = 0;
        qa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        qb var15 = null;
        kc var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object stackIn_3_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_92_0 = 0;
        java.awt.Canvas stackOut_2_0 = null;
        uk stackOut_1_0 = null;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_91_0 = 0;
        boolean stackOut_90_0 = false;
        L0: {
          var20 = field_G ? 1 : 0;
          if (null == ka.field_m) {
            stackOut_2_0 = on.field_c;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ka.field_m;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = (Object) (Object) stackIn_3_0;
          ce.field_m.a(true);
          if (param0 == -89) {
            break L1;
          } else {
            ArcanistsMulti.a(66, (int[]) null, (dn) null, (String) null, 78L, -15, 110, (String) null, (kc) null);
            break L1;
          }
        }
        if (!oc.a(-15576)) {
          if (ue.field_e) {
            if (!hn.a((byte) 87)) {
              rb.a(mm.field_t, false, 100.0f);
              eg.a((java.awt.Canvas) var2, (byte) -62);
              return;
            } else {
              L2: {
                L3: {
                  this.m(param0 + 15522);
                  if (mn.field_r == si.field_g) {
                    break L3;
                  } else {
                    L4: {
                      if (-2 == si.field_g) {
                        break L4;
                      } else {
                        if (1 == (mn.field_r ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            if (16 <= km.field_c) {
                              break L5;
                            } else {
                              ji.a(-2, false, si.field_g, cb.field_b);
                              tn.field_Fb = 256 * km.field_c / 16;
                              de.e(0, 0, an.field_f, an.field_j, 0, tn.field_Fb / 2);
                              gn.a(256, (byte) 108, tn.field_Fb / 2, 0, pm.field_c);
                              gn.a(256, (byte) 97, tn.field_Fb / 2, an.field_f, an.field_j + -pm.field_c);
                              if (var20 == 0) {
                                break L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ji.a(-2, false, mn.field_r, io.field_A);
                          tn.field_Fb = (-(km.field_c * 256) + 8192) / 16;
                          gn.a(256, (byte) 86, tn.field_Fb, 0, pm.field_c);
                          gn.a(256, (byte) 78, tn.field_Fb, an.field_f, an.field_j + -pm.field_c);
                          gn.a(256, (byte) 97, tn.field_Fb, an.field_f / 2, an.field_j / 2);
                          if (var20 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L6: {
                      if (16 > km.field_c) {
                        break L6;
                      } else {
                        ji.a(-2, false, mn.field_r, io.field_A);
                        tn.field_Fb = (8192 + -(256 * km.field_c)) / 16;
                        de.e(0, 0, an.field_f, an.field_j, 0, tn.field_Fb);
                        if (var20 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ji.a(-2, false, si.field_g, cb.field_b);
                    tn.field_Fb = km.field_c * 256 / 16;
                    de.e(0, 0, an.field_f, an.field_j, 0, tn.field_Fb);
                    if (var20 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ji.a(-2, true, si.field_g, cb.field_b);
                break L2;
              }
              L7: {
                if (-2 == si.field_g) {
                  break L7;
                } else {
                  if (-2 == mn.field_r) {
                    break L7;
                  } else {
                    li.a((byte) 99);
                    break L7;
                  }
                }
              }
              L8: {
                L9: {
                  if (!cb.field_b) {
                    break L9;
                  } else {
                    if (!io.field_A) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                L10: {
                  var3_int = ea.field_F * ea.field_F;
                  var4 = -(rd.field_b * rd.field_b) + var3_int;
                  var5 = -120 + (an.field_j - -(120 * var4 / var3_int));
                  rc.a(var5, -30218);
                  to.a(gj.a(29372), (byte) 119);
                  if (si.field_g != -2) {
                    break L10;
                  } else {
                    L11: {
                      var3_int = (int)(Math.sin((double)jb.field_v * 0.2) * 8.0);
                      var4 = -(int)(Math.cos((double)jb.field_v * 0.2) * 5.0);
                      if ((var4 ^ -1) >= -1) {
                        break L11;
                      } else {
                        var4 = 0;
                        break L11;
                      }
                    }
                    L12: {
                      var5 = -var3_int;
                      var6 = (int)(Math.cos(0.2 * (double)jb.field_v) * 5.0);
                      if ((var6 ^ -1) >= -1) {
                        break L12;
                      } else {
                        var6 = 0;
                        break L12;
                      }
                    }
                    L13: {
                      var7 = (int)(Math.sin((double)jb.field_v * 0.1) * 8.0) + 16;
                      var8 = 0;
                      var9 = -(int)(8.0 * Math.sin(-0.1 + (double)jb.field_v * 0.1)) + -16;
                      var10 = 0;
                      var11 = (jb.field_v >> -1220573239) % 24;
                      var12 = 32;
                      var13 = 160;
                      if ((so.field_c[5] + so.field_c[2] + (so.field_c[0] - -so.field_c[1]) - (-so.field_c[3] - so.field_c[4]) ^ -1) != -1) {
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        break L13;
                      } else {
                        stackOut_44_0 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var14 = stackIn_46_0;
                        if ((jb.field_v & 1024 ^ -1) >= -1) {
                          break L15;
                        } else {
                          if ((1023 & -jb.field_v + 1024) < 512) {
                            break L14;
                          } else {
                            if (var14 == 0) {
                              break L14;
                            } else {
                              var10 = 0;
                              var6 = 0;
                              var11 = (jb.field_v >> -1245931005) % 2;
                              var3_int = 0;
                              var5 = 0;
                              var8 = 0;
                              var9 = -16;
                              var4 = 0;
                              var7 = 16;
                              if (var20 == 0) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      if ((1023 & jb.field_v) < 512) {
                        break L14;
                      } else {
                        if (var14 == 0) {
                          break L14;
                        } else {
                          var3_int = 0;
                          var10 = 0;
                          var9 = -16;
                          var5 = 0;
                          var11 = (jb.field_v >> 702718563) % 2;
                          var4 = 0;
                          var7 = 16;
                          var6 = 0;
                          var8 = 0;
                          break L14;
                        }
                      }
                    }
                    L16: {
                      var15 = new qb(128, 256);
                      var15.a();
                      pc.a(kg.field_d[2], var8 + var13, kg.field_d[3], kg.field_d[0], (byte) 116, kg.field_d[1], qe.field_i[so.field_c[3]], var12 + var7);
                      pc.a(kg.field_d[2], var13 - -var4, kg.field_d[3], kg.field_d[0], (byte) -87, kg.field_d[1], fn.field_b[0], var3_int + var12);
                      pc.a(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], (byte) 80, kg.field_d[1], jd.field_j[so.field_c[0]], var12);
                      var13 -= 8;
                      var13 -= 16;
                      pc.a(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], (byte) -87, kg.field_d[1], kc.field_kb[so.field_c[1]], var12);
                      var13 += 16;
                      pc.a(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], (byte) -90, kg.field_d[1], hn.field_d[so.field_c[5]], var12);
                      pc.a(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], (byte) -117, kg.field_d[1], bo.field_a[var11], var12);
                      var13 -= 16;
                      pc.a(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], (byte) -127, kg.field_d[1], tj.field_A[so.field_c[4]], var12);
                      var13 += 8;
                      var13 += 16;
                      pc.a(kg.field_d[2], var6 + var13, kg.field_d[3], kg.field_d[0], (byte) -113, kg.field_d[1], h.field_I[0], var12 - -var5);
                      pc.a(kg.field_d[2], var10 + var13, kg.field_d[3], kg.field_d[0], (byte) 122, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var12);
                      ce.field_m.a(true);
                      var16 = db.a(false);
                      if (null != var16) {
                        L17: {
                          var17 = var16.field_V - 202;
                          de.h(4 + var16.field_V, var16.field_nb - -4, -4 + (var16.field_x - -var16.field_V), var16.field_nb + (var16.field_I - 4));
                          var18 = -480 + an.field_j;
                          if (qf.field_d >= 2) {
                            break L17;
                          } else {
                            L18: {
                              L19: {
                                var19 = var18 + 87;
                                if (0 < (1024 & jb.field_v)) {
                                  break L19;
                                } else {
                                  L20: {
                                    L21: {
                                      var12 = 1023 & jb.field_v;
                                      if (512 > var12) {
                                        break L21;
                                      } else {
                                        if (var14 != 0) {
                                          break L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    var15.c(var12 + var17, var19);
                                    if (var20 == 0) {
                                      break L18;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  var12 = 512;
                                  de.e(-4 + (-300 + var12) + var17, 78 + var13 + var18, 308, 64, 0, 192);
                                  int discarded$3 = mi.field_B.a(io.field_x, var17 + (-300 + var12), var13 + (80 - -var18), 300, 64, 16777215, -1, 1, 1, mi.field_B.field_C);
                                  var15.e(var12 + var17, var19);
                                  if (var20 == 0) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              L22: {
                                var12 = -(1023 & jb.field_v) + 1024;
                                if (-513 < (var12 ^ -1)) {
                                  break L22;
                                } else {
                                  if (var14 == 0) {
                                    break L22;
                                  } else {
                                    var12 = 512;
                                    de.e(var17 + var12 - 300 + -4, var18 + 78 + var13, 308, 64, 0, 192);
                                    int discarded$4 = mi.field_B.a(io.field_x, var17 + var12 - 300, var18 + (var13 - -80), 300, 64, 16777215, -1, 1, 1, mi.field_B.field_C);
                                    break L22;
                                  }
                                }
                              }
                              var15.e(var17 + var12, var19);
                              break L18;
                            }
                            if (var20 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L23: {
                          var12 = 512;
                          de.e(var12 - (300 - var17), 78 + var13 + 20 + var18, 424, 64, 0, 128);
                          var19 = 16737792;
                          if (-1 <= (jb.field_v & 64 ^ -1)) {
                            break L23;
                          } else {
                            var19 = 16777215;
                            break L23;
                          }
                        }
                        int discarded$5 = mi.field_B.a("If you are playing with super mod powers, remember that the 'Mark of Fame' achievement is meant to be a CHALLENGE. Do not create games of over 3 players if you are not competent at the game. Never play with more than 4 players as you CANNOT win! Kill Seas and Nature players at ALL costs. Most of all, good luck!", -300 + var12 - -var17, 91 + var13 + var18, 424, 64, var19, -1, 1, 1, -2 + mi.field_B.field_C);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    de.a();
                    break L10;
                  }
                }
                uh.a(gj.a(29372), 115);
                le.c(1, gj.a(29372));
                break L8;
              }
              L24: {
                var3 = (qa) (Object) b.field_a.b(12623);
                if (var3 != null) {
                  L25: {
                    L26: {
                      var5 = wi.field_h;
                      if (80 > var5) {
                        break L26;
                      } else {
                        L27: {
                          if (230 > var5) {
                            break L27;
                          } else {
                            var4 = -(var5 / 2) + 123;
                            if (var20 == 0) {
                              break L25;
                            } else {
                              break L27;
                            }
                          }
                        }
                        var4 = 8;
                        if (var20 == 0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    var4 = -32 + var5 / 2;
                    break L25;
                  }
                  de.a(4, -4 + var4, tj.field_t.b(rb.field_n[var3.field_n]) + 56, 40, 0);
                  de.a(5, var4 + -3, 54 + tj.field_t.b(rb.field_n[var3.field_n]), 38, 16741888);
                  de.a(6, var4 - 2, tj.field_t.b(rb.field_n[var3.field_n]) + 52, 36, 0);
                  mo.field_a[var3.field_n].c(8, var4, 32, 32);
                  tj.field_t.a(rb.field_n[var3.field_n], 47, tj.field_t.field_C + var4, 0, 0);
                  tj.field_t.a(rb.field_n[var3.field_n], 48, -1 + (var4 + tj.field_t.field_C), 0, 0);
                  tj.field_t.a(rb.field_n[var3.field_n], 48, tj.field_t.field_C + var4, 16746496, -1);
                  break L24;
                } else {
                  break L24;
                }
              }
              L28: {
                L29: {
                  if (!rc.b(param0 ^ 88)) {
                    break L29;
                  } else {
                    L30: {
                      if (null != ka.field_m) {
                        stackOut_91_0 = 1;
                        stackIn_92_0 = stackOut_91_0;
                        break L30;
                      } else {
                        stackOut_90_0 = ie.field_Pb;
                        stackIn_92_0 = stackOut_90_0 ? 1 : 0;
                        break L30;
                      }
                    }
                    ke.a(stackIn_92_0 != 0, 4474111);
                    if (var20 == 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                if (!um.a((byte) -5)) {
                  break L28;
                } else {
                  de.b(0, 0, de.field_e, de.field_j);
                  eb.a(kf.field_b, kf.field_b[0].field_y, -117, kf.field_b[0].field_q);
                  break L28;
                }
              }
              L31: {
                if (ii.field_c != ii.field_a) {
                  var4 = u.field_i * 256 / 16;
                  if ((var4 ^ -1) < -1) {
                    de.e(0, 0, de.field_e, de.field_j, 0, var4);
                    break L31;
                  } else {
                    break L31;
                  }
                } else {
                  break L31;
                }
              }
              ma.i(91);
              kn.a((java.awt.Canvas) var2, (byte) -126, 0, 0);
              return;
            }
          } else {
            eg.a((java.awt.Canvas) var2, (byte) -29);
            return;
          }
        } else {
          kh.a((byte) 14, (java.awt.Canvas) var2, hk.c(0));
          return;
        }
    }

    final static void a(eg param0, byte param1) {
        RuntimeException var2 = null;
        ab var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = new ab(param0.a("", "logo.fo3d", -1));
                        var3 = var2_ref.e((byte) -121);
                        var2_ref.p(param1 + 166);
                        ph.field_e = ma.a((byte) -101, var2_ref);
                        gn.field_g = new int[var3][];
                        oo.field_u = new vg[var3];
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3 ^ -1) >= (var4 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        oo.field_u[var4] = rn.a(true, var2_ref);
                        var4++;
                        if (var7 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_ref.r(param1 + 80);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
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
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var3 ^ -1) >= (var4 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = oo.field_u[var4];
                        var5.a(6, 0, 1, 6, 6);
                        var5.b((byte) 62);
                        var6 = new int[]{var5.field_k - -var5.field_i >> -184915487, var5.field_v + var5.field_R >> -724604159, var5.field_N + var5.field_P >> -598247007};
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        gn.field_g[var4] = var6;
                        var5.a(-var6[1], (byte) -124, -var6[2], -var6[0]);
                        var4++;
                        if (var7 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 == 0) {
                            statePc = 9;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param1 == -80) {
                            statePc = 26;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        field_H = null;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) var2;
                        stackOut_21_1 = new StringBuilder().append("ArcanistsMulti.WA(");
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (param0 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "{...}";
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_25_2 = stackOut_22_2;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 24: {
                    stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                    stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                    stackOut_24_2 = "null";
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw aa.a((Throwable) (Object) stackIn_25_0, (String) (Object) (stackIn_25_2 + 44 + param1 + 41));
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public ArcanistsMulti() {
    }

    final static void a(int param0, byte param1) {
        try {
            int var2_int = 84 % ((param1 - 57) / 54);
            gl.a(28 - -(sc.field_U[param0] * wl.field_L[param0].length), -8 + lm.field_e[param0], -27327, 14 - (-eo.field_b[param0] - -lm.field_e[param0]), kf.field_b, tg.field_f[param0] - 16);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ArcanistsMulti.OA(" + param0 + 44 + param1 + 41);
        }
    }

    public static void h(byte param0) {
        try {
            field_H = null;
            field_F = null;
            if (param0 != -91) {
                ArcanistsMulti.j((byte) 24);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ArcanistsMulti.MA(" + param0 + 41);
        }
    }

    private final void m(int param0) {
        int var3 = 0;
        L0: {
          var3 = field_G ? 1 : 0;
          if (param0 == 15433) {
            break L0;
          } else {
            field_F = null;
            break L0;
          }
        }
        if (0 == jo.field_c) {
          L1: {
            pi.field_e = ee.field_a;
            if (null != jh.field_c[0]) {
              break L1;
            } else {
              if (tc.field_x.a(true, "arcanists_titlescreen", "")) {
                jh.field_c[0] = ha.a(tc.field_x, "", "arcanists_titlescreen");
                jo.field_c = 1;
                boolean discarded$10 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[0], -123);
                mi.a(jh.field_c[0], 3);
                break L1;
              } else {
                break L1;
              }
            }
          }
          return;
        } else {
          if ((wn.field_C ^ -1) > -53) {
            L2: {
              L3: {
                L4: {
                  if (-1 != (wn.field_C ^ -1)) {
                    break L4;
                  } else {
                    if (ue.field_d.a(true, "imp", "streamed")) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (wn.field_C != 1) {
                    break L5;
                  } else {
                    if (!ue.field_d.a(true, "arcaneexplosion", "streamed")) {
                      break L5;
                    } else {
                      cn.field_N = pk.a("streamed", param0 ^ 15433, "arcaneexplosion", ue.field_d);
                      wn.field_C = wn.field_C + 1;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (wn.field_C != 2) {
                    break L6;
                  } else {
                    if (!ue.field_d.a(true, "flameexplosion", "streamed")) {
                      break L6;
                    } else {
                      sn.field_E = pk.a("streamed", 0, "flameexplosion", ue.field_d);
                      wn.field_C = wn.field_C + 1;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  L8: {
                    if (wn.field_C != 3) {
                      break L8;
                    } else {
                      if (ue.field_d.a(true, "smokeexplosion", "streamed")) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (-5 != (wn.field_C ^ -1)) {
                      break L9;
                    } else {
                      if (!ue.field_d.a(true, "flamepuff", "streamed")) {
                        break L9;
                      } else {
                        ee.field_b = pk.a("streamed", param0 + -15433, "flamepuff", ue.field_d);
                        wn.field_C = wn.field_C + 1;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  L10: {
                    if (-6 != (wn.field_C ^ -1)) {
                      break L10;
                    } else {
                      if (!ue.field_d.a(true, "smokepuff", "streamed")) {
                        break L10;
                      } else {
                        vi.field_M = pk.a("streamed", 0, "smokepuff", ue.field_d);
                        wn.field_C = wn.field_C + 1;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (-7 != (wn.field_C ^ -1)) {
                        break L12;
                      } else {
                        if (ue.field_d.a(true, "stormpuff", "streamed")) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (wn.field_C != 7) {
                        break L13;
                      } else {
                        if (!ue.field_d.a(true, "stormexplosion", "streamed")) {
                          break L13;
                        } else {
                          u.field_j = pk.a("streamed", param0 + -15433, "stormexplosion", ue.field_d);
                          wn.field_C = wn.field_C + 1;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L14: {
                      if ((wn.field_C ^ -1) != -9) {
                        break L14;
                      } else {
                        if (!ue.field_d.a(true, "cyclopstest", "streamed")) {
                          break L14;
                        } else {
                          gb.field_c = pk.a("streamed", 0, "cyclopstest", ue.field_d);
                          wn.field_C = wn.field_C + 1;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    L15: {
                      L16: {
                        if (wn.field_C != 9) {
                          break L16;
                        } else {
                          if (ue.field_d.a(true, "sylph", "streamed")) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (wn.field_C != 10) {
                          break L17;
                        } else {
                          if (!ue.field_d.a(true, "frostgiant", "streamed")) {
                            break L17;
                          } else {
                            ea.field_v = pk.a("streamed", 0, "frostgiant", ue.field_d);
                            wn.field_C = wn.field_C + 1;
                            pi.field_e = vm.field_f;
                            if (var3 == 0) {
                              break L2;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      L18: {
                        L19: {
                          if (-12 != (wn.field_C ^ -1)) {
                            break L19;
                          } else {
                            if (ue.field_d.a(true, "dwarf", "streamed")) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          L21: {
                            if (12 != wn.field_C) {
                              break L21;
                            } else {
                              if (ue.field_d.a(true, "clockworkrecallsoldier", "streamed")) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          L22: {
                            L23: {
                              if (wn.field_C != 13) {
                                break L23;
                              } else {
                                if (ue.field_d.a(true, "golem", "streamed")) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            L24: {
                              L25: {
                                if (wn.field_C != 14) {
                                  break L25;
                                } else {
                                  if (ue.field_d.a(true, "flamedragon", "streamed")) {
                                    break L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              L26: {
                                L27: {
                                  if (15 != wn.field_C) {
                                    break L27;
                                  } else {
                                    if (ue.field_d.a(true, "frostdragon", "streamed")) {
                                      break L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                L28: {
                                  if ((wn.field_C ^ -1) != -17) {
                                    break L28;
                                  } else {
                                    if (!ue.field_d.a(true, "stormdragon", "streamed")) {
                                      break L28;
                                    } else {
                                      jk.field_m = pk.a("streamed", 0, "stormdragon", ue.field_d);
                                      wn.field_C = wn.field_C + 1;
                                      if (var3 == 0) {
                                        break L2;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                }
                                L29: {
                                  L30: {
                                    if (wn.field_C != 17) {
                                      break L30;
                                    } else {
                                      if (ue.field_d.a(true, "zombiedragon", "streamed")) {
                                        break L29;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  L31: {
                                    if (wn.field_C != 18) {
                                      break L31;
                                    } else {
                                      if (!ue.field_d.a(true, "clockworkdragon", "streamed")) {
                                        break L31;
                                      } else {
                                        ub.field_e = pk.a("streamed", 0, "clockworkdragon", ue.field_d);
                                        wn.field_C = wn.field_C + 1;
                                        if (var3 == 0) {
                                          break L2;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                  }
                                  L32: {
                                    L33: {
                                      if (-20 != (wn.field_C ^ -1)) {
                                        break L33;
                                      } else {
                                        if (ue.field_d.a(true, "brinegoblin", "streamed")) {
                                          break L32;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                    L34: {
                                      L35: {
                                        if (20 != wn.field_C) {
                                          break L35;
                                        } else {
                                          if (ue.field_d.a(true, "ent", "streamed")) {
                                            break L34;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                      L36: {
                                        L37: {
                                          if (wn.field_C != 21) {
                                            break L37;
                                          } else {
                                            if (ue.field_d.a(true, "elf", "streamed")) {
                                              break L36;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                        L38: {
                                          L39: {
                                            if (-23 != (wn.field_C ^ -1)) {
                                              break L39;
                                            } else {
                                              if (ue.field_d.a(true, "monkey", "streamed")) {
                                                break L38;
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                          L40: {
                                            L41: {
                                              if (wn.field_C != 23) {
                                                break L41;
                                              } else {
                                                if (ue.field_d.a(true, "darkknight", "streamed")) {
                                                  break L40;
                                                } else {
                                                  break L41;
                                                }
                                              }
                                            }
                                            L42: {
                                              if ((wn.field_C ^ -1) != -25) {
                                                break L42;
                                              } else {
                                                if (!ue.field_d.a(true, "wraith", "streamed")) {
                                                  break L42;
                                                } else {
                                                  pm.field_d = pk.a("streamed", 0, "wraith", ue.field_d);
                                                  wn.field_C = wn.field_C + 1;
                                                  if (var3 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              }
                                            }
                                            L43: {
                                              L44: {
                                                if (-26 != (wn.field_C ^ -1)) {
                                                  break L44;
                                                } else {
                                                  if (ue.field_d.a(true, "swarm", "streamed")) {
                                                    break L43;
                                                  } else {
                                                    break L44;
                                                  }
                                                }
                                              }
                                              L45: {
                                                L46: {
                                                  if (26 != wn.field_C) {
                                                    break L46;
                                                  } else {
                                                    if (ue.field_d.a(true, "pixies", "streamed")) {
                                                      break L45;
                                                    } else {
                                                      break L46;
                                                    }
                                                  }
                                                }
                                                L47: {
                                                  if (27 != wn.field_C) {
                                                    break L47;
                                                  } else {
                                                    if (!ue.field_d.a(true, "paladin", "streamed")) {
                                                      break L47;
                                                    } else {
                                                      qj.field_d = pk.a("streamed", 0, "paladin", ue.field_d);
                                                      wn.field_C = wn.field_C + 1;
                                                      if (var3 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L47;
                                                      }
                                                    }
                                                  }
                                                }
                                                L48: {
                                                  L49: {
                                                    if (wn.field_C != 28) {
                                                      break L49;
                                                    } else {
                                                      if (ue.field_d.a(true, "pegasus", "streamed")) {
                                                        break L48;
                                                      } else {
                                                        break L49;
                                                      }
                                                    }
                                                  }
                                                  L50: {
                                                    if (29 != wn.field_C) {
                                                      break L50;
                                                    } else {
                                                      if (!ue.field_d.a(true, "phoenix", "streamed")) {
                                                        break L50;
                                                      } else {
                                                        gi.field_m = pk.a("streamed", param0 + -15433, "phoenix", ue.field_d);
                                                        wn.field_C = wn.field_C + 1;
                                                        if (var3 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L50;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L51: {
                                                    L52: {
                                                      if (-31 != (wn.field_C ^ -1)) {
                                                        break L52;
                                                      } else {
                                                        if (ue.field_d.a(true, "watertroll", "streamed")) {
                                                          break L51;
                                                        } else {
                                                          break L52;
                                                        }
                                                      }
                                                    }
                                                    L53: {
                                                      if (wn.field_C != 31) {
                                                        break L53;
                                                      } else {
                                                        if (!ue.field_d.a(true, "freshwatertroll", "streamed")) {
                                                          break L53;
                                                        } else {
                                                          c.field_a = pk.a("streamed", 0, "freshwatertroll", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L53;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L54: {
                                                      if (-33 != (wn.field_C ^ -1)) {
                                                        break L54;
                                                      } else {
                                                        if (!ue.field_d.a(true, "hardwatertroll", "streamed")) {
                                                          break L54;
                                                        } else {
                                                          vm.field_g = pk.a("streamed", 0, "hardwatertroll", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L54;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L55: {
                                                      L56: {
                                                        if (wn.field_C != 33) {
                                                          break L56;
                                                        } else {
                                                          if (ue.field_d.a(true, "waterlord", "streamed")) {
                                                            break L55;
                                                          } else {
                                                            break L56;
                                                          }
                                                        }
                                                      }
                                                      L57: {
                                                        L58: {
                                                          if ((wn.field_C ^ -1) != -35) {
                                                            break L58;
                                                          } else {
                                                            if (ue.field_d.a(true, "flameshield", "streamed")) {
                                                              break L57;
                                                            } else {
                                                              break L58;
                                                            }
                                                          }
                                                        }
                                                        L59: {
                                                          L60: {
                                                            if (wn.field_C != 35) {
                                                              break L60;
                                                            } else {
                                                              if (ue.field_d.a(true, "clockworkexplosion", "streamed")) {
                                                                break L59;
                                                              } else {
                                                                break L60;
                                                              }
                                                            }
                                                          }
                                                          L61: {
                                                            if (wn.field_C != 36) {
                                                              break L61;
                                                            } else {
                                                              if (!ue.field_d.a(true, "clockworkpuff", "streamed")) {
                                                                break L61;
                                                              } else {
                                                                wh.field_k = pk.a("streamed", param0 ^ 15433, "clockworkpuff", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L61;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L62: {
                                                            if ((wn.field_C ^ -1) != -38) {
                                                              break L62;
                                                            } else {
                                                              if (!ue.field_d.a(true, "windshield", "streamed")) {
                                                                break L62;
                                                              } else {
                                                                pk.field_a = pk.a("streamed", 0, "windshield", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L62;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L63: {
                                                            if ((wn.field_C ^ -1) != -39) {
                                                              break L63;
                                                            } else {
                                                              if (!ue.field_d.a(true, "stormshield", "streamed")) {
                                                                break L63;
                                                              } else {
                                                                i.field_a = pk.a("streamed", 0, "stormshield", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L63;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L64: {
                                                            if ((wn.field_C ^ -1) != -40) {
                                                              break L64;
                                                            } else {
                                                              if (!ue.field_d.a(true, "flamewall", "streamed")) {
                                                                break L64;
                                                              } else {
                                                                cj.field_f = pk.a("streamed", param0 + -15433, "flamewall", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L64;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L65: {
                                                            if (40 != wn.field_C) {
                                                              break L65;
                                                            } else {
                                                              if (!ue.field_d.a(true, "stonepuff", "streamed")) {
                                                                break L65;
                                                              } else {
                                                                nm.field_c = pk.a("streamed", 0, "stonepuff", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L65;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L66: {
                                                            L67: {
                                                              if (41 != wn.field_C) {
                                                                break L67;
                                                              } else {
                                                                if (ue.field_d.a(true, "frostpuff", "streamed")) {
                                                                  break L66;
                                                                } else {
                                                                  break L67;
                                                                }
                                                              }
                                                            }
                                                            L68: {
                                                              L69: {
                                                                if (wn.field_C != 42) {
                                                                  break L69;
                                                                } else {
                                                                  if (ue.field_d.a(true, "underexplosion", "streamed")) {
                                                                    break L68;
                                                                  } else {
                                                                    break L69;
                                                                  }
                                                                }
                                                              }
                                                              L70: {
                                                                if (43 != wn.field_C) {
                                                                  break L70;
                                                                } else {
                                                                  if (!ue.field_d.a(true, "skullexplosion", "streamed")) {
                                                                    break L70;
                                                                  } else {
                                                                    o.field_E = pk.a("streamed", 0, "skullexplosion", ue.field_d);
                                                                    wn.field_C = wn.field_C + 1;
                                                                    if (var3 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L70;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              L71: {
                                                                if (-45 != (wn.field_C ^ -1)) {
                                                                  break L71;
                                                                } else {
                                                                  if (!ue.field_d.a(true, "thornexplosion", "streamed")) {
                                                                    break L71;
                                                                  } else {
                                                                    si.field_p = pk.a("streamed", 0, "thornexplosion", ue.field_d);
                                                                    wn.field_C = wn.field_C + 1;
                                                                    if (var3 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L71;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              L72: {
                                                                L73: {
                                                                  if (wn.field_C != 45) {
                                                                    break L73;
                                                                  } else {
                                                                    if (ue.field_d.a(true, "vineexplosion", "streamed")) {
                                                                      break L72;
                                                                    } else {
                                                                      break L73;
                                                                    }
                                                                  }
                                                                }
                                                                L74: {
                                                                  if ((wn.field_C ^ -1) != -47) {
                                                                    break L74;
                                                                  } else {
                                                                    if (!ue.field_d.a(true, "vinepuff", "streamed")) {
                                                                      break L74;
                                                                    } else {
                                                                      vl.field_i = pk.a("streamed", param0 ^ 15433, "vinepuff", ue.field_d);
                                                                      wn.field_C = wn.field_C + 1;
                                                                      if (var3 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L74;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                L75: {
                                                                  L76: {
                                                                    if (47 != wn.field_C) {
                                                                      break L76;
                                                                    } else {
                                                                      if (ue.field_d.a(true, "waterexplosion", "streamed")) {
                                                                        break L75;
                                                                      } else {
                                                                        break L76;
                                                                      }
                                                                    }
                                                                  }
                                                                  L77: {
                                                                    if (48 != wn.field_C) {
                                                                      break L77;
                                                                    } else {
                                                                      if (!ue.field_d.a(true, "brineexplosion", "streamed")) {
                                                                        break L77;
                                                                      } else {
                                                                        ea.field_H = pk.a("streamed", 0, "brineexplosion", ue.field_d);
                                                                        wn.field_C = wn.field_C + 1;
                                                                        if (var3 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L77;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  L78: {
                                                                    if (49 != wn.field_C) {
                                                                      break L78;
                                                                    } else {
                                                                      if (!ue.field_d.a(true, "stoneexplosion", "streamed")) {
                                                                        break L78;
                                                                      } else {
                                                                        ie.field_Tb = pk.a("streamed", 0, "stoneexplosion", ue.field_d);
                                                                        wn.field_C = wn.field_C + 1;
                                                                        if (var3 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L78;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  L79: {
                                                                    L80: {
                                                                      if ((wn.field_C ^ -1) != -51) {
                                                                        break L80;
                                                                      } else {
                                                                        if (ue.field_d.a(true, "frostexplosion", "streamed")) {
                                                                          break L79;
                                                                        } else {
                                                                          break L80;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (wn.field_C != 51) {
                                                                      break L2;
                                                                    } else {
                                                                      if (ue.field_d.a(true, "watersplash", "streamed")) {
                                                                        ob.field_db = pk.a("streamed", 0, "watersplash", ue.field_d);
                                                                        pi.field_e = vi.field_Q;
                                                                        wn.field_C = wn.field_C + 1;
                                                                        if (var3 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L79;
                                                                        }
                                                                      } else {
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                  lf.field_e = pk.a("streamed", 0, "frostexplosion", ue.field_d);
                                                                  wn.field_C = wn.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L75;
                                                                  }
                                                                }
                                                                mb.field_cb = pk.a("streamed", param0 + -15433, "waterexplosion", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L72;
                                                                }
                                                              }
                                                              rf.field_j = pk.a("streamed", param0 + -15433, "vineexplosion", ue.field_d);
                                                              wn.field_C = wn.field_C + 1;
                                                              if (var3 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L68;
                                                              }
                                                            }
                                                            jg.field_l = pk.a("streamed", 0, "underexplosion", ue.field_d);
                                                            wn.field_C = wn.field_C + 1;
                                                            if (var3 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L66;
                                                            }
                                                          }
                                                          kl.field_G = pk.a("streamed", 0, "frostpuff", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L59;
                                                          }
                                                        }
                                                        je.field_a = pk.a("streamed", 0, "clockworkexplosion", ue.field_d);
                                                        wn.field_C = wn.field_C + 1;
                                                        if (var3 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L57;
                                                        }
                                                      }
                                                      cn.field_S = pk.a("streamed", param0 ^ 15433, "flameshield", ue.field_d);
                                                      wn.field_C = wn.field_C + 1;
                                                      if (var3 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L55;
                                                      }
                                                    }
                                                    nj.field_k = pk.a("streamed", param0 + -15433, "waterlord", ue.field_d);
                                                    wn.field_C = wn.field_C + 1;
                                                    if (var3 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L51;
                                                    }
                                                  }
                                                  g.field_f = pk.a("streamed", param0 ^ 15433, "watertroll", ue.field_d);
                                                  wn.field_C = wn.field_C + 1;
                                                  if (var3 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L48;
                                                  }
                                                }
                                                ra.field_c = pk.a("streamed", 0, "pegasus", ue.field_d);
                                                wn.field_C = wn.field_C + 1;
                                                if (var3 == 0) {
                                                  break L2;
                                                } else {
                                                  break L45;
                                                }
                                              }
                                              oe.field_d = pk.a("streamed", 0, "pixies", ue.field_d);
                                              wn.field_C = wn.field_C + 1;
                                              if (var3 == 0) {
                                                break L2;
                                              } else {
                                                break L43;
                                              }
                                            }
                                            wl.field_U = pk.a("streamed", 0, "swarm", ue.field_d);
                                            wn.field_C = wn.field_C + 1;
                                            if (var3 == 0) {
                                              break L2;
                                            } else {
                                              break L40;
                                            }
                                          }
                                          ra.field_j = pk.a("streamed", param0 + -15433, "darkknight", ue.field_d);
                                          wn.field_C = wn.field_C + 1;
                                          if (var3 == 0) {
                                            break L2;
                                          } else {
                                            break L38;
                                          }
                                        }
                                        e.field_I = pk.a("streamed", 0, "monkey", ue.field_d);
                                        wn.field_C = wn.field_C + 1;
                                        if (var3 == 0) {
                                          break L2;
                                        } else {
                                          break L36;
                                        }
                                      }
                                      jk.field_n = pk.a("streamed", 0, "elf", ue.field_d);
                                      wn.field_C = wn.field_C + 1;
                                      if (var3 == 0) {
                                        break L2;
                                      } else {
                                        break L34;
                                      }
                                    }
                                    vk.field_w = pk.a("streamed", 0, "ent", ue.field_d);
                                    wn.field_C = wn.field_C + 1;
                                    if (var3 == 0) {
                                      break L2;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  ml.field_v = pk.a("streamed", 0, "brinegoblin", ue.field_d);
                                  wn.field_C = wn.field_C + 1;
                                  if (var3 == 0) {
                                    break L2;
                                  } else {
                                    break L29;
                                  }
                                }
                                ff.field_b = pk.a("streamed", 0, "zombiedragon", ue.field_d);
                                wn.field_C = wn.field_C + 1;
                                if (var3 == 0) {
                                  break L2;
                                } else {
                                  break L26;
                                }
                              }
                              bk.field_L = pk.a("streamed", param0 ^ 15433, "frostdragon", ue.field_d);
                              wn.field_C = wn.field_C + 1;
                              if (var3 == 0) {
                                break L2;
                              } else {
                                break L24;
                              }
                            }
                            rc.field_d = pk.a("streamed", 0, "flamedragon", ue.field_d);
                            wn.field_C = wn.field_C + 1;
                            if (var3 == 0) {
                              break L2;
                            } else {
                              break L22;
                            }
                          }
                          i.field_g = pk.a("streamed", param0 ^ 15433, "golem", ue.field_d);
                          wn.field_C = wn.field_C + 1;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L20;
                          }
                        }
                        fe.field_h = pk.a("streamed", 0, "clockworkrecallsoldier", ue.field_d);
                        wn.field_C = wn.field_C + 1;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L18;
                        }
                      }
                      dh.field_Jb = pk.a("streamed", 0, "dwarf", ue.field_d);
                      wn.field_C = wn.field_C + 1;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L15;
                      }
                    }
                    bj.field_ob = pk.a("streamed", 0, "sylph", ue.field_d);
                    wn.field_C = wn.field_C + 1;
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L11;
                    }
                  }
                  fd.field_j = pk.a("streamed", 0, "stormpuff", ue.field_d);
                  wn.field_C = wn.field_C + 1;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L7;
                  }
                }
                pa.field_a = pk.a("streamed", 0, "smokeexplosion", ue.field_d);
                wn.field_C = wn.field_C + 1;
                if (var3 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              fb.field_a = pk.a("streamed", 0, "imp", ue.field_d);
              wn.field_C = wn.field_C + 1;
              break L2;
            }
            return;
          } else {
            if ((be.field_f ^ -1) > -57) {
              if (ck.field_b.c(-10923)) {
                if (!wh.field_l.c(-10923)) {
                  return;
                } else {
                  L81: {
                    if (null == ck.field_b) {
                      break L81;
                    } else {
                      if (be.field_f < 18) {
                        L82: {
                          if ((be.field_f ^ -1) != -1) {
                            break L82;
                          } else {
                            L83: {
                              if (!ck.field_b.a("spell_select", -24417)) {
                                break L83;
                              } else {
                                if (!wh.field_l.a("spell_select", -24417)) {
                                  break L83;
                                } else {
                                  break L82;
                                }
                              }
                            }
                            return;
                          }
                        }
                        L84: {
                          L85: {
                            pi.field_e = vi.field_Q;
                            if (0 == be.field_f) {
                              break L85;
                            } else {
                              L86: {
                                if (1 == be.field_f) {
                                  break L86;
                                } else {
                                  L87: {
                                    if ((be.field_f ^ -1) == -3) {
                                      break L87;
                                    } else {
                                      L88: {
                                        if ((be.field_f ^ -1) == -4) {
                                          break L88;
                                        } else {
                                          L89: {
                                            if (-5 != (be.field_f ^ -1)) {
                                              break L89;
                                            } else {
                                              be.field_f = 5;
                                              this.a(92, th.field_g[5], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_overlight").c(), to.field_r, false, cf.field_h);
                                              if (var3 == 0) {
                                                break L84;
                                              } else {
                                                break L89;
                                              }
                                            }
                                          }
                                          L90: {
                                            if (be.field_f == 5) {
                                              break L90;
                                            } else {
                                              L91: {
                                                if (-7 != (be.field_f ^ -1)) {
                                                  break L91;
                                                } else {
                                                  be.field_f = 7;
                                                  this.a(255, th.field_g[7], pl.a(wh.field_l, "spell_select", "arcanists_select_spell_sea").a(), to.field_r, false, cf.field_h);
                                                  if (var3 == 0) {
                                                    break L84;
                                                  } else {
                                                    break L91;
                                                  }
                                                }
                                              }
                                              L92: {
                                                if (be.field_f != 7) {
                                                  break L92;
                                                } else {
                                                  be.field_f = 8;
                                                  this.a(255, th.field_g[6], pl.a(wh.field_l, "spell_select", "arcanists_select_spell_nature").a(), to.field_r, false, cf.field_h);
                                                  if (var3 == 0) {
                                                    break L84;
                                                  } else {
                                                    break L92;
                                                  }
                                                }
                                              }
                                              L93: {
                                                if (-9 == (be.field_f ^ -1)) {
                                                  break L93;
                                                } else {
                                                  L94: {
                                                    if (9 == be.field_f) {
                                                      break L94;
                                                    } else {
                                                      L95: {
                                                        if (be.field_f == 10) {
                                                          break L95;
                                                        } else {
                                                          L96: {
                                                            if (11 != be.field_f) {
                                                              break L96;
                                                            } else {
                                                              be.field_f = 12;
                                                              this.a(89, qo.field_a[2], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_storm").c(), to.field_r, false, cf.field_h);
                                                              if (var3 == 0) {
                                                                break L84;
                                                              } else {
                                                                break L96;
                                                              }
                                                            }
                                                          }
                                                          L97: {
                                                            if ((be.field_f ^ -1) == -13) {
                                                              break L97;
                                                            } else {
                                                              L98: {
                                                                if (be.field_f == 13) {
                                                                  break L98;
                                                                } else {
                                                                  L99: {
                                                                    if ((be.field_f ^ -1) != -15) {
                                                                      break L99;
                                                                    } else {
                                                                      be.field_f = 15;
                                                                      this.a(59, qo.field_a[4], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_underdark").c(), to.field_r, false, cf.field_h);
                                                                      if (var3 == 0) {
                                                                        break L84;
                                                                      } else {
                                                                        break L99;
                                                                      }
                                                                    }
                                                                  }
                                                                  L100: {
                                                                    if (-16 == (be.field_f ^ -1)) {
                                                                      break L100;
                                                                    } else {
                                                                      L101: {
                                                                        if (-17 != (be.field_f ^ -1)) {
                                                                          break L101;
                                                                        } else {
                                                                          be.field_f = 17;
                                                                          this.a(255, qo.field_a[6], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_nature").a(), to.field_r, false, cf.field_h);
                                                                          if (var3 == 0) {
                                                                            break L84;
                                                                          } else {
                                                                            break L101;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (be.field_f == 17) {
                                                                        be.field_f = 18;
                                                                        this.a(255, qo.field_a[8], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_cog").a(), to.field_r, false, cf.field_h);
                                                                        if (var3 == 0) {
                                                                          break L84;
                                                                        } else {
                                                                          break L100;
                                                                        }
                                                                      } else {
                                                                        break L84;
                                                                      }
                                                                    }
                                                                  }
                                                                  be.field_f = 16;
                                                                  this.a(255, qo.field_a[7], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_sea").a(), to.field_r, false, cf.field_h);
                                                                  if (var3 == 0) {
                                                                    break L84;
                                                                  } else {
                                                                    break L98;
                                                                  }
                                                                }
                                                              }
                                                              be.field_f = 14;
                                                              this.a(95, qo.field_a[5], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_overlight").c(), to.field_r, false, cf.field_h);
                                                              if (var3 == 0) {
                                                                break L84;
                                                              } else {
                                                                break L97;
                                                              }
                                                            }
                                                          }
                                                          be.field_f = 13;
                                                          this.a(103, qo.field_a[1], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_rock").a(), to.field_r, false, cf.field_h);
                                                          if (var3 == 0) {
                                                            break L84;
                                                          } else {
                                                            break L95;
                                                          }
                                                        }
                                                      }
                                                      be.field_f = 11;
                                                      this.a(98, qo.field_a[3], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_frost").c(), to.field_r, false, cf.field_h);
                                                      if (var3 == 0) {
                                                        break L84;
                                                      } else {
                                                        break L94;
                                                      }
                                                    }
                                                  }
                                                  be.field_f = 10;
                                                  this.a(87, qo.field_a[0], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_flame").c(), to.field_r, false, cf.field_h);
                                                  if (var3 == 0) {
                                                    break L84;
                                                  } else {
                                                    break L93;
                                                  }
                                                }
                                              }
                                              be.field_f = 9;
                                              this.a(255, th.field_g[8], pl.a(wh.field_l, "spell_select", "arcanists_select_spell_cog").a(), to.field_r, false, cf.field_h);
                                              if (var3 == 0) {
                                                break L84;
                                              } else {
                                                break L90;
                                              }
                                            }
                                          }
                                          be.field_f = 6;
                                          this.a(75, th.field_g[4], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_underdark").c(), to.field_r, false, cf.field_h);
                                          if (var3 == 0) {
                                            break L84;
                                          } else {
                                            break L88;
                                          }
                                        }
                                      }
                                      be.field_f = 4;
                                      this.a(105, th.field_g[1], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_rock").c(), to.field_r, false, cf.field_h);
                                      if (var3 == 0) {
                                        break L84;
                                      } else {
                                        break L87;
                                      }
                                    }
                                  }
                                  be.field_f = 3;
                                  this.a(125, th.field_g[2], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_storm").c(), to.field_r, false, cf.field_h);
                                  if (var3 == 0) {
                                    break L84;
                                  } else {
                                    break L86;
                                  }
                                }
                              }
                              be.field_f = 2;
                              this.a(182, th.field_g[3], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_frost").c(), to.field_r, false, cf.field_h);
                              if (var3 == 0) {
                                break L84;
                              } else {
                                break L85;
                              }
                            }
                          }
                          be.field_f = 1;
                          this.a(54, th.field_g[0], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_flame").c(), to.field_r, false, cf.field_h);
                          break L84;
                        }
                        return;
                      } else {
                        if ((be.field_f ^ -1) > -45) {
                          L102: {
                            if (18 != be.field_f) {
                              break L102;
                            } else {
                              L103: {
                                if (!ck.field_b.a("spell_impact", -24417)) {
                                  break L103;
                                } else {
                                  if (!wh.field_l.a("spell_impact", param0 + -39850)) {
                                    break L103;
                                  } else {
                                    break L102;
                                  }
                                }
                              }
                              return;
                            }
                          }
                          L104: {
                            L105: {
                              pi.field_e = ee.field_a;
                              if ((be.field_f ^ -1) == -19) {
                                break L105;
                              } else {
                                L106: {
                                  if ((be.field_f ^ -1) != -20) {
                                    break L106;
                                  } else {
                                    be.field_f = 20;
                                    this.a(148, nn.field_n[0][1], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_flame_impact_2").a(), to.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      break L104;
                                    } else {
                                      break L106;
                                    }
                                  }
                                }
                                L107: {
                                  if (be.field_f != 20) {
                                    break L107;
                                  } else {
                                    be.field_f = 21;
                                    this.a(55, nn.field_n[0][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_flame_impact_3").a(), to.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      break L104;
                                    } else {
                                      break L107;
                                    }
                                  }
                                }
                                L108: {
                                  if (be.field_f == 21) {
                                    break L108;
                                  } else {
                                    L109: {
                                      if (be.field_f == 22) {
                                        break L109;
                                      } else {
                                        L110: {
                                          if ((be.field_f ^ -1) != -24) {
                                            break L110;
                                          } else {
                                            be.field_f = 24;
                                            this.a(232, nn.field_n[3][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_frost_impact_3").a(), to.field_r, false, cf.field_h);
                                            if (var3 == 0) {
                                              break L104;
                                            } else {
                                              break L110;
                                            }
                                          }
                                        }
                                        L111: {
                                          if (be.field_f == 24) {
                                            break L111;
                                          } else {
                                            L112: {
                                              if (be.field_f == 25) {
                                                break L112;
                                              } else {
                                                L113: {
                                                  if (be.field_f != 26) {
                                                    break L113;
                                                  } else {
                                                    be.field_f = 27;
                                                    this.a(166, nn.field_n[2][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_3").a(), to.field_r, false, cf.field_h);
                                                    if (var3 == 0) {
                                                      break L104;
                                                    } else {
                                                      break L113;
                                                    }
                                                  }
                                                }
                                                L114: {
                                                  if ((be.field_f ^ -1) != -28) {
                                                    break L114;
                                                  } else {
                                                    be.field_f = 28;
                                                    this.a(67, nn.field_n[1][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_1").a(), to.field_r, false, cf.field_h);
                                                    if (var3 == 0) {
                                                      break L104;
                                                    } else {
                                                      break L114;
                                                    }
                                                  }
                                                }
                                                L115: {
                                                  if ((be.field_f ^ -1) != -29) {
                                                    break L115;
                                                  } else {
                                                    be.field_f = 29;
                                                    this.a(83, nn.field_n[1][1], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_2").a(), to.field_r, false, cf.field_h);
                                                    if (var3 == 0) {
                                                      break L104;
                                                    } else {
                                                      break L115;
                                                    }
                                                  }
                                                }
                                                L116: {
                                                  if (29 != be.field_f) {
                                                    break L116;
                                                  } else {
                                                    be.field_f = 30;
                                                    this.a(85, nn.field_n[1][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_3").a(), to.field_r, false, cf.field_h);
                                                    if (var3 == 0) {
                                                      break L104;
                                                    } else {
                                                      break L116;
                                                    }
                                                  }
                                                }
                                                L117: {
                                                  if (30 == be.field_f) {
                                                    break L117;
                                                  } else {
                                                    L118: {
                                                      if (be.field_f == 31) {
                                                        break L118;
                                                      } else {
                                                        L119: {
                                                          if (be.field_f != 32) {
                                                            break L119;
                                                          } else {
                                                            be.field_f = 33;
                                                            this.a(136, nn.field_n[5][2], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_3").c(), to.field_r, false, cf.field_h);
                                                            if (var3 == 0) {
                                                              break L104;
                                                            } else {
                                                              break L119;
                                                            }
                                                          }
                                                        }
                                                        L120: {
                                                          if (-34 != (be.field_f ^ -1)) {
                                                            break L120;
                                                          } else {
                                                            be.field_f = 34;
                                                            this.a(59, nn.field_n[4][0], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_1").c(), to.field_r, false, cf.field_h);
                                                            if (var3 == 0) {
                                                              break L104;
                                                            } else {
                                                              break L120;
                                                            }
                                                          }
                                                        }
                                                        L121: {
                                                          if (-35 == (be.field_f ^ -1)) {
                                                            break L121;
                                                          } else {
                                                            L122: {
                                                              if (-36 == (be.field_f ^ -1)) {
                                                                break L122;
                                                              } else {
                                                                L123: {
                                                                  if (-37 != (be.field_f ^ -1)) {
                                                                    break L123;
                                                                  } else {
                                                                    be.field_f = 37;
                                                                    this.a(255, nn.field_n[7][2], pl.a(wh.field_l, "spell_impact", "arcanists_clam_impact_individual").a(), to.field_r, false, cf.field_h);
                                                                    if (var3 == 0) {
                                                                      break L104;
                                                                    } else {
                                                                      break L123;
                                                                    }
                                                                  }
                                                                }
                                                                L124: {
                                                                  if (be.field_f == 37) {
                                                                    break L124;
                                                                  } else {
                                                                    L125: {
                                                                      if (-39 == (be.field_f ^ -1)) {
                                                                        break L125;
                                                                      } else {
                                                                        L126: {
                                                                          if (be.field_f == 39) {
                                                                            break L126;
                                                                          } else {
                                                                            L127: {
                                                                              if (40 != be.field_f) {
                                                                                break L127;
                                                                              } else {
                                                                                be.field_f = 41;
                                                                                this.a(255, nn.field_n[6][1], pl.a(wh.field_l, "spell_impact", "arcanists_impact_nature_vinebomb").a(), to.field_r, false, cf.field_h);
                                                                                if (var3 == 0) {
                                                                                  break L104;
                                                                                } else {
                                                                                  break L127;
                                                                                }
                                                                              }
                                                                            }
                                                                            L128: {
                                                                              if (-42 != (be.field_f ^ -1)) {
                                                                                break L128;
                                                                              } else {
                                                                                be.field_f = 42;
                                                                                this.a(255, nn.field_n[6][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_nature_impact_flurry_of_arrows").a(), to.field_r, false, cf.field_h);
                                                                                if (var3 == 0) {
                                                                                  break L104;
                                                                                } else {
                                                                                  break L128;
                                                                                }
                                                                              }
                                                                            }
                                                                            L129: {
                                                                              if (be.field_f == 42) {
                                                                                break L129;
                                                                              } else {
                                                                                if ((be.field_f ^ -1) != -44) {
                                                                                  break L104;
                                                                                } else {
                                                                                  be.field_f = 44;
                                                                                  this.a(255, nn.field_n[8][0], pl.a(wh.field_l, "spell_impact", "arcanists_cog_calling_bell_hit").a(), to.field_r, false, cf.field_h);
                                                                                  if (var3 == 0) {
                                                                                    break L104;
                                                                                  } else {
                                                                                    break L129;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            be.field_f = 43;
                                                                            this.a(255, nn.field_n[8][2], pl.a(wh.field_l, "spell_impact", "arcanists_cog_calling_bell_does_nothing").a(), to.field_r, false, cf.field_h);
                                                                            if (var3 == 0) {
                                                                              break L104;
                                                                            } else {
                                                                              break L126;
                                                                            }
                                                                          }
                                                                        }
                                                                        be.field_f = 40;
                                                                        this.a(255, nn.field_n[6][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_nature_impact_thornball").a(), to.field_r, false, cf.field_h);
                                                                        if (var3 == 0) {
                                                                          break L104;
                                                                        } else {
                                                                          break L125;
                                                                        }
                                                                      }
                                                                    }
                                                                    be.field_f = 39;
                                                                    this.a(255, nn.field_n[7][0], pl.a(wh.field_l, "spell_impact", "arcanists_brine_bomb_explode").a(), to.field_r, false, cf.field_h);
                                                                    if (var3 == 0) {
                                                                      break L104;
                                                                    } else {
                                                                      break L124;
                                                                    }
                                                                  }
                                                                }
                                                                be.field_f = 38;
                                                                this.a(255, nn.field_n[7][1], pl.a(wh.field_l, "spell_impact", "arcanists_waterball_pop").a(), to.field_r, false, cf.field_h);
                                                                if (var3 == 0) {
                                                                  break L104;
                                                                } else {
                                                                  break L122;
                                                                }
                                                              }
                                                            }
                                                            be.field_f = 36;
                                                            this.a(104, nn.field_n[4][2], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_3").c(), to.field_r, false, cf.field_h);
                                                            if (var3 == 0) {
                                                              break L104;
                                                            } else {
                                                              break L121;
                                                            }
                                                          }
                                                        }
                                                        be.field_f = 35;
                                                        this.a(136, nn.field_n[4][1], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_2").c(), to.field_r, false, cf.field_h);
                                                        if (var3 == 0) {
                                                          break L104;
                                                        } else {
                                                          break L118;
                                                        }
                                                      }
                                                    }
                                                    be.field_f = 32;
                                                    this.a(65, nn.field_n[5][1], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_2").c(), to.field_r, false, cf.field_h);
                                                    if (var3 == 0) {
                                                      break L104;
                                                    } else {
                                                      break L117;
                                                    }
                                                  }
                                                }
                                                be.field_f = 31;
                                                this.a(80, nn.field_n[5][0], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_1").c(), to.field_r, false, cf.field_h);
                                                if (var3 == 0) {
                                                  break L104;
                                                } else {
                                                  break L112;
                                                }
                                              }
                                            }
                                            be.field_f = 26;
                                            this.a(90, nn.field_n[2][1], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_2").a(), to.field_r, false, cf.field_h);
                                            if (var3 == 0) {
                                              break L104;
                                            } else {
                                              break L111;
                                            }
                                          }
                                        }
                                        be.field_f = 25;
                                        this.a(107, nn.field_n[2][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_1").a(), to.field_r, false, cf.field_h);
                                        if (var3 == 0) {
                                          break L104;
                                        } else {
                                          break L109;
                                        }
                                      }
                                    }
                                    be.field_f = 23;
                                    this.a(130, nn.field_n[3][1], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_frost_impact_2").c(), to.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      break L104;
                                    } else {
                                      break L108;
                                    }
                                  }
                                }
                                be.field_f = 22;
                                this.a(76, nn.field_n[3][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_frost_impact_1").a(), to.field_r, false, cf.field_h);
                                if (var3 == 0) {
                                  break L104;
                                } else {
                                  break L105;
                                }
                              }
                            }
                            be.field_f = 19;
                            this.a(61, nn.field_n[0][0], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_flame_impact_1").c(), to.field_r, false, cf.field_h);
                            break L104;
                          }
                          return;
                        } else {
                          L130: {
                            if (44 != be.field_f) {
                              break L130;
                            } else {
                              if (!ck.field_b.a("spell_charge", -24417)) {
                                break L130;
                              } else {
                                if (wh.field_l.a("spell_charge", param0 ^ -25386)) {
                                  be.field_f = 45;
                                  pi.field_e = vm.field_f;
                                  this.a(98, wh.field_i[0], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_flame").c(), to.field_r, false, cf.field_h);
                                  this.a(148, ah.field_f[0], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_flame").c(), to.field_r, false, cf.field_h);
                                  this.a(115, wh.field_i[3], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_frost").c(), to.field_r, false, cf.field_h);
                                  this.a(172, ah.field_f[3], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_frost").c(), to.field_r, false, cf.field_h);
                                  this.a(111, wh.field_i[2], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_storm").c(), to.field_r, false, cf.field_h);
                                  this.a(128, ah.field_f[2], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_storm").c(), to.field_r, false, cf.field_h);
                                  this.a(73, wh.field_i[1], pl.a(wh.field_l, "spell_charge", "arcanists_chargeup_rock").a(), to.field_r, false, cf.field_h);
                                  this.a(131, ah.field_f[1], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_rock").c(), to.field_r, false, cf.field_h);
                                  this.a(101, wh.field_i[5], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_overlight").c(), to.field_r, false, cf.field_h);
                                  this.a(161, ah.field_f[5], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_overlight").c(), to.field_r, false, cf.field_h);
                                  this.a(118, wh.field_i[4], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_underdark").c(), to.field_r, false, cf.field_h);
                                  this.a(118, ah.field_f[4], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_underdark").c(), to.field_r, false, cf.field_h);
                                  this.a(255, wh.field_i[7], pl.a(wh.field_l, "spell_charge", "arcanists_chargeup_sea").a(), to.field_r, false, cf.field_h);
                                  this.a(255, ah.field_f[7], pl.a(wh.field_l, "spell_charge", "arcanists_discharge_sea").a(), to.field_r, false, cf.field_h);
                                  this.a(255, wh.field_i[8], pl.a(wh.field_l, "spell_charge", "arcanists_chargeup_cog").a(), to.field_r, false, cf.field_h);
                                  this.a(255, ah.field_f[8], pl.a(wh.field_l, "spell_charge", "arcanists_discharge_cog").a(), to.field_r, false, cf.field_h);
                                  cf.field_h[wh.field_i[6]] = cf.field_h[qo.field_a[6]];
                                  to.field_r[wh.field_i[6]] = to.field_r[qo.field_a[6]];
                                  cf.field_h[ah.field_f[6]] = cf.field_h[qo.field_a[6]];
                                  to.field_r[ah.field_f[6]] = to.field_r[qo.field_a[6]];
                                  return;
                                } else {
                                  break L130;
                                }
                              }
                            }
                          }
                          L131: {
                            if ((be.field_f ^ -1) != -46) {
                              break L131;
                            } else {
                              if (!ck.field_b.a("spell_cast_universal", -24417)) {
                                break L131;
                              } else {
                                if (wh.field_l.a("spell_cast_universal", -24417)) {
                                  pi.field_e = go.field_h;
                                  be.field_f = 46;
                                  this.a(120, 64, ai.a(ck.field_b, "spell_cast_universal", "arcanists_cast_01_arcane_arrow").c(), to.field_r, false, cf.field_h);
                                  this.a(110, 72, ai.a(ck.field_b, "spell_cast_universal", "arcanists_cast_06_arcane_glyph").c(), to.field_r, false, cf.field_h);
                                  this.a(119, 66, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_02_arcane_tower").a(), to.field_r, false, cf.field_h);
                                  this.a(141, 68, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_03_arcane_gate").a(), to.field_r, false, cf.field_h);
                                  this.a(111, 74, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_05_arcane_flash").a(), to.field_r, false, cf.field_h);
                                  this.a(111, 69, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_bomb").a(), to.field_r, false, cf.field_h);
                                  this.a(111, 65, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_portal").a(), to.field_r, false, cf.field_h);
                                  this.a(111, 71, ai.a(ck.field_b, "spell_cast_universal", "arcanists_imp_destruction").c(), to.field_r, false, cf.field_h);
                                  this.a(111, 67, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_armour").a(), to.field_r, false, cf.field_h);
                                  this.a(111, 73, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_sigil").a(), to.field_r, false, cf.field_h);
                                  return;
                                } else {
                                  break L131;
                                }
                              }
                            }
                          }
                          L132: {
                            if (46 != be.field_f) {
                              break L132;
                            } else {
                              if (!ck.field_b.a("spell_cast_flame", -24417)) {
                                break L132;
                              } else {
                                if (!wh.field_l.a("spell_cast_flame", -24417)) {
                                  break L132;
                                } else {
                                  pi.field_e = ba.field_b;
                                  be.field_f = 47;
                                  this.a(73, 76, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_07_fire_ball").c(), to.field_r, false, cf.field_h);
                                  this.a(118, 77, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_08_fire_arrow").c(), to.field_r, false, cf.field_h);
                                  this.a(129, 78, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_09_lava_bomb").c(), to.field_r, false, cf.field_h);
                                  this.a(113, 79, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_10_magma_bomb").c(), to.field_r, false, cf.field_h);
                                  this.a(104, 80, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_11_flame_shield").a(), to.field_r, false, cf.field_h);
                                  this.a(120, 81, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_12_flame_wall").a(), to.field_r, false, cf.field_h);
                                  this.a(107, 82, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_13_napalm").a(), to.field_r, false, cf.field_h);
                                  this.a(96, 83, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_14_napalm_bomb").c(), to.field_r, false, cf.field_h);
                                  this.a(75, 84, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_15_rain_of_fire").c(), to.field_r, false, cf.field_h);
                                  this.a(117, 85, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_16_fire_of_arrows").c(), to.field_r, false, cf.field_h);
                                  this.a(122, 86, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_17_volcano").a(), to.field_r, false, cf.field_h);
                                  this.a(117, 87, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_18_flame_dragon").c(), to.field_r, false, cf.field_h);
                                  return;
                                }
                              }
                            }
                          }
                          L133: {
                            if (be.field_f != 47) {
                              break L133;
                            } else {
                              if (ck.field_b.a("spell_cast_frost", -24417)) {
                                pi.field_e = wh.field_j;
                                be.field_f = 48;
                                this.a(63, 112, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_43_ice_ball").c(), to.field_r, false, cf.field_h);
                                this.a(94, 113, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_44_ice_bomb").c(), to.field_r, false, cf.field_h);
                                this.a(102, 114, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_45_shards").c(), to.field_r, false, cf.field_h);
                                this.a(111, 115, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_46_frost_arrow").c(), to.field_r, false, cf.field_h);
                                this.a(117, 116, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_47_snow_ball").c(), to.field_r, false, cf.field_h);
                                this.a(95, 117, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_48_blizzard").c(), to.field_r, false, cf.field_h);
                                this.a(128, 118, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_49_ice_shield").c(), to.field_r, false, cf.field_h);
                                this.a(100, 119, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_50_ice_castle").c(), to.field_r, false, cf.field_h);
                                this.a(89, 120, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_51_sylph").c(), to.field_r, false, cf.field_h);
                                this.a(108, 121, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_52_frost_giant").c(), to.field_r, false, cf.field_h);
                                this.a(177, 122, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_53_comet").c(), to.field_r, false, cf.field_h);
                                this.a(184, 123, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_54_frost_dragon").c(), to.field_r, false, cf.field_h);
                                return;
                              } else {
                                break L133;
                              }
                            }
                          }
                          L134: {
                            if ((be.field_f ^ -1) != -49) {
                              break L134;
                            } else {
                              if (!ck.field_b.a("spell_cast_rock", -24417)) {
                                break L134;
                              } else {
                                if (wh.field_l.a("spell_cast_rock", -24417)) {
                                  pi.field_e = fe.field_m;
                                  be.field_f = 49;
                                  this.a(134, 88, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_19_pebble_shot").a(), to.field_r, false, cf.field_h);
                                  this.a(58, 89, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_20_scatter_rock").a(), to.field_r, false, cf.field_h);
                                  this.a(110, 90, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_21_quake").a(), to.field_r, false, cf.field_h);
                                  this.a(196, 91, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_22_disruption").c(), to.field_r, false, cf.field_h);
                                  this.a(151, 92, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_23_mud_bomb").a(), to.field_r, false, cf.field_h);
                                  this.a(110, 93, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_24_mega_boulder").c(), to.field_r, false, cf.field_h);
                                  this.a(85, 94, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_25_rock_slab").a(), to.field_r, false, cf.field_h);
                                  this.a(116, 95, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_26_fortress").a(), to.field_r, false, cf.field_h);
                                  this.a(120, 96, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_27_dwarves").c(), to.field_r, false, cf.field_h);
                                  this.a(125, 97, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_28_rock_golem").c(), to.field_r, false, cf.field_h);
                                  this.a(104, 98, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_29_meteor").a(), to.field_r, false, cf.field_h);
                                  this.a(65, 99, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_30_fissure").a(), to.field_r, false, cf.field_h);
                                  return;
                                } else {
                                  break L134;
                                }
                              }
                            }
                          }
                          L135: {
                            if (49 != be.field_f) {
                              break L135;
                            } else {
                              if (!ck.field_b.a("spell_cast_storm", -24417)) {
                                break L135;
                              } else {
                                if (wh.field_l.a("spell_cast_storm", -24417)) {
                                  pi.field_e = ld.field_j;
                                  be.field_f = 50;
                                  this.a(107, 100, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_31_thunder_shock").c(), to.field_r, false, cf.field_h);
                                  this.a(136, 101, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_32_chain_lightning").c(), to.field_r, false, cf.field_h);
                                  this.a(256, 102, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_33_wind_shield").c(), to.field_r, false, cf.field_h);
                                  this.a(129, 103, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_34_hurricane").a(), to.field_r, false, cf.field_h);
                                  this.a(103, 104, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_35_shock_bomb").c(), to.field_r, false, cf.field_h);
                                  this.a(161, 105, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_36_storm_shield").c(), to.field_r, false, cf.field_h);
                                  this.a(127, 106, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_37_cyclops").c(), to.field_r, false, cf.field_h);
                                  this.a(123, 107, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_38_conductor_rod").c(), to.field_r, false, cf.field_h);
                                  this.a(92, 108, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_39_thrust").a(), to.field_r, false, cf.field_h);
                                  this.a(108, 109, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_40_flight").a(), to.field_r, false, cf.field_h);
                                  this.a(139, 110, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_41_storm").a(), to.field_r, false, cf.field_h);
                                  this.a(184, 111, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_42_storm_dragon").c(), to.field_r, false, cf.field_h);
                                  return;
                                } else {
                                  break L135;
                                }
                              }
                            }
                          }
                          L136: {
                            if ((be.field_f ^ -1) != -51) {
                              break L136;
                            } else {
                              if (!ck.field_b.a("spell_cast_overlight", param0 + -39850)) {
                                break L136;
                              } else {
                                if (wh.field_l.a("spell_cast_overlight", -24417)) {
                                  be.field_f = 51;
                                  pi.field_e = fl.field_c;
                                  this.a(123, 145, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_67_castle_of_light").c(), to.field_r, false, cf.field_h);
                                  this.a(110, 137, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_68_sky_ray").c(), to.field_r, false, cf.field_h);
                                  this.a(139, 138, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_69_shining_bolt").c(), to.field_r, false, cf.field_h);
                                  this.a(107, 139, pl.a(wh.field_l, "spell_cast_overlight", "arcanists_cast_70_rising_star").a(), to.field_r, false, cf.field_h);
                                  this.a(109, 140, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_71_pegasus").c(), to.field_r, false, cf.field_h);
                                  this.a(131, 141, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_72_paladin").c(), to.field_r, false, cf.field_h);
                                  this.a(140, 142, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_73_forest_seed").c(), to.field_r, false, cf.field_h);
                                  this.a(113, 143, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_74_pixies").c(), to.field_r, false, cf.field_h);
                                  this.a(125, 144, pl.a(wh.field_l, "spell_cast_overlight", "arcanists_cast_75_sphere_of_healing").a(), to.field_r, false, cf.field_h);
                                  this.a(87, 136, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_76_protection_shield").c(), to.field_r, false, cf.field_h);
                                  this.a(123, 146, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_77_invulnerability_shield").c(), to.field_r, false, cf.field_h);
                                  this.a(128, 147, pl.a(wh.field_l, "spell_cast_overlight", "arcanists_cast_78_shining_power").a(), to.field_r, false, cf.field_h);
                                  return;
                                } else {
                                  break L136;
                                }
                              }
                            }
                          }
                          L137: {
                            if (-52 != (be.field_f ^ -1)) {
                              break L137;
                            } else {
                              if (!ck.field_b.a("spell_cast_underdark", -24417)) {
                                break L137;
                              } else {
                                pi.field_e = mn.field_v;
                                be.field_f = 52;
                                this.a(156, 124, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_55_den_of_darkness").c(), to.field_r, false, cf.field_h);
                                this.a(154, 125, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_56_rain_of_chaos").c(), to.field_r, false, cf.field_h);
                                this.a(256, 126, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_57_drain_bolt").c(), to.field_r, false, cf.field_h);
                                this.a(177, 127, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_58_death_bomb").c(), to.field_r, false, cf.field_h);
                                this.a(145, 128, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_59_swarm").c(), to.field_r, false, cf.field_h);
                                this.a(136, 129, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_60_dark_knight").c(), to.field_r, false, cf.field_h);
                                this.a(142, 130, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_61_raise_dead").c(), to.field_r, false, cf.field_h);
                                this.a(135, 131, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_62_wraith_minion").c(), to.field_r, false, cf.field_h);
                                this.a(104, 132, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_63_aura_of_decay").c(), to.field_r, false, cf.field_h);
                                this.a(122, 133, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_64_dark_defences").c(), to.field_r, false, cf.field_h);
                                this.a(160, 134, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_65_swallowing_pit").c(), to.field_r, false, cf.field_h);
                                this.a(159, 135, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_66_lichdom").c(), to.field_r, false, cf.field_h);
                                return;
                              }
                            }
                          }
                          L138: {
                            if (52 != be.field_f) {
                              break L138;
                            } else {
                              if (!wh.field_l.a("spell_cast_ocean", -24417)) {
                                break L138;
                              } else {
                                be.field_f = 53;
                                pi.field_e = lo.field_s;
                                this.a(255, 160, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_waterball").a(), to.field_r, false, cf.field_h);
                                this.a(255, 161, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_maelstrom").a(), to.field_r, false, cf.field_h);
                                this.a(256, 162, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_summon_minions").a(), to.field_r, false, cf.field_h);
                                this.a(255, 164, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_deluge").a(), to.field_r, false, cf.field_h);
                                this.a(255, 165, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_english_summer").a(), to.field_r, false, cf.field_h);
                                this.a(255, 166, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_brine_bolt_individual").a(), to.field_r, false, cf.field_h);
                                this.a(255, 167, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_brine_bomb").a(), to.field_r, false, cf.field_h);
                                this.a(255, 169, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_rain_of_clams").a(), to.field_r, false, cf.field_h);
                                this.a(255, 170, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_tsunami").a(), to.field_r, false, cf.field_h);
                                return;
                              }
                            }
                          }
                          L139: {
                            if (-54 != (be.field_f ^ -1)) {
                              break L139;
                            } else {
                              if (wh.field_l.a("spell_cast_nature", -24417)) {
                                pi.field_e = tl.field_g;
                                be.field_f = 54;
                                this.a(255, 148, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_79_thornball").a(), to.field_r, false, cf.field_h);
                                this.a(255, 149, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_80_thornbomb").a(), to.field_r, false, cf.field_h);
                                this.a(255, 150, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_whip").a(), to.field_r, false, cf.field_h);
                                this.a(255, 151, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_vinebridge2").a(), to.field_r, false, cf.field_h);
                                this.a(255, 152, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_vinebomb").a(), to.field_r, false, cf.field_h);
                                this.a(255, 153, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_entangle").a(), to.field_r, false, cf.field_h);
                                this.a(255, 155, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_86_sanctuary").a(), to.field_r, false, cf.field_h);
                                this.a(255, 157, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_88_flurry_of_arrows").a(), to.field_r, false, cf.field_h);
                                this.a(255, 158, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_natureswrath").a(), to.field_r, false, cf.field_h);
                                this.a(255, 159, pl.a(wh.field_l, "spell_cast_nature", "arcanists_impact_nature_vinebloom_build").a(), to.field_r, false, cf.field_h);
                                return;
                              } else {
                                break L139;
                              }
                            }
                          }
                          L140: {
                            if (54 != be.field_f) {
                              break L140;
                            } else {
                              if (!ck.field_b.a("spell_cast_cogs", -24417)) {
                                break L140;
                              } else {
                                if (!wh.field_l.a("spell_cast_cogs", -24417)) {
                                  break L140;
                                } else {
                                  be.field_f = 55;
                                  pi.field_e = ma.field_I;
                                  this.a(255, 172, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_static_ball_shield_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 173, cf.field_h[172], to.field_r, false, cf.field_h);
                                  this.a(255, 174, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_mech_arrow_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 175, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_fall_cast").a(), to.field_r, false, cf.field_h);
                                  this.a(255, 176, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_recall_device_cast").a(), to.field_r, false, cf.field_h);
                                  this.a(255, 177, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_calling_bell_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 178, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_clock_tower_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 179, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_cuckoo_clock_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 180, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_blast_from_past_cast").a(), to.field_r, false, cf.field_h);
                                  this.a(255, 181, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_clockwork_bomb_loop_cast").a(), to.field_r, false, cf.field_h);
                                  this.a(255, 182, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_steam_dragon_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 183, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_redo_cast").c(), to.field_r, false, cf.field_h);
                                  cf.field_h[218] = cf.field_h[nn.field_n[8][0]];
                                  to.field_r[218] = to.field_r[nn.field_n[8][0]];
                                  return;
                                }
                              }
                            }
                          }
                          if (-56 == (be.field_f ^ -1)) {
                            L141: {
                              pi.field_e = md.field_d;
                              if (!ck.field_b.a(117)) {
                                break L141;
                              } else {
                                if (!wh.field_l.a(113)) {
                                  break L141;
                                } else {
                                  be.field_f = 56;
                                  this.a(255, 154, ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_summon").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 156, ai.a(ck.field_b, "elves", "arcanists_elf_summon").c(), to.field_r, false, cf.field_h);
                                  this.a(125, 70, ai.a(ck.field_b, "footmen", "arcanists_imp_for_the_arcanist").c(), to.field_r, false, cf.field_h);
                                  this.a(159, 171, ai.a(ck.field_b, "default", "arcanists_water_lord_summon").c(), to.field_r, false, cf.field_h);
                                  this.a(104, 168, ai.a(ck.field_b, "default", "arcanists_brine_goblin_summon").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 163, pl.a(wh.field_l, "spell_impact", "arcanists_hydration_impact").a(), to.field_r, false, cf.field_h);
                                  this.a(255, 220, ai.a(ck.field_b, "trajectile", "natural_trajectile_loop").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 226, ai.a(ck.field_b, "trajectile", "unnatural_trajectile_loop").c(), to.field_r, false, cf.field_h);
                                  this.a(64, 227, ai.a(ck.field_b, "trajectile", "bounce").c(), to.field_r, false, cf.field_h);
                                  this.a(198, 221, pl.a(wh.field_l, "other_buttons", "arcanists_menu_transition").a(), to.field_r, false, cf.field_h);
                                  this.a(256, 222, pl.a(wh.field_l, "other_buttons", "arcanists_units_click_on_map").a(), to.field_r, false, cf.field_h);
                                  this.a(256, 223, ai.a(ck.field_b, "other_buttons", "arcanists_units_drag_unit").c(), to.field_r, false, cf.field_h);
                                  this.a(256, 224, pl.a(wh.field_l, "other_buttons", "arcanists_units_select_next_unit").a(), to.field_r, false, cf.field_h);
                                  this.a(256, 225, ai.a(ck.field_b, "other_buttons", "arcanists_units_zoom_in").c(), to.field_r, false, cf.field_h);
                                  this.a(256, 48, pl.a(wh.field_l, "player", "arcanists_pl_01_footsteps").a(), tm.field_a, false, uk.field_g);
                                  this.a(171, 49, pl.a(wh.field_l, "player", "arcanists_pl_02_jump_fowards").a(), tm.field_a, false, uk.field_g);
                                  this.a(173, 50, pl.a(wh.field_l, "player", "arcanists_pl_03_jump_upwards").a(), tm.field_a, false, uk.field_g);
                                  this.a(255, 51, pl.a(wh.field_l, "player", "arcanists_pl_04_landing").a(), tm.field_a, false, uk.field_g);
                                  this.a(158, 52, ai.a(ck.field_b, "player", "arcanists_pl_05_damage").c(), tm.field_a, false, uk.field_g);
                                  this.a(153, 53, ai.a(ck.field_b, "player", "arcanists_pl_06_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(155, 54, pl.a(wh.field_l, "player", "arcanists_pl_07_splash").a(), tm.field_a, false, uk.field_g);
                                  this.a(190, dm.field_G[0], ai.a(ck.field_b, "cyclops", "arcanists_cyclops_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(191, dm.field_G[2], ai.a(ck.field_b, "cyclops", "arcanists_cyclops_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(178, dm.field_G[1], ai.a(ck.field_b, "cyclops", "arcanists_cyclops_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(165, hi.field_f[0], ai.a(ck.field_b, "dark_knight", "arcanists_dark_knight_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(203, hi.field_f[2], ai.a(ck.field_b, "dark_knight", "arcanists_dark_knight_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(152, hi.field_f[1], ai.a(ck.field_b, "dark_knight", "arcanists_dark_knight_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(149, 194, pl.a(wh.field_l, "dark_knight", "arcanists_dark_knight_charge_attack").a(), to.field_r, false, cf.field_h);
                                  this.a(151, fb.field_b[0], ai.a(ck.field_b, "dwarf", "arcanists_dwarf_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(142, fb.field_b[2], ai.a(ck.field_b, "dwarf", "arcanists_dwarf_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(153, fb.field_b[1], ai.a(ck.field_b, "dwarf", "arcanists_dwarf_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(173, 188, pl.a(wh.field_l, "dwarf", "arcanists_dwarf_mining").a(), to.field_r, false, cf.field_h);
                                  this.a(103, 189, ai.a(ck.field_b, "dwarf", "arcanists_dwarf_self_destruct").c(), to.field_r, false, cf.field_h);
                                  this.a(118, ed.field_Ib[0], ai.a(ck.field_b, "paladin", "arcanists_paladin_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(79, ed.field_Ib[2], ai.a(ck.field_b, "paladin", "arcanists_paladin_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(84, ed.field_Ib[1], ai.a(ck.field_b, "paladin", "arcanists_paladin_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(91, 202, pl.a(wh.field_l, "paladin", "arcanists_paladin_smash").a(), to.field_r, false, cf.field_h);
                                  this.a(147, tc.field_B[0], ai.a(ck.field_b, "rock_golem", "arcanists_rock_golem_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(128, tc.field_B[2], ai.a(ck.field_b, "rock_golem", "arcanists_rock_golem_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(148, tc.field_B[1], ai.a(ck.field_b, "rock_golem", "arcanists_rock_golem_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(125, in.field_Fb[0], ai.a(ck.field_b, "slyph", "arcanists_slyph_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(159, in.field_Fb[2], ai.a(ck.field_b, "slyph", "arcanists_slyph_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(181, in.field_Fb[1], ai.a(ck.field_b, "slyph", "arcanists_slyph_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(161, 185, ai.a(ck.field_b, "slyph", "arcanists_slyph_arrow_attack").c(), to.field_r, false, cf.field_h);
                                  this.a(138, s.field_i[0], ai.a(ck.field_b, "wraith", "arcanists_wraith_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(178, s.field_i[2], ai.a(ck.field_b, "wraith", "arcanists_wraith_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(166, s.field_i[1], ai.a(ck.field_b, "wraith", "arcanists_wraith_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(255, 219, ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_attack").c(), to.field_r, false, cf.field_h);
                                  this.a(79, lj.field_g[0], ai.a(ck.field_b, "footmen", "arcanists_imp_yes_master").c(), tm.field_a, false, uk.field_g);
                                  uk.field_g[lj.field_g[2]] = null;
                                  this.a(115, 184, ai.a(ck.field_b, "footmen", "arcanists_imp_im_gonna_go_boom").c(), to.field_r, false, cf.field_h);
                                  this.a(167, mb.field_U[0], ai.a(ck.field_b, "frost_giant", "arcanists_frost_giant_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(149, mb.field_U[2], ai.a(ck.field_b, "frost_giant", "arcanists_frost_giant_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(167, mb.field_U[1], ai.a(ck.field_b, "frost_giant", "arcanists_frost_giant_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(109, 187, pl.a(wh.field_l, "frost_giant", "arcanists_frost_giant_smash_attack").a(), to.field_r, false, cf.field_h);
                                  cf.field_h[197] = cf.field_h[102];
                                  to.field_r[198] = to.field_r[105];
                                  to.field_r[197] = to.field_r[102];
                                  cf.field_h[198] = cf.field_h[105];
                                  to.field_r[103] = to.field_r[103];
                                  to.field_r[199] = to.field_r[136];
                                  cf.field_h[199] = cf.field_h[136];
                                  to.field_r[201] = to.field_r[187];
                                  cf.field_h[201] = cf.field_h[187];
                                  cf.field_h[103] = cf.field_h[103];
                                  this.a(176, lj.field_n[0], ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(182, lj.field_n[2], ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(202, lj.field_n[1], ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(154, 193, ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_breath").c(), to.field_r, false, cf.field_h);
                                  this.a(190, gd.field_pb[0], ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(256, gd.field_pb[2], ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(148, gd.field_pb[1], ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(167, 192, ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_breath").c(), to.field_r, false, cf.field_h);
                                  this.a(181, fi.field_c[0], ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(108, fi.field_c[2], ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(172, fi.field_c[1], ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(167, 191, ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_breath").c(), to.field_r, false, cf.field_h);
                                  this.a(158, cj.field_a[0], ai.a(ck.field_b, "pegasus", "arcanists_pegasus_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(229, cj.field_a[2], ai.a(ck.field_b, "pegasus", "arcanists_pegasus_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(183, cj.field_a[1], ai.a(ck.field_b, "pegasus", "arcanists_pegasus_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(256, vg.field_c[0], ai.a(ck.field_b, "swarm", "arcanists_swarm_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(256, vg.field_c[2], ai.a(ck.field_b, "swarm", "arcanists_swarm_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(256, vg.field_c[1], ai.a(ck.field_b, "swarm", "arcanists_swarm_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(256, uj.field_c[0], ai.a(ck.field_b, "cyclops", "arcanists_storm_spirit_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, gg.field_j[0], ai.a(ck.field_b, "pixie", "arcanists_pixie_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(83, gg.field_j[2], ai.a(ck.field_b, "pixie", "arcanists_pixie_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, gg.field_j[1], ai.a(ck.field_b, "pixie", "arcanists_pixie_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(235, 196, ai.a(ck.field_b, "pixie", "arcanists_pixie_fairyring").c(), to.field_r, false, cf.field_h);
                                  this.a(85, cf.field_a[0], ai.a(ck.field_b, "default", "arcanists_brine_goblin_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(83, cf.field_a[2], pl.a(wh.field_l, "default", "arcanists_brine_goblin_hit").a(), tm.field_a, false, uk.field_g);
                                  this.a(85, cf.field_a[1], pl.a(wh.field_l, "default", "arcanists_brine_goblin_death").a(), tm.field_a, false, uk.field_g);
                                  this.a(85, fk.field_h[0], ai.a(ck.field_b, "elves", "arcanists_elf_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(83, fk.field_h[2], ai.a(ck.field_b, "elves", "arcanists_elf_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, fk.field_h[1], ai.a(ck.field_b, "elves", "arcanists_elf_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, jn.field_a[0], ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(83, jn.field_a[2], ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, jn.field_a[1], ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, cd.field_p[0], ai.a(ck.field_b, "default", "arcanists_water_troll_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(83, cd.field_p[2], pl.a(wh.field_l, "default", "arcanists_sea_watertroll_hit").a(), tm.field_a, false, uk.field_g);
                                  this.a(85, cd.field_p[1], pl.a(wh.field_l, "default", "arcanists_sea_watertroll_death").a(), tm.field_a, false, uk.field_g);
                                  this.a(85, fd.field_h[0], pl.a(wh.field_l, "spell_cast_ocean", "arcanists_summon_sea_minion").a(), tm.field_a, false, uk.field_g);
                                  this.a(83, fd.field_h[2], pl.a(wh.field_l, "default", "arcanists_water_lord_hit").a(), tm.field_a, false, uk.field_g);
                                  this.a(85, fd.field_h[1], pl.a(wh.field_l, "default", "arcanists_water_lord_death").a(), tm.field_a, false, uk.field_g);
                                  this.a(255, om.field_B[0], cf.field_h[176], tm.field_a, false, uk.field_g);
                                  this.a(255, om.field_B[2], cf.field_h[176], tm.field_a, false, uk.field_g);
                                  this.a(255, om.field_B[1], cf.field_h[176], tm.field_a, false, uk.field_g);
                                  this.a(255, u.field_h[0], ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(255, u.field_h[2], ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(255, u.field_h[1], ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_death").c(), tm.field_a, false, uk.field_g);
                                  ck.field_b = null;
                                  wh.field_l = null;
                                  return;
                                }
                              }
                            }
                            return;
                          } else {
                            break L81;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              if (jo.field_c < 19) {
                L142: {
                  L143: {
                    if (jh.field_c[4] != null) {
                      break L143;
                    } else {
                      if (!tc.field_x.a(true, "arcanists_grassland", "")) {
                        break L143;
                      } else {
                        jh.field_c[4] = ha.a(tc.field_x, "", "arcanists_grassland");
                        jo.field_c = 2;
                        if (var3 == 0) {
                          break L142;
                        } else {
                          break L143;
                        }
                      }
                    }
                  }
                  L144: {
                    if (-3 != (jo.field_c ^ -1)) {
                      break L144;
                    } else {
                      boolean discarded$11 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[4], -105);
                      jo.field_c = 3;
                      if (var3 == 0) {
                        break L142;
                      } else {
                        break L144;
                      }
                    }
                  }
                  L145: {
                    if (null != jh.field_c[1]) {
                      break L145;
                    } else {
                      if (!tc.field_x.a(true, "arcanists_giant_mountains", "")) {
                        break L145;
                      } else {
                        jh.field_c[1] = ha.a(tc.field_x, "", "arcanists_giant_mountains");
                        jo.field_c = 4;
                        if (var3 == 0) {
                          break L142;
                        } else {
                          break L145;
                        }
                      }
                    }
                  }
                  L146: {
                    if (jo.field_c == 4) {
                      break L146;
                    } else {
                      L147: {
                        if (null != jh.field_c[2]) {
                          break L147;
                        } else {
                          if (!tc.field_x.a(true, "arcanists_elven", "")) {
                            break L147;
                          } else {
                            jh.field_c[2] = ha.a(tc.field_x, "", "arcanists_elven");
                            jo.field_c = 6;
                            if (var3 == 0) {
                              break L142;
                            } else {
                              break L147;
                            }
                          }
                        }
                      }
                      L148: {
                        if (jo.field_c == 6) {
                          break L148;
                        } else {
                          L149: {
                            L150: {
                              if (jh.field_c[3] != null) {
                                break L150;
                              } else {
                                if (tc.field_x.a(true, "arcanists_goblin_caves", "")) {
                                  break L149;
                                } else {
                                  break L150;
                                }
                              }
                            }
                            L151: {
                              if ((jo.field_c ^ -1) == -9) {
                                break L151;
                              } else {
                                L152: {
                                  L153: {
                                    if (null != jh.field_c[5]) {
                                      break L153;
                                    } else {
                                      if (tc.field_x.a(true, "arcanists_swamp", "")) {
                                        break L152;
                                      } else {
                                        break L153;
                                      }
                                    }
                                  }
                                  L154: {
                                    if (jo.field_c == 10) {
                                      break L154;
                                    } else {
                                      L155: {
                                        L156: {
                                          if (null != jh.field_c[6]) {
                                            break L156;
                                          } else {
                                            if (tc.field_x.a(true, "arcanists_graveyard", "")) {
                                              break L155;
                                            } else {
                                              break L156;
                                            }
                                          }
                                        }
                                        L157: {
                                          if (jo.field_c != 12) {
                                            break L157;
                                          } else {
                                            jo.field_c = 13;
                                            boolean discarded$12 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[6], param0 ^ -15414);
                                            if (var3 == 0) {
                                              break L142;
                                            } else {
                                              break L157;
                                            }
                                          }
                                        }
                                        L158: {
                                          L159: {
                                            if (jh.field_c[7] != null) {
                                              break L159;
                                            } else {
                                              if (tc.field_x.a(true, "arcanists_skycastles", "")) {
                                                break L158;
                                              } else {
                                                break L159;
                                              }
                                            }
                                          }
                                          L160: {
                                            if (-15 == (jo.field_c ^ -1)) {
                                              break L160;
                                            } else {
                                              L161: {
                                                L162: {
                                                  if (null != jh.field_c[8]) {
                                                    break L162;
                                                  } else {
                                                    if (tc.field_x.a(true, "arcanists_beach_cove", "")) {
                                                      break L161;
                                                    } else {
                                                      break L162;
                                                    }
                                                  }
                                                }
                                                L163: {
                                                  if ((jo.field_c ^ -1) != -17) {
                                                    break L163;
                                                  } else {
                                                    jo.field_c = 17;
                                                    boolean discarded$13 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[8], 50);
                                                    if (var3 == 0) {
                                                      break L142;
                                                    } else {
                                                      break L163;
                                                    }
                                                  }
                                                }
                                                L164: {
                                                  L165: {
                                                    if (null != jh.field_c[9]) {
                                                      break L165;
                                                    } else {
                                                      if (tc.field_x.a(true, "arcanists_arcane_crystal_cavern", "")) {
                                                        break L164;
                                                      } else {
                                                        break L165;
                                                      }
                                                    }
                                                  }
                                                  if (jo.field_c == 18) {
                                                    jo.field_c = 19;
                                                    boolean discarded$14 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[9], param0 + -15554);
                                                    jl.field_h.c(125);
                                                    ki.field_s = null;
                                                    tc.field_x = null;
                                                    lo.field_w = null;
                                                    if (var3 == 0) {
                                                      break L142;
                                                    } else {
                                                      break L164;
                                                    }
                                                  } else {
                                                    break L142;
                                                  }
                                                }
                                                jh.field_c[9] = ha.a(tc.field_x, "", "arcanists_arcane_crystal_cavern");
                                                jo.field_c = 18;
                                                if (var3 == 0) {
                                                  break L142;
                                                } else {
                                                  break L161;
                                                }
                                              }
                                              jh.field_c[8] = ha.a(tc.field_x, "", "arcanists_beach_cove");
                                              jo.field_c = 16;
                                              if (var3 == 0) {
                                                break L142;
                                              } else {
                                                break L160;
                                              }
                                            }
                                          }
                                          jo.field_c = 15;
                                          boolean discarded$15 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[7], -116);
                                          if (var3 == 0) {
                                            break L142;
                                          } else {
                                            break L158;
                                          }
                                        }
                                        jh.field_c[7] = ha.a(tc.field_x, "", "arcanists_skycastles");
                                        jo.field_c = 14;
                                        if (var3 == 0) {
                                          break L142;
                                        } else {
                                          break L155;
                                        }
                                      }
                                      jh.field_c[6] = ha.a(tc.field_x, "", "arcanists_graveyard");
                                      jo.field_c = 12;
                                      if (var3 == 0) {
                                        break L142;
                                      } else {
                                        break L154;
                                      }
                                    }
                                  }
                                  jo.field_c = 11;
                                  boolean discarded$16 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[5], -109);
                                  if (var3 == 0) {
                                    break L142;
                                  } else {
                                    break L152;
                                  }
                                }
                                jh.field_c[5] = ha.a(tc.field_x, "", "arcanists_swamp");
                                jo.field_c = 10;
                                if (var3 == 0) {
                                  break L142;
                                } else {
                                  break L151;
                                }
                              }
                            }
                            jo.field_c = 9;
                            boolean discarded$17 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[3], 52);
                            if (var3 == 0) {
                              break L142;
                            } else {
                              break L149;
                            }
                          }
                          jh.field_c[3] = ha.a(tc.field_x, "", "arcanists_goblin_caves");
                          jo.field_c = 8;
                          if (var3 == 0) {
                            break L142;
                          } else {
                            break L148;
                          }
                        }
                      }
                      jo.field_c = 7;
                      boolean discarded$18 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[2], -115);
                      if (var3 == 0) {
                        break L142;
                      } else {
                        break L146;
                      }
                    }
                  }
                  jo.field_c = 5;
                  boolean discarded$19 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[1], param0 + -15553);
                  break L142;
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Log in / Create account";
        field_F = "Add <%0> to friend list";
    }
}
