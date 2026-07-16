/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static double field_b;
    static ql field_d;
    static String field_e;
    static String field_c;
    static ji field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 >= -95) {
            field_d = null;
        }
        field_e = null;
        field_a = null;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            var8 = wizardrun.field_H;
            try {
              L0: {
                L1: {
                  if (param1 == 102) {
                    break L1;
                  } else {
                    fb.a(78);
                    break L1;
                  }
                }
                var9 = param0.getParameter("cookieprefix");
                var3 = var9 + "settings";
                var4 = (String) cl.a(param0, -3264, "getcookies");
                var5 = tj.a(var4, -22710, ';');
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var5.length) {
                    break L0;
                  } else {
                    L3: {
                      var7 = var5[var6].indexOf('=');
                      if (0 > var7) {
                        break L3;
                      } else {
                        if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                          stackOut_8_0 = var5[var6].substring(1 + var7).trim();
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var2 = decompiledCaughtException;
                break L4;
              }
            }
            if (pa.field_f != null) {
              return pa.field_f;
            } else {
              return param0.getParameter("settings");
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
        field_b = Math.atan2(1.0, 0.0);
        field_c = "Your email address is used to identify this account";
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
