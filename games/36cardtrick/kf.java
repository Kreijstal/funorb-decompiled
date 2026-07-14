/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kf extends qb {
    long field_g;
    int field_h;
    byte[] field_i;
    static String field_j;

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            pb var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_32_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-5 < dg.field_H.field_b) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (0 != dg.field_H.field_l) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return 3;
                    }
                    case 3: {
                        if (-2 == dg.field_H.field_l) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 1;
                    }
                    case 5: {
                        return 4;
                    }
                    case 7: {
                        try {
                            if (ed.field_c != 0) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            d.field_a = bi.field_b.a(al.field_c, (byte) -122, ak.field_O);
                            ed.field_c = ed.field_c + 1;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (param0 > 58) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            kf.b((byte) 115);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (ed.field_c != -2) {
                                statePc = 17;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (-3 != d.field_a.field_a) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = ma.a(2, -1);
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        try {
                            if (1 != d.field_a.field_a) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ed.field_c = ed.field_c + 1;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (2 != ed.field_c) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            tf.field_r = new jd((java.net.Socket) d.field_a.field_e, bi.field_b);
                            var2 = new pb(13);
                            nf.a(var2, false, cc.field_c, eh.field_l, pf.field_h);
                            var2.b(-9469, 15);
                            var2.a(-246, oj.field_d);
                            tf.field_r.a(0, (byte) -89, 13, ((pb) var2).field_g);
                            ed.field_c = ed.field_c + 1;
                            lc.field_b = id.a(70) + 30000L;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (ed.field_c != -4) {
                                statePc = 30;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-1 >= tf.field_r.b(-108)) {
                                statePc = 26;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var1_int = tf.field_r.a(0);
                            if (-1 != (var1_int ^ -1)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            stackOut_23_0 = ma.a(2, var1_int);
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return stackIn_24_0;
                    }
                    case 25: {
                        try {
                            ed.field_c = ed.field_c + 1;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((id.a(120) ^ -1L) < (lc.field_b ^ -1L)) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = ma.a(2, -2);
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            if (4 == ed.field_c) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            dg.field_H.a((Object) (Object) tf.field_r, ii.field_d, false);
                            d.field_a = null;
                            tf.field_r = null;
                            ed.field_c = 0;
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        return stackIn_33_0;
                    }
                    case 34: {
                        var1 = (IOException) (Object) caughtException;
                        return ma.a(2, -3);
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

    final static void d(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null != wc.field_B) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    field_j = (String) null;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) wc.field_B;
                    // monitorenter wc.field_B
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        wc.field_B = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (param0 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_j = (String) null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ic a(qk param0, int param1, int param2, int param3, qk param4) {
        if (param1 == 0) {
          if (!tc.a(param2, param3, 25479, param0)) {
            return null;
          } else {
            return pa.a(param4.a(param2, (byte) -115, param3), -1);
          }
        } else {
          return (ic) null;
        }
    }

    public static void b(byte param0) {
        field_j = null;
        if (param0 <= 104) {
            field_j = (String) null;
        }
    }

    kf(long param0, int param1, byte[] param2) {
        ((kf) this).field_h = param1;
        ((kf) this).field_i = param2;
        ((kf) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Waiting for graphics";
    }
}
