/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static String field_a;
    static String field_c;
    static wb field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 122) {
            field_c = null;
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, long param1) {
        int var3 = 0;
        InterruptedException var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = -60 % ((64 - param0) / 39);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        Thread.sleep(param1);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var4 = (InterruptedException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
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
        field_a = "Click on the sticky ball!";
        field_c = "You";
    }
}
