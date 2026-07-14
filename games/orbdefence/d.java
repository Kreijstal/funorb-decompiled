/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class d extends ca {
    int field_i;
    static boolean field_g;
    static boolean field_k;
    static String field_h;
    static int field_j;
    int field_f;

    final static void b(byte param0) {
        if (param0 > -31) {
          return;
        } else {
          L0: {
            if (bm.field_d != null) {
              bm.field_d.l(-113);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (na.field_c != null) {
              na.field_c.p(1);
              break L1;
            } else {
              break L1;
            }
          }
          pf.a(104);
          return;
        }
    }

    final static int d(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            mg var2 = null;
            int stackIn_17_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_16_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_35_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 <= -86) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return 21;
                    }
                    case 2: {
                        if (kg.field_h.field_b >= 4) {
                            statePc = 4;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (-1 == kg.field_h.field_n) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return 3;
                    }
                    case 7: {
                        if (-2 == kg.field_h.field_n) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        return 1;
                    }
                    case 9: {
                        return 4;
                    }
                    case 11: {
                        try {
                            if (mc.field_j != 0) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            cf.field_a = lh.field_b.a(ta.field_z, 0, fm.field_c);
                            mc.field_j = mc.field_j + 1;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (mc.field_j != -2) {
                                statePc = 20;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (-3 == cf.field_a.field_a) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = kk.a(-30179, -1);
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0;
                    }
                    case 18: {
                        try {
                            if (1 != cf.field_a.field_a) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            mc.field_j = mc.field_j + 1;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (2 != mc.field_j) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            dd.field_A = new cb((java.net.Socket) cf.field_a.field_g, lh.field_b);
                            var2 = new mg(13);
                            nl.a(20994, hc.field_f, tk.field_m, var2, s.field_x);
                            var2.a(15, -49);
                            var2.b(m.field_b, -1);
                            dd.field_A.a((byte) 30, var2.field_j, 0, 13);
                            mc.field_j = mc.field_j + 1;
                            n.field_b = 30000L + ji.b(-75);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (mc.field_j != 3) {
                                statePc = 32;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (dd.field_A.b((byte) 101) > 0) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if ((ji.b(103) ^ -1L) >= (n.field_b ^ -1L)) {
                                statePc = 32;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = kk.a(-30179, -2);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            var1_int = dd.field_A.a(true);
                            if (var1_int != 0) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            stackOut_29_0 = kk.a(-30179, var1_int);
                            stackIn_30_0 = stackOut_29_0;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        return stackIn_30_0;
                    }
                    case 31: {
                        try {
                            mc.field_j = mc.field_j + 1;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (4 != mc.field_j) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            kg.field_h.a((Object) (Object) dd.field_A, 20, il.field_a);
                            dd.field_A = null;
                            cf.field_a = null;
                            mc.field_j = 0;
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        try {
                            stackOut_35_0 = -1;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0;
                    }
                    case 37: {
                        var1 = (IOException) (Object) caughtException;
                        return kk.a(-30179, -3);
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

    public static void a(byte param0) {
        if (param0 >= -117) {
            return;
        }
        field_h = null;
    }

    final static void c(byte param0) {
        ck.field_j = new rf();
        kg.field_j.a(false, (pj) (Object) ck.field_j);
        if (param0 >= -65) {
            field_h = null;
        }
    }

    private d() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = false;
        field_h = "Norb Strength<br><%0>";
        field_k = true;
    }
}
