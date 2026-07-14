/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends k {
    static ra field_l;
    static String field_m;
    static String field_k;
    static int field_n;

    sg(vb param0) {
        super(param0);
    }

    final static void e(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) lj.field_j;
                    // monitorenter lj.field_j
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        cb.field_q = kb.field_Pb;
                        gr.field_a = gr.field_a + 1;
                        pq.field_k = eo.field_i;
                        po.field_a = ep.field_g;
                        kb.field_Xb = kn.field_C;
                        kn.field_C = false;
                        ki.field_e = mi.field_c;
                        tb.field_fb = l.field_l;
                        qo.field_O = va.field_e;
                        mi.field_c = 0;
                        var2 = 54 / ((param0 - -49) / 63);
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var3;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 <= 122) {
            sg.e(23);
            field_k = null;
            return;
        }
        field_k = null;
    }

    final qh a(String param0, byte param1) {
        int var3 = 0;
        if (param1 != 106) {
            field_n = 85;
            var3 = null == cp.a(param0, (byte) -24) ? 1 : 0;
            if (!(var3 != 0)) {
                return lp.field_xb;
            }
            return ae.field_c;
        }
        var3 = null == cp.a(param0, (byte) -24) ? 1 : 0;
        if (!(var3 != 0)) {
            return lp.field_xb;
        }
        return ae.field_c;
    }

    final String a(int param0, String param1) {
        if (!(((sg) this).a(param1, (byte) 106) != lp.field_xb)) {
            return wl.field_O;
        }
        int var3 = -38 % ((param0 - -16) / 50);
        return to.field_l;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Loading music";
        field_k = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_n = field_n | 2;
        field_n = field_n | 524288;
        field_n = field_n | 1048576;
        field_n = field_n | 33554432;
        field_n = field_n | 67108864;
        field_n = field_n | 268435456;
        field_n = field_n | 2097152;
        field_n = field_n | 4194304;
    }
}
