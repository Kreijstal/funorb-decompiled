/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ah {
    abstract void a(byte param0, byte[] param1);

    final static String a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_7_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            var7 = Bounce.field_N;
            if (param0 == -3058) {
              try {
                L0: {
                  var3 = (String) ac.a(param1, "getcookies", -31185);
                  var4 = di.a(-122, ';', var3);
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      break L0;
                    } else {
                      L2: {
                        var6 = var4[var5].indexOf('=');
                        if (-1 < (var6 ^ -1)) {
                          break L2;
                        } else {
                          if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param2)) {
                            break L2;
                          } else {
                            stackOut_6_0 = var4[var5].substring(1 + var6).trim();
                            stackIn_7_0 = stackOut_6_0;
                            return stackIn_7_0;
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
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract byte[] a(int param0);

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        param1 = il.a(param1, '_', -122, "");
        if (param2 == 8) {
          var3 = bc.a(param1, param2 + -111);
          if (param0.indexOf(param1) == -1) {
            if ((param0.indexOf(var3) ^ -1) != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    static {
    }
}
