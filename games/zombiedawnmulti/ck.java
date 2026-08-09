/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_b;
    static String field_c;
    static int field_a;

    final static void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -23838) {
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
                        field_c = (String) null;
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
                        var5 = new int[rb.field_c.length + 1];
                        var2 = var5;
                        var3 = 0;
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
                        if (rb.field_c.length <= var3) {
                            statePc = 8;
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
                        var5[var3] = rb.field_c[var3];
                        var3++;
                        if (var4 != 0) {
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
                        if (var4 == 0) {
                            statePc = 4;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5[var5.length - 1] = param0;
                        rb.field_c = var5;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "ck.D(" + param0 + ',' + param1 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        int stackIn_12_0 = 0;
        dm stackIn_17_0 = null;
        dm stackIn_18_0 = null;
        dm stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        dm stackIn_96_0 = null;
        dm stackIn_97_0 = null;
        dm stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        boolean stackIn_146_0 = false;
        int stackIn_154_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_145_0;
        int statePc = 0;
        Throwable caughtException = null;
        ga var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        jh var3_ref_jh = null;
        dm var3_ref_dm = null;
        int var4_int = 0;
        jh var4 = null;
        int var5 = 0;
        dm var7 = null;
        dm var8_ref_dm = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ga var13 = null;
        jh var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        dm var18 = null;
        Object var19 = null;
        dm var20 = null;
        dm var21 = null;
        String var22 = null;
        String var23 = null;
        dm var24 = null;
        Object var25 = null;
        jh var25_ref = null;
        Object var26 = null;
        jh var27 = null;
        jh var28 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = null;
                    var25 = null;
                    var26 = null;
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var13 = s.field_e;
                        var1 = var13;
                        var2 = ((k) ((Object) var1)).g(31365);
                        if (param0 == -2061) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_c = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var2 == 0) {
                            statePc = 138;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var2 ^ -1) == -2) {
                            statePc = 138;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-3 == (var2 ^ -1)) {
                            statePc = 138;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (3 == var2) {
                            statePc = 138;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (4 == var2) {
                            statePc = 138;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var2 ^ -1) != -6) {
                            statePc = 20;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3_long = ((k) ((Object) var1)).a((byte) -30);
                        var16 = ((k) ((Object) var1)).f((byte) -76);
                        var15 = ((k) ((Object) var1)).f((byte) -50);
                        var17 = ((k) ((Object) var1)).f((byte) -61);
                        var8_ref_dm = en.a((byte) 50, var3_long);
                        if (var15.equals("")) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = stackIn_12_0;
                        if (var8_ref_dm != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8_ref_dm = new dm(var16, var17, var3_long);
                        hq.field_c.a(param0 + 2060, var8_ref_dm, var3_long);
                        if (var11 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8_ref_dm.a(var16, var17, 43);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8_ref_dm.field_Kb = bl.a((byte) 98) - (long)((k) ((Object) var1)).i(-1478490344);
                        var8_ref_dm.field_Mb = ((k) ((Object) var1)).d((byte) 69);
                        var10 = ((k) ((Object) var1)).a(param0 ^ -2061);
                        stackIn_18_0 = (dm) (var8_ref_dm);
                        stackIn_17_0 = stackIn_18_0;
                        if ((1 & var10) == 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = (dm) ((Object) stackIn_17_0);
                        stackIn_19_1 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = (dm) ((Object) stackIn_18_0);
                        stackIn_19_1 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_19_0.field_Nb = stackIn_19_1 != 0;
                        var8_ref_dm.field_Sb = var10 >> -178928735;
                        var8_ref_dm.field_Yb = ((k) ((Object) var1)).g(31365);
                        var8_ref_dm.field_Vb = ((k) ((Object) var1)).g(param0 + 33426);
                        lf.a(var8_ref_dm, true);
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (6 != var2) {
                            statePc = 31;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3_long = ((k) ((Object) var1)).a((byte) -30);
                        var5 = ((k) ((Object) var1)).g(31365);
                        var18 = en.a((byte) 50, var3_long);
                        if (var18 != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!var18.field_Ob) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        cb.field_i = cb.field_i - 1;
                        var18.field_Ob = false;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0 != var5) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var18.a(true);
                        if (var11 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var18.field_bc = so.field_r;
                        var18.field_Fb = var5;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var18.a(-4564);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (7 == var2) {
                            statePc = 131;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((var2 ^ -1) == -9) {
                            statePc = 128;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-10 == (var2 ^ -1)) {
                            statePc = 119;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var2 ^ -1) == -11) {
                            statePc = 113;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-12 == (var2 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var2 != 12) {
                            statePc = 46;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var3 = ((k) ((Object) var1)).d((byte) 69);
                        var27 = (jh) ((Object) af.field_h.a((long)var3, -22877));
                        if (var27 != null) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (-12 == (var2 ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var27.field_rc = true;
                        if (var11 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var27.field_lc = true;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        mi.a(var27, -126);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var2 == 13) {
                            statePc = 108;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-15 == (var2 ^ -1)) {
                            statePc = 99;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var2 == 16) {
                            statePc = 99;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var2 ^ -1) == -16) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((var2 ^ -1) != -18) {
                            statePc = 65;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3_long = ((k) ((Object) var1)).a((byte) -30);
                        var5 = ((k) ((Object) var1)).g(param0 + 33426);
                        var20 = en.a((byte) 50, var3_long);
                        if (var20 != null) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var2 != 15) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var20.field_Pb = false;
                        if (var11 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var20.field_Ob) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var20.field_Ob = false;
                        cb.field_i = cb.field_i - 1;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var5 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var20.field_bc = so.field_r;
                        var20.field_Fb = var5;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        lf.a(var20, true);
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var2 == 18) {
                            statePc = 92;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (-20 != (var2 ^ -1)) {
                            statePc = 75;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var3_long = ((k) ((Object) var1)).a((byte) -30);
                        var5 = ((k) ((Object) var1)).g(31365);
                        var21 = vm.a(var3_long, (byte) -54);
                        if (var21 == null) {
                            statePc = 74;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (-1 != (var5 ^ -1)) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var21.a(true);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var21.field_Fb = var5;
                        var21.field_bc = so.field_r;
                        if (var11 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var21.a(true);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var21.a(param0 ^ 6623);
                        mh.field_c.field_cc = mh.field_c.field_cc - 1;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (-21 == (var2 ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (-22 == (var2 ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (22 != var2) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        bc.field_e = ((k) ((Object) var1)).d((byte) 69);
                        dm.field_Zb = ((k) ((Object) var1)).a(param0 + 2061);
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var2 != 23) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        ie.field_sb = ((k) ((Object) var1)).a((byte) -30);
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        bd.a("L1: " + ci.a(0), (Throwable) null, false);
                        ak.a((byte) -125);
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var3 = ((k) ((Object) var1)).d((byte) 69);
                        if (-1 != (var3 ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        qi.field_c = 0L;
                        if (var11 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        qi.field_c = bl.a((byte) 97) - -(long)var3;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        dl.a(mh.field_c, false, var1, false);
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var3_long = ((k) ((Object) var1)).a((byte) -30);
                        var22 = ((k) ((Object) var1)).f((byte) -27);
                        var23 = ((k) ((Object) var1)).f((byte) -125);
                        var7 = vm.a(var3_long, (byte) -99);
                        if (var7 == null) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var7 = new dm(var22, var23, var3_long);
                        kp.field_o.a(-1, var7, var3_long);
                        mh.field_c.field_cc = mh.field_c.field_cc + 1;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var7.field_Mb = ((k) ((Object) var1)).d((byte) 69);
                        var8 = ((k) ((Object) var1)).a(0);
                        var7.field_Sb = var8 >> 573625729;
                        stackIn_97_0 = (dm) (var7);
                        stackIn_96_0 = stackIn_97_0;
                        if (-1 == (1 & var8 ^ -1)) {
                            statePc = 97;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_98_0 = (dm) ((Object) stackIn_96_0);
                        stackIn_98_1 = 1;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackIn_98_0 = (dm) ((Object) stackIn_97_0);
                        stackIn_98_1 = 0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackIn_98_0.field_Nb = stackIn_98_1 != 0;
                        var7.field_Yb = ((k) ((Object) var1)).g(31365);
                        var7.field_Vb = ((k) ((Object) var1)).g(31365);
                        nh.field_g.a(var7, false);
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var3_long = ((k) ((Object) var1)).a((byte) -30);
                        var24 = en.a((byte) 50, var3_long);
                        if (var24 != null) {
                            statePc = 101;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (14 == var2) {
                            statePc = 105;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var24.field_Ob) {
                            statePc = 106;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        cb.field_i = cb.field_i + 1;
                        var24.field_Ob = true;
                        if (var11 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var24.field_Pb = true;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        lf.a(var24, true);
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var3 = ((k) ((Object) var1)).d((byte) 69);
                        var4_int = ((k) ((Object) var1)).g(param0 + 33426);
                        var25_ref = (jh) ((Object) af.field_h.a((long)var3, -22877));
                        if (var25_ref == null) {
                            statePc = 112;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var14 = var25_ref;
                        var25_ref.field_rc = false;
                        if (var4_int == 0) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var25_ref.field_Jb = so.field_r;
                        var25_ref.field_Vb = var4_int;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var14.field_lc = false;
                        mi.a(var25_ref, -57);
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var3_ref_jh = (jh) ((Object) tn.field_C.c(param0 + 2175));
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (var3_ref_jh == null) {
                            statePc = 118;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var3_ref_jh.a(true);
                        var3_ref_jh.a(param0 ^ 6623);
                        var3_ref_jh = (jh) ((Object) tn.field_C.b(param0 + 2067));
                        if (var11 != 0) {
                            statePc = 185;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var11 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var3 = ((k) ((Object) var1)).d((byte) 69);
                        var4_int = ((k) ((Object) var1)).g(31365);
                        var28 = (jh) ((Object) af.field_h.a((long)var3, -22877));
                        if (var28 != null) {
                            statePc = 121;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (-1 != (var4_int ^ -1)) {
                            statePc = 123;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var28.a(true);
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var28.field_Jb = so.field_r;
                        var28.field_Vb = var4_int;
                        if (var11 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var28.a(true);
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var28.a(-4564);
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var3 = ((k) ((Object) var1)).d((byte) 69);
                        var4 = (jh) ((Object) af.field_h.a((long)var3, -22877));
                        if (var4 != null) {
                            statePc = 130;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var4 = new jh(kj.field_h);
                        af.field_h.a(-1, var4, (long)var3);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        dl.a(var4, true, var1, false);
                        mi.a(var4, param0 ^ 2144);
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var3_ref_dm = (dm) ((Object) cg.field_i.c(66));
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (var3_ref_dm == null) {
                            statePc = 136;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var3_ref_dm.a(true);
                        var3_ref_dm.a(-4564);
                        var3_ref_dm = (dm) ((Object) cg.field_i.b(param0 + 2067));
                        if (var11 != 0) {
                            statePc = 137;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var11 == 0) {
                            statePc = 132;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        cb.field_i = 0;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var3_ref_dm = (dm) ((Object) nh.field_g.c(113));
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (var3_ref_dm == null) {
                            statePc = 143;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var3_ref_dm.a(true);
                        var3_ref_dm.a(-4564);
                        var3_ref_dm = (dm) ((Object) nh.field_g.b(6));
                        if (var11 != 0) {
                            statePc = 144;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (var11 == 0) {
                            statePc = 139;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var3_ref_dm = (dm) ((Object) hq.field_c.a((byte) 7));
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (var3_ref_dm == null) {
                            statePc = 153;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        stackOut_145_0 = var3_ref_dm.field_Pb;
                        stackIn_154_0 = stackOut_145_0 ? 1 : 0;
                        stackIn_146_0 = stackOut_145_0;
                        if (var11 != 0) {
                            statePc = 154;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (stackIn_146_0) {
                            statePc = 149;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (var3_ref_dm.field_Ob) {
                            statePc = 149;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (!var3_ref_dm.field_Ob) {
                            statePc = 151;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        cb.field_i = cb.field_i - 1;
                        var3_ref_dm.field_Ob = false;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        var3_ref_dm.field_Pb = false;
                        lf.a(var3_ref_dm, true);
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        var3_ref_dm = (dm) ((Object) hq.field_c.c((byte) 123));
                        if (var11 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackIn_154_0 = -2;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (stackIn_154_0 != (var2 ^ -1)) {
                            statePc = 157;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (null == mh.field_c) {
                            statePc = 157;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        sb.field_k = mh.field_c.field_Nb;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (var2 == 4) {
                            statePc = 160;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        mh.field_c = null;
                        if (var11 == 0) {
                            statePc = 161;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        var3 = ((k) ((Object) var1)).d((byte) 69);
                        mh.field_c = new jh(kj.field_h);
                        mh.field_c.a((byte) -85, (long)var3);
                        dl.a(mh.field_c, false, var1, false);
                        qi.field_c = 0L;
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if (-3 == (var2 ^ -1)) {
                            statePc = 165;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (-4 == (var2 ^ -1)) {
                            statePc = 165;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        ej.field_n = null;
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        if (null != ej.field_n) {
                            statePc = 169;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        ej.field_n = new jh(kj.field_h);
                        if (var11 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        ej.field_n = null;
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (var2 == 3) {
                            statePc = 172;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        la.field_k = false;
                        if (var11 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        la.field_k = true;
                        var3 = 0;
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        if (fg.field_k.length <= var3) {
                            statePc = 177;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        fg.field_k[var3] = ((k) ((Object) var13)).d(param0 + -249697519);
                        var3++;
                        if (var11 != 0) {
                            statePc = 178;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        if (var11 == 0) {
                            statePc = 173;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        pb.field_h = ((k) ((Object) var1)).g(31365);
                        sc.field_f = ((k) ((Object) var1)).g(31365);
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        var3 = 0;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (var3 >= tg.field_a.length) {
                            statePc = 185;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        tg.field_a[var3] = ((k) ((Object) var13)).d(-249699580);
                        var3++;
                        if (var11 != 0) {
                            statePc = 186;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if (var11 == 0) {
                            statePc = 179;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 184: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1_ref), "ck.C(" + param0 + ')');
                }
                case 185: {
                    return;
                }
                case 186: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            if (!lo.a(8192, param0)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 != null) {
                var3_int = param2.length();
                if (-13 < (var3_int ^ -1)) {
                  if (eb.a((byte) 64, param0)) {
                    L2: {
                      if (-1 == (var3_int ^ -1)) {
                        stackIn_17_0 = 0;
                        break L2;
                      } else {
                        stackIn_17_0 = 1;
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return true;
                  }
                } else {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        int var1 = -20 % ((param0 - 40) / 63);
        field_b = null;
    }

    static {
        field_c = "OVER <%0>";
        field_b = "Players";
        field_a = 0;
    }
}
