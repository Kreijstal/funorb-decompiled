/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends wl {
    int field_v;
    static String field_r;
    byte[] field_s;
    static byte[] field_u;
    sp field_t;

    final byte[] e(int param0) {
        int var2 = 70 / ((55 - param0) / 55);
        if (((mf) this).field_n) {
            throw new RuntimeException();
        }
        return ((mf) this).field_s;
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
            String stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            var8 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: {
                  var9 = param0.getParameter("cookieprefix");
                  var3 = var9 + "settings";
                  var4 = (String) hi.a(param0, "getcookies", -126);
                  var5 = ik.a(var4, (byte) -76, ';');
                  if (param1 == -28697) {
                    break L1;
                  } else {
                    mf.f(82);
                    break L1;
                  }
                }
                var6 = 0;
                L2: while (true) {
                  if (var5.length <= var6) {
                    break L0;
                  } else {
                    L3: {
                      var7 = var5[var6].indexOf('=');
                      if (var7 < 0) {
                        break L3;
                      } else {
                        if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                          stackOut_8_0 = var5[var6].substring(var7 - -1).trim();
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
            if (to.field_f != null) {
              return to.field_f;
            } else {
              return param0.getParameter("settings");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int b(byte param0) {
        if (param0 < 18) {
            mf.f(-91);
            if (!(!((mf) this).field_n)) {
                return 0;
            }
            return 100;
        }
        if (!(!((mf) this).field_n)) {
            return 0;
        }
        return 100;
    }

    public static void f(int param0) {
        field_u = null;
        if (param0 <= 19) {
            return;
        }
        field_r = null;
    }

    mf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new byte[520];
        field_r = " (new)";
    }
}
