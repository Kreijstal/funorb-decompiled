/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static db[] field_e;
    static String field_a;
    static int[] field_f;
    static wh field_c;
    static String field_d;
    static boolean field_b;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        if (param0 != 24) {
          field_a = null;
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static void a(byte param0) {
        try {
            int var1 = 0;
            Exception var2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var1 = 4 % ((41 - param0) / 63);
                        if (kf.field_y == null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            kf.field_y.a((byte) 40, 0L);
                            kf.field_y.b(ig.field_a.field_h, ig.field_a.field_j, 24, -31593);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        ig.field_a.field_h = ig.field_a.field_h + 24;
                        return;
                    }
                    case 3: {
                        var2 = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ig.field_a.field_h = ig.field_a.field_h + 24;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading languages";
        field_d = "Email: ";
        field_f = new int[256];
    }
}
