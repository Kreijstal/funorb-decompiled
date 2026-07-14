/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static String field_a;
    static String field_d;
    static ut field_e;
    static boolean field_c;
    static int field_b;

    public static void a(boolean param0) {
        try {
            field_a = null;
            field_d = null;
            field_e = null;
            if (param0) {
                uo discarded$0 = tt.a(60, (byte[]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "tt.B(" + param0 + 41);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        ml var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref = null;
        int var4 = 0;
        String var5 = null;
        gg var6 = null;
        String var7 = null;
        gg var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_13_0 = 0;
        gg stackIn_59_0 = null;
        gg stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        gg stackIn_60_2 = null;
        gg stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        gg stackIn_66_2 = null;
        gg stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        gg stackIn_68_2 = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        gg stackOut_58_0 = null;
        gg stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        gg stackOut_59_2 = null;
        gg stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        gg stackOut_65_2 = null;
        gg stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        gg stackOut_66_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_ref = un.field_e;
                        var2 = var1_ref.h((byte) -115);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (ni.field_m == null) {
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
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ni.field_m = new em(128);
                        ou.field_y = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-2 != (var1_ref.h((byte) -110) ^ -1)) {
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
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
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
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3_int = stackIn_13_0;
                        var4_ref = var1_ref.a(-118);
                        if (var3_int == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = var1_ref.a(-95);
                        if (var9 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = var4_ref;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = fm.a(var4_ref, 145);
                        var7 = var1_ref.a(-113);
                        var8 = mo.a(0, (CharSequence) (Object) var4_ref);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null == var8) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = var4_ref;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var6 == null) {
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
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6 = fm.a(var7, 145);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var6 == null) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ni.field_m.a((am) (Object) var6, (byte) -4, (long)var8.hashCode());
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var6 == null) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6 = new gg();
                        ni.field_m.a((am) (Object) var6, (byte) -4, (long)var8.hashCode());
                        ou.field_y = ou.field_y + 1;
                        var6.field_Cb = ou.field_y;
                        qn.field_b.a((gn) (Object) var6, 3);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6.field_Eb = var7;
                        var6.field_yb = var5;
                        var6.field_Gb = var4_ref;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return;
                }
                case 35: {
                    try {
                        if (1 != var2) {
                            statePc = 73;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (kw.field_b == null) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        kw.field_b = new em(128);
                        bc.field_d = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3 = var1_ref.a(-126);
                        if (!var3.equals((Object) (Object) "")) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3 = null;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var4_ref = var1_ref.a(34);
                        var5 = var1_ref.a(-112);
                        var6 = tr.a(var4_ref, (byte) 40);
                        if (var6 != null) {
                            statePc = 50;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var6 = tr.a(var5, (byte) 40);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (null != var6) {
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
                        statePc = 50;
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
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        kw.field_b.a((am) (Object) var6, (byte) -4, (long)mo.a(0, (CharSequence) (Object) var4_ref).hashCode());
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (null != var6) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var6 = new gg();
                        kw.field_b.a((am) (Object) var6, (byte) -4, (long)mo.a(0, (CharSequence) (Object) var4_ref).hashCode());
                        bc.field_d = bc.field_d + 1;
                        var6.field_Cb = bc.field_d;
                        ne.field_I.a((gn) (Object) var6, 3);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var3 != null) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var3 = var3.intern();
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var6.field_Eb = var5;
                        var6.field_zb = var3;
                        var6.field_Gb = var4_ref;
                        var6.c((byte) -109);
                        var7_ref = (gg) (Object) ne.field_I.g(24009);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (null == var7_ref) {
                            statePc = 64;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = (gg) var7_ref;
                        stackIn_59_0 = stackOut_58_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackOut_59_0 = (gg) (Object) stackIn_59_0;
                        stackOut_59_1 = -21;
                        stackOut_59_2 = (gg) var6;
                        stackIn_68_0 = stackOut_59_0;
                        stackIn_68_1 = stackOut_59_1;
                        stackIn_68_2 = stackOut_59_2;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        stackIn_60_2 = stackOut_59_2;
                        if (var9 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (!po.a(stackIn_60_0, (byte) stackIn_60_1, stackIn_60_2)) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var7_ref = (gg) (Object) ne.field_I.c(33);
                        if (var9 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (null == var7_ref) {
                            statePc = 69;
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
                        stackOut_65_0 = (gg) var7_ref;
                        stackOut_65_1 = 16737894;
                        stackOut_65_2 = (gg) var6;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        stackIn_66_2 = stackOut_65_2;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = (gg) (Object) stackIn_66_0;
                        stackOut_66_1 = stackIn_66_1;
                        stackOut_66_2 = (gg) (Object) stackIn_66_2;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        stackIn_68_2 = stackOut_66_2;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        ug.a((gn) (Object) stackIn_68_0, stackIn_68_1, (gn) (Object) stackIn_68_2);
                        if (var9 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        ne.field_I.a((gn) (Object) var6, 3);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 72: {
                    return;
                }
                case 73: {
                    try {
                        if ((var2 ^ -1) != -3) {
                            statePc = 81;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (1 == ts.field_d) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        ts.field_d = 2;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 80: {
                    return;
                }
                case 81: {
                    try {
                        if ((var2 ^ -1) != -4) {
                            statePc = 89;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (2 == ts.field_d) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        ts.field_d = 1;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 88: {
                    return;
                }
                case 89: {
                    try {
                        if (-5 == (var2 ^ -1)) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        ts.field_d = 1;
                        var3 = var1_ref.a(111);
                        bh.field_h = var3.intern();
                        var4 = var1_ref.h((byte) -115);
                        en.a(var4, -1);
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 93: {
                    return;
                }
                case 94: {
                    try {
                        bd.a("F1: " + tr.b(0), (Throwable) null, 1);
                        lr.b((byte) -116);
                        if (param0 > 38) {
                            statePc = 98;
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
                        field_e = null;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var1, "tt.A(" + param0 + 41);
                }
                case 98: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static uo a(int param0, byte[] param1) {
        uo var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_6_0 = null;
        uo stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Object stackOut_5_0 = null;
        uo stackOut_7_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 12015) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        uo discarded$2 = tt.a(8, (byte[]) null);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 != null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = null;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return (uo) (Object) stackIn_6_0;
                }
                case 7: {
                    try {
                        var2 = new uo(param1, aq.field_f, fc.field_g, ku.field_c, lo.field_j, pq.field_O);
                        tk.h((byte) -82);
                        stackOut_7_0 = (uo) var2;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) var2_ref;
                        stackOut_10_1 = new StringBuilder().append("tt.C(").append(param0).append(44);
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (param1 == null) {
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
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                        stackOut_11_2 = "{...}";
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 13: {
                    stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                    stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                    stackOut_13_2 = "null";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You need <%0> to buy this pitch.";
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_b = 70;
    }
}
