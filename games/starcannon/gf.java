/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static String field_e;
    static int field_b;
    static boolean field_d;
    static ud[] field_c;
    static hl[] field_a;

    public static void a(byte param0) {
        if (param0 > -102) {
          field_c = null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) rc.field_d;
                    // monitorenter rc.field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        pg.field_g = pg.field_g + 1;
                        te.field_b = uh.field_i;
                        pe.field_d = hj.field_d;
                        la.field_c = wj.field_a;
                        uf.field_d = vj.field_Y;
                        vj.field_Y = false;
                        kg.field_a = na.field_c;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_e = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        rg.field_B = fb.field_j;
                        kc.field_Q = oi.field_f;
                        na.field_c = 0;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
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
        field_e = "PULSE LASER - Switches the Nova Ray to use the wide spread of the pulse laser.";
        field_d = false;
    }
}
