/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 != 61) {
            return;
        }
        field_a = null;
    }

    final static boolean a(be param0, int param1) {
        int var2 = param0.h(16383);
        int var3 = param1 != (var2 ^ -1) ? 0 : 1;
        return var3 != 0;
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_6_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_5_0 = null;
            var8 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                var9 = param0.getParameter("cookieprefix");
                var3 = var9 + "settings";
                var4 = (String) sj.a((byte) -77, "getcookies", param0);
                var5 = te.a(var4, ';', (byte) -64);
                var6 = 0;
                L1: while (true) {
                  if (var5.length <= var6) {
                    break L0;
                  } else {
                    L2: {
                      var7 = var5[var6].indexOf('=');
                      if (0 > var7) {
                        break L2;
                      } else {
                        if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                          break L2;
                        } else {
                          stackOut_5_0 = var5[var6].substring(var7 + 1).trim();
                          stackIn_6_0 = stackOut_5_0;
                          return stackIn_6_0;
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
                var2 = decompiledCaughtException;
                break L3;
              }
            }
            if (param1 == -22004) {
              if (of.field_g != null) {
                return of.field_g;
              } else {
                return param0.getParameter("settings");
              }
            } else {
              return null;
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
        field_a = new int[8192];
    }
}
