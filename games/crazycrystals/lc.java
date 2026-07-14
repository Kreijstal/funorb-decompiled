/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static u field_c;
    static int field_e;
    static String field_b;
    static int field_d;
    static int field_a;

    public static void c(int param0) {
        field_c = null;
        field_b = null;
        if (param0 >= -10) {
            lc.b(-1);
        }
    }

    final static void b(int param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                            if (var1 != null) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var2_ref = Runtime.getRuntime();
                            var4 = null;
                            var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                            jk.field_f = (int)(var3.longValue() / 1048576L) - -1;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var2 = caughtException;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 == 24536) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            field_e = 76;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var1_ref = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
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

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = CrazyCrystals.field_B;
        for (var1 = 18; var1 < 32; var1++) {
            for (var2 = 0; var2 < ma.field_n.length; var2++) {
                for (var3 = 0; (var3 ^ -1) > -10; var3++) {
                    kk.field_a[var1][m.field_l[var2] + var3] = kk.field_a[var1 - -1][var3 + m.field_l[var2]];
                }
            }
        }
        if (param0 != -1) {
            field_b = null;
        }
        for (var1 = 0; var1 < ma.field_n.length; var1++) {
            var5 = 0;
            var2 = var5;
            while ((var5 ^ -1) > -10) {
                kk.field_a[32][var5 + m.field_l[var1]] = bm.field_g;
                var5++;
            }
        }
        for (var1 = 0; ma.field_n.length > var1; var1++) {
            fo.field_m[var1] = fo.field_m[var1] - 1;
        }
    }

    final static e a(String param0, byte param1) {
        if (param1 != 51) {
            field_d = 49;
        }
        return new e(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Orb coins: ";
        field_e = 10;
    }
}
