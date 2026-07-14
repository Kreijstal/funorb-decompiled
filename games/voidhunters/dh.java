/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends rqa {
    static ri field_r;
    static ri field_o;
    static String field_q;
    static int field_p;

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        Exception exception = null;
        java.awt.Graphics var4 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = param0.getGraphics();
                        jl.field_q.a(var4, param2, (byte) 77, param3);
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
                    param0.repaint();
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param1 != 0) {
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
                    dh.e((byte) -76);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(byte param0) {
        field_o = null;
        int var1 = -24 / ((param0 - -34) / 57);
        field_q = null;
        field_r = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(135, 62, param0[0].a(92));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    dh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new ri(6, 0, 4, 2);
        field_q = "<%0> is not on your friend list.";
        field_p = 0;
        field_o = new ri(8, 0, 4, 1);
    }
}
