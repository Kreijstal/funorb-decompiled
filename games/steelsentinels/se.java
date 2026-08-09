/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static rm field_c;
    static String field_d;
    static String[] field_a;
    static int field_e;
    static long field_b;

    final static void a(int param0, byte[] param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int[] array$6 = null;
        int incrementValue$7 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        String[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        String[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        String stackIn_36_2 = null;
        int stackIn_40_0 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String stackIn_44_2 = null;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String stackIn_48_2 = null;
        String[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        String[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        String stackIn_52_2 = null;
        String[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        String[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        String[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        String stackIn_56_2 = null;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        String[] stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String stackIn_74_2 = null;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        RuntimeException stackIn_171_0 = null;
        StringBuilder stackIn_171_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_172_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[][] var4 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 != param1.length) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (param0 == -1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2_int = 0;
                        incrementValue$0 = var2_int;
                        var2_int++;
                        var3 = param1[incrementValue$0];
                        if (2 > var3) {
                            statePc = 75;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param1.length ^ -1) < (var2_int ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        incrementValue$1 = var2_int;
                        var2_int++;
                        var4_int = param1[incrementValue$1];
                        var5 = dm.field_c ? 1 : 0;
                        if ((1 & var4_int) == 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_16_0 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        si.field_p = stackIn_16_0 != 0;
                        if ((4 & var4_int ^ -1) == -1) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_20_0 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        dm.field_c = stackIn_20_0 != 0;
                        if ((2 & var4_int ^ -1) == -1) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_24_0 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ka.field_V = stackIn_24_0 != 0;
                        var6 = tj.field_a ? 1 : 0;
                        if (0 == (16 & var4_int)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_28_0 = 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ik.field_h = stackIn_28_0 != 0;
                        if (-1 == (var4_int & 8 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_32_0 = 1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ui.field_G = stackIn_32_0 != 0;
                        stackIn_35_0 = ti.field_A;
                        stackIn_33_0 = stackIn_35_0;
                        stackIn_35_1 = 42;
                        stackIn_33_1 = stackIn_35_1;
                        if (!dm.field_c) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_36_0 = (String[]) ((Object) stackIn_33_0);
                        stackIn_36_1 = stackIn_33_1;
                        stackIn_36_2 = qm.field_c;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = (String[]) ((Object) stackIn_35_0);
                        stackIn_36_1 = stackIn_35_1;
                        stackIn_36_2 = od.field_j;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_36_0[stackIn_36_1] = stackIn_36_2;
                        if (0 == (32 & var4_int)) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_40_0 = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        tj.field_a = stackIn_40_0 != 0;
                        stackIn_43_0 = ti.field_A;
                        stackIn_41_0 = stackIn_43_0;
                        stackIn_43_1 = 37;
                        stackIn_41_1 = stackIn_43_1;
                        if (ka.field_V) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_44_0 = (String[]) ((Object) stackIn_41_0);
                        stackIn_44_1 = stackIn_41_1;
                        stackIn_44_2 = fg.field_Vb;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = (String[]) ((Object) stackIn_43_0);
                        stackIn_44_1 = stackIn_43_1;
                        stackIn_44_2 = ge.field_i;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_44_0[stackIn_44_1] = stackIn_44_2;
                        stackIn_47_0 = ti.field_A;
                        stackIn_45_0 = stackIn_47_0;
                        stackIn_47_1 = 41;
                        stackIn_45_1 = stackIn_47_1;
                        if (si.field_p) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_48_0 = (String[]) ((Object) stackIn_45_0);
                        stackIn_48_1 = stackIn_45_1;
                        stackIn_48_2 = fm.field_h;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = (String[]) ((Object) stackIn_47_0);
                        stackIn_48_1 = stackIn_47_1;
                        stackIn_48_2 = hf.field_b;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_48_0[stackIn_48_1] = stackIn_48_2;
                        stackIn_51_0 = ti.field_A;
                        stackIn_49_0 = stackIn_51_0;
                        stackIn_51_1 = 44;
                        stackIn_49_1 = stackIn_51_1;
                        if (!ik.field_h) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_52_0 = (String[]) ((Object) stackIn_49_0);
                        stackIn_52_1 = stackIn_49_1;
                        stackIn_52_2 = o.field_a;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = (String[]) ((Object) stackIn_51_0);
                        stackIn_52_1 = stackIn_51_1;
                        stackIn_52_2 = sa.field_b;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_52_0[stackIn_52_1] = stackIn_52_2;
                        stackIn_55_0 = ti.field_A;
                        stackIn_53_0 = stackIn_55_0;
                        stackIn_55_1 = 43;
                        stackIn_53_1 = stackIn_55_1;
                        if (ui.field_G) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_56_0 = (String[]) ((Object) stackIn_53_0);
                        stackIn_56_1 = stackIn_53_1;
                        stackIn_56_2 = fj.field_i;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_56_0 = (String[]) ((Object) stackIn_55_0);
                        stackIn_56_1 = stackIn_55_1;
                        stackIn_56_2 = tm.field_f;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_56_0[stackIn_56_1] = stackIn_56_2;
                        if ((dm.field_c ? 1 : 0) != var5) {
                            statePc = 69;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (tj.field_a) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_63_0 = 1;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_66_0 = stackIn_63_0;
                        stackIn_64_0 = stackIn_66_0;
                        if (var6 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_67_0 = stackIn_64_0;
                        stackIn_67_1 = 1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = stackIn_66_0;
                        stackIn_67_1 = 0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 != stackIn_67_1) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        gd.field_sb = null;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_73_0 = ti.field_A;
                        stackIn_71_0 = stackIn_73_0;
                        stackIn_73_1 = 47;
                        stackIn_71_1 = stackIn_73_1;
                        if (!tj.field_a) {
                            statePc = 73;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_74_0 = (String[]) ((Object) stackIn_71_0);
                        stackIn_74_1 = stackIn_71_1;
                        stackIn_74_2 = qj.field_u;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackIn_74_0 = (String[]) ((Object) stackIn_73_0);
                        stackIn_74_1 = stackIn_73_1;
                        stackIn_74_2 = he.field_d;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_74_0[stackIn_74_1] = stackIn_74_2;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var3 < 1) {
                            statePc = 81;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var2_int >= param1.length) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        incrementValue$2 = var2_int;
                        var2_int++;
                        dm.field_a = param1[incrementValue$2];
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var3 >= 0) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var2_int == param1.length) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 87: {
                    return;
                }
                case 88: {
                    try {
                        incrementValue$3 = var2_int;
                        var2_int++;
                        var4_int = 255 & param1[incrementValue$3];
                        if (param1.length >= var2_int + var4_int) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 89: {
                    return;
                }
                case 90: {
                    try {
                        uc.field_b = new int[var4_int];
                        var5 = 0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if ((var5 ^ -1) <= (var4_int ^ -1)) {
                            statePc = 99;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        incrementValue$4 = var2_int;
                        var2_int++;
                        uc.field_b[var5] = ec.a(255, (int) param1[incrementValue$4]);
                        stackIn_133_0 = 255;
                        stackIn_93_0 = stackIn_133_0;
                        stackIn_133_1 = uc.field_b[var5];
                        stackIn_93_1 = stackIn_133_1;
                        if (var10 != 0) {
                            statePc = 133;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (stackIn_93_0 != stackIn_93_1) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        uc.field_b[var5] = -1;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var5++;
                        if (var10 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var5_ref_int__ = new int[8];
                        if (ji.a(uc.field_b, (byte) 97, var5_ref_int__) == null) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        uc.field_b = new int[ua.field_x.length];
                        ii.a(ua.field_x, 0, uc.field_b, 0, uc.field_b.length);
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (ni.b(58)) {
                            statePc = 107;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (-1 > (rd.field_b ^ -1)) {
                            statePc = 132;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var6 = uc.field_b[0];
                        var7_ref_int__ = nl.a(var6, (byte) 126);
                        var8 = 0;
                        if (var7_ref_int__ == null) {
                            statePc = 128;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (oc.a(var6, -87, false)) {
                            statePc = 128;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var9 = 0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var9 >= uc.field_b.length) {
                            statePc = 127;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackIn_133_0 = uc.field_b[var9];
                        stackIn_114_0 = stackIn_133_0;
                        stackIn_133_1 = param0 + -87;
                        stackIn_114_1 = stackIn_133_1;
                        if (var10 != 0) {
                            statePc = 133;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackIn_119_0 = stackIn_114_0;
                        stackIn_115_0 = stackIn_119_0;
                        stackIn_119_1 = stackIn_114_1;
                        stackIn_115_1 = stackIn_119_1;
                        if (-8 + uc.field_b.length > var9) {
                            statePc = 119;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackIn_117_0 = stackIn_115_0;
                        stackIn_117_1 = stackIn_115_1;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackIn_120_0 = stackIn_117_0;
                        stackIn_120_1 = stackIn_117_1;
                        stackIn_120_2 = 1;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackIn_120_0 = stackIn_119_0;
                        stackIn_120_1 = stackIn_119_1;
                        stackIn_120_2 = 0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (oc.a(stackIn_120_0, stackIn_120_1, stackIn_120_2 != 0)) {
                            statePc = 123;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var8 = 1;
                        if (var10 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var9++;
                        if (var10 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (var10 == 0) {
                            statePc = 129;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var8 = 1;
                        var7_ref_int__ = ua.field_x;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (var8 == 0) {
                            statePc = 132;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        uc.field_b = new int[var7_ref_int__.length];
                        ii.a(var7_ref_int__, 0, uc.field_b, 0, var7_ref_int__.length);
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackIn_133_0 = var3;
                        stackIn_133_1 = 3;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (stackIn_133_0 < stackIn_133_1) {
                            statePc = 173;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        var4 = ue.field_c;
                        var5 = 0;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        stackIn_136_0 = var4.length ^ -1;
                        stackIn_136_1 = var5 ^ -1;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (stackIn_136_0 >= stackIn_136_1) {
                            statePc = 173;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (var10 != 0) {
                            statePc = 173;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (var2_int < param1.length) {
                            statePc = 142;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 141: {
                    return;
                }
                case 142: {
                    try {
                        incrementValue$5 = var2_int;
                        var2_int++;
                        var6 = 255 & param1[incrementValue$5];
                        if ((var6 ^ -1) != -1) {
                            statePc = 146;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var4[var5] = null;
                        if (var10 == 0) {
                            statePc = 166;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if ((param1.length ^ -1) > (var6 - -var2_int ^ -1)) {
                            statePc = 151;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 151: {
                    return;
                }
                case 152: {
                    try {
                        if (null == var4[var5]) {
                            statePc = 158;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if ((var4[var5].length ^ -1) != (var6 ^ -1)) {
                            statePc = 158;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        array$6 = new int[var6];
                        var4[var5] = array$6;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        var7 = 0;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (var6 <= var7) {
                            statePc = 166;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        incrementValue$7 = var2_int;
                        var2_int++;
                        var4[var5][var7] = ec.a(255, (int) param1[incrementValue$7]);
                        stackIn_136_0 = var4[var5][var7];
                        stackIn_162_0 = stackIn_136_0;
                        stackIn_136_1 = 255;
                        stackIn_162_1 = stackIn_136_1;
                        if (var10 != 0) {
                            statePc = 136;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (stackIn_162_0 == stackIn_162_1) {
                            statePc = 164;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        var4[var5][var7] = -1;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var7++;
                        if (var10 == 0) {
                            statePc = 160;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        ad.a(var5, (nk) null, 33);
                        var5++;
                        if (var10 == 0) {
                            statePc = 135;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 168: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_171_0 = (RuntimeException) (var2);
                    stackIn_169_0 = stackIn_171_0;
                    stackIn_171_1 = new StringBuilder().append("se.D(").append(param0).append(',');
                    stackIn_169_1 = stackIn_171_1;
                    if (param1 == null) {
                        statePc = 171;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    stackIn_172_0 = (RuntimeException) ((Object) stackIn_169_0);
                    stackIn_172_1 = (StringBuilder) ((Object) stackIn_169_1);
                    stackIn_172_2 = "{...}";
                    statePc = 172;
                    continue stateLoop;
                }
                case 171: {
                    stackIn_172_0 = (RuntimeException) ((Object) stackIn_171_0);
                    stackIn_172_1 = (StringBuilder) ((Object) stackIn_171_1);
                    stackIn_172_2 = "null";
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    throw ci.a((Throwable) ((Object) stackIn_172_0), stackIn_172_2 + ')');
                }
                case 173: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static wk[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        wk var9 = null;
        wk var10 = null;
        wk var11 = null;
        wk var12 = null;
        wk var13 = null;
        Object var14 = null;
        wk[] stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = pb.field_g;
              var7 = pb.field_c;
              var8 = pb.field_j;
              var9 = new wk(param0, -(2 * param0) + param3);
              var9.d();
              pb.e(0, 0, param0, param3 - param0 * 2, param2, param4);
              var10 = new wk(param0, param0);
              var10.d();
              if (param5 == 13574) {
                break L1;
              } else {
                field_a = (String[]) null;
                break L1;
              }
            }
            L2: {
              pb.a(0, 0, param0, param0, param2);
              var11 = new wk(16, param0);
              var11.d();
              pb.a(0, 0, 16, param0, param2);
              var12 = new wk(param0, param0);
              var12.d();
              pb.a(0, 0, param0, param0, param4);
              var13 = new wk(16, param0);
              var13.d();
              pb.a(0, 0, 16, param0, param4);
              var14 = null;
              if (0 < param1) {
                var14 = new wk(16, 16);
                ((wk) (var14)).d();
                pb.a(0, 0, 16, 16, param1);
                break L2;
              } else {
                break L2;
              }
            }
            pb.a(var6, var7, var8);
            stackIn_8_0 = new wk[]{var10, var11, var10, var9, (wk) (var14), var9, var12, var13, var12};
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6_ref), "se.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_8_0;
    }

    public static void a(byte param0) {
        try {
            field_d = null;
            int var1_int = 14 / ((-32 - param0) / 56);
            field_c = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "se.A(" + param0 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        var4 = lk.field_W;
                        if (param0 == 32) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = (String[]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (an.field_g.length <= var3_int) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = kk.field_g[var3_int];
                        stackIn_18_0 = 0;
                        stackIn_6_0 = stackIn_18_0;
                        if (var8 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 > var5) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = rg.a(an.field_g[var3_int], true, (byte) -115);
                        var4 = var4 + tf.field_c;
                        var7 = vg.field_f - (var6 >> 1540895457);
                        if (pg.a(ig.field_e + (id.field_ac << 1893656289), var6 - -(h.field_U << -1470183967), param2, var7 + -h.field_U, param0 + -32, var4, param1)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = var5;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    try {
                        var4 = var4 + (tf.field_c + ((id.field_ac << -2060332639) - -ig.field_e));
                        if (var8 == 0) {
                            statePc = 16;
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
                        var4 = var4 + ck.field_e;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3_int++;
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = -1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var3), "se.E(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        try {
            hc.a(4, 0);
            if (param0 <= 17) {
                field_b = -41L;
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "se.B(" + param0 + ')');
        }
    }

    final static gh a(boolean param0, boolean param1, int param2, nk param3, int param4) {
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        gh stackIn_25_0 = null;
        gh stackIn_27_0 = null;
        gh stackIn_28_0 = null;
        wk[] stackIn_28_1 = null;
        gh stackIn_29_0 = null;
        gh stackIn_31_0 = null;
        gh stackIn_32_0 = null;
        wk[] stackIn_32_1 = null;
        boolean stackIn_41_0 = false;
        int stackIn_48_0 = 0;
        boolean stackIn_51_0 = false;
        int stackIn_58_0 = 0;
        gh stackIn_67_0 = null;
        int stackIn_112_0 = 0;
        gh stackIn_113_0 = null;
        gh stackIn_113_1 = null;
        long stackIn_113_2 = 0L;
        gh stackIn_113_3 = null;
        gh stackIn_115_0 = null;
        gh stackIn_115_1 = null;
        long stackIn_115_2 = 0L;
        gh stackIn_115_3 = null;
        gh stackIn_116_0 = null;
        gh stackIn_116_1 = null;
        long stackIn_116_2 = 0L;
        gh stackIn_116_3 = null;
        String stackIn_116_4 = null;
        gh stackIn_157_0 = null;
        gh stackIn_159_0 = null;
        gh stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        gh stackIn_170_0 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        RuntimeException stackIn_175_0 = null;
        StringBuilder stackIn_175_1 = null;
        String stackIn_175_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_40_0;
        boolean stackOut_50_0;
        int statePc = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        gh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int[] var12 = null;
        String var12_ref = null;
        int var13_int = 0;
        gh var13 = null;
        int var14_int = 0;
        gh var14 = null;
        int[] var15_ref_int__ = null;
        gh var15_ref_gh = null;
        int var15 = 0;
        int var16 = 0;
        String var16_ref_String = null;
        int var17_int = 0;
        gh var17 = null;
        int var18_int = 0;
        gh var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var5_int = qa.field_O;
                    if (ni.b(104)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (0 < rd.field_b) {
                        statePc = 10;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!oc.a(param3.field_N, -125, false)) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_11_0 = 1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var6 = stackIn_11_0;
                    if (-2 == (param3.field_Q ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = 64;
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = 78;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var7 = stackIn_15_0;
                    if (17 > param3.field_N) {
                        statePc = 22;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if ((param3.field_N ^ -1) > -54) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var7 = 36;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((param3.field_N ^ -1) != -84) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var7 = 36;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var8 = new gh((long)param3.field_N, sb.field_Y);
                    cj.field_a[param3.field_N] = var8;
                    stackIn_27_0 = (gh) (var8);
                    stackIn_25_0 = stackIn_27_0;
                    if (0 != param2) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_28_0 = (gh) ((Object) stackIn_25_0);
                    stackIn_28_1 = be.field_f;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (gh) ((Object) stackIn_27_0);
                    stackIn_28_1 = tk.field_t;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_28_0.field_Ab = stackIn_28_1;
                    stackIn_31_0 = (gh) (var8);
                    stackIn_29_0 = stackIn_31_0;
                    if (-1 != (param2 ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = (gh) ((Object) stackIn_29_0);
                    stackIn_32_1 = tk.field_t;
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (gh) ((Object) stackIn_31_0);
                    stackIn_32_1 = co.field_d;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_32_0.field_I = stackIn_32_1;
                    var9 = sj.field_v[param3.field_N];
                    var10 = 0;
                    if (param3.field_Q != 1) {
                        statePc = 61;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (-1 != (param2 ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var11_ref_int__ = ne.a(param3.field_N, (byte) 28);
                    var12 = ki.b(param3.field_N, (byte) -101);
                    var13_int = 0;
                    var14_int = 0;
                    var15_ref_int__ = var11_ref_int__;
                    var16 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var16 >= var15_ref_int__.length) {
                        statePc = 47;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var17_int = var15_ref_int__[var16];
                    var18_int = sj.field_v[var17_int];
                    stackOut_40_0 = t.a(rn.field_D, var17_int, -20370);
                    stackIn_48_0 = stackOut_40_0 ? 1 : 0;
                    stackIn_41_0 = stackOut_40_0;
                    if (var19 != 0) {
                        statePc = 48;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var14_int = var14_int + var18_int;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var13_int = var13_int + var18_int;
                    var16++;
                    if (var19 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var15_ref_int__ = var12;
                    stackIn_48_0 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var16 = stackIn_48_0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if ((var16 ^ -1) <= (var15_ref_int__.length ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var17_int = var15_ref_int__[var16];
                    var18_int = qf.field_h[var17_int];
                    var13_int = var13_int + var18_int;
                    stackOut_50_0 = t.a(fe.field_D, var17_int, -20370);
                    stackIn_58_0 = stackOut_50_0 ? 1 : 0;
                    stackIn_51_0 = stackOut_50_0;
                    if (var19 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (stackIn_51_0) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var14_int = var14_int + var18_int;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var9 = var13_int - var14_int;
                    var10 = var14_int * 100 / var13_int;
                    stackIn_58_0 = var9 ^ -1;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 < (li.field_v ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    param2 = 1;
                    if (var19 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    param2 = 2;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var11 = 66;
                    var12_ref = param3.l(-24719);
                    var13 = new gh((long)param3.field_N, kh.field_s, var12_ref);
                    var13.a(0, 2, var7 - 19, -4 + var11, -var11 + var5_int);
                    var13.field_Ib = 10;
                    if (-41 < (var7 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var12_ref = bg.a(var12_ref, var13.field_zb + -(var13.field_ub * 2), (byte) -45, var13.field_L);
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var13.field_S = var12_ref;
                    if (param4 == 14) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_67_0 = (gh) null;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    return stackIn_67_0;
                }
                case 68: {
                    var13.field_nb = 1995681;
                    var8.a(var13, param4 ^ 114);
                    if ((param3.field_N ^ -1) > -18) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (53 > param3.field_N) {
                        statePc = 118;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if ((param3.field_N ^ -1) == -84) {
                        statePc = 118;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (1 != param3.field_Q) {
                        statePc = 94;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var14_int = var13.field_L.a(var13.field_S, var13.field_zb - var13.field_ub * 2, var13.field_Ib) + 6;
                    kh.a(var8, "<img=1>", tc.field_B[param3.field_N], param3.field_N, var14_int, var5_int, 3000, var11, true);
                    var14_int += 14;
                    kh.a(var8, "<img=0>", param3.g(8192), param3.field_N, var14_int, var5_int, 800, var11, true);
                    var14_int += 14;
                    if (0 < param3.j(0)) {
                        statePc = 85;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if ((param3.h(-31496) ^ -1) < -1) {
                        statePc = 84;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 84: {
                    kh.a(var8, "<img=2>", (int)((double)param3.h(-31496) / Math.sqrt((double)param3.g(8192))), param3.field_N, var14_int, var5_int, 27, var11, true);
                    if (var19 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    kh.a(var8, "<img=3>", (int)((double)param3.j(0) / Math.sqrt((double)param3.g(8192))), param3.field_N, var14_int, var5_int, 27, var11, true);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    var14_int += 14;
                    var16_ref_String = "";
                    var17_int = 0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (param3.i(-122) <= var17_int) {
                        statePc = 93;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var16_ref_String = var16_ref_String + "<img=6>";
                    var17_int++;
                    if (var19 != 0) {
                        statePc = 120;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (var19 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var15_ref_gh = new gh((long)param3.field_N, kh.field_s, var16_ref_String);
                    var15_ref_gh.a(0, var14_int, 20, var11 - 4, var5_int + -var11);
                    var8.a(var15_ref_gh, 123);
                    var14_int += 14;
                    if (var19 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var14_int = var13.field_L.a(var13.field_S, var13.field_zb - var13.field_ub * 2, var13.field_Ib) + 6;
                    kh.a(var8, "<img=1>", tc.field_B[param3.field_N], param3.field_N, var14_int, var5_int, 3000, var11, true);
                    var14_int += 14;
                    kh.a(var8, "<img=0>", param3.g(8192), param3.field_N, var14_int, var5_int, 400, var11, true);
                    var14_int += 14;
                    if (0 >= param3.i(-122)) {
                        statePc = 102;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var16_ref_String = "";
                    var17_int = 0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if ((param3.i(param4 + -129) ^ -1) >= (var17_int ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var16_ref_String = var16_ref_String + "<img=6>";
                    var17_int++;
                    if (var19 != 0) {
                        statePc = 102;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var19 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var15_ref_gh = new gh((long)param3.field_N, kh.field_s, var16_ref_String);
                    var15_ref_gh.a(0, var14_int, 20, -4 + var11, var5_int - var11);
                    var8.a(var15_ref_gh, 125);
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (-1 > (param3.j(0) ^ -1)) {
                        statePc = 105;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (param3.field_N == 59) {
                        statePc = 109;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if ((param3.field_N ^ -1) != -78) {
                        statePc = 111;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    stackIn_112_0 = 1;
                    statePc = 112;
                    continue stateLoop;
                }
                case 111: {
                    stackIn_112_0 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var16 = stackIn_112_0;
                    stackIn_115_0 = null;
                    stackIn_113_0 = stackIn_115_0;
                    stackIn_115_1 = null;
                    stackIn_113_1 = stackIn_115_1;
                    stackIn_115_2 = (long)param3.field_N;
                    stackIn_113_2 = stackIn_115_2;
                    stackIn_115_3 = kh.field_s;
                    stackIn_113_3 = stackIn_115_3;
                    if (var16 != 0) {
                        statePc = 115;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_116_0 = null;
                    stackIn_116_1 = null;
                    stackIn_116_2 = stackIn_113_2;
                    stackIn_116_3 = (gh) ((Object) stackIn_113_3);
                    stackIn_116_4 = "<img=3>";
                    statePc = 116;
                    continue stateLoop;
                }
                case 115: {
                    stackIn_116_0 = null;
                    stackIn_116_1 = null;
                    stackIn_116_2 = stackIn_115_2;
                    stackIn_116_3 = (gh) ((Object) stackIn_115_3);
                    stackIn_116_4 = "<img=2><img=3>";
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var15_ref_gh = new gh(stackIn_116_2, stackIn_116_3, stackIn_116_4);
                    var15_ref_gh.a(0, var14_int, 20, var11 - 4, 5 + (-var11 + var5_int));
                    var15_ref_gh.field_Kb = 2;
                    var8.a(var15_ref_gh, param4 + 108);
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (var19 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    kh.a(var8, "<img=1>", tc.field_B[param3.field_N], param3.field_N, 18, var5_int, 500, var11, true);
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    var14 = new gh((long)param3.field_N, (gh) null);
                    var14.a(0, 2, -4 + var7, 2, var11 - 4);
                    var14.field_I = co.field_d;
                    if (1 != param3.field_Q) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (-1 >= (ul.a((byte) -82, param3.field_N) ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    qb.a(param3, var14, (byte) -93, false, -4 + var11, -4 + var7);
                    if (var19 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var15 = ul.a((byte) 83, param3.field_N);
                    var14.field_Pb = new wk(Math.min(64, -4 + var11), Math.min(64, var7 + -4));
                    var14.field_Pb.d();
                    si.field_E[var15].a(0, 0);
                    pb.c();
                    sb.field_bb.b((byte) 121);
                    jg.field_h[var15] = var14;
                    var14.field_Kb = 1;
                    var14.field_Fb = 1;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (!param0) {
                        statePc = 135;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (param1) {
                        statePc = 135;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (var6 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var14.field_Pb.d();
                    pb.c(0, 0, var14.field_Pb.field_A, var14.field_Pb.field_F, 0, 128);
                    if (!param1) {
                        statePc = 144;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (var6 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 143: {
                    pl.field_U.a(mc.field_d, var14.field_Pb.field_A / 2, (pl.field_U.field_G + var14.field_Pb.field_F) / 2, 12632256, 0);
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    sb.field_bb.b((byte) 122);
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    var8.a(var14, 123);
                    if (var6 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var15 = sj.field_F.field_A;
                    var16 = sj.field_F.field_F;
                    var17 = new gh(-1L, (gh) null);
                    var17.a(0, (var14.field_Lb + -var15) / 2 + var14.field_eb, var16, (-var15 + var14.field_zb) / 2 + var14.field_Y, var15);
                    var17.field_Pb = sj.field_F;
                    var8.a(var17, 118);
                    if (var19 == 0) {
                        statePc = 161;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (param2 == 0) {
                        statePc = 161;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var15 = 28;
                    var16 = 28;
                    if (1 == param3.field_Q) {
                        statePc = 153;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var16 += 14;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    var17 = new gh("engineer", (gh) null);
                    var17.a(param4 + -14, (-var15 + var14.field_Lb) / 2 + var14.field_eb, var16, (var14.field_zb - var15) / 2 + var14.field_Y, var15);
                    var17.field_Ab = cm.field_b;
                    var17.field_I = lj.field_b;
                    var17.field_qb = 2;
                    var17.field_sb = 2;
                    var17.field_Pb = b.field_q[param2];
                    var8.a(var17, 123);
                    if (-59 != (param3.field_N ^ -1)) {
                        statePc = 155;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if ((param3.field_Q ^ -1) != -2) {
                        statePc = 161;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var18 = new gh(-1L, (gh) null);
                    var18.field_Kb = 1;
                    var18.field_Fb = 1;
                    var18.field_S = var10 + "%";
                    var18.field_L = (mi) ((Object) fk.field_d);
                    stackIn_159_0 = (gh) (var18);
                    stackIn_157_0 = stackIn_159_0;
                    if (-2 != (param2 ^ -1)) {
                        statePc = 159;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackIn_160_0 = (gh) ((Object) stackIn_157_0);
                    stackIn_160_1 = 65280;
                    statePc = 160;
                    continue stateLoop;
                }
                case 159: {
                    stackIn_160_0 = (gh) ((Object) stackIn_159_0);
                    stackIn_160_1 = 16711680;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    stackIn_160_0.field_nb = stackIn_160_1;
                    var18.a(0, -14 + var17.field_Lb, 14, 0, var17.field_zb);
                    var17.a(var18, 127);
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if ((param3.field_N ^ -1) == -56) {
                        statePc = 164;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 164: {
                    pa.field_d[1].field_a = var8;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if ((param3.field_N ^ -1) == -19) {
                        statePc = 168;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 168: {
                    pa.field_d[7].field_a = var8;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    stackIn_170_0 = (gh) (var8);
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    return stackIn_170_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = new String[]{"Increases your energy gain by <img=7> ~16 GJ/s.", "Increases your energy gain by <img=7> ~33 GJ/s.", "Increases your energy gain by <img=7> ~50 GJ/s.", "Increases your energy gain by <img=7> ~66 GJ/s.", "Increases your energy gain by <img=7> ~83 GJ/s.", "Increase your energy storage by <img=4> 1 TJ.", "Increase your energy storage by <img=4> 2 TJ.", "Increase your energy storage by <img=4> 3 TJ.", "Increase your energy storage by <img=4> 4 TJ.", "Increase your energy storage by <img=4> 5 TJ.", "Provides a <img=5> 100 GJ shield that absorbs energy attacks and explosions.", "Provides a <img=5> 200 GJ shield that absorbs energy attacks and explosions.", "Provides a <img=5> 500 GJ shield that absorbs energy attacks and explosions.", "Provides a <img=5> 1,000 GJ shield that absorbs energy attacks and explosions.", "Provides a <img=5> 2,000 GJ shield that absorbs energy attacks and explosions.", "Detonates a massive EMP explosion that will drain the energy of any sentinel in the vicinity. Uses all of your stored energy.", "Allows you to gain a target lock on enemy sentinels, using <img=4> 1 TJ of energy. Locking on will make missiles home in on the target and direct all gun or laser fire.", "Automatically targets incoming missiles and rockets with any light weapons capable of shooting them down (flak, gun and laser weapons).", "Scrambles target locks on your sentinel.", "Repairs your sentinel slowly over time, as long as it is not taking damage. This module continuously draws power from your reactors.", "A high output reactor that has not yet completed testing for stability.", "Shows more information about your opponents, such as their installed systems and target lock status. Also extends the range of your firing arc projections.", "Reduces the reload time of rockets and missiles by half.", "Halves the energy requirements of plasma weapons.", "Allows you to teleport across the map to a safe location. Requires at least <img=4> 5 TJ of energy, and exhausts your energy bank when activated.", "Doubles the damage output of your laser weapons, but also doubles their energy use.", "Recharges your energy shield when your sentinel takes damage.", "Removes the energy-sapping effects of EMP attacks.", "Increases your <img=2> jumping ability and reduces skidding.", "Increases your <img=3> thrusting efficiency and allows you to continue thrusting even after being hit in the air.", "Makes your sentinel hard to target and pinpoint, by providing a cloaking system. The cloak will deactivate when taking damage or firing.", "Allows any weapon to be used while in the air.", "Absorbs kinetic damage from bullets, flak and kinetic weapons.", "Absorbs explosive damage from shells, missiles and rockets."};
        field_d = "LOCK";
        field_c = new rm(1);
    }
}
