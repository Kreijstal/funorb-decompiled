/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends da {
    static int[][] field_m;
    int field_j;
    int[] field_n;
    static we field_o;
    static int field_l;
    boolean field_i;
    static boolean field_k;

    final static void a(h param0, h param1, byte param2, int param3, int param4, int param5) {
        kk.field_e = param1;
        if (param2 != 27) {
          tc.c(-10);
          ai.field_a = param3;
          tf.field_f = param0;
          uc.field_Y = param5;
          ni.field_i = param4;
          return;
        } else {
          ai.field_a = param3;
          tf.field_f = param0;
          uc.field_Y = param5;
          ni.field_i = param4;
          return;
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = 124 % ((param0 - -32) / 63);
                    if (null != te.field_b) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var2 = (Object) (Object) te.field_b;
                    // monitorenter te.field_b
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        te.field_b = null;
                        // monitorexit var2
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    tc() {
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 < 97) {
            field_m = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[][]{new int[3], new int[2], new int[4], new int[6], new int[3], new int[1], new int[6]};
    }
}
