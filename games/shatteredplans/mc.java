/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mc extends df {
    static gq field_r;
    static bi field_u;
    static qr field_t;
    int field_p;
    static String field_q;
    static int[] field_s;
    static qr field_o;

    abstract boolean e(boolean param0);

    public static void d(boolean param0) {
        field_t = null;
        field_r = null;
        field_u = null;
        field_s = null;
        field_q = null;
        if (param0) {
            return;
        }
        field_o = null;
    }

    mc(int param0) {
        ((mc) this).field_p = param0;
    }

    abstract Object e(byte param0);

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        Exception exception = null;
        java.awt.Graphics var4 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = param2.getGraphics();
                        so.field_q.a(var4, param3, (byte) -92, param1);
                        var4.dispose();
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    exception = (Exception) (Object) caughtException;
                    param2.repaint();
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param0 < 21) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    field_o = null;
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
        field_r = new gq(13, 0, 1, 0);
    }
}
