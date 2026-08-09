/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_n;
    static int[] field_j;
    static int[][] field_i;
    static int[] field_l;
    String field_a;
    static cj field_m;
    static boolean field_k;
    int field_g;
    String field_f;
    static String field_e;
    static int[] field_b;
    String field_h;
    ul field_d;
    static int field_c;

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        cj stackIn_27_0 = null;
        cj stackIn_28_0 = null;
        cj stackIn_29_0 = null;
        String stackIn_29_1 = null;
        cj stackIn_30_0 = null;
        cj stackIn_31_0 = null;
        cj stackIn_32_0 = null;
        String stackIn_32_1 = null;
        boolean stackIn_54_0 = false;
        String stackIn_63_0 = null;
        cj stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        cj stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        cj stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        cj stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        cj stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        cj stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        cj stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        cj stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        cj stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        cj stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        cj stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        cj stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        cj stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        cj stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        cj stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        boolean stackIn_86_0 = false;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        cj var5 = null;
        cj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        cj var14 = null;
        String var15 = null;
        cj var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        mf.a(sq.field_Q, false);
                        if (ej.field_n == null) {
                            statePc = 70;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var14 = en.field_b;
                        var16 = var14;
                        en.field_b.field_z = 0;
                        var16.field_zb = 0;
                        var5 = gb.field_a;
                        gb.field_a.field_z = 0;
                        var5.field_zb = 0;
                        var6 = eb.field_B;
                        eb.field_B.field_z = 0;
                        var6.field_zb = 0;
                        field_m.field_wb = mk.field_l.toUpperCase();
                        var7 = (2 + fc.field_a.field_zb) / 2;
                        eb.field_B.a(40, -40 + fc.field_a.field_z, -2 + var7, 0, -3344);
                        gb.field_a.a(40, fc.field_a.field_z - 40, fc.field_a.field_zb + -var7, var7, -3344);
                        if (-2 != (qo.field_r.length ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-3 == (qo.field_r[0] ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = 0;
                        var9_int = 0;
                        var10 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var10 ^ -1) <= (qo.field_r.length ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_20_0 = fg.field_k[var10 / 8] & 1 << (7 & var10) ^ -1;
                        stackIn_8_0 = stackIn_20_0;
                        stackIn_20_1 = -1;
                        stackIn_8_1 = stackIn_20_1;
                        if (var12 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == stackIn_8_1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_11_0 = 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11_int = stackIn_11_0;
                        if (var11_int == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var11_int == 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-3 != (qo.field_r[var10] ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = 1;
                        if (var12 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = var9_int ^ -1;
                        stackIn_20_1 = -1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 == stackIn_20_1) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var12 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var8 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        gb.field_a.field_Z = true;
                        if (la.field_k) {
                            statePc = 60;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_28_0 = gb.field_a;
                        stackIn_27_0 = stackIn_28_0;
                        if (var8 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_29_0 = (cj) ((Object) stackIn_27_0);
                        stackIn_29_1 = dk.field_Jb;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = (cj) ((Object) stackIn_28_0);
                        stackIn_29_1 = qa.field_n;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_29_0.field_wb = ((String) (Object) stackIn_29_1).toUpperCase();
                        stackIn_31_0 = sk.field_i;
                        stackIn_30_0 = stackIn_31_0;
                        if (var8 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_32_0 = (cj) ((Object) stackIn_30_0);
                        stackIn_32_1 = ol.field_l;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = (cj) ((Object) stackIn_31_0);
                        stackIn_32_1 = dq.field_i;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_32_0.field_wb = vl.a(stackIn_32_1, new String[]{gb.field_a.field_wb}, 2);
                        jp.field_b.field_Z = true;
                        eb.field_B.field_wb = ob.field_t;
                        dj.field_l = true;
                        if (null != iq.field_b) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        lp.field_p = false;
                        dj.field_l = false;
                        if (null == rl.field_v) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ll.field_c = new boolean[kj.field_h];
                        rl.field_v = new byte[kj.field_h];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9_int = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var9_int >= kj.field_h) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ll.field_c[var9_int] = false;
                        var9_int++;
                        if (var12 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var12 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        bh.a(-1712, -1, 0, ej.field_n, true, kj.field_h, -1, -1);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (2 > kj.field_q) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (!lc.field_m[12]) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        dj.field_l = true;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (dj.field_l) {
                            statePc = 70;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        gb.field_a.field_Z = false;
                        if (gb.field_a.field_pb) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var9 = null;
                        if (!lp.field_p) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var9 = "<col=A00000>" + gi.field_n + "</col>";
                        var11 = var9;
                        var9 = var11;
                        var11 = var9;
                        var9 = var11;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var10 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((kj.field_h ^ -1) >= (var10 ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_86_0 = ll.field_c[var10];
                        stackIn_54_0 = stackIn_86_0;
                        if (var12 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!stackIn_54_0) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var11_ref = "<col=A00000>" + cf.field_f[var10] + "</col>";
                        var9 = var11_ref;
                        var9 = var11_ref;
                        if (var9 == null) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var9 = (String) (var9) + ", " + var11_ref;
                        if (var12 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var9 = var11_ref;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ui.field_j = "<col=A00000>" + ke.field_k + "<br>" + fn.field_g + (String) (var9);
                        if (var12 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        sk.field_i.field_wb = qd.field_K;
                        jp.field_b.field_Z = false;
                        if (var8 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_63_0 = po.field_f;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = vc.field_c;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var15 = stackIn_63_0;
                        var9 = var15;
                        var9 = var15;
                        var9 = var15;
                        var10 = eb.field_B.field_yb.a(var15) - -(3 * eb.field_B.field_yb.a('.'));
                        eb.field_B.field_R = 0;
                        eb.field_B.field_V = (-var10 + eb.field_B.field_zb) / 2;
                        if ((48 & qj.field_i) != 16) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var9 = var15 + ".";
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((48 & qj.field_i) != 32) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var9 = (String) (var9) + "..";
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if ((48 & qj.field_i ^ -1) != -49) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var9 = (String) (var9) + "...";
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        eb.field_B.field_wb = (String) (var9);
                        gb.field_a.field_wb = gk.field_a.toUpperCase();
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_74_0 = mh.field_i;
                        stackIn_71_0 = stackIn_74_0;
                        stackIn_74_1 = -11838;
                        stackIn_71_1 = stackIn_74_1;
                        if (!param1) {
                            statePc = 74;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_74_0 = (cj) ((Object) stackIn_71_0);
                        stackIn_72_0 = stackIn_74_0;
                        stackIn_74_1 = stackIn_71_1;
                        stackIn_72_1 = stackIn_74_1;
                        if (param2) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_74_0 = (cj) ((Object) stackIn_72_0);
                        stackIn_73_0 = stackIn_74_0;
                        stackIn_74_1 = stackIn_72_1;
                        stackIn_73_1 = stackIn_74_1;
                        if (io.field_b) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackIn_75_0 = (cj) ((Object) stackIn_73_0);
                        stackIn_75_1 = stackIn_73_1;
                        stackIn_75_2 = 1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_75_0 = (cj) ((Object) stackIn_74_0);
                        stackIn_75_1 = stackIn_74_1;
                        stackIn_75_2 = 0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        ((cj) (Object) stackIn_75_0).a(stackIn_75_1, stackIn_75_2 != 0);
                        stackIn_79_0 = fc.field_a;
                        stackIn_76_0 = stackIn_79_0;
                        stackIn_79_1 = -11838;
                        stackIn_76_1 = stackIn_79_1;
                        if (!param1) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_79_0 = (cj) ((Object) stackIn_76_0);
                        stackIn_77_0 = stackIn_79_0;
                        stackIn_79_1 = stackIn_76_1;
                        stackIn_77_1 = stackIn_79_1;
                        if (param2) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_79_0 = (cj) ((Object) stackIn_77_0);
                        stackIn_78_0 = stackIn_79_0;
                        stackIn_79_1 = stackIn_77_1;
                        stackIn_78_1 = stackIn_79_1;
                        if (io.field_b) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_80_0 = (cj) ((Object) stackIn_78_0);
                        stackIn_80_1 = stackIn_78_1;
                        stackIn_80_2 = 1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_80_0 = (cj) ((Object) stackIn_79_0);
                        stackIn_80_1 = stackIn_79_1;
                        stackIn_80_2 = 0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        ((cj) (Object) stackIn_80_0).a(stackIn_80_1, stackIn_80_2 != 0);
                        stackIn_84_0 = qf.field_b;
                        stackIn_81_0 = stackIn_84_0;
                        stackIn_84_1 = -11838;
                        stackIn_81_1 = stackIn_84_1;
                        if (!param1) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackIn_84_0 = (cj) ((Object) stackIn_81_0);
                        stackIn_82_0 = stackIn_84_0;
                        stackIn_84_1 = stackIn_81_1;
                        stackIn_82_1 = stackIn_84_1;
                        if (param2) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_84_0 = (cj) ((Object) stackIn_82_0);
                        stackIn_83_0 = stackIn_84_0;
                        stackIn_84_1 = stackIn_82_1;
                        stackIn_83_1 = stackIn_84_1;
                        if (!io.field_b) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_85_0 = (cj) ((Object) stackIn_83_0);
                        stackIn_85_1 = stackIn_83_1;
                        stackIn_85_2 = 1;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackIn_85_0 = (cj) ((Object) stackIn_84_0);
                        stackIn_85_1 = stackIn_84_1;
                        stackIn_85_2 = 0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ((cj) (Object) stackIn_85_0).a(stackIn_85_1, stackIn_85_2 != 0);
                        stackIn_86_0 = param3;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (stackIn_86_0) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 87: {
                    return;
                }
                case 88: {
                    try {
                        em.field_U.field_c.h(-56);
                        if (null != ej.field_n) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if ((jp.field_b.field_T ^ -1) == -1) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        jk.a(param0, 1);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((gb.field_a.field_T ^ -1) == -1) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (la.field_k) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        uo.b(true, param0);
                        if (var12 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        ag.a(param0, (byte) 98);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        ld.a(ej.field_n, true, param0, 1);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 99: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var4), "gg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 100: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0) {
        if (dj.field_k == id.field_B) {
            return mc.field_g;
        }
        if (param0 <= 0) {
            return (String) null;
        }
        if (!tg.field_g.d(-88)) {
            return tg.field_g.a(31027);
        }
        if (!(dj.field_k != ta.field_hb)) {
            return tg.field_g.a(31027);
        }
        return fa.field_Ib;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 > -99) {
            return;
        }
        field_b = null;
        field_m = null;
        field_j = null;
        field_i = (int[][]) null;
        field_n = null;
        field_l = null;
    }

    private gg() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, boolean param1) {
        if (-1 > (mh.field_h ^ -1) && ee.field_a) {
            oo.f(0, 0, oo.field_b, dq.field_k.field_qb);
            lm.field_gb.c(param1, -1);
        }
        if (-1 > (sq.field_Q ^ -1) || -1 > (da.field_a ^ -1)) {
            if (io.field_b) {
                oo.f(0, 0, oo.field_b, dq.field_k.field_qb);
                qf.field_b.c(param1, -1);
            }
        }
        int var2 = 2 / ((param0 - -11) / 49);
    }

    static {
        field_n = "Hide private chat and appear offline to friends";
        field_i = new int[36][];
        field_j = new int[36];
        field_l = new int[36];
        field_k = false;
        field_b = new int[36];
        field_e = "Decline invitation to <%0>'s game";
        field_b[0] = 6;
        field_l[0] = 0;
        field_b[1] = 8;
        field_j[0] = 4;
        field_l[1] = 6;
        field_j[1] = 4;
        field_b[2] = 10;
        field_l[2] = 18;
        field_b[3] = 3;
        field_j[2] = 7;
        field_l[3] = 12;
        field_j[3] = 4;
        field_b[25] = 11;
        field_l[25] = 30;
        field_j[25] = 4;
        field_b[30] = 11;
        field_l[30] = 30;
        field_j[30] = 4;
        field_b[16] = 3;
        field_l[16] = 12;
        field_j[16] = 4;
        field_b[10] = 8;
        field_l[10] = 24;
        field_j[10] = 3;
        field_b[11] = 20;
        field_l[11] = 24;
        field_b[4] = 20;
        field_j[11] = 1;
        field_l[4] = 0;
        field_b[5] = 5;
        field_j[4] = 7;
        field_l[5] = 7;
        field_j[5] = 7;
        field_b[6] = 10;
        field_l[6] = 7;
        field_b[7] = 6;
        field_j[6] = 7;
        field_l[7] = 14;
        field_j[7] = 4;
        field_b[22] = 2;
        field_l[22] = 14;
        field_b[9] = 2;
        field_j[22] = 4;
        field_l[9] = 93;
        field_b[12] = 50;
        field_j[9] = 6;
        field_l[12] = 14;
        field_j[12] = 1;
        field_b[13] = 35;
        field_l[13] = 91;
        field_b[23] = 5;
        field_j[13] = 3;
        field_l[23] = 0;
        field_b[14] = 12;
        field_j[23] = 7;
        field_l[14] = 56;
        field_b[15] = 12;
        field_j[14] = 5;
        field_l[15] = 49;
        field_j[15] = 5;
        field_b[17] = 8;
        field_l[17] = 42;
        field_j[17] = 8;
        field_b[8] = 4;
        field_l[8] = 4;
        field_j[8] = 4;
        field_b[19] = 10;
        field_l[19] = 63;
        field_j[19] = 6;
        field_b[27] = 5;
        field_i[27] = new int[]{0, 1, 2, 3, 4, 3, 4, 3, 4, 3, 2};
        field_l[27] = 105;
        field_j[27] = field_i[27].length;
        field_b[28] = 12;
        field_l[28] = 49;
        field_i[28] = new int[]{0, 1, 2, 3, 4, 3, 4, 3, 2, 0};
        field_j[28] = field_i[28].length;
        field_b[24] = field_b[19];
        field_l[24] = field_l[19];
        field_j[24] = field_j[19];
        field_b[26] = field_b[14];
        field_l[26] = field_l[14];
        field_b[34] = field_b[15];
        field_j[26] = field_j[14];
        field_l[34] = field_l[15];
        field_b[31] = 5;
        field_j[34] = field_j[15];
        field_l[31] = 119;
        field_j[31] = 14;
        field_b[32] = 5;
        field_l[32] = 22;
        field_j[32] = 1;
        field_b[29] = 20;
        field_l[29] = 0;
        field_j[29] = 7;
        field_b[33] = 20;
        field_l[33] = 0;
        field_j[33] = 7;
    }
}
