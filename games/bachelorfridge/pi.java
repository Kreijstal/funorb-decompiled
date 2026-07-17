/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class pi extends kj {
    private int field_f;
    private eaa field_g;
    static String field_h;

    final static String a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            Object stackIn_3_0 = null;
            String stackIn_9_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Object stackOut_2_0 = null;
            String stackOut_8_0 = null;
            String stackOut_15_0 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
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
                        return stackIn_9_0;
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
                        try {
                            var2 = caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (null != nb.field_q) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            return param1.getParameter("settings");
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = nb.field_q;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0;
                    }
                    case 17: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_17_0 = (RuntimeException) var2_ref;
                        stackOut_17_1 = new StringBuilder().append("pi.C(").append(param0).append(44);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param1 == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
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
        int fieldTemp$4 = ((pi) this).field_f - 2;
        ((pi) this).field_f = ((pi) this).field_f - 2;
        if (-1 == fieldTemp$4) {
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
                  if (var3 >= 72) {
                    break L0;
                  } else {
                    L2: {
                      var4 = kla.a(((pi) this).field_f, ((pi) this).field_e.field_h.field_w, -2147483648) + -(((pi) this).field_f >> 1);
                      stackOut_7_0 = (((pi) this).field_f >> 2) - Math.abs(var4) / 2;
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
                      int discarded$5 = kla.a(50, ((pi) this).field_e.field_h.field_w, -2147483648);
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
                      if (kla.a(20, ((pi) this).field_e.field_h.field_w, -2147483648) >= 5) {
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
                    var9 = new rea(stackIn_13_2, stackIn_13_3, stackIn_13_4, stackIn_13_5);
                    int discarded$6 = kla.a(3, ((pi) this).field_e.field_h.field_w, -2147483648);
                    int discarded$7 = kla.a(5000, ((pi) this).field_e.field_h.field_w, -2147483648);
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kv[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -8845) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            var4_int = param0.a(param2, false);
            var5 = param0.a((byte) 6, var4_int, param3);
            stackOut_2_0 = uka.a(var5, param1 ^ -8947, param0, var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("pi.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            boolean discarded$0 = ((pi) this).b(57);
        }
    }

    pi(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            ((pi) this).field_f = 136;
            ((pi) this).field_g = new eaa();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            return;
        }
        fv.a(param0, 65280, 10, ((pi) this).field_g, param2, (byte) -115);
    }

    public static void a(boolean param0) {
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
