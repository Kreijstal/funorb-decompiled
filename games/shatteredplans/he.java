/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends oh {
    static String field_l;
    static bi field_h;
    static String field_q;
    static String field_m;
    static String field_n;
    int field_k;
    static String field_j;
    static String field_o;
    static int[] field_i;
    static fb field_p;

    final static void a(int param0, String param1) {
        oo.a(param1, (byte) -70);
        fk.a(rg.field_c, 72, false);
        if (param0 != 8192) {
            Object var3 = null;
            he.a(62, (String) null);
        }
    }

    final static void a(boolean param0, long param1) {
        InterruptedException var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        Thread.sleep(param1);
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_i = null;
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var3 = (InterruptedException) (Object) caughtException;
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

    public static void a(int param0) {
        field_q = null;
        field_m = null;
        field_p = null;
        if (param0 != 23811) {
          return;
        } else {
          field_n = null;
          field_l = null;
          field_j = null;
          field_i = null;
          field_h = null;
          field_o = null;
          return;
        }
    }

    he(int param0) {
        ((he) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Resigned";
        field_j = "Yes";
        field_n = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_o = "Type your password again to make sure it's correct";
        field_q = "<%0>'s game";
        field_m = "Only show game chat from my friends";
        field_i = new int[8192];
    }
}
