/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static String field_b;
    static int field_a;
    static int field_c;

    public static void a(int param0) {
        if (param0 != 0) {
            dd.a(-99);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4, int param5, int param6, int param7, int param8, boolean param9, int param10, boolean param11) {
        int var12 = -16 % ((param1 - -80) / 43);
        bj.a(16777215, param4, param2, param0, param5, 16777215, param10, param9, param8, param7, param6, -869, param3, param11);
    }

    final static void b(int param0) {
        s.field_f = false;
        if (param0 > -10) {
          field_c = 70;
          qa.field_v = false;
          t.a(-1, 0);
          pi.field_a = fk.field_Q;
          ma.field_d = fk.field_Q;
          return;
        } else {
          qa.field_v = false;
          t.a(-1, 0);
          pi.field_a = fk.field_Q;
          ma.field_d = fk.field_Q;
          return;
        }
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
            String stackIn_6_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_5_0 = null;
            var8 = TetraLink.field_J;
            try {
              L0: {
                var9 = param0.getParameter("cookieprefix");
                var3 = var9 + "settings";
                var4 = (String) ii.a((byte) 90, "getcookies", param0);
                var5 = hi.a(var4, ';', 783);
                var6 = 0;
                L1: while (true) {
                  if (var5.length <= var6) {
                    var6 = 92 / ((-37 - param1) / 32);
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
                          stackOut_5_0 = var5[var6].substring(1 + var7).trim();
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
            if (null != bm.field_s) {
              return bm.field_s;
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
        field_b = "Public chat is unavailable while setting up a rated game.";
    }
}
