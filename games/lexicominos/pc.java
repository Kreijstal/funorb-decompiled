/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pc extends tj {
    static int[] field_n;
    static String field_m;
    static String field_l;

    public static void d(byte param0) {
        field_n = null;
        if (param0 >= -52) {
            return;
        }
        field_m = null;
        field_l = null;
    }

    final static bd a(int param0, int param1, byte param2, int param3, int param4) {
        param3 = -param3 + 11;
        if (param2 != 14) {
          return null;
        } else {
          return new bd(-18 + 18 * ((param0 * 12 + param3) * 12 - -param1) - -param4 + -1);
        }
    }

    pc(rl param0) {
        super(param0);
    }

    final sc a(int param0, String param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (ui.a((byte) -100, param1) != null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param0 == 0) {
          if (var3 == 0) {
            return ni.field_b;
          } else {
            return rh.field_p;
          }
        } else {
          return null;
        }
    }

    final String a(byte param0, String param1) {
        if (param0 != -126) {
            return null;
        }
        if (((pc) this).a(0, param1) == ni.field_b) {
            return gd.field_j;
        }
        return fj.field_x;
    }

    final static int e(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            wf var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_22_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_31_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_21_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_30_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (kb.field_b.field_p >= 4) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if ((kb.field_b.field_j ^ -1) != 0) {
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
                        if (kb.field_b.field_j != -2) {
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
                            if (gj.field_t != param0) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            lj.field_b = sa.field_g.a(rc.field_i, (byte) 121, fl.field_d);
                            gj.field_t = gj.field_t + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (-2 != gj.field_t) {
                                statePc = 16;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (-3 != lj.field_b.field_b) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = ca.a(-51, -1);
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0;
                    }
                    case 14: {
                        try {
                            if (-2 != lj.field_b.field_b) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            gj.field_t = gj.field_t + 1;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (-3 != gj.field_t) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            re.field_X = new ge((java.net.Socket) lj.field_b.field_g, sa.field_g);
                            var2 = new wf(13);
                            la.a((byte) -48, ni.field_e, var2, fc.field_q, qd.field_b);
                            var2.c(15, param0 ^ -1);
                            var2.f(wg.field_e, -32287);
                            re.field_X.a(var2.field_j, 13, 111, 0);
                            gj.field_t = gj.field_t + 1;
                            ta.field_f = rf.c(0) - -30000L;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (3 != gj.field_t) {
                                statePc = 27;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (0 >= re.field_X.d(-6448)) {
                                statePc = 24;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var1_int = re.field_X.e(291208897);
                            if (var1_int == 0) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            stackOut_21_0 = ca.a(-51, var1_int);
                            stackIn_22_0 = stackOut_21_0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return stackIn_22_0;
                    }
                    case 23: {
                        try {
                            gj.field_t = gj.field_t + 1;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if ((rf.c(0) ^ -1L) >= (ta.field_f ^ -1L)) {
                                statePc = 27;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = ca.a(-51, -2);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            if (-5 != (gj.field_t ^ -1)) {
                                statePc = 30;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            kb.field_b.a(Lexicominos.field_E, param0 + -110, (Object) (Object) re.field_X);
                            lj.field_b = null;
                            re.field_X = null;
                            gj.field_t = 0;
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            stackOut_30_0 = -1;
                            stackIn_31_0 = stackOut_30_0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        return stackIn_31_0;
                    }
                    case 32: {
                        var1 = (IOException) (Object) caughtException;
                        return ca.a(-51, -3);
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
        field_n = new int[8192];
        field_m = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_l = "Service unavailable";
    }
}
