/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg implements Runnable {
    qb field_c;
    static String field_e;
    static String field_f;
    volatile ap[] field_d;
    volatile boolean field_b;
    static String field_g;
    volatile boolean field_a;

    final static void a(int param0) {
        qq.field_I = ks.c(108);
        if (param0 != 0) {
          field_f = null;
          le.field_e = new tc();
          wa.a((byte) -50, true, true);
          return;
        } else {
          le.field_e = new tc();
          wa.a((byte) -50, true, true);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int[] param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param5) {
          param0--;
          L0: while (true) {
            if ((param0 ^ -1) <= -1) {
              var17 = param8;
              var10 = var17;
              var11 = param2;
              var12 = param6;
              var13 = param4;
              var14 = param1;
              var15 = (var17[var11] & 16711422) >> 112891169;
              var10[var11] = var15 - -(we.a(33471547, var14) >> -1893278351) - (-we.a(65280, var13 >> -664740759) + -(we.a(33423360, var12) >> 1442091329));
              param2++;
              param1 = param1 + param7;
              param6 = param6 + param9;
              param4 = param4 + param3;
              param0--;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static dc a(vr param0, String[] param1, int param2, int param3, int param4) {
        try {
            dc var5 = new dc(param2, param0, -1, param1);
            vi var6 = new vi();
            var5.field_g = var6.a((byte) -116);
            if (param3 != -22379) {
                return null;
            }
            try {
                if (false) throw (jn) null;
                var5.field_g.a(var5.field_v, param0, param3 + 22383);
                var5.e(0);
                var5.b(-124);
            } catch (jn jn) {
                throw new RuntimeException();
            }
            return var5;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        ap var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ShatteredPlansClient.field_F ? 1 : 0;
                    ((jg) this).field_a = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((jg) this).field_b) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var1_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-3 >= (var1_int ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = ((jg) this).field_d[var1_int];
                        if (var2 != null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2.e();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_int++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_int++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        jb.a((byte) -98, 10L);
                        var5 = null;
                        ud.a(-106, ((jg) this).field_c, (Object) null);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 12: {
                    ((jg) this).field_a = false;
                    return;
                }
                case 13: {
                    try {
                        var1 = (Exception) (Object) caughtException;
                        var6 = null;
                        jq.a(-29901, (Throwable) (Object) var1, (String) null);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    ((jg) this).field_a = false;
                    return;
                }
                case 15: {
                    try {
                        var3 = caughtException;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    ((jg) this).field_a = false;
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, boolean param1, java.net.URL param2) {
        String var3 = null;
        String var4 = null;
        L0: {
          var3 = null;
          if (cj.field_u == null) {
            break L0;
          } else {
            if (cj.field_u.equals((Object) (Object) param0.getParameter("settings"))) {
              break L0;
            } else {
              var3 = cj.field_u;
              var4 = var3;
              var4 = var3;
              break L0;
            }
          }
        }
        var4 = null;
        if (!param1) {
          if (cr.field_d != null) {
            if (cr.field_d.equals((Object) (Object) param0.getParameter("session"))) {
              return np.a(var3, -1, var4, false, param2);
            } else {
              var4 = cr.field_d;
              return np.a(var3, -1, var4, false, param2);
            }
          } else {
            return np.a(var3, -1, var4, false, param2);
          }
        } else {
          field_f = null;
          if (cr.field_d == null) {
            return np.a(var3, -1, var4, false, param2);
          } else {
            L1: {
              if (!cr.field_d.equals((Object) (Object) param0.getParameter("session"))) {
                var4 = cr.field_d;
                break L1;
              } else {
                break L1;
              }
            }
            return np.a(var3, -1, var4, false, param2);
          }
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        field_g = null;
        field_f = null;
        field_e = null;
        if (param0 <= -41) {
          return;
        } else {
          var2 = null;
          dc discarded$2 = jg.a((vr) null, (String[]) null, 30, -16, 113);
          return;
        }
    }

    jg() {
        ((jg) this).field_d = new ap[2];
        ((jg) this).field_b = false;
        ((jg) this).field_a = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Click to offer a Non-Agression Pact to <%0>.";
        field_e = "(<%0> players want to join)";
        field_g = "You have declined the invitation.";
    }
}
