/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_a;
    static String field_b;
    static int field_c;

    public static void a(int param0) {
        try {
            int var1_int = 7 % ((79 - param0) / 43);
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "kc.B(" + param0 + 41);
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param0.removeKeyListener((java.awt.event.KeyListener) (Object) je.field_j);
                        if (param1 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        param0.removeFocusListener((java.awt.event.FocusListener) (Object) je.field_j);
                        ii.field_c = -1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) runtimeException;
                        stackOut_5_1 = new StringBuilder().append("kc.D(");
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param0 == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                        stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                        stackOut_6_2 = "{...}";
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                    stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                    stackOut_8_2 = "null";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = Geoblox.field_C;
        sh.a(0, param0, ok.field_b, bd.field_a, (byte) 121, md.field_c, true);
        if (param1 != -98) {
            return;
        }
        try {
            var2_int = 0;
            do {
                // if_icmpge L64
                qi.field_i[param0 + var2_int] = var2_int;
                var2_int++;
                // ifne L86
            } while (var3 == 0);
            sh.a(param0, param0 + param0, qg.field_a, va.field_b, (byte) 112, md.field_c - -param0, false);
            // if_icmplt L97
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "kc.A(" + param0 + 44 + param1 + 41);
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        ja var1_ref = null;
        int var1_int = 0;
        ja var2_ref_ja = null;
        int var2 = 0;
        wd var2_ref = null;
        ja var3 = null;
        wd var3_ref = null;
        float var3_float = 0.0f;
        int var3_int = 0;
        int var4_int = 0;
        float var4_float = 0.0f;
        ja var4 = null;
        double var5 = 0.0;
        ja var5_ref_ja = null;
        int var6_int = 0;
        ja var6 = null;
        int var7_int = 0;
        ja var7 = null;
        ja var7_ref = null;
        ja var8 = null;
        ja var8_ref = null;
        int var9 = 0;
        tf stackIn_4_0 = null;
        tf stackIn_5_0 = null;
        tf stackIn_5_1 = null;
        tf stackIn_20_0 = null;
        tf stackIn_22_0 = null;
        boolean stackIn_25_0 = false;
        ja stackIn_33_0 = null;
        boolean stackIn_35_0 = false;
        ja stackIn_43_0 = null;
        ja stackIn_46_0 = null;
        ja stackIn_46_1 = null;
        ja stackIn_56_0 = null;
        ja stackIn_56_1 = null;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        ja stackIn_71_0 = null;
        ja stackIn_71_1 = null;
        int stackIn_76_0 = 0;
        boolean stackIn_87_0 = false;
        ja stackIn_91_0 = null;
        boolean stackIn_109_0 = false;
        boolean stackIn_123_0 = false;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_129_2 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_130_2 = 0;
        ja stackIn_130_3 = null;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        int stackIn_131_2 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_133_2 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_135_2 = 0;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        int stackIn_136_2 = 0;
        int stackIn_136_3 = 0;
        tf stackIn_151_0 = null;
        gh stackIn_163_0 = null;
        gh stackIn_164_0 = null;
        boolean stackIn_164_1 = false;
        gh stackIn_165_0 = null;
        gh stackIn_167_0 = null;
        gh stackIn_168_0 = null;
        boolean stackIn_168_1 = false;
        gh stackIn_169_0 = null;
        gh stackIn_171_0 = null;
        gh stackIn_173_0 = null;
        gh stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        tf stackOut_3_0 = null;
        tf stackOut_4_0 = null;
        tf stackOut_4_1 = null;
        tf stackOut_19_0 = null;
        tf stackOut_20_0 = null;
        boolean stackOut_24_0 = false;
        ja stackOut_32_0 = null;
        boolean stackOut_34_0 = false;
        ja stackOut_42_0 = null;
        ja stackOut_45_0 = null;
        ja stackOut_45_1 = null;
        ja stackOut_55_0 = null;
        ja stackOut_55_1 = null;
        int stackOut_63_0 = 0;
        int stackOut_67_0 = 0;
        ja stackOut_70_0 = null;
        ja stackOut_70_1 = null;
        int stackOut_75_0 = 0;
        boolean stackOut_86_0 = false;
        ja stackOut_90_0 = null;
        boolean stackOut_108_0 = false;
        boolean stackOut_122_0 = false;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_127_2 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_129_2 = 0;
        ja stackOut_129_3 = null;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_130_2 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_131_2 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        int stackOut_133_3 = 0;
        int stackOut_135_0 = 0;
        int stackOut_135_1 = 0;
        int stackOut_135_2 = 0;
        int stackOut_135_3 = 0;
        tf stackOut_150_0 = null;
        gh stackOut_162_0 = null;
        gh stackOut_163_0 = null;
        boolean stackOut_163_1 = false;
        gh stackOut_164_0 = null;
        gh stackOut_165_0 = null;
        gh stackOut_167_0 = null;
        boolean stackOut_167_1 = false;
        gh stackOut_168_0 = null;
        gh stackOut_169_0 = null;
        gh stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        gh stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        fa.field_a = false;
                        var1_ref = (ja) (Object) ji.field_r.g(0);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1_ref == null) {
                            statePc = 18;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = var1_ref.field_K;
                        stackIn_22_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var9 != 0) {
                            statePc = 22;
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
                        stackOut_4_0 = (tf) (Object) stackIn_4_0;
                        stackOut_4_1 = a.field_d;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 == stackIn_5_1) {
                            statePc = 14;
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
                        if (var1_ref.field_B) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        fa.field_a = true;
                        if (var9 == 0) {
                            statePc = 17;
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
                        var1_ref.j(30383);
                        var1_ref.k(2);
                        var1_ref.a(false);
                        var1_ref.a((byte) 54);
                        a.field_d.a(-80, (hf) (Object) var1_ref);
                        el.field_o.field_F = true;
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
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var1_ref.field_K = null;
                        var1_ref = (ja) (Object) ji.field_r.d(1);
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!re.field_j) {
                            statePc = 82;
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
                        stackOut_19_0 = a.field_d;
                        stackIn_20_0 = stackOut_19_0;
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
                        stackOut_20_0 = (tf) (Object) stackIn_20_0;
                        stackIn_22_0 = stackOut_20_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var1_ref = (ja) (Object) ((tf) (Object) stackIn_22_0).g(0);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var1_ref == null) {
                            statePc = 75;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = pk.field_o[var1_ref.field_H];
                        stackIn_76_0 = stackOut_24_0 ? 1 : 0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var9 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!stackIn_25_0) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var9 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var2_ref = new wd();
                        var3_ref = new wd();
                        var2_ref.a((rc) (Object) var1_ref, false);
                        var4_int = 1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = (ja) (Object) var2_ref.a(true);
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5_ref_ja = stackIn_33_0;
                        if (null == var5_ref_ja) {
                            statePc = 63;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        pk.field_o[var5_ref_ja.field_H] = true;
                        stackOut_34_0 = var5_ref_ja.field_t;
                        stackIn_64_0 = stackOut_34_0 ? 1 : 0;
                        stackIn_35_0 = stackOut_34_0;
                        if (var9 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var4_int = 0;
                        if (var9 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var3_ref.a((rc) (Object) var5_ref_ja, false);
                        var6_int = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var6_int ^ -1) <= (var5_ref_ja.field_L ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var7_ref = var5_ref_ja.field_n[var6_int];
                        stackOut_42_0 = (ja) (Object) var3_ref.c((byte) 121);
                        stackIn_33_0 = stackOut_42_0;
                        stackIn_43_0 = stackOut_42_0;
                        if (var9 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8 = stackIn_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (null == var8) {
                            statePc = 53;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = (ja) var8;
                        stackOut_45_1 = (ja) var7_ref;
                        stackIn_71_0 = stackOut_45_0;
                        stackIn_71_1 = stackOut_45_1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        if (var9 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 != stackIn_46_1) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var9 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var8_ref = (ja) (Object) var3_ref.a(-45);
                        if (var9 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var8_ref = (ja) (Object) var2_ref.c((byte) 121);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (null == var8_ref) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = (ja) var8_ref;
                        stackOut_55_1 = (ja) var7_ref;
                        stackIn_71_0 = stackOut_55_0;
                        stackIn_71_1 = stackOut_55_1;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        if (var9 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 == stackIn_56_1) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var8_ref = (ja) (Object) var2_ref.a(54);
                        if (var9 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var2_ref.a((rc) (Object) var7_ref, false);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var6_int++;
                        if (var9 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var9 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = var4_int;
                        stackIn_64_0 = stackOut_63_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var5_ref_ja = (ja) (Object) var3_ref.a(true);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (null == var5_ref_ja) {
                            statePc = 74;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var5_ref_ja.field_K = ji.field_r;
                        var5_ref_ja.field_t = false;
                        var5_ref_ja.field_B = true;
                        fa.field_a = true;
                        stackOut_67_0 = 0;
                        stackIn_76_0 = stackOut_67_0;
                        stackIn_68_0 = stackOut_67_0;
                        if (var9 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var6_int = stackIn_68_0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if ((var6_int ^ -1) <= (var5_ref_ja.field_L ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = var5_ref_ja.field_n[var6_int];
                        stackOut_70_1 = (ja) var5_ref_ja;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ((ja) (Object) stackIn_71_0).a(stackIn_71_1, 0);
                        var6_int++;
                        if (var9 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var9 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var6 = var5_ref_ja;
                        var7 = var5_ref_ja;
                        var5_ref_ja.field_L = 0;
                        var6.field_N = 0;
                        var7.field_m = 0;
                        var5_ref_ja = (ja) (Object) var3_ref.a(true);
                        if (var9 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var1_ref = (ja) (Object) a.field_d.d(1);
                        if (var9 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        re.field_j = false;
                        el.field_o.field_B = true;
                        stackOut_75_0 = 0;
                        stackIn_76_0 = stackOut_75_0;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var1_int = stackIn_76_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (1000 <= var1_int) {
                            statePc = 82;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        pk.field_o[var1_int] = false;
                        var1_int++;
                        if (var9 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var9 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var1_int = 0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var2_ref_ja = (ja) (Object) a.field_d.g(0);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (null == var2_ref_ja) {
                            statePc = 147;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (null != var2_ref_ja.field_K) {
                            statePc = 96;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = w.field_f;
                        stackIn_87_0 = stackOut_86_0;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (!stackIn_87_0) {
                            statePc = 146;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = (ja) var2_ref_ja;
                        stackIn_91_0 = stackOut_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (stackIn_91_0.field_t) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        re.field_j = true;
                        var2_ref_ja.a(false);
                        var2_ref_ja.a((byte) 100);
                        el.field_o.field_F = true;
                        var2_ref_ja.f(92);
                        if (ji.field_r != var2_ref_ja.field_K) {
                            statePc = 105;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var2_ref_ja.a(-el.field_o.field_J, -117);
                        var3_float = -var2_ref_ja.field_o + 320.0f;
                        var4_float = -var2_ref_ja.field_v + 240.0f;
                        var5 = (double)og.field_r / Math.sqrt((double)(var4_float * var4_float + var3_float * var3_float));
                        var3_float = (float)((double)var3_float * var5);
                        var4_float = (float)((double)var4_float * var5);
                        var2_ref_ja.field_F = var4_float;
                        var2_ref_ja.field_w = var3_float;
                        var7_int = 0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var2_ref_ja.field_L <= var7_int) {
                            statePc = 103;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var2_ref_ja.field_n[var7_int].a(var2_ref_ja, 0);
                        var7_int++;
                        if (var9 != 0) {
                            statePc = 145;
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
                        if (var9 == 0) {
                            statePc = 98;
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
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var7 = var2_ref_ja;
                        var8 = var2_ref_ja;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var2_ref_ja.field_L = 0;
                        var7.field_N = 0;
                        var8.field_m = 0;
                        ji.field_r.a(-36, (hf) (Object) var2_ref_ja);
                        if (var9 == 0) {
                            statePc = 144;
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
                        if (var2_ref_ja.field_K == bh.field_c) {
                            statePc = 114;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = w.field_f;
                        stackIn_109_0 = stackOut_108_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (stackIn_109_0) {
                            statePc = 114;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var3_int = 0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (var3_int >= var2_ref_ja.field_L) {
                            statePc = 120;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var2_ref_ja.field_n[var3_int].a(var2_ref_ja, 0);
                        var2_ref_ja.field_n[var3_int].k(2);
                        var3_int++;
                        if (var9 != 0) {
                            statePc = 145;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var9 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var3_ref = (wd) (Object) var2_ref_ja;
                        var2_ref_ja.field_L = 0;
                        var4 = var2_ref_ja;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        ((ja) (Object) var3_ref).field_N = 0;
                        var4.field_m = 0;
                        var2_ref_ja.field_r = 50;
                        bh.field_c.a(-100, (hf) (Object) var2_ref_ja);
                        var2_ref_ja.field_G = 0;
                        if (!var2_ref_ja.field_t) {
                            statePc = 137;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        stackOut_122_0 = w.field_f;
                        stackIn_123_0 = stackOut_122_0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (!stackIn_123_0) {
                            statePc = 137;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = (int)var2_ref_ja.field_v;
                        stackOut_126_1 = (int)var2_ref_ja.field_o;
                        stackOut_126_2 = 117;
                        stackIn_133_0 = stackOut_126_0;
                        stackIn_133_1 = stackOut_126_1;
                        stackIn_133_2 = stackOut_126_2;
                        stackIn_127_0 = stackOut_126_0;
                        stackIn_127_1 = stackOut_126_1;
                        stackIn_127_2 = stackOut_126_2;
                        if ((var2_ref_ja.field_z ^ -1) == -5) {
                            statePc = 133;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = stackIn_127_0;
                        stackOut_127_1 = stackIn_127_1;
                        stackOut_127_2 = stackIn_127_2;
                        stackIn_129_0 = stackOut_127_0;
                        stackIn_129_1 = stackOut_127_1;
                        stackIn_129_2 = stackOut_127_2;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = stackIn_129_0;
                        stackOut_129_1 = stackIn_129_1;
                        stackOut_129_2 = stackIn_129_2;
                        stackOut_129_3 = (ja) var2_ref_ja;
                        stackIn_130_0 = stackOut_129_0;
                        stackIn_130_1 = stackOut_129_1;
                        stackIn_130_2 = stackOut_129_2;
                        stackIn_130_3 = stackOut_129_3;
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
                        stackOut_130_0 = stackIn_130_0;
                        stackOut_130_1 = stackIn_130_1;
                        stackOut_130_2 = stackIn_130_2;
                        stackIn_135_0 = stackOut_130_0;
                        stackIn_135_1 = stackOut_130_1;
                        stackIn_135_2 = stackOut_130_2;
                        stackIn_131_0 = stackOut_130_0;
                        stackIn_131_1 = stackOut_130_1;
                        stackIn_131_2 = stackOut_130_2;
                        if ((stackIn_130_3.field_z ^ -1) != -4) {
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
                        stackOut_131_0 = stackIn_131_0;
                        stackOut_131_1 = stackIn_131_1;
                        stackOut_131_2 = stackIn_131_2;
                        stackIn_133_0 = stackOut_131_0;
                        stackIn_133_1 = stackOut_131_1;
                        stackIn_133_2 = stackOut_131_2;
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
                        stackOut_133_0 = stackIn_133_0;
                        stackOut_133_1 = stackIn_133_1;
                        stackOut_133_2 = stackIn_133_2;
                        stackOut_133_3 = 100;
                        stackIn_136_0 = stackOut_133_0;
                        stackIn_136_1 = stackOut_133_1;
                        stackIn_136_2 = stackOut_133_2;
                        stackIn_136_3 = stackOut_133_3;
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
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        stackOut_135_0 = stackIn_135_0;
                        stackOut_135_1 = stackIn_135_1;
                        stackOut_135_2 = stackIn_135_2;
                        stackOut_135_3 = 10;
                        stackIn_136_0 = stackOut_135_0;
                        stackIn_136_1 = stackOut_135_1;
                        stackIn_136_2 = stackOut_135_2;
                        stackIn_136_3 = stackOut_135_3;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        ld.a(stackIn_136_0, stackIn_136_1, stackIn_136_2, stackIn_136_3);
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (4 == var2_ref_ja.field_z) {
                            statePc = 141;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 5);
                        if (var9 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 7);
                        var1_int++;
                        rb.field_b = rb.field_b + 1;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var2_ref_ja.field_K = null;
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        el.field_o.field_F = true;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var2_ref_ja = (ja) (Object) a.field_d.d(1);
                        if (var9 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var2 = -23 / ((param0 - 69) / 46);
                        var3 = (ja) (Object) bh.field_c.g(0);
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (var3 == null) {
                            statePc = 158;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (var9 != 0) {
                            statePc = 162;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        stackOut_150_0 = ra.field_a;
                        stackIn_151_0 = stackOut_150_0;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (stackIn_151_0 != var3.field_K) {
                            statePc = 157;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        var3.a(false);
                        var3.a((byte) 51);
                        ra.field_a.a(-44, (hf) (Object) var3);
                        var3.field_K = null;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var3 = (ja) (Object) bh.field_c.d(1);
                        if (var9 == 0) {
                            statePc = 148;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (!w.field_f) {
                            statePc = 162;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        jc.a(3, false);
                        jl.field_t = false;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackOut_162_0 = el.field_o;
                        stackIn_171_0 = stackOut_162_0;
                        stackIn_163_0 = stackOut_162_0;
                        if (el.field_o.field_F) {
                            statePc = 171;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackOut_163_0 = (gh) (Object) stackIn_163_0;
                        stackOut_163_1 = ab.field_f;
                        stackIn_164_0 = stackOut_163_0;
                        stackIn_164_1 = stackOut_163_1;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        stackOut_164_0 = (gh) (Object) stackIn_164_0;
                        stackIn_171_0 = stackOut_164_0;
                        stackIn_165_0 = stackOut_164_0;
                        if (stackIn_164_1) {
                            statePc = 171;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        stackOut_165_0 = (gh) (Object) stackIn_165_0;
                        stackIn_167_0 = stackOut_165_0;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        stackOut_167_0 = (gh) (Object) stackIn_167_0;
                        stackOut_167_1 = w.field_f;
                        stackIn_168_0 = stackOut_167_0;
                        stackIn_168_1 = stackOut_167_1;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        stackOut_168_0 = (gh) (Object) stackIn_168_0;
                        stackIn_173_0 = stackOut_168_0;
                        stackIn_169_0 = stackOut_168_0;
                        if (!stackIn_168_1) {
                            statePc = 173;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        stackOut_169_0 = (gh) (Object) stackIn_169_0;
                        stackIn_171_0 = stackOut_169_0;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        stackOut_171_0 = (gh) (Object) stackIn_171_0;
                        stackOut_171_1 = 1;
                        stackIn_174_0 = stackOut_171_0;
                        stackIn_174_1 = stackOut_171_1;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackOut_173_0 = (gh) (Object) stackIn_173_0;
                        stackOut_173_1 = 0;
                        stackIn_174_0 = stackOut_173_0;
                        stackIn_174_1 = stackOut_173_1;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        stackIn_174_0.field_F = stackIn_174_1 != 0;
                        w.field_f = false;
                        if (-4 >= (var1_int ^ -1)) {
                            statePc = 177;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        ra.a(255 ^ fe.field_f, -88, fe.field_f);
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (rb.field_b >= 5) {
                            statePc = 181;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        ra.a(255 ^ vd.field_p, -83, vd.field_p);
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 183: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var1, "kc.C(" + param0 + 41);
                }
                case 184: {
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
        field_c = 0;
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_a = 0;
    }
}
