/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ac {
    static String field_a;
    static String field_d;
    static ih field_c;
    static int field_b;

    final static void a(int param0, int param1) {
        int discarded$4 = dj.a(6445);
        if (param0 != 25972) {
            field_c = null;
        }
    }

    final static void b(int param0) {
        if (bk.field_r == null) {
          if (param0 != 112) {
            ac.d(-21);
            return;
          } else {
            return;
          }
        } else {
          bk.field_r.a((byte) -124);
          if (param0 == 112) {
            return;
          } else {
            ac.d(-21);
            return;
          }
        }
    }

    final static void d(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = EscapeVector.field_A;
                        if (od.field_j != null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        od.field_j.a(param0 ^ -16802);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (uk.field_b != null) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        uk.field_b.a(-24580);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (param0 == -16802) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        if (uc.field_h != null) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            uc.field_h.a((byte) -111);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (bg.field_e != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        return;
                    }
                    case 15: {
                        var1 = 0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (bg.field_e.length <= var1) {
                            statePc = 24;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (bg.field_e[var1] != null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        var1++;
                        var1++;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 20: {
                        try {
                            bg.field_e[var1].a((byte) -111);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var1++;
                        var1++;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 22: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 24: {
                        return;
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

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = EscapeVector.field_A;
                    var1 = (Object) (Object) ck.field_v;
                    // monitorenter ck.field_v
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 28087) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_b = -95;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ui.field_e = ui.field_e + 1;
                        ve.field_l = ta.field_w;
                        if (sb.field_b < 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (m.field_k == sb.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = hc.field_C[m.field_k];
                        m.field_k = 127 & 1 + m.field_k;
                        if (0 <= var2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ik.field_h[var2 ^ -1] = false;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ik.field_h[var2] = true;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = 0;
                        var2 = var5;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (112 <= var5) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ik.field_h[var5] = false;
                        var5++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        sb.field_b = m.field_k;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ta.field_w = bn.field_b;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var3;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ab a(String param0, int param1, mf param2, String param3, mf param4) {
        int var5 = 4 % ((50 - param1) / 60);
        int var6 = param2.b(-1, param3);
        int var7 = param2.a(var6, param0, true);
        return ha.a(var6, -198630768, param4, var7, param2);
    }

    public static void c(int param0) {
        field_d = null;
        int var1 = 76 / ((param0 - -3) / 33);
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
