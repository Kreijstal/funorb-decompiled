/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class al extends mi implements bo, wi {
    static String field_i;
    static oi[] field_j;
    static String field_g;
    rd field_h;

    public final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return ((al) this).field_h.h(54);
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        int var2 = param0.charAt(0);
        for (var3 = 1; var3 < param0.length(); var3++) {
            if (param0.charAt(var3) != var2) {
                return false;
            }
        }
        if (param1 < 123) {
            Object var5 = null;
            al.a((String) null, -75, (String[]) null, -81);
        }
        return true;
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        String[] var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        cb.field_c = rg.field_d;
        if (param3 != 100) {
            Object var6 = null;
            al.a((String) null, -66, 0.017817853018641472f);
        }
        if (-256 == (param1 ^ -1)) {
            de.field_ob = Virogrid.b((byte) -32, 13 > nf.field_d ? true : false);
            Object var7 = null;
            nl.a(-22063, (String[]) null);
        } else {
            if (param1 >= 100) {
                // if_icmplt L116
                var4 = param2;
                nl.a(-22063, var4);
                de.field_ob = md.a(param2, 7655);
            } else {
                de.field_ob = lc.a(param1, param0, param3 ^ 29521);
            }
        }
    }

    final wl f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wl stackIn_2_0 = null;
        wl stackIn_5_0 = null;
        wl stackIn_9_0 = null;
        wl stackOut_1_0 = null;
        wl stackOut_4_0 = null;
        wl stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((al) this).field_h.f(-2);
                        var3 = ((al) this).field_h.g(param0 ^ 843083348);
                        var4 = ((al) this).field_h.g(true);
                        var5 = hn.c(false);
                        if (var4 >= 1890) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = ee.field_c;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        if (-3 + var5 >= var4) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = ee.field_c;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        if (!th.a((byte) 127, var4, var2_int, var3)) {
                            statePc = 8;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = ee.field_c;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        if (param0 == -843083384) {
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
                        field_i = null;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    return ee.field_c;
                }
                case 14: {
                    return bm.field_i;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte[] param0, int[] param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var7 = 0;
        int var8 = Virogrid.field_F ? 1 : 0;
        int var6 = 22 % ((54 - param4) / 42);
        for (var5 = 0; var5 < da.field_g.length; var5++) {
            param2 = da.field_g[var5];
            var7 = var5 << -70172348;
            while (true) {
                param2--;
                if (param2 == 0) {
                    break;
                }
                var7++;
                param3 = bf.field_m[var7];
                param1[param0[param3]] = param1[param0[param3]] + 1;
                bf.field_m[param1[param0[param3]]] = param3;
            }
        }
    }

    final static void b(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == oj.field_Ub) {
                break L0;
              } else {
                L1: {
                  if (0 > param1) {
                    break L1;
                  } else {
                    if (kh.field_c == ug.field_a) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (gk.field_g.field_l != 0) {
                    break L2;
                  } else {
                    if ((ud.field_a + 10000L ^ -1L) > (hc.a(-9986) ^ -1L)) {
                      gk.field_g.g(param1, 8);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param0 == -1) {
                    break L3;
                  } else {
                    field_i = null;
                    break L3;
                  }
                }
                L4: {
                  if (0 < gk.field_g.field_l) {
                    try {
                      oj.field_Ub.a(gk.field_g.field_g, param0 + 1, 0, gk.field_g.field_l);
                      ud.field_a = hc.a(-9986);
                    } catch (java.io.IOException decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    iOException = (IOException) (Object) decompiledCaughtException;
                    tn.a(false);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                gk.field_g.field_l = 0;
              }
            }
            gk.field_g.field_l = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void i(int param0) {
        if (ae.field_g != null) {
            ae.field_g.d();
        }
        if (!(ac.field_c == null)) {
            ac.field_c.d();
        }
        if (param0 != 100) {
            al.b(89, -96);
        }
    }

    public static void g(int param0) {
        if (param0 != -1) {
            al.i(-50);
        }
        field_i = null;
        field_j = null;
        field_g = null;
    }

    final static boolean h(int param0) {
        if (param0 < 25) {
            al.g(78);
        }
        if (!(qc.field_h)) {
            return false;
        }
        if (-1 == (sd.field_e ^ -1)) {
            return true;
        }
        return false;
    }

    public final void a(boolean param0, wa param1) {
        if (param0) {
            ((al) this).field_h = null;
        }
    }

    final String c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackOut_3_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((al) this).field_h.f(-2);
                        var3 = ((al) this).field_h.g(-39);
                        var4 = ((al) this).field_h.g(true);
                        var5 = hn.c(false);
                        if ((var4 ^ -1) > -1891) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (var4 <= -3 + var5) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = oi.a(new String[2], re.field_p, 2);
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        if (!th.a((byte) -41, var4, var2_int, var3)) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (param0 < -86) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_g = null;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return gf.field_C;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, int param1, float param2) {
        ne.field_g = param0;
        j.field_i = param2;
        if (param1 != 13) {
            al.g(-11);
        }
    }

    public final void a(wa param0, int param1) {
        ((al) this).b(false);
        if (param1 != 13) {
            ((al) this).field_h = null;
        }
    }

    public al() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new oi[12];
        field_i = "Private";
        field_g = "Open in popup window";
    }
}
