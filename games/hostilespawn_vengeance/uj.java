/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends am {
    static fd field_k;
    boolean field_j;
    static int field_l;
    static oc field_p;
    static ug field_m;
    static String field_i;
    static bd field_r;
    static int field_n;
    static String field_q;
    static vl field_o;
    static String field_h;

    public static void c(int param0) {
        field_i = null;
        field_r = null;
        field_k = null;
        field_m = null;
        field_o = null;
        field_h = null;
        field_q = null;
        if (param0 != 1) {
          field_k = null;
          field_p = null;
          return;
        } else {
          field_p = null;
          return;
        }
    }

    final static void d(int param0) {
        int var1 = 31 % ((param0 - 46) / 46);
        bf.field_d = null;
        sf.field_X = null;
        hd.field_r = null;
        ja.field_e = null;
        nh.field_O = null;
        th.field_Jb = null;
    }

    uj() {
    }

    final static int e(int param0) {
        if (param0 != 1) {
            field_m = null;
            return tm.field_v;
        }
        return tm.field_v;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            Exception exception = null;
            java.net.URL var2 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                            param0.getAppletContext().showDocument(nj.a(param0, true, var2), "_top");
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        exception = (Exception) (Object) caughtException;
                        exception.printStackTrace();
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param1 != 41) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        uj.c(-75);
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

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        if (param1 != 18719) {
          L0: {
            uj.c(33);
            var2 = pm.a(l.a(param0, (byte) 114), (byte) 100);
            if (var2 != null) {
              break L0;
            } else {
              var2 = "";
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = pm.a(l.a(param0, (byte) 114), (byte) 100);
            if (var2 != null) {
              break L1;
            } else {
              var2 = "";
              break L1;
            }
          }
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 1;
        field_i = "This password contains repeated characters, and would be easy to guess";
        field_q = "<col=ffffff>Auto<nbsp>gun</col><br>The marine's standard issue auto gun has a long range and efficient ammo use.";
        field_h = "Connection lost - attempting to reconnect";
    }
}
