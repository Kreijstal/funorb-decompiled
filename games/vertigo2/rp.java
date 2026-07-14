/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp implements ef {
    private er[] field_h;
    private fc field_g;
    static ve field_f;
    static String field_b;
    static int field_a;
    static String[] field_e;
    static lg field_c;
    static String field_d;

    public final boolean c(int param0, int param1) {
        if (param0 != 1) {
            Object var4 = null;
            rp.a((java.applet.Applet) null, -50, (String) null);
            return false;
        }
        return false;
    }

    public final int a(int param0, int param1) {
        if (param1 != 65535) {
            return 3;
        }
        return 16711680;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            sm.field_Ib = param2;
            if (param1 != -2112) {
                return;
            }
            try {
                var3 = param0.getParameter("cookieprefix");
                var4 = param0.getParameter("cookiehost");
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (!(param2.length() != 0)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                je.a(param0, "document.cookie=\"" + var5 + "\"", (byte) 124);
            } catch (Throwable throwable) {
            }
            op.a(0, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int[] a(float param0, int param1, int param2) {
        if (param2 != 233) {
            rp.a(1);
            return ((rp) this).field_h[param1].field_F;
        }
        return ((rp) this).field_h[param1].field_F;
    }

    public final boolean d(int param0, int param1) {
        if (param0 > -114) {
            field_a = -11;
            return true;
        }
        return true;
    }

    rp(boolean param0, er[] param1) {
        int[] var5 = new int[6];
        int[] var3 = var5;
        ((rp) this).field_h = dk.a(var5, true, param1);
        ef var4 = oo.field_o;
        oo.a((ef) this);
        ((rp) this).field_g = (fc) (Object) th.a(param0, var5, -27911);
        oo.a(var4);
    }

    final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ef var6 = null;
        Throwable var7 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = param0[0];
                    var4 = param0[1];
                    param0[0] = 0;
                    if (param1 == 28580) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((rp) this).field_g = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    param0[1] = 0;
                    var5 = param0[2];
                    param0[2] = 0;
                    var6 = oo.field_o;
                    oo.a((ef) this);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        ((rp) this).field_g.a(param0, mb.field_w);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    oo.a(var6);
                    param0[0] = var3;
                    param0[1] = var4;
                    param0[2] = var5;
                    statePc = 7;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = caughtException;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    oo.a(var6);
                    param0[0] = var3;
                    param0[1] = var4;
                    param0[2] = var5;
                    throw (RuntimeException) (Object) var7;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_b = null;
        field_e = null;
        if (param0 >= -77) {
          var2 = null;
          rp.a((java.applet.Applet) null, -108, (String) null);
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    public final int b(int param0, int param1) {
        if (param0 != 212) {
            rp.a(92);
            return 0;
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ve(14, 0, 4, 1);
        field_d = "Blue won!";
        field_b = "<%0> is not a member, and cannot play with the current options.";
    }
}
