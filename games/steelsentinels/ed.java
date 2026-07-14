/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static int field_i;
    static int field_h;
    static String field_b;
    static String field_e;
    static int[][] field_c;
    static int field_a;
    static int field_f;
    static String field_d;
    static String field_g;
    static int field_j;

    final static void b(byte param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 == -105) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_b = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null == va.field_h) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            va.field_h.a(-94, 0L);
                            va.field_h.a(rf.field_d.field_p, 24, param0 ^ -67, rf.field_d.field_t);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        rf.field_d.field_p = rf.field_d.field_p + 24;
                        return;
                    }
                    case 5: {
                        var1 = (Exception) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        rf.field_d.field_p = rf.field_d.field_p + 24;
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

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_g = null;
        int var1 = -80 / ((28 - param0) / 45);
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_e = "Basic Combat";
        field_b = "To report a player, right-click on their name and select the option to report abuse.";
        field_a = 64;
        field_d = "Unable to add friend - system busy";
        field_c = new int[][]{null, new int[10], new int[10]};
        field_g = "module:</col>";
    }
}
