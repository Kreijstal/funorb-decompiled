/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ag {
    static String field_d;
    static boolean field_c;
    static ea[] field_a;
    static ta field_b;

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        if (!th.field_b[param1][cm.field_o]) {
          return;
        } else {
          if (param0) {
            L0: {
              if (ke.field_X[param1]) {
                break L0;
              } else {
                if (!ke.field_V) {
                  break L0;
                } else {
                  if (!sc.field_b) {
                    break L0;
                  } else {
                    if (d.a(param1, cm.field_o, (byte) 68)) {
                      break L0;
                    } else {
                      L1: {
                        if (0 > param3) {
                          break L1;
                        } else {
                          if (param2 < 0) {
                            break L1;
                          } else {
                            if (li.field_c <= 0) {
                              break L1;
                            } else {
                              if (db.field_d <= 0) {
                                break L1;
                              } else {
                                L2: {
                                  if (-li.field_c + param3 < 0) {
                                    break L2;
                                  } else {
                                    if (608 < -li.field_c + param3) {
                                      break L2;
                                    } else {
                                      L3: {
                                        if (-db.field_d + param2 < 0) {
                                          break L3;
                                        } else {
                                          if (-db.field_d + param2 > 448) {
                                            break L3;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                      return;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                        }
                      }
                      ke.field_X[param1] = true;
                      if (!fi.field_a[param1]) {
                        L4: {
                          if (!ok.field_b.e((byte) 119)) {
                            break L4;
                          } else {
                            if (!bl.g(0)) {
                              break L4;
                            } else {
                              if (ja.field_u <= 150) {
                                break L4;
                              } else {
                                ok.field_b.a((byte) -93, (pi) (Object) new tm(param1, param3, param2, false));
                                ra.a(param1, (byte) -59);
                                ja.field_u = 0;
                                break L0;
                              }
                            }
                          }
                        }
                        ke.field_X[param1] = false;
                        break L0;
                      } else {
                        ec.field_c.a((byte) -93, (pi) (Object) new tm(param1, param3, param2, true));
                        ra.a(param1, (byte) -59);
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static void a(hf param0, int param1, int param2) {
        ld var6 = null;
        int var4 = 0;
        try {
            var6 = sn.field_c;
            if (param2 >= -107) {
                Object var5 = null;
                String discarded$0 = ag.a((java.applet.Applet) null, false);
            }
            var6.d((byte) -46, param1);
            var6.field_o = var6.field_o + 1;
            var4 = var6.field_o;
            var6.c(1, 25564);
            if (null == param0.field_n) {
                var6.c(0, 25564);
            } else {
                var6.c(param0.field_n.length, 25564);
                var6.a(0, param0.field_n.length, true, param0.field_n);
            }
            int discarded$1 = var6.e(74, var4);
            var6.field_o = var6.field_o - 4;
            param0.field_o = var6.b((byte) 51);
            var6.g(-1, -var4 + var6.field_o);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ag.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(java.applet.Applet param0, boolean param1) {
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
            String stackIn_7_0 = null;
            String stackIn_14_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            String stackOut_6_0 = null;
            String stackOut_13_0 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = MinerDisturbance.field_ab;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param0.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) lk.a((byte) 18, "getcookies", param0);
                            var5 = h.a(';', param1, var4);
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var6 >= var5.length) {
                                statePc = 11;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0;
                    }
                    case 8: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = caughtException;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (null != nj.field_a) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            return param0.getParameter("settings");
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = nj.field_a;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_15_0 = (RuntimeException) var2_ref;
                        stackOut_15_1 = new StringBuilder().append("ag.A(");
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param0 == null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "null";
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        throw lj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
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
        field_c = false;
        field_b = new ta();
    }
}
