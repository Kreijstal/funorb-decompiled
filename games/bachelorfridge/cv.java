/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cv extends bca {
    final static void a(int param0, String param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            eh var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            ht stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            ht stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            ht stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            ht stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            ht stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            ht stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            String stackOut_13_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = BachelorFridge.field_y;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param2 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = sma.a(96, param2);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param1 == null) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param2 != null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_ref = var3_ref + param1;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            sl.a((byte) -86, var3_ref);
                            var7 = ig.a(param0 + -19385, var3_ref, ":", "%3a");
                            var8 = ig.a(-19384, var7, "@", "%40");
                            var9 = ig.a(param0 + -19385, var8, "&", "%26");
                            var10 = ig.a(-19384, var9, "#", "%23");
                            if (jia.field_m != null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = v.field_d;
                            stackOut_11_1 = null;
                            stackOut_11_2 = null;
                            stackOut_11_3 = jia.field_m.getCodeBase();
                            stackOut_11_4 = new StringBuilder().append("clienterror.ws?c=").append(ej.field_p).append("&u=");
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_13_3 = stackOut_11_3;
                            stackIn_13_4 = stackOut_11_4;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            stackIn_12_4 = stackOut_11_4;
                            if (null == da.field_b) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (ht) (Object) stackIn_12_0;
                            stackOut_12_1 = null;
                            stackOut_12_2 = null;
                            stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                            stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                            stackOut_12_5 = da.field_b;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (ht) (Object) stackIn_13_0;
                            stackOut_13_1 = null;
                            stackOut_13_2 = null;
                            stackOut_13_3 = (java.net.URL) (Object) stackIn_13_3;
                            stackOut_13_4 = (StringBuilder) (Object) stackIn_13_4;
                            stackOut_13_5 = "" + om.field_v;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            stackIn_14_3 = stackOut_13_3;
                            stackIn_14_4 = stackOut_13_4;
                            stackIn_14_5 = stackOut_13_5;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            new java.net.URL((java.net.URL) (Object) stackIn_14_3, (String) (Object) (stackIn_14_5 + "&v1=" + ht.field_g + "&v2=" + ht.field_c + "&e=" + var10));
                            var4 = ((ht) (Object) stackIn_14_0).a((java.net.URL) (Object) stackIn_14_1, param0 + 23);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var4.field_f != 0) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            gda.a(false, 1L);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param0 != var4.field_f) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var5 = (DataInputStream) var4.field_e;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var14 = null;
        var8 = BachelorFridge.field_y;
        if (param1 == 28850) {
          param5++;
          hba.a(param0, param3, tj.field_b[param5], param1 ^ 28853, param4);
          param2--;
          hba.a(param0, param3, tj.field_b[param2], param1 + -28843, param4);
          var6 = param5;
          L0: while (true) {
            if (param2 < var6) {
              return;
            } else {
              var13 = tj.field_b[var6];
              var10 = var13;
              var7 = var10;
              var13[param4] = param0;
              var7[param3] = param0;
              var6++;
              continue L0;
            }
          }
        } else {
          var9 = null;
          cv.a(70, (String) null, (Throwable) null);
          param5++;
          hba.a(param0, param3, tj.field_b[param5], param1 ^ 28853, param4);
          param2--;
          hba.a(param0, param3, tj.field_b[param2], param1 + -28843, param4);
          var6 = param5;
          L1: while (true) {
            if (param2 < var6) {
              return;
            } else {
              var14 = tj.field_b[var6];
              var11 = var14;
              var7 = var11;
              var14[param4] = param0;
              var7[param3] = param0;
              var6++;
              continue L1;
            }
          }
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new bk(param1, (cv) this);
    }

    final void a(op param0, int param1) {
        ((cv) this).a(param0, (byte) -2);
        int var3 = -4 / ((param1 - 12) / 35);
    }

    final static void d(int param0) {
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        if (!rs.b(true)) {
          if (kga.field_c != null) {
            if (!kga.field_c.field_f) {
              return;
            } else {
              lga.c((byte) 112);
              pja.field_e.a((wj) (Object) new em(pja.field_e, r.field_m), (byte) 93);
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$13 = pja.field_e.a(true, kh.field_q, ef.field_k, param0 + 6382);
          if (param0 != -1) {
            return;
          } else {
            pja.field_e.i(0);
            L0: while (true) {
              if (!kaa.b(127)) {
                return;
              } else {
                boolean discarded$14 = pja.field_e.a(dla.field_j, (byte) 7, gf.field_k);
                continue L0;
              }
            }
          }
        }
    }

    cv(int param0, nq param1) {
        super(param0, param1);
    }

    cv(lu param0) {
        super(param0);
        ((cv) this).field_k = param0.e((byte) 74);
        ((cv) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((cv) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    static {
    }
}
