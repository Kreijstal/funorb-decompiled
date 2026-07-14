/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ri {
    static String[] field_b;
    static ue field_c;
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -15552) {
            return;
        }
        field_b = null;
    }

    final static ue a(boolean param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
            uf var6 = null;
            IOException var6_ref = null;
            uf var7 = null;
            t var8 = null;
            Object stackIn_11_0 = null;
            ue stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_10_0 = null;
            ue stackOut_14_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var6 = null;
                            if (ij.field_f.field_e == null) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            ne.field_l = new td(ij.field_f.field_e, 5200, 0);
                            ij.field_f.field_e = null;
                            var6 = new uf(255, ne.field_l, new td(ij.field_f.field_t, 12000, 0), 2097152);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7 = null;
                            if (null != ne.field_l) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (fe.field_J != null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            fe.field_J = new td[ij.field_f.field_q.length];
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (fe.field_J[param3] != null) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            fe.field_J[param3] = new td(ij.field_f.field_q[param3], 12000, 0);
                            ij.field_f.field_q[param3] = null;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var7 = new uf(param3, ne.field_l, fe.field_J[param3], 2097152);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (param0) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = null;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return (ue) (Object) stackIn_11_0;
                    }
                    case 12: {
                        try {
                            var8 = bl.field_b.a(param4, -72, var7, param3, var6);
                            if (!param1) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var8.a(-126);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = new ue((ti) (Object) var8, param5, param2);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        var6_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException(var6_ref.toString());
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

    final static void b(int param0) {
        CharSequence var2 = null;
        CharSequence var3 = null;
        we.field_i = se.field_p.a(-104);
        if (param0 != 12000) {
          field_b = null;
          var2 = (CharSequence) (Object) we.field_i;
          ba.field_e = ni.a(param0 + -11877, var2);
          return;
        } else {
          var3 = (CharSequence) (Object) we.field_i;
          ba.field_e = ni.a(param0 + -11877, var3);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
    }
}
