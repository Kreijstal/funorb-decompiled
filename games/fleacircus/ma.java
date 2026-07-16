/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static String field_a;

    public static void a(byte param0) {
        if (param0 >= -36) {
        }
        field_a = null;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_8_0 = 0;
            int stackIn_16_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_14_0 = 0;
            var7 = fleas.field_A ? 1 : 0;
            if (!qj.field_G) {
              try {
                L0: {
                  var2 = "tuhstatbut";
                  var3 = (String) eb.a("getcookies", param1, -250);
                  var4 = m.a(';', 119, var3);
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      var5 = 127 / ((-23 - param0) / 36);
                      break L0;
                    } else {
                      L2: {
                        var6 = var4[var5].indexOf('=');
                        if (-1 < (var6 ^ -1)) {
                          break L2;
                        } else {
                          if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                            stackOut_7_0 = 1;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0 != 0;
                          } else {
                            break L2;
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
                  var2_ref = decompiledCaughtException;
                  break L3;
                }
              }
              L4: {
                if (null == param1.getParameter("tuhstatbut")) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              return stackIn_16_0 != 0;
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static double a(double param0, int param1) {
        if (param1 <= 54) {
        }
        return tg.field_b[65535 & (int)(param0 * 32768.0 / 3.141592653589793)];
    }

    static {
    }
}
