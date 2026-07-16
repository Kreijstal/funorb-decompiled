/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static ea[] field_b;
    static boolean field_f;
    static String field_e;
    static String field_c;
    static String field_d;
    static int field_a;

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            L0: {
              var7 = MinerDisturbance.field_ab;
              if (param0 == 27) {
                break L0;
              } else {
                var8 = null;
                boolean discarded$2 = rd.a((byte) -104, (java.applet.Applet) null);
                break L0;
              }
            }
            if (!nn.field_q) {
              try {
                L1: {
                  var2 = "tuhstatbut";
                  var3 = (String) lk.a((byte) 18, "getcookies", param1);
                  var4 = h.a(';', true, var3);
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      break L1;
                    } else {
                      L3: {
                        var6 = var4[var5].indexOf('=');
                        if (var6 < 0) {
                          break L3;
                        } else {
                          if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0 != 0;
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
                  var2_ref = decompiledCaughtException;
                  break L4;
                }
              }
              L5: {
                if (param1.getParameter("tuhstatbut") == null) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L5;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L5;
                }
              }
              return stackIn_17_0 != 0;
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        field_c = null;
        int var1 = -52 / ((param0 - -31) / 32);
    }

    final static vm a(String param0, int param1, bj param2, bj param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param3.a(-89, param0);
        var6 = param3.a(param4, var5, -80);
        if (param1 >= -64) {
          rd.a((byte) -105);
          return dl.a(param2, var6, var5, (byte) 122, param3);
        } else {
          return dl.a(param2, var6, var5, (byte) 122, param3);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This game has been updated! Please reload this page.";
        field_d = "A Maritime Meal";
        field_c = "Names should contain a maximum of 12 characters";
        field_a = -1;
    }
}
