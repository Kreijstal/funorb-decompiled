/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static int field_b;
    static int field_a;
    static byte[][] field_c;

    final static String a(byte param0) {
        if (param0 != -12) {
            return null;
        }
        return gk.field_F;
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
            int var9 = 0;
            String var10 = null;
            String stackIn_6_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_5_0 = null;
            var9 = ZombieDawn.field_J;
            try {
              L0: {
                var10 = param0.getParameter("cookieprefix");
                var3 = var10 + "settings";
                var4 = (String) qe.a(param0, "getcookies", -102);
                var5 = de.a(';', var4, -125);
                var6 = 30 / ((param1 - -23) / 59);
                var7 = 0;
                L1: while (true) {
                  if (var5.length <= var7) {
                    break L0;
                  } else {
                    L2: {
                      var8 = var5[var7].indexOf('=');
                      if (0 > var8) {
                        break L2;
                      } else {
                        if (!var5[var7].substring(0, var8).trim().equals((Object) (Object) var3)) {
                          break L2;
                        } else {
                          stackOut_5_0 = var5[var7].substring(var8 - -1).trim();
                          stackIn_6_0 = stackOut_5_0;
                          return stackIn_6_0;
                        }
                      }
                    }
                    var7++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = decompiledCaughtException;
                break L3;
              }
            }
            if (nj.field_X != null) {
              return nj.field_X;
            } else {
              return param0.getParameter("settings");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -1) {
            field_b = -98;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[1000][];
    }
}
