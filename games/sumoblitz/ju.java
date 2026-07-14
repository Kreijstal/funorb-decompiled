/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ju extends ua implements cr {
    static hr[] field_p;
    private io field_o;

    public final void b(int param0) {
        if (param0 != 12001) {
          boolean discarded$2 = ((ju) this).a(-31);
          super.b(param0 + 0);
          return;
        } else {
          super.b(param0 + 0);
          return;
        }
    }

    public final boolean a(int param0) {
        if (param0 != -28833) {
          field_p = null;
          return super.a(((ju) this).field_f.field_Qc, (byte) 92);
        } else {
          return super.a(((ju) this).field_f.field_Qc, (byte) 92);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_p = null;
    }

    final static void g(int param0) {
        wt.field_h[1] = iv.field_i;
        wt.field_h[0] = ki.field_f;
        wt.field_h[2] = hc.field_f;
        pl.field_u = wt.field_h[1] + wt.field_h[0] - 2 + (wt.field_h[2] + -1);
        if (param0 < 100) {
            boolean discarded$0 = ju.b(46, -94);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_14_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ig.field_a.field_p < param1) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        if (null == qk.field_O) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        try {
                            var2_int = qk.field_O.c(param0 ^ 36);
                            if (0 < var2_int) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (-ig.field_a.field_p + param1 < var2_int) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2_int = -ig.field_a.field_p + param1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            qk.field_O.a(param0 ^ 99, ig.field_a.field_p, var2_int, ig.field_a.field_n);
                            jt.field_x = wq.a(-47);
                            ig.field_a.field_p = ig.field_a.field_p + var2_int;
                            if (ig.field_a.field_p < param1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            ig.field_a.field_p = 0;
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
                    }
                    case 16: {
                        try {
                            if ((var2_int ^ -1) > param0) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (-30001L <= (uc.b(26560) ^ -1L)) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            kk.a((byte) -118);
                            return false;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            kk.a((byte) -118);
                            return false;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return false;
                    }
                    case 22: {
                        var2 = (IOException) (Object) caughtException;
                        kk.a((byte) -127);
                        return false;
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

    public final void a(byte param0, int param1) {
        if (param0 >= -67) {
          boolean discarded$2 = ((ju) this).a(61);
          super.a((byte) -87, ((ju) this).field_o.field_j * param1);
          return;
        } else {
          super.a((byte) -87, ((ju) this).field_o.field_j * param1);
          return;
        }
    }

    ju(on param0, io param1, boolean param2) {
        super(param0, 34963, param2);
        ((ju) this).field_o = param1;
    }

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (param1 != 10081) {
          field_p = null;
          return super.a(param0, param1 ^ 10083, ((ju) this).field_f.field_Qc);
        } else {
          return super.a(param0, param1 ^ 10083, ((ju) this).field_f.field_Qc);
        }
    }

    static {
    }
}
