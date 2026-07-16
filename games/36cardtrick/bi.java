/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static boolean field_c;
    static le field_b;
    static int field_a;
    static int field_d;

    final static String a(byte param0, java.applet.Applet param1) {
        try {
            Throwable var2_ref_Throwable = null;
            int var2 = 0;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_7_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            var8 = Main.field_T;
            try {
              L0: {
                var9 = param1.getParameter("cookieprefix");
                var3 = var9 + "settings";
                var4 = (String) vh.a("getcookies", -12151, param1);
                var5 = rh.a(';', var4, -100);
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var5.length) {
                    break L0;
                  } else {
                    L2: {
                      var7 = var5[var6].indexOf('=');
                      if (-1 < (var7 ^ -1)) {
                        break L2;
                      } else {
                        if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                          stackOut_6_0 = var5[var6].substring(var7 - -1).trim();
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref_Throwable = decompiledCaughtException;
                break L3;
              }
            }
            var2 = 30 % ((36 - param0) / 48);
            if (null == ni.field_a) {
              return param1.getParameter("settings");
            } else {
              return ni.field_a;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        if (param1 < 16) {
            field_a = 92;
        }
        return nc.a(false, param0, (byte) 112);
    }

    public static void a(int param0) {
        if (param0 < 94) {
            field_d = -78;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 200;
    }
}
