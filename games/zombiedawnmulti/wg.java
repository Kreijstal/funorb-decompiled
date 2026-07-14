/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static String field_a;
    static String field_c;
    static String field_d;
    static String field_b;

    final static String a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2 = param1.getParameter("cookieprefix");
                            var3 = var2 + "settings";
                            var4 = (String) fo.b(param1, 13093, "getcookies");
                            var5 = mk.a(';', false, var4);
                            var6 = param0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var2_ref = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null != oe.field_c) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        return param1.getParameter("settings");
                    }
                    case 12: {
                        return oe.field_c;
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

    final static int c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var1 = 0;
        L0: while (true) {
          if (!ba.c(-1)) {
            mo.field_Jb.a(aj.a(bo.field_d, false, bd.field_g), 56, aj.a(ka.field_t, false, vb.field_f));
            if (param0 < -26) {
              L1: {
                if (!mo.field_Jb.c(-85)) {
                  break L1;
                } else {
                  var1 = 1;
                  break L1;
                }
              }
              var2 = 0;
              if (var1 != 0) {
                if ((mo.field_Jb.field_d ^ -1) <= -1) {
                  var2 = oq.field_x[mo.field_Jb.field_d];
                  if ((var2 ^ -1) != -3) {
                    return var2;
                  } else {
                    mo.i(-38);
                    return var2;
                  }
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              return 112;
            }
          } else {
            mo.field_Jb.d(99);
            if (!mo.field_Jb.c(-85)) {
              continue L0;
            } else {
              var1 = 1;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 > -60) {
            field_a = null;
        }
    }

    final static void b(byte param0) {
        if (param0 <= 36) {
          field_a = null;
          io.a(8355711, nc.field_e, kc.field_c, wa.field_a, vo.field_m);
          return;
        } else {
          io.a(8355711, nc.field_e, kc.field_c, wa.field_a, vo.field_m);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_b = "Day";
        field_d = "That name is not available";
        field_c = "Please try again in a few minutes.";
    }
}
