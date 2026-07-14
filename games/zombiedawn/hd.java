/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class hd extends nb {
    static int[] field_u;
    static String[] field_p;
    int field_q;
    int field_v;
    int field_t;
    int field_r;
    static int field_y;
    int field_w;
    static int[] field_s;
    int field_x;

    final static void a(int param0, int param1, int param2) {
        dp.field_h = param0;
        Object var4 = null;
        mn.a(-1, (String) null, true);
        int var3 = -120 / ((-77 - param1) / 47);
    }

    public static void d(byte param0) {
        field_p = null;
        field_s = null;
        if (param0 != -77) {
            field_p = null;
            field_u = null;
            return;
        }
        field_u = null;
    }

    final static dj a(boolean param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
            na var6 = null;
            IOException var6_ref = null;
            na var7 = null;
            om var8 = null;
            Object stackIn_11_0 = null;
            dj stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_10_0 = null;
            dj stackOut_14_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var6 = null;
                            if (null == lc.field_a.field_e) {
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
                            da.field_j = new sf(lc.field_a.field_e, 5200, 0);
                            lc.field_a.field_e = null;
                            var6 = new na(255, da.field_j, new sf(lc.field_a.field_i, 12000, 0), 2097152);
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
                            if (da.field_j == null) {
                                statePc = 9;
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
                            if (lg.field_v == null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            lg.field_v = new sf[lc.field_a.field_q.length];
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
                            if (null != lg.field_v[param2]) {
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
                            lg.field_v[param2] = new sf(lc.field_a.field_q[param2], 12000, 0);
                            lc.field_a.field_q[param2] = null;
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
                            var7 = new na(param2, da.field_j, lg.field_v[param2], 2097152);
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
                            var8 = ep.field_l.a(var7, (byte) -106, param0, param2, var6);
                            if (param1) {
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
                        return (dj) (Object) stackIn_11_0;
                    }
                    case 12: {
                        try {
                            if (!param5) {
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
                            var8.a(false);
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
                            stackOut_14_0 = new dj((w) (Object) var8, param4, param3);
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

    hd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[16];
        field_p = new String[]{"Showing by rating", "Showing by win percentage"};
        field_y = 131072;
    }
}
