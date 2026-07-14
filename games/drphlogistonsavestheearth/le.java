/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static nh field_d;
    static ok field_e;
    static String[] field_a;
    static he field_c;
    static he[] field_b;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (param0) {
            field_e = null;
        }
        field_e = null;
        field_c = null;
        field_d = null;
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        if (param0 != 63) {
            return '';
        }
        int var2 = param1 & 255;
        if (!(var2 != 0)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 <= var2) {
            if ((var2 ^ -1) > -161) {
                var3 = we.field_a[-128 + var2];
                if (!(0 != var3)) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    final static void a(u param0, boolean param1, int param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          fb.field_b[0] = cm.field_M.nextInt();
          fb.field_b[1] = cm.field_M.nextInt();
          am.field_n.field_j = 0;
          fb.field_b[2] = (int)(s.field_c >> -597919456);
          fb.field_b[3] = (int)s.field_c;
          am.field_n.a(fb.field_b[0], (byte) -49);
          am.field_n.a(fb.field_b[1], (byte) 119);
          am.field_n.a(fb.field_b[2], (byte) -50);
          am.field_n.a(fb.field_b[3], (byte) -44);
          u.a(am.field_n, (byte) -102);
          am.field_n.c(param2, -17402);
          param0.a(am.field_n, param4 ^ 103);
          nj.field_p.field_j = 0;
          if (param3) {
            nj.field_p.c(18, (byte) -128);
            break L0;
          } else {
            nj.field_p.c(16, (byte) -105);
            break L0;
          }
        }
        L1: {
          nj.field_p.field_j = nj.field_p.field_j + 2;
          var5 = nj.field_p.field_j;
          nj.field_p.a(nf.field_t, (byte) 113);
          nj.field_p.a(n.field_i, (byte) -25);
          var6 = 0;
          if (!bd.field_N) {
            break L1;
          } else {
            var6 = var6 | 1;
            break L1;
          }
        }
        L2: {
          if (wg.field_d) {
            var6 = var6 | 4;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!param1) {
            break L3;
          } else {
            var6 = var6 | 8;
            break L3;
          }
        }
        L4: {
          if (cj.field_i == null) {
            break L4;
          } else {
            var6 = var6 | 16;
            break L4;
          }
        }
        L5: {
          nj.field_p.c(var6, (byte) -107);
          var7 = ob.a((byte) 117, nb.a(-109));
          if (var7 == null) {
            var7 = "";
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          nj.field_p.a(var7, -1);
          if (cj.field_i == null) {
            break L6;
          } else {
            nj.field_p.a(-23805, cj.field_i);
            break L6;
          }
        }
        i.a((od) (Object) nj.field_p, am.field_n, a.field_b, d.field_a, 0);
        nj.field_p.a(-2, nj.field_p.field_j + -var5);
        if (param4 == 16) {
          qj.a(-1, 14656);
          return;
        } else {
          return;
        }
    }

    final static String a(java.applet.Applet param0, String param1, int param2) {
        try {
            int var3_int = 0;
            Throwable var3 = null;
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
                        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_int = -108 % ((param2 - -47) / 54);
                            var4 = (String) pb.a("getcookies", param0, true);
                            var5 = ki.a((byte) -113, ';', var4);
                            var6 = 0;
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
                            if (var6 >= var5.length) {
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
                            if (-1 < (var7 ^ -1)) {
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
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) param1)) {
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
                            stackOut_5_0 = var5[var6].substring(var7 + 1).trim();
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
                        var3 = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        return null;
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
        field_a = new String[]{"Introduction", "It gets harder", "The first command ship", "Asteroids!", "Mines!", "Alien starbase", "If these are the wastelands...", "...what are the cities like?", "The final showdown"};
    }
}
