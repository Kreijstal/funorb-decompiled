/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static String field_a;
    static long field_b;
    static String field_c;

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 <= -79) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    og.a((byte) -45);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (ub.field_e != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) ub.field_e;
                    // monitorenter ub.field_e
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        ub.field_e = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -61) {
            return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        if (!mg.b(true)) {
            return;
        }
        cl.a(118, false, 4);
        if (param0 != -5213) {
            field_c = null;
        }
    }

    final static int a(boolean param0) {
        qd[] var1 = null;
        qd[] var2 = null;
        if (!param0) {
          og.b(124);
          var1 = new qd[]{};
          var2 = hl.field_v.a(var1, -21636, fg.field_Ob);
          var1 = var2;
          return var2.length * 36;
        } else {
          var1 = new qd[]{};
          var2 = hl.field_v.a(var1, -21636, fg.field_Ob);
          var1 = var2;
          return var2.length * 36;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Hide game chat";
        field_c = "Waiting for fonts";
    }
}
