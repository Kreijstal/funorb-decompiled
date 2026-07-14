/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static le field_c;
    static int[] field_d;
    static String[] field_a;
    static boolean field_e;
    static int field_b;

    final static void a(int param0) {
        og.field_r = 0.4000000059604645f;
        sa.field_c = 0.0;
        ul.field_b = 0;
        ag.field_k = 3;
        fj.field_m = 0;
        ji.field_h = 0;
        fa.field_b = 40;
        f.field_qb = 4;
        qe.b(10);
        ij.field_ab = 0.75f;
        rc.field_h = 0.01666666753590107f;
        if (param0 != 9408) {
            return;
        }
        di.field_g = 0;
        sa.b(true);
        el.field_t = 0;
        gb.field_c = 0;
    }

    final static void a(int param0, d param1, int param2, qc param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            Object var15 = null;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            eg var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var14 = Geoblox.field_C;
                        var19 = new eg();
                        var19.field_f = param3.c((byte) 34);
                        var19.field_m = param3.a((byte) -127);
                        var19.field_j = new int[var19.field_f];
                        var19.field_i = new cb[var19.field_f];
                        var19.field_g = new int[var19.field_f];
                        var19.field_n = new cb[var19.field_f];
                        var19.field_k = new int[var19.field_f];
                        var19.field_o = new byte[var19.field_f][][];
                        var5 = 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (var5 >= var19.field_f) {
                            statePc = 31;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            var6_int = param3.c((byte) 34);
                            if (0 == var6_int) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof ClassNotFoundException ? 26 : (stateCaught_2 instanceof SecurityException ? 27 : (stateCaught_2 instanceof NullPointerException ? 28 : (stateCaught_2 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (1 == var6_int) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof ClassNotFoundException ? 26 : (stateCaught_3 instanceof SecurityException ? 27 : (stateCaught_3 instanceof NullPointerException ? 28 : (stateCaught_3 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var6_int != 2) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof ClassNotFoundException ? 26 : (stateCaught_4 instanceof SecurityException ? 27 : (stateCaught_4 instanceof NullPointerException ? 28 : (stateCaught_4 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof ClassNotFoundException ? 26 : (stateCaught_5 instanceof SecurityException ? 27 : (stateCaught_5 instanceof NullPointerException ? 28 : (stateCaught_5 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var16 = param3.e((byte) 117);
                            var7 = var16;
                            var17 = param3.e((byte) 125);
                            var8 = var17;
                            var9 = 0;
                            if (-2 != (var6_int ^ -1)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof ClassNotFoundException ? 26 : (stateCaught_6 instanceof SecurityException ? 27 : (stateCaught_6 instanceof NullPointerException ? 28 : (stateCaught_6 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var9 = param3.a((byte) -123);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof ClassNotFoundException ? 26 : (stateCaught_7 instanceof SecurityException ? 27 : (stateCaught_7 instanceof NullPointerException ? 28 : (stateCaught_7 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var19.field_k[var5] = var6_int;
                            var19.field_g[var5] = var9;
                            var19.field_n[var5] = param1.a(ag.a(var16, false), 0, var17);
                            var5++;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof ClassNotFoundException ? 26 : (stateCaught_8 instanceof SecurityException ? 27 : (stateCaught_8 instanceof NullPointerException ? 28 : (stateCaught_8 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((var6_int ^ -1) == -4) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof ClassNotFoundException ? 26 : (stateCaught_9 instanceof SecurityException ? 27 : (stateCaught_9 instanceof NullPointerException ? 28 : (stateCaught_9 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var6_int == 4) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof ClassNotFoundException ? 26 : (stateCaught_10 instanceof SecurityException ? 27 : (stateCaught_10 instanceof NullPointerException ? 28 : (stateCaught_10 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof ClassNotFoundException ? 26 : (stateCaught_11 instanceof SecurityException ? 27 : (stateCaught_11 instanceof NullPointerException ? 28 : (stateCaught_11 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var21 = param3.e((byte) 103);
                            var8 = param3.e((byte) 98);
                            var9 = param3.c((byte) 34);
                            var10 = new String[var9];
                            var11_int = 0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof ClassNotFoundException ? 26 : (stateCaught_13 instanceof SecurityException ? 27 : (stateCaught_13 instanceof NullPointerException ? 28 : (stateCaught_13 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var9 <= var11_int) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof ClassNotFoundException ? 26 : (stateCaught_14 instanceof SecurityException ? 27 : (stateCaught_14 instanceof NullPointerException ? 28 : (stateCaught_14 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var10[var11_int] = param3.e((byte) 120);
                            var11_int++;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ClassNotFoundException ? 26 : (stateCaught_15 instanceof SecurityException ? 27 : (stateCaught_15 instanceof NullPointerException ? 28 : (stateCaught_15 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var24 = new byte[var9][];
                            var23 = var24;
                            var22 = var23;
                            var20 = var22;
                            var11 = var20;
                            if ((var6_int ^ -1) == -4) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ClassNotFoundException ? 26 : (stateCaught_16 instanceof SecurityException ? 27 : (stateCaught_16 instanceof NullPointerException ? 28 : (stateCaught_16 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ClassNotFoundException ? 26 : (stateCaught_17 instanceof SecurityException ? 27 : (stateCaught_17 instanceof NullPointerException ? 28 : (stateCaught_17 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var12_int = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ClassNotFoundException ? 26 : (stateCaught_18 instanceof SecurityException ? 27 : (stateCaught_18 instanceof NullPointerException ? 28 : (stateCaught_18 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var12_int >= var9) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ClassNotFoundException ? 26 : (stateCaught_19 instanceof SecurityException ? 27 : (stateCaught_19 instanceof NullPointerException ? 28 : (stateCaught_19 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var13 = param3.a((byte) -70);
                            var11[var12_int] = new byte[var13];
                            param3.b(29915, var13, var24[var12_int], 0);
                            var12_int++;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ClassNotFoundException ? 26 : (stateCaught_20 instanceof SecurityException ? 27 : (stateCaught_20 instanceof NullPointerException ? 28 : (stateCaught_20 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var19.field_k[var5] = var6_int;
                            var12 = new Class[var9];
                            var18 = 0;
                            var13 = var18;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ClassNotFoundException ? 26 : (stateCaught_21 instanceof SecurityException ? 27 : (stateCaught_21 instanceof NullPointerException ? 28 : (stateCaught_21 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var18 >= var9) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ClassNotFoundException ? 26 : (stateCaught_22 instanceof SecurityException ? 27 : (stateCaught_22 instanceof NullPointerException ? 28 : (stateCaught_22 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var12[var18] = ag.a(var10[var18], false);
                            var18++;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ClassNotFoundException ? 26 : (stateCaught_23 instanceof SecurityException ? 27 : (stateCaught_23 instanceof NullPointerException ? 28 : (stateCaught_23 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var19.field_i[var5] = param1.a(var8, -126, var12, ag.a(var21, false));
                            var19.field_o[var5] = var24;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ClassNotFoundException ? 26 : (stateCaught_24 instanceof SecurityException ? 27 : (stateCaught_24 instanceof NullPointerException ? 28 : (stateCaught_24 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 26: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        var19.field_j[var5] = -1;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 27: {
                        var6_ref = (SecurityException) (Object) caughtException;
                        var19.field_j[var5] = -2;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 28: {
                        var6_ref2 = (NullPointerException) (Object) caughtException;
                        var19.field_j[var5] = -3;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 29: {
                        var6_ref3 = (Exception) (Object) caughtException;
                        var19.field_j[var5] = -4;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 30: {
                        var6_ref4 = caughtException;
                        var19.field_j[var5] = -5;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 31: {
                        if (param0 == -4) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        var15 = null;
                        pg.a(96, (d) null, -109, (qc) null);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        sl.field_k.a(-92, (hf) (Object) var19);
                        return;
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

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 != 22059) {
            pg.a(52);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_c = new le();
        field_a = new String[]{"Geoblox Flush", "Ordered Geometry", "Perfect Geometry", "Chain Geometry", "Sequence Geometry", "Succession Geometry", "Dark Geometry", "Lightning Geometrician", "Natural Geometrician", "Sweet Geometrician", "Sparkly Geometrician", "Sick Geometrician", "Stellar Geometrician", "Sporty Geometrician", "Cooking Geometrician", "Parallel Geometrician", "Spooky Geometrician"};
    }
}
