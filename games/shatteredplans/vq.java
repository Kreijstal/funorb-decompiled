/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq {
    static int field_a;

    final static void a(ob param0, qb param1, int param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            eq var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var14 = ShatteredPlansClient.field_F ? 1 : 0;
                        var18 = new eq();
                        var18.field_l = param0.j(param3 ^ 120);
                        var18.field_j = param0.a(16711680);
                        var18.field_h = new byte[var18.field_l][][];
                        var18.field_n = new pb[var18.field_l];
                        var18.field_q = new pb[var18.field_l];
                        var18.field_p = new int[var18.field_l];
                        var18.field_m = new int[var18.field_l];
                        var18.field_r = new int[var18.field_l];
                        var5 = 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (var5 >= var18.field_l) {
                            statePc = 29;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            var6_int = param0.j(param3 + -119);
                            if (var6_int == -1) {
                                statePc = 19;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof ClassNotFoundException ? 24 : (stateCaught_2 instanceof SecurityException ? 25 : (stateCaught_2 instanceof NullPointerException ? 26 : (stateCaught_2 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (1 == var6_int) {
                                statePc = 19;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof ClassNotFoundException ? 24 : (stateCaught_3 instanceof SecurityException ? 25 : (stateCaught_3 instanceof NullPointerException ? 26 : (stateCaught_3 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (-3 == var6_int) {
                                statePc = 19;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof ClassNotFoundException ? 24 : (stateCaught_4 instanceof SecurityException ? 25 : (stateCaught_4 instanceof NullPointerException ? 26 : (stateCaught_4 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (3 == var6_int) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof ClassNotFoundException ? 24 : (stateCaught_5 instanceof SecurityException ? 25 : (stateCaught_5 instanceof NullPointerException ? 26 : (stateCaught_5 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (-5 == (var6_int ^ -1)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof ClassNotFoundException ? 24 : (stateCaught_6 instanceof SecurityException ? 25 : (stateCaught_6 instanceof NullPointerException ? 26 : (stateCaught_6 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var5++;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof ClassNotFoundException ? 24 : (stateCaught_7 instanceof SecurityException ? 25 : (stateCaught_7 instanceof NullPointerException ? 26 : (stateCaught_7 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var20 = param0.e(-1);
                            var8 = param0.e(param3 ^ 2);
                            var9 = param0.j(-91);
                            var10 = new String[var9];
                            var11_int = 0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof ClassNotFoundException ? 24 : (stateCaught_8 instanceof SecurityException ? 25 : (stateCaught_8 instanceof NullPointerException ? 26 : (stateCaught_8 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var11_int >= var9) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof ClassNotFoundException ? 24 : (stateCaught_9 instanceof SecurityException ? 25 : (stateCaught_9 instanceof NullPointerException ? 26 : (stateCaught_9 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var10[var11_int] = param0.e(-1);
                            var11_int++;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof ClassNotFoundException ? 24 : (stateCaught_10 instanceof SecurityException ? 25 : (stateCaught_10 instanceof NullPointerException ? 26 : (stateCaught_10 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var23 = new byte[var9][];
                            var22 = var23;
                            var21 = var22;
                            var19 = var21;
                            var11 = var19;
                            if (-4 != (var6_int ^ -1)) {
                                statePc = 15;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof ClassNotFoundException ? 24 : (stateCaught_11 instanceof SecurityException ? 25 : (stateCaught_11 instanceof NullPointerException ? 26 : (stateCaught_11 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var12_int = 0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof ClassNotFoundException ? 24 : (stateCaught_12 instanceof SecurityException ? 25 : (stateCaught_12 instanceof NullPointerException ? 26 : (stateCaught_12 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var12_int >= var9) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof ClassNotFoundException ? 24 : (stateCaught_13 instanceof SecurityException ? 25 : (stateCaught_13 instanceof NullPointerException ? 26 : (stateCaught_13 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var13 = param0.a(16711680);
                            var11[var12_int] = new byte[var13];
                            param0.a(var13, 0, 17469032, var23[var12_int]);
                            var12_int++;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof ClassNotFoundException ? 24 : (stateCaught_14 instanceof SecurityException ? 25 : (stateCaught_14 instanceof NullPointerException ? 26 : (stateCaught_14 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var18.field_m[var5] = var6_int;
                            var12 = new Class[var9];
                            var17 = 0;
                            var13 = var17;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ClassNotFoundException ? 24 : (stateCaught_15 instanceof SecurityException ? 25 : (stateCaught_15 instanceof NullPointerException ? 26 : (stateCaught_15 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var17 >= var9) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ClassNotFoundException ? 24 : (stateCaught_16 instanceof SecurityException ? 25 : (stateCaught_16 instanceof NullPointerException ? 26 : (stateCaught_16 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var12[var17] = ge.a(-134, var10[var17]);
                            var17++;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ClassNotFoundException ? 24 : (stateCaught_17 instanceof SecurityException ? 25 : (stateCaught_17 instanceof NullPointerException ? 26 : (stateCaught_17 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var18.field_n[var5] = param1.a(var12, var8, param3 + 83, ge.a(-134, var20));
                            var18.field_h[var5] = var23;
                            var5++;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ClassNotFoundException ? 24 : (stateCaught_18 instanceof SecurityException ? 25 : (stateCaught_18 instanceof NullPointerException ? 26 : (stateCaught_18 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var15 = param0.e(-1);
                            var16 = param0.e(-1);
                            var8 = param0.e(-1);
                            var9 = 0;
                            if ((var6_int ^ -1) == -2) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ClassNotFoundException ? 24 : (stateCaught_19 instanceof SecurityException ? 25 : (stateCaught_19 instanceof NullPointerException ? 26 : (stateCaught_19 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ClassNotFoundException ? 24 : (stateCaught_20 instanceof SecurityException ? 25 : (stateCaught_20 instanceof NullPointerException ? 26 : (stateCaught_20 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var9 = param0.a(param3 + 16711683);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ClassNotFoundException ? 24 : (stateCaught_21 instanceof SecurityException ? 25 : (stateCaught_21 instanceof NullPointerException ? 26 : (stateCaught_21 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var18.field_m[var5] = var6_int;
                            var18.field_r[var5] = var9;
                            var18.field_q[var5] = param1.a(ge.a(-134, var15), (byte) 77, var16);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ClassNotFoundException ? 24 : (stateCaught_22 instanceof SecurityException ? 25 : (stateCaught_22 instanceof NullPointerException ? 26 : (stateCaught_22 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 24: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        var18.field_p[var5] = -1;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 25: {
                        var6_ref = (SecurityException) (Object) caughtException;
                        var18.field_p[var5] = -2;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 26: {
                        var6_ref2 = (NullPointerException) (Object) caughtException;
                        var18.field_p[var5] = -3;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 27: {
                        var6_ref3 = (Exception) (Object) caughtException;
                        var18.field_p[var5] = -4;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 28: {
                        var6_ref4 = caughtException;
                        var18.field_p[var5] = -5;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 29: {
                        if (param3 == -3) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        return;
                    }
                    case 31: {
                        kc.field_b.a((byte) -113, (oh) (Object) var18);
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

    final static String a(int param0, String param1, int param2) {
        CharSequence var6 = (CharSequence) (Object) param1;
        if (!(gb.a((byte) -109, var6))) {
            return tm.field_j;
        }
        if (!(!jp.a(param1, (byte) -105))) {
            return wb.field_f;
        }
        if (-3 != (po.field_b ^ -1)) {
            return tp.field_d;
        }
        if (ti.a(param1, true)) {
            return re.a(or.field_c, 4371, new String[1]);
        }
        if (!(100 > oi.field_e)) {
            return mi.field_a;
        }
        if (!(!da.a(param0 + -30108, param1))) {
            return re.a(qq.field_N, 4371, new String[1]);
        }
        sl var5 = js.field_f;
        var5.h(param2, param0 ^ 253);
        var5.field_j = var5.field_j + 1;
        int var4 = var5.field_j;
        var5.c(param0, (byte) -97);
        var5.a(param1, (byte) 0);
        var5.b(var5.field_j + -var4, (byte) 119);
        return null;
    }

    static {
    }
}
