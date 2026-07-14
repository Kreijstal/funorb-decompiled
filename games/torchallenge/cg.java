/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static String[] field_c;
    static byte[][][] field_i;
    static ka field_g;
    static ka[] field_d;
    static fe[] field_a;
    static int[] field_e;
    static boolean[][] field_h;
    static ka[][][] field_b;
    static int[][] field_f;

    public static void b(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != -13) {
          return;
        } else {
          field_b = null;
          field_i = null;
          field_g = null;
          field_e = null;
          field_h = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == hl.field_d) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) hl.field_d;
                    // monitorenter hl.field_d
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        hl.field_d = null;
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
                    if (param0 == -102) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    field_f = null;
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
                    if (param0 != -102) {
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
                    field_f = null;
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
        field_a = new fe[17];
        field_c = new String[]{"Tower0", "Tower1", "Tower2", "Tower3", "Tower4", "Tower5", "boss1", "boss2", "boss3"};
        field_e = new int[2];
        field_b = new ka[3][2][32];
        field_f = new int[][]{new int[6], new int[6], new int[6], new int[6], new int[6], new int[1], new int[6]};
        field_h = new boolean[][]{new boolean[6], new boolean[6], new boolean[6]};
    }
}
