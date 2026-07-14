/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends java.awt.Canvas {
    static String field_a;
    static uh[] field_d;
    private java.awt.Component field_f;
    static String field_g;
    static int field_e;
    static long field_b;
    static da field_c;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_g = null;
        int var1 = -56 / ((param0 - 69) / 43);
        field_d = null;
    }

    final static wg a(byte param0, String[] param1) {
        wg var2 = null;
        if (param0 != 17) {
          field_e = 88;
          var2 = new wg(false);
          var2.field_a = param1;
          return var2;
        } else {
          var2 = new wg(false);
          var2.field_a = param1;
          return var2;
        }
    }

    wk(java.awt.Component param0) {
        ((wk) this).field_f = param0;
    }

    final static boolean a(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        Object var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) i.field_J;
                    // monitorenter i.field_J
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (si.field_B != pf.field_a) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        el.field_n = lb.field_V[pf.field_a];
                        if (param0 == -56) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = null;
                        wg discarded$3 = wk.a((byte) -108, (String[]) null);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ta.field_d = r.field_g[pf.field_a];
                        pf.field_a = pf.field_a + 1 & 127;
                        // monitorexit var1_ref
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int b(int param0) {
        if (param0 != 0) {
            return 31;
        }
        return lf.field_c;
    }

    public final void paint(java.awt.Graphics param0) {
        ((wk) this).field_f.paint(param0);
    }

    public final void update(java.awt.Graphics param0) {
        ((wk) this).field_f.update(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Destroyed: <%0>%";
        field_g = "Create a free Account";
        field_e = 0;
    }
}
