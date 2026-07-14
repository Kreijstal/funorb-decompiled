/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends kj {
    private int field_f;
    private eaa field_g;
    static String field_h;

    final static String a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            Object stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Object stackOut_2_0 = null;
            String stackOut_8_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = BachelorFridge.field_y;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param1.getParameter("cookieprefix");
                            if (param0 == 11713) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return (String) (Object) stackIn_3_0;
                    }
                    case 4: {
                        try {
                            var3 = var9 + "settings";
                            var4 = (String) ac.a(param1, "getcookies", (byte) 64);
                            var5 = fda.a(-1, ';', var4);
                            var6 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var6 >= var5.length) {
                                statePc = 13;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 10;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = var5[var6].substring(var7 - -1).trim();
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return (String) (Object) stackIn_9_0;
                    }
                    case 10: {
                        try {
                            var6++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var2 = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (null != nb.field_q) {
                            statePc = 15;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return nb.field_q;
                    }
                    case 16: {
                        return param1.getParameter("settings");
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

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rea var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        rea stackIn_11_0 = null;
        rea stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        rea stackIn_12_0 = null;
        rea stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        rea stackIn_13_0 = null;
        rea stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        rea stackOut_10_0 = null;
        rea stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        rea stackOut_12_0 = null;
        rea stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        rea stackOut_11_0 = null;
        rea stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        var10 = BachelorFridge.field_y;
        ((pi) this).field_f = ((pi) this).field_f - 2;
        if (-1 == ((pi) this).field_f - 2) {
          return true;
        } else {
          L0: {
            if (((pi) this).field_f > 126) {
              break L0;
            } else {
              if (-51 >= ((pi) this).field_f) {
                break L0;
              } else {
                var2 = ((pi) this).field_f;
                var2 += 16;
                var3 = 0;
                L1: while (true) {
                  if ((var3 ^ -1) <= -73) {
                    break L0;
                  } else {
                    L2: {
                      var4 = kla.a(((pi) this).field_f, ((pi) this).field_e.field_h.field_w, -2147483648) + -(((pi) this).field_f >> 1643832321);
                      stackOut_7_0 = (((pi) this).field_f >> 913837122) - Math.abs(var4) / 2;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (0 < kla.a(2, ((pi) this).field_e.field_h.field_w, -2147483648)) {
                        stackOut_9_0 = stackIn_9_0;
                        stackOut_9_1 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L2;
                      } else {
                        stackOut_8_0 = stackIn_8_0;
                        stackOut_8_1 = -1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L2;
                      }
                    }
                    L3: {
                      var5 = stackIn_10_0 * stackIn_10_1;
                      int discarded$3 = kla.a(50, ((pi) this).field_e.field_h.field_w, -2147483648);
                      var6 = 64 + var4;
                      var7 = var5 + 32;
                      var8 = (int)(Math.sin(300.0 * (double)var2) * 100.0) * 0;
                      stackOut_10_0 = null;
                      stackOut_10_1 = null;
                      stackOut_10_2 = var6;
                      stackOut_10_3 = var8;
                      stackOut_10_4 = var7;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      stackIn_12_4 = stackOut_10_4;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      stackIn_11_3 = stackOut_10_3;
                      stackIn_11_4 = stackOut_10_4;
                      if (-6 >= (kla.a(20, ((pi) this).field_e.field_h.field_w, -2147483648) ^ -1)) {
                        stackOut_12_0 = null;
                        stackOut_12_1 = null;
                        stackOut_12_2 = stackIn_12_2;
                        stackOut_12_3 = stackIn_12_3;
                        stackOut_12_4 = stackIn_12_4;
                        stackOut_12_5 = aha.field_A[((pi) this).field_e.field_h.field_E][0];
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        stackIn_13_4 = stackOut_12_4;
                        stackIn_13_5 = stackOut_12_5;
                        break L3;
                      } else {
                        stackOut_11_0 = null;
                        stackOut_11_1 = null;
                        stackOut_11_2 = stackIn_11_2;
                        stackOut_11_3 = stackIn_11_3;
                        stackOut_11_4 = stackIn_11_4;
                        stackOut_11_5 = aha.field_A[((pi) this).field_e.field_h.field_E][1];
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_13_4 = stackOut_11_4;
                        stackIn_13_5 = stackOut_11_5;
                        break L3;
                      }
                    }
                    new rea(stackIn_13_2, stackIn_13_3, stackIn_13_4, stackIn_13_5);
                    var9 = (rea) (Object) stackIn_13_0;
                    int discarded$4 = kla.a(3, ((pi) this).field_e.field_h.field_w, -2147483648);
                    int discarded$5 = kla.a(5000, ((pi) this).field_e.field_h.field_w, -2147483648);
                    var9.field_o = (double)(-kla.a(2, ((pi) this).field_e.field_h.field_w, -2147483648));
                    var9.field_n = -kla.a(10, ((pi) this).field_e.field_h.field_w, -2147483648) + 25;
                    var9.field_h = -1;
                    ((pi) this).field_g.a((bw) (Object) var9, true);
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
          L4: {
            if (param0 >= 21) {
              break L4;
            } else {
              ((pi) this).field_g = null;
              break L4;
            }
          }
          r.a(-126, ((pi) this).field_f, ((pi) this).field_e.field_h.field_w, ((pi) this).field_g);
          return false;
        }
    }

    final static kv[] a(vr param0, int param1, String param2, String param3) {
        if (param1 != -8845) {
            field_h = null;
        }
        int var4 = param0.a(param2, false);
        int var5 = param0.a((byte) 6, var4, param3);
        return uka.a(var5, param1 ^ -8947, param0, var4);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            boolean discarded$0 = ((pi) this).b(57);
        }
    }

    pi(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        ((pi) this).field_f = 136;
        ((pi) this).field_g = new eaa();
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            return;
        }
        fv.a(param0, 65280, 10, ((pi) this).field_g, param2, (byte) -115);
    }

    public static void a(boolean param0) {
        if (param0) {
            field_h = null;
        }
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
