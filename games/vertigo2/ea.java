/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_f;
    static String field_a;
    static cr field_c;
    static int field_g;
    static int[] field_h;
    static int field_e;
    static String field_b;
    static er[] field_d;

    public static void a(byte param0) {
        field_f = null;
        field_h = null;
        field_d = null;
        field_b = null;
        if (param0 != -28) {
          ea.b((byte) 1);
          field_c = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        mi var2 = null;
        var2 = uh.field_Wb;
        var2.j(param0, 122);
        var2.f(1, -99);
        var2.f(3, 98);
        if (!param1) {
          field_a = null;
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 > 102) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ea.b((byte) 112);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (as.field_b == null) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) as.field_b;
                    // monitorenter as.field_b
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        as.field_b = null;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
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
        field_f = "Please enter a year between <%0> and <%1>";
        field_g = 250;
        field_a = "<%0> has lost connection.";
        field_d = new er[11];
        field_h = new int[8192];
    }
}
