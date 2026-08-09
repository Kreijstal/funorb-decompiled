/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends il {
    static nc field_h;
    static String field_i;
    static String field_f;
    static wg field_j;
    static int field_g;

    final wb a(int param0) {
        if (param0 < 30) {
            field_h = (nc) null;
        }
        return og.field_a;
    }

    final static int a(int param0, int param1, boolean param2, String param3, mb param4, mb param5, int param6) {
        int stackIn_6_0 = 0;
        gb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        gb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        gb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        gb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        gb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        gb stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var14 = param5.a(91);
                        if (param6 == -21760) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        vb.d(122);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = param4.a(param6 + 21819);
                        var11_ref_String = var8;
                        var11_ref_String = var8;
                        if (lf.field_d != null) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ai.a(false, (byte) -37)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = -1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if (qc.field_i != ef.field_e) {
                            statePc = 22;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        n.field_b = null;
                        id.field_c.field_m = 0;
                        if (param3 != null) {
                            statePc = 16;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ic.field_z.field_m = 0;
                        ic.field_z.b(ib.field_i.nextInt(), false);
                        ic.field_z.b(ib.field_i.nextInt(), false);
                        stackIn_11_0 = ic.field_z;
                        stackIn_10_0 = stackIn_11_0;
                        stackIn_11_1 = -1955895016;
                        stackIn_10_1 = stackIn_11_1;
                        if (param5.a(true)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = (gb) ((Object) stackIn_10_0);
                        stackIn_12_1 = stackIn_10_1;
                        stackIn_12_2 = "";
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = (gb) ((Object) stackIn_11_0);
                        stackIn_12_1 = stackIn_11_1;
                        stackIn_12_2 = (String) (var14);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((gb) (Object) stackIn_12_0).b(stackIn_12_1, stackIn_12_2);
                        stackIn_14_0 = ic.field_z;
                        stackIn_13_0 = stackIn_14_0;
                        stackIn_14_1 = -1955895016;
                        stackIn_13_1 = stackIn_14_1;
                        if (param4.a(true)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = (gb) ((Object) stackIn_13_0);
                        stackIn_15_1 = stackIn_13_1;
                        stackIn_15_2 = "";
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = (gb) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = (String) (var8);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((gb) (Object) stackIn_15_0).b(stackIn_15_1, stackIn_15_2);
                        id.field_c.c(-110, 16);
                        id.field_c.field_m = id.field_c.field_m + 1;
                        var9 = id.field_c.field_m;
                        al.a(ic.field_z, id.field_c, (byte) 75, nc.field_d, qa.field_p);
                        id.field_c.b(param6 + 21761, id.field_c.field_m - var9);
                        if (var13 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9 = 0;
                        ic.field_z.field_m = 0;
                        if (!param2) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = var9 | 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ic.field_z.b(ib.field_i.nextInt(), false);
                        ic.field_z.b(ib.field_i.nextInt(), false);
                        ic.field_z.b(-1955895016, var14);
                        ic.field_z.b(param6 + -1955873256, var8);
                        var15 = (CharSequence) ((Object) param3);
                        ic.field_z.b(-1955895016, sa.a(var15, true));
                        ic.field_z.a(true, param1);
                        ic.field_z.c(-112, param0);
                        ic.field_z.c(105, var9);
                        id.field_c.c(-112, 18);
                        id.field_c.field_m = id.field_c.field_m + 2;
                        var10 = id.field_c.field_m;
                        var11_ref_String = hh.a(false, ia.g(-79));
                        if (var11_ref_String != null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var11_ref_String = "";
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        id.field_c.a(var11_ref_String, 0);
                        al.a(ic.field_z, id.field_c, (byte) 76, nc.field_d, qa.field_p);
                        id.field_c.a(id.field_c.field_m + -var10, true);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        qf.a(0, -1);
                        ef.field_e = di.field_l;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (ef.field_e != di.field_l) {
                            statePc = 36;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!bf.c(param6 ^ -21696, 1)) {
                            statePc = 36;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9 = te.field_N.j(255);
                        te.field_N.field_m = 0;
                        if (100 > var9) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((var9 ^ -1) >= -106) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-249 == (var9 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var9 != 99) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        bf.c(54, sk.g(-9917));
                        n.field_b = new Boolean(lj.a(te.field_N, -2));
                        te.field_N.field_m = 0;
                        if (var13 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        te.field_O = -1;
                        ob.field_h = var9;
                        ef.field_e = bj.field_a;
                        if (var13 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        wb.a(ia.g(-103), (byte) -79);
                        md.field_v = fi.field_j;
                        je.a(false);
                        je.field_c = false;
                        stackIn_34_0 = var9;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0;
                }
                case 35: {
                    try {
                        ef.field_e = ta.field_e;
                        ke.field_O = new String[var9 + -100];
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (ta.field_e != ef.field_e) {
                            statePc = 47;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = 2;
                        if (!bf.c(110, var9)) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10 = te.field_N.i(-121);
                        te.field_N.field_m = 0;
                        if (!bf.c(82, var10)) {
                            statePc = 47;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11 = ke.field_O.length;
                        var12 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var11 <= var12) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ke.field_O[var12] = te.field_N.d(false);
                        var12++;
                        if (var13 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var13 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        je.a(false);
                        je.field_c = false;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = 100 - -var11;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return stackIn_46_0;
                }
                case 47: {
                    try {
                        if (bj.field_a == ef.field_e) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!qd.b((byte) 125)) {
                            statePc = 57;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (-256 != (ob.field_h ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var9_ref_String = te.field_N.g(86);
                        if (var9_ref_String == null) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        kl.a(ia.g(param6 + 21721), var9_ref_String, 13536);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var13 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        md.field_v = te.field_N.h(15);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        je.a(false);
                        je.field_c = false;
                        stackIn_56_0 = ob.field_h;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 56: {
                    return stackIn_56_0;
                }
                case 57: {
                    try {
                        if (lf.field_d != null) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (je.field_c) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var9 = ia.field_kb;
                        ia.field_kb = ki.field_C;
                        je.field_c = true;
                        ki.field_C = var9;
                        if (var13 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (30000L < dh.b(-1)) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        md.field_v = cl.field_j;
                        if (var13 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        md.field_v = il.field_d;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        je.field_c = false;
                        stackIn_65_0 = 249;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    return stackIn_65_0;
                }
                case 66: {
                    try {
                        stackIn_67_0 = -1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    return stackIn_67_0;
                }
                case 68: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_70_0 = (RuntimeException) (var7);
                    stackIn_69_0 = stackIn_70_0;
                    stackIn_70_1 = new StringBuilder().append("vb.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_69_1 = stackIn_70_1;
                    if (param3 == null) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_71_2 = "{...}";
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_71_2 = "null";
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_0 = stackIn_73_0;
                    stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
                    stackIn_72_1 = stackIn_73_1;
                    if (param4 == null) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_74_2 = "{...}";
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_74_2 = "null";
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_0 = stackIn_76_0;
                    stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
                    stackIn_75_1 = stackIn_76_1;
                    if (param5 == null) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_77_2 = "{...}";
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_77_2 = "null";
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    throw fc.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param6 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(int param0) {
        field_i = null;
        if (param0 != 20364) {
            mb var2 = (mb) null;
            vb.a(-57, -128, false, (String) null, (mb) null, (mb) null, 106);
        }
        field_h = null;
        field_j = null;
        field_f = null;
    }

    final static int a(byte param0) {
        int var1 = 12 / ((param0 - -11) / 48);
        return v.field_d;
    }

    vb(long param0, String param1) {
        super(param0, param1);
    }

    final static o[] e(int param0) {
        boolean stackIn_5_0 = false;
        int stackIn_22_0 = 0;
        boolean stackOut_4_0;
        int statePc = 0;
        o[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = SolKnight.field_L ? 1 : 0;
                    var1 = new o[nb.field_c];
                    if (param0 == 255) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    vb.e(64);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var2 >= nb.field_c) {
                        statePc = 21;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = uj.field_b[var2] * sa.field_l[var2];
                    var17 = jc.field_c[var2];
                    stackOut_4_0 = rg.field_e[var2];
                    stackIn_22_0 = stackOut_4_0 ? 1 : 0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var8 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!stackIn_5_0) {
                        statePc = 13;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var18 = uf.field_s[var2];
                    var14 = new int[var3];
                    var12 = var14;
                    var6_ref_int__ = var12;
                    var7 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var7 >= var3) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var6_ref_int__[var7] = qk.a(ig.field_H[fi.a((int) var17[var7], 255)], fi.a((int) var18[var7], 255) << 1108645848);
                    var7++;
                    if (var8 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var8 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var1[var2] = (o) ((Object) new ui(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], var14));
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var8 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var10 = new int[var3];
                    var6 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var6 >= var3) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var10[var6] = ig.field_H[fi.a((int) var17[var6], 255)];
                    var6++;
                    if (var8 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var8 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var1[var2] = new o(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], var10);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var2++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var8 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = -97;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    og.a((byte) stackIn_22_0);
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_i = "Loading graphics";
        field_f = "Sound: ";
    }
}
