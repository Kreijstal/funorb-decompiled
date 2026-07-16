/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends hg {
    int[] field_h;
    boolean field_g;
    static String field_i;
    int field_j;

    final static String a(byte param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_6_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_5_0 = null;
            var7 = EscapeVector.field_A;
            try {
              L0: {
                var3 = (String) sd.a(param2, "getcookies", -29155);
                var4 = bb.a(-128, var3, ';');
                var5 = 0;
                L1: while (true) {
                  if (var4.length <= var5) {
                    if (param0 > 78) {
                      break L0;
                    } else {
                      field_i = null;
                      return null;
                    }
                  } else {
                    L2: {
                      var6 = var4[var5].indexOf('=');
                      if (var6 < 0) {
                        break L2;
                      } else {
                        if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                          break L2;
                        } else {
                          stackOut_5_0 = var4[var5].substring(1 + var6).trim();
                          stackIn_6_0 = stackOut_5_0;
                          return stackIn_6_0;
                        }
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var3_ref = decompiledCaughtException;
                break L3;
              }
            }
            return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param0 <= -5) {
          var3 = param2 / param1;
          if (param2 % param1 != 0) {
            var3++;
            return var3;
          } else {
            return var3;
          }
        } else {
          return -127;
        }
    }

    final static void a(byte param0, String param1, int param2, int param3) {
        fh.field_g.b(param1, param2 + -1, -1 + param3, 0, -1, 64);
        if (param0 < 19) {
          field_i = null;
          fh.field_g.b(param1, 1 + param2, -1 + param3, 0, -1, 64);
          fh.field_g.b(param1, param2 - 1, 1 + param3, 0, -1, 64);
          fh.field_g.b(param1, 1 + param2, 1 + param3, 0, -1, 64);
          fh.field_g.c(param1, param2, param3, 16777215, -1);
          return;
        } else {
          fh.field_g.b(param1, 1 + param2, -1 + param3, 0, -1, 64);
          fh.field_g.b(param1, param2 - 1, 1 + param3, 0, -1, 64);
          fh.field_g.b(param1, 1 + param2, 1 + param3, 0, -1, 64);
          fh.field_g.c(param1, param2, param3, 16777215, -1);
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 64) {
          field_i = null;
          return param3 * (-param2 + param0) / param1 + param2;
        } else {
          return param3 * (-param2 + param0) / param1 + param2;
        }
    }

    dc() {
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
            dc.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "RIGHT ARROW";
    }
}
