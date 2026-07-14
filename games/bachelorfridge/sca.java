/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class sca {
    static byte[] field_c;
    static int field_d;
    static String field_b;
    static kv field_a;

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            lu var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_32_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_31_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-5 >= aka.field_G.field_e) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (0 != aka.field_G.field_k) {
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
                        if (aka.field_G.field_k != -2) {
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
                            if (param0 != ds.field_m) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ch.field_p = mh.field_l.a((byte) 120, pw.field_A, nj.field_f);
                            ds.field_m = ds.field_m + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (ds.field_m != 1) {
                                statePc = 17;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (-3 != (ch.field_p.field_f ^ -1)) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = cj.a(-1, 1);
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0;
                    }
                    case 14: {
                        try {
                            if (ch.field_p.field_f == -2) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ds.field_m = ds.field_m + 1;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (-3 != ds.field_m) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            hla.field_s = new pj((java.net.Socket) ch.field_p.field_e, mh.field_l);
                            var2 = new lu(13);
                            cca.a(var2, uea.field_i, (byte) -103, ma.field_E, ro.field_j);
                            var2.d(15, 0);
                            var2.e(bd.field_m, -1615464796);
                            hla.field_s.a(0, var2.field_h, false, 13);
                            ds.field_m = ds.field_m + 1;
                            wh.field_q = f.b((byte) 73) + 30000L;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((ds.field_m ^ -1) != -4) {
                                statePc = 28;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (0 < hla.field_s.b(125)) {
                                statePc = 24;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if ((wh.field_q ^ -1L) <= (f.b((byte) 73) ^ -1L)) {
                                statePc = 28;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = cj.a(-2, 1);
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return stackIn_23_0;
                    }
                    case 24: {
                        try {
                            var1_int = hla.field_s.b((byte) -47);
                            if (var1_int == 0) {
                                statePc = 27;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = cj.a(var1_int, 1);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            ds.field_m = ds.field_m + 1;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (ds.field_m != 4) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            aka.field_G.a(nf.field_M, (Object) (Object) hla.field_s, 16008);
                            ch.field_p = null;
                            hla.field_s = null;
                            ds.field_m = 0;
                            stackOut_29_0 = 0;
                            stackIn_30_0 = stackOut_29_0;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        return stackIn_30_0;
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = -1;
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        var1 = (IOException) (Object) caughtException;
                        return cj.a(-3, 1);
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

    abstract int a(byte param0);

    abstract void a(java.awt.Component param0, boolean param1);

    abstract void a(java.awt.Component param0, byte param1);

    public static void b(byte param0) {
        field_a = null;
        if (param0 != -33) {
            field_a = null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_b = "Create a free Account";
    }
}
