/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sm {
    static int field_b;
    static int field_a;
    static long[] field_c;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 30000) {
            sm.a(21);
        }
    }

    final static int b(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            wq var2 = null;
            int stackIn_15_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_37_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0;
            int stackOut_26_0;
            int stackOut_30_0;
            int stackOut_34_0;
            int stackOut_36_0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-5 >= (vd.field_f.field_i ^ -1)) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (-1 != vd.field_f.field_f) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return 3;
                    }
                    case 4: {
                        if (vd.field_f.field_f != -2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 4;
                    }
                    case 6: {
                        return 1;
                    }
                    case 8: {
                        try {
                            if (param0 == (qj.field_j ^ -1)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            fc.field_e = ec.field_P.a(wk.field_k, (byte) 120, gd.field_a);
                            qj.field_j = qj.field_j + 1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (1 != qj.field_j) {
                                statePc = 19;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (fc.field_e.field_f == -3) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = on.a((byte) 41, -1);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            if (-2 == fc.field_e.field_f) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            qj.field_j = qj.field_j + 1;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (-3 == (qj.field_j ^ -1)) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            dm.field_d = new wh((java.net.Socket) fc.field_e.field_e, ec.field_P);
                            var2 = new wq(13);
                            c.a(vb.field_S, 12, nb.field_a, u.field_g, var2);
                            var2.a(param0 ^ 119, 15);
                            var2.a(fi.field_t, (byte) -79);
                            dm.field_d.a(var2.field_k, true, 13, 0);
                            qj.field_j = qj.field_j + 1;
                            ff.field_b = ue.a(false) - -30000L;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (qj.field_j != 3) {
                                statePc = 33;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-1 > (dm.field_d.d(10434) ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if ((ff.field_b ^ -1L) > (ue.a(false) ^ -1L)) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = on.a((byte) -85, -2);
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        return stackIn_27_0;
                    }
                    case 28: {
                        try {
                            var1_int = dm.field_d.e(0);
                            if (var1_int != 0) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            stackOut_30_0 = on.a((byte) 90, var1_int);
                            stackIn_31_0 = stackOut_30_0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        return stackIn_31_0;
                    }
                    case 32: {
                        try {
                            qj.field_j = qj.field_j + 1;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if ((qj.field_j ^ -1) != -5) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            vd.field_f.a((Object) (Object) dm.field_d, rd.field_a, 12);
                            dm.field_d = null;
                            qj.field_j = 0;
                            fc.field_e = null;
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0;
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = -1;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        return stackIn_37_0;
                    }
                    case 38: {
                        var1 = (IOException) (Object) caughtException;
                        return on.a((byte) -111, -3);
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
        field_a = 0;
        field_b = field_a;
        field_c = new long[32];
    }
}
