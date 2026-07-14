/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai {
    static byte[][] field_e;
    static q field_a;
    static String field_d;
    static int field_c;
    static ti[] field_b;

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            oa var2 = null;
            int stackIn_16_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_37_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_36_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-5 >= oh.field_h.field_p) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (0 == oh.field_h.field_k) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 3;
                    }
                    case 5: {
                        if ((oh.field_h.field_k ^ -1) != 1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return 4;
                    }
                    case 7: {
                        return 1;
                    }
                    case 9: {
                        try {
                            if (0 == cl.field_A) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            wj.field_j = qi.field_a.a(60, nf.field_i, c.field_b);
                            cl.field_A = cl.field_A + 1;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (-2 != (cl.field_A ^ -1)) {
                                statePc = 20;
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
                            if ((wj.field_j.field_c ^ -1) == -3) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = og.a(2, -1);
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0;
                    }
                    case 17: {
                        try {
                            if (1 == wj.field_j.field_c) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            cl.field_A = cl.field_A + 1;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (cl.field_A != param0) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            re.field_y = new gj((java.net.Socket) wj.field_j.field_g, qi.field_a);
                            var2 = new oa(13);
                            qb.a(116, of.field_c, var2, uh.field_f, tl.field_c);
                            var2.f(param0 + 6387, 15);
                            var2.a(-109, dk.field_h);
                            re.field_y.a((byte) 9, var2.field_g, 13, 0);
                            cl.field_A = cl.field_A + 1;
                            ob.field_G = 30000L + lk.a(param0 ^ 2);
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
                            if ((cl.field_A ^ -1) != -4) {
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
                            if (re.field_y.a((byte) -125) <= 0) {
                                statePc = 29;
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
                            var1_int = re.field_y.c(1);
                            if (var1_int != 0) {
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
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = og.a(param0 ^ 0, var1_int);
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
                            cl.field_A = cl.field_A + 1;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (ob.field_G < lk.a(0)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = og.a(2, -2);
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        try {
                            if (4 != cl.field_A) {
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
                            oh.field_h.a(ck.field_A, (Object) (Object) re.field_y, param0 + 18);
                            re.field_y = null;
                            cl.field_A = 0;
                            wj.field_j = null;
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
                        return og.a(2, -3);
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
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 != 67) {
          int discarded$2 = ai.a(17);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void b(int param0) {
        String var1 = null;
        int var2 = 0;
        if (lb.field_d) {
          var2 = 33 / ((-70 - param0) / 55);
          if (null != wg.field_d) {
            wg.field_d.r(77);
            var1 = lb.a(true);
            ok.field_a = new ff(var1, (String) null, true, false, false);
            ci.field_f.b((qg) (Object) l.field_d, (byte) -71);
            l.field_d.b(-122, (qg) (Object) ok.field_a);
            l.field_d.p(27830);
            return;
          } else {
            var1 = lb.a(true);
            ok.field_a = new ff(var1, (String) null, true, false, false);
            ci.field_f.b((qg) (Object) l.field_d, (byte) -71);
            l.field_d.b(-122, (qg) (Object) ok.field_a);
            l.field_d.p(27830);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new byte[250][];
        field_a = new q();
    }
}
