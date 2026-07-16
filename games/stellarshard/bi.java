/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bi extends ah {
    static int field_r;
    static int[][] field_s;
    static String field_t;
    static nf field_u;

    public static void e(int param0) {
        field_s = null;
        if (param0 != 0) {
            return;
        }
        field_u = null;
        field_t = null;
    }

    bi() {
    }

    final static String a(java.applet.Applet param0, String param1, int param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            var7 = stellarshard.field_B;
            try {
              L0: {
                L1: {
                  if (param2 == 61) {
                    break L1;
                  } else {
                    field_t = null;
                    break L1;
                  }
                }
                var3 = (String) sh.a("getcookies", param0, (byte) 78);
                var4 = qj.a(';', var3, param2 ^ 10258);
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4.length) {
                    break L0;
                  } else {
                    L3: {
                      var6 = var4[var5].indexOf('=');
                      if (0 > var6) {
                        break L3;
                      } else {
                        if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                          stackOut_8_0 = var4[var5].substring(1 + var6).trim();
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3_ref = decompiledCaughtException;
                break L4;
              }
            }
            return null;
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
        field_t = "Type your password again to make sure it's correct";
    }
}
