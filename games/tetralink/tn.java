/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tn {
    static hl field_a;
    static hl field_b;

    final static int b(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            bh var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_34_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (4 > vh.field_e.field_h) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (-1 != vh.field_e.field_d) {
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
                        if (-2 == vh.field_e.field_d) {
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
                            if (on.field_b == 0) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            hd.field_x = ug.field_ab.a(ud.field_Nb, ji.field_Lb, (byte) 107);
                            on.field_b = on.field_b + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (on.field_b != 1) {
                                statePc = 17;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (hd.field_x.field_d != 2) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = qk.a(-1, true);
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0;
                    }
                    case 14: {
                        try {
                            if ((hd.field_x.field_d ^ -1) == -2) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            on.field_b = on.field_b + 1;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (on.field_b != 2) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            li.field_g = new fl((java.net.Socket) hd.field_x.field_f, ug.field_ab);
                            var2 = new bh(13);
                            je.a(-94, dh.field_l, var2, je.field_f, ui.field_g);
                            var2.a(15, false);
                            var2.d(c.field_f, (byte) -124);
                            li.field_g.a(true, 13, var2.field_u, 0);
                            on.field_b = on.field_b + 1;
                            od.field_T = k.a(0) + 30000L;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (param0 < -76) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            int discarded$2 = tn.b(-79);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (-4 == (on.field_b ^ -1)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (li.field_g.f(0) > 0) {
                                statePc = 28;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (k.a(0) > od.field_T) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = qk.a(-2, true);
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        return stackIn_27_0;
                    }
                    case 28: {
                        try {
                            var1_int = li.field_g.c(3);
                            if (var1_int == 0) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            stackOut_29_0 = qk.a(var1_int, true);
                            stackIn_30_0 = stackOut_29_0;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        return stackIn_30_0;
                    }
                    case 31: {
                        try {
                            on.field_b = on.field_b + 1;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (4 == on.field_b) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            vh.field_e.a((Object) (Object) li.field_g, um.field_o, (byte) -122);
                            li.field_g = null;
                            on.field_b = 0;
                            hd.field_x = null;
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0;
                    }
                    case 36: {
                        var1 = (IOException) (Object) caughtException;
                        return qk.a(-3, true);
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

    public static void a(int param0) {
        field_a = null;
        if (param0 != -2) {
            tn.a(34);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int a(boolean param0, int param1, String param2) {
        if (param1 != 1) {
            return -59;
        }
        if (!param0) {
            return ko.field_u.b(param2);
        }
        return oi.field_a.b(param2);
    }

    static {
    }
}
