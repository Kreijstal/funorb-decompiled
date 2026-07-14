/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dv implements mh {
    private ld field_a;
    static boolean field_b;
    static String field_c;

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        L0: {
          if (param2 == 5592405) {
            break L0;
          } else {
            field_b = true;
            break L0;
          }
        }
        L1: {
          var6 = param0.field_r + param4;
          var7 = param1 - -param0.field_v;
          nn.a(param0.field_p, var6, param0.field_q, (byte) -84, var7);
          if (!param0.d(-1)) {
            break L1;
          } else {
            pp.a(var7 + 2, param0.field_q + -4, -13181, var6 + 2, -4 + param0.field_p);
            break L1;
          }
        }
        L2: {
          lk.d(var6, var7, -2 + param0.field_q + var6, param0.field_p + var7);
          var8 = ((dv) this).field_a.field_B.a(-72);
          if (var8 != null) {
            var9 = var8.toString();
            ((dv) this).field_a.field_G.b(var9, var6 + 2, (((dv) this).field_a.field_G.field_s + param0.field_p >> -681277599) + (var7 + -1), 10000536, -1);
            if (!((dv) this).field_a.d(-1)) {
              break L2;
            } else {
              if (!var9.startsWith(((dv) this).field_a.field_L)) {
                break L2;
              } else {
                var10 = ((dv) this).field_a.field_G.a(((dv) this).field_a.field_L);
                lk.b(var6 - -2, var7 - -2, var10, param0.field_p + -4, 2188450, 100);
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        lk.d();
    }

    final static ne[] a(boolean param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (!param0) {
            field_b = false;
        }
        ne[] var1 = new ne[rl.field_n];
        for (var2 = 0; var2 < rl.field_n; var2++) {
            var1[var2] = new ne(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], ag.field_d[var2], iv.field_l);
        }
        tl.a((byte) -68);
        return var1;
    }

    dv(ld param0) {
        ((dv) this).field_a = param0;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 59) {
            Object var2 = null;
            String discarded$0 = dv.a(-92, (java.applet.Applet) null);
        }
    }

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
            String stackIn_7_0 = null;
            String stackOut_6_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Sumoblitz.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param1.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) tw.a(param1, 109, "getcookies");
                            var5 = cn.a(';', var4, -27224);
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
                            if (var5.length <= var6) {
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
                        var2 = caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (param0 <= -2) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return null;
                    }
                    case 13: {
                        if (bf.field_d != null) {
                            statePc = 15;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return bf.field_d;
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

    static {
    }
}
