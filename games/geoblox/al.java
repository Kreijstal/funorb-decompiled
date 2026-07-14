/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        wc var4_ref_wc = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        ca var8 = null;
        pk var9 = null;
        byte[] var13 = null;
        var6 = Geoblox.field_C;
        if (param0 == 26146) {
          L0: {
            var9 = eh.field_d;
            var2 = var9.c((byte) 34);
            if (var2 == 0) {
              var8 = (ca) (Object) qa.field_e.g(0);
              if (var8 != null) {
                L1: {
                  var4 = var9.c((byte) 34);
                  if (0 != var4) {
                    var13 = new byte[var4];
                    var9.b(29915, var4, var13, 0);
                    break L1;
                  } else {
                    var5 = null;
                    break L1;
                  }
                }
                var9.field_f = var9.field_f + 4;
                if (var9.h((byte) 20)) {
                  var8.a(false);
                  break L0;
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
                L2: while (true) {
                  L3: {
                    if (var4_ref_wc == null) {
                      break L3;
                    } else {
                      if (var3 == var4_ref_wc.field_h) {
                        break L3;
                      } else {
                        var4_ref_wc = (wc) (Object) l.field_g.d(1);
                        continue L2;
                      }
                    }
                  }
                  if (var4_ref_wc != null) {
                    var4_ref_wc.a(false);
                    break L0;
                  } else {
                    jl.a((byte) -124);
                    return;
                  }
                }
              } else {
                gi.a((Throwable) null, "A1: " + og.e(55), (byte) 125);
                jl.a((byte) -120);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        var2 = qi.b(3, param0 ^ 9667);
        if (param0 == 9666) {
          L0: {
            var3 = param1;
            if (var3 != -5) {
              if (var3 == 3) {
                td.a(-348, fl.field_c[var2 + 13]);
                break L0;
              } else {
                if (-2 != var3) {
                  if (-1 != (var3 ^ -1)) {
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
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_8_0 = 0;
            int stackIn_17_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Geoblox.field_C;
                        if (td.field_H) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) wk.a((byte) -6, param1, "getcookies");
                            var4 = uj.a(';', true, var3);
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 10;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = 1;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            var5++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (param0 == -109) {
                                statePc = 14;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            al.a(114, -32);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2_ref = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (null == param1.getParameter("tuhstatbut")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
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
