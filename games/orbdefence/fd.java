/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static hj field_a;
    static String[] field_e;
    static int field_b;
    static int field_f;
    static tl field_h;
    static int field_c;
    static String field_d;
    static String field_g;

    final static void b(int param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = -57 / ((param0 - 13) / 46);
                    if (ad.field_b == null) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var2 = (Object) (Object) ad.field_b;
                    // monitorenter ad.field_b
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        ad.field_b = null;
                        // monitorexit var2
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) var3;
                }
                case 6: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != -32311) {
          field_c = -92;
          field_h = null;
          field_g = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_h = null;
          field_g = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "An orb has been destroyed!";
        field_h = new tl();
        field_g = "ICE SHOT";
    }
}
