/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static ff field_c;
    static String field_f;
    static ap field_e;
    static boolean field_b;
    static String field_g;
    static String[][] field_a;
    static hd field_d;

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 == 114) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_a = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (pd.field_G != null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        un.field_e.field_n = un.field_e.field_n + 24;
                        return;
                    }
                    case 4: {
                        try {
                            pd.field_G.a((byte) 4, 0L);
                            pd.field_G.a(un.field_e.field_n, param0 + 12, 24, un.field_e.field_f);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        un.field_e.field_n = un.field_e.field_n + 24;
                        return;
                    }
                    case 6: {
                        var1 = (Exception) (Object) caughtException;
                        un.field_e.field_n = un.field_e.field_n + 24;
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

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_f = null;
        field_a = null;
        field_e = null;
        if (param0 < 118) {
          um.a(75);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ff(2, 4, 4, 0);
        field_g = "Yes";
        field_f = "Buyout is off";
    }
}
