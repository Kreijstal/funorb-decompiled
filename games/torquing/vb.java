/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static ei field_f;
    static java.awt.Font field_d;
    static pj[] field_c;
    private int[] field_a;
    static String field_e;
    static String field_b;

    final static int a(String param0, String param1, byte param2, boolean param3, boolean param4, int param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            int stackIn_11_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_86_0 = 0;
            int stackIn_128_0 = 0;
            boolean stackIn_137_0 = false;
            int stackIn_147_0 = 0;
            int stackIn_149_0 = 0;
            int stackIn_166_0 = 0;
            int stackIn_168_0 = 0;
            RuntimeException stackIn_171_0 = null;
            StringBuilder stackIn_171_1 = null;
            RuntimeException stackIn_173_0 = null;
            StringBuilder stackIn_173_1 = null;
            RuntimeException stackIn_174_0 = null;
            StringBuilder stackIn_174_1 = null;
            String stackIn_174_2 = null;
            RuntimeException stackIn_175_0 = null;
            StringBuilder stackIn_175_1 = null;
            RuntimeException stackIn_177_0 = null;
            StringBuilder stackIn_177_1 = null;
            RuntimeException stackIn_178_0 = null;
            StringBuilder stackIn_178_1 = null;
            String stackIn_178_2 = null;
            int stackOut_10_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_85_0 = 0;
            int stackOut_127_0 = 0;
            boolean stackOut_136_0 = false;
            int stackOut_146_0 = 0;
            int stackOut_148_0 = 0;
            int stackOut_165_0 = 0;
            int stackOut_167_0 = 0;
            RuntimeException stackOut_170_0 = null;
            StringBuilder stackOut_170_1 = null;
            RuntimeException stackOut_171_0 = null;
            StringBuilder stackOut_171_1 = null;
            String stackOut_171_2 = null;
            RuntimeException stackOut_173_0 = null;
            StringBuilder stackOut_173_1 = null;
            String stackOut_173_2 = null;
            RuntimeException stackOut_174_0 = null;
            StringBuilder stackOut_174_1 = null;
            RuntimeException stackOut_175_0 = null;
            StringBuilder stackOut_175_1 = null;
            String stackOut_175_2 = null;
            RuntimeException stackOut_177_0 = null;
            StringBuilder stackOut_177_1 = null;
            String stackOut_177_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Torquing.field_u;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param2 == 27) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 169 : 4);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_b = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof RuntimeException ? 169 : 4);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (null != vk.field_E) {
                                statePc = 12;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var6_int = mo.a(269, param3) ? 1 : 0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var6_int == 0) {
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
                            statePc = 12;
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
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = -1;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0;
                    }
                    case 12: {
                        try {
                            if (ef.field_a == tb.field_o) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof RuntimeException ? 169 : 14);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof RuntimeException ? 169 : 14);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (param3) {
                                statePc = 19;
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
                            eh.field_i = ab.a(param1, param0, 130, false);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            eh.field_i = tp.a((byte) -51, false, param0, (String) null, qd.field_e);
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
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            wa.field_d.field_n = 0;
                            wa.field_d.b(90, 14);
                            wa.field_d.b(90, eh.field_i.a(false).field_a);
                            jd.a((byte) -122, -1);
                            ef.field_a = en.field_v;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (en.field_v == ef.field_a) {
                                statePc = 26;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (!no.a(1, 0)) {
                                statePc = 36;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var6_int = kj.field_d.i((byte) -101);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (0 == var6_int) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            oo.field_a = -1;
                            ef.field_a = ld.field_e;
                            fa.field_e = var6_int;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ef.field_a = aa.field_U;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            kj.field_d.field_n = 0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (aa.field_U != ef.field_a) {
                                statePc = 43;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (!no.a(8, 0)) {
                                statePc = 43;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ij.field_l = kj.field_d.b(48);
                            kj.field_d.field_n = 0;
                            id.a(eh.field_i, param5, param3, 19, param4);
                            ef.field_a = qi.field_a;
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
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (ef.field_a == qi.field_a) {
                                statePc = 46;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (no.a(1, 0)) {
                                statePc = 49;
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
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var6_int = kj.field_d.i((byte) -101);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            fa.field_e = var6_int;
                            kj.field_d.field_n = 0;
                            wh.field_u = null;
                            if (var6_int == 0) {
                                statePc = 61;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            stackOut_51_0 = 1;
                            stackIn_52_0 = stackOut_51_0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (stackIn_52_0 == var6_int) {
                                statePc = 61;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (8 != var6_int) {
                                statePc = 60;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ih.b(true);
                            lh.field_J = false;
                            stackOut_58_0 = var6_int;
                            stackIn_59_0 = stackOut_58_0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        return stackIn_59_0;
                    }
                    case 60: {
                        try {
                            ef.field_a = ld.field_e;
                            oo.field_a = -1;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof RuntimeException ? 169 : 63);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            ef.field_a = p.field_t;
                            oo.field_a = -1;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof RuntimeException ? 169 : 63);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (p.field_t != ef.field_a) {
                                statePc = 129;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (ah.a(2)) {
                                statePc = 70;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 129;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            qd.field_e = kj.field_d.b(param2 + 44);
                            ri.field_E = kj.field_d.i((byte) -101);
                            int discarded$6 = kj.field_d.i((byte) -101);
                            wp.field_w = kj.field_d.i(7088);
                            var6_ref = kj.field_d.a(param2 + -8);
                            var7 = kj.field_d.i((byte) -101);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (0 == (1 & var7)) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            pc.b(false);
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (!param3) {
                                statePc = 78;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 77;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 77;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (0 == (4 & var7)) {
                                statePc = 81;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 80;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            stackOut_79_0 = 1;
                            stackIn_82_0 = stackOut_79_0;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 80;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            stackOut_81_0 = 0;
                            stackIn_82_0 = stackOut_81_0;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            fj.field_l = stackIn_82_0 != 0;
                            if ((var7 & 8) == 0) {
                                statePc = 85;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            stackOut_83_0 = 1;
                            stackIn_86_0 = stackOut_83_0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            stackOut_85_0 = 0;
                            stackIn_86_0 = stackOut_85_0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            qi.field_c = stackIn_86_0 != 0;
                            if (!qi.field_c) {
                                statePc = 87;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (!ql.field_t) {
                                statePc = 93;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            int discarded$7 = kj.field_d.i((byte) -101);
                            int discarded$8 = kj.field_d.i((byte) -101);
                            int discarded$9 = kj.field_d.c((byte) -85);
                            mf.field_w = kj.field_d.i(param2 ^ 7083);
                            uf.field_n = new byte[mf.field_w];
                            var8 = 0;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if ((mf.field_w ^ -1) >= (var8 ^ -1)) {
                                statePc = 93;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            uf.field_n[var8] = kj.field_d.f((byte) 111);
                            var8++;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 92;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            re.field_e = kj.field_d.h((byte) 126);
                            tj.field_j = hf.a((CharSequence) (Object) re.field_e, param2 + 82);
                            pa.field_c = kj.field_d.i((byte) -101);
                            ef.field_a = w.field_cb;
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (eh.field_i.a(false) == im.field_J) {
                                statePc = 101;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (eh.field_i.a(false) == hg.field_f) {
                                statePc = 100;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 99;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 99;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 99;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 99;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            h.field_l.a(ip.a(param2 ^ 18), false);
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            mf.field_u.a(ip.a(param2 + -18), false);
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            lh.field_J = false;
                            if (null == var6_ref) {
                                statePc = 108;
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
                            om.a((byte) -75, var6_ref, ip.a(9));
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            if (-1 > (wp.field_w ^ -1)) {
                                statePc = 112;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            if (!fj.field_l) {
                                statePc = 115;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            Object discarded$10 = hp.a(ip.a(param2 + -18), new Object[1], 28989, "zap");
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var8_ref_Throwable = caughtException;
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            Object discarded$11 = hp.a(ip.a(9), (byte) -85, "unzap");
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            var8_ref_Throwable = caughtException;
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            if (-1 > (wp.field_w ^ -1)) {
                                statePc = 121;
                            } else {
                                statePc = 119;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            statePc = 122;
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            ao.field_b = true;
                            statePc = 122;
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            wa.field_d.a((byte) -111, od.field_s);
                            var8 = 0;
                            statePc = 123;
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        try {
                            if (var8 >= 4) {
                                statePc = 127;
                            } else {
                                statePc = 124;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_123) {
                            caughtException = stateCaught_123;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            od.field_s[var8] = od.field_s[var8] + 50;
                            var8++;
                            statePc = 123;
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = 126;
                            continue stateLoop;
                        }
                    }
                    case 126: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        try {
                            kj.field_d.a((byte) -114, od.field_s);
                            stackOut_127_0 = fa.field_e;
                            stackIn_128_0 = stackOut_127_0;
                            statePc = 128;
                            continue stateLoop;
                        } catch (Throwable stateCaught_127) {
                            caughtException = stateCaught_127;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 128: {
                        return stackIn_128_0;
                    }
                    case 129: {
                        try {
                            if (ld.field_e != ef.field_a) {
                                statePc = 150;
                            } else {
                                statePc = 130;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = (stateCaught_129 instanceof RuntimeException ? 169 : 132);
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            if (!ah.a(2)) {
                                statePc = 150;
                            } else {
                                statePc = 131;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = 135;
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            statePc = 133;
                            continue stateLoop;
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = 135;
                            continue stateLoop;
                        }
                    }
                    case 132: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_132) {
                            caughtException = stateCaught_132;
                            statePc = 135;
                            continue stateLoop;
                        }
                    }
                    case 133: {
                        try {
                            ih.b(true);
                            if (7 != fa.field_e) {
                                statePc = 140;
                            } else {
                                statePc = 134;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_133) {
                            caughtException = stateCaught_133;
                            statePc = 139;
                            continue stateLoop;
                        }
                    }
                    case 134: {
                        try {
                            statePc = 136;
                            continue stateLoop;
                        } catch (Throwable stateCaught_134) {
                            caughtException = stateCaught_134;
                            statePc = 139;
                            continue stateLoop;
                        }
                    }
                    case 135: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_135) {
                            caughtException = stateCaught_135;
                            statePc = 139;
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            stackOut_136_0 = lh.field_J;
                            stackIn_137_0 = stackOut_136_0;
                            statePc = 137;
                            continue stateLoop;
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = 139;
                            continue stateLoop;
                        }
                    }
                    case 137: {
                        try {
                            if (!stackIn_137_0) {
                                statePc = 148;
                            } else {
                                statePc = 138;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_137) {
                            caughtException = stateCaught_137;
                            statePc = 142;
                            continue stateLoop;
                        }
                    }
                    case 138: {
                        try {
                            statePc = 140;
                            continue stateLoop;
                        } catch (Throwable stateCaught_138) {
                            caughtException = stateCaught_138;
                            statePc = 142;
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = 142;
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            if ((fa.field_e ^ -1) != -8) {
                                statePc = 146;
                            } else {
                                statePc = 141;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = 145;
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            statePc = 143;
                            continue stateLoop;
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = 145;
                            continue stateLoop;
                        }
                    }
                    case 142: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_142) {
                            caughtException = stateCaught_142;
                            statePc = 145;
                            continue stateLoop;
                        }
                    }
                    case 143: {
                        try {
                            fa.field_e = 3;
                            statePc = 144;
                            continue stateLoop;
                        } catch (Throwable stateCaught_143) {
                            caughtException = stateCaught_143;
                            statePc = 145;
                            continue stateLoop;
                        }
                    }
                    case 144: {
                        try {
                            statePc = 146;
                            continue stateLoop;
                        } catch (Throwable stateCaught_144) {
                            caughtException = stateCaught_144;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 145: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_145) {
                            caughtException = stateCaught_145;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 146: {
                        try {
                            pl.field_u = kj.field_d.h((byte) 125);
                            lh.field_J = false;
                            stackOut_146_0 = fa.field_e;
                            stackIn_147_0 = stackOut_146_0;
                            statePc = 147;
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        return stackIn_147_0;
                    }
                    case 148: {
                        try {
                            lh.field_J = true;
                            stackOut_148_0 = -1;
                            stackIn_149_0 = stackOut_148_0;
                            statePc = 149;
                            continue stateLoop;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        return stackIn_149_0;
                    }
                    case 150: {
                        try {
                            if (null == vk.field_E) {
                                statePc = 153;
                            } else {
                                statePc = 151;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_150) {
                            caughtException = stateCaught_150;
                            statePc = (stateCaught_150 instanceof RuntimeException ? 169 : 152);
                            continue stateLoop;
                        }
                    }
                    case 151: {
                        try {
                            statePc = 167;
                            continue stateLoop;
                        } catch (Throwable stateCaught_151) {
                            caughtException = stateCaught_151;
                            statePc = (stateCaught_151 instanceof RuntimeException ? 169 : 152);
                            continue stateLoop;
                        }
                    }
                    case 152: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_152) {
                            caughtException = stateCaught_152;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 153: {
                        try {
                            if (lh.field_J) {
                                statePc = 156;
                            } else {
                                statePc = 154;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_153) {
                            caughtException = stateCaught_153;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 154: {
                        try {
                            var6_int = ea.field_t;
                            statePc = 155;
                            continue stateLoop;
                        } catch (Throwable stateCaught_154) {
                            caughtException = stateCaught_154;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 155: {
                        try {
                            ea.field_t = sf.field_a;
                            lh.field_J = true;
                            sf.field_a = var6_int;
                            statePc = 167;
                            continue stateLoop;
                        } catch (Throwable stateCaught_155) {
                            caughtException = stateCaught_155;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 156: {
                        try {
                            if (lc.h((byte) -76) <= 30000L) {
                                statePc = 162;
                            } else {
                                statePc = 157;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_156) {
                            caughtException = stateCaught_156;
                            statePc = 161;
                            continue stateLoop;
                        }
                    }
                    case 157: {
                        try {
                            statePc = 159;
                            continue stateLoop;
                        } catch (Throwable stateCaught_157) {
                            caughtException = stateCaught_157;
                            statePc = 161;
                            continue stateLoop;
                        }
                    }
                    case 158: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_158) {
                            caughtException = stateCaught_158;
                            statePc = 161;
                            continue stateLoop;
                        }
                    }
                    case 159: {
                        try {
                            pl.field_u = eb.field_h;
                            statePc = 165;
                            continue stateLoop;
                        } catch (Throwable stateCaught_159) {
                            caughtException = stateCaught_159;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 161: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_161) {
                            caughtException = stateCaught_161;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 162: {
                        try {
                            pl.field_u = hq.field_e;
                            statePc = 163;
                            continue stateLoop;
                        } catch (Throwable stateCaught_162) {
                            caughtException = stateCaught_162;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 163: {
                        try {
                            statePc = 165;
                            continue stateLoop;
                        } catch (Throwable stateCaught_163) {
                            caughtException = stateCaught_163;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 164: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_164) {
                            caughtException = stateCaught_164;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 165: {
                        try {
                            lh.field_J = false;
                            stackOut_165_0 = 3;
                            stackIn_166_0 = stackOut_165_0;
                            statePc = 166;
                            continue stateLoop;
                        } catch (Throwable stateCaught_165) {
                            caughtException = stateCaught_165;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 166: {
                        return stackIn_166_0;
                    }
                    case 167: {
                        try {
                            stackOut_167_0 = -1;
                            stackIn_168_0 = stackOut_167_0;
                            statePc = 168;
                            continue stateLoop;
                        } catch (Throwable stateCaught_167) {
                            caughtException = stateCaught_167;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 168: {
                        return stackIn_168_0;
                    }
                    case 169: {
                        var6 = (RuntimeException) (Object) caughtException;
                        statePc = 170;
                        continue stateLoop;
                    }
                    case 170: {
                        try {
                            stackOut_170_0 = (RuntimeException) var6;
                            stackOut_170_1 = new StringBuilder().append("vb.B(");
                            stackIn_173_0 = stackOut_170_0;
                            stackIn_173_1 = stackOut_170_1;
                            stackIn_171_0 = stackOut_170_0;
                            stackIn_171_1 = stackOut_170_1;
                            if (param0 == null) {
                                statePc = 173;
                            } else {
                                statePc = 171;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_170) {
                            caughtException = stateCaught_170;
                            statePc = 172;
                            continue stateLoop;
                        }
                    }
                    case 171: {
                        try {
                            stackOut_171_0 = (RuntimeException) (Object) stackIn_171_0;
                            stackOut_171_1 = (StringBuilder) (Object) stackIn_171_1;
                            stackOut_171_2 = "{...}";
                            stackIn_174_0 = stackOut_171_0;
                            stackIn_174_1 = stackOut_171_1;
                            stackIn_174_2 = stackOut_171_2;
                            statePc = 174;
                            continue stateLoop;
                        } catch (Throwable stateCaught_171) {
                            caughtException = stateCaught_171;
                            statePc = 172;
                            continue stateLoop;
                        }
                    }
                    case 172: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 173: {
                        stackOut_173_0 = (RuntimeException) (Object) stackIn_173_0;
                        stackOut_173_1 = (StringBuilder) (Object) stackIn_173_1;
                        stackOut_173_2 = "null";
                        stackIn_174_0 = stackOut_173_0;
                        stackIn_174_1 = stackOut_173_1;
                        stackIn_174_2 = stackOut_173_2;
                        statePc = 174;
                        continue stateLoop;
                    }
                    case 174: {
                        try {
                            stackOut_174_0 = (RuntimeException) (Object) stackIn_174_0;
                            stackOut_174_1 = ((StringBuilder) (Object) stackIn_174_1).append(stackIn_174_2).append(44);
                            stackIn_177_0 = stackOut_174_0;
                            stackIn_177_1 = stackOut_174_1;
                            stackIn_175_0 = stackOut_174_0;
                            stackIn_175_1 = stackOut_174_1;
                            if (param1 == null) {
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
                            stackOut_175_0 = (RuntimeException) (Object) stackIn_175_0;
                            stackOut_175_1 = (StringBuilder) (Object) stackIn_175_1;
                            stackOut_175_2 = "{...}";
                            stackIn_178_0 = stackOut_175_0;
                            stackIn_178_1 = stackOut_175_1;
                            stackIn_178_2 = stackOut_175_2;
                            statePc = 178;
                            continue stateLoop;
                        } catch (Throwable stateCaught_175) {
                            caughtException = stateCaught_175;
                            statePc = 176;
                            continue stateLoop;
                        }
                    }
                    case 176: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 177: {
                        stackOut_177_0 = (RuntimeException) (Object) stackIn_177_0;
                        stackOut_177_1 = (StringBuilder) (Object) stackIn_177_1;
                        stackOut_177_2 = "null";
                        stackIn_178_0 = stackOut_177_0;
                        stackIn_178_1 = stackOut_177_1;
                        stackIn_178_2 = stackOut_177_2;
                        statePc = 178;
                        continue stateLoop;
                    }
                    case 178: {
                        throw rb.a((Throwable) (Object) stackIn_178_0, stackIn_178_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static bp a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        bp stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Object stackOut_10_0 = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        bp stackOut_18_0 = null;
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
                    var5 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        var3 = 0;
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
                        if ((var3 ^ -1) <= (var2_int ^ -1)) {
                            statePc = 13;
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
                        var4 = param1.charAt(var3);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (48 > var4) {
                            statePc = 10;
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
                        if (-58 <= (var4 ^ -1)) {
                            statePc = 12;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = null;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return (bp) (Object) stackIn_11_0;
                }
                case 12: {
                    try {
                        var3++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = param0;
                        stackOut_13_1 = 4;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == stackIn_14_1) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        field_d = null;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = va.field_H;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) var2;
                        stackOut_21_1 = new StringBuilder().append("vb.F(").append(param0).append(44);
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (param1 == null) {
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
                    throw rb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          stackOut_0_0 = param0 ^ param1;
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return 0L;
    }

    final static void a(of param0, byte param1, boolean param2, int[] param3, int[] param4, boolean param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
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
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        Object stackIn_31_0 = null;
        of stackIn_35_0 = null;
        of stackIn_39_0 = null;
        of stackIn_43_0 = null;
        Object stackIn_47_0 = null;
        of stackIn_51_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        Object stackOut_30_0 = null;
        of stackOut_34_0 = null;
        of stackOut_38_0 = null;
        of stackOut_42_0 = null;
        Object stackOut_46_0 = null;
        of stackOut_50_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param3[3] >> 517023714;
                        var22 = param3[4] >> 111208226;
                        var23 = param3[5] >> 772715554;
                        var24 = param3[6] >> -922600190;
                        var25 = param3[7] >> 1997382626;
                        var26 = param3[8] >> 2007497762;
                        var27 = param3[9] >> 1683189730;
                        var28 = param3[10] >> 2119630434;
                        var29 = param3[11] >> 1190166498;
                        var13 = var24 * param4[3] - (-(param4[4] * var25) - param4[5] * var26) >> 1870256750;
                        var12 = var23 * param4[5] + var22 * param4[4] + var21 * param4[3] >> 736439694;
                        var19 = var26 * param4[11] + param4[10] * var25 + param4[9] * var24 >> -843360722;
                        var18 = var22 * param4[10] + var21 * param4[9] + param4[11] * var23 >> 801816878;
                        var20 = var27 * param4[9] + (param4[10] * var28 + param4[11] * var29) >> -1199575442;
                        var16 = var26 * param4[8] + var25 * param4[7] + param4[6] * var24 >> -332738642;
                        var17 = param4[8] * var29 + (var28 * param4[7] + var27 * param4[6]) >> -1952218962;
                        var14 = param4[4] * var28 + (var27 * param4[3] - -(param4[5] * var29)) >> 1936421230;
                        var15 = var22 * param4[7] + var21 * param4[6] - -(var23 * param4[8]) >> 301812238;
                        var21 = -param3[0] + param4[0];
                        var22 = param4[1] + -param3[1];
                        var23 = -param3[2] + param4[2];
                        var9 = var23 * param3[5] + (var21 * param3[3] - -(param3[4] * var22)) >> -oe.field_b + 16;
                        var10 = param3[8] * var23 + (param3[7] * var22 + param3[6] * var21) >> -oe.field_b + 16;
                        var11 = param3[9] * var21 - (-(var22 * param3[10]) + -(var23 * param3[11])) >> 1702762960;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1 == -77) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vb.a(96);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var21 = be.field_g;
                        var22 = be.field_b;
                        var23 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param0.field_f ^ -1) >= (var23 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var24 = param0.field_B[var23];
                        var25 = param0.field_j[var23];
                        var26 = param0.field_d[var23];
                        var27 = var9 + (var15 * var25 + var12 * var24 + var26 * var18 >> 16 - oe.field_b);
                        var28 = var10 + (var25 * var16 + (var24 * var13 - -(var19 * var26)) >> 16 - oe.field_b);
                        var29 = (var26 * var20 + var25 * var17 + var14 * var24 >> 1108730512) + var11;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var29 < 50) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        kh.field_m[var23] = var27 / var29 + var21;
                        u.field_w[var23] = var28 / var29 + var22;
                        if (var7_int > var29) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7_int = var29;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        hl.field_b[var23] = var29;
                        if (var29 <= var8) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = var29;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 79;
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
                        hl.field_b[var23] = -2147483648;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param6) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        dj.field_c[var23] = var27 >> oe.field_b;
                        gi.field_a[var23] = var28 >> oe.field_b;
                        ud.field_k[var23] = var29;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var23++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null == param0.field_N) {
                            statePc = 67;
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
                        stackOut_30_0 = null;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == (Object) (Object) param0.field_v) {
                            statePc = 67;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = (of) param0;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0.field_w == null) {
                            statePc = 67;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = (of) param0;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0.field_L == null) {
                            statePc = 67;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (of) param0;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0.field_k == null) {
                            statePc = 67;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = null;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 == (Object) (Object) param0.field_h) {
                            statePc = 67;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = (of) param0;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0.field_K == null) {
                            statePc = 67;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = null;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 == (Object) (Object) param0.field_D) {
                            statePc = 67;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (param0.field_n == null) {
                            statePc = 67;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var23 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var23 >= param0.field_R) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var24 = param0.field_N[var23];
                        var25 = param0.field_v[var23];
                        var26 = param0.field_w[var23];
                        in.field_b[var23] = (var18 * var26 + var12 * var24 + var25 * var15 >> -1842954800) + var9;
                        io.field_s[var23] = var10 - -(var19 * var26 + (var25 * var16 + var13 * var24) >> 2061036144);
                        vk.field_z[var23] = var11 + (var24 * var14 - -(var25 * var17) + var26 * var20 >> -604297040);
                        var24 = param0.field_L[var23];
                        var25 = param0.field_k[var23];
                        var26 = param0.field_h[var23];
                        pc.field_d[var23] = (var26 * var18 + (var24 * var12 - -(var15 * var25)) >> 1707507280) + var9;
                        no.field_j[var23] = (var16 * var25 + (var24 * var13 + var19 * var26) >> 1511937968) + var10;
                        up.field_b[var23] = var11 - -(var20 * var26 + var25 * var17 + var14 * var24 >> -1364043856);
                        var24 = param0.field_K[var23];
                        var25 = param0.field_D[var23];
                        var26 = param0.field_n[var23];
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ok.field_D[var23] = var9 + (var18 * var26 + (var12 * var24 + var15 * var25) >> 266460432);
                        hm.field_s[var23] = var10 - -(var16 * var25 + (var24 * var13 - -(var19 * var26)) >> -226659344);
                        uf.field_r[var23] = (var26 * var20 + var25 * var17 + var14 * var24 >> 730965488) + var11;
                        var23++;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (param5) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var9 = param4[3];
                        var10 = param4[4];
                        var11 = param4[5];
                        var12 = param4[6];
                        var13 = param4[7];
                        var14 = param4[8];
                        var15 = param4[9];
                        var16 = param4[10];
                        var17 = param4[11];
                        var18 = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = var18 ^ -1;
                        stackOut_71_1 = param0.field_C ^ -1;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (stackIn_72_0 <= stackIn_72_1) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((m.field_c.length ^ -1) >= (var18 ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var19 = param0.field_q[var18];
                        var20 = param0.field_P[var18];
                        var21 = param0.field_a[var18];
                        m.field_c[var18] = var20 * var12 + (var9 * var19 - -(var15 * var21)) >> 999459088;
                        pm.field_s[var18] = var13 * var20 + var19 * var10 + var21 * var16 >> -1169515184;
                        tm.field_e[var18] = var21 * var17 + var11 * var19 - -(var14 * var20) >> -1820118576;
                        var18++;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        vf.a(param0, var7_int, var8, param2, (byte) 120);
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 79: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    try {
                        stackOut_80_0 = (RuntimeException) var7;
                        stackOut_80_1 = new StringBuilder().append("vb.D(");
                        stackIn_83_0 = stackOut_80_0;
                        stackIn_83_1 = stackOut_80_1;
                        stackIn_81_0 = stackOut_80_0;
                        stackIn_81_1 = stackOut_80_1;
                        if (param0 == null) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
                        stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
                        stackOut_81_2 = "{...}";
                        stackIn_84_0 = stackOut_81_0;
                        stackIn_84_1 = stackOut_81_1;
                        stackIn_84_2 = stackOut_81_2;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 83: {
                    stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
                    stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
                    stackOut_83_2 = "null";
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    stackIn_84_2 = stackOut_83_2;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    try {
                        stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
                        stackOut_84_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_87_0 = stackOut_84_0;
                        stackIn_87_1 = stackOut_84_1;
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        if (param3 == null) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
                        stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
                        stackOut_85_2 = "{...}";
                        stackIn_88_0 = stackOut_85_0;
                        stackIn_88_1 = stackOut_85_1;
                        stackIn_88_2 = stackOut_85_2;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 87: {
                    stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
                    stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
                    stackOut_87_2 = "null";
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    stackIn_88_2 = stackOut_87_2;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    try {
                        stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
                        stackOut_88_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(44);
                        stackIn_91_0 = stackOut_88_0;
                        stackIn_91_1 = stackOut_88_1;
                        stackIn_89_0 = stackOut_88_0;
                        stackIn_89_1 = stackOut_88_1;
                        if (param4 == null) {
                            statePc = 91;
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
                        stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
                        stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
                        stackOut_89_2 = "{...}";
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_92_1 = stackOut_89_1;
                        stackIn_92_2 = stackOut_89_2;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 91: {
                    stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
                    stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
                    stackOut_91_2 = "null";
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    stackIn_92_2 = stackOut_91_2;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    throw rb.a((Throwable) (Object) stackIn_92_0, stackIn_92_2 + 44 + param5 + 44 + param6 + 41);
                }
                case 93: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -485) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_e = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = (((vb) this).field_a.length >> 590681601) + -1;
                        var4 = param0 & var3_int;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = ((vb) this).field_a[var4 + (var4 + 1)];
                        if ((var5 ^ -1) != 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = -1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        stackOut_9_0 = param0;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == ((vb) this).field_a[var4 + var4]) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
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
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var5;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    try {
                        var4 = 1 + var4 & var3_int;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var3, "vb.E(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, String param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        km.a(30);
                        dc.field_a.h(63);
                        un.field_k = new pe(eo.field_a, (String) null, ff.field_a, param0, param2);
                        if (param3 == 4805) {
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
                        vb.a((of) null, (byte) 25, false, (int[]) null, (int[]) null, false, true);
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
                        hb.field_x = new qc(dc.field_a, (gm) (Object) un.field_k);
                        dc.field_a.a((gm) (Object) hb.field_x, (byte) 113);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var4;
                        stackOut_7_1 = new StringBuilder().append("vb.H(").append(param0).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param1 == null) {
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
                    throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
                }
                case 12: {
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
              field_f = null;
              if (param0 > 3) {
                break L0;
              } else {
                bp discarded$2 = vb.a(56, (String) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_e = null;
          field_d = null;
          field_b = null;
          field_c = null;
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param3 == 32) {
                break L0;
              } else {
                int discarded$2 = vb.a((String) null, (String) null, (byte) -26, false, true, 109);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = sh.b(0);
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    vb(int[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int > param0.length - -(param0.length >> 1985557825)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = var2_int << 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((vb) this).field_a = new int[var2_int + var2_int];
                        var3 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var3 ^ -1) <= (var2_int + var2_int ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((vb) this).field_a[var3] = -1;
                        var3++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param0.length <= var3) {
                            statePc = 30;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4 = var2_int - 1 & param0[var3];
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((((vb) this).field_a[1 + (var4 + var4)] ^ -1) == 0) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = -1 + var2_int & var4 + 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((vb) this).field_a[var4 + var4] = param0[var3];
                        ((vb) this).field_a[var4 + (var4 + 1)] = var3;
                        var3++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) var2;
                        stackOut_25_1 = new StringBuilder().append("vb.<init>(");
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (param0 == null) {
                            statePc = 28;
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
                        stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                        stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                        stackOut_26_2 = "{...}";
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_29_2 = stackOut_26_2;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 28: {
                    stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                    stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                    stackOut_28_2 = "null";
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw rb.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
                }
                case 30: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new pj[32];
        field_f = new ei();
        field_e = "SOUND:";
        field_b = "Click";
    }
}
