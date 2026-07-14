/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md {
    int field_b;
    int field_c;
    int field_d;
    int field_a;

    final static boolean a(byte param0) {
        if (param0 > -6) {
            boolean discarded$0 = md.a(122, false);
            return qe.a(mk.g(-122), (byte) -98);
        }
        return qe.a(mk.g(-122), (byte) -98);
    }

    final static boolean a(int param0, boolean param1) {
        try {
            IOException var2 = null;
            w var4 = null;
            w var5 = null;
            int stackIn_13_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == fe.field_c) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        fe.field_c = td.field_b.a(mk.field_k, (byte) -108, ag.field_e);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param0 > 47) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return true;
                    }
                    case 5: {
                        if (0 == fe.field_c.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return false;
                    }
                    case 8: {
                        ua.field_E = id.a(94);
                        uk.field_a = id.a(94);
                        if (-2 == (fe.field_c.field_a ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ra.field_b = rk.field_fb;
                        fe.field_c = null;
                        return true;
                    }
                    case 10: {
                        try {
                            cb.field_j = new jd((java.net.Socket) fe.field_c.field_e, td.field_b);
                            var4 = rd.field_j;
                            var5 = var4;
                            na.field_r.field_i = 0;
                            var5.field_i = 0;
                            if (param1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = -1;
                            stackIn_13_0 = stackOut_11_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = -2;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ni.field_d = stackIn_13_0;
                            hc.field_f = stackIn_13_0;
                            sb.field_a = stackIn_13_0;
                            ra.field_b = vf.field_a;
                            nf.a((pb) (Object) na.field_r, false, ag.field_d, kh.field_g, kj.field_t);
                            fe.a((byte) -36, -1);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        fe.field_c = null;
                        return true;
                    }
                    case 15: {
                        var2 = (IOException) (Object) caughtException;
                        ra.field_b = rk.field_fb;
                        fe.field_c = null;
                        return true;
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
    }
}
