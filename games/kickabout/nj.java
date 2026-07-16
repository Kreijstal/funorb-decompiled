/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static String field_c;
    static String field_b;
    static hd field_d;
    static String field_a;

    final static void a(boolean param0, int param1) {
        if (param1 >= -126) {
          L0: {
            if (k.field_m != null) {
              k.field_m.a(73, param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (k.field_m != null) {
              k.field_m.a(73, param0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
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
            var7 = Kickabout.field_G;
            try {
              L0: {
                var3 = (String) mm.a(param0 ^ 30858, "getcookies", param2);
                var4 = wr.a(var3, param0 ^ 2, ';');
                var5 = param0;
                L1: while (true) {
                  if (var4.length <= var5) {
                    break L0;
                  } else {
                    L2: {
                      var6 = var4[var5].indexOf('=');
                      if (-1 < (var6 ^ -1)) {
                        break L2;
                      } else {
                        if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                          break L2;
                        } else {
                          stackOut_5_0 = var4[var5].substring(var6 - -1).trim();
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

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (!(jh.field_Kb <= var1)) {
            in.field_b = in.field_b + (-var1 + jh.field_Kb);
        }
        int var3 = -67 / ((param0 - -10) / 32);
        jh.field_Kb = var1;
        return var1 - -in.field_b;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -50) {
            return;
        }
        field_a = null;
        field_b = null;
        field_d = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 == 29079) {
          if (param2 + (param1 + param0) > on.field_f) {
            if ((-param2 + param0 ^ -1) <= -1) {
              return param0 - param2;
            } else {
              return on.field_f + -param2;
            }
          } else {
            return param1 + param0;
          }
        } else {
          field_b = null;
          if (param2 + (param1 + param0) > on.field_f) {
            if ((-param2 + param0 ^ -1) <= -1) {
              return param0 - param2;
            } else {
              return on.field_f + -param2;
            }
          } else {
            return param1 + param0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Resign";
        field_c = "Offer rematch";
        field_a = "Auto-respond to <%0>";
    }
}
