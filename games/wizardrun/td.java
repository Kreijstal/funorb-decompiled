/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_b;
    static kb field_f;
    static int[] field_a;
    static String field_e;
    static String field_d;
    static int[] field_c;

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        if (param0 != 4) {
          field_c = null;
          field_b = null;
          field_e = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (ff.field_H == null) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) ff.field_H;
                    // monitorenter ff.field_H
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        ff.field_H = null;
                        // monitorexit var1
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    if (param0 == 4) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    td.b(-24);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    if (param0 != 4) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    td.b(-24);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "OK";
        field_a = new int[4];
    }
}
