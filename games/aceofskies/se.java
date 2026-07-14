/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String field_a;
    static da field_c;
    static int field_b;

    public static void a(byte param0) {
        try {
            int var1_int = -15 / ((param0 - 79) / 44);
            field_a = null;
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "se.A(" + param0 + 41);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        dl var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref = null;
        int var4 = 0;
        cl var5 = null;
        String var6 = null;
        String var7 = null;
        cl var7_ref = null;
        int var8 = 0;
        int stackIn_17_0 = 0;
        cl stackIn_65_0 = null;
        boolean stackIn_66_0 = false;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        cl stackOut_64_0 = null;
        boolean stackOut_65_0 = false;
        int stackOut_74_0 = 0;
        int stackOut_75_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= -64) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        se.a((byte) -70);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var1_ref = nm.field_c;
                        var2 = var1_ref.g(-58);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var2 ^ -1) == -1) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (gi.field_g == null) {
                            statePc = 12;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        gi.field_g = new es(128);
                        hl.field_a = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (1 != var1_ref.g(-60)) {
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
                        stackOut_14_0 = 1;
                        stackIn_17_0 = stackOut_14_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3_int = stackIn_17_0;
                        var4_ref = var1_ref.h(-17883);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var3_int == 0) {
                            statePc = 22;
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
                        String discarded$1 = var1_ref.h(-17883);
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
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = fg.a(var4_ref, 17680);
                        var6 = var1_ref.h(-17883);
                        var7 = vu.a(125, (CharSequence) (Object) var4_ref);
                        if (var7 != null) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = var4_ref;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null == var5) {
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
                        statePc = 32;
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
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5 = fg.a(var6, 17680);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (null == var5) {
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
                        gi.field_g.a((wt) (Object) var5, (long)var7.hashCode(), (byte) 56);
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
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var5 != null) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5 = new cl();
                        gi.field_g.a((wt) (Object) var5, (long)var7.hashCode(), (byte) 56);
                        hl.field_a = hl.field_a + 1;
                        var5.field_cb = hl.field_a;
                        nh.field_d.a(75, (wf) (Object) var5);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var5.field_I = var4_ref;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return;
                }
                case 36: {
                    try {
                        if (var2 != 1) {
                            statePc = 79;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == pj.field_a) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        pj.field_a = new es(128);
                        wo.field_o = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3 = var1_ref.h(-17883);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var3.equals((Object) (Object) "")) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var3 = null;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var4_ref = var1_ref.h(-17883);
                        var5 = (cl) (Object) var1_ref.h(-17883);
                        var6 = (String) (Object) kg.a(var4_ref, (byte) 61);
                        if (null != var6) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var6 = (String) (Object) kg.a((String) (Object) var5, (byte) 61);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var6 != null) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        pj.field_a.a((wt) (Object) var6, (long)vu.a(126, (CharSequence) (Object) var4_ref).hashCode(), (byte) 56);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var6 == null) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var6 = (String) (Object) new cl();
                        pj.field_a.a((wt) (Object) var6, (long)vu.a(126, (CharSequence) (Object) var4_ref).hashCode(), (byte) 56);
                        wo.field_o = wo.field_o + 1;
                        ((cl) (Object) var6).field_cb = wo.field_o;
                        rh.field_f.a(71, (wf) (Object) var6);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (null != var3) {
                            statePc = 61;
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
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var3 = var3.intern();
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        ((cl) (Object) var6).field_bb = var3;
                        ((cl) (Object) var6).field_I = var4_ref;
                        ((cl) (Object) var6).c(-123);
                        var7_ref = (cl) rh.field_f.d(268435455);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var7_ref == null) {
                            statePc = 70;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = (cl) var7_ref;
                        stackIn_65_0 = stackOut_64_0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = cs.a((cl) (Object) stackIn_65_0, -115, (cl) (Object) var6);
                        stackIn_77_0 = stackOut_65_0 ? 1 : 0;
                        stackIn_66_0 = stackOut_65_0;
                        if (var8 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (!stackIn_66_0) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var7_ref = (cl) rh.field_f.b((byte) 103);
                        if (var8 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (null != var7_ref) {
                            statePc = 74;
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
                        rh.field_f.a(120, (wf) (Object) var6);
                        if (var8 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = -20;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = stackIn_75_0;
                        stackIn_77_0 = stackOut_75_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ml.a((byte) stackIn_77_0, (wf) (Object) var7_ref, (wf) (Object) var6);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 78: {
                    return;
                }
                case 79: {
                    try {
                        if (2 != var2) {
                            statePc = 87;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if ((eo.field_a ^ -1) == -2) {
                            statePc = 85;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
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
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        eo.field_a = 2;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 86: {
                    return;
                }
                case 87: {
                    try {
                        if (-4 != (var2 ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (2 == eo.field_a) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        eo.field_a = 1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 94: {
                    return;
                }
                case 95: {
                    try {
                        if (var2 == 4) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        eo.field_a = 1;
                        var3 = var1_ref.h(-17883);
                        ul.field_s = var3.intern();
                        var4 = var1_ref.g(-46);
                        lg.a(var4, 2);
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    return;
                }
                case 100: {
                    try {
                        v.a("F1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                        te.b(true);
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw pn.a((Throwable) (Object) var1, "se.B(" + param0 + 41);
                }
                case 103: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
