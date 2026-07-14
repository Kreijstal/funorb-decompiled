/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qma extends pu {
    private static String field_z;

    final static vr a(boolean param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        try {
            ta var6 = null;
            IOException var6_ref = null;
            RuntimeException var6_ref2 = null;
            ta var7 = null;
            fp var8 = null;
            Object stackIn_5_0 = null;
            vr stackIn_16_0 = null;
            Object stackOut_4_0 = null;
            vr stackOut_15_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var6 = null;
                            var7 = null;
                            if (null != mh.field_l.field_h) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            f.field_a = new v(mh.field_l.field_h, 5200, 0);
                            mh.field_l.field_h = null;
                            var6 = new ta(255, f.field_a, new v(mh.field_l.field_n, 12000, 0), 2097152);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param1 == 2097152) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = null;
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return (vr) (Object) stackIn_5_0;
                    }
                    case 6: {
                        try {
                            if (f.field_a == null) {
                                statePc = 13;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (null != fr.field_m) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            fr.field_m = new v[mh.field_l.field_v.length];
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (null == fr.field_m[param5]) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            fr.field_m[param5] = new v(mh.field_l.field_v[param5], 12000, 0);
                            mh.field_l.field_v[param5] = null;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var7 = new ta(param5, f.field_a, fr.field_m[param5], 2097152);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var8 = ga.field_c.a(param2, param5, var7, var6, 64);
                            if (!param4) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var8.a((byte) 90);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = new vr((tja) (Object) var8, param0, param3);
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 17 : 18);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return (vr) (Object) stackIn_16_0;
                    }
                    case 17: {
                        try {
                            var6_ref = (IOException) (Object) caughtException;
                            throw new RuntimeException(var6_ref.toString());
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var6_ref2 = (RuntimeException) (Object) caughtException;
                        throw pe.a((Throwable) (Object) var6_ref2, field_z + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
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
        field_z = "qma.A(";
    }
}
