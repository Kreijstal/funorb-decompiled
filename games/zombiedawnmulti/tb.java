/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tb extends hq {
    static boolean field_u;
    static ja field_v;
    static int[] field_t;
    static ja field_s;

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        Object var7 = null;
        L0: {
          if (param0) {
            ng.a(1, param3 + param4.field_y, param4.field_n, param4.field_i + param1, param4.field_w);
            break L0;
          } else {
            break L0;
          }
        }
        super.a(param0, param1, param2 ^ 0, param3, param4);
        if (param2 != -15112) {
          var7 = null;
          ((tb) this).a(true, 39, -62, 86, (cf) null);
          return;
        } else {
          return;
        }
    }

    tb(int param0) {
        this(ke.field_h, param0);
    }

    public static void c(byte param0) {
        field_v = null;
        field_t = null;
        if (param0 != 109) {
            tb.c((byte) 124);
            field_s = null;
            return;
        }
        field_s = null;
    }

    tb(fm param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_C, -1, 2147483647, false);
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (um.field_c != null) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == 4862) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    field_s = null;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) um.field_c;
                    // monitorenter um.field_c
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        um.field_c = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (param0 == 4862) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_s = null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = true;
    }
}
