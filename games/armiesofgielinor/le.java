/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends java.awt.Canvas {
    static cg field_b;
    static wk[] field_c;
    static ue field_d;
    private java.awt.Component field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 < 43) {
            le.a(-119);
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static boolean a(byte param0, String param1) {
        Object var3 = null;
        if (param1.length() > 1) {
          return true;
        } else {
          if (param0 != -125) {
            var3 = null;
            String discarded$2 = le.a(94, (byte) 20, (vh) null);
            return false;
          } else {
            return false;
          }
        }
    }

    public final void update(java.awt.Graphics param0) {
        ((le) this).field_a.update(param0);
    }

    public final void paint(java.awt.Graphics param0) {
        ((le) this).field_a.paint(param0);
    }

    final static String a(int param0, byte param1, vh param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        String stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3_int = param2.e(-23470);
                        if (param1 == -25) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (String) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        if (var3_int > param0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = param0;
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
                        var4 = new byte[var3_int];
                        param2.field_q = param2.field_q + ds.field_c.a(param2.field_o, param2.field_q, false, var3_int, 0, var4);
                        var5 = co.a(0, var3_int, -107, var4);
                        stackOut_6_0 = (String) var5;
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
                    return (String) (Object) stackIn_7_0;
                }
                case 8: {
                    var3 = (Exception) (Object) caughtException;
                    return "Cabbage";
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    le(java.awt.Component param0) {
        ((le) this).field_a = param0;
    }

    static {
    }
}
