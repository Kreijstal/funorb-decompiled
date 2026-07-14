/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gb {
    static String field_e;
    static String field_b;
    static ii[] field_a;
    static String field_c;
    static String field_d;

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            mg.field_e = param2;
            try {
                var3 = param0.getParameter("cookieprefix");
                var4 = param0.getParameter("cookiehost");
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (!(param2.length() != 0)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                int var6 = 110 % ((param1 - -58) / 60);
                kj.a(-108, "document.cookie=\"" + var5 + "\"", param0);
            } catch (Throwable throwable) {
            }
            ok.a(9507, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var5 = Transmogrify.field_A ? 1 : 0;
        int var2 = param1.length();
        int var3 = 0;
        int var4 = 0;
        if (param0 != -14741) {
            Object var6 = null;
            gb.a(-113, 32, (String) null);
        }
        while (var2 > var4) {
            var3 = de.a(33, param1.charAt(var4)) + (-var3 + (var3 << 90255621));
            var4++;
        }
        return var3;
    }

    final static nb[] a(fe param0, byte param1) {
        int var5 = 0;
        nb var6 = null;
        int var7 = Transmogrify.field_A ? 1 : 0;
        if (!param0.b(5)) {
            return new nb[]{};
        }
        ib var9 = param0.a(-1);
        while (var9.field_c == 0) {
            pg.a(10L, -126);
        }
        if (!(var9.field_c != 2)) {
            return new nb[]{};
        }
        int[] var13 = (int[]) var9.field_g;
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var3 = var10;
        nb[] var4 = new nb[var13.length >> -312875230];
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = new nb();
            var4[var5] = var6;
            var6.field_a = var3[var5 << -1512085278];
            var6.field_d = var3[(var5 << -1945014270) + 1];
            var6.field_b = var3[(var5 << -338265438) - -2];
            var6.field_e = var3[3 + (var5 << 1709461314)];
        }
        if (param1 > -30) {
            Object var8 = null;
            gb.a(-23, -90, (String) null);
        }
        return var4;
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -2) {
            field_b = null;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, String param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          wl.field_I = false;
          aa.field_g = false;
          var3 = -66 % ((-23 - param1) / 41);
          if (null == wg.field_d) {
            break L0;
          } else {
            if (!wg.field_d.field_A) {
              break L0;
            } else {
              L1: {
                var4 = 1;
                if (-9 != (param0 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    param0 = 2;
                    if (lb.field_d) {
                      param2 = ih.field_a;
                      break L2;
                    } else {
                      param2 = wj.field_k;
                      break L2;
                    }
                  }
                  ok.field_a.a(ob.field_F, 30);
                  break L1;
                }
              }
              L3: {
                if (10 != param0) {
                  break L3;
                } else {
                  var4 = 0;
                  bj.d(-2147483648);
                  break L3;
                }
              }
              if (var4 == 0) {
                if (param0 == -257) {
                  break L0;
                } else {
                  if (-11 == param0) {
                    break L0;
                  } else {
                    if (lb.field_d) {
                      break L0;
                    } else {
                      ok.field_a.l(-31891);
                      break L0;
                    }
                  }
                }
              } else {
                if (param0 == -257) {
                  break L0;
                } else {
                  if (-11 == param0) {
                    break L0;
                  } else {
                    if (lb.field_d) {
                      break L0;
                    } else {
                      ok.field_a.l(-31891);
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        if (param0 != 81) {
            Object var2 = null;
            gb.a(92, 22, (String) null);
        }
        ba.a(param0 ^ 60, 17);
    }

    final static void a(oa param0, boolean param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Transmogrify.field_A ? 1 : 0;
                        if (param1) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        var6 = new byte[24];
                        var2 = var6;
                        if (ah.field_b == null) {
                            statePc = 14;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            ah.field_b.a(0L, (byte) -128);
                            ah.field_b.a(var6, 16711708);
                            var3_int = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (-1 != (var6[var3_int] ^ -1)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_int++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (24 <= var3_int) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            param0.a((byte) -89, var2, 24, 0);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (-25 >= (var4 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 14: {
                        param0.a((byte) -89, var2, 24, 0);
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Type your password again to make sure it's correct";
        field_e = "That name is not available";
        field_d = "This password contains your email address, and would be easy to guess";
        field_c = "Logging in...";
    }
}
