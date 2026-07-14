/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static oi field_d;
    static ae field_c;
    static String field_e;
    static wi field_b;
    static int field_a;

    final static void a(int param0, int param1, int param2) {
        if (param0 != 1048576) {
            return;
        }
        id.field_c = param2;
        ii.field_a = param1;
    }

    final static void a(int param0) {
        try {
            java.lang.reflect.Method var1_ref = null;
            Exception var1_ref_Exception = null;
            int var1 = 0;
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
                            var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                            if (var1_ref == null) {
                                statePc = 6;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var2_ref = Runtime.getRuntime();
                            var4 = null;
                            var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                            jd.field_b = (int)(var3.longValue() / 1048576L) + 1;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1 = -100 / ((param0 - -31) / 50);
                            return;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var2 = caughtException;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        var1_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var1 = -100 / ((param0 - -31) / 50);
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
        if (param0 <= 63) {
          field_b = null;
          field_b = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new oi();
        field_c = new ae();
        field_e = "Fire stars";
    }
}
