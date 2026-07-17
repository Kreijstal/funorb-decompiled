/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        wc var4_ref_wc = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        ca var8 = null;
        pk var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var9 = eh.field_d;
              var2 = var9.c((byte) 34);
              if (var2 == 0) {
                var8 = (ca) (Object) qa.field_e.g(0);
                if (var8 != null) {
                  L2: {
                    var4 = var9.c((byte) 34);
                    if (0 != var4) {
                      var13 = new byte[var4];
                      var9.b(29915, var4, var13, 0);
                      break L2;
                    } else {
                      var5 = null;
                      break L2;
                    }
                  }
                  var9.field_f = var9.field_f + 4;
                  if (var9.h((byte) 20)) {
                    var8.a(false);
                    break L1;
                  } else {
                    jl.a((byte) -121);
                    return;
                  }
                } else {
                  jl.a((byte) -124);
                  return;
                }
              } else {
                if (1 == var2) {
                  var3 = var9.a((byte) -101);
                  var4_ref_wc = (wc) (Object) l.field_g.g(0);
                  L3: while (true) {
                    L4: {
                      if (var4_ref_wc == null) {
                        break L4;
                      } else {
                        if (var3 == var4_ref_wc.field_h) {
                          break L4;
                        } else {
                          var4_ref_wc = (wc) (Object) l.field_g.d(1);
                          continue L3;
                        }
                      }
                    }
                    if (var4_ref_wc != null) {
                      var4_ref_wc.a(false);
                      break L1;
                    } else {
                      jl.a((byte) -124);
                      return;
                    }
                  }
                } else {
                  int discarded$16 = 125;
                  gi.a((Throwable) null, "A1: " + og.e(55));
                  jl.a((byte) -120);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "al.B(" + 26146 + 41);
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Geoblox.field_C;
          var2 = qi.b(3, 1);
          var3 = param1;
          if (var3 != 4) {
            if (var3 == 3) {
              td.a(-348, fl.field_c[var2 + 13]);
              break L0;
            } else {
              if (var3 != 1) {
                if (var3 != 0) {
                  if (var3 == 6) {
                    td.a(-348, fl.field_c[var2 + 4]);
                    break L0;
                  } else {
                    if (5 == var3) {
                      td.a(-348, fl.field_c[16 + var2]);
                      break L0;
                    } else {
                      if (var3 == 2) {
                        td.a(-348, fl.field_c[var2 + 19]);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                } else {
                  td.a(-348, fl.field_c[var2 + 1]);
                  break L0;
                }
              } else {
                td.a(-348, fl.field_c[7 - -var2]);
                break L0;
              }
            }
          } else {
            td.a(-348, fl.field_c[10 + var2]);
            break L0;
          }
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Geoblox.field_C;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (td.field_H) {
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 1;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) wk.a((byte) -6, param1, "getcookies");
                            var4 = uj.a(';', true, var3);
                            var5 = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 12;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var2_ref2 = caughtException;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (null == param1.getParameter("tuhstatbut")) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_20_0 = (RuntimeException) var2_ref;
                        stackOut_20_1 = new StringBuilder().append("al.A(").append(-109).append(44);
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param1 == null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 22: {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "null";
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
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

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String b(int param0) {
        if (!(tf.field_d != kd.field_b)) {
            return oc.field_a;
        }
        if (tf.field_d == si.field_g) {
            return cg.field_k;
        }
        if (param0 != 0) {
            String discarded$0 = al.b(66);
        }
        if (!ih.field_c.a(-91)) {
            return cg.field_k;
        }
        return b.field_a;
    }

    static {
    }
}
